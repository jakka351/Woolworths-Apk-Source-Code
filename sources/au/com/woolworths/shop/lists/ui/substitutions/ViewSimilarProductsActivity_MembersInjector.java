package au.com.woolworths.shop.lists.ui.substitutions;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ViewSimilarProductsActivity_MembersInjector implements MembersInjector<ViewSimilarProductsActivity> {
    public static void a(ViewSimilarProductsActivity viewSimilarProductsActivity, FeatureToggleManager featureToggleManager) {
        viewSimilarProductsActivity.y = featureToggleManager;
    }

    public static void b(ViewSimilarProductsActivity viewSimilarProductsActivity, ShopAppNavigator shopAppNavigator) {
        viewSimilarProductsActivity.x = shopAppNavigator;
    }
}
