package com.woolworths.scanlibrary.ui.tap.tapon;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$boolean$$inlined$delegate$1;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.d;
import com.google.gson.Gson;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.BaseDisposableObserver;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeature;
import com.woolworths.scanlibrary.configuration.ScanAndGoRemoteConfig;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.cart.SessionInfo;
import com.woolworths.scanlibrary.data.firebase.auth.FirebaseAuthenticationRepositoryImpl;
import com.woolworths.scanlibrary.domain.cart.CartSessionManager;
import com.woolworths.scanlibrary.domain.locator.GetStoreDetailsUseCase;
import com.woolworths.scanlibrary.domain.locator.GetTapOnStoreDetailsUseCase;
import com.woolworths.scanlibrary.domain.receipt.GetParkingReceiptUC;
import com.woolworths.scanlibrary.models.authentication.Banner;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.models.receipt.Receipt;
import com.woolworths.scanlibrary.models.receipt.Voucher;
import com.woolworths.scanlibrary.models.receipt.Vouchers;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.models.tapon.StartShopInfo;
import com.woolworths.scanlibrary.models.tapon.StoreInfo;
import com.woolworths.scanlibrary.models.tapon.TapOnResponse;
import com.woolworths.scanlibrary.models.tapon.TapOnStoreDetailsRequest;
import com.woolworths.scanlibrary.ui.tap.analytics.TapOnActionData;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import com.woolworths.scanlibrary.util.event.Event;
import com.woolworths.scanlibrary.util.resource.ResourceResolverImpl;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.single.SingleObserveOn;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$View;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$Presenter;", "StoreDetailsByNoObserver", "StoreDetailsObserver", "ParkingReceiptObserver", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TapOnPresenter extends BasePresenter<TapOnContract.View> implements TapOnContract.Presenter {
    public final AuthenticatedUser c;
    public final SessionInfo d;
    public final GetTapOnStoreDetailsUseCase e;
    public final GetParkingReceiptUC f;
    public final CartSessionManager g;
    public final DeviceInfoProvider h;
    public final UserConfigurations i;
    public final FirebaseAuthenticationRepositoryImpl j;
    public final AnalyticsManager k;
    public final FeatureToggleManager l;
    public final DeviceFingerprintInteractor m;
    public final DispatcherProvider n;
    public final FirebaseCrashlytics o;
    public final FirebasePerfMonitor p;
    public final ResourceResolverImpl q;
    public final MutableLiveData r;
    public final CompositeDisposable s;
    public String t;
    public DeviceFingerprintInteractor.ProfileResult u;
    public Voucher v;
    public StoreInfo w;
    public ContextScope x;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnPresenter$Companion;", "", "", "SNG_MERCHANT_ID", "Ljava/lang/String;", "TAPON_EVENT_DESCRIPTION_SUCCESS", "TAPON_EVENT_DESCRIPTION_FAILURE", "TAPON_ERROR_REASON_TIMEOUT", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnPresenter$ParkingReceiptObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/receipt/GetParkingReceiptUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ParkingReceiptObserver extends BaseDisposableObserver<GetParkingReceiptUC.ResponseValue> {
        public final TapOnContract.View g;
        public final MutableLiveData h;
        public final /* synthetic */ TapOnPresenter i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParkingReceiptObserver(TapOnPresenter tapOnPresenter, TapOnContract.View view, MutableLiveData tapOnLiveEvent) {
            super(view, 17);
            Intrinsics.h(view, "view");
            Intrinsics.h(tapOnLiveEvent, "tapOnLiveEvent");
            this.i = tapOnPresenter;
            this.g = view;
            this.h = tapOnLiveEvent;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void c(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
            this.i.v = null;
            this.h.j(new Event(TapOnContract.ViewState.PARKING_NOT_AVAILABLE.f21352a));
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void e(MvpView.ErrorType errorType) {
            this.i.v = null;
            this.h.j(new Event(TapOnContract.ViewState.PARKING_NOT_AVAILABLE.f21352a));
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onError(Throwable e) {
            Intrinsics.h(e, "e");
            this.i.v = null;
            this.h.j(new Event(TapOnContract.ViewState.PARKING_NOT_AVAILABLE.f21352a));
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            Voucher parking;
            String barcode;
            GetParkingReceiptUC.ResponseValue response = (GetParkingReceiptUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            Receipt receipt = response.f21201a;
            Vouchers vouchers = receipt.getVouchers();
            MutableLiveData mutableLiveData = this.h;
            TapOnPresenter tapOnPresenter = this.i;
            if (vouchers == null || (parking = vouchers.getParking()) == null || (barcode = parking.getBarcode()) == null || barcode.length() <= 0) {
                tapOnPresenter.v = null;
                mutableLiveData.j(new Event(TapOnContract.ViewState.PARKING_NOT_AVAILABLE.f21352a));
            } else {
                tapOnPresenter.v = receipt.getVouchers().getParking();
                mutableLiveData.j(new Event(TapOnContract.ViewState.PARKING_AVAILABLE.f21351a));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnPresenter$StoreDetailsByNoObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/models/store/Store;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoreDetailsByNoObserver extends BaseDisposableObserver<Store> {
        public final TapOnContract.View g;
        public final MutableLiveData h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StoreDetailsByNoObserver(TapOnContract.View view, MutableLiveData tapOnLiveEvent) {
            super(view, 7);
            Intrinsics.h(view, "view");
            Intrinsics.h(tapOnLiveEvent, "tapOnLiveEvent");
            this.g = view;
            this.h = tapOnLiveEvent;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void c(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
            if (i != 404) {
                this.e.n(i, i2, apigeeErrorResponse, new h(20));
            } else {
                this.g.N3(false);
                this.h.j(new Event(TapOnContract.ViewState.SUCCESS_WITH_STORE_DETAILS.f21353a));
            }
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void e(MvpView.ErrorType errorType) {
            this.e.i0(errorType);
            this.h.j(new Event(TapOnContract.ViewState.NON_APPLICATION_FAILURE.f21350a));
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            Store response = (Store) obj;
            Intrinsics.h(response, "response");
            Timber.f27013a.h("Successfully fetched the details of the store", new Object[0]);
            this.g.N3(false);
            this.h.j(new Event(TapOnContract.ViewState.SUCCESS_WITH_STORE_DETAILS.f21353a));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnPresenter$StoreDetailsObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/locator/GetTapOnStoreDetailsUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class StoreDetailsObserver extends BaseDisposableObserver<GetTapOnStoreDetailsUseCase.ResponseValue> {
        public final TapOnContract.View g;
        public final CartSessionManager h;
        public final MutableLiveData i;
        public final SessionInfo j;
        public final String k;
        public final /* synthetic */ TapOnPresenter l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StoreDetailsObserver(TapOnPresenter tapOnPresenter, TapOnContract.View view, CartSessionManager cartSessionManager, MutableLiveData tapOnLiveEvent, SessionInfo sessionInfo, String tapOnDeviceId) {
            super(view, 7);
            Intrinsics.h(view, "view");
            Intrinsics.h(cartSessionManager, "cartSessionManager");
            Intrinsics.h(tapOnLiveEvent, "tapOnLiveEvent");
            Intrinsics.h(sessionInfo, "sessionInfo");
            Intrinsics.h(tapOnDeviceId, "tapOnDeviceId");
            this.l = tapOnPresenter;
            this.g = view;
            this.h = cartSessionManager;
            this.i = tapOnLiveEvent;
            this.j = sessionInfo;
            this.k = tapOnDeviceId;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(int r6, int r7, com.woolworths.scanlibrary.models.error.ApigeeErrorResponse r8, kotlin.jvm.functions.Function0 r9) {
            /*
                r5 = this;
                r9 = 406(0x196, float:5.69E-43)
                com.woolworths.scanlibrary.base.mvp.MvpView r0 = r5.e
                r1 = 0
                com.woolworths.scanlibrary.ui.tap.tapon.TapOnPresenter r2 = r5.l
                com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract$View r3 = r5.g
                if (r6 != r9) goto L4d
                if (r8 == 0) goto L12
                java.lang.String r9 = r8.getErrorCode()
                goto L13
            L12:
                r9 = r1
            L13:
                java.lang.String r4 = "40617"
                boolean r9 = kotlin.jvm.internal.Intrinsics.c(r9, r4)
                if (r9 == 0) goto L4d
                au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r8 = r2.l
                com.woolworths.scanlibrary.configuration.ScanAndGoFeature r9 = com.woolworths.scanlibrary.configuration.ScanAndGoFeature.e
                boolean r8 = r8.c(r9)
                if (r8 == 0) goto L47
                com.woolworths.scanlibrary.models.error.ApigeeErrorResponse r8 = new com.woolworths.scanlibrary.models.error.ApigeeErrorResponse
                r8.<init>()
                r8.setErrorCode(r4)
                com.woolworths.scanlibrary.util.resource.ResourceResolverImpl r9 = r2.q
                r1 = 2132019457(0x7f140901, float:1.967725E38)
                java.lang.String r9 = r9.getString(r1)
                r8.setDescription(r9)
                au.com.woolworths.android.onesite.deeplink.h r9 = new au.com.woolworths.android.onesite.deeplink.h
                r1 = 20
                r9.<init>(r1)
                r0.n(r6, r7, r8, r9)
                r3.d3()
                goto La2
            L47:
                java.lang.String r6 = r5.k
                r3.m0(r6)
                goto La2
            L4d:
                r9 = 404(0x194, float:5.66E-43)
                if (r6 != r9) goto L95
                timber.log.Timber$Forest r7 = timber.log.Timber.f27013a
                java.lang.String r9 = "Error getting the details of the store ["
                java.lang.String r0 = "]"
                java.lang.String r6 = YU.a.e(r6, r9, r0)
                r9 = 0
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r7.o(r6, r0)
                r3.N3(r9)
                if (r8 == 0) goto L6a
                java.lang.String r1 = r8.getErrorCode()
            L6a:
                java.lang.String r6 = "40423"
                boolean r6 = kotlin.jvm.internal.Intrinsics.c(r1, r6)
                androidx.lifecycle.MutableLiveData r7 = r5.i
                if (r6 == 0) goto L8a
                com.woolworths.scanlibrary.util.event.Event r6 = new com.woolworths.scanlibrary.util.event.Event
                com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract$ViewState$GUEST_ACCESS_UNAVAILABLE r9 = new com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract$ViewState$GUEST_ACCESS_UNAVAILABLE
                java.lang.String r0 = r8.getMessage()
                java.lang.String r8 = r8.getDescription()
                r9.<init>(r0, r8)
                r6.<init>(r9)
                r7.j(r6)
                goto La2
            L8a:
                com.woolworths.scanlibrary.util.event.Event r6 = new com.woolworths.scanlibrary.util.event.Event
                com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract$ViewState$CANNOT_FETCH_STORE_DETAILS r8 = com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.ViewState.CANNOT_FETCH_STORE_DETAILS.f21348a
                r6.<init>(r8)
                r7.j(r6)
                goto La2
            L95:
                au.com.woolworths.android.onesite.deeplink.h r9 = new au.com.woolworths.android.onesite.deeplink.h
                r1 = 20
                r9.<init>(r1)
                r0.n(r6, r7, r8, r9)
                r3.d3()
            La2:
                au.com.woolworths.android.onesite.analytics.AnalyticsManager r6 = r2.k
                com.woolworths.scanlibrary.ui.tap.analytics.TapOnActionData r7 = com.woolworths.scanlibrary.ui.tap.analytics.TapOnActionData.e
                au.com.woolworths.analytics.model.TrackableValue r8 = au.com.woolworths.analytics.model.TrackableValue.o0
                java.lang.String r9 = "beacon connection fail"
                au.com.woolworths.analytics.model.TrackingMetadata r8 = au.com.woolworths.analytics.model.TrackingMetadata.Companion.a(r8, r9)
                r6.j(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.ui.tap.tapon.TapOnPresenter.StoreDetailsObserver.c(int, int, com.woolworths.scanlibrary.models.error.ApigeeErrorResponse, kotlin.jvm.functions.Function0):void");
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void e(MvpView.ErrorType errorType) {
            this.e.i0(errorType);
            this.i.j(new Event(TapOnContract.ViewState.NON_APPLICATION_FAILURE.f21350a));
            this.l.k.j(TapOnActionData.e, TrackingMetadata.Companion.a(TrackableValue.o0, "beacon connection fail"));
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            GetTapOnStoreDetailsUseCase.ResponseValue response = (GetTapOnStoreDetailsUseCase.ResponseValue) obj;
            Intrinsics.h(response, "response");
            Timber.f27013a.h("Successfully fetched the details of the store", new Object[0]);
            TapOnResponse tapOnResponse = response.f21183a;
            StoreInfo storeInfo = tapOnResponse.getStoreInfo();
            TapOnPresenter tapOnPresenter = this.l;
            tapOnPresenter.w = storeInfo;
            boolean zIsScanGoEnabled = tapOnResponse.getStoreInfo().isScanGoEnabled();
            SessionInfo sessionInfo = this.j;
            SharedPreferenceExtKt$boolean$$inlined$delegate$1 sharedPreferenceExtKt$boolean$$inlined$delegate$1 = sessionInfo.i;
            KProperty[] kPropertyArr = SessionInfo.k;
            sharedPreferenceExtKt$boolean$$inlined$delegate$1.setValue(sessionInfo, kPropertyArr[8], Boolean.valueOf(zIsScanGoEnabled));
            sessionInfo.f21155a.setValue(sessionInfo, kPropertyArr[0], Integer.valueOf(tapOnResponse.getNo()));
            sessionInfo.c(tapOnResponse.getName());
            int no = tapOnResponse.getNo();
            String storeName = tapOnResponse.getName();
            String cartId = tapOnResponse.getCartId();
            CartSessionManager cartSessionManager = this.h;
            cartSessionManager.getClass();
            Intrinsics.h(storeName, "storeName");
            Intrinsics.h(cartId, "cartId");
            Store store = new Store(storeName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, no, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, null, 0, null, false, -67108866, 31, null);
            SessionInfo sessionInfo2 = cartSessionManager.f;
            sessionInfo2.f21155a.setValue(sessionInfo2, kPropertyArr[0], Integer.valueOf(store.getNo()));
            sessionInfo2.c(store.getName());
            CartSessionManager.e(cartSessionManager, cartId, 1);
            FirebaseCrashlytics firebaseCrashlytics = tapOnPresenter.o;
            int no2 = tapOnResponse.getNo();
            CrashlyticsCore crashlyticsCore = firebaseCrashlytics.f15252a;
            crashlyticsCore.o.f15286a.a(new d(crashlyticsCore, "store_id", Integer.toString(no2)));
            tapOnPresenter.k.j(TapOnActionData.e, TrackingMetadata.Companion.a(TrackableValue.o0, "beacon connection successful"));
            this.i.j(new Event(TapOnContract.ViewState.SUCCESS_WITH_STORE_DETAILS.f21353a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapOnPresenter(TapOnContract.View view, AuthenticatedUser authenticatedUser, SessionInfo sessionInfo, GetTapOnStoreDetailsUseCase getTapOnStoreDetailsUseCase, GetStoreDetailsUseCase getStoreDetailsUseCase, GetParkingReceiptUC getParkingReceiptUC, CartSessionManager cartSessionManager, DeviceInfoProvider deviceInfoProvider, UserConfigurations userConfigurations, FirebaseAuthenticationRepositoryImpl firebaseAuthenticationRepositoryImpl, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager, DeviceFingerprintInteractor deviceFingerprintInteractor, DispatcherProvider dispatcherProvider, FirebaseCrashlytics firebaseCrashlytics, FirebasePerfMonitor firebasePerfMonitor, ResourceResolverImpl resourceResolverImpl) {
        super(view);
        Intrinsics.h(sessionInfo, "sessionInfo");
        Intrinsics.h(cartSessionManager, "cartSessionManager");
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.h(userConfigurations, "userConfigurations");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(deviceFingerprintInteractor, "deviceFingerprintInteractor");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        this.c = authenticatedUser;
        this.d = sessionInfo;
        this.e = getTapOnStoreDetailsUseCase;
        this.f = getParkingReceiptUC;
        this.g = cartSessionManager;
        this.h = deviceInfoProvider;
        this.i = userConfigurations;
        this.j = firebaseAuthenticationRepositoryImpl;
        this.k = analyticsManager;
        this.l = featureToggleManager;
        this.m = deviceFingerprintInteractor;
        this.n = dispatcherProvider;
        this.o = firebaseCrashlytics;
        this.p = firebasePerfMonitor;
        this.q = resourceResolverImpl;
        this.r = new MutableLiveData();
        this.s = new CompositeDisposable();
        view.k1(this);
        analyticsManager.a(Screens.r);
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final void A(int i) {
        MvpView mvpView = this.f21139a;
        ((TapOnContract.View) mvpView).N3(true);
        CartSessionManager cartSessionManager = this.g;
        cartSessionManager.getClass();
        Timber.f27013a.h("restarting cart session", new Object[0]);
        ScanNGoRepository scanNGoRepository = cartSessionManager.e;
        SingleObserveOn singleObserveOnF = Single.j(scanNGoRepository.b(i), scanNGoRepository.a(i), new com.woolworths.scanlibrary.data.authentication.token.b(cartSessionManager, 2)).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "getView(...)");
        singleObserveOnF.a(new StoreDetailsByNoObserver((TapOnContract.View) mvpView, this.r));
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final void C0() {
        UserConfigurations userConfigurations = this.i;
        userConfigurations.g.setValue(userConfigurations, UserConfigurations.k[7], Boolean.TRUE);
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final boolean H0() {
        return this.i.a();
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final void J() {
        UserConfigurations userConfigurations = this.i;
        userConfigurations.i.setValue(userConfigurations, UserConfigurations.k[9], Boolean.FALSE);
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final void K() {
        this.p.c("sng_beacon_scan_native");
    }

    @Override // com.woolworths.scanlibrary.base.BasePresenter, com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void M0() {
        this.n.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
        JobImpl jobImplA = JobKt.a();
        defaultIoScheduler.getClass();
        this.x = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c(defaultIoScheduler, jobImplA));
        SingleObserveOn singleObserveOnF = this.f.b(new GetParkingReceiptUC.RequestValues()).f(AndroidSchedulers.a());
        MvpView mvpView = this.f21139a;
        Intrinsics.g(mvpView, "getView(...)");
        ParkingReceiptObserver parkingReceiptObserver = new ParkingReceiptObserver(this, (TapOnContract.View) mvpView, this.r);
        singleObserveOnF.a(parkingReceiptObserver);
        this.b.d(parkingReceiptObserver);
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    /* renamed from: Q0, reason: from getter */
    public final Voucher getV() {
        return this.v;
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final boolean S0() {
        StoreInfo storeInfo = this.w;
        if (storeInfo != null) {
            return storeInfo.getNotify_wifi();
        }
        return false;
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final void V0() {
        this.t = null;
        this.u = null;
        ScanAndGoFeature scanAndGoFeature = ScanAndGoFeature.d;
        FeatureToggleManager featureToggleManager = this.l;
        if (!featureToggleManager.c(scanAndGoFeature) || featureToggleManager.c(ScanAndGoFeature.e)) {
            return;
        }
        ContextScope contextScope = this.x;
        if (contextScope != null) {
            BuildersKt.c(contextScope, null, null, new TapOnPresenter$triggerDeviceProfiling$1(this, null), 3);
        } else {
            Intrinsics.p("presenterScope");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.BasePresenter, com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void X0() {
        super.X0();
        ContextScope contextScope = this.x;
        if (contextScope != null) {
            JobKt.d(contextScope.d);
        } else {
            Intrinsics.p("presenterScope");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final void Y() {
        this.j.b();
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final void a0() {
        this.s.e();
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final void b0(String str) {
        SessionInfo sessionInfo = this.d;
        sessionInfo.c.setValue(sessionInfo, SessionInfo.k[2], str);
        this.t = str;
        h1();
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final void c1() {
        CompositeDisposable compositeDisposable = this.s;
        compositeDisposable.e();
        ObservableObserveOn observableObserveOnF = Observable.k(15L, TimeUnit.SECONDS).f(AndroidSchedulers.a());
        LambdaObserver lambdaObserver = new LambdaObserver(new com.woolworths.scanlibrary.ui.tap.a(new i(this, 22), 3), Functions.e);
        observableObserveOnF.a(lambdaObserver);
        compositeDisposable.d(lambdaObserver);
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    /* renamed from: e0, reason: from getter */
    public final MutableLiveData getR() {
        return this.r;
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final boolean g0() {
        StoreInfo storeInfo = this.w;
        if (storeInfo == null || !storeInfo.getValidateEntryQRCode()) {
            return false;
        }
        SessionInfo sessionInfo = this.d;
        return !((Boolean) sessionInfo.h.getValue(sessionInfo, SessionInfo.k[7])).booleanValue();
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final String g1() {
        String strC = this.g.c();
        return strC == null ? "" : strC;
    }

    public final void h1() {
        String str;
        if (this.t != null) {
            ScanAndGoFeature scanAndGoFeature = ScanAndGoFeature.d;
            FeatureToggleManager featureToggleManager = this.l;
            if ((!featureToggleManager.c(scanAndGoFeature) || featureToggleManager.c(ScanAndGoFeature.e) || this.u != null) && (str = this.t) != null) {
                DeviceFingerprintInteractor.ProfileResult profileResult = this.u;
                String str2 = profileResult instanceof DeviceFingerprintInteractor.ProfileResult.Success ? ((DeviceFingerprintInteractor.ProfileResult.Success) profileResult).f5170a : null;
                MvpView mvpView = this.f21139a;
                ((TapOnContract.View) mvpView).N3(true);
                this.d.a();
                DeviceInfoProvider deviceInfoProvider = this.h;
                deviceInfoProvider.d();
                String str3 = Build.MANUFACTURER;
                String deviceId = deviceInfoProvider.getDeviceId();
                String strA = YU.a.A("android ", deviceInfoProvider.getOsVersion());
                String appVersion = deviceInfoProvider.getAppVersion();
                AuthenticatedUser authenticatedUser = this.c;
                TapOnStoreDetailsRequest tapOnStoreDetailsRequest = new TapOnStoreDetailsRequest(str, str3, deviceId, strA, appVersion, ((String) authenticatedUser.h.getValue(authenticatedUser, AuthenticatedUser.i[7])).equals(Banner.GUEST.getBannerName()), str2);
                GetTapOnStoreDetailsUseCase.RequestValues requestValues = new GetTapOnStoreDetailsUseCase.RequestValues();
                requestValues.f21182a = tapOnStoreDetailsRequest;
                SingleObserveOn singleObserveOnF = this.e.b(requestValues).f(AndroidSchedulers.a());
                Intrinsics.g(mvpView, "getView(...)");
                StoreDetailsObserver storeDetailsObserver = new StoreDetailsObserver(this, (TapOnContract.View) mvpView, this.g, this.r, this.d, str);
                singleObserveOnF.a(storeDetailsObserver);
                this.b.d(storeDetailsObserver);
            }
        }
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final boolean j0() {
        UserConfigurations userConfigurations = this.i;
        return !((Boolean) userConfigurations.g.getValue(userConfigurations, UserConfigurations.k[7])).booleanValue();
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final String m0() {
        String message;
        Gson gson = new Gson();
        String string = this.q.getString(R.string.sng_label_scan_lists_note);
        try {
            message = ((StartShopInfo) gson.d(StartShopInfo.class, this.l.e(ScanAndGoRemoteConfig.d, false))).getMessage();
        } catch (Exception unused) {
        }
        return message == null ? string : message;
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract.Presenter
    public final void w0() {
        this.p.d("sng_beacon_scan_native");
    }
}
