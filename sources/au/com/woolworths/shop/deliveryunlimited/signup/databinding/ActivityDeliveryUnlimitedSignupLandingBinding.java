package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes4.dex */
public abstract class ActivityDeliveryUnlimitedSignupLandingBinding extends ViewDataBinding {
    public final CoordinatorLayout A;
    public final ConstraintLayout B;
    public final TextView C;
    public final IncludeGenericErrorStateBinding D;
    public final ConstraintLayout E;
    public final IncludeBrandLabelBinding F;
    public final View G;
    public final EpoxyRecyclerView H;
    public final View I;
    public final Toolbar J;
    public final TextView K;
    public final EpoxyItemButtonBinding L;
    public DeliveryUnlimitedSignUpLandingViewModel M;
    public final AppBarLayout y;
    public final CollapsingToolbarLayout z;

    public ActivityDeliveryUnlimitedSignupLandingBinding(DataBindingComponent dataBindingComponent, View view, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, TextView textView, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, ConstraintLayout constraintLayout2, IncludeBrandLabelBinding includeBrandLabelBinding, View view2, EpoxyRecyclerView epoxyRecyclerView, View view3, Toolbar toolbar, TextView textView2, EpoxyItemButtonBinding epoxyItemButtonBinding) {
        super(dataBindingComponent, view, 4);
        this.y = appBarLayout;
        this.z = collapsingToolbarLayout;
        this.A = coordinatorLayout;
        this.B = constraintLayout;
        this.C = textView;
        this.D = includeGenericErrorStateBinding;
        this.E = constraintLayout2;
        this.F = includeBrandLabelBinding;
        this.G = view2;
        this.H = epoxyRecyclerView;
        this.I = view3;
        this.J = toolbar;
        this.K = textView2;
        this.L = epoxyItemButtonBinding;
    }

    public abstract void L(DeliveryUnlimitedSignUpLandingViewModel deliveryUnlimitedSignUpLandingViewModel);
}
