package com.example.uasandroidtkjtiara.db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/uasandroidtkjtiara/db/NoteDao;", "", "delete", "", "note", "Lcom/example/uasandroidtkjtiara/model/Note;", "getAll", "", "getById", "id", "", "insert", "update", "app_debug"})
@androidx.room.Dao
public abstract interface NoteDao {
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.example.uasandroidtkjtiara.model.Note note);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.example.uasandroidtkjtiara.model.Note note);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.example.uasandroidtkjtiara.model.Note note);
    
    @androidx.room.Query(value = "SELECT * FROM notes")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.uasandroidtkjtiara.model.Note> getAll();
    
    @androidx.room.Query(value = "SELECT * FROM notes WHERE id = :id")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.uasandroidtkjtiara.model.Note> getById(int id);
}