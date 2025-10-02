package au.com.woolworths.feature.shop.instore.cart.di;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.instore.cart.domain.InstoreCartRepository;
import au.com.woolworths.feature.shop.instore.cart.domain.InstoreCartRepositoryImpl;
import com.apollographql.apollo.ApolloClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstoreCartAppModule_ProvideInstoreCartRepositoryFactory implements Factory<InstoreCartRepository> {
    public static InstoreCartRepositoryImpl a(InstoreCartAppModule instoreCartAppModule, ApolloClient apolloClient, DispatcherProvider dispatcherProvider, FeatureToggleManager featureToggleManager) {
        instoreCartAppModule.getClass();
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new InstoreCartRepositoryImpl(apolloClient, dispatcherProvider, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
