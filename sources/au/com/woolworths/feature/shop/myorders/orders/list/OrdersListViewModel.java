package au.com.woolworths.feature.shop.myorders.orders.list;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.myorders.orders.OrdersFullPageErrorState;
import au.com.woolworths.feature.shop.myorders.orders.OrdersInteractor;
import au.com.woolworths.feature.shop.myorders.orders.SeeAllOrdersListener;
import au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions;
import au.com.woolworths.feature.shop.myorders.orders.data.DeliveryOrder;
import au.com.woolworths.feature.shop.myorders.orders.data.OrderCompact;
import au.com.woolworths.feature.shop.myorders.orders.data.PickUpOrder;
import au.com.woolworths.feature.shop.myorders.orders.list.OrderListContract;
import au.com.woolworths.feature.shop.myorders.orders.models.OrderCompactUiModel;
import au.com.woolworths.feature.shop.myorders.orders.models.OrderDeliveryUiModel;
import au.com.woolworths.feature.shop.myorders.orders.models.OrderPickUpUiModel;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import timber.log.Timber;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrdersListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/myorders/orders/SeeAllOrdersListener;", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrdersListViewModel extends ViewModel implements SeeAllOrdersListener {
    public final OrdersInteractor e;
    public final AnalyticsManager f;
    public OrdersTab g;
    public final MutableLiveData h;
    public final MutableLiveData i;
    public final SharedFlowImpl j;
    public final Flow k;
    public final OrdersListViewModel$errorHandler$1 l;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrdersListViewModel$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "", "FIRST_PAGE", "I", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[OrdersTab.values().length];
            try {
                iArr[OrdersTab.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrdersTab.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrdersTab.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel$errorHandler$1] */
    public OrdersListViewModel(OrdersInteractor ordersInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = ordersInteractor;
        this.f = analyticsManager;
        MutableLiveData mutableLiveData = new MutableLiveData(new OrderListContract.ViewState(true, (List) EmptyList.d, (OrdersFullPageErrorState) null, (Integer) null, 50));
        this.h = mutableLiveData;
        this.i = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.j = sharedFlowImplB;
        this.k = FlowKt.a(sharedFlowImplB);
        this.l = new FullPageErrorStateClickHandler() { // from class: au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel$errorHandler$1
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
            public final void onPrimaryActionClicked() {
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
            public final void onSecondaryActionClicked() {
                Timber.Forest forest = Timber.f27013a;
                forest.s("OrdersListViewModel");
                OrdersListViewModel ordersListViewModel = this.d;
                MutableLiveData mutableLiveData2 = ordersListViewModel.i;
                OrderListContract.ViewState viewState = (OrderListContract.ViewState) mutableLiveData2.e();
                forest.b((viewState != null ? viewState.c : null) + " secondary error clicked", new Object[0]);
                OrderListContract.ViewState viewState2 = (OrderListContract.ViewState) mutableLiveData2.e();
                OrdersFullPageErrorState ordersFullPageErrorState = viewState2 != null ? viewState2.c : null;
                if (Intrinsics.c(ordersFullPageErrorState, OrdersFullPageErrorState.PastOrderNetworkErrorState.d) || Intrinsics.c(ordersFullPageErrorState, OrdersFullPageErrorState.PastOrderServerErrorState.d) || Intrinsics.c(ordersFullPageErrorState, OrdersFullPageErrorState.NetworkError.d) || Intrinsics.c(ordersFullPageErrorState, OrdersFullPageErrorState.ServerError.d)) {
                    AnalyticsManager analyticsManager2 = ordersListViewModel.f;
                    OrdersTab ordersTab = ordersListViewModel.g;
                    if (ordersTab == null) {
                        Intrinsics.p("ordersTab");
                        throw null;
                    }
                    analyticsManager2.c(ordersTab.getK());
                    ordersListViewModel.h.m(new OrderListContract.ViewState(true, ordersListViewModel.u6(), (OrdersFullPageErrorState) null, (Integer) null, 50));
                    ordersListViewModel.r6();
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:11:0x002b, B:21:0x004d, B:23:0x0070, B:24:0x0084, B:26:0x0088, B:32:0x00bb, B:34:0x00c5, B:35:0x00d3, B:28:0x0098, B:30:0x009e, B:31:0x00a6, B:18:0x003e), top: B:43:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel.p6(au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static ArrayList w6(List list) {
        OrderListItem orderDeliveryUiModel;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof OrderCompact) {
                orderDeliveryUiModel = new OrderCompactUiModel((OrderCompact) obj);
            } else if (obj instanceof PickUpOrder) {
                orderDeliveryUiModel = new OrderPickUpUiModel((PickUpOrder) obj);
            } else if (obj instanceof DeliveryOrder) {
                orderDeliveryUiModel = new OrderDeliveryUiModel((DeliveryOrder) obj);
            } else {
                Timber.f27013a.o("Mapping item of type " + Reflection.f24268a.b(obj.getClass()).B() + " " + obj + " not supported", new Object[0]);
                orderDeliveryUiModel = null;
            }
            if (orderDeliveryUiModel != null) {
                arrayList.add(orderDeliveryUiModel);
            }
        }
        return arrayList;
    }

    @Override // au.com.woolworths.feature.shop.myorders.orders.SeeAllOrdersListener
    public final void M2() {
        this.f.c(OrdersActions.k);
        this.j.f(OrderListContract.Action.LaunchSeeAllWebOrders.f7871a);
    }

    public final OrdersFullPageErrorState q6(Throwable th) {
        OrdersFullPageErrorState ordersFullPageErrorState;
        if (!u6().isEmpty()) {
            boolean zF = this.j.f(new OrderListContract.Action.ShowErrorMessage(new ResText(R.string.error_no_network)));
            Timber.Forest forest = Timber.f27013a;
            forest.s("OrdersListViewModel");
            forest.m("Emitting Error Actions " + zF, new Object[0]);
            return null;
        }
        boolean z = th instanceof NoConnectivityException;
        AnalyticsManager analyticsManager = this.f;
        if (!z) {
            if (th instanceof ServerErrorException) {
                OrdersFullPageErrorState ordersFullPageErrorStateV6 = v6();
                analyticsManager.c(OrdersActions.h);
                return ordersFullPageErrorStateV6;
            }
            OrdersFullPageErrorState ordersFullPageErrorStateV62 = v6();
            analyticsManager.c(OrdersActions.h);
            return ordersFullPageErrorStateV62;
        }
        OrdersTab ordersTab = this.g;
        if (ordersTab == null) {
            Intrinsics.p("ordersTab");
            throw null;
        }
        int iOrdinal = ordersTab.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalStateException("No server error for guest state");
        }
        if (iOrdinal == 1) {
            ordersFullPageErrorState = OrdersFullPageErrorState.NetworkError.d;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ordersFullPageErrorState = OrdersFullPageErrorState.PastOrderNetworkErrorState.d;
        }
        analyticsManager.c(OrdersActions.g);
        return ordersFullPageErrorState;
    }

    public final void r6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new OrdersListViewModel$fetchOrders$1(this, null), 3);
    }

    public final void s6(Integer num) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new OrdersListViewModel$fetchPage$1(this, num, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t6(int r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel.t6(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final List u6() {
        OrderListContract.ViewState viewState = (OrderListContract.ViewState) this.h.e();
        List list = viewState != null ? viewState.b : null;
        return list == null ? EmptyList.d : list;
    }

    public final OrdersFullPageErrorState v6() {
        OrdersTab ordersTab = this.g;
        if (ordersTab == null) {
            Intrinsics.p("ordersTab");
            throw null;
        }
        int iOrdinal = ordersTab.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalStateException("No server error for guest state");
        }
        if (iOrdinal == 1) {
            return OrdersFullPageErrorState.ServerError.d;
        }
        if (iOrdinal == 2) {
            return OrdersFullPageErrorState.PastOrderServerErrorState.d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
