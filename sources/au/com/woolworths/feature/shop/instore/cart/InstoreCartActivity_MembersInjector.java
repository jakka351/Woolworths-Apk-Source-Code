package au.com.woolworths.feature.shop.instore.cart;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstoreCartActivity_MembersInjector implements MembersInjector<InstoreCartActivity> {
    public static void a(InstoreCartActivity instoreCartActivity, AnalyticsManager analyticsManager) {
        instoreCartActivity.w = analyticsManager;
    }

    public static void b(InstoreCartActivity instoreCartActivity, ShopAppNavigator shopAppNavigator) {
        instoreCartActivity.x = shopAppNavigator;
    }
}
