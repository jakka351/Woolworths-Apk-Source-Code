package au.com.woolworths.feature.rewards.account.authentication;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsAuthenticationActivity_MembersInjector implements MembersInjector<RewardsAuthenticationActivity> {
    public static void a(RewardsAuthenticationActivity rewardsAuthenticationActivity, AnalyticsManager analyticsManager) {
        rewardsAuthenticationActivity.x = analyticsManager;
    }

    public static void b(RewardsAuthenticationActivity rewardsAuthenticationActivity, AppIdentifier appIdentifier) {
        rewardsAuthenticationActivity.z = appIdentifier;
    }

    public static void c(RewardsAuthenticationActivity rewardsAuthenticationActivity, BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl) {
        rewardsAuthenticationActivity.y = branchDeepLinkInteractorImpl;
    }

    public static void d(RewardsAuthenticationActivity rewardsAuthenticationActivity, FeatureToggleManager featureToggleManager) {
        rewardsAuthenticationActivity.A = featureToggleManager;
    }

    public static void e(RewardsAuthenticationActivity rewardsAuthenticationActivity, RewardsAccountInteractor rewardsAccountInteractor) {
        rewardsAuthenticationActivity.B = rewardsAccountInteractor;
    }
}
