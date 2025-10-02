package au.com.woolworths.feature.rewards.offers.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.rewards.base.data.RewardsEmptyStateData;

/* loaded from: classes3.dex */
public abstract class EpoxyItemRewardsOffersFilterNoOffersBinding extends ViewDataBinding {
    public final TextView A;
    public RewardsEmptyStateData B;
    public final ImageView y;
    public final TextView z;

    public EpoxyItemRewardsOffersFilterNoOffersBinding(View view, ImageView imageView, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
        this.A = textView2;
    }
}
