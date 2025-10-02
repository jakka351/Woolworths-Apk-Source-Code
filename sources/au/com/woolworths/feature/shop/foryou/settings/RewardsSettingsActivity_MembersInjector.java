package au.com.woolworths.feature.shop.foryou.settings;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsSettingsActivity_MembersInjector implements MembersInjector<RewardsSettingsActivity> {
    public static void a(RewardsSettingsActivity rewardsSettingsActivity, AnalyticsManager analyticsManager) {
        rewardsSettingsActivity.x = analyticsManager;
    }

    public static void b(RewardsSettingsActivity rewardsSettingsActivity, FeatureToggleManager featureToggleManager) {
        rewardsSettingsActivity.y = featureToggleManager;
    }
}
