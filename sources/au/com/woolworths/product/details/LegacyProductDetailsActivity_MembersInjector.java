package au.com.woolworths.product.details;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class LegacyProductDetailsActivity_MembersInjector implements MembersInjector<LegacyProductDetailsActivity> {
    public static void a(LegacyProductDetailsActivity legacyProductDetailsActivity, AnalyticsManager analyticsManager) {
        legacyProductDetailsActivity.x = analyticsManager;
    }

    public static void b(LegacyProductDetailsActivity legacyProductDetailsActivity, FeatureToggleManager featureToggleManager) {
        legacyProductDetailsActivity.y = featureToggleManager;
    }

    public static void c(LegacyProductDetailsActivity legacyProductDetailsActivity, ListsInMemoryRepository listsInMemoryRepository) {
        legacyProductDetailsActivity.z = listsInMemoryRepository;
    }

    public static void d(LegacyProductDetailsActivity legacyProductDetailsActivity, ShopAppNavigator shopAppNavigator) {
        legacyProductDetailsActivity.A = shopAppNavigator;
    }
}
