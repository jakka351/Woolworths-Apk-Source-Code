package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import com.woolworths.R;
import com.woolworths.scanlibrary.generated.callback.OnClickListener;

/* loaded from: classes7.dex */
public class IncludeSngNetworkErrorBindingImpl extends IncludeSngNetworkErrorBinding implements OnClickListener.Listener {
    public static final SparseIntArray F;
    public final ConstraintLayout C;
    public final OnClickListener D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.imgNetworkError, 2);
        sparseIntArray.put(R.id.txtNetworkError, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeSngNetworkErrorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, F);
        Button button = (Button) objArrT[1];
        super(view, button, (TextView) objArrT[3], dataBindingComponent);
        this.E = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.C = constraintLayout;
        constraintLayout.setTag(null);
        E(view);
        this.D = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (36 == i) {
            L((FullPageErrorStateClickHandler) obj);
            return true;
        }
        if (235 != i) {
            return false;
        }
        M((Boolean) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.IncludeSngNetworkErrorBinding
    public final void L(FullPageErrorStateClickHandler fullPageErrorStateClickHandler) throws Throwable {
        this.B = fullPageErrorStateClickHandler;
        synchronized (this) {
            this.E |= 1;
        }
        h(36);
        y();
    }

    @Override // com.woolworths.scanlibrary.databinding.IncludeSngNetworkErrorBinding
    public final void M(Boolean bool) throws Throwable {
        this.A = bool;
        synchronized (this) {
            this.E |= 2;
        }
        h(235);
        y();
    }

    @Override // com.woolworths.scanlibrary.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        FullPageErrorStateClickHandler fullPageErrorStateClickHandler = this.B;
        if (fullPageErrorStateClickHandler != null) {
            fullPageErrorStateClickHandler.onPrimaryActionClicked();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        long j2 = 6 & j;
        boolean zB = j2 != 0 ? ViewDataBinding.B(this.A) : false;
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.D);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.C, zB);
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
            this.E = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
