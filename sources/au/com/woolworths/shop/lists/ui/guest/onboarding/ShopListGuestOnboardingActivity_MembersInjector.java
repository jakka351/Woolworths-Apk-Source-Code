package au.com.woolworths.shop.lists.ui.guest.onboarding;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopListGuestOnboardingActivity_MembersInjector implements MembersInjector<ShopListGuestOnboardingActivity> {
    public static void a(ShopListGuestOnboardingActivity shopListGuestOnboardingActivity, AnalyticsManager analyticsManager) {
        shopListGuestOnboardingActivity.y = analyticsManager;
    }

    public static void b(ShopListGuestOnboardingActivity shopListGuestOnboardingActivity, FeatureToggleManager featureToggleManager) {
        shopListGuestOnboardingActivity.x = featureToggleManager;
    }
}
