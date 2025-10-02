package au.com.woolworths.feature.rewards.account.authentication;

import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.auth.auth0.Auth0AuthManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsAuthenticationActivityNew_MembersInjector implements MembersInjector<RewardsAuthenticationActivityNew> {
    public static void a(RewardsAuthenticationActivityNew rewardsAuthenticationActivityNew, Auth0AuthManager auth0AuthManager) {
        rewardsAuthenticationActivityNew.w = auth0AuthManager;
    }

    public static void b(RewardsAuthenticationActivityNew rewardsAuthenticationActivityNew, BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl) {
        rewardsAuthenticationActivityNew.x = branchDeepLinkInteractorImpl;
    }

    public static void c(RewardsAuthenticationActivityNew rewardsAuthenticationActivityNew, FeatureToggleManager featureToggleManager) {
        rewardsAuthenticationActivityNew.A = featureToggleManager;
    }

    public static void d(RewardsAuthenticationActivityNew rewardsAuthenticationActivityNew, RewardsAccountInteractor rewardsAccountInteractor) {
        rewardsAuthenticationActivityNew.y = rewardsAccountInteractor;
    }

    public static void e(RewardsAuthenticationActivityNew rewardsAuthenticationActivityNew, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl) {
        rewardsAuthenticationActivityNew.z = releaseSettingsInteractorImpl;
    }
}
