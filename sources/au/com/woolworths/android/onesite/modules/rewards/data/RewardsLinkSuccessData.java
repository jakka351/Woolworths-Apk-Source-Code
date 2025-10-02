package au.com.woolworths.android.onesite.modules.rewards.data;

import YU.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLinkSuccessData;", "", "", "status", "cardNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RewardsLinkSuccessData {

    @SerializedName("cardNumber")
    @NotNull
    private final String cardNumber;

    @SerializedName("status")
    @Nullable
    private final String status;

    public RewardsLinkSuccessData(@Nullable String str, @NotNull String cardNumber) {
        Intrinsics.h(cardNumber, "cardNumber");
        this.status = str;
        this.cardNumber = cardNumber;
    }

    /* renamed from: a, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsLinkSuccessData)) {
            return false;
        }
        RewardsLinkSuccessData rewardsLinkSuccessData = (RewardsLinkSuccessData) obj;
        return Intrinsics.c(this.status, rewardsLinkSuccessData.status) && Intrinsics.c(this.cardNumber, rewardsLinkSuccessData.cardNumber);
    }

    public final int hashCode() {
        String str = this.status;
        return this.cardNumber.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.j("RewardsLinkSuccessData(status=", this.status, ", cardNumber=", this.cardNumber, ")");
    }
}
