package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public abstract class ResourceCursorAdapter extends CursorAdapter {
    public int l;
    public int m;
    public LayoutInflater n;

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.n.inflate(this.m, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.n.inflate(this.l, viewGroup, false);
    }
}
