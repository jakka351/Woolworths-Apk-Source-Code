package au.com.woolworths.feature.rewards.redemptionsettings.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentRedemptionSettingsBottomSheetBinding extends ViewDataBinding {
    public static final /* synthetic */ int A = 0;
    public final TextView y;
    public RewardsRedemptionSettingsViewModel z;

    public FragmentRedemptionSettingsBottomSheetBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 1);
        this.y = textView;
    }

    public abstract void L(RewardsRedemptionSettingsViewModel rewardsRedemptionSettingsViewModel);
}
