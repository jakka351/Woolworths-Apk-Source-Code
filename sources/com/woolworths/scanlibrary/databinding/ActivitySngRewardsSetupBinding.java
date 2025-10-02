package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.ui.reward.SngRewardSetupViewModel;

/* loaded from: classes7.dex */
public abstract class ActivitySngRewardsSetupBinding extends ViewDataBinding {
    public final IncludeSngGenericErrorStateBinding A;
    public final View B;
    public final ConstraintLayout C;
    public final Toolbar D;
    public SngRewardSetupViewModel E;
    public final Button y;
    public final Button z;

    public ActivitySngRewardsSetupBinding(DataBindingComponent dataBindingComponent, View view, Button button, Button button2, IncludeSngGenericErrorStateBinding includeSngGenericErrorStateBinding, View view2, ConstraintLayout constraintLayout, Toolbar toolbar) {
        super(dataBindingComponent, view, 2);
        this.y = button;
        this.z = button2;
        this.A = includeSngGenericErrorStateBinding;
        this.B = view2;
        this.C = constraintLayout;
        this.D = toolbar;
    }

    public abstract void L(SngRewardSetupViewModel sngRewardSetupViewModel);
}
