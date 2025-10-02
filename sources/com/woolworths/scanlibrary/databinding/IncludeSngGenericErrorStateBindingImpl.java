package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.common.FullPageErrorBindingAdaptersKt;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.scanlibrary.generated.callback.OnClickListener;

/* loaded from: classes7.dex */
public class IncludeSngGenericErrorStateBindingImpl extends IncludeSngGenericErrorStateBinding implements OnClickListener.Listener {
    public final OnClickListener F;
    public final OnClickListener G;
    public long H;

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeSngGenericErrorStateBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, null);
        super(dataBindingComponent, view, (ImageView) objArrT[1], (TextView) objArrT[3], (Button) objArrT[5], (TextView) objArrT[2], (Button) objArrT[4]);
        this.H = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.C.setTag(null);
        E(view);
        this.F = new OnClickListener(this, 2);
        this.G = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (76 == i) {
            M((FullPageErrorCause) obj);
            return true;
        }
        if (36 != i) {
            return false;
        }
        L((FullPageErrorStateClickHandler) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.IncludeSngGenericErrorStateBinding
    public final void L(FullPageErrorStateClickHandler fullPageErrorStateClickHandler) throws Throwable {
        this.E = fullPageErrorStateClickHandler;
        synchronized (this) {
            this.H |= 2;
        }
        h(36);
        y();
    }

    @Override // com.woolworths.scanlibrary.databinding.IncludeSngGenericErrorStateBinding
    public final void M(FullPageErrorCause fullPageErrorCause) throws Throwable {
        this.D = fullPageErrorCause;
        synchronized (this) {
            this.H |= 1;
        }
        h(76);
        y();
    }

    @Override // com.woolworths.scanlibrary.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        FullPageErrorStateClickHandler fullPageErrorStateClickHandler;
        if (i != 1) {
            if (i == 2 && (fullPageErrorStateClickHandler = this.E) != null) {
                fullPageErrorStateClickHandler.onSecondaryActionClicked();
                return;
            }
            return;
        }
        FullPageErrorStateClickHandler fullPageErrorStateClickHandler2 = this.E;
        if (fullPageErrorStateClickHandler2 != null) {
            fullPageErrorStateClickHandler2.onPrimaryActionClicked();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        Text d;
        int i;
        int f;
        Text e;
        int primaryActionRes;
        int g;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        FullPageErrorCause fullPageErrorCause = this.D;
        long j2 = 5 & j;
        Text text = null;
        if (j2 != 0) {
            if (fullPageErrorCause != null) {
                primaryActionRes = fullPageErrorCause.getPrimaryActionRes();
                d = fullPageErrorCause.getD();
                e = fullPageErrorCause.getE();
                f = fullPageErrorCause.getF();
                g = fullPageErrorCause.getG();
            } else {
                d = null;
                e = null;
                primaryActionRes = 0;
                f = 0;
                g = 0;
            }
            z = g != 0;
            Text text2 = e;
            i = primaryActionRes;
            text = text2;
        } else {
            d = null;
            i = 0;
            f = 0;
        }
        if (j2 != 0) {
            FullPageErrorBindingAdaptersKt.a(this.y, fullPageErrorCause);
            BindingAdaptersKt.o(this.y, z);
            BindingAdaptersKt.s(this.z, text);
            BindingAdaptersKt.r(this.A, f);
            BindingAdaptersKt.s(this.B, d);
            BindingAdaptersKt.r(this.C, i);
        }
        if ((j & 4) != 0) {
            this.A.setOnClickListener(this.F);
            this.C.setOnClickListener(this.G);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.H = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
