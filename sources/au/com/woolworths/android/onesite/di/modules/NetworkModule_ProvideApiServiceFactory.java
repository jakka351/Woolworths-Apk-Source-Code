package au.com.woolworths.android.onesite.di.modules;

import au.com.woolworths.android.onesite.appdata.AppBuildConfig;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.network.ApiInterface;
import au.com.woolworths.android.onesite.network.ApiService;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.checkout.network.CheckoutApiInterface;
import au.com.woolworths.shop.checkout.domain.interactor.MakePayment;
import au.com.woolworths.shop.checkout.domain.interactor.MakeZeroPayment;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class NetworkModule_ProvideApiServiceFactory implements Factory<ApiService> {
    public static ApiService a(NetworkModule networkModule, ApiInterface apiInterface, CheckoutApiInterface checkoutApiInterface, Lazy accountInteractorLazy, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, AppConfigurationInteractor appConfigurationInteractor, SchedulersProvider schedulersProvider, AppBuildConfig appBuildConfig, MakePayment makePayment, MakeZeroPayment makeZeroPayment, FeatureToggleManager featureToggleManager) {
        networkModule.getClass();
        Intrinsics.h(apiInterface, "apiInterface");
        Intrinsics.h(accountInteractorLazy, "accountInteractorLazy");
        Intrinsics.h(appConfigurationInteractor, "appConfigurationInteractor");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(appBuildConfig, "appBuildConfig");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new ApiService(apiInterface, checkoutApiInterface, accountInteractorLazy, releaseSettingsInteractorImpl, appConfigurationInteractor, schedulersProvider, appBuildConfig, makePayment, makeZeroPayment, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
