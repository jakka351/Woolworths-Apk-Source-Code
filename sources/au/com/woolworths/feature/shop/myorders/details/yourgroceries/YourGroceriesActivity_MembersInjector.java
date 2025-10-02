package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class YourGroceriesActivity_MembersInjector implements MembersInjector<YourGroceriesActivity> {
    public static void a(YourGroceriesActivity yourGroceriesActivity, AnalyticsManager analyticsManager) {
        yourGroceriesActivity.x = analyticsManager;
    }

    public static void b(YourGroceriesActivity yourGroceriesActivity, FeatureToggleManager featureToggleManager) {
        yourGroceriesActivity.y = featureToggleManager;
    }

    public static void c(YourGroceriesActivity yourGroceriesActivity, ShopAppNavigator shopAppNavigator) {
        yourGroceriesActivity.z = shopAppNavigator;
    }
}
