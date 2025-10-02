package au.com.woolworths.shop.lists.data.di;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.shop.lists.data.repository.SimilarProductsRepository;
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
public final class ShopListsDataAppModule_ProvideSimilarProductsRepositoryFactory implements Factory<SimilarProductsRepository> {
    public static SimilarProductsRepository a(ShopListsDataAppModule shopListsDataAppModule, ApolloClient apolloClient, FeatureToggleManager featureToggleManager) {
        shopListsDataAppModule.getClass();
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new SimilarProductsRepository(apolloClient, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
