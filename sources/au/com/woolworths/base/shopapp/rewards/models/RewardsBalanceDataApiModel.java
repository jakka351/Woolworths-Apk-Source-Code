package au.com.woolworths.base.shopapp.rewards.models;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/base/shopapp/rewards/models/RewardsBalanceDataApiModel;", "", "Lau/com/woolworths/base/shopapp/rewards/models/RewardsBalanceDetailApiModel;", "rewardsBalanceDetailApiModel", "<init>", "(Lau/com/woolworths/base/shopapp/rewards/models/RewardsBalanceDetailApiModel;)V", "Lau/com/woolworths/base/shopapp/rewards/models/RewardsBalanceDetailApiModel;", "getRewardsBalanceDetailApiModel", "()Lau/com/woolworths/base/shopapp/rewards/models/RewardsBalanceDetailApiModel;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsBalanceDataApiModel {

    @SerializedName("rewardbalance")
    @NotNull
    private final RewardsBalanceDetailApiModel rewardsBalanceDetailApiModel;

    public RewardsBalanceDataApiModel(@NotNull RewardsBalanceDetailApiModel rewardsBalanceDetailApiModel) {
        Intrinsics.h(rewardsBalanceDetailApiModel, "rewardsBalanceDetailApiModel");
        this.rewardsBalanceDetailApiModel = rewardsBalanceDetailApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardsBalanceDataApiModel) && Intrinsics.c(this.rewardsBalanceDetailApiModel, ((RewardsBalanceDataApiModel) obj).rewardsBalanceDetailApiModel);
    }

    public final int hashCode() {
        return this.rewardsBalanceDetailApiModel.hashCode();
    }

    public final String toString() {
        return "RewardsBalanceDataApiModel(rewardsBalanceDetailApiModel=" + this.rewardsBalanceDetailApiModel + ")";
    }
}
