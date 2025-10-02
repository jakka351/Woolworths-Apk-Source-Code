package au.com.woolworths.shop.rewards.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.rewards.RewardsViewModelLegacy;

/* loaded from: classes4.dex */
public abstract class ActivityRewardsBinding extends ViewDataBinding {
    public final Toolbar y;
    public RewardsViewModelLegacy z;

    public ActivityRewardsBinding(DataBindingComponent dataBindingComponent, View view, Toolbar toolbar) {
        super(dataBindingComponent, view, 1);
        this.y = toolbar;
    }

    public abstract void L(RewardsViewModelLegacy rewardsViewModelLegacy);
}
