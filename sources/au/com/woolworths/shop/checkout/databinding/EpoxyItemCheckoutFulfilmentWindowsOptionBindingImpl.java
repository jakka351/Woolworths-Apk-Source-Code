package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.state.a;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutFulfilmentWindowsOptionBindingImpl extends EpoxyItemCheckoutFulfilmentWindowsOptionBinding implements OnClickListener.Listener {
    public final LinearLayout C;
    public final CheckedTextView D;
    public final CheckedTextView E;
    public final CheckedTextView F;
    public final OnClickListener G;
    public long H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemCheckoutFulfilmentWindowsOptionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        this.H = -1L;
        LinearLayout linearLayout = (LinearLayout) objArrT[0];
        this.C = linearLayout;
        linearLayout.setTag(null);
        CheckedTextView checkedTextView = (CheckedTextView) objArrT[1];
        this.D = checkedTextView;
        checkedTextView.setTag(null);
        CheckedTextView checkedTextView2 = (CheckedTextView) objArrT[2];
        this.E = checkedTextView2;
        checkedTextView2.setTag(null);
        CheckedTextView checkedTextView3 = (CheckedTextView) objArrT[3];
        this.F = checkedTextView3;
        checkedTextView3.setTag(null);
        E(view);
        this.G = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (263 == i) {
            this.A = (String) obj;
            synchronized (this) {
                this.H |= 1;
            }
            h(263);
            y();
            return true;
        }
        if (88 == i) {
            this.y = (FulfilmentWindows) obj;
            synchronized (this) {
                this.H |= 2;
            }
            h(88);
            y();
            return true;
        }
        if (157 == i) {
            this.B = (FulfilmentWindowsListener) obj;
            synchronized (this) {
                this.H |= 4;
            }
            h(157);
            y();
            return true;
        }
        if (89 != i) {
            return false;
        }
        this.z = (FulfilmentWindowsOption) obj;
        synchronized (this) {
            this.H |= 8;
        }
        h(89);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        String str = this.A;
        FulfilmentWindows fulfilmentWindows = this.y;
        FulfilmentWindowsListener fulfilmentWindowsListener = this.B;
        FulfilmentWindowsOption fulfilmentWindowsOption = this.z;
        if (fulfilmentWindowsListener != null) {
            fulfilmentWindowsListener.J(str, fulfilmentWindows, fulfilmentWindowsOption);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        FulfilmentWindowsOption fulfilmentWindowsOption = this.z;
        long j2 = 24 & j;
        boolean z2 = false;
        String strJ = null;
        if (j2 != 0) {
            if (fulfilmentWindowsOption != null) {
                z2 = fulfilmentWindowsOption.d;
                strJ = fulfilmentWindowsOption.b;
                z = fulfilmentWindowsOption.c;
                str2 = fulfilmentWindowsOption.e;
                str3 = fulfilmentWindowsOption.f10615a;
            } else {
                z = false;
                str2 = null;
                str3 = null;
            }
            Intrinsics.h(fulfilmentWindowsOption, "<this>");
            String str4 = strJ;
            strJ = a.j(fulfilmentWindowsOption.f10615a, ", ", fulfilmentWindowsOption.b, ", ", fulfilmentWindowsOption.e);
            str = str4;
        } else {
            z = false;
            str = null;
            str2 = null;
            str3 = null;
        }
        if (j2 != 0) {
            if (ViewDataBinding.s >= 4) {
                this.C.setContentDescription(strJ);
            }
            this.C.setEnabled(z);
            this.C.setSelected(z2);
            this.D.setChecked(z2);
            this.D.setEnabled(z);
            TextViewBindingAdapter.b(this.D, str3);
            this.E.setChecked(z2);
            this.E.setEnabled(z);
            TextViewBindingAdapter.b(this.E, str);
            this.F.setChecked(z2);
            this.F.setEnabled(z);
            TextViewBindingAdapter.b(this.F, str2);
        }
        if ((j & 16) != 0) {
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
            this.H = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
