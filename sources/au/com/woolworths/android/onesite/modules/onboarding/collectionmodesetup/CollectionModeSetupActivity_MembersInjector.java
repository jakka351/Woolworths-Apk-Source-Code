package au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup;

import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CollectionModeSetupActivity_MembersInjector implements MembersInjector<CollectionModeSetupActivity> {
    public static void a(CollectionModeSetupActivity collectionModeSetupActivity, BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl) {
        collectionModeSetupActivity.G = branchDeepLinkInteractorImpl;
    }

    public static void b(CollectionModeSetupActivity collectionModeSetupActivity, FeatureToggleManager featureToggleManager) {
        collectionModeSetupActivity.B = featureToggleManager;
    }

    public static void c(CollectionModeSetupActivity collectionModeSetupActivity, SchedulersProvider schedulersProvider) {
        collectionModeSetupActivity.C = schedulersProvider;
    }

    public static void d(CollectionModeSetupActivity collectionModeSetupActivity, ShopAppNavigator shopAppNavigator) {
        collectionModeSetupActivity.D = shopAppNavigator;
    }
}
