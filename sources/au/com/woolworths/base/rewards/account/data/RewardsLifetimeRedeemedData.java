package au.com.woolworths.base.rewards.account.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsLifetimeRedeemedData;", "", "lifetimeRedeemed", "", "displayMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLifetimeRedeemed", "()Ljava/lang/String;", "getDisplayMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsLifetimeRedeemedData {
    public static final int $stable = 0;

    @SerializedName("displayMessage")
    @NotNull
    private final String displayMessage;

    @SerializedName("lifetimeRedeemed")
    @NotNull
    private final String lifetimeRedeemed;

    public RewardsLifetimeRedeemedData(@NotNull String lifetimeRedeemed, @NotNull String displayMessage) {
        Intrinsics.h(lifetimeRedeemed, "lifetimeRedeemed");
        Intrinsics.h(displayMessage, "displayMessage");
        this.lifetimeRedeemed = lifetimeRedeemed;
        this.displayMessage = displayMessage;
    }

    public static /* synthetic */ RewardsLifetimeRedeemedData copy$default(RewardsLifetimeRedeemedData rewardsLifetimeRedeemedData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsLifetimeRedeemedData.lifetimeRedeemed;
        }
        if ((i & 2) != 0) {
            str2 = rewardsLifetimeRedeemedData.displayMessage;
        }
        return rewardsLifetimeRedeemedData.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLifetimeRedeemed() {
        return this.lifetimeRedeemed;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDisplayMessage() {
        return this.displayMessage;
    }

    @NotNull
    public final RewardsLifetimeRedeemedData copy(@NotNull String lifetimeRedeemed, @NotNull String displayMessage) {
        Intrinsics.h(lifetimeRedeemed, "lifetimeRedeemed");
        Intrinsics.h(displayMessage, "displayMessage");
        return new RewardsLifetimeRedeemedData(lifetimeRedeemed, displayMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsLifetimeRedeemedData)) {
            return false;
        }
        RewardsLifetimeRedeemedData rewardsLifetimeRedeemedData = (RewardsLifetimeRedeemedData) other;
        return Intrinsics.c(this.lifetimeRedeemed, rewardsLifetimeRedeemedData.lifetimeRedeemed) && Intrinsics.c(this.displayMessage, rewardsLifetimeRedeemedData.displayMessage);
    }

    @NotNull
    public final String getDisplayMessage() {
        return this.displayMessage;
    }

    @NotNull
    public final String getLifetimeRedeemed() {
        return this.lifetimeRedeemed;
    }

    public int hashCode() {
        return this.displayMessage.hashCode() + (this.lifetimeRedeemed.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.j("RewardsLifetimeRedeemedData(lifetimeRedeemed=", this.lifetimeRedeemed, ", displayMessage=", this.displayMessage, ")");
    }
}
