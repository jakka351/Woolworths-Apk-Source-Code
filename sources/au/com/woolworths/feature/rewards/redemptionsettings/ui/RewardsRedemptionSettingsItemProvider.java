package au.com.woolworths.feature.rewards.redemptionsettings.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionIcon;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingCta;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/ui/RewardsRedemptionSettingsItemProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingsItem;", "Companion", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsRedemptionSettingsItemProvider implements PreviewParameterProvider<RewardsRedemptionSettingsItem> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/ui/RewardsRedemptionSettingsItemProvider$Companion;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RewardsRedemptionIcon rewardsRedemptionIcon = RewardsRedemptionIcon.AUTOMATIC;
        Boolean bool = Boolean.FALSE;
        new RewardsRedemptionSettingsItem(false, rewardsRedemptionIcon, "Automatic savings", "Get $10 off your next shop, whenever you reach 2000 points.", null, bool, new RewardsRedemptionSettingCta("", new ContentCta("Security Preferences", "", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null)));
        new RewardsRedemptionSettingsItem(false, RewardsRedemptionIcon.CHRISTMAS_STOCKING, "Bank for Christmas", "Get all your money off at Christmas, available from now.", null, bool, null, 64, null);
        new RewardsRedemptionSettingsItem(false, RewardsRedemptionIcon.AIRPLANE, "Qantas Points", "Convert to Qantas Points. 2000 Everyday Rewards Points = 1000 Qantas Points", null, bool, null, 64, null);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        throw null;
    }
}
