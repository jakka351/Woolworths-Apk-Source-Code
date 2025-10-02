package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class ActivityScannerBindingImpl extends ActivityScannerBinding {
    public static final SparseIntArray J;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.barCodeViewFinderOuter, 1);
        sparseIntArray.put(R.id.layout_bottom, 2);
        sparseIntArray.put(R.id.manualEntry, 3);
        sparseIntArray.put(R.id.scanClose, 4);
        sparseIntArray.put(R.id.btnViewCart, 5);
        sparseIntArray.put(R.id.layout_toolbar, 6);
        sparseIntArray.put(R.id.toolbar, 7);
        sparseIntArray.put(R.id.toolbarTitle, 8);
        sparseIntArray.put(R.id.weightedItemsList, 9);
        sparseIntArray.put(R.id.scannerActiveView, 10);
        sparseIntArray.put(R.id.scannerInstructions, 11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
