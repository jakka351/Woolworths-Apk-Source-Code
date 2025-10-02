package au.com.woolworths.shop.product.details;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ProductDetailsActivity_MembersInjector implements MembersInjector<ProductDetailsActivity> {
    public static void a(ProductDetailsActivity productDetailsActivity, CollectionModeInteractor collectionModeInteractor) {
        productDetailsActivity.y = collectionModeInteractor;
    }

    public static void b(ProductDetailsActivity productDetailsActivity, FeatureToggleManager featureToggleManager) {
        productDetailsActivity.x = featureToggleManager;
    }

    public static void c(ProductDetailsActivity productDetailsActivity, ShopAppNavigator shopAppNavigator) {
        productDetailsActivity.z = shopAppNavigator;
    }
}
