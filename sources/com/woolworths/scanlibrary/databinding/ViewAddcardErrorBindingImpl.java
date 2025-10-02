package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class ViewAddcardErrorBindingImpl extends ViewAddcardErrorBinding {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.errorImageView, 2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (240 == i) {
            M((Boolean) obj);
            return true;
        }
        if (75 != i) {
            return false;
        }
        L((String) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ViewAddcardErrorBinding
    public final void L(String str) throws Throwable {
        this.A = str;
        synchronized (this) {
            this.C |= 2;
        }
        h(75);
        y();
    }

    @Override // com.woolworths.scanlibrary.databinding.ViewAddcardErrorBinding
    public final void M(Boolean bool) throws Throwable {
        this.B = bool;
        synchronized (this) {
            this.C |= 1;
        }
        h(240);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        Boolean bool = this.B;
        String str = this.A;
        long j2 = j & 5;
        int i = 0;
        if (j2 != 0) {
            boolean zB = ViewDataBinding.B(bool);
            if (j2 != 0) {
                j |= zB ? 16L : 8L;
            }
            if (!zB) {
                i = 8;
            }
        }
        long j3 = 6 & j;
        if ((j & 5) != 0) {
            this.y.setVisibility(i);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.z, str);
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
            this.C = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
