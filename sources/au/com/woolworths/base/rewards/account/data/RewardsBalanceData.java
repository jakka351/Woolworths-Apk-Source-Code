package au.com.woolworths.base.rewards.account.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsBalanceData;", "", "pointsBalance", "Lau/com/woolworths/base/rewards/account/data/RewardsPointsData;", "lifetimeRedeemed", "Lau/com/woolworths/base/rewards/account/data/RewardsLifetimeRedeemedData;", "redemptionSettings", "Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingsSummaryData;", "fuelVouchers", "Lau/com/woolworths/base/rewards/account/data/RewardsFuelVouchersSummaryData;", "displayName", "", "<init>", "(Lau/com/woolworths/base/rewards/account/data/RewardsPointsData;Lau/com/woolworths/base/rewards/account/data/RewardsLifetimeRedeemedData;Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingsSummaryData;Lau/com/woolworths/base/rewards/account/data/RewardsFuelVouchersSummaryData;Ljava/lang/String;)V", "getPointsBalance", "()Lau/com/woolworths/base/rewards/account/data/RewardsPointsData;", "getLifetimeRedeemed", "()Lau/com/woolworths/base/rewards/account/data/RewardsLifetimeRedeemedData;", "getRedemptionSettings", "()Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingsSummaryData;", "getFuelVouchers", "()Lau/com/woolworths/base/rewards/account/data/RewardsFuelVouchersSummaryData;", "getDisplayName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsBalanceData {
    public static final int $stable = 8;

    @SerializedName("displayName")
    @Nullable
    private final String displayName;

    @SerializedName("fuelVouchers")
    @Nullable
    private final RewardsFuelVouchersSummaryData fuelVouchers;

    @SerializedName("lifetimeRedeemed")
    @Nullable
    private final RewardsLifetimeRedeemedData lifetimeRedeemed;

    @SerializedName("pointsBalance")
    @Nullable
    private final RewardsPointsData pointsBalance;

    @SerializedName("redemptionSettings")
    @Nullable
    private final RewardsRedemptionSettingsSummaryData redemptionSettings;

    public RewardsBalanceData(@Nullable RewardsPointsData rewardsPointsData, @Nullable RewardsLifetimeRedeemedData rewardsLifetimeRedeemedData, @Nullable RewardsRedemptionSettingsSummaryData rewardsRedemptionSettingsSummaryData, @Nullable RewardsFuelVouchersSummaryData rewardsFuelVouchersSummaryData, @Nullable String str) {
        this.pointsBalance = rewardsPointsData;
        this.lifetimeRedeemed = rewardsLifetimeRedeemedData;
        this.redemptionSettings = rewardsRedemptionSettingsSummaryData;
        this.fuelVouchers = rewardsFuelVouchersSummaryData;
        this.displayName = str;
    }

    public static /* synthetic */ RewardsBalanceData copy$default(RewardsBalanceData rewardsBalanceData, RewardsPointsData rewardsPointsData, RewardsLifetimeRedeemedData rewardsLifetimeRedeemedData, RewardsRedemptionSettingsSummaryData rewardsRedemptionSettingsSummaryData, RewardsFuelVouchersSummaryData rewardsFuelVouchersSummaryData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            rewardsPointsData = rewardsBalanceData.pointsBalance;
        }
        if ((i & 2) != 0) {
            rewardsLifetimeRedeemedData = rewardsBalanceData.lifetimeRedeemed;
        }
        if ((i & 4) != 0) {
            rewardsRedemptionSettingsSummaryData = rewardsBalanceData.redemptionSettings;
        }
        if ((i & 8) != 0) {
            rewardsFuelVouchersSummaryData = rewardsBalanceData.fuelVouchers;
        }
        if ((i & 16) != 0) {
            str = rewardsBalanceData.displayName;
        }
        String str2 = str;
        RewardsRedemptionSettingsSummaryData rewardsRedemptionSettingsSummaryData2 = rewardsRedemptionSettingsSummaryData;
        return rewardsBalanceData.copy(rewardsPointsData, rewardsLifetimeRedeemedData, rewardsRedemptionSettingsSummaryData2, rewardsFuelVouchersSummaryData, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final RewardsPointsData getPointsBalance() {
        return this.pointsBalance;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final RewardsLifetimeRedeemedData getLifetimeRedeemed() {
        return this.lifetimeRedeemed;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final RewardsRedemptionSettingsSummaryData getRedemptionSettings() {
        return this.redemptionSettings;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final RewardsFuelVouchersSummaryData getFuelVouchers() {
        return this.fuelVouchers;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final RewardsBalanceData copy(@Nullable RewardsPointsData pointsBalance, @Nullable RewardsLifetimeRedeemedData lifetimeRedeemed, @Nullable RewardsRedemptionSettingsSummaryData redemptionSettings, @Nullable RewardsFuelVouchersSummaryData fuelVouchers, @Nullable String displayName) {
        return new RewardsBalanceData(pointsBalance, lifetimeRedeemed, redemptionSettings, fuelVouchers, displayName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsBalanceData)) {
            return false;
        }
        RewardsBalanceData rewardsBalanceData = (RewardsBalanceData) other;
        return Intrinsics.c(this.pointsBalance, rewardsBalanceData.pointsBalance) && Intrinsics.c(this.lifetimeRedeemed, rewardsBalanceData.lifetimeRedeemed) && Intrinsics.c(this.redemptionSettings, rewardsBalanceData.redemptionSettings) && Intrinsics.c(this.fuelVouchers, rewardsBalanceData.fuelVouchers) && Intrinsics.c(this.displayName, rewardsBalanceData.displayName);
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final RewardsFuelVouchersSummaryData getFuelVouchers() {
        return this.fuelVouchers;
    }

    @Nullable
    public final RewardsLifetimeRedeemedData getLifetimeRedeemed() {
        return this.lifetimeRedeemed;
    }

    @Nullable
    public final RewardsPointsData getPointsBalance() {
        return this.pointsBalance;
    }

    @Nullable
    public final RewardsRedemptionSettingsSummaryData getRedemptionSettings() {
        return this.redemptionSettings;
    }

    public int hashCode() {
        RewardsPointsData rewardsPointsData = this.pointsBalance;
        int iHashCode = (rewardsPointsData == null ? 0 : rewardsPointsData.hashCode()) * 31;
        RewardsLifetimeRedeemedData rewardsLifetimeRedeemedData = this.lifetimeRedeemed;
        int iHashCode2 = (iHashCode + (rewardsLifetimeRedeemedData == null ? 0 : rewardsLifetimeRedeemedData.hashCode())) * 31;
        RewardsRedemptionSettingsSummaryData rewardsRedemptionSettingsSummaryData = this.redemptionSettings;
        int iHashCode3 = (iHashCode2 + (rewardsRedemptionSettingsSummaryData == null ? 0 : rewardsRedemptionSettingsSummaryData.hashCode())) * 31;
        RewardsFuelVouchersSummaryData rewardsFuelVouchersSummaryData = this.fuelVouchers;
        int iHashCode4 = (iHashCode3 + (rewardsFuelVouchersSummaryData == null ? 0 : rewardsFuelVouchersSummaryData.hashCode())) * 31;
        String str = this.displayName;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        RewardsPointsData rewardsPointsData = this.pointsBalance;
        RewardsLifetimeRedeemedData rewardsLifetimeRedeemedData = this.lifetimeRedeemed;
        RewardsRedemptionSettingsSummaryData rewardsRedemptionSettingsSummaryData = this.redemptionSettings;
        RewardsFuelVouchersSummaryData rewardsFuelVouchersSummaryData = this.fuelVouchers;
        String str = this.displayName;
        StringBuilder sb = new StringBuilder("RewardsBalanceData(pointsBalance=");
        sb.append(rewardsPointsData);
        sb.append(", lifetimeRedeemed=");
        sb.append(rewardsLifetimeRedeemedData);
        sb.append(", redemptionSettings=");
        sb.append(rewardsRedemptionSettingsSummaryData);
        sb.append(", fuelVouchers=");
        sb.append(rewardsFuelVouchersSummaryData);
        sb.append(", displayName=");
        return a.o(sb, str, ")");
    }
}
