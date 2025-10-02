package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class ActivityTransactionListBindingImpl extends ActivityTransactionListBinding {
    public static final ViewDataBinding.IncludedLayouts C;
    public static final SparseIntArray D;
    public long B;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        C = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.layout_dark_toolbar}, new String[]{"layout_dark_toolbar"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.transactionListView, 2);
        sparseIntArray.put(R.id.emptyView, 3);
        sparseIntArray.put(R.id.empty_icon, 4);
        sparseIntArray.put(R.id.cartEmptyMsg, 5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.B = 0L;
        }
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.B != 0) {
                    return true;
                }
                return this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 2L;
        }
        this.z.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 1;
        }
        return true;
    }
}
