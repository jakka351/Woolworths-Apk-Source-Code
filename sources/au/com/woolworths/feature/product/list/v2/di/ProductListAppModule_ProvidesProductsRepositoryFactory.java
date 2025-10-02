package au.com.woolworths.feature.product.list.v2.di;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.product.list.v2.ProductListRepository;
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
public final class ProductListAppModule_ProvidesProductsRepositoryFactory implements Factory<ProductListRepository> {
    public static ProductListRepository a(ProductListAppModule productListAppModule, SharedPreferences sharedPreferences, ApolloClient apolloClient, FeatureToggleManager featureToggleManager, SupportedLinksHelper supportedLinksHelper, ShopAppFlavorInteractor shopAppFlavorInteractor) {
        productListAppModule.getClass();
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(shopAppFlavorInteractor, "shopAppFlavorInteractor");
        return new ProductListRepository(apolloClient, featureToggleManager, sharedPreferences, supportedLinksHelper, shopAppFlavorInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
