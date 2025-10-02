package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.shop.checkout.domain.model.rewards.CheckoutSummaryRewardsUnregistered;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryListener;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutRewardsUnregisteredBindingImpl extends EpoxyItemCheckoutRewardsUnregisteredBinding implements OnClickListener.Listener {
    public final Button A;
    public final OnClickListener B;
    public long C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemCheckoutRewardsUnregisteredBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 1, null, null);
        this.C = -1L;
        Button button = (Button) objArrT[0];
        this.A = button;
        button.setTag(null);
        E(view);
        this.B = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            this.z = (CheckoutSummaryListener) obj;
            synchronized (this) {
                this.C |= 1;
            }
            h(157);
            y();
            return true;
        }
        if (220 != i) {
            return false;
        }
        this.y = (CheckoutSummaryRewardsUnregistered) obj;
        synchronized (this) {
            this.C |= 2;
        }
        h(220);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CheckoutSummaryListener checkoutSummaryListener = this.z;
        if (checkoutSummaryListener != null) {
            checkoutSummaryListener.z1();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        CheckoutSummaryRewardsUnregistered checkoutSummaryRewardsUnregistered = this.y;
        long j2 = 6 & j;
        String str = (j2 == 0 || checkoutSummaryRewardsUnregistered == null) ? null : checkoutSummaryRewardsUnregistered.f10657a;
        if ((j & 4) != 0) {
            this.A.setOnClickListener(this.B);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.A, str);
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
