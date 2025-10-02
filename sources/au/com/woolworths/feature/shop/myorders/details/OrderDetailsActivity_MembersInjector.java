package au.com.woolworths.feature.shop.myorders.details;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class OrderDetailsActivity_MembersInjector implements MembersInjector<OrderDetailsActivity> {
    public static void a(OrderDetailsActivity orderDetailsActivity, AnalyticsManager analyticsManager) {
        orderDetailsActivity.x = analyticsManager;
    }

    public static void b(OrderDetailsActivity orderDetailsActivity, FeatureToggleManager featureToggleManager) {
        orderDetailsActivity.y = featureToggleManager;
    }

    public static void c(OrderDetailsActivity orderDetailsActivity, PermissionFlagInteractorImpl permissionFlagInteractorImpl) {
        orderDetailsActivity.z = permissionFlagInteractorImpl;
    }

    public static void d(OrderDetailsActivity orderDetailsActivity, ShopAppNavigator shopAppNavigator) {
        orderDetailsActivity.A = shopAppNavigator;
    }
}
