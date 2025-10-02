package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class IncludeNoSngStoreBindingImpl extends IncludeNoSngStoreBinding {
    public static final SparseIntArray C;
    public final ConstraintLayout A;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.imgNoStore, 1);
        sparseIntArray.put(R.id.txtNoStore, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeNoSngStoreBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, C);
        super(dataBindingComponent, view, (TextView) objArrT[2]);
        this.B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.A = constraintLayout;
        constraintLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (235 != i) {
            return false;
        }
        L((Boolean) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.IncludeNoSngStoreBinding
    public final void L(Boolean bool) throws Throwable {
        this.z = bool;
        synchronized (this) {
            this.B |= 1;
        }
        h(235);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 3;
        boolean zB = j2 != 0 ? ViewDataBinding.B(this.z) : false;
        if (j2 != 0) {
            BindingAdaptersKt.o(this.A, zB);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
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
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
