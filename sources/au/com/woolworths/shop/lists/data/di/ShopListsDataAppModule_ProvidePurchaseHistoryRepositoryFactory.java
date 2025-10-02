package au.com.woolworths.shop.lists.data.di;

import au.com.woolworths.shop.lists.data.repository.PurchaseHistoryRepository;
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
public final class ShopListsDataAppModule_ProvidePurchaseHistoryRepositoryFactory implements Factory<PurchaseHistoryRepository> {
    public static PurchaseHistoryRepository a(ShopListsDataAppModule shopListsDataAppModule, ApolloClient apolloClient) {
        shopListsDataAppModule.getClass();
        Intrinsics.h(apolloClient, "apolloClient");
        return new PurchaseHistoryRepository(apolloClient);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
