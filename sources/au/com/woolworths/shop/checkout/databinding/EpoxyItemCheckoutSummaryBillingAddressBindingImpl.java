package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.shop.checkout.domain.model.CheckoutSummaryBillingAddress;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutSummaryBillingAddressBindingImpl extends EpoxyItemCheckoutSummaryBillingAddressBinding {
    public final TextView A;
    public long B;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCheckoutSummaryBillingAddressBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[1]);
        this.B = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[2];
        this.A = textView;
        textView.setTag(null);
        this.y.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (16 != i) {
            return false;
        }
        this.z = (CheckoutSummaryBillingAddress) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(16);
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
        CheckoutSummaryBillingAddress checkoutSummaryBillingAddress = this.z;
        long j2 = j & 3;
        if (j2 == 0 || checkoutSummaryBillingAddress == null) {
            str = null;
            str2 = null;
        } else {
            str = checkoutSummaryBillingAddress.b;
            str2 = checkoutSummaryBillingAddress.f10588a;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.A, str);
            TextViewBindingAdapter.b(this.y, str2);
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
