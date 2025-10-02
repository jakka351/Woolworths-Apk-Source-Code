package au.com.woolworths.feature.shop.storelocator.di;

import au.com.woolworths.feature.shop.storelocator.StoreLocatorRepositoryImpl;
import au.com.woolworths.foundation.shop.storelocator.StoreLocatorRepository;
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
public final class ShopStoreLocatorAppModule_ProvideStoreLocatorRepositoryFactory implements Factory<StoreLocatorRepository> {
    public static StoreLocatorRepositoryImpl a(ShopStoreLocatorAppModule shopStoreLocatorAppModule, ApolloClient apolloClient) {
        shopStoreLocatorAppModule.getClass();
        Intrinsics.h(apolloClient, "apolloClient");
        return new StoreLocatorRepositoryImpl(apolloClient);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
