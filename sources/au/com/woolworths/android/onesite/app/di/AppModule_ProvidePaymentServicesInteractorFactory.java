package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.checkout.common.DigitalPaySdkHelper;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractorImpl;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
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
public final class AppModule_ProvidePaymentServicesInteractorFactory implements Factory<PaymentServicesInteractor> {
    public static PaymentServicesInteractorImpl a(AppModule appModule, CheckoutApiInterface checkoutApiInterface, ShopAccountInteractor accountInteractor, SchedulersProvider schedulersProvider, FeatureToggleManager featureToggleManager, NetworkExceptions networkExceptions, DigitalPaySdkHelper digitalPaySdkHelper) {
        appModule.getClass();
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(digitalPaySdkHelper, "digitalPaySdkHelper");
        return new PaymentServicesInteractorImpl(checkoutApiInterface, accountInteractor, schedulersProvider, featureToggleManager, networkExceptions, digitalPaySdkHelper);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
