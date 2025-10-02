package androidx.databinding.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.databinding.ObservableList;

@RestrictTo
/* loaded from: classes2.dex */
class ObservableListAdapter<T> extends BaseAdapter {

    /* renamed from: androidx.databinding.adapters.ObservableListAdapter$1, reason: invalid class name */
    class AnonymousClass1 extends ObservableList.OnListChangedCallback {
        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void a(ObservableList observableList) {
            throw null;
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void e(ObservableList observableList) {
            throw null;
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void f(ObservableList observableList) {
            throw null;
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void g(ObservableList observableList) {
            throw null;
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void h(ObservableList observableList) {
            throw null;
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = new TextView(null);
        }
        throw null;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        throw null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = new TextView(null);
        }
        throw null;
    }
}
