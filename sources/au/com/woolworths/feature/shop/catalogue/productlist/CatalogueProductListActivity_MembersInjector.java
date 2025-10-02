package au.com.woolworths.feature.shop.catalogue.productlist;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CatalogueProductListActivity_MembersInjector implements MembersInjector<CatalogueProductListActivity> {
    public static void a(CatalogueProductListActivity catalogueProductListActivity, AnalyticsManager analyticsManager) {
        catalogueProductListActivity.x = analyticsManager;
    }

    public static void b(CatalogueProductListActivity catalogueProductListActivity, FeatureToggleManager featureToggleManager) {
        catalogueProductListActivity.y = featureToggleManager;
    }

    public static void c(CatalogueProductListActivity catalogueProductListActivity, ShopAppNavigator shopAppNavigator) {
        catalogueProductListActivity.z = shopAppNavigator;
    }
}
