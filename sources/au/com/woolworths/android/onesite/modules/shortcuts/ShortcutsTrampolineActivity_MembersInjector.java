package au.com.woolworths.android.onesite.modules.shortcuts;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ShortcutsTrampolineActivity_MembersInjector implements MembersInjector<ShortcutsTrampolineActivity> {
    public static void a(ShortcutsTrampolineActivity shortcutsTrampolineActivity, AnalyticsManager analyticsManager) {
        shortcutsTrampolineActivity.A = analyticsManager;
    }

    public static void b(ShortcutsTrampolineActivity shortcutsTrampolineActivity, FeatureToggleManager featureToggleManager) {
        shortcutsTrampolineActivity.z = featureToggleManager;
    }

    public static void c(ShortcutsTrampolineActivity shortcutsTrampolineActivity, LaunchManager launchManager) {
        shortcutsTrampolineActivity.x = launchManager;
    }

    public static void d(ShortcutsTrampolineActivity shortcutsTrampolineActivity, RewardsAccountInteractor rewardsAccountInteractor) {
        shortcutsTrampolineActivity.y = rewardsAccountInteractor;
    }
}
