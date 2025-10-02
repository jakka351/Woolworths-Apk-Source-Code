package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import androidx.constraintlayout.core.state.a;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener;
import au.com.woolworths.views.CheckableConstraintLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutPackagingMethodOptionBindingImpl extends EpoxyItemCheckoutPackagingMethodOptionBinding implements OnClickListener.Listener {
    public final CheckableConstraintLayout D;
    public final CheckedTextView E;
    public final OnClickListener F;
    public long G;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCheckoutPackagingMethodOptionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, null);
        super(dataBindingComponent, view, (ImageView) objArrT[1], (CheckedTextView) objArrT[3], (CheckedTextView) objArrT[2]);
        this.G = -1L;
        this.y.setTag(null);
        CheckableConstraintLayout checkableConstraintLayout = (CheckableConstraintLayout) objArrT[0];
        this.D = checkableConstraintLayout;
        checkableConstraintLayout.setTag(null);
        CheckedTextView checkedTextView = (CheckedTextView) objArrT[4];
        this.E = checkedTextView;
        checkedTextView.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        E(view);
        this.F = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            this.C = (CheckoutDetailsListener) obj;
            synchronized (this) {
                this.G |= 1;
            }
            h(157);
            y();
            return true;
        }
        if (191 != i) {
            return false;
        }
        this.B = (PackagingMethodOption) obj;
        synchronized (this) {
            this.G |= 2;
        }
        h(191);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CheckoutDetailsListener checkoutDetailsListener = this.C;
        PackagingMethodOption packagingMethodOption = this.B;
        if (checkoutDetailsListener != null) {
            checkoutDetailsListener.N3(packagingMethodOption);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        String str3;
        boolean z;
        String strJ;
        String str4;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        PackagingMethodOption packagingMethodOption = this.B;
        long j2 = 6 & j;
        String str5 = null;
        boolean z2 = false;
        if (j2 != 0) {
            if (packagingMethodOption != null) {
                z2 = packagingMethodOption.b;
                str5 = packagingMethodOption.c;
                str2 = packagingMethodOption.d;
                str4 = packagingMethodOption.f;
                str3 = packagingMethodOption.e;
            } else {
                str2 = null;
                str4 = null;
                str3 = null;
            }
            Intrinsics.h(packagingMethodOption, "<this>");
            String str6 = packagingMethodOption.c;
            String str7 = packagingMethodOption.d;
            String str8 = packagingMethodOption.e;
            if (str8 == null) {
                str8 = "";
            }
            boolean z3 = z2;
            strJ = a.j(str6, ", ", str7, ", ", str8);
            str = str5;
            str5 = str4;
            z = z3;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            z = false;
            strJ = null;
        }
        if (j2 != 0) {
            BindingAdaptersKt.d(this.y, str5);
            this.D.setChecked(z);
            TextViewBindingAdapter.b(this.E, str3);
            TextViewBindingAdapter.b(this.z, str2);
            TextViewBindingAdapter.b(this.A, str);
            if (ViewDataBinding.s >= 4) {
                this.D.setContentDescription(strJ);
            }
        }
        if ((j & 4) != 0) {
            this.D.setOnClickListener(this.F);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
