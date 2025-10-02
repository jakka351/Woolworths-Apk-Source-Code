package au.com.woolworths.feature.shop.catalogue.browse;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CatalogueBrowseActivity_MembersInjector implements MembersInjector<CatalogueBrowseActivity> {
    public static void a(CatalogueBrowseActivity catalogueBrowseActivity, AnalyticsManager analyticsManager) {
        catalogueBrowseActivity.x = analyticsManager;
    }

    public static void b(CatalogueBrowseActivity catalogueBrowseActivity, FeatureToggleManager featureToggleManager) {
        catalogueBrowseActivity.y = featureToggleManager;
    }

    public static void c(CatalogueBrowseActivity catalogueBrowseActivity, ShopAppNavigator shopAppNavigator) {
        catalogueBrowseActivity.z = shopAppNavigator;
    }
}
