package androidx.camera.camera2.interop;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.camera.core.streamsharing.VirtualCameraControl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.MediaLoadData;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManagerBaseImpl;
import au.com.woolworths.android.onesite.featuretoggles.FirebaseRepository;
import au.com.woolworths.android.onesite.featuretoggles.RemoteConfigSyncState;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$linkPayPalAccountWithNonce$1$1;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.ExpiredCreditCardRecyclerViewAdapter;
import au.com.woolworths.android.onesite.modules.checkout.paypal.PayPalData;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.ItemInfoSectionFooterBindingModel_;
import au.com.woolworths.base.shopapp.data.models.InfoSectionFooter;
import au.com.woolworths.base.shopapp.ui.infosection.InfoSectionEpoxyController;
import au.com.woolworths.feature.rewards.offers.ItemRewardsOfferTileCompatBindingModel_;
import au.com.woolworths.feature.rewards.offers.ItemRewardsProductOfferTileBindingModel_;
import au.com.woolworths.feature.rewards.offers.ItemSpinSurpriseBannerBindingModel_;
import au.com.woolworths.feature.rewards.offers.ItemStandardBannerBindingModel_;
import au.com.woolworths.feature.rewards.offers.ProductOfferTile;
import au.com.woolworths.feature.rewards.offers.RewardsOffersEpoxyController;
import au.com.woolworths.feature.rewards.offers.SpinSurpriseBannerViewItem;
import au.com.woolworths.feature.rewards.offers.StandardBannerViewItem;
import au.com.woolworths.feature.shop.myorders.ItemCurrentDeliveryOrderOverviewBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemCurrentPickupOrderOverviewBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemDeliveryInstructionsBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrderCompactCardTileListSkeletonBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemOrderOverviewBindingModel_;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsController;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentDeliveryOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryInstructionsData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderOverview;
import au.com.woolworths.feature.shop.myorders.orders.OrdersActivity;
import au.com.woolworths.feature.shop.myorders.orders.list.OrderListLoader;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersController;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersTab;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.shop.collectionmode.LegacyShoppingModeRepositoryImpl;
import au.com.woolworths.geolocation.location.DeviceLocationServiceCallback;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.geolocation.location.LocationInteractor$requestLocationIfEmptyCache$1;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zzd;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.RemoteConfigKt;
import com.woolworths.R;
import io.reactivex.MaybeEmitter;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import timber.log.Timber;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Config.OptionMatcher, AsyncFunction, ListenerSet.Event, ListenerSet.IterationFinishedEvent, OnCompleteListener, SingleOnSubscribe, RecyclerViewListener.View, OnModelBoundListener, OnModelVisibilityStateChangedListener, TabLayoutMediator.TabConfigurationStrategy, Function {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener.View
    public void a(int i) {
        Activity activity;
        ExpiredCreditCardRecyclerViewAdapter expiredCreditCardRecyclerViewAdapter = (ExpiredCreditCardRecyclerViewAdapter) this.e;
        Context baseContext = (Context) this.f;
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = expiredCreditCardRecyclerViewAdapter.k;
        digitalPayForOrderPresenter.Z();
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (baseContext instanceof Activity) {
                    activity = (Activity) baseContext;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
        }
        if (activity != null) {
            ActivityExtKt.a(activity);
        }
        digitalPayForOrderPresenter.i0(-1);
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        VirtualCameraControl virtualCameraControl = (VirtualCameraControl) this.e;
        ArrayList arrayList = (ArrayList) this.f;
        androidx.camera.core.streamsharing.b bVar = virtualCameraControl.c;
        Object objA = 100;
        try {
            objA = ((CaptureConfig) arrayList.get(0)).b.a(CaptureConfig.j);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objA;
        Objects.requireNonNull(num);
        final int iIntValue = num.intValue();
        Object objA2 = 0;
        try {
            objA2 = ((CaptureConfig) arrayList.get(0)).b.a(CaptureConfig.i);
        } catch (IllegalArgumentException unused2) {
        }
        Integer num2 = (Integer) objA2;
        Objects.requireNonNull(num2);
        final int iIntValue2 = num2.intValue();
        SurfaceProcessorNode surfaceProcessorNode = ((StreamSharing) bVar.e).t;
        if (surfaceProcessorNode == null) {
            return Futures.e(new Exception("Failed to take picture: pipeline is not ready."));
        }
        final DefaultSurfaceProcessor defaultSurfaceProcessor = surfaceProcessorNode.f551a;
        return Futures.h(CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.b
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                AutoValue_DefaultSurfaceProcessor_PendingSnapshot autoValue_DefaultSurfaceProcessor_PendingSnapshot = new AutoValue_DefaultSurfaceProcessor_PendingSnapshot(iIntValue, iIntValue2, completer);
                DefaultSurfaceProcessor defaultSurfaceProcessor2 = defaultSurfaceProcessor;
                defaultSurfaceProcessor2.d(new c(0, defaultSurfaceProcessor2, autoValue_DefaultSurfaceProcessor_PendingSnapshot), new d(completer, 0));
                return "DefaultSurfaceProcessor#snapshot";
            }
        }));
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void b(Object obj, FlagSet flagSet) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.w((Player) this.f, new AnalyticsListener.Events(flagSet, ((DefaultAnalyticsCollector) this.e).h));
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void c(TabLayout.Tab tab, int i) {
        OrdersTab ordersTab;
        OrdersActivity ordersActivity = (OrdersActivity) this.e;
        OrdersActivity ordersActivity2 = (OrdersActivity) this.f;
        int i2 = OrdersActivity.C;
        tab.e = LayoutInflater.from(tab.g.getContext()).inflate(R.layout.epoxy_item_orders_tab, (ViewGroup) tab.g, false);
        tab.c();
        List list = (List) ordersActivity.O4().k.e();
        tab.b((list == null || (ordersTab = (OrdersTab) list.get(i)) == null) ? null : ordersTab.d.getText(ordersActivity2));
    }

    @Override // io.reactivex.SingleOnSubscribe
    public void d(SingleEmitter singleEmitter) {
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) this.e;
        digitalPayForOrderPresenter.m.d(((PayPalData) this.f).f4300a.d, new DigitalPayForOrderPresenter$linkPayPalAccountWithNonce$1$1(digitalPayForOrderPresenter.i, digitalPayForOrderPresenter.j, singleEmitter));
    }

    public void e(DataBindingEpoxyModel dataBindingEpoxyModel, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        switch (this.d) {
            case 17:
                RewardsOffersEpoxyController.buildSpinSurpriseBannerIfFeatureEnabled$lambda$12$lambda$11((RewardsOffersEpoxyController) this.e, (SpinSurpriseBannerViewItem) this.f, (ItemSpinSurpriseBannerBindingModel_) dataBindingEpoxyModel, dataBindingHolder, i);
                break;
            case 18:
                RewardsOffersEpoxyController.buildStandardBanner$lambda$9$lambda$8((RewardsOffersEpoxyController) this.e, (StandardBannerViewItem) this.f, (ItemStandardBannerBindingModel_) dataBindingEpoxyModel, dataBindingHolder, i);
                break;
            case 19:
                RewardsOffersEpoxyController.buildNormalOfferCard$lambda$36$lambda$35((RewardsOffersEpoxyController) this.e, (OfferViewItem) this.f, (ItemRewardsOfferTileCompatBindingModel_) dataBindingEpoxyModel, dataBindingHolder, i);
                break;
            default:
                OrdersController.buildModels$lambda$7$lambda$5$lambda$4((OrdersController) this.e, (OrderListLoader) this.f, (ItemOrderCompactCardTileListSkeletonBindingModel_) dataBindingEpoxyModel, dataBindingHolder, i);
                break;
        }
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void g(int i, EpoxyModel epoxyModel, Object obj) {
        switch (this.d) {
            case 15:
                InfoSectionEpoxyController.buildModels$lambda$8$lambda$7$lambda$6$lambda$5((InfoSectionFooter) this.e, (InfoSectionEpoxyController) this.f, (ItemInfoSectionFooterBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 16:
                RewardsOffersEpoxyController.buildProductOfferCarousel$lambda$23$lambda$21((RewardsOffersEpoxyController) this.e, (ProductOfferTile.DataTile) this.f, (ItemRewardsProductOfferTileBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 17:
            case 18:
            case 19:
            default:
                OrderDetailsController.createEpoxyItem$lambda$9$lambda$8((DeliveryInstructionsData) this.e, (OrderDetailsController) this.f, (ItemDeliveryInstructionsBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 20:
                OrderDetailsController.createLegacyCurrentDeliveryOrderOverview$lambda$50$lambda$49((CurrentDeliveryOrderOverview) this.e, (OrderDetailsController) this.f, (ItemCurrentDeliveryOrderOverviewBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 21:
                OrderDetailsController.createEpoxyItem$lambda$33$lambda$32((OrderOverview) this.e, (OrderDetailsController) this.f, (ItemOrderOverviewBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 22:
                OrderDetailsController.createLegacyEpoxyItem$lambda$42$lambda$41((CurrentPickupOrderOverview) this.e, (OrderDetailsController) this.f, (ItemCurrentPickupOrderOverviewBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.d) {
            case 2:
                ((AnalyticsListener) obj).f((AnalyticsListener.EventTime) this.e, (Exception) this.f);
                break;
            case 3:
                ((AnalyticsListener) obj).m((AnalyticsListener.EventTime) this.e, (PlaybackParameters) this.f);
                break;
            case 4:
                ((AnalyticsListener) obj).t((AnalyticsListener.EventTime) this.e, (Tracks) this.f);
                break;
            case 5:
                ((AnalyticsListener) obj).v((AnalyticsListener.EventTime) this.e, (MediaLoadData) this.f);
                break;
            case 6:
                ((AnalyticsListener) obj).E((AnalyticsListener.EventTime) this.e, (DecoderCounters) this.f);
                break;
            case 7:
                ((AnalyticsListener) obj).B((AnalyticsListener.EventTime) this.e, (Metadata) this.f);
                break;
            case 8:
                ((AnalyticsListener) obj).D((AnalyticsListener.EventTime) this.e, (PlaybackException) this.f);
                break;
            case 9:
                AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) this.e;
                VideoSize videoSize = (VideoSize) this.f;
                ((AnalyticsListener) obj).u(eventTime, videoSize);
                int i = videoSize.f2887a;
                break;
            default:
                ((AnalyticsListener) obj).z((AnalyticsListener.EventTime) this.e, this.f);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [au.com.woolworths.geolocation.location.LocationInteractor$requestLocationIfEmptyCache$1] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) throws Throwable {
        switch (this.d) {
            case 12:
                FeatureToggleManagerBaseImpl featureToggleManagerBaseImpl = (FeatureToggleManagerBaseImpl) this.e;
                MutableStateFlow mutableStateFlow = featureToggleManagerBaseImpl.n;
                ConfigUpdate configUpdate = (ConfigUpdate) this.f;
                Intrinsics.h(task, "task");
                if (task.isSuccessful()) {
                    MutableStateFlow mutableStateFlow2 = featureToggleManagerBaseImpl.f;
                    mutableStateFlow.setValue(RemoteConfigSyncState.e);
                    ArrayList arrayListJ0 = CollectionsKt.J0(EmptyList.d);
                    FirebaseRepository firebaseRepository = featureToggleManagerBaseImpl.f4254a;
                    try {
                        long jB = firebaseRepository.b();
                        long j = featureToggleManagerBaseImpl.d;
                        if (j != jB) {
                            firebaseRepository.a(j);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Timber.f27013a.f(e);
                    }
                    Set<String> setB = configUpdate.b();
                    Intrinsics.g(setB, "getUpdatedKeys(...)");
                    for (String str : setB) {
                        MutableStateFlow mutableStateFlow3 = (MutableStateFlow) featureToggleManagerBaseImpl.l.get(str);
                        if (mutableStateFlow3 != null) {
                            FirebaseRemoteConfig firebaseRemoteConfig = featureToggleManagerBaseImpl.e;
                            Intrinsics.e(str);
                            mutableStateFlow3.setValue(RemoteConfigKt.a(firebaseRemoteConfig, str).asString());
                        }
                        if (!((List) mutableStateFlow2.getValue()).contains(str)) {
                            Intrinsics.e(str);
                            arrayListJ0.add(str);
                        }
                    }
                    if (arrayListJ0.size() > 0) {
                        mutableStateFlow2.setValue(CollectionsKt.c0(arrayListJ0, (Collection) mutableStateFlow2.getValue()));
                        break;
                    }
                } else {
                    mutableStateFlow.setValue(RemoteConfigSyncState.d);
                    break;
                }
                break;
            case 27:
                zzd zzdVar = (zzd) this.e;
                Activity activity = (Activity) this.f;
                Intrinsics.h(task, "task");
                try {
                    if (task.isSuccessful()) {
                        Intrinsics.e(zzdVar.a(activity, (ReviewInfo) task.getResult()));
                    } else {
                        Timber.f27013a.h("Cannot launch in-app review: " + task.getResult(), new Object[0]);
                    }
                    break;
                } catch (Exception e2) {
                    Timber.f27013a.h(android.support.v4.media.session.a.n(e2, "Cannot get in-app review request result: "), new Object[0]);
                    return;
                }
            case 28:
                final LocationInteractor locationInteractor = (LocationInteractor) this.e;
                final MaybeEmitter maybeEmitter = (MaybeEmitter) this.f;
                Intrinsics.h(task, "it");
                if (task.isSuccessful()) {
                    Location location = (Location) task.getResult();
                    if (location != null) {
                        maybeEmitter.onSuccess(location);
                    }
                    LocationInteractor$requestLocationIfEmptyCache$1 locationInteractor$requestLocationIfEmptyCache$1 = locationInteractor.d;
                    FusedLocationProviderClient fusedLocationProviderClient = locationInteractor.c;
                    if (locationInteractor$requestLocationIfEmptyCache$1 != null) {
                        fusedLocationProviderClient.removeLocationUpdates(locationInteractor$requestLocationIfEmptyCache$1);
                    }
                    locationInteractor.d = null;
                    locationInteractor.d = new LocationCallback() { // from class: au.com.woolworths.geolocation.location.LocationInteractor$requestLocationIfEmptyCache$1
                        @Override // com.google.android.gms.location.LocationCallback
                        public final void onLocationResult(LocationResult locationResult) {
                            Intrinsics.h(locationResult, "locationResult");
                            LocationInteractor locationInteractor2 = locationInteractor;
                            LocationInteractor$requestLocationIfEmptyCache$1 locationInteractor$requestLocationIfEmptyCache$12 = locationInteractor2.d;
                            if (locationInteractor$requestLocationIfEmptyCache$12 != null) {
                                locationInteractor2.c.removeLocationUpdates(locationInteractor$requestLocationIfEmptyCache$12);
                            }
                            locationInteractor2.d = null;
                            List<Location> locations = locationResult.getLocations();
                            Intrinsics.g(locations, "getLocations(...)");
                            boolean zIsEmpty = locations.isEmpty();
                            MaybeEmitter maybeEmitter2 = maybeEmitter;
                            if (zIsEmpty) {
                                maybeEmitter2.onComplete();
                            } else {
                                maybeEmitter2.onSuccess(locationResult.getLocations().get(0));
                            }
                        }
                    };
                    LocationRequest interval = new LocationRequest().setPriority(100).setInterval(5L);
                    Intrinsics.g(interval, "setInterval(...)");
                    LocationInteractor$requestLocationIfEmptyCache$1 locationInteractor$requestLocationIfEmptyCache$12 = locationInteractor.d;
                    Intrinsics.f(locationInteractor$requestLocationIfEmptyCache$12, "null cannot be cast to non-null type com.google.android.gms.location.LocationCallback");
                    fusedLocationProviderClient.requestLocationUpdates(interval, locationInteractor$requestLocationIfEmptyCache$12, (Looper) null);
                    break;
                } else {
                    maybeEmitter.onComplete();
                    break;
                }
            default:
                DeviceLocationServiceCallback deviceLocationServiceCallback = (DeviceLocationServiceCallback) this.e;
                AppCompatActivity appCompatActivity = (AppCompatActivity) this.f;
                Intrinsics.h(task, "task");
                try {
                    task.getResult(ApiException.class);
                    deviceLocationServiceCallback.M();
                    break;
                } catch (ApiException e3) {
                    int statusCode = e3.getStatusCode();
                    if (statusCode != 6) {
                        if (statusCode != 8502) {
                            deviceLocationServiceCallback.H4();
                            return;
                        } else {
                            if (deviceLocationServiceCallback.P() != 0) {
                                new AlertDialog.Builder(appCompatActivity).setTitle(R.string.device_location_unavailable_title).setMessage(deviceLocationServiceCallback.P()).setPositiveButton(R.string.ok, new au.com.woolworths.base.wallet.digipay.framesview.a(deviceLocationServiceCallback, 7)).setCancelable(false).create().show();
                                return;
                            }
                            return;
                        }
                    }
                    try {
                        ((ResolvableApiException) e3).startResolutionForResult(appCompatActivity, 102);
                        return;
                    } catch (IntentSender.SendIntentException unused) {
                        deviceLocationServiceCallback.I2();
                    }
                }
        }
    }

    public /* synthetic */ e(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        this.d = 10;
        this.e = eventTime;
        this.f = obj;
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply, reason: collision with other method in class */
    public Object mo0apply(Object obj) {
        LegacyShoppingModeRepositoryImpl legacyShoppingModeRepositoryImpl = (LegacyShoppingModeRepositoryImpl) this.e;
        String str = (String) this.f;
        if (legacyShoppingModeRepositoryImpl.i.c(BaseShopAppFeature.n)) {
            return legacyShoppingModeRepositoryImpl.h.d(str);
        }
        return legacyShoppingModeRepositoryImpl.d.c(str);
    }
}
