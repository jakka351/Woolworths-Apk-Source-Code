package au.com.woolworths.feature.shop.onboarding;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class OnboardingActivity_MembersInjector implements MembersInjector<OnboardingActivity> {
    public static void a(OnboardingActivity onboardingActivity, AnalyticsManager analyticsManager) {
        onboardingActivity.x = analyticsManager;
    }

    public static void b(OnboardingActivity onboardingActivity, BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl) {
        onboardingActivity.A = branchDeepLinkInteractorImpl;
    }

    public static void c(OnboardingActivity onboardingActivity, FeatureToggleManager featureToggleManager) {
        onboardingActivity.y = featureToggleManager;
    }

    public static void d(OnboardingActivity onboardingActivity, ShopAppNavigator shopAppNavigator) {
        onboardingActivity.z = shopAppNavigator;
    }

    public static void e(OnboardingActivity onboardingActivity, ShopAppFlavorInteractor shopAppFlavorInteractor) {
        onboardingActivity.B = shopAppFlavorInteractor;
    }
}
