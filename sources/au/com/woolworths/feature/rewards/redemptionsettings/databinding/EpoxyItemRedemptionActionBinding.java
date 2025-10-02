package au.com.woolworths.feature.rewards.redemptionsettings.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.redemptionsettings.RedemptionItemClickListener;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionAction;

/* loaded from: classes3.dex */
public abstract class EpoxyItemRedemptionActionBinding extends ViewDataBinding {
    public final TextView A;
    public RewardsRedemptionAction B;
    public RedemptionItemClickListener C;
    public final TextView y;
    public final ImageView z;

    public EpoxyItemRedemptionActionBinding(View view, ImageView imageView, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
        this.A = textView2;
    }
}
