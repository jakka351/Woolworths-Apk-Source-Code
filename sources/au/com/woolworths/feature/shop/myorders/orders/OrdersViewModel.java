package au.com.woolworths.feature.shop.myorders.orders;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import au.com.woolworths.feature.shop.myorders.orders.OrdersContract;
import au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions;
import au.com.woolworths.feature.shop.myorders.orders.data.DeliveryOrder;
import au.com.woolworths.feature.shop.myorders.orders.data.PickUpOrder;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersTab;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersClickListener;", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrdersViewModel extends ViewModel implements OrdersClickListener {
    public final ShopAccountInteractor e;
    public final AnalyticsManager f;
    public final SharedFlowImpl g;
    public final Flow h;
    public final MutableLiveData i;
    public final MutableLiveData j;
    public final MediatorLiveData k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersViewModel$Companion;", "", "", "MINIMUM_TAB_SIZE_TO_BE_TRACKED", "I", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public OrdersViewModel(ShopAccountInteractor accountInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = accountInteractor;
        this.f = analyticsManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.g = sharedFlowImplB;
        this.h = FlowKt.a(sharedFlowImplB);
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.i = mutableLiveData;
        this.j = mutableLiveData;
        this.k = Transformations.a(Transformations.b(mutableLiveData, new l(11)));
    }

    @Override // au.com.woolworths.feature.shop.myorders.orders.OrdersClickListener
    public final void C0(String str) {
        this.g.f(new OrdersContract.Actions.OpenStoreInMaps(str));
    }

    @Override // au.com.woolworths.feature.shop.myorders.orders.OrdersClickListener
    public final void K0(DeliveryOrder order) {
        Intrinsics.h(order, "order");
        this.f.j(OrdersActions.u, TrackingMetadata.Companion.a(TrackableValue.h1, order.d));
        this.g.f(new OrdersContract.Actions.LaunchDeliveryOrderDetails(order));
    }

    @Override // au.com.woolworths.feature.shop.myorders.orders.OrdersClickListener
    public final void h2(PickUpOrder order) {
        Intrinsics.h(order, "order");
        this.f.j(OrdersActions.u, TrackingMetadata.Companion.a(TrackableValue.h1, order.d));
        this.g.f(new OrdersContract.Actions.LaunchPickUpOrderDetails(order));
    }

    public final void p6() {
        List listR;
        if (this.e.d()) {
            listR = CollectionsKt.R(OrdersTab.f, OrdersTab.g);
        } else {
            listR = CollectionsKt.Q(OrdersTab.e);
            this.f.c(OrdersActions.e);
        }
        this.i.m(new OrdersContract.ViewState(listR));
    }
}
