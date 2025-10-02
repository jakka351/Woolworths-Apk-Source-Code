package au.com.woolworths.feature.rewards.redemptionsettings.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsViewModel;
import au.com.woolworths.rewards.base.databinding.IncludeRewardsGenericErrorStateFullScreenBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class FragmentRedemptionSettingsBinding extends ViewDataBinding {
    public static final /* synthetic */ int B = 0;
    public RewardsRedemptionSettingsViewModel A;
    public final IncludeRewardsGenericErrorStateFullScreenBinding y;
    public final EpoxyRecyclerView z;

    public FragmentRedemptionSettingsBinding(DataBindingComponent dataBindingComponent, View view, IncludeRewardsGenericErrorStateFullScreenBinding includeRewardsGenericErrorStateFullScreenBinding, EpoxyRecyclerView epoxyRecyclerView) {
        super(dataBindingComponent, view, 2);
        this.y = includeRewardsGenericErrorStateFullScreenBinding;
        this.z = epoxyRecyclerView;
    }

    public abstract void L(RewardsRedemptionSettingsViewModel rewardsRedemptionSettingsViewModel);
}
