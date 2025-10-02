package au.com.woolworths.feature.shop.homepage.databinding;

import android.view.View;
import android.widget.ProgressBar;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel;
import au.com.woolworths.feature.shop.homepage.presentation.deliverynowbanner.DeliveryNowBannerView;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerView;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class FragmentHomePageBinding extends ViewDataBinding {
    public static final /* synthetic */ int H = 0;
    public final DeliveryNowBannerView A;
    public final EditOrderBannerView B;
    public final IncludeGenericErrorStateBinding C;
    public final ProgressBar D;
    public final EpoxyRecyclerView E;
    public final SwipeRefreshLayout F;
    public HomePageViewModel G;
    public final IncludeGenericErrorStateBinding y;
    public final ComposeView z;

    public FragmentHomePageBinding(DataBindingComponent dataBindingComponent, View view, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, ComposeView composeView, DeliveryNowBannerView deliveryNowBannerView, EditOrderBannerView editOrderBannerView, IncludeGenericErrorStateBinding includeGenericErrorStateBinding2, ProgressBar progressBar, EpoxyRecyclerView epoxyRecyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(dataBindingComponent, view, 3);
        this.y = includeGenericErrorStateBinding;
        this.z = composeView;
        this.A = deliveryNowBannerView;
        this.B = editOrderBannerView;
        this.C = includeGenericErrorStateBinding2;
        this.D = progressBar;
        this.E = epoxyRecyclerView;
        this.F = swipeRefreshLayout;
    }

    public abstract void L(HomePageViewModel homePageViewModel);
}
