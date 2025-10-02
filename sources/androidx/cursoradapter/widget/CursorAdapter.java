package androidx.cursoradapter.widget;

import YU.a;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.cursoradapter.widget.CursorFilter;

/* loaded from: classes2.dex */
public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilter.CursorFilterClient {
    public boolean d;
    public boolean e;
    public Cursor f;
    public Context g;
    public int h;
    public ChangeObserver i;
    public DataSetObserver j;
    public CursorFilter k;

    public class ChangeObserver extends ContentObserver {
        public ChangeObserver() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            Cursor cursor;
            CursorAdapter cursorAdapter = CursorAdapter.this;
            if (!cursorAdapter.e || (cursor = cursorAdapter.f) == null || cursor.isClosed()) {
                return;
            }
            cursorAdapter.d = cursorAdapter.f.requery();
        }
    }

    public class MyDataSetObserver extends DataSetObserver {
        public MyDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            CursorAdapter cursorAdapter = CursorAdapter.this;
            cursorAdapter.d = true;
            cursorAdapter.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            CursorAdapter cursorAdapter = CursorAdapter.this;
            cursorAdapter.d = false;
            cursorAdapter.notifyDataSetInvalidated();
        }
    }

    public void a(Cursor cursor) {
        Cursor cursorH = h(cursor);
        if (cursorH != null) {
            cursorH.close();
        }
    }

    public Cursor c(CharSequence charSequence) {
        return this.f;
    }

    public String convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public abstract void d(View view, Cursor cursor);

    public final void e(Context context, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.e = true;
        } else {
            this.e = false;
        }
        this.f = null;
        this.d = false;
        this.g = context;
        this.h = -1;
        if ((i & 2) == 2) {
            this.i = new ChangeObserver();
            this.j = new MyDataSetObserver();
        } else {
            this.i = null;
            this.j = null;
        }
    }

    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return g(context, cursor, viewGroup);
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.d || (cursor = this.f) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.d) {
            return null;
        }
        this.f.moveToPosition(i);
        if (view == null) {
            view = f(this.g, this.f, viewGroup);
        }
        d(view, this.f);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.k == null) {
            CursorFilter cursorFilter = new CursorFilter();
            cursorFilter.f2542a = this;
            this.k = cursorFilter;
        }
        return this.k;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.d || (cursor = this.f) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.d && (cursor = this.f) != null && cursor.moveToPosition(i)) {
            return this.f.getLong(this.h);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.d) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f.moveToPosition(i)) {
            throw new IllegalStateException(a.d(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = g(this.g, this.f, viewGroup);
        }
        d(view, this.f);
        return view;
    }

    public Cursor h(Cursor cursor) {
        Cursor cursor2 = this.f;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            ChangeObserver changeObserver = this.i;
            if (changeObserver != null) {
                cursor2.unregisterContentObserver(changeObserver);
            }
            DataSetObserver dataSetObserver = this.j;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f = cursor;
        if (cursor == null) {
            this.h = -1;
            this.d = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        ChangeObserver changeObserver2 = this.i;
        if (changeObserver2 != null) {
            cursor.registerContentObserver(changeObserver2);
        }
        DataSetObserver dataSetObserver2 = this.j;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.h = cursor.getColumnIndexOrThrow("_id");
        this.d = true;
        notifyDataSetChanged();
        return cursor2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
