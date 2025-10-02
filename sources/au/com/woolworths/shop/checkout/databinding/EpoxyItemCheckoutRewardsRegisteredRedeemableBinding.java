package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.rewards.CheckoutSummaryRewardsSegment;
import au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryListener;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCheckoutRewardsRegisteredRedeemableBinding extends ViewDataBinding {
    public CheckoutSummaryRewardsSegment.RegisteredRedeemable A;
    public CheckoutSummaryListener B;
    public final Button y;
    public final TextView z;

    public EpoxyItemCheckoutRewardsRegisteredRedeemableBinding(View view, Button button, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = textView;
    }
}
