package com.example.uasandroidtkjtiara;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/uasandroidtkjtiara/NoteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/uasandroidtkjtiara/NoteAdapter$NoteViewHolder;", "listItems", "Ljava/util/ArrayList;", "Lcom/example/uasandroidtkjtiara/model/Note;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/example/uasandroidtkjtiara/NoteAdapter$NoteListener;", "(Ljava/util/ArrayList;Lcom/example/uasandroidtkjtiara/NoteAdapter$NoteListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NoteListener", "NoteViewHolder", "app_debug"})
public final class NoteAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.uasandroidtkjtiara.NoteAdapter.NoteViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.example.uasandroidtkjtiara.model.Note> listItems = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.uasandroidtkjtiara.NoteAdapter.NoteListener listener = null;
    
    public NoteAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.uasandroidtkjtiara.model.Note> listItems, @org.jetbrains.annotations.NotNull
    com.example.uasandroidtkjtiara.NoteAdapter.NoteListener listener) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.uasandroidtkjtiara.NoteAdapter.NoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.uasandroidtkjtiara.NoteAdapter.NoteViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/uasandroidtkjtiara/NoteAdapter$NoteListener;", "", "OnItemClicked", "", "note", "Lcom/example/uasandroidtkjtiara/model/Note;", "app_debug"})
    public static abstract interface NoteListener {
        
        public abstract void OnItemClicked(@org.jetbrains.annotations.NotNull
        com.example.uasandroidtkjtiara.model.Note note);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u000f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\"\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\"\u0010\u0015\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\"\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\"\u0010\u001b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/example/uasandroidtkjtiara/NoteAdapter$NoteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "textViewBody", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getTextViewBody", "()Landroid/widget/TextView;", "setTextViewBody", "(Landroid/widget/TextView;)V", "textViewHarga", "getTextViewHarga", "setTextViewHarga", "textViewJumlah", "getTextViewJumlah", "setTextViewJumlah", "textViewKeterangan", "getTextViewKeterangan", "setTextViewKeterangan", "textViewNilai", "getTextViewNilai", "setTextViewNilai", "textViewTitle", "getTextViewTitle", "setTextViewTitle", "textViewTotal", "getTextViewTotal", "setTextViewTotal", "app_debug"})
    public static final class NoteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView textViewTitle;
        private android.widget.TextView textViewBody;
        private android.widget.TextView textViewNilai;
        private android.widget.TextView textViewKeterangan;
        private android.widget.TextView textViewJumlah;
        private android.widget.TextView textViewHarga;
        private android.widget.TextView textViewTotal;
        
        public NoteViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final android.widget.TextView getTextViewTitle() {
            return null;
        }
        
        public final void setTextViewTitle(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getTextViewBody() {
            return null;
        }
        
        public final void setTextViewBody(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getTextViewNilai() {
            return null;
        }
        
        public final void setTextViewNilai(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getTextViewKeterangan() {
            return null;
        }
        
        public final void setTextViewKeterangan(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getTextViewJumlah() {
            return null;
        }
        
        public final void setTextViewJumlah(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getTextViewHarga() {
            return null;
        }
        
        public final void setTextViewHarga(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getTextViewTotal() {
            return null;
        }
        
        public final void setTextViewTotal(android.widget.TextView p0) {
        }
    }
}