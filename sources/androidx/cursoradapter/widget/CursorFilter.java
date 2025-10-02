package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes2.dex */
class CursorFilter extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public CursorAdapter f2542a;

    public interface CursorFilterClient {
        void a(Cursor cursor);

        Cursor c(CharSequence charSequence);

        String convertToString(Cursor cursor);
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.f2542a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorC = this.f2542a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorC != null) {
            filterResults.count = cursorC.getCount();
            filterResults.values = cursorC;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        CursorAdapter cursorAdapter = this.f2542a;
        Cursor cursor = cursorAdapter.f;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        cursorAdapter.a((Cursor) obj);
    }
}
