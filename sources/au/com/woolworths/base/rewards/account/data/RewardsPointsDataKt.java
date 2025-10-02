package au.com.woolworths.base.rewards.account.data;

import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toRewardsPointsBalance", "Lau/com/woolworths/android/onesite/modules/rewards/RewardsPointsBalance;", "Lau/com/woolworths/base/rewards/account/data/RewardsPointsData;", "base-rewards-account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsPointsDataKt {
    @NotNull
    public static final RewardsPointsBalance toRewardsPointsBalance(@NotNull RewardsPointsData rewardsPointsData) {
        Intrinsics.h(rewardsPointsData, "<this>");
        Boolean showStatusMark = rewardsPointsData.getShowStatusMark();
        boolean zBooleanValue = showStatusMark != null ? showStatusMark.booleanValue() : false;
        return new RewardsPointsBalance(rewardsPointsData.getPointsBalance(), rewardsPointsData.getRedemptionPercentage(), rewardsPointsData.getDisplayMessage(), zBooleanValue, zBooleanValue ? rewardsPointsData.getStatusMarkUrl() : null, rewardsPointsData.getCreditsBalance());
    }
}
