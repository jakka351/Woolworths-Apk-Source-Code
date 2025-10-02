package au.com.woolworths.feature.rewards.redemptionsettings;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsRedemptionSettingsBottomSheetActivity_MembersInjector implements MembersInjector<RewardsRedemptionSettingsBottomSheetActivity> {
    public static void a(RewardsRedemptionSettingsBottomSheetActivity rewardsRedemptionSettingsBottomSheetActivity, AnalyticsManager analyticsManager) {
        rewardsRedemptionSettingsBottomSheetActivity.y = analyticsManager;
    }

    public static void b(RewardsRedemptionSettingsBottomSheetActivity rewardsRedemptionSettingsBottomSheetActivity, FeatureToggleManager featureToggleManager) {
        rewardsRedemptionSettingsBottomSheetActivity.z = featureToggleManager;
    }
}
