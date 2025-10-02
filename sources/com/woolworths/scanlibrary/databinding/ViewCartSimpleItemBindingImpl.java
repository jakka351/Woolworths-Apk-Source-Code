package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class ViewCartSimpleItemBindingImpl extends ViewCartSimpleItemBinding {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.cartItemView, 1);
        sparseIntArray.put(R.id.imgPromotionBadge, 2);
        sparseIntArray.put(R.id.itemPrice, 3);
        sparseIntArray.put(R.id.itemCount, 4);
        sparseIntArray.put(R.id.productDescription, 5);
        sparseIntArray.put(R.id.textView2, 6);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.E = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
