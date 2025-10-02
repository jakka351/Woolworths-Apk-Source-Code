package au.com.woolworths.shop.product.navigation.di;

import au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository;
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
public final class ShopProductNavigationModule_ProvideProductCategoryRepositoryFactory implements Factory<ProductCategoryNavigationRepository> {
    public static ProductCategoryNavigationRepository a(ShopProductNavigationModule shopProductNavigationModule, ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        return new ProductCategoryNavigationRepository(apolloClient);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
