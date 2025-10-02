package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class DialogScanResultViewBindingImpl extends DialogScanResultViewBinding {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.image_view, 1);
        sparseIntArray.put(R.id.tv_title, 2);
        sparseIntArray.put(R.id.tv_desc, 3);
        sparseIntArray.put(R.id.primary_button, 4);
        sparseIntArray.put(R.id.guideline_top, 5);
        sparseIntArray.put(R.id.guideline_bottom, 6);
        sparseIntArray.put(R.id.guideline_start, 7);
        sparseIntArray.put(R.id.guideline_end, 8);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.C = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
