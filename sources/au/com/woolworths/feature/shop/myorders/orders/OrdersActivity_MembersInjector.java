package au.com.woolworths.feature.shop.myorders.orders;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class OrdersActivity_MembersInjector implements MembersInjector<OrdersActivity> {
    public static void a(OrdersActivity ordersActivity, AnalyticsManager analyticsManager) {
        ordersActivity.z = analyticsManager;
    }

    public static void b(OrdersActivity ordersActivity, FeatureToggleManager featureToggleManager) {
        ordersActivity.A = featureToggleManager;
    }
}
