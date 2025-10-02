package au.com.woolworths.feature.product.list.di;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.product.list.ProductsListRepository;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor;
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
public final class ProductListAppModule_ProvidesProductsRepositoryFactory implements Factory<ProductsListRepository> {
    public static ProductsListRepository a(ProductListAppModule productListAppModule, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, ApolloClient apolloClient, FeatureToggleManager featureToggleManager, SupportedLinksHelper supportedLinksHelper, ShopAppFlavorInteractor shopAppFlavorInteractor) {
        productListAppModule.getClass();
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(shopAppFlavorInteractor, "shopAppFlavorInteractor");
        return new ProductsListRepository(sharedPreferences, sharedPreferences2, apolloClient, featureToggleManager, supportedLinksHelper, shopAppFlavorInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
