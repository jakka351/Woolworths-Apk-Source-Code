package au.com.woolworths.feature.rewards.offers.databinding;

import android.view.View;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.rewards.offers.RewardsOffersViewModelLegacy;
import com.airbnb.epoxy.EpoxyRecyclerView;
import nl.dionsegijn.konfetti.KonfettiView;

/* loaded from: classes3.dex */
public abstract class FragmentRewardsOffersBinding extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;
    public final IncludeGenericErrorStateBinding A;
    public final ContentLoadingProgressBar B;
    public final SwipeRefreshLayout C;
    public RewardsOffersViewModelLegacy D;
    public final KonfettiView y;
    public final EpoxyRecyclerView z;

    public FragmentRewardsOffersBinding(DataBindingComponent dataBindingComponent, View view, KonfettiView konfettiView, EpoxyRecyclerView epoxyRecyclerView, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, ContentLoadingProgressBar contentLoadingProgressBar, SwipeRefreshLayout swipeRefreshLayout) {
        super(dataBindingComponent, view, 2);
        this.y = konfettiView;
        this.z = epoxyRecyclerView;
        this.A = includeGenericErrorStateBinding;
        this.B = contentLoadingProgressBar;
        this.C = swipeRefreshLayout;
    }

    public abstract void L(RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy);
}
