package com.example.uasandroidtkjtiara.db;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.uasandroidtkjtiara.model.Note;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NoteDao_Impl implements NoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Note> __insertionAdapterOfNote;

  private final EntityDeletionOrUpdateAdapter<Note> __deletionAdapterOfNote;

  private final EntityDeletionOrUpdateAdapter<Note> __updateAdapterOfNote;

  public NoteDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNote = new EntityInsertionAdapter<Note>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `notes` (`id`,`title`,`body`,`nilai`,`keterangan`,`jumlahsks`,`hargasks`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Note entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        if (entity.getBody() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getBody());
        }
        if (entity.getNilai() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getNilai());
        }
        if (entity.getKeterangan() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getKeterangan());
        }
        if (entity.getJumlahsks() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getJumlahsks());
        }
        if (entity.getHargasks() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getHargasks());
        }
      }
    };
    this.__deletionAdapterOfNote = new EntityDeletionOrUpdateAdapter<Note>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `notes` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Note entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfNote = new EntityDeletionOrUpdateAdapter<Note>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `notes` SET `id` = ?,`title` = ?,`body` = ?,`nilai` = ?,`keterangan` = ?,`jumlahsks` = ?,`hargasks` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Note entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        if (entity.getBody() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getBody());
        }
        if (entity.getNilai() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getNilai());
        }
        if (entity.getKeterangan() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getKeterangan());
        }
        if (entity.getJumlahsks() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getJumlahsks());
        }
        if (entity.getHargasks() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getHargasks());
        }
        statement.bindLong(8, entity.getId());
      }
    };
  }

  @Override
  public void insert(final Note note) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNote.insert(note);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Note note) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfNote.handle(note);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Note note) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfNote.handle(note);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Note> getAll() {
    final String _sql = "SELECT * FROM notes";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
      final int _cursorIndexOfNilai = CursorUtil.getColumnIndexOrThrow(_cursor, "nilai");
      final int _cursorIndexOfKeterangan = CursorUtil.getColumnIndexOrThrow(_cursor, "keterangan");
      final int _cursorIndexOfJumlahsks = CursorUtil.getColumnIndexOrThrow(_cursor, "jumlahsks");
      final int _cursorIndexOfHargasks = CursorUtil.getColumnIndexOrThrow(_cursor, "hargasks");
      final List<Note> _result = new ArrayList<Note>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Note _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpBody;
        if (_cursor.isNull(_cursorIndexOfBody)) {
          _tmpBody = null;
        } else {
          _tmpBody = _cursor.getString(_cursorIndexOfBody);
        }
        final String _tmpNilai;
        if (_cursor.isNull(_cursorIndexOfNilai)) {
          _tmpNilai = null;
        } else {
          _tmpNilai = _cursor.getString(_cursorIndexOfNilai);
        }
        final String _tmpKeterangan;
        if (_cursor.isNull(_cursorIndexOfKeterangan)) {
          _tmpKeterangan = null;
        } else {
          _tmpKeterangan = _cursor.getString(_cursorIndexOfKeterangan);
        }
        final String _tmpJumlahsks;
        if (_cursor.isNull(_cursorIndexOfJumlahsks)) {
          _tmpJumlahsks = null;
        } else {
          _tmpJumlahsks = _cursor.getString(_cursorIndexOfJumlahsks);
        }
        final String _tmpHargasks;
        if (_cursor.isNull(_cursorIndexOfHargasks)) {
          _tmpHargasks = null;
        } else {
          _tmpHargasks = _cursor.getString(_cursorIndexOfHargasks);
        }
        _item = new Note(_tmpId,_tmpTitle,_tmpBody,_tmpNilai,_tmpKeterangan,_tmpJumlahsks,_tmpHargasks);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Note> getById(final int id) {
    final String _sql = "SELECT * FROM notes WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
      final int _cursorIndexOfNilai = CursorUtil.getColumnIndexOrThrow(_cursor, "nilai");
      final int _cursorIndexOfKeterangan = CursorUtil.getColumnIndexOrThrow(_cursor, "keterangan");
      final int _cursorIndexOfJumlahsks = CursorUtil.getColumnIndexOrThrow(_cursor, "jumlahsks");
      final int _cursorIndexOfHargasks = CursorUtil.getColumnIndexOrThrow(_cursor, "hargasks");
      final List<Note> _result = new ArrayList<Note>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Note _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpBody;
        if (_cursor.isNull(_cursorIndexOfBody)) {
          _tmpBody = null;
        } else {
          _tmpBody = _cursor.getString(_cursorIndexOfBody);
        }
        final String _tmpNilai;
        if (_cursor.isNull(_cursorIndexOfNilai)) {
          _tmpNilai = null;
        } else {
          _tmpNilai = _cursor.getString(_cursorIndexOfNilai);
        }
        final String _tmpKeterangan;
        if (_cursor.isNull(_cursorIndexOfKeterangan)) {
          _tmpKeterangan = null;
        } else {
          _tmpKeterangan = _cursor.getString(_cursorIndexOfKeterangan);
        }
        final String _tmpJumlahsks;
        if (_cursor.isNull(_cursorIndexOfJumlahsks)) {
          _tmpJumlahsks = null;
        } else {
          _tmpJumlahsks = _cursor.getString(_cursorIndexOfJumlahsks);
        }
        final String _tmpHargasks;
        if (_cursor.isNull(_cursorIndexOfHargasks)) {
          _tmpHargasks = null;
        } else {
          _tmpHargasks = _cursor.getString(_cursorIndexOfHargasks);
        }
        _item = new Note(_tmpId,_tmpTitle,_tmpBody,_tmpNilai,_tmpKeterangan,_tmpJumlahsks,_tmpHargasks);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
