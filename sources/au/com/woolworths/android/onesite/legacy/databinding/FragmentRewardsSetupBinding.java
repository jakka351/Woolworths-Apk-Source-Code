package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentRewardsSetupBinding extends ViewDataBinding {
    public final Button A;
    public RewardsSetupViewModel B;
    public final Button y;
    public final View z;

    public FragmentRewardsSetupBinding(DataBindingComponent dataBindingComponent, View view, Button button, View view2, Button button2) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = view2;
        this.A = button2;
    }

    public abstract void L(RewardsSetupViewModel rewardsSetupViewModel);
}
