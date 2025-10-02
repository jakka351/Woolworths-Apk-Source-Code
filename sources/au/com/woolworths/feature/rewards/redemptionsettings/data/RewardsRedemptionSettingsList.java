package au.com.woolworths.feature.rewards.redemptionsettings.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.rewards.account.data.RewardsTwoFactorAuth;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/data/RewardsRedemptionSettingsList;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsRedemptionSettingsList {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6438a;
    public final RewardsTwoFactorAuth b;
    public final RewardsRedemptionActionsList c;

    public RewardsRedemptionSettingsList(ArrayList arrayList, RewardsTwoFactorAuth rewardsTwoFactorAuth, RewardsRedemptionActionsList rewardsRedemptionActionsList) {
        this.f6438a = arrayList;
        this.b = rewardsTwoFactorAuth;
        this.c = rewardsRedemptionActionsList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsRedemptionSettingsList)) {
            return false;
        }
        RewardsRedemptionSettingsList rewardsRedemptionSettingsList = (RewardsRedemptionSettingsList) obj;
        return this.f6438a.equals(rewardsRedemptionSettingsList.f6438a) && Intrinsics.c(this.b, rewardsRedemptionSettingsList.b) && Intrinsics.c(this.c, rewardsRedemptionSettingsList.c);
    }

    public final int hashCode() {
        int iHashCode = this.f6438a.hashCode() * 31;
        RewardsTwoFactorAuth rewardsTwoFactorAuth = this.b;
        int iHashCode2 = (iHashCode + (rewardsTwoFactorAuth == null ? 0 : rewardsTwoFactorAuth.hashCode())) * 31;
        RewardsRedemptionActionsList rewardsRedemptionActionsList = this.c;
        return iHashCode2 + (rewardsRedemptionActionsList != null ? rewardsRedemptionActionsList.hashCode() : 0);
    }

    public final String toString() {
        return "RewardsRedemptionSettingsList(redemptionItems=" + this.f6438a + ", twoFactorAuth=" + this.b + ", actions=" + this.c + ")";
    }
}
