package au.com.woolworths.shop.checkout.di;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.shop.checkout.data.source.RemoteCheckoutTimeSelectorRepository;
import au.com.woolworths.shop.checkout.domain.CheckoutTimeSelectorRepository;
import com.apollographql.apollo.ApolloClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopCheckoutAppModule_ProvideCheckoutTimeSelectorRepository$shop_checkout_releaseFactory implements Factory<CheckoutTimeSelectorRepository> {
    public static RemoteCheckoutTimeSelectorRepository a(ShopCheckoutAppModule shopCheckoutAppModule, ApolloClient apolloClient, DispatcherProvider dispatcherProvider, FeatureToggleManager featureToggleManager) {
        shopCheckoutAppModule.getClass();
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new RemoteCheckoutTimeSelectorRepository(apolloClient, dispatcherProvider, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
