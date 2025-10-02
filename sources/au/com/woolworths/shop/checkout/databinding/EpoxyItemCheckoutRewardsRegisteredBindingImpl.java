package au.com.woolworths.shop.checkout.databinding;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.checkout.domain.model.rewards.CheckoutSummaryRewardsSegment;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutRewardsRegisteredBindingImpl extends EpoxyItemCheckoutRewardsRegisteredBinding {
    public final TextView B;
    public long C;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCheckoutRewardsRegisteredBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(view, (ImageView) objArrT[1], (TextView) objArrT[2], dataBindingComponent);
        this.C = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[3];
        this.B = textView;
        textView.setTag(null);
        this.z.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (218 != i) {
            return false;
        }
        this.A = (CheckoutSummaryRewardsSegment.Registered) obj;
        synchronized (this) {
            this.C |= 1;
        }
        h(218);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        String str3;
        Drawable drawable;
        int i;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        CheckoutSummaryRewardsSegment.Registered registered = this.A;
        long j2 = j & 3;
        if (j2 != 0) {
            if (registered != null) {
                str = registered.f10655a;
                str2 = registered.c;
                str3 = registered.b;
                i = R.drawable.ic_rewards_card_small;
            } else {
                i = 0;
                str = null;
                str2 = null;
                str3 = null;
            }
            drawable = this.h.getContext().getDrawable(i);
        } else {
            str = null;
            str2 = null;
            str3 = null;
            drawable = null;
        }
        if (j2 != 0) {
            BindingAdaptersKt.g(this.y, str2, null, drawable);
            TextViewBindingAdapter.b(this.B, str3);
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
            this.C = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
