package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.checkout.common.CheckoutInteractor;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.CollectDeviceData;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter;
import au.com.woolworths.android.onesite.network.ApiService;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ActivityModule_ProvideDigitalPayForOrderPresenterFactory implements Factory<DigitalPayForOrderPresenter> {
    public static DigitalPayForOrderPresenter a(ActivityModule activityModule, ApiService apiService, CheckoutInteractor checkoutInteractor, Gson gson, PaymentServicesInteractor paymentServicesInteractor, CollectionModeInteractor collectionModeInteractor, DeviceFingerprintInteractor deviceFingerprintInteractor, SchedulersProvider schedulersProvider, ShopAppTokenAuthenticator authenticator, NetworkExceptions networkExceptions, AnalyticsManager analyticsManager, PayClient payClient, CollectDeviceData collectDeviceData, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apiService, "apiService");
        Intrinsics.h(checkoutInteractor, "checkoutInteractor");
        Intrinsics.h(gson, "gson");
        Intrinsics.h(paymentServicesInteractor, "paymentServicesInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(deviceFingerprintInteractor, "deviceFingerprintInteractor");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(authenticator, "authenticator");
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(payClient, "payClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new DigitalPayForOrderPresenter(apiService, checkoutInteractor, gson, paymentServicesInteractor, collectionModeInteractor, deviceFingerprintInteractor, schedulersProvider, authenticator, networkExceptions, analyticsManager, payClient, collectDeviceData, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
