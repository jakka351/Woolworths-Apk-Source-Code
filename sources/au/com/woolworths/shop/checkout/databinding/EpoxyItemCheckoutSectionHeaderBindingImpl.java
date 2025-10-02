package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.checkout.domain.model.CheckoutSectionHeader;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutSectionHeaderBindingImpl extends EpoxyItemCheckoutSectionHeaderBinding {
    public final TextView A;
    public long B;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCheckoutSectionHeaderBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (ImageView) objArrT[1]);
        this.B = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[2];
        this.A = textView;
        textView.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (223 != i) {
            return false;
        }
        this.z = (CheckoutSectionHeader) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(223);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        CheckoutSectionHeader checkoutSectionHeader = this.z;
        long j2 = j & 3;
        if (j2 == 0 || checkoutSectionHeader == null) {
            str = null;
            str2 = null;
        } else {
            str = checkoutSectionHeader.f10583a;
            str2 = checkoutSectionHeader.b;
        }
        if (j2 != 0) {
            BindingAdaptersKt.e(this.y, str2, null);
            TextViewBindingAdapter.b(this.A, str);
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
