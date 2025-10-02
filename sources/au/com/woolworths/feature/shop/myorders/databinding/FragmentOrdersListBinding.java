package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class FragmentOrdersListBinding extends ViewDataBinding {
    public static final /* synthetic */ int F = 0;
    public final EpoxyRecyclerView A;
    public final SwipeRefreshLayout B;
    public Function0 C;
    public FullPageErrorStateClickHandler D;
    public OrdersListViewModel E;
    public final IncludeGenericErrorStateBinding y;
    public final EpoxyItemOrdersSeeAllLinkBinding z;

    public FragmentOrdersListBinding(DataBindingComponent dataBindingComponent, View view, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, EpoxyItemOrdersSeeAllLinkBinding epoxyItemOrdersSeeAllLinkBinding, EpoxyRecyclerView epoxyRecyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(dataBindingComponent, view, 3);
        this.y = includeGenericErrorStateBinding;
        this.z = epoxyItemOrdersSeeAllLinkBinding;
        this.A = epoxyRecyclerView;
        this.B = swipeRefreshLayout;
    }

    public abstract void L(FullPageErrorStateClickHandler fullPageErrorStateClickHandler);

    public abstract void M(OrdersListViewModel ordersListViewModel);

    public abstract void N(Function0 function0);
}
