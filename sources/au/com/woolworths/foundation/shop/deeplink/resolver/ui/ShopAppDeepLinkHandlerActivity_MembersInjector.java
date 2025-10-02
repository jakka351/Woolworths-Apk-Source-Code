package au.com.woolworths.foundation.shop.deeplink.resolver.ui;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.onboarding.data.OnboardingInteractorImpl;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopAppDeepLinkHandlerActivity_MembersInjector implements MembersInjector<ShopAppDeepLinkHandlerActivity> {
    public static void a(ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity, AnalyticsManager analyticsManager) {
        shopAppDeepLinkHandlerActivity.y = analyticsManager;
    }

    public static void b(ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity, FeatureToggleManager featureToggleManager) {
        shopAppDeepLinkHandlerActivity.A = featureToggleManager;
    }

    public static void c(ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity, OnboardingInteractorImpl onboardingInteractorImpl) {
        shopAppDeepLinkHandlerActivity.z = onboardingInteractorImpl;
    }

    public static void d(ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity, RewardsAccountInteractor rewardsAccountInteractor) {
        shopAppDeepLinkHandlerActivity.x = rewardsAccountInteractor;
    }

    public static void e(ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity, ShopAccountInteractor shopAccountInteractor) {
        shopAppDeepLinkHandlerActivity.B = shopAccountInteractor;
    }

    public static void f(ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity, ShopAppRegionInteractor shopAppRegionInteractor) {
        shopAppDeepLinkHandlerActivity.C = shopAppRegionInteractor;
    }
}
