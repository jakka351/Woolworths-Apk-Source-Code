package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class ContentWeightedArticleSelectionBindingImpl extends ContentWeightedArticleSelectionBinding {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.selectItemLabel, 1);
        sparseIntArray.put(R.id.itemsToBeWeightedListView, 2);
        sparseIntArray.put(R.id.emptyView, 3);
        sparseIntArray.put(R.id.empty_icon, 4);
        sparseIntArray.put(R.id.cartEmptyMsg, 5);
        sparseIntArray.put(R.id.cartEmptyInstruction, 6);
        sparseIntArray.put(R.id.btnScanItem, 7);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.D = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
