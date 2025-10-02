package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class ActivityOrderDetailsBinding extends ViewDataBinding {
    public final EpoxyRecyclerView A;
    public final ContentLoadingProgressBar B;
    public final SwipeRefreshLayout C;
    public final Toolbar D;
    public final IncludeOrderDeliveredAnimationViewBinding E;
    public OrderDetailsViewModel F;
    public final IncludeGenericErrorStateBinding y;
    public final View z;

    public ActivityOrderDetailsBinding(DataBindingComponent dataBindingComponent, View view, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, View view2, EpoxyRecyclerView epoxyRecyclerView, ContentLoadingProgressBar contentLoadingProgressBar, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar, IncludeOrderDeliveredAnimationViewBinding includeOrderDeliveredAnimationViewBinding) {
        super(dataBindingComponent, view, 3);
        this.y = includeGenericErrorStateBinding;
        this.z = view2;
        this.A = epoxyRecyclerView;
        this.B = contentLoadingProgressBar;
        this.C = swipeRefreshLayout;
        this.D = toolbar;
        this.E = includeOrderDeliveredAnimationViewBinding;
    }

    public abstract void L(OrderDetailsViewModel orderDetailsViewModel);
}
