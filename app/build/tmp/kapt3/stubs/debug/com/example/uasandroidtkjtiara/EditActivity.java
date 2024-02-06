package com.example.uasandroidtkjtiara;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/uasandroidtkjtiara/EditActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "EDIT_NOTE_EXTRA", "", "getEDIT_NOTE_EXTRA", "()Ljava/lang/String;", "binding", "Lcom/example/uasandroidtkjtiara/databinding/ActivityEditBinding;", "dao", "Lcom/example/uasandroidtkjtiara/db/NoteDao;", "database", "Lcom/example/uasandroidtkjtiara/db/NoteRoomDatabase;", "isUpdate", "", "note", "Lcom/example/uasandroidtkjtiara/model/Note;", "deleteNote", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveNote", "app_debug"})
@kotlin.Suppress(names = {"DEPRECATION"})
public final class EditActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String EDIT_NOTE_EXTRA = "edit_note_extra";
    private com.example.uasandroidtkjtiara.model.Note note;
    private boolean isUpdate = false;
    private com.example.uasandroidtkjtiara.db.NoteRoomDatabase database;
    private com.example.uasandroidtkjtiara.db.NoteDao dao;
    private com.example.uasandroidtkjtiara.databinding.ActivityEditBinding binding;
    
    public EditActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEDIT_NOTE_EXTRA() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void saveNote(com.example.uasandroidtkjtiara.model.Note note) {
    }
    
    private final void deleteNote(com.example.uasandroidtkjtiara.model.Note note) {
    }
}