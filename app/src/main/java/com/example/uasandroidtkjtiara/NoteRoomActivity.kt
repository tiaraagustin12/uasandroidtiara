package com.example.uasandroidtkjtiara

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uasandroidtkjtiara.db.NoteRoomDatabase
import com.example.uasandroidtkjtiara.model.Note
import com.example.uasandroidtkjtiara.databinding.ActivityNoteRoomBinding

class NoteRoomActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNoteRoomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNoteRoomBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val isDataInserted = sharedPreferences.getBoolean("isDataInserted", false)

        if (!isDataInserted) {

            addDummyData()
            sharedPreferences.edit().putBoolean("isDataInserted", true).apply()
        }

        getNotesDate()

        binding.floatingAdd.setOnClickListener {
            startActivity(Intent(this, EditActivity::class.java))
        }
    }

    private fun addDummyData() {
        val database = NoteRoomDatabase.getDatabase(application)
        val dao = database.getNoteDao()

        val dummyDataList = listOf(
            Note(
                title = "2169700005",
                body = "Tiara Agustin",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "11",
                hargasks = "15000"
            )
        )

        for (dummyNote in dummyDataList) {
            dao.insert(dummyNote)
        }
    }


    private fun getNotesDate() {
        val database = NoteRoomDatabase.getDatabase(application)
        val dao = database.getNoteDao()
        val listItems = arrayListOf<Note>()
        listItems.addAll(dao.getAll())
        setupRecyclerView(listItems)
    }

    private fun setupRecyclerView(listItems: ArrayList<Note>) {
        binding.recycleViewMain.apply {
            adapter = NoteAdapter(listItems, object : NoteAdapter.NoteListener {
                override fun OnItemClicked(note: Note) {
                    val intent = Intent(this@NoteRoomActivity, EditActivity::class.java)
                    intent.putExtra(EditActivity().EDIT_NOTE_EXTRA, note)
                    startActivity(intent)
                }
            })

            layoutManager = LinearLayoutManager(this@NoteRoomActivity)
        }
    }

    override fun onResume() {
        super.onResume()
        getNotesDate()
    }
}