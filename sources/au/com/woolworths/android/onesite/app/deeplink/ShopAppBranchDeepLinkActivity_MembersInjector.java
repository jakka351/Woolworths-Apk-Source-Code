package au.com.woolworths.android.onesite.app.deeplink;

import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ShopAppBranchDeepLinkActivity_MembersInjector implements MembersInjector<ShopAppBranchDeepLinkActivity> {
    public static void a(ShopAppBranchDeepLinkActivity shopAppBranchDeepLinkActivity, BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl) {
        shopAppBranchDeepLinkActivity.x = branchDeepLinkInteractorImpl;
    }

    public static void b(ShopAppBranchDeepLinkActivity shopAppBranchDeepLinkActivity, FeatureToggleManager featureToggleManager) {
        shopAppBranchDeepLinkActivity.y = featureToggleManager;
    }
}
