package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.shop.checkout.domain.model.rewards.CheckoutSummaryRewardsSegment;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryListener;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutRewardsRegisteredRedeemableBindingImpl extends EpoxyItemCheckoutRewardsRegisteredRedeemableBinding implements OnClickListener.Listener {
    public final OnClickListener C;
    public long D;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCheckoutRewardsRegisteredRedeemableBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(view, (Button) objArrT[2], (TextView) objArrT[1], dataBindingComponent);
        this.D = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.z.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (219 == i) {
            this.A = (CheckoutSummaryRewardsSegment.RegisteredRedeemable) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(219);
            y();
            return true;
        }
        if (157 != i) {
            return false;
        }
        this.B = (CheckoutSummaryListener) obj;
        synchronized (this) {
            this.D |= 2;
        }
        h(157);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CheckoutSummaryRewardsSegment.RegisteredRedeemable registeredRedeemable = this.A;
        CheckoutSummaryListener checkoutSummaryListener = this.B;
        if (checkoutSummaryListener == null || registeredRedeemable == null) {
            return;
        }
        checkoutSummaryListener.E0(registeredRedeemable.d);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        CheckoutSummaryRewardsSegment.RegisteredRedeemable registeredRedeemable = this.A;
        long j2 = 5 & j;
        boolean z = false;
        String str3 = null;
        if (j2 != 0) {
            if (registeredRedeemable != null) {
                str3 = registeredRedeemable.f10656a;
                z = registeredRedeemable.c;
                str2 = registeredRedeemable.b;
            } else {
                str2 = null;
            }
            z = !z;
            String str4 = str3;
            str3 = str2;
            str = str4;
        } else {
            str = null;
        }
        if (j2 != 0) {
            this.y.setEnabled(z);
            TextViewBindingAdapter.b(this.y, str3);
            TextViewBindingAdapter.b(this.z, str);
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.C);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
