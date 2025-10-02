package au.com.woolworths.feature.shop.myorders.details;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.android.onesite.extensions.LiveDataExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.handlers.LinkHandler;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.android.onesite.utils.NotificationManager;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.base.shopapp.modules.button.Button;
import au.com.woolworths.base.shopapp.modules.button.ButtonActionApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.analytics.HelpActions;
import au.com.woolworths.feature.shop.myorders.details.analytics.LocationPermissionPrimingActions;
import au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens;
import au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions;
import au.com.woolworths.feature.shop.myorders.details.help.HelpActionView;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDownloader;
import au.com.woolworths.feature.shop.myorders.details.models.BayNumberPreferences;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupLocationTrackingStatus;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryInstructionsData;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryOrderFulfilmentDetails;
import au.com.woolworths.feature.shop.myorders.details.models.LocationTrackingPrimingPage;
import au.com.woolworths.feature.shop.myorders.details.models.LocationTrackingStatusImage;
import au.com.woolworths.feature.shop.myorders.details.models.OnMyWayPreferences;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionParkingDetails;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderStatusTypeData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderSummaryData;
import au.com.woolworths.feature.shop.myorders.details.models.PickupOrderMessage;
import au.com.woolworths.feature.shop.myorders.details.models.StarCount;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.feature.shop.myorders.details.models.ui.OrderDetailsProductClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.ui.PickUpInstructionsClickHandler;
import au.com.woolworths.feature.shop.myorders.details.perfectorder.PerfectOrderDataSource;
import au.com.woolworths.feature.shop.myorders.details.perfectorder.PerfectOrderInteractor;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity;
import au.com.woolworths.feature.shop.myorders.orders.OrderCheckInInteractor;
import au.com.woolworths.feature.shop.myorders.orders.PickUpCheckInType;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.geolocation.location.LocationsKt;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.feature.shop.myorders.GetPickupOrderMessagesSubscription;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/base/shopapp/modules/button/ButtonClickHandler;", "Lau/com/woolworths/base/shopapp/epoxy/HorizontalListActionClickListener;", "Lau/com/woolworths/feature/shop/myorders/details/models/ui/PickUpInstructionsClickHandler;", "Lau/com/woolworths/android/onesite/handlers/LinkHandler;", "Lau/com/woolworths/feature/shop/myorders/details/models/ui/OrderDetailsProductClickHandler;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsClickHandler;", "Lau/com/woolworths/feature/shop/myorders/details/help/HelpActionView$ClickHandler;", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderDetailsViewModel extends AndroidViewModel implements FullPageErrorStateClickHandler, ButtonClickHandler, HorizontalListActionClickListener, PickUpInstructionsClickHandler, LinkHandler, OrderDetailsProductClickHandler, OrderDetailsClickHandler, HelpActionView.ClickHandler {
    public int A;
    public Job B;
    public Integer C;
    public final int D;
    public final Application f;
    public final OrderDetailsInteractor g;
    public final OrderCheckInInteractor h;
    public final AnalyticsManager i;
    public final ShopAccountInteractor j;
    public final FeatureToggleManager k;
    public final OrderInvoiceDownloader l;
    public final PickupOrderMessageInteractor m;
    public final PerfectOrderInteractor n;
    public final NotificationManager o;
    public final LocationInteractor p;
    public final EditOrderInteractor q;
    public final SubmitDriverRatingSurveyInteractor r;
    public final MutableLiveData s;
    public final MutableStateFlow t;
    public final SharedFlowImpl u;
    public final BufferedChannel v;
    public final MutableLiveData w;
    public final StateFlow x;
    public final Flow y;
    public final Flow z;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsViewModel$Companion;", "", "", "OPEN_PAST_ORDER_DELAY", "J", "", "LOCATION_TRACKING_STATUS_IMPRESSION_EVENT_DESCRIPTION_ON", "Ljava/lang/String;", "LOCATION_TRACKING_STATUS_IMPRESSION_EVENT_DESCRIPTION_OFF", "TRACKING_OFF_EVENT_DESCRIPTION_IM_HERE", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7675a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[OrderStatusTypeData.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<OrderStatusTypeData> creator = OrderStatusTypeData.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[LocationTrackingStatusImage.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LocationTrackingStatusImage locationTrackingStatusImage = LocationTrackingStatusImage.d;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[OrderDetailsFullPageErrorState.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OrderDetailsFullPageErrorState orderDetailsFullPageErrorState = OrderDetailsFullPageErrorState.d;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                OrderDetailsFullPageErrorState orderDetailsFullPageErrorState2 = OrderDetailsFullPageErrorState.d;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f7675a = iArr3;
            int[] iArr4 = new int[ButtonActionApiData.values().length];
            try {
                iArr4[ButtonActionApiData.CANCEL_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[ButtonActionApiData.EDIT_ORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[ButtonActionApiData.VIEW_INVOICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[ButtonActionApiData.SET_LOCATION_TRACKING_PERMISSIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[ButtonActionApiData.UPDATE_LOCATION_TRACKING_PERMISSIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[ButtonActionApiData.SKIP_LOCATION_TRACKING_PERMISSIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[ButtonActionApiData.CHECK_IN_15_MIN_AWAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ButtonActionApiData.CHECK_IN_ON_MY_WAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            b = iArr4;
            int[] iArr5 = new int[StarCount.values().length];
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                StarCount.Companion companion = StarCount.e;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                StarCount.Companion companion2 = StarCount.e;
                iArr5[2] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                StarCount.Companion companion3 = StarCount.e;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                StarCount.Companion companion4 = StarCount.e;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                StarCount.Companion companion5 = StarCount.e;
                iArr5[5] = 6;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsViewModel(Application application, OrderDetailsInteractor orderDetailsInteractor, OrderCheckInInteractor orderCheckInInteractor, AnalyticsManager analyticsManager, ShopAccountInteractor accountInteractor, FeatureToggleManager featureToggleManager, OrderInvoiceDownloader orderInvoiceDownloader, PickupOrderMessageInteractor pickupOrderMessageInteractor, PerfectOrderInteractor perfectOrderInteractor, NotificationManager notificationCompat, LocationInteractor locationInteractor, EditOrderInteractor editOrderInteractor, SubmitDriverRatingSurveyInteractor submitDriverRatingSurveyInteractor) {
        super(application);
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(notificationCompat, "notificationCompat");
        Intrinsics.h(locationInteractor, "locationInteractor");
        Intrinsics.h(editOrderInteractor, "editOrderInteractor");
        this.f = application;
        this.g = orderDetailsInteractor;
        this.h = orderCheckInInteractor;
        this.i = analyticsManager;
        this.j = accountInteractor;
        this.k = featureToggleManager;
        this.l = orderInvoiceDownloader;
        this.m = pickupOrderMessageInteractor;
        this.n = perfectOrderInteractor;
        this.o = notificationCompat;
        this.p = locationInteractor;
        this.q = editOrderInteractor;
        this.r = submitDriverRatingSurveyInteractor;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.s = mutableLiveData;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(OrderDetailsContract.DriverRatingState.StarRating.InitialNoStar.e);
        this.t = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.u = sharedFlowImplB;
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.v = bufferedChannelA;
        this.w = mutableLiveData;
        this.x = mutableStateFlowA;
        this.y = FlowKt.a(sharedFlowImplB);
        this.z = FlowKt.I(bufferedChannelA);
        this.D = 20000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        if (r1 == r9) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q6(au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel.q6(au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler
    public final void A4(OrderCollectionParkingDetails parkingDetails) {
        Intrinsics.h(parkingDetails, "parkingDetails");
        this.i.c(OrderDetailsActions.M);
        this.u.f(new OrderDetailsContract.Actions.OpenParkingGuide(parkingDetails));
    }

    @Override // au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener
    public final void G0(HorizontalListDataInterface data) {
        Intrinsics.h(data, "data");
        this.i.c(OrderDetailsActions.U);
        this.u.f(new OrderDetailsContract.Actions.HorizontalListActionClicked(data));
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler
    public final void G3(String str) {
        this.i.c(OrderDetailsActions.s);
        this.u.f(new OrderDetailsContract.Actions.CopyOrderNumber(str));
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler
    public final void K3() {
        OrderSummaryData orderSummaryData;
        OrderDetailsContract.ViewState viewState = (OrderDetailsContract.ViewState) this.w.e();
        if (viewState == null || (orderSummaryData = viewState.c) == null) {
            return;
        }
        this.i.j(OrderDetailsActions.k, OrderDetailsExtKt.b(orderSummaryData));
    }

    @Override // au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler
    public final void O2(Button data) {
        Intrinsics.h(data, "data");
        OrderDetailsContract.ViewState viewState = (OrderDetailsContract.ViewState) this.w.e();
        OrderSummaryData orderSummaryData = viewState != null ? viewState.c : null;
        if (orderSummaryData == null) {
            throw new IllegalArgumentException("Button is only clickable after ViewState has been set");
        }
        ButtonActionApiData action = data.getAction();
        int i = action == null ? -1 : WhenMappings.b[action.ordinal()];
        AnalyticsManager analyticsManager = this.i;
        SharedFlowImpl sharedFlowImpl = this.u;
        switch (i) {
            case 1:
                analyticsManager.c(OrderDetailsActions.e);
                BuildersKt.c(ViewModelKt.a(this), null, null, new OrderDetailsViewModel$fetchEditOrderStatus$1(this, orderSummaryData, null), 3);
                return;
            case 2:
                analyticsManager.c(OrderDetailsActions.h);
                sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowEditOrderWarningScreen(new EditOrderConditionsActivity.Extras(orderSummaryData.f7770a, orderSummaryData.e)));
                return;
            case 3:
                BuildersKt.c(ViewModelKt.a(this), null, null, new OrderDetailsViewModel$downloadAndViewInvoice$1(this, null), 3);
                return;
            case 4:
                analyticsManager.c(LocationPermissionPrimingActions.e);
                sharedFlowImpl.f(OrderDetailsContract.Actions.RequestLocationPermissionsForTracking.f7655a);
                return;
            case 5:
                analyticsManager.c(LocationPermissionPrimingActions.g);
                sharedFlowImpl.f(OrderDetailsContract.Actions.GoToSettings.f7639a);
                return;
            case 6:
                analyticsManager.c(LocationPermissionPrimingActions.i);
                OnMyWayPreferences onMyWayPreferencesU6 = u6();
                if (onMyWayPreferencesU6 != null) {
                    sharedFlowImpl.f(new OrderDetailsContract.Actions.PickupEtaSelector(onMyWayPreferencesU6));
                    return;
                }
                return;
            default:
                sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowErrorMessage(new PlainText("Button [" + data.getAction() + "] clicked")));
                return;
        }
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.models.ui.OrderDetailsProductClickHandler
    public final void R0(String productId) {
        Intrinsics.h(productId, "productId");
        this.u.f(new OrderDetailsContract.Actions.ProductClicked(productId));
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler
    public final void R3(String address) {
        Intrinsics.h(address, "address");
        this.i.c(OrderDetailsActions.t);
        this.u.f(new OrderDetailsContract.Actions.OpenNavigation(address));
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler
    public final void S2() {
        DeliveryInstructionsData deliveryInstructionsData;
        OrderSummaryData orderSummaryData;
        List<Object> items;
        OrderDetailsContract.ViewState viewState = (OrderDetailsContract.ViewState) this.w.e();
        ArrayList arrayList = null;
        if (viewState != null && (orderSummaryData = viewState.c) != null && (items = orderSummaryData.c.getItems()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : items) {
                DeliveryInstructionsData deliveryInstructionsData2 = obj instanceof DeliveryInstructionsData ? (DeliveryInstructionsData) obj : null;
                if (deliveryInstructionsData2 == null) {
                    OrderDetailsData orderDetailsData = obj instanceof OrderDetailsData ? (OrderDetailsData) obj : null;
                    deliveryInstructionsData2 = orderDetailsData != null ? orderDetailsData.c : null;
                    if (deliveryInstructionsData2 == null) {
                        DeliveryOrderFulfilmentDetails deliveryOrderFulfilmentDetails = obj instanceof DeliveryOrderFulfilmentDetails ? (DeliveryOrderFulfilmentDetails) obj : null;
                        deliveryInstructionsData2 = deliveryOrderFulfilmentDetails != null ? deliveryOrderFulfilmentDetails.c : null;
                    }
                }
                if (deliveryInstructionsData2 != null) {
                    arrayList2.add(deliveryInstructionsData2);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || (deliveryInstructionsData = (DeliveryInstructionsData) CollectionsKt.F(arrayList)) == null) {
            return;
        }
        this.u.f(new OrderDetailsContract.Actions.ShowLeaveOrderUnattendedDialog(deliveryInstructionsData.d, deliveryInstructionsData.f));
    }

    @Override // au.com.woolworths.android.onesite.handlers.LinkHandler
    public final boolean U3(String url, String linkText) {
        Intrinsics.h(url, "url");
        Intrinsics.h(linkText, "linkText");
        this.i.c(OrderDetailsActions.r);
        return false;
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler
    public final void V3(boolean z) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new OrderDetailsViewModel$onLeaveDeliveryUnattendedCheckedChanges$1(this, z, null), 3);
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.models.ui.PickUpInstructionsClickHandler
    public final void a5(ButtonActionApiData buttonActionApiData, OnMyWayPreferences onMyWayPreferences, boolean z, LocationTrackingPrimingPage locationTrackingPrimingPage) {
        int i = buttonActionApiData == null ? -1 : WhenMappings.b[buttonActionApiData.ordinal()];
        AnalyticsManager analyticsManager = this.i;
        if (i == 7) {
            analyticsManager.c(OrderDetailsActions.l);
            MutableLiveData mutableLiveData = this.s;
            OrderDetailsContract.ViewState viewState = (OrderDetailsContract.ViewState) mutableLiveData.e();
            mutableLiveData.m(viewState != null ? new OrderDetailsContract.ViewState(OrderDetailsContract.LoadingState.d, viewState.b, viewState.c) : null);
            r6(PickUpCheckInType.d, null);
            return;
        }
        if (i == 8 && onMyWayPreferences != null) {
            analyticsManager.c(OrderDetailsActions.p);
            SharedFlowImpl sharedFlowImpl = this.u;
            NotificationManager notificationManager = this.o;
            LocationInteractor locationInteractor = this.p;
            if (!z || !notificationManager.a() || !locationInteractor.d() || locationTrackingPrimingPage == null) {
                if (z && notificationManager.a() && locationInteractor.d() && LocationsKt.c(locationInteractor.f8946a)) {
                    w6();
                    return;
                } else {
                    sharedFlowImpl.f(new OrderDetailsContract.Actions.PickupEtaSelector(onMyWayPreferences));
                    return;
                }
            }
            if (LocationsKt.c(locationInteractor.f8946a)) {
                w6();
                return;
            }
            boolean zE = locationInteractor.e();
            OrderDetailsInteractor orderDetailsInteractor = this.g;
            if (zE) {
                if (orderDetailsInteractor.f7673a.c.getBoolean("location_permission_denied_priming_shown", false)) {
                    sharedFlowImpl.f(new OrderDetailsContract.Actions.PickupEtaSelector(onMyWayPreferences));
                    return;
                }
                androidx.constraintlayout.core.state.a.v(orderDetailsInteractor.f7673a.c, "location_permission_denied_priming_shown", true);
                analyticsManager.c(LocationPermissionPrimingActions.h);
                sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowRequestLocationPrimingForTracking(locationTrackingPrimingPage.b));
                return;
            }
            if (orderDetailsInteractor.f7673a.c.getBoolean("location_permission_not_set_priming_shown", false)) {
                sharedFlowImpl.f(OrderDetailsContract.Actions.RequestLocationPermissionsForTracking.f7655a);
                return;
            }
            analyticsManager.c(LocationPermissionPrimingActions.f);
            SharedPreferences.Editor editorEdit = orderDetailsInteractor.f7673a.c.edit();
            editorEdit.putBoolean("location_permission_not_set_priming_shown", true);
            editorEdit.apply();
            sharedFlowImpl.f(new OrderDetailsContract.Actions.ShowRequestLocationPrimingForTracking(locationTrackingPrimingPage.f7759a));
        }
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.help.HelpActionView.ClickHandler
    public final void h5() {
        OrderSummaryData orderSummaryData;
        OrderHelpDataList orderHelpDataList;
        OrderDetailsContract.ViewState viewState = (OrderDetailsContract.ViewState) this.w.e();
        if (viewState == null || (orderSummaryData = viewState.c) == null || (orderHelpDataList = orderSummaryData.b) == null) {
            return;
        }
        this.u.f(new OrderDetailsContract.Actions.OpenOrderDetailsHelpActivity(orderHelpDataList));
        this.i.c(new HelpActions.HelpMenuClick(MyOrdersScreens.h));
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler
    public final void j3(String str) {
        this.u.f(new OrderDetailsContract.Actions.LaunchEditDriverInstructionScreen(new EditDriverInstructionActivity.Extras(this.A, str)));
        this.i.c(OrderDetailsActions.u);
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.models.ui.PickUpInstructionsClickHandler
    public final void n1(BayNumberPreferences bayNumberPreferences) {
        this.i.c(OrderDetailsActions.n);
        if (bayNumberPreferences != null) {
            this.u.f(new OrderDetailsContract.Actions.ShowBayNumberSelector(bayNumberPreferences));
            return;
        }
        MutableLiveData mutableLiveData = this.s;
        OrderDetailsContract.ViewState viewState = (OrderDetailsContract.ViewState) mutableLiveData.e();
        mutableLiveData.m(viewState != null ? new OrderDetailsContract.ViewState(OrderDetailsContract.LoadingState.d, viewState.b, viewState.c) : null);
        r6(PickUpCheckInType.e, null);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        OrderDetailsContract.ViewState viewState = (OrderDetailsContract.ViewState) this.s.e();
        OrderDetailsFullPageErrorState orderDetailsFullPageErrorState = viewState != null ? viewState.b : null;
        int i = orderDetailsFullPageErrorState == null ? -1 : WhenMappings.f7675a[orderDetailsFullPageErrorState.ordinal()];
        AnalyticsManager analyticsManager = this.i;
        if (i == 1) {
            analyticsManager.c(OrderDetailsActions.W);
            t6(this.A, null);
        } else if (i == 2) {
            analyticsManager.c(OrderDetailsActions.X);
            t6(this.A, null);
        } else {
            if (i != 3) {
                return;
            }
            analyticsManager.c(OrderDetailsActions.S);
            t6(this.A, null);
        }
    }

    public final void r6(PickUpCheckInType pickUpCheckInType, String str) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new OrderDetailsViewModel$checkIn$1(pickUpCheckInType, this, str, null), 3);
    }

    public final void s6() throws Exception {
        if (this.B == null) {
            int i = this.A;
            try {
                ApolloClient apolloClient = this.m.f7681a.f7682a;
                GetPickupOrderMessagesSubscription getPickupOrderMessagesSubscription = new GetPickupOrderMessagesSubscription(Optional.Companion.a(String.valueOf(i)));
                apolloClient.getClass();
                final PickupOrderMessageRepository$getPickupOrderMessages$lambda$2$$inlined$mapNotNull$1 pickupOrderMessageRepository$getPickupOrderMessages$lambda$2$$inlined$mapNotNull$1 = new PickupOrderMessageRepository$getPickupOrderMessages$lambda$2$$inlined$mapNotNull$1(new ApolloCall(apolloClient, getPickupOrderMessagesSubscription).d());
                this.B = FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new OrderDetailsViewModel$collectPickupOrderMessage$2(this, null), new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new Flow<PickupOrderMessage>() { // from class: au.com.woolworths.feature.shop.myorders.details.PickupOrderMessageRepository$getPickupOrderMessages$lambda$2$$inlined$map$1

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.feature.shop.myorders.details.PickupOrderMessageRepository$getPickupOrderMessages$lambda$2$$inlined$map$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.PickupOrderMessageRepository$getPickupOrderMessages$lambda$2$$inlined$map$1$2", f = "PickupOrderMessageRepository.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.feature.shop.myorders.details.PickupOrderMessageRepository$getPickupOrderMessages$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
                        public final class AnonymousClass1 extends ContinuationImpl {
                            public /* synthetic */ Object p;
                            public int q;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.p = obj;
                                this.q |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.d = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof au.com.woolworths.feature.shop.myorders.details.PickupOrderMessageRepository$getPickupOrderMessages$lambda$2$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.feature.shop.myorders.details.PickupOrderMessageRepository$getPickupOrderMessages$lambda$2$$inlined$map$1$2$1 r0 = (au.com.woolworths.feature.shop.myorders.details.PickupOrderMessageRepository$getPickupOrderMessages$lambda$2$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.feature.shop.myorders.details.PickupOrderMessageRepository$getPickupOrderMessages$lambda$2$$inlined$map$1$2$1 r0 = new au.com.woolworths.feature.shop.myorders.details.PickupOrderMessageRepository$getPickupOrderMessages$lambda$2$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.p
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r2 = r0.q
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                kotlin.ResultKt.b(r6)
                                goto L5d
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                kotlin.ResultKt.b(r6)
                                com.woolworths.feature.shop.myorders.GetPickupOrderMessagesSubscription$PickupOrderMessages r5 = (com.woolworths.feature.shop.myorders.GetPickupOrderMessagesSubscription.PickupOrderMessages) r5
                                java.lang.String r6 = "<this>"
                                kotlin.jvm.internal.Intrinsics.h(r5, r6)
                                au.com.woolworths.feature.shop.myorders.details.models.PickupOrderMessage r6 = new au.com.woolworths.feature.shop.myorders.details.models.PickupOrderMessage
                                java.lang.String r2 = r5.f19978a
                                au.com.woolworths.shop.graphql.type.PickupOrderStatus r5 = r5.b
                                int r5 = r5.ordinal()
                                if (r5 == 0) goto L4d
                                if (r5 == r3) goto L4a
                                au.com.woolworths.feature.shop.myorders.details.models.PickupOrderStatus r5 = au.com.woolworths.feature.shop.myorders.details.models.PickupOrderStatus.e
                                goto L4f
                            L4a:
                                au.com.woolworths.feature.shop.myorders.details.models.PickupOrderStatus r5 = au.com.woolworths.feature.shop.myorders.details.models.PickupOrderStatus.e
                                goto L4f
                            L4d:
                                au.com.woolworths.feature.shop.myorders.details.models.PickupOrderStatus r5 = au.com.woolworths.feature.shop.myorders.details.models.PickupOrderStatus.d
                            L4f:
                                r6.<init>(r2, r5)
                                r0.q = r3
                                kotlinx.coroutines.flow.FlowCollector r5 = r4.d
                                java.lang.Object r5 = r5.emit(r6, r0)
                                if (r5 != r1) goto L5d
                                return r1
                            L5d:
                                kotlin.Unit r5 = kotlin.Unit.f24250a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.PickupOrderMessageRepository$getPickupOrderMessages$lambda$2$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = pickupOrderMessageRepository$getPickupOrderMessages$lambda$2$$inlined$mapNotNull$1.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                    }
                }, new OrderDetailsViewModel$collectPickupOrderMessage$1(this, null))), ViewModelKt.a(this));
            } catch (GraphQlException e) {
                throw ExceptionExtKt.h(e);
            } catch (ApolloException e2) {
                throw ExceptionExtKt.j(e2);
            }
        }
    }

    public final void t6(int i, Integer num) {
        OrderDetailsContract.ViewState viewState;
        this.A = i;
        if (num != null) {
            this.C = Integer.valueOf(num.intValue());
        }
        MutableLiveData mutableLiveData = this.s;
        OrderDetailsContract.ViewState viewState2 = (OrderDetailsContract.ViewState) mutableLiveData.e();
        OrderDetailsFullPageErrorState orderDetailsFullPageErrorState = null;
        byte b = 0;
        if (viewState2 != null) {
            viewState = new OrderDetailsContract.ViewState(OrderDetailsContract.LoadingState.d, viewState2.b, viewState2.c);
        } else {
            viewState = new OrderDetailsContract.ViewState(OrderDetailsContract.LoadingState.d, orderDetailsFullPageErrorState, b == true ? 1 : 0, 6);
        }
        mutableLiveData.m(viewState);
        BuildersKt.c(ViewModelKt.a(this), null, null, new OrderDetailsViewModel$fetch$1(this, null), 3);
    }

    public final OnMyWayPreferences u6() {
        OrderSummaryData orderSummaryData;
        List<Object> items;
        OrderDetailsContract.ViewState viewState = (OrderDetailsContract.ViewState) this.w.e();
        if (viewState == null || (orderSummaryData = viewState.c) == null || (items = orderSummaryData.c.getItems()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof CurrentPickupOrderOverview) {
                arrayList.add(obj);
            }
        }
        CurrentPickupOrderOverview currentPickupOrderOverview = (CurrentPickupOrderOverview) CollectionsKt.F(arrayList);
        if (currentPickupOrderOverview != null) {
            return currentPickupOrderOverview.n;
        }
        return null;
    }

    public final boolean v6() {
        boolean z;
        OrderSummaryData orderSummaryData = ((OrderDetailsContract.ViewState) LiveDataExtKt.a(this.w)).c;
        if (orderSummaryData != null ? orderSummaryData.i : false) {
            String orderId = String.valueOf(this.A);
            PerfectOrderInteractor perfectOrderInteractor = this.n;
            perfectOrderInteractor.getClass();
            Intrinsics.h(orderId, "orderId");
            PerfectOrderDataSource perfectOrderDataSource = perfectOrderInteractor.f7780a.f7781a;
            SharedPreferences sharedPreferences = perfectOrderDataSource.f7779a;
            Set<String> set = EmptySet.d;
            Set<String> stringSet = sharedPreferences.getStringSet("set_of_order_ids", set);
            if (stringSet == null) {
                stringSet = set;
            }
            if (stringSet.contains(orderId)) {
                z = false;
            } else {
                SharedPreferences sharedPreferences2 = perfectOrderDataSource.f7779a;
                Set<String> stringSet2 = sharedPreferences2.getStringSet("set_of_order_ids", set);
                if (stringSet2 != null) {
                    set = stringSet2;
                }
                LinkedHashSet linkedHashSetH = SetsKt.h(set, orderId);
                SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                editorEdit.putStringSet("set_of_order_ids", linkedHashSetH);
                editorEdit.apply();
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void w6() {
        MutableLiveData mutableLiveData = this.s;
        OrderDetailsContract.ViewState viewState = (OrderDetailsContract.ViewState) mutableLiveData.e();
        mutableLiveData.m(viewState != null ? new OrderDetailsContract.ViewState(OrderDetailsContract.LoadingState.e, viewState.b, viewState.c) : null);
        BuildersKt.c(ViewModelKt.a(this), null, null, new OrderDetailsViewModel$locationPermissionGrantedForTracking$1(this, null), 3);
    }

    public final void x6(StepsToolTip stepsToolTip) {
        if (stepsToolTip != null) {
            this.i.c(OrderDetailsActions.N);
            this.u.f(new OrderDetailsContract.Actions.OpenProgressStepperInfoModal(stepsToolTip));
        }
    }

    public final void y6(OrderSummaryData orderSummaryData) {
        Object next;
        String str;
        Iterator<T> it = orderSummaryData.c.getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof CurrentPickupLocationTrackingStatus) {
                    break;
                }
            }
        }
        if (next != null) {
            OrderDetailsActions orderDetailsActions = OrderDetailsActions.F;
            TrackableValue trackableValue = TrackableValue.o0;
            int iOrdinal = ((CurrentPickupLocationTrackingStatus) next).c.ordinal();
            if (iOrdinal == 0) {
                str = "off";
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "on";
            }
            this.i.j(orderDetailsActions, TrackingMetadata.Companion.a(trackableValue, str));
        }
    }
}
