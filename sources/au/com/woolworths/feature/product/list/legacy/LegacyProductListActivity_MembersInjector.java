package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class LegacyProductListActivity_MembersInjector implements MembersInjector<LegacyProductListActivity> {
    public static void a(LegacyProductListActivity legacyProductListActivity, AnalyticsManager analyticsManager) {
        legacyProductListActivity.x = analyticsManager;
    }

    public static void b(LegacyProductListActivity legacyProductListActivity, ShopAppNavigator shopAppNavigator) {
        legacyProductListActivity.y = shopAppNavigator;
    }
}
