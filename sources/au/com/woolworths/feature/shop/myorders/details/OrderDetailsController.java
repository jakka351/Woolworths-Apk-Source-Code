package au.com.woolworths.feature.shop.myorders.details;

import android.webkit.URLUtil;
import androidx.annotation.AttrRes;
import androidx.annotation.FontRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.constraintlayout.core.state.a;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsExtraContent;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.orderdetails.OrderDetailsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.android.onesite.epoxy.CarouselWithSnapEpoxyModel;
import au.com.woolworths.android.onesite.epoxy.ItemSpacerEpoxyModel;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.FeedData;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.banners.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.feature.shop.myorders.ItemCurrentDeliveryOrderOverviewBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemCurrentPickupOrderOverviewBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemDeliveryInstructionsBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemDividerDeprecatedBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrderDetailsFooterMessageBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrderDetailsHorizontalDividerBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrderDetailsItemBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrderDetailsProductBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrderDetailsRefundHorizontalDividerBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrderHorizontalListTileHeaderBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrderOverviewBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemPaymentItemBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemPaymentSummaryDividerBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemSectionTitleBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemSubtotalTitleBindingModel_;
import au.com.woolworths.feature.shop.myorders.MyOrdersFeature;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemCurrentPickupOrderOverviewBinding;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions;
import au.com.woolworths.feature.shop.myorders.details.epoxy.OrderDetailsHorizontalListGroup;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentDeliveryOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupLocationTrackingStatus;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupOrderFulfilmentDetails;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryInstructionsData;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryMethodsTooltip;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryOrderFulfilmentDetails;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRating;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionDetails;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionParkingDetails;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsDeliveryDriverInfo;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsDividerData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsItemData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsProductCardData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderNumberDetails;
import au.com.woolworths.feature.shop.myorders.details.models.OrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsItemAmountStyle;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsItemData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderProofOfDeliveryDetailsData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderStoreDetails;
import au.com.woolworths.feature.shop.myorders.details.models.OrderSummaryData;
import au.com.woolworths.feature.shop.myorders.details.models.PastPickupOrderFulfilmentDetails;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.CurrentDeliveryOrderOverviewItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.CurrentPickupOrderOverviewItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.DriverRatingSectionItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.LocationTrackingStatusItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderCollectionDetailsItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderDetailFulfilmentData;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderDetailsDeliveryDriverInfoItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderHorizontalListItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderNumberDetailsItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderProofOfDeliveryDetailsItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderStoreDetailsItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.P2PLiveTrackingMapItemKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.PickupOrderFulfilmentDetailsItemKt;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.ComposeInteropKt;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u00020\u001bH\u0002J\f\u0010\u001c\u001a\u00020\u0013*\u00020\u001bH\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u00020\u001dH\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u00020\u001eH\u0002J(\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\f\u0010'\u001a\u00020\u0013*\u00020(H\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u00020&H\u0002J\u0018\u0010\u001a\u001a\u00020\u0013*\u00020)2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002J\f\u0010'\u001a\u00020\u0013*\u00020)H\u0002J\u0018\u0010+\u001a\u00020\u0013*\u00020)2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u00020,H\u0002JA\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020!2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00192\u000e\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010#2\u000e\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010#H\u0002¢\u0006\u0002\u00102J.\u00103\u001a\u00020\u0013*\b\u0012\u0004\u0012\u0002000#2\u0006\u0010.\u001a\u00020!2\b\b\u0003\u00104\u001a\u00020\u00192\b\b\u0003\u00105\u001a\u00020\u0019H\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u000206H\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u000207H\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u000208H\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u000209H\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u00020:H\u0002J\f\u0010'\u001a\u00020\u0013*\u00020:H\u0002J\f\u0010+\u001a\u00020\u0013*\u00020:H\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u00020;H\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u00020<H\u0002J\f\u0010=\u001a\u00020\u0013*\u00020<H\u0002J\f\u0010>\u001a\u00020\u0013*\u00020<H\u0002J\u0014\u0010?\u001a\u00020\u0013*\u00020<2\u0006\u0010@\u001a\u00020!H\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u00020AH\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u00020BH\u0002J\f\u0010\u001a\u001a\u00020\u0013*\u00020CH\u0002J\f\u0010D\u001a\u00020\u0013*\u00020EH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006F²\u0006\n\u0010G\u001a\u00020HX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderSummaryData;", "viewModel", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsViewModel;", "analyticsManager", "Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;", "featureToggleManager", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "<init>", "(Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsViewModel;Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;)V", "value", "", "showPickOrderCollectedState", "getShowPickOrderCollectedState", "()Z", "setShowPickOrderCollectedState", "(Z)V", "buildModels", "", "data", "buildModel", "item", "", "index", "", "createEpoxyItem", "Lau/com/woolworths/feature/shop/myorders/details/models/CurrentPickupOrderFulfilmentDetails;", "createComponent", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderDetailsData;", "Lau/com/woolworths/feature/shop/myorders/details/models/DeliveryOrderFulfilmentDetails;", "createOrderFulfilmentDetailsItem", "title", "", "items", "", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderDetailsItemData;", "deliveryInstructions", "Lau/com/woolworths/feature/shop/myorders/details/models/DeliveryInstructionsData;", "createComponentItem", "Lau/com/woolworths/feature/shop/myorders/details/models/PastPickupOrderFulfilmentDetails;", "Lau/com/woolworths/android/onesite/data/HorizontalListData;", "controller", "createLegacyEpoxyItem", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderPaymentDetailsData;", "createSubtotalSection", "idKey", "subtotal", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderPaymentDetailsItemData;", "discounts", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "createEpoxyItems", "typefaceRes", "amountColorRes", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderCollectionDetails;", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderStoreDetails;", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderOverview;", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderDetailsDeliveryDriverInfo;", "Lau/com/woolworths/feature/shop/myorders/details/models/CurrentPickupOrderOverview;", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderNumberDetails;", "Lau/com/woolworths/feature/shop/myorders/details/models/CurrentDeliveryOrderOverview;", "createLegacyCurrentDeliveryOrderOverview", "createUpliftCurrentDeliveryOrderOverview", "createP2PLiveTrackingMap", "liveTrackingMapUrl", "Lau/com/woolworths/feature/shop/myorders/details/models/CurrentPickupLocationTrackingStatus;", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderProofOfDeliveryDetailsData;", "Lau/com/woolworths/feature/shop/myorders/details/models/DriverRating;", "trackOrderStatusBannerImpression", "Lau/com/woolworths/analytics/model/AnalyticsData;", "my-orders_release", "driverRatingState", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderDetailsController extends TypedEpoxyController<OrderSummaryData> {
    public static final int $stable = 8;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final FeatureToggleManager featureToggleManager;
    private boolean showPickOrderCollectedState;

    @NotNull
    private final OrderDetailsViewModel viewModel;

    public OrderDetailsController(@NotNull OrderDetailsViewModel viewModel, @NotNull AnalyticsManager analyticsManager, @NotNull FeatureToggleManager featureToggleManager) {
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.viewModel = viewModel;
        this.analyticsManager = analyticsManager;
        this.featureToggleManager = featureToggleManager;
    }

    private final void buildModel(Object item, int index) {
        if (item instanceof OrderDetailsDividerData) {
            ItemDividerDeprecatedBindingModel_ itemDividerDeprecatedBindingModel_ = new ItemDividerDeprecatedBindingModel_();
            itemDividerDeprecatedBindingModel_.M("order-divider-" + index);
            add(itemDividerDeprecatedBindingModel_);
            return;
        }
        if (item instanceof OrderDetailsData) {
            createEpoxyItem((OrderDetailsData) item);
            return;
        }
        if (item instanceof DeliveryOrderFulfilmentDetails) {
            createEpoxyItem((DeliveryOrderFulfilmentDetails) item);
            return;
        }
        if (item instanceof PastPickupOrderFulfilmentDetails) {
            createComponentItem((PastPickupOrderFulfilmentDetails) item);
            return;
        }
        if (item instanceof DeliveryInstructionsData) {
            createEpoxyItem((DeliveryInstructionsData) item);
            return;
        }
        if (item instanceof HorizontalListData) {
            createEpoxyItem((HorizontalListData) item, this);
            return;
        }
        if (item instanceof OrderPaymentDetailsData) {
            createEpoxyItem((OrderPaymentDetailsData) item);
            return;
        }
        if (item instanceof OrderCollectionDetails) {
            createEpoxyItem((OrderCollectionDetails) item);
            return;
        }
        if (item instanceof OrderStoreDetails) {
            createEpoxyItem((OrderStoreDetails) item);
            return;
        }
        if (item instanceof OrderOverview) {
            createEpoxyItem((OrderOverview) item);
            return;
        }
        if (item instanceof CurrentPickupOrderOverview) {
            createEpoxyItem((CurrentPickupOrderOverview) item);
            return;
        }
        if (item instanceof OrderNumberDetails) {
            createEpoxyItem((OrderNumberDetails) item);
            return;
        }
        if (item instanceof CurrentDeliveryOrderOverview) {
            createEpoxyItem((CurrentDeliveryOrderOverview) item);
            return;
        }
        if (item instanceof CurrentPickupOrderFulfilmentDetails) {
            createEpoxyItem((CurrentPickupOrderFulfilmentDetails) item);
            return;
        }
        if (item instanceof OrderDetailsDeliveryDriverInfo) {
            createEpoxyItem((OrderDetailsDeliveryDriverInfo) item);
            return;
        }
        if (item instanceof CurrentPickupLocationTrackingStatus) {
            createEpoxyItem((CurrentPickupLocationTrackingStatus) item);
        } else if (item instanceof OrderProofOfDeliveryDetailsData) {
            createEpoxyItem((OrderProofOfDeliveryDetailsData) item);
        } else if (item instanceof DriverRating) {
            createEpoxyItem((DriverRating) item);
        }
    }

    private final void createComponent(final CurrentPickupOrderFulfilmentDetails currentPickupOrderFulfilmentDetails) {
        ComposeInteropKt.a(this, "order_store_details_item", new Object[]{currentPickupOrderFulfilmentDetails}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createComponent.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final CurrentPickupOrderFulfilmentDetails currentPickupOrderFulfilmentDetails2 = currentPickupOrderFulfilmentDetails;
                    final OrderDetailsController orderDetailsController = this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(720724401, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createComponent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final CurrentPickupOrderFulfilmentDetails currentPickupOrderFulfilmentDetails3 = currentPickupOrderFulfilmentDetails2;
                                String str = currentPickupOrderFulfilmentDetails3.f7750a.f7769a;
                                OrderCollectionDetails orderCollectionDetails = currentPickupOrderFulfilmentDetails3.b;
                                String str2 = orderCollectionDetails.c;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String str3 = orderCollectionDetails.b;
                                ImageVector imageVector = CoreTheme.e(composer2).e.n;
                                composer2.o(-1633490746);
                                boolean zI = composer2.I(currentPickupOrderFulfilmentDetails3);
                                final OrderDetailsController orderDetailsController2 = orderDetailsController;
                                boolean zI2 = zI | composer2.I(orderDetailsController2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI2 || objG == composer$Companion$Empty$1) {
                                    final int i = 0;
                                    objG = new Function0() { // from class: au.com.woolworths.feature.shop.myorders.details.c
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i) {
                                                case 0:
                                                    OrderCollectionParkingDetails orderCollectionParkingDetails = currentPickupOrderFulfilmentDetails3.b.d;
                                                    if (orderCollectionParkingDetails != null) {
                                                        orderDetailsController2.viewModel.A4(orderCollectionParkingDetails);
                                                    }
                                                    break;
                                                default:
                                                    String str4 = currentPickupOrderFulfilmentDetails3.f7750a.c;
                                                    if (str4 != null) {
                                                        orderDetailsController2.viewModel.R3(str4);
                                                    }
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG);
                                }
                                composer2.l();
                                OrderDetailFulfilmentData orderDetailFulfilmentData = new OrderDetailFulfilmentData(str2, str3, imageVector, (Function0) objG);
                                String strC = StringResources_androidKt.c(composer2, R.string.order_details_store_location_get_directions);
                                String str4 = currentPickupOrderFulfilmentDetails3.f7750a.b;
                                ImageVector imageVector2 = CoreTheme.e(composer2).d.i;
                                composer2.o(-1633490746);
                                boolean zI3 = composer2.I(currentPickupOrderFulfilmentDetails3) | composer2.I(orderDetailsController2);
                                Object objG2 = composer2.G();
                                if (zI3 || objG2 == composer$Companion$Empty$1) {
                                    final int i2 = 1;
                                    objG2 = new Function0() { // from class: au.com.woolworths.feature.shop.myorders.details.c
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i2) {
                                                case 0:
                                                    OrderCollectionParkingDetails orderCollectionParkingDetails = currentPickupOrderFulfilmentDetails3.b.d;
                                                    if (orderCollectionParkingDetails != null) {
                                                        orderDetailsController2.viewModel.A4(orderCollectionParkingDetails);
                                                    }
                                                    break;
                                                default:
                                                    String str42 = currentPickupOrderFulfilmentDetails3.f7750a.c;
                                                    if (str42 != null) {
                                                        orderDetailsController2.viewModel.R3(str42);
                                                    }
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                PickupOrderFulfilmentDetailsItemKt.a(str, CollectionsKt.R(orderDetailFulfilmentData, new OrderDetailFulfilmentData(strC, str4, imageVector2, (Function0) objG2)), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -604365995));
    }

    private final void createComponentItem(final PastPickupOrderFulfilmentDetails pastPickupOrderFulfilmentDetails) {
        ComposeInteropKt.a(this, "past-pickup-order-fulfilment-details", new Object[]{pastPickupOrderFulfilmentDetails}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createComponentItem.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final PastPickupOrderFulfilmentDetails pastPickupOrderFulfilmentDetails2 = pastPickupOrderFulfilmentDetails;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(75654651, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createComponentItem.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                PastPickupOrderFulfilmentDetails pastPickupOrderFulfilmentDetails3 = pastPickupOrderFulfilmentDetails2;
                                String str = pastPickupOrderFulfilmentDetails3.f7772a;
                                composer2.o(-310320169);
                                ArrayList<OrderDetailsItemData> arrayList = pastPickupOrderFulfilmentDetails3.b;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
                                for (OrderDetailsItemData orderDetailsItemData : arrayList) {
                                    String str2 = orderDetailsItemData.f7765a;
                                    String str3 = orderDetailsItemData.b;
                                    composer2.o(1849434622);
                                    Object objG = composer2.G();
                                    if (objG == Composer.Companion.f1624a) {
                                        objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    arrayList2.add(new OrderDetailFulfilmentData(str2, str3, null, (Function0) objG));
                                }
                                composer2.l();
                                PickupOrderFulfilmentDetailsItemKt.a(str, arrayList2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1947525335));
    }

    private final void createEpoxyItem(DeliveryOrderFulfilmentDetails deliveryOrderFulfilmentDetails) {
        createOrderFulfilmentDetailsItem(deliveryOrderFulfilmentDetails.f7753a, deliveryOrderFulfilmentDetails.b, deliveryOrderFulfilmentDetails.c);
    }

    private static final Unit createEpoxyItem$lambda$10(DeliveryInstructionsData deliveryInstructionsData, ItemSpacerEpoxyModel itemSpacer) {
        Intrinsics.h(itemSpacer, "$this$itemSpacer");
        itemSpacer.p("delivery-instructions-bottom-spacer");
        if (deliveryInstructionsData.e) {
            itemSpacer.D(R.dimen.one_and_half_padding);
        } else {
            itemSpacer.D(R.dimen.three_quarter_default_padding);
        }
        return Unit.f24250a;
    }

    private static final Unit createEpoxyItem$lambda$15(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "payment-summary-top-spacer", R.dimen.one_and_half_padding);
        return Unit.f24250a;
    }

    private static final Unit createEpoxyItem$lambda$22(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "payment-summary-bottom-spacer", R.dimen.one_and_half_padding);
        return Unit.f24250a;
    }

    private static final Unit createEpoxyItem$lambda$28(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "item_order_overview_top_spacer", R.dimen.one_and_half_padding);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createEpoxyItem$lambda$33$lambda$32(OrderOverview orderOverview, OrderDetailsController orderDetailsController, ItemOrderOverviewBindingModel_ itemOrderOverviewBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        InsetBannerApiData insetBannerApiData = orderOverview.f7767a;
        if (insetBannerApiData != null) {
            orderDetailsController.analyticsManager.j(OrderDetailsActions.J, TrackingMetadata.Companion.a(TrackableValue.o0, insetBannerApiData.getMessage()));
        }
        if (orderOverview.e != null) {
            orderDetailsController.analyticsManager.c(OrderDetailsActions.i);
        }
        if (orderOverview.f != null) {
            orderDetailsController.analyticsManager.c(OrderDetailsActions.f);
        }
    }

    private static final Unit createEpoxyItem$lambda$34(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "item_order_overview_bottom_spacer", R.dimen.one_and_half_padding);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createEpoxyItem$lambda$9$lambda$8(DeliveryInstructionsData deliveryInstructionsData, OrderDetailsController orderDetailsController, ItemDeliveryInstructionsBindingModel_ itemDeliveryInstructionsBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        if (deliveryInstructionsData.g) {
            orderDetailsController.analyticsManager.c(OrderDetailsActions.w);
        } else {
            orderDetailsController.analyticsManager.c(OrderDetailsActions.v);
        }
    }

    private final void createEpoxyItems(List<OrderPaymentDetailsItemData> list, String str, @FontRes int i, @AttrRes int i2) {
        for (OrderPaymentDetailsItemData orderPaymentDetailsItemData : list) {
            ItemPaymentItemBindingModel_ itemPaymentItemBindingModel_ = new ItemPaymentItemBindingModel_();
            itemPaymentItemBindingModel_.q("item-label", str, orderPaymentDetailsItemData.d);
            itemPaymentItemBindingModel_.t();
            itemPaymentItemBindingModel_.n = orderPaymentDetailsItemData;
            itemPaymentItemBindingModel_.t();
            itemPaymentItemBindingModel_.p = i;
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = orderPaymentDetailsItemData.h;
            int i3 = orderPaymentDetailsItemAmountStyle != null ? orderPaymentDetailsItemAmountStyle.d : i2;
            itemPaymentItemBindingModel_.t();
            itemPaymentItemBindingModel_.o = i3;
            add(itemPaymentItemBindingModel_);
        }
    }

    public static /* synthetic */ void createEpoxyItems$default(OrderDetailsController orderDetailsController, List list, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = R.font.roboto_regular;
        }
        if ((i3 & 4) != 0) {
            i2 = android.R.attr.textColorPrimary;
        }
        orderDetailsController.createEpoxyItems(list, str, i, i2);
    }

    private final void createLegacyCurrentDeliveryOrderOverview(CurrentDeliveryOrderOverview currentDeliveryOrderOverview) {
        List list = currentDeliveryOrderOverview.f7748a;
        String str = currentDeliveryOrderOverview.l;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            final InsetBannerApiData insetBannerApiData = (InsetBannerApiData) obj;
            if (i > 0) {
                ItemSpacerEpoxyModel itemSpacerEpoxyModel = new ItemSpacerEpoxyModel(R.layout.item_spacer);
                createLegacyCurrentDeliveryOrderOverview$lambda$45$lambda$44(i, itemSpacerEpoxyModel);
                add(itemSpacerEpoxyModel);
            }
            ComposeInteropKt.a(this, YU.a.A("banner_", insetBannerApiData.getMessage()), new Object[]{currentDeliveryOrderOverview}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController$createLegacyCurrentDeliveryOrderOverview$1$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final InsetBannerApiData insetBannerApiData2 = insetBannerApiData;
                        final OrderDetailsController orderDetailsController = this;
                        ThemeKt.b(6, composer, ComposableLambdaKt.c(1739804650, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController$createLegacyCurrentDeliveryOrderOverview$1$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer2 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    InsetBannerApiData insetBannerApiData3 = insetBannerApiData2;
                                    InsetBannerData uiModel = InsetBannerApiDataExtKt.toUiModel(insetBannerApiData3);
                                    composer2.o(1849434622);
                                    Object objG = composer2.G();
                                    if (objG == Composer.Companion.f1624a) {
                                        objG = new au.com.woolworths.feature.shop.modeselector.ui.c(7);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    InsetBannerUiKt.b(uiModel, null, false, (Function1) objG, composer2, 24576, 14);
                                    AnalyticsData analytics = insetBannerApiData3.getAnalytics();
                                    if (analytics != null) {
                                        orderDetailsController.trackOrderStatusBannerImpression(analytics);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, -1342499022));
            i = i2;
        }
        if (str != null && URLUtil.isValidUrl(str)) {
            createP2PLiveTrackingMap(currentDeliveryOrderOverview, str);
        }
        ItemCurrentDeliveryOrderOverviewBindingModel_ itemCurrentDeliveryOrderOverviewBindingModel_ = new ItemCurrentDeliveryOrderOverviewBindingModel_();
        itemCurrentDeliveryOrderOverviewBindingModel_.M();
        itemCurrentDeliveryOrderOverviewBindingModel_.t();
        itemCurrentDeliveryOrderOverviewBindingModel_.o = currentDeliveryOrderOverview;
        OrderDetailsViewModel orderDetailsViewModel = this.viewModel;
        itemCurrentDeliveryOrderOverviewBindingModel_.t();
        itemCurrentDeliveryOrderOverviewBindingModel_.p = orderDetailsViewModel;
        h hVar = new h(this, 2);
        itemCurrentDeliveryOrderOverviewBindingModel_.t();
        itemCurrentDeliveryOrderOverviewBindingModel_.q = hVar;
        androidx.camera.camera2.interop.e eVar = new androidx.camera.camera2.interop.e(20, currentDeliveryOrderOverview, this);
        itemCurrentDeliveryOrderOverviewBindingModel_.t();
        itemCurrentDeliveryOrderOverviewBindingModel_.n = eVar;
        add(itemCurrentDeliveryOrderOverviewBindingModel_);
    }

    private static final Unit createLegacyCurrentDeliveryOrderOverview$lambda$45$lambda$44(int i, ItemSpacerEpoxyModel itemSpacer) {
        Intrinsics.h(itemSpacer, "$this$itemSpacer");
        itemSpacer.p("banner_" + i + "_top_spacer");
        itemSpacer.D(R.dimen.half_default_padding);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createLegacyCurrentDeliveryOrderOverview$lambda$50$lambda$46(OrderDetailsController orderDetailsController, StepsToolTip stepsToolTip) {
        orderDetailsController.viewModel.x6(stepsToolTip);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createLegacyCurrentDeliveryOrderOverview$lambda$50$lambda$49(CurrentDeliveryOrderOverview currentDeliveryOrderOverview, OrderDetailsController orderDetailsController, ItemCurrentDeliveryOrderOverviewBindingModel_ itemCurrentDeliveryOrderOverviewBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        if (currentDeliveryOrderOverview.g != null) {
            orderDetailsController.analyticsManager.c(OrderDetailsActions.i);
        }
        if (currentDeliveryOrderOverview.h != null) {
            orderDetailsController.analyticsManager.c(OrderDetailsActions.f);
        }
    }

    private final void createLegacyEpoxyItem(HorizontalListData horizontalListData, TypedEpoxyController<?> typedEpoxyController) {
        ItemOrderDetailsProductBindingModel_ itemOrderDetailsProductBindingModel_;
        ItemSpacerEpoxyModel itemSpacerEpoxyModel = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        createLegacyEpoxyItem$lambda$11(itemSpacerEpoxyModel);
        add(itemSpacerEpoxyModel);
        List<Object> items = horizontalListData.getH();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof OrderDetailsProductCardData) {
                itemOrderDetailsProductBindingModel_ = new ItemOrderDetailsProductBindingModel_();
                OrderDetailsProductCardData orderDetailsProductCardData = (OrderDetailsProductCardData) obj;
                itemOrderDetailsProductBindingModel_.M("order-product-" + orderDetailsProductCardData.d);
                itemOrderDetailsProductBindingModel_.t();
                itemOrderDetailsProductBindingModel_.n = orderDetailsProductCardData;
                OrderDetailsViewModel orderDetailsViewModel = this.viewModel;
                itemOrderDetailsProductBindingModel_.t();
                itemOrderDetailsProductBindingModel_.o = orderDetailsViewModel;
            } else {
                itemOrderDetailsProductBindingModel_ = null;
            }
            if (itemOrderDetailsProductBindingModel_ != null) {
                arrayList.add(itemOrderDetailsProductBindingModel_);
            }
        }
        OrderDetailsViewModel clickHandler = this.viewModel;
        h hVar = new h(this, 4);
        h hVar2 = new h(this, 5);
        Intrinsics.h(clickHandler, "clickHandler");
        ItemOrderHorizontalListTileHeaderBindingModel_ itemOrderHorizontalListTileHeaderBindingModel_ = new ItemOrderHorizontalListTileHeaderBindingModel_();
        itemOrderHorizontalListTileHeaderBindingModel_.M();
        itemOrderHorizontalListTileHeaderBindingModel_.t();
        itemOrderHorizontalListTileHeaderBindingModel_.o = horizontalListData;
        itemOrderHorizontalListTileHeaderBindingModel_.t();
        itemOrderHorizontalListTileHeaderBindingModel_.p = clickHandler;
        au.com.woolworths.feature.shop.myorders.details.epoxy.a aVar = new au.com.woolworths.feature.shop.myorders.details.epoxy.a(horizontalListData, hVar, hVar2);
        itemOrderHorizontalListTileHeaderBindingModel_.t();
        itemOrderHorizontalListTileHeaderBindingModel_.n = aVar;
        CarouselWithSnapEpoxyModel carouselWithSnapEpoxyModel = new CarouselWithSnapEpoxyModel();
        carouselWithSnapEpoxyModel.E("horizontal-list-carousel");
        carouselWithSnapEpoxyModel.G(new Carousel.Padding(R.dimen.half_default_padding, R.dimen.one_and_half_padding, R.dimen.half_default_padding));
        carouselWithSnapEpoxyModel.F(arrayList);
        typedEpoxyController.addInternal(new OrderDetailsHorizontalListGroup(R.layout.item_horizontal_list_tile, CollectionsKt.R(itemOrderHorizontalListTileHeaderBindingModel_, carouselWithSnapEpoxyModel)));
    }

    private static final Unit createLegacyEpoxyItem$lambda$11(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "order-product-top-spacer", R.dimen.one_and_half_padding);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createLegacyEpoxyItem$lambda$13(OrderDetailsController orderDetailsController, final String eventLabel) {
        Intrinsics.h(eventLabel, "eventLabel");
        OrderDetailsViewModel orderDetailsViewModel = orderDetailsController.viewModel;
        orderDetailsViewModel.getClass();
        orderDetailsViewModel.u.f(new OrderDetailsContract.Actions.OpenMyGroceriesActivity(String.valueOf(orderDetailsViewModel.A)));
        AnalyticsManager analyticsManager = orderDetailsViewModel.i;
        OrderDetailsAnalytics.MyOrders.Action.d.getClass();
        analyticsManager.g(new Event(eventLabel) { // from class: au.com.woolworths.analytics.supers.orderdetails.OrderDetailsAnalytics$MyOrders$Action$Companion$oosBannerClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(OrderDetailsAnalytics.MyOrders.f);
                spreadBuilder.a(new Pair("event.Category", "button"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                a.y("event.Label", eventLabel, spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "button_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createLegacyEpoxyItem$lambda$14(OrderDetailsController orderDetailsController, final String eventLabel) {
        Intrinsics.h(eventLabel, "eventLabel");
        AnalyticsManager analyticsManager = orderDetailsController.analyticsManager;
        OrderDetailsAnalytics.MyOrders.Action.d.getClass();
        analyticsManager.g(new Event(eventLabel) { // from class: au.com.woolworths.analytics.supers.orderdetails.OrderDetailsAnalytics$MyOrders$Action$Companion$oosBannerImpression$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(OrderDetailsAnalytics.MyOrders.f);
                spreadBuilder.a(new Pair("event.Category", "banner"));
                spreadBuilder.a(new Pair("event.Action", "impression"));
                a.y("event.Label", eventLabel, spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "banner_impression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "banner_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createLegacyEpoxyItem$lambda$42$lambda$35(OrderDetailsController orderDetailsController, StepsToolTip stepsToolTip) {
        orderDetailsController.viewModel.x6(stepsToolTip);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createLegacyEpoxyItem$lambda$42$lambda$41(CurrentPickupOrderOverview currentPickupOrderOverview, OrderDetailsController orderDetailsController, ItemCurrentPickupOrderOverviewBindingModel_ itemCurrentPickupOrderOverviewBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ComposeView composeView;
        ButtonApiData buttonApiData = currentPickupOrderOverview.g;
        final BroadcastBannerData broadcastBannerData = currentPickupOrderOverview.q;
        if (buttonApiData != null) {
            orderDetailsController.analyticsManager.c(OrderDetailsActions.i);
        }
        if (currentPickupOrderOverview.h != null) {
            orderDetailsController.analyticsManager.c(OrderDetailsActions.f);
        }
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        EpoxyItemCurrentPickupOrderOverviewBinding epoxyItemCurrentPickupOrderOverviewBinding = viewDataBinding instanceof EpoxyItemCurrentPickupOrderOverviewBinding ? (EpoxyItemCurrentPickupOrderOverviewBinding) viewDataBinding : null;
        if (epoxyItemCurrentPickupOrderOverviewBinding != null && (composeView = epoxyItemCurrentPickupOrderOverviewBinding.K) != null && broadcastBannerData != null) {
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController$createLegacyEpoxyItem$4$2$3$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final BroadcastBannerData broadcastBannerData2 = broadcastBannerData;
                        ThemeKt.b(6, composer, ComposableLambdaKt.c(2058037831, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController$createLegacyEpoxyItem$4$2$3$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    composer2.o(1849434622);
                                    Object objG = composer2.G();
                                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                    if (objG == composer$Companion$Empty$1) {
                                        objG = new au.com.woolworths.feature.shop.modeselector.ui.c(8);
                                        composer2.A(objG);
                                    }
                                    Function1 function1 = (Function1) objG;
                                    Object objE = au.com.woolworths.android.onesite.a.e(composer2, 1849434622);
                                    if (objE == composer$Companion$Empty$1) {
                                        objE = new au.com.woolworths.feature.shop.modeselector.ui.c(9);
                                        composer2.A(objE);
                                    }
                                    composer2.l();
                                    BroadcastBannerKt.a(broadcastBannerData2, function1, (Function1) objE, null, null, composer2, 432, 24);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 1993541519));
        }
        if (broadcastBannerData != null) {
            orderDetailsController.analyticsManager.c(OrderDetailsActions.T);
        }
    }

    private static final Unit createLegacyEpoxyItem$lambda$43(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "item_current_pickup_order_overview_bottom_spacer", R.dimen.one_and_half_padding);
        return Unit.f24250a;
    }

    private final void createOrderFulfilmentDetailsItem(String title, List<OrderDetailsItemData> items, DeliveryInstructionsData deliveryInstructions) {
        ItemSpacerEpoxyModel itemSpacerEpoxyModel = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        createOrderFulfilmentDetailsItem$lambda$2(itemSpacerEpoxyModel);
        add(itemSpacerEpoxyModel);
        ItemSectionTitleBindingModel_ itemSectionTitleBindingModel_ = new ItemSectionTitleBindingModel_();
        itemSectionTitleBindingModel_.M("order-details-title");
        PlainText plainText = new PlainText(title);
        itemSectionTitleBindingModel_.t();
        itemSectionTitleBindingModel_.n = plainText;
        add(itemSectionTitleBindingModel_);
        int size = items.size() - 1;
        int i = 0;
        for (Object obj : items) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            OrderDetailsItemData orderDetailsItemData = (OrderDetailsItemData) obj;
            ItemOrderDetailsItemBindingModel_ itemOrderDetailsItemBindingModel_ = new ItemOrderDetailsItemBindingModel_();
            itemOrderDetailsItemBindingModel_.M("order-details-" + orderDetailsItemData.f7765a + i);
            itemOrderDetailsItemBindingModel_.t();
            itemOrderDetailsItemBindingModel_.n = orderDetailsItemData;
            add(itemOrderDetailsItemBindingModel_);
            if (i < size) {
                ItemOrderDetailsHorizontalDividerBindingModel_ itemOrderDetailsHorizontalDividerBindingModel_ = new ItemOrderDetailsHorizontalDividerBindingModel_();
                itemOrderDetailsHorizontalDividerBindingModel_.M("order-detail-divider-" + i);
                add(itemOrderDetailsHorizontalDividerBindingModel_);
            }
            i = i2;
        }
        ItemSpacerEpoxyModel itemSpacerEpoxyModel2 = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        createOrderFulfilmentDetailsItem$lambda$7(itemSpacerEpoxyModel2);
        add(itemSpacerEpoxyModel2);
        if (deliveryInstructions != null) {
            createEpoxyItem(deliveryInstructions);
        }
    }

    private static final Unit createOrderFulfilmentDetailsItem$lambda$2(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "order-details-top-spacer", R.dimen.one_and_half_padding);
        return Unit.f24250a;
    }

    private static final Unit createOrderFulfilmentDetailsItem$lambda$7(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "order-details-bottom-spacer", R.dimen.default_padding);
        return Unit.f24250a;
    }

    private final void createP2PLiveTrackingMap(CurrentDeliveryOrderOverview currentDeliveryOrderOverview, final String str) {
        this.viewModel.u.f(OrderDetailsContract.Actions.ScrollToTop.f7656a);
        ComposeInteropKt.a(this, "p2p_live_tracking_map", new Object[]{currentDeliveryOrderOverview}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createP2PLiveTrackingMap.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final String str2 = str;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-705358167, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createP2PLiveTrackingMap.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                P2PLiveTrackingMapItemKt.a(0, composer2, null, str2);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1291326387));
    }

    private final void createSubtotalSection(String idKey, @StringRes Integer title, List<OrderPaymentDetailsItemData> subtotal, List<OrderPaymentDetailsItemData> discounts) {
        List<OrderPaymentDetailsItemData> list = subtotal;
        if (list != null && !list.isEmpty()) {
            if (title != null) {
                int iIntValue = title.intValue();
                ItemSubtotalTitleBindingModel_ itemSubtotalTitleBindingModel_ = new ItemSubtotalTitleBindingModel_();
                itemSubtotalTitleBindingModel_.M("subtotal-title-" + idKey);
                ResText resText = new ResText(iIntValue);
                itemSubtotalTitleBindingModel_.t();
                itemSubtotalTitleBindingModel_.n = resText;
                add(itemSubtotalTitleBindingModel_);
            }
            createEpoxyItems$default(this, subtotal, idKey, 0, 0, 6, null);
        }
        List<OrderPaymentDetailsItemData> list2 = discounts;
        if (list2 != null && !list2.isEmpty()) {
            createEpoxyItems$default(this, discounts, "discounts", 0, R.attr.colorBrandAlways, 2, null);
        }
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            return;
        }
        ItemPaymentSummaryDividerBindingModel_ itemPaymentSummaryDividerBindingModel_ = new ItemPaymentSummaryDividerBindingModel_();
        itemPaymentSummaryDividerBindingModel_.M("payment-divider-subtotal-" + idKey);
        add(itemPaymentSummaryDividerBindingModel_);
    }

    private final void createUpliftCurrentDeliveryOrderOverview(final CurrentDeliveryOrderOverview currentDeliveryOrderOverview) {
        ComposeInteropKt.a(this, "current_delivery_order_overview", new Object[]{currentDeliveryOrderOverview}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createUpliftCurrentDeliveryOrderOverview.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final CurrentDeliveryOrderOverview currentDeliveryOrderOverview2 = currentDeliveryOrderOverview;
                    final OrderDetailsController orderDetailsController = this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(421578287, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createUpliftCurrentDeliveryOrderOverview.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                OrderDetailsController orderDetailsController2 = orderDetailsController;
                                boolean zI = composer2.I(orderDetailsController2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    objG = new h(orderDetailsController2, 13);
                                    composer2.A(objG);
                                }
                                Function1 function1 = (Function1) objG;
                                boolean zD = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG2 = composer2.G();
                                if (zD || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new h(orderDetailsController2, 14);
                                    composer2.A(objG2);
                                }
                                Function1 function12 = (Function1) objG2;
                                boolean zD2 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG3 = composer2.G();
                                if (zD2 || objG3 == composer$Companion$Empty$1) {
                                    objG3 = new d(orderDetailsController2, 1);
                                    composer2.A(objG3);
                                }
                                Function2 function2 = (Function2) objG3;
                                boolean zD3 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG4 = composer2.G();
                                if (zD3 || objG4 == composer$Companion$Empty$1) {
                                    objG4 = new h(orderDetailsController2, 15);
                                    composer2.A(objG4);
                                }
                                Function1 function13 = (Function1) objG4;
                                boolean zD4 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG5 = composer2.G();
                                if (zD4 || objG5 == composer$Companion$Empty$1) {
                                    objG5 = new f(orderDetailsController2, 5);
                                    composer2.A(objG5);
                                }
                                Function0 function0 = (Function0) objG5;
                                boolean zD5 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG6 = composer2.G();
                                if (zD5 || objG6 == composer$Companion$Empty$1) {
                                    objG6 = new f(orderDetailsController2, 6);
                                    composer2.A(objG6);
                                }
                                composer2.l();
                                CurrentDeliveryOrderOverviewItemKt.c(currentDeliveryOrderOverview2, function1, function12, function2, function13, function0, (Function0) objG6, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -219160877));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackOrderStatusBannerImpression(AnalyticsData analyticsData) {
        String strB;
        final String strG = analyticsData.getEventLabel();
        if (strG == null) {
            strG = "";
        }
        List<AnalyticsExtraContent> listI = analyticsData.getExtraContent();
        if (listI != null) {
            for (AnalyticsExtraContent analyticsExtraContent : listI) {
                if (Intrinsics.c(analyticsExtraContent.getKey(), "trackingPortal.currentStatus")) {
                    strB = analyticsExtraContent.getValue();
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        strB = null;
        final String str = strB != null ? strB : "";
        AnalyticsManager analyticsManager = this.analyticsManager;
        OrderDetailsAnalytics.MyOrders.Action.d.getClass();
        analyticsManager.g(new Event(strG, str) { // from class: au.com.woolworths.analytics.supers.orderdetails.OrderDetailsAnalytics$MyOrders$Action$Companion$orderStatusBannerImpression$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(OrderDetailsAnalytics.MyOrders.f);
                spreadBuilder.a(new Pair("event.Category", "Order details notifications"));
                spreadBuilder.a(new Pair("event.Label", strG));
                a.z("event.Action", "notification_impression", spreadBuilder, "trackingPortal.currentStatus", str);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "order_status_notification_impression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "order_status_notification_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }

    public final boolean getShowPickOrderCollectedState() {
        return this.showPickOrderCollectedState;
    }

    public final void setShowPickOrderCollectedState(boolean z) {
        this.showPickOrderCollectedState = z;
        setData(getCurrentData());
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@Nullable OrderSummaryData data) {
        FeedData feedData;
        List<Object> items;
        if (data == null || (feedData = data.c) == null || (items = feedData.getItems()) == null) {
            return;
        }
        int i = 0;
        for (Object obj : items) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            buildModel(obj, i);
            i = i2;
        }
    }

    private final void createComponentItem(final HorizontalListData horizontalListData) {
        ComposeInteropKt.a(this, "order_product_list", new Object[]{horizontalListData}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createComponentItem.2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final HorizontalListData horizontalListData2 = horizontalListData;
                    final OrderDetailsController orderDetailsController = this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1812745809, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createComponentItem.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(-1633490746);
                                OrderDetailsController orderDetailsController2 = orderDetailsController;
                                boolean zI = composer2.I(orderDetailsController2);
                                HorizontalListData horizontalListData3 = horizontalListData2;
                                boolean zI2 = zI | composer2.I(horizontalListData3);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI2 || objG == composer$Companion$Empty$1) {
                                    objG = new n(23, orderDetailsController2, horizontalListData3);
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                boolean zD = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG2 = composer2.G();
                                if (zD || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new h(orderDetailsController2, 6);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                OrderHorizontalListItemKt.c(horizontalListData3, function0, (Function1) objG2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1962009205));
    }

    private final void createEpoxyItem(OrderDetailsData orderDetailsData) {
        createOrderFulfilmentDetailsItem(orderDetailsData.f7763a, orderDetailsData.b, orderDetailsData.c);
    }

    private final void createComponentItem(final CurrentPickupOrderOverview currentPickupOrderOverview) {
        ComposeInteropKt.a(this, "current_pickup_order_overview", new Object[]{currentPickupOrderOverview}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createComponentItem.3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final CurrentPickupOrderOverview currentPickupOrderOverview2 = currentPickupOrderOverview;
                    final OrderDetailsController orderDetailsController = this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(1207140629, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createComponentItem.3.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                final OrderDetailsController orderDetailsController2 = orderDetailsController;
                                boolean zI = composer2.I(orderDetailsController2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    objG = new h(orderDetailsController2, 7);
                                    composer2.A(objG);
                                }
                                Function1 function1 = (Function1) objG;
                                boolean zD = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG2 = composer2.G();
                                if (zD || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new d(orderDetailsController2, 0);
                                    composer2.A(objG2);
                                }
                                Function2 function2 = (Function2) objG2;
                                boolean zD2 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG3 = composer2.G();
                                if (zD2 || objG3 == composer$Companion$Empty$1) {
                                    objG3 = new h(orderDetailsController2, 8);
                                    composer2.A(objG3);
                                }
                                Function1 function12 = (Function1) objG3;
                                boolean zD3 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, -1633490746, orderDetailsController2);
                                final CurrentPickupOrderOverview currentPickupOrderOverview3 = currentPickupOrderOverview2;
                                boolean zI2 = zD3 | composer2.I(currentPickupOrderOverview3);
                                Object objG4 = composer2.G();
                                if (zI2 || objG4 == composer$Companion$Empty$1) {
                                    final int i = 0;
                                    objG4 = new Function0() { // from class: au.com.woolworths.feature.shop.myorders.details.e
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i) {
                                                case 0:
                                                    OrderDetailsViewModel orderDetailsViewModel = orderDetailsController2.viewModel;
                                                    CurrentPickupOrderOverview currentPickupOrderOverview4 = currentPickupOrderOverview3;
                                                    ButtonApiData buttonApiData = currentPickupOrderOverview4.m;
                                                    orderDetailsViewModel.a5(buttonApiData != null ? buttonApiData.getAction() : null, currentPickupOrderOverview4.n, currentPickupOrderOverview4.o, currentPickupOrderOverview4.p);
                                                    break;
                                                default:
                                                    orderDetailsController2.viewModel.n1(currentPickupOrderOverview3.l);
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG4);
                                }
                                Function0 function0 = (Function0) objG4;
                                boolean zD4 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, -1633490746, orderDetailsController2) | composer2.I(currentPickupOrderOverview3);
                                Object objG5 = composer2.G();
                                if (zD4 || objG5 == composer$Companion$Empty$1) {
                                    final int i2 = 1;
                                    objG5 = new Function0() { // from class: au.com.woolworths.feature.shop.myorders.details.e
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i2) {
                                                case 0:
                                                    OrderDetailsViewModel orderDetailsViewModel = orderDetailsController2.viewModel;
                                                    CurrentPickupOrderOverview currentPickupOrderOverview4 = currentPickupOrderOverview3;
                                                    ButtonApiData buttonApiData = currentPickupOrderOverview4.m;
                                                    orderDetailsViewModel.a5(buttonApiData != null ? buttonApiData.getAction() : null, currentPickupOrderOverview4.n, currentPickupOrderOverview4.o, currentPickupOrderOverview4.p);
                                                    break;
                                                default:
                                                    orderDetailsController2.viewModel.n1(currentPickupOrderOverview3.l);
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG5);
                                }
                                Function0 function02 = (Function0) objG5;
                                boolean zD5 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG6 = composer2.G();
                                if (zD5 || objG6 == composer$Companion$Empty$1) {
                                    objG6 = new f(orderDetailsController2, 0);
                                    composer2.A(objG6);
                                }
                                Function0 function03 = (Function0) objG6;
                                boolean zD6 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG7 = composer2.G();
                                if (zD6 || objG7 == composer$Companion$Empty$1) {
                                    objG7 = new f(orderDetailsController2, 1);
                                    composer2.A(objG7);
                                }
                                Function0 function04 = (Function0) objG7;
                                boolean zD7 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG8 = composer2.G();
                                if (zD7 || objG8 == composer$Companion$Empty$1) {
                                    objG8 = new f(orderDetailsController2, 2);
                                    composer2.A(objG8);
                                }
                                composer2.l();
                                CurrentPickupOrderOverviewItemKt.d(currentPickupOrderOverview2, function1, function2, function12, function0, function02, function03, function04, (Function0) objG8, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1975365391));
    }

    private final void createEpoxyItem(OrderOverview orderOverview) {
        ItemSpacerEpoxyModel itemSpacerEpoxyModel = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        createEpoxyItem$lambda$28(itemSpacerEpoxyModel);
        add(itemSpacerEpoxyModel);
        ItemOrderOverviewBindingModel_ itemOrderOverviewBindingModel_ = new ItemOrderOverviewBindingModel_();
        itemOrderOverviewBindingModel_.M();
        itemOrderOverviewBindingModel_.t();
        itemOrderOverviewBindingModel_.o = orderOverview;
        OrderDetailsViewModel orderDetailsViewModel = this.viewModel;
        itemOrderOverviewBindingModel_.t();
        itemOrderOverviewBindingModel_.p = orderDetailsViewModel;
        OrderDetailsViewModel orderDetailsViewModel2 = this.viewModel;
        itemOrderOverviewBindingModel_.t();
        itemOrderOverviewBindingModel_.q = orderDetailsViewModel2;
        androidx.camera.camera2.interop.e eVar = new androidx.camera.camera2.interop.e(21, orderOverview, this);
        itemOrderOverviewBindingModel_.t();
        itemOrderOverviewBindingModel_.n = eVar;
        add(itemOrderOverviewBindingModel_);
        ItemSpacerEpoxyModel itemSpacerEpoxyModel2 = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        createEpoxyItem$lambda$34(itemSpacerEpoxyModel2);
        add(itemSpacerEpoxyModel2);
    }

    private final void createEpoxyItem(OrderPaymentDetailsData orderPaymentDetailsData) {
        ItemSpacerEpoxyModel itemSpacerEpoxyModel = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        createEpoxyItem$lambda$15(itemSpacerEpoxyModel);
        add(itemSpacerEpoxyModel);
        ItemSectionTitleBindingModel_ itemSectionTitleBindingModel_ = new ItemSectionTitleBindingModel_();
        itemSectionTitleBindingModel_.M("payment-summary-title");
        ResText resText = new ResText(R.string.title_payment_summary);
        itemSectionTitleBindingModel_.t();
        itemSectionTitleBindingModel_.n = resText;
        add(itemSectionTitleBindingModel_);
        List list = orderPaymentDetailsData.g;
        List<OrderPaymentDetailsItemData> list2 = orderPaymentDetailsData.j;
        List list3 = list;
        if (list3 != null && !list3.isEmpty()) {
            createEpoxyItems$default(this, orderPaymentDetailsData.g, "savings-and-rewards", 0, 0, 6, null);
            ItemPaymentSummaryDividerBindingModel_ itemPaymentSummaryDividerBindingModel_ = new ItemPaymentSummaryDividerBindingModel_();
            itemPaymentSummaryDividerBindingModel_.M("payment-divider-savings-and-rewards");
            add(itemPaymentSummaryDividerBindingModel_);
        }
        createSubtotalSection("marketplace", Integer.valueOf(R.string.title_marketplace_subtotal), orderPaymentDetailsData.f, null);
        createSubtotalSection("woolworths", Integer.valueOf(R.string.title_woolworths_subtotal), orderPaymentDetailsData.e, orderPaymentDetailsData.i);
        createEpoxyItems$default(this, orderPaymentDetailsData.d, "total", R.font.roboto_medium, 0, 4, null);
        ItemPaymentSummaryDividerBindingModel_ itemPaymentSummaryDividerBindingModel_2 = new ItemPaymentSummaryDividerBindingModel_();
        itemPaymentSummaryDividerBindingModel_2.M("payment-divider-total");
        add(itemPaymentSummaryDividerBindingModel_2);
        createEpoxyItems$default(this, orderPaymentDetailsData.h, "payment-method", 0, 0, 6, null);
        if (!list2.isEmpty()) {
            ItemOrderDetailsRefundHorizontalDividerBindingModel_ itemOrderDetailsRefundHorizontalDividerBindingModel_ = new ItemOrderDetailsRefundHorizontalDividerBindingModel_();
            itemOrderDetailsRefundHorizontalDividerBindingModel_.M();
            add(itemOrderDetailsRefundHorizontalDividerBindingModel_);
            createSubtotalSection("refunds", Integer.valueOf(R.string.title_woolworths_refunds), list2, null);
            createEpoxyItems$default(this, orderPaymentDetailsData.k, "refund_total", R.font.roboto_medium, 0, 4, null);
            String str = orderPaymentDetailsData.l;
            if (str != null) {
                ItemOrderDetailsFooterMessageBindingModel_ itemOrderDetailsFooterMessageBindingModel_ = new ItemOrderDetailsFooterMessageBindingModel_();
                itemOrderDetailsFooterMessageBindingModel_.M();
                itemOrderDetailsFooterMessageBindingModel_.t();
                itemOrderDetailsFooterMessageBindingModel_.n = str;
                add(itemOrderDetailsFooterMessageBindingModel_);
            }
        }
        ItemSpacerEpoxyModel itemSpacerEpoxyModel2 = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        createEpoxyItem$lambda$22(itemSpacerEpoxyModel2);
        add(itemSpacerEpoxyModel2);
    }

    private final void createLegacyEpoxyItem(CurrentPickupOrderOverview currentPickupOrderOverview) {
        ItemCurrentPickupOrderOverviewBindingModel_ itemCurrentPickupOrderOverviewBindingModel_ = new ItemCurrentPickupOrderOverviewBindingModel_();
        itemCurrentPickupOrderOverviewBindingModel_.M();
        itemCurrentPickupOrderOverviewBindingModel_.t();
        itemCurrentPickupOrderOverviewBindingModel_.o = currentPickupOrderOverview;
        Boolean boolValueOf = Boolean.valueOf(this.showPickOrderCollectedState);
        itemCurrentPickupOrderOverviewBindingModel_.t();
        itemCurrentPickupOrderOverviewBindingModel_.t = boolValueOf;
        OrderDetailsViewModel orderDetailsViewModel = this.viewModel;
        itemCurrentPickupOrderOverviewBindingModel_.t();
        itemCurrentPickupOrderOverviewBindingModel_.q = orderDetailsViewModel;
        OrderDetailsViewModel orderDetailsViewModel2 = this.viewModel;
        itemCurrentPickupOrderOverviewBindingModel_.t();
        itemCurrentPickupOrderOverviewBindingModel_.p = orderDetailsViewModel2;
        OrderDetailsViewModel orderDetailsViewModel3 = this.viewModel;
        itemCurrentPickupOrderOverviewBindingModel_.t();
        itemCurrentPickupOrderOverviewBindingModel_.r = orderDetailsViewModel3;
        h hVar = new h(this, 3);
        itemCurrentPickupOrderOverviewBindingModel_.t();
        itemCurrentPickupOrderOverviewBindingModel_.s = hVar;
        androidx.camera.camera2.interop.e eVar = new androidx.camera.camera2.interop.e(22, currentPickupOrderOverview, this);
        itemCurrentPickupOrderOverviewBindingModel_.t();
        itemCurrentPickupOrderOverviewBindingModel_.n = eVar;
        add(itemCurrentPickupOrderOverviewBindingModel_);
        ItemSpacerEpoxyModel itemSpacerEpoxyModel = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        createLegacyEpoxyItem$lambda$43(itemSpacerEpoxyModel);
        add(itemSpacerEpoxyModel);
    }

    private final void createEpoxyItem(CurrentPickupOrderFulfilmentDetails currentPickupOrderFulfilmentDetails) {
        if (this.featureToggleManager.c(MyOrdersFeature.o)) {
            createComponent(currentPickupOrderFulfilmentDetails);
        } else {
            createEpoxyItem(currentPickupOrderFulfilmentDetails.f7750a);
            createEpoxyItem(currentPickupOrderFulfilmentDetails.b);
        }
    }

    private final void createEpoxyItem(HorizontalListData horizontalListData, TypedEpoxyController<?> typedEpoxyController) {
        if (this.featureToggleManager.c(MyOrdersFeature.p)) {
            createComponentItem(horizontalListData);
        } else {
            createLegacyEpoxyItem(horizontalListData, typedEpoxyController);
        }
    }

    private final void createEpoxyItem(final OrderCollectionDetails orderCollectionDetails) {
        ComposeInteropKt.a(this, "order_collection_details", new Object[]{orderCollectionDetails}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createEpoxyItem.10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final OrderCollectionDetails orderCollectionDetails2 = orderCollectionDetails;
                    final OrderDetailsController orderDetailsController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-274569755, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createEpoxyItem.10.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                OrderCollectionDetails orderCollectionDetails3 = orderCollectionDetails2;
                                String str = orderCollectionDetails3.b;
                                String str2 = orderCollectionDetails3.f7762a;
                                String str3 = orderCollectionDetails3.c;
                                OrderCollectionParkingDetails orderCollectionParkingDetails = orderCollectionDetails3.d;
                                composer2.o(-1633490746);
                                boolean zI = composer2.I(orderCollectionDetails3);
                                OrderDetailsController orderDetailsController2 = orderDetailsController;
                                boolean zI2 = zI | composer2.I(orderDetailsController2);
                                Object objG = composer2.G();
                                if (zI2 || objG == Composer.Companion.f1624a) {
                                    objG = new n(24, orderCollectionDetails3, orderDetailsController2);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                OrderCollectionDetailsItemKt.a(str, str2, str3, null, orderCollectionParkingDetails, (Function0) objG, composer2, 0, 8);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 2062799261));
    }

    private final void createEpoxyItem(final OrderStoreDetails orderStoreDetails) {
        ComposeInteropKt.a(this, "order_store_details_item", new Object[]{orderStoreDetails}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createEpoxyItem.11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final OrderStoreDetails orderStoreDetails2 = orderStoreDetails;
                    final OrderDetailsController orderDetailsController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1523665496, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createEpoxyItem.11.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                OrderStoreDetails orderStoreDetails3 = orderStoreDetails2;
                                String str = orderStoreDetails3.f7769a;
                                String str2 = orderStoreDetails3.b;
                                boolean z = orderStoreDetails3.c != null;
                                composer2.o(-1633490746);
                                boolean zN = composer2.n(orderStoreDetails3);
                                Object obj5 = orderDetailsController;
                                boolean zI = zN | composer2.I(obj5);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new n(25, orderStoreDetails3, obj5);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                OrderStoreDetailsItemKt.a(0, 4, composer2, null, str, str2, (Function0) objG, z);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1699310496));
    }

    private final void createEpoxyItem(final OrderDetailsDeliveryDriverInfo orderDetailsDeliveryDriverInfo) {
        ComposeInteropKt.a(this, "item_delivery_partner_info", new Object[]{orderDetailsDeliveryDriverInfo}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createEpoxyItem.15
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final OrderDetailsDeliveryDriverInfo orderDetailsDeliveryDriverInfo2 = orderDetailsDeliveryDriverInfo;
                    final OrderDetailsController orderDetailsController = this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-595886359, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createEpoxyItem.15.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final OrderDetailsDeliveryDriverInfo orderDetailsDeliveryDriverInfo3 = orderDetailsDeliveryDriverInfo2;
                                String str = orderDetailsDeliveryDriverInfo3.f7764a;
                                String str2 = orderDetailsDeliveryDriverInfo3.b;
                                String str3 = orderDetailsDeliveryDriverInfo3.c;
                                InsetBannerApiData insetBannerApiData = orderDetailsDeliveryDriverInfo3.d;
                                InsetBannerData uiModel = insetBannerApiData != null ? InsetBannerApiDataExtKt.toUiModel(insetBannerApiData) : null;
                                DeliveryMethodsTooltip deliveryMethodsTooltip = orderDetailsDeliveryDriverInfo3.f;
                                ButtonApiData buttonApiData = orderDetailsDeliveryDriverInfo3.e;
                                composer2.o(-1633490746);
                                boolean zI = composer2.I(orderDetailsDeliveryDriverInfo3);
                                final OrderDetailsController orderDetailsController2 = orderDetailsController;
                                boolean zI2 = zI | composer2.I(orderDetailsController2);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI2 || objG == obj5) {
                                    final int i = 0;
                                    objG = new Function0() { // from class: au.com.woolworths.feature.shop.myorders.details.g
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            AnalyticsData analytics;
                                            String url;
                                            switch (i) {
                                                case 0:
                                                    InsetBannerApiData insetBannerApiData2 = orderDetailsDeliveryDriverInfo3.d;
                                                    if (insetBannerApiData2 != null && (analytics = insetBannerApiData2.getAnalytics()) != null) {
                                                        orderDetailsController2.trackOrderStatusBannerImpression(analytics);
                                                    }
                                                    break;
                                                case 1:
                                                    ButtonApiData buttonApiData2 = orderDetailsDeliveryDriverInfo3.e;
                                                    if (buttonApiData2 != null && (url = buttonApiData2.getUrl()) != null) {
                                                        OrderDetailsViewModel orderDetailsViewModel = orderDetailsController2.viewModel;
                                                        orderDetailsViewModel.getClass();
                                                        orderDetailsViewModel.u.f(new OrderDetailsContract.Actions.OpenExternalLink(url));
                                                    }
                                                    break;
                                                default:
                                                    DeliveryMethodsTooltip deliveryMethodsTooltip2 = orderDetailsDeliveryDriverInfo3.f;
                                                    if (deliveryMethodsTooltip2 != null) {
                                                        OrderDetailsViewModel orderDetailsViewModel2 = orderDetailsController2.viewModel;
                                                        orderDetailsViewModel2.getClass();
                                                        orderDetailsViewModel2.u.f(new OrderDetailsContract.Actions.OpenApplicableDeliveryMethods(deliveryMethodsTooltip2));
                                                    }
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(-1633490746);
                                boolean zI3 = composer2.I(orderDetailsDeliveryDriverInfo3) | composer2.I(orderDetailsController2);
                                Object objG2 = composer2.G();
                                if (zI3 || objG2 == obj5) {
                                    final int i2 = 1;
                                    objG2 = new Function0() { // from class: au.com.woolworths.feature.shop.myorders.details.g
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            AnalyticsData analytics;
                                            String url;
                                            switch (i2) {
                                                case 0:
                                                    InsetBannerApiData insetBannerApiData2 = orderDetailsDeliveryDriverInfo3.d;
                                                    if (insetBannerApiData2 != null && (analytics = insetBannerApiData2.getAnalytics()) != null) {
                                                        orderDetailsController2.trackOrderStatusBannerImpression(analytics);
                                                    }
                                                    break;
                                                case 1:
                                                    ButtonApiData buttonApiData2 = orderDetailsDeliveryDriverInfo3.e;
                                                    if (buttonApiData2 != null && (url = buttonApiData2.getUrl()) != null) {
                                                        OrderDetailsViewModel orderDetailsViewModel = orderDetailsController2.viewModel;
                                                        orderDetailsViewModel.getClass();
                                                        orderDetailsViewModel.u.f(new OrderDetailsContract.Actions.OpenExternalLink(url));
                                                    }
                                                    break;
                                                default:
                                                    DeliveryMethodsTooltip deliveryMethodsTooltip2 = orderDetailsDeliveryDriverInfo3.f;
                                                    if (deliveryMethodsTooltip2 != null) {
                                                        OrderDetailsViewModel orderDetailsViewModel2 = orderDetailsController2.viewModel;
                                                        orderDetailsViewModel2.getClass();
                                                        orderDetailsViewModel2.u.f(new OrderDetailsContract.Actions.OpenApplicableDeliveryMethods(deliveryMethodsTooltip2));
                                                    }
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG2);
                                }
                                Function0 function02 = (Function0) objG2;
                                composer2.l();
                                composer2.o(-1633490746);
                                boolean zI4 = composer2.I(orderDetailsDeliveryDriverInfo3) | composer2.I(orderDetailsController2);
                                Object objG3 = composer2.G();
                                if (zI4 || objG3 == obj5) {
                                    final int i3 = 2;
                                    objG3 = new Function0() { // from class: au.com.woolworths.feature.shop.myorders.details.g
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            AnalyticsData analytics;
                                            String url;
                                            switch (i3) {
                                                case 0:
                                                    InsetBannerApiData insetBannerApiData2 = orderDetailsDeliveryDriverInfo3.d;
                                                    if (insetBannerApiData2 != null && (analytics = insetBannerApiData2.getAnalytics()) != null) {
                                                        orderDetailsController2.trackOrderStatusBannerImpression(analytics);
                                                    }
                                                    break;
                                                case 1:
                                                    ButtonApiData buttonApiData2 = orderDetailsDeliveryDriverInfo3.e;
                                                    if (buttonApiData2 != null && (url = buttonApiData2.getUrl()) != null) {
                                                        OrderDetailsViewModel orderDetailsViewModel = orderDetailsController2.viewModel;
                                                        orderDetailsViewModel.getClass();
                                                        orderDetailsViewModel.u.f(new OrderDetailsContract.Actions.OpenExternalLink(url));
                                                    }
                                                    break;
                                                default:
                                                    DeliveryMethodsTooltip deliveryMethodsTooltip2 = orderDetailsDeliveryDriverInfo3.f;
                                                    if (deliveryMethodsTooltip2 != null) {
                                                        OrderDetailsViewModel orderDetailsViewModel2 = orderDetailsController2.viewModel;
                                                        orderDetailsViewModel2.getClass();
                                                        orderDetailsViewModel2.u.f(new OrderDetailsContract.Actions.OpenApplicableDeliveryMethods(deliveryMethodsTooltip2));
                                                    }
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG3);
                                }
                                composer2.l();
                                OrderDetailsDeliveryDriverInfoItemKt.a(str, str2, str3, uiModel, buttonApiData, deliveryMethodsTooltip, function0, function02, (Function0) objG3, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 516574917));
    }

    private final void createEpoxyItem(CurrentPickupOrderOverview currentPickupOrderOverview) {
        if (this.featureToggleManager.c(MyOrdersFeature.j)) {
            createComponentItem(currentPickupOrderOverview);
        } else {
            createLegacyEpoxyItem(currentPickupOrderOverview);
        }
    }

    private final void createEpoxyItem(final OrderNumberDetails orderNumberDetails) {
        ComposeInteropKt.a(this, "order_item_number_details", new Object[]{orderNumberDetails}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createEpoxyItem.16
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final OrderNumberDetails orderNumberDetails2 = orderNumberDetails;
                    final OrderDetailsController orderDetailsController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-1755536998, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createEpoxyItem.16.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                OrderNumberDetails orderNumberDetails3 = orderNumberDetails2;
                                String str = orderNumberDetails3.f7766a;
                                String str2 = orderNumberDetails3.b;
                                composer2.o(-1633490746);
                                Object obj5 = orderDetailsController;
                                boolean zI = composer2.I(obj5) | composer2.n(orderNumberDetails3);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new n(26, obj5, orderNumberDetails3);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                OrderNumberDetailsItemKt.a(0, 2, composer2, null, str2, str, (Function0) objG);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -605509294));
    }

    private final void createEpoxyItem(CurrentDeliveryOrderOverview currentDeliveryOrderOverview) {
        if (this.featureToggleManager.c(MyOrdersFeature.f)) {
            createUpliftCurrentDeliveryOrderOverview(currentDeliveryOrderOverview);
        } else {
            createLegacyCurrentDeliveryOrderOverview(currentDeliveryOrderOverview);
        }
    }

    private final void createEpoxyItem(final CurrentPickupLocationTrackingStatus currentPickupLocationTrackingStatus) {
        ComposeInteropKt.a(this, "current_pickup_location_tracking_status", new Object[]{currentPickupLocationTrackingStatus}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createEpoxyItem.17
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final CurrentPickupLocationTrackingStatus currentPickupLocationTrackingStatus2 = currentPickupLocationTrackingStatus;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-1434783268, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createEpoxyItem.17.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                LocationTrackingStatusItemKt.a(currentPickupLocationTrackingStatus2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -713535196));
    }

    private final void createEpoxyItem(final OrderProofOfDeliveryDetailsData orderProofOfDeliveryDetailsData) {
        ComposeInteropKt.a(this, "order_proof_of_delivery", new Object[]{orderProofOfDeliveryDetailsData}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createEpoxyItem.18
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final OrderProofOfDeliveryDetailsData orderProofOfDeliveryDetailsData2 = orderProofOfDeliveryDetailsData;
                    final OrderDetailsController orderDetailsController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1672418868, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createEpoxyItem.18.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                OrderProofOfDeliveryDetailsData orderProofOfDeliveryDetailsData3 = orderProofOfDeliveryDetailsData2;
                                String str = orderProofOfDeliveryDetailsData3.f7768a;
                                String str2 = orderProofOfDeliveryDetailsData3.c;
                                InsetBannerApiData insetBannerApiData = orderProofOfDeliveryDetailsData3.b;
                                InsetBannerData uiModel = insetBannerApiData != null ? InsetBannerApiDataExtKt.toUiModel(insetBannerApiData) : null;
                                composer2.o(5004770);
                                OrderDetailsController orderDetailsController2 = orderDetailsController;
                                boolean zI = composer2.I(orderDetailsController2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    objG = new f(orderDetailsController2, 3);
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                boolean zD = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG2 = composer2.G();
                                if (zD || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new f(orderDetailsController2, 4);
                                    composer2.A(objG2);
                                }
                                Function0 function02 = (Function0) objG2;
                                boolean zD2 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, -1633490746, orderDetailsController2) | composer2.I(orderProofOfDeliveryDetailsData3);
                                Object objG3 = composer2.G();
                                if (zD2 || objG3 == composer$Companion$Empty$1) {
                                    objG3 = new n(27, orderDetailsController2, orderProofOfDeliveryDetailsData3);
                                    composer2.A(objG3);
                                }
                                composer2.l();
                                OrderProofOfDeliveryDetailsItemKt.a(str, str2, uiModel, function0, function02, (Function0) objG3, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1250908540));
    }

    private final void createEpoxyItem(final DriverRating driverRating) {
        ComposeInteropKt.a(this, "driver_rating", new Object[]{driverRating}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createEpoxyItem.19
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final OrderDetailsController orderDetailsController = OrderDetailsController.this;
                    final DriverRating driverRating2 = driverRating;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(1208049936, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsController.createEpoxyItem.19.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                OrderDetailsController orderDetailsController2 = orderDetailsController;
                                OrderDetailsContract.DriverRatingState driverRatingState = (OrderDetailsContract.DriverRatingState) FlowExtKt.a(orderDetailsController2.viewModel.x, composer2).getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(orderDetailsController2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    objG = new h(orderDetailsController2, 9);
                                    composer2.A(objG);
                                }
                                Function1 function1 = (Function1) objG;
                                boolean zD = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG2 = composer2.G();
                                if (zD || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new h(orderDetailsController2, 0);
                                    composer2.A(objG2);
                                }
                                Function1 function12 = (Function1) objG2;
                                boolean zD2 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG3 = composer2.G();
                                if (zD2 || objG3 == composer$Companion$Empty$1) {
                                    objG3 = new h(orderDetailsController2, 10);
                                    composer2.A(objG3);
                                }
                                Function1 function13 = (Function1) objG3;
                                boolean zD3 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG4 = composer2.G();
                                if (zD3 || objG4 == composer$Companion$Empty$1) {
                                    objG4 = new h(orderDetailsController2, 11);
                                    composer2.A(objG4);
                                }
                                Function1 function14 = (Function1) objG4;
                                boolean zD4 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG5 = composer2.G();
                                if (zD4 || objG5 == composer$Companion$Empty$1) {
                                    objG5 = new h(orderDetailsController2, 1);
                                    composer2.A(objG5);
                                }
                                Function1 function15 = (Function1) objG5;
                                boolean zD5 = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.D(composer2, 5004770, orderDetailsController2);
                                Object objG6 = composer2.G();
                                if (zD5 || objG6 == composer$Companion$Empty$1) {
                                    objG6 = new h(orderDetailsController2, 12);
                                    composer2.A(objG6);
                                }
                                composer2.l();
                                DriverRatingSectionItemKt.a(driverRatingState, driverRating2, function1, function12, function13, function14, function15, (Function1) objG6, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 345747436));
    }

    private final void createEpoxyItem(DeliveryInstructionsData deliveryInstructionsData) {
        ItemDeliveryInstructionsBindingModel_ itemDeliveryInstructionsBindingModel_ = new ItemDeliveryInstructionsBindingModel_();
        itemDeliveryInstructionsBindingModel_.M();
        itemDeliveryInstructionsBindingModel_.t();
        itemDeliveryInstructionsBindingModel_.o = deliveryInstructionsData;
        OrderDetailsViewModel orderDetailsViewModel = this.viewModel;
        itemDeliveryInstructionsBindingModel_.t();
        itemDeliveryInstructionsBindingModel_.p = orderDetailsViewModel;
        androidx.camera.camera2.interop.e eVar = new androidx.camera.camera2.interop.e(23, deliveryInstructionsData, this);
        itemDeliveryInstructionsBindingModel_.t();
        itemDeliveryInstructionsBindingModel_.n = eVar;
        add(itemDeliveryInstructionsBindingModel_);
        ItemSpacerEpoxyModel itemSpacerEpoxyModel = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        createEpoxyItem$lambda$10(deliveryInstructionsData, itemSpacerEpoxyModel);
        add(itemSpacerEpoxyModel);
    }
}
