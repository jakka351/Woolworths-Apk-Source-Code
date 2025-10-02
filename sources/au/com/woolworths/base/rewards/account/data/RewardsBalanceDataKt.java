package au.com.woolworths.base.rewards.account.data;

import androidx.annotation.ColorRes;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlock;
import com.woolworths.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0002¨\u0006\u0006"}, d2 = {"getIconColorRes", "", "Lau/com/woolworths/base/rewards/account/data/RewardsBalanceData;", "getRedemptionSettingsContentDescription", "", "getFuelVoucherContentDescription", "base-rewards-account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsBalanceDataKt {
    @NotNull
    public static final String getFuelVoucherContentDescription(@Nullable RewardsBalanceData rewardsBalanceData) {
        if (rewardsBalanceData == null) {
            return "";
        }
        RewardsFuelVouchersSummaryData fuelVouchers = rewardsBalanceData.getFuelVouchers();
        Integer numValueOf = fuelVouchers != null ? Integer.valueOf(fuelVouchers.getNumberOfVouchers()) : null;
        RewardsFuelVouchersSummaryData fuelVouchers2 = rewardsBalanceData.getFuelVouchers();
        String str = numValueOf + " " + (fuelVouchers2 != null ? fuelVouchers2.getLabel() : null) + ".";
        return str == null ? "" : str;
    }

    @ColorRes
    public static final int getIconColorRes(@Nullable RewardsBalanceData rewardsBalanceData) {
        return rewardsBalanceData != null ? R.color.rewards_color_primary : R.color.color_black_400;
    }

    @NotNull
    public static final String getRedemptionSettingsContentDescription(@Nullable RewardsBalanceData rewardsBalanceData) {
        String coachMarkText;
        RewardsRedemptionUnlock redemptionUnlock;
        if (rewardsBalanceData != null) {
            RewardsRedemptionSettingsSummaryData redemptionSettings = rewardsBalanceData.getRedemptionSettings();
            String value = redemptionSettings != null ? redemptionSettings.getValue() : null;
            RewardsRedemptionSettingsSummaryData redemptionSettings2 = rewardsBalanceData.getRedemptionSettings();
            String label = redemptionSettings2 != null ? redemptionSettings2.getLabel() : null;
            RewardsRedemptionSettingsSummaryData redemptionSettings3 = rewardsBalanceData.getRedemptionSettings();
            if (redemptionSettings3 == null || (redemptionUnlock = redemptionSettings3.getRedemptionUnlock()) == null || (coachMarkText = redemptionUnlock.getCoachMarkText()) == null) {
                coachMarkText = "";
            }
            String strJ = a.j(value, " ", label, ". ", coachMarkText);
            if (strJ != null) {
                return strJ;
            }
        }
        return "";
    }
}
