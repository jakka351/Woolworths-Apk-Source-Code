package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.view.View;

/* loaded from: classes2.dex */
public class SimpleCursorAdapter extends ResourceCursorAdapter {

    public interface CursorToStringConverter {
    }

    public interface ViewBinder {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final String convertToString(Cursor cursor) {
        return cursor.getString(0);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final void d(View view, Cursor cursor) {
        throw null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final Cursor h(Cursor cursor) {
        if (cursor == null) {
            return super.h(cursor);
        }
        throw null;
    }
}
