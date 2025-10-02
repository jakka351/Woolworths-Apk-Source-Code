package au.com.woolworths.feature.shop.myorders.details.cancel;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class OrderCancellationPromptActivity_MembersInjector implements MembersInjector<OrderCancellationPromptActivity> {
    public static void a(OrderCancellationPromptActivity orderCancellationPromptActivity, AnalyticsManager analyticsManager) {
        orderCancellationPromptActivity.x = analyticsManager;
    }

    public static void b(OrderCancellationPromptActivity orderCancellationPromptActivity, AppConfig appConfig) {
        orderCancellationPromptActivity.y = appConfig;
    }
}
