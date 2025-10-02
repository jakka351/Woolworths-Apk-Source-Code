package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ComposeProductListActivity_MembersInjector implements MembersInjector<ComposeProductListActivity> {
    public static void a(ComposeProductListActivity composeProductListActivity, AnalyticsManager analyticsManager) {
        composeProductListActivity.x = analyticsManager;
    }

    public static void b(ComposeProductListActivity composeProductListActivity, FeatureToggleManager featureToggleManager) {
        composeProductListActivity.z = featureToggleManager;
    }

    public static void c(ComposeProductListActivity composeProductListActivity, ShopAppNavigator shopAppNavigator) {
        composeProductListActivity.y = shopAppNavigator;
    }
}
