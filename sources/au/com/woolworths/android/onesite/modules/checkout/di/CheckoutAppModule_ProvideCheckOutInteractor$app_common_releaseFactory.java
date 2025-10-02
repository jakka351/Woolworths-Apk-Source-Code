package au.com.woolworths.android.onesite.modules.checkout.di;

import au.com.woolworths.android.onesite.appdata.AppBuildConfig;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.checkout.common.CheckoutInteractor;
import au.com.woolworths.android.onesite.modules.checkout.common.CheckoutInteractorImpl;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.checkout.network.CheckoutApiInterface;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CheckoutAppModule_ProvideCheckOutInteractor$app_common_releaseFactory implements Factory<CheckoutInteractor> {
    public static CheckoutInteractorImpl a(CheckoutAppModule checkoutAppModule, CheckoutApiInterface checkoutApiInterface, SchedulersProvider schedulersProvider, FeatureToggleManager featureToggleManager, ShopAccountInteractor accountInteractor, AppBuildConfig appBuildConfig) {
        checkoutAppModule.getClass();
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(appBuildConfig, "appBuildConfig");
        return new CheckoutInteractorImpl(checkoutApiInterface, schedulersProvider, accountInteractor, appBuildConfig);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
