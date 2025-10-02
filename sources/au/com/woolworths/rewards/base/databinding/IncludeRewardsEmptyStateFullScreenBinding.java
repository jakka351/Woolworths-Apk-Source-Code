package au.com.woolworths.rewards.base.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.rewards.base.data.RewardsEmptyStateData;

/* loaded from: classes4.dex */
public abstract class IncludeRewardsEmptyStateFullScreenBinding extends ViewDataBinding {
    public final TextView A;
    public RewardsEmptyStateData B;
    public final ImageView y;
    public final TextView z;

    public IncludeRewardsEmptyStateFullScreenBinding(View view, ImageView imageView, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
        this.A = textView2;
    }

    public abstract void L(RewardsEmptyStateData rewardsEmptyStateData);
}
