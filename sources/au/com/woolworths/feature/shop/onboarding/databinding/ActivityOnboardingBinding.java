package au.com.woolworths.feature.shop.onboarding.databinding;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.onboarding.OnboardingViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

/* loaded from: classes3.dex */
public abstract class ActivityOnboardingBinding extends ViewDataBinding {
    public final View A;
    public final EpoxyRecyclerView B;
    public final ConstraintLayout C;
    public final Toolbar D;
    public final AppCompatTextView E;
    public final ViewPager2 F;
    public OnboardingViewModel G;
    public final WormDotsIndicator y;
    public final IncludeGenericErrorStateBinding z;

    public ActivityOnboardingBinding(DataBindingComponent dataBindingComponent, View view, WormDotsIndicator wormDotsIndicator, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, View view2, EpoxyRecyclerView epoxyRecyclerView, ConstraintLayout constraintLayout, Toolbar toolbar, AppCompatTextView appCompatTextView, ViewPager2 viewPager2) {
        super(dataBindingComponent, view, 2);
        this.y = wormDotsIndicator;
        this.z = includeGenericErrorStateBinding;
        this.A = view2;
        this.B = epoxyRecyclerView;
        this.C = constraintLayout;
        this.D = toolbar;
        this.E = appCompatTextView;
        this.F = viewPager2;
    }

    public abstract void L(OnboardingViewModel onboardingViewModel);
}
