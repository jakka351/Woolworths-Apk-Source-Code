package au.com.woolworths.feature.rewards.account.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModelLegacy;
import au.com.woolworths.rewards.base.databinding.IncludeRewardsGenericErrorStateFullScreenBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes3.dex */
public abstract class FragmentRewardsPreferenceDetailsBinding extends ViewDataBinding {
    public static final /* synthetic */ int H = 0;
    public final IncludeRewardsGenericErrorStateFullScreenBinding A;
    public final ImageView B;
    public final ContentLoadingProgressBar C;
    public final EpoxyRecyclerView D;
    public final Toolbar E;
    public RewardsPreferenceDetailsViewModelLegacy F;
    public boolean G;
    public final AppBarLayout y;
    public final CoordinatorLayout z;

    public FragmentRewardsPreferenceDetailsBinding(DataBindingComponent dataBindingComponent, View view, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout, IncludeRewardsGenericErrorStateFullScreenBinding includeRewardsGenericErrorStateFullScreenBinding, ImageView imageView, ContentLoadingProgressBar contentLoadingProgressBar, EpoxyRecyclerView epoxyRecyclerView, Toolbar toolbar) {
        super(dataBindingComponent, view, 2);
        this.y = appBarLayout;
        this.z = coordinatorLayout;
        this.A = includeRewardsGenericErrorStateFullScreenBinding;
        this.B = imageView;
        this.C = contentLoadingProgressBar;
        this.D = epoxyRecyclerView;
        this.E = toolbar;
    }

    public abstract void L(boolean z);

    public abstract void M(RewardsPreferenceDetailsViewModelLegacy rewardsPreferenceDetailsViewModelLegacy);
}
