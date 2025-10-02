package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class ActivitySearchSngBindingImpl extends ActivitySearchSngBinding {
    public static final SparseIntArray H;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.layout_toolbar, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.back_button, 3);
        sparseIntArray.put(R.id.toolbarTitle, 4);
        sparseIntArray.put(R.id.search_bar, 5);
        sparseIntArray.put(R.id.searchResultRecyclerView, 6);
        sparseIntArray.put(R.id.empty_icon, 7);
        sparseIntArray.put(R.id.resultsMsg, 8);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        if (273 != i) {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
