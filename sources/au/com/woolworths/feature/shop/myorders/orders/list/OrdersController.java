package au.com.woolworths.feature.shop.myorders.orders.list;

import androidx.camera.camera2.interop.e;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.feature.shop.myorders.ItemOrderCardTileListSkeletonBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrderCompactCardTileListSkeletonBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrdersCompactBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrdersDeliveryBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrdersPaginationTryAgainBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrdersPickUpBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrdersSeeAllLinkBindingModel_;
import au.com.woolworths.feature.shop.myorders.orders.OrdersClickListener;
import au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions;
import au.com.woolworths.feature.shop.myorders.orders.data.DeliveryOrder;
import au.com.woolworths.feature.shop.myorders.orders.data.PickUpOrder;
import au.com.woolworths.feature.shop.myorders.orders.list.OrderListContract;
import au.com.woolworths.feature.shop.myorders.orders.models.OrderCompactUiModel;
import au.com.woolworths.feature.shop.myorders.orders.models.OrderDeliveryUiModel;
import au.com.woolworths.feature.shop.myorders.orders.models.OrderPickUpUiModel;
import au.com.woolworths.feature.shop.myorders.orders.models.SeeAllLinkUiModel;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrdersController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListItem;", "viewModel", "Lau/com/woolworths/feature/shop/myorders/orders/list/OrdersListViewModel;", "handler", "Lau/com/woolworths/feature/shop/myorders/orders/OrdersClickListener;", "analyticsManager", "Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;", "<init>", "(Lau/com/woolworths/feature/shop/myorders/orders/list/OrdersListViewModel;Lau/com/woolworths/feature/shop/myorders/orders/OrdersClickListener;Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;)V", "buildModels", "", "data", "buildOrderSkeleton", "count", "", "buildFullOrderSkeleton", "buildCompactOrderSkeleton", "trackOrderInsetBanner", "banner", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrdersController extends TypedEpoxyController<List<? extends OrderListItem>> {
    public static final int $stable = 8;
    public static final int TILE_SKELETON_COUNT = 6;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final OrdersClickListener handler;

    @NotNull
    private final OrdersListViewModel viewModel;

    public OrdersController(@NotNull OrdersListViewModel viewModel, @NotNull OrdersClickListener handler, @NotNull AnalyticsManager analyticsManager) {
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(handler, "handler");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.viewModel = viewModel;
        this.handler = handler;
        this.analyticsManager = analyticsManager;
    }

    private final void buildCompactOrderSkeleton(int count) {
        for (int i = 0; i < count; i++) {
            ItemOrderCompactCardTileListSkeletonBindingModel_ itemOrderCompactCardTileListSkeletonBindingModel_ = new ItemOrderCompactCardTileListSkeletonBindingModel_();
            itemOrderCompactCardTileListSkeletonBindingModel_.M("itemOrderCompactCardTileListSkeleton_" + i);
            add(itemOrderCompactCardTileListSkeletonBindingModel_);
        }
    }

    private final void buildFullOrderSkeleton(int count) {
        for (int i = 0; i < count; i++) {
            ItemOrderCardTileListSkeletonBindingModel_ itemOrderCardTileListSkeletonBindingModel_ = new ItemOrderCardTileListSkeletonBindingModel_();
            itemOrderCardTileListSkeletonBindingModel_.M("itemOrderCardTileListSkeleton_" + i);
            add(itemOrderCardTileListSkeletonBindingModel_);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$7$lambda$5$lambda$4(OrdersController ordersController, OrderListItem orderListItem, ItemOrderCompactCardTileListSkeletonBindingModel_ itemOrderCompactCardTileListSkeletonBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        if (i == 0) {
            ordersController.viewModel.s6(Integer.valueOf(((OrderListLoader) orderListItem).f7874a));
        }
    }

    private final void buildOrderSkeleton(int count) {
        OrdersTab ordersTab = this.viewModel.g;
        if (ordersTab == null) {
            Intrinsics.p("ordersTab");
            throw null;
        }
        if (ordersTab == OrdersTab.g) {
            buildCompactOrderSkeleton(count);
        } else {
            buildFullOrderSkeleton(count);
        }
    }

    private final void trackOrderInsetBanner(InsetBannerApiData banner) {
        this.analyticsManager.j(OrdersActions.l, TrackingMetadata.Companion.a(TrackableValue.C0, banner.getMessage()));
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull List<? extends OrderListItem> data) {
        Intrinsics.h(data, "data");
        OrderListContract.ViewState viewState = (OrderListContract.ViewState) this.viewModel.i.e();
        if (viewState != null && viewState.f7873a && data.isEmpty()) {
            buildOrderSkeleton(6);
            return;
        }
        for (OrderListItem orderListItem : data) {
            if (orderListItem instanceof OrderDeliveryUiModel) {
                ItemOrdersDeliveryBindingModel_ itemOrdersDeliveryBindingModel_ = new ItemOrdersDeliveryBindingModel_();
                DeliveryOrder deliveryOrder = ((OrderDeliveryUiModel) orderListItem).f7880a;
                itemOrdersDeliveryBindingModel_.M("orders_delivery_".concat(deliveryOrder.d));
                itemOrdersDeliveryBindingModel_.t();
                itemOrdersDeliveryBindingModel_.n = deliveryOrder;
                OrdersClickListener ordersClickListener = this.handler;
                itemOrdersDeliveryBindingModel_.t();
                itemOrdersDeliveryBindingModel_.o = ordersClickListener;
                add(itemOrdersDeliveryBindingModel_);
            } else if (orderListItem instanceof OrderPickUpUiModel) {
                ItemOrdersPickUpBindingModel_ itemOrdersPickUpBindingModel_ = new ItemOrdersPickUpBindingModel_();
                PickUpOrder pickUpOrder = ((OrderPickUpUiModel) orderListItem).f7881a;
                itemOrdersPickUpBindingModel_.M("orders_pick_up_".concat(pickUpOrder.d));
                itemOrdersPickUpBindingModel_.t();
                itemOrdersPickUpBindingModel_.n = pickUpOrder;
                OrdersClickListener ordersClickListener2 = this.handler;
                itemOrdersPickUpBindingModel_.t();
                itemOrdersPickUpBindingModel_.o = ordersClickListener2;
                add(itemOrdersPickUpBindingModel_);
            } else if (orderListItem instanceof OrderCompactUiModel) {
                ItemOrdersCompactBindingModel_ itemOrdersCompactBindingModel_ = new ItemOrdersCompactBindingModel_();
                OrderCompactUiModel orderCompactUiModel = (OrderCompactUiModel) orderListItem;
                itemOrdersCompactBindingModel_.M(orderCompactUiModel.f7879a);
                itemOrdersCompactBindingModel_.t();
                itemOrdersCompactBindingModel_.n = orderCompactUiModel;
                OrdersListViewModel ordersListViewModel = this.viewModel;
                itemOrdersCompactBindingModel_.t();
                itemOrdersCompactBindingModel_.o = ordersListViewModel;
                add(itemOrdersCompactBindingModel_);
            } else if (Intrinsics.c(orderListItem, SeeAllLinkUiModel.f7882a)) {
                ItemOrdersSeeAllLinkBindingModel_ itemOrdersSeeAllLinkBindingModel_ = new ItemOrdersSeeAllLinkBindingModel_();
                itemOrdersSeeAllLinkBindingModel_.M();
                OrdersListViewModel ordersListViewModel2 = this.viewModel;
                itemOrdersSeeAllLinkBindingModel_.t();
                itemOrdersSeeAllLinkBindingModel_.n = ordersListViewModel2;
                add(itemOrdersSeeAllLinkBindingModel_);
            } else if (orderListItem instanceof OrderListLoader) {
                ItemOrderCompactCardTileListSkeletonBindingModel_ itemOrderCompactCardTileListSkeletonBindingModel_ = new ItemOrderCompactCardTileListSkeletonBindingModel_();
                itemOrderCompactCardTileListSkeletonBindingModel_.q("orders_progress_compact", orderListItem + ".nextPage");
                e eVar = new e(25, this, (OrderListLoader) orderListItem);
                itemOrderCompactCardTileListSkeletonBindingModel_.t();
                itemOrderCompactCardTileListSkeletonBindingModel_.n = eVar;
                add(itemOrderCompactCardTileListSkeletonBindingModel_);
            } else if (orderListItem instanceof OrderListTryAgain) {
                ItemOrdersPaginationTryAgainBindingModel_ itemOrdersPaginationTryAgainBindingModel_ = new ItemOrdersPaginationTryAgainBindingModel_();
                OrderListTryAgain orderListTryAgain = (OrderListTryAgain) orderListItem;
                itemOrdersPaginationTryAgainBindingModel_.q("orders_try_again", String.valueOf(orderListTryAgain.f7875a));
                itemOrdersPaginationTryAgainBindingModel_.t();
                itemOrdersPaginationTryAgainBindingModel_.n = orderListTryAgain;
                OrdersListViewModel ordersListViewModel3 = this.viewModel;
                itemOrdersPaginationTryAgainBindingModel_.t();
                itemOrdersPaginationTryAgainBindingModel_.o = ordersListViewModel3;
                add(itemOrdersPaginationTryAgainBindingModel_);
            }
        }
    }
}
