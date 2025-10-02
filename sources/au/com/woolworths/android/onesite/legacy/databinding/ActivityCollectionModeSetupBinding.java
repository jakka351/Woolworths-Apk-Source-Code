package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupViewModel;
import au.com.woolworths.android.onesite.modules.onboarding.stepper.StepperView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes3.dex */
public abstract class ActivityCollectionModeSetupBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final IncludeHorizontalDividerBinding C;
    public final IncludeHorizontalDividerBinding D;
    public final IncludeHorizontalDividerBinding E;
    public final TextView F;
    public final LottieAnimationView G;
    public final StepperView H;
    public CollectionModeSetupViewModel I;
    public final AppBarLayout y;
    public final IncludeHorizontalDividerBinding z;

    public ActivityCollectionModeSetupBinding(DataBindingComponent dataBindingComponent, View view, AppBarLayout appBarLayout, IncludeHorizontalDividerBinding includeHorizontalDividerBinding, TextView textView, TextView textView2, IncludeHorizontalDividerBinding includeHorizontalDividerBinding2, IncludeHorizontalDividerBinding includeHorizontalDividerBinding3, IncludeHorizontalDividerBinding includeHorizontalDividerBinding4, TextView textView3, LottieAnimationView lottieAnimationView, StepperView stepperView) {
        super(dataBindingComponent, view, 4);
        this.y = appBarLayout;
        this.z = includeHorizontalDividerBinding;
        this.A = textView;
        this.B = textView2;
        this.C = includeHorizontalDividerBinding2;
        this.D = includeHorizontalDividerBinding3;
        this.E = includeHorizontalDividerBinding4;
        this.F = textView3;
        this.G = lottieAnimationView;
        this.H = stepperView;
    }

    public abstract void L(CollectionModeSetupViewModel collectionModeSetupViewModel);
}
