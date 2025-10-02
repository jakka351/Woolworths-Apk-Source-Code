package au.com.woolworths.base.shopapp.rewards.models;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/base/shopapp/rewards/models/RewardsBalanceApiModel;", "", "", "status", "Lau/com/woolworths/base/shopapp/rewards/models/RewardsBalanceDataApiModel;", "rewardsBalanceDataApiModel", "<init>", "(Ljava/lang/String;Lau/com/woolworths/base/shopapp/rewards/models/RewardsBalanceDataApiModel;)V", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "Lau/com/woolworths/base/shopapp/rewards/models/RewardsBalanceDataApiModel;", "getRewardsBalanceDataApiModel", "()Lau/com/woolworths/base/shopapp/rewards/models/RewardsBalanceDataApiModel;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsBalanceApiModel {

    @SerializedName("data")
    @Nullable
    private final RewardsBalanceDataApiModel rewardsBalanceDataApiModel;

    @SerializedName("status")
    @NotNull
    private final String status;

    public RewardsBalanceApiModel(@NotNull String status, @Nullable RewardsBalanceDataApiModel rewardsBalanceDataApiModel) {
        Intrinsics.h(status, "status");
        this.status = status;
        this.rewardsBalanceDataApiModel = rewardsBalanceDataApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsBalanceApiModel)) {
            return false;
        }
        RewardsBalanceApiModel rewardsBalanceApiModel = (RewardsBalanceApiModel) obj;
        return Intrinsics.c(this.status, rewardsBalanceApiModel.status) && Intrinsics.c(this.rewardsBalanceDataApiModel, rewardsBalanceApiModel.rewardsBalanceDataApiModel);
    }

    public final int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        RewardsBalanceDataApiModel rewardsBalanceDataApiModel = this.rewardsBalanceDataApiModel;
        return iHashCode + (rewardsBalanceDataApiModel == null ? 0 : rewardsBalanceDataApiModel.hashCode());
    }

    public final String toString() {
        return "RewardsBalanceApiModel(status=" + this.status + ", rewardsBalanceDataApiModel=" + this.rewardsBalanceDataApiModel + ")";
    }
}
