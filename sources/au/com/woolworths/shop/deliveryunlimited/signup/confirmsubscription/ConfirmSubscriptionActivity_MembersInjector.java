package au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.digipay.DigipayInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ConfirmSubscriptionActivity_MembersInjector implements MembersInjector<ConfirmSubscriptionActivity> {
    public static void a(ConfirmSubscriptionActivity confirmSubscriptionActivity, AnalyticsManager analyticsManager) {
        confirmSubscriptionActivity.y = analyticsManager;
    }

    public static void b(ConfirmSubscriptionActivity confirmSubscriptionActivity, DigipayInteractor digipayInteractor) {
        confirmSubscriptionActivity.x = digipayInteractor;
    }
}
