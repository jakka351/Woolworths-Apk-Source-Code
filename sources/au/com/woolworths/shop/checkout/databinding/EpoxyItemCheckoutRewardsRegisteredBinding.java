package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.rewards.CheckoutSummaryRewardsSegment;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCheckoutRewardsRegisteredBinding extends ViewDataBinding {
    public CheckoutSummaryRewardsSegment.Registered A;
    public final ImageView y;
    public final TextView z;

    public EpoxyItemCheckoutRewardsRegisteredBinding(View view, ImageView imageView, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
    }
}
