package au.com.woolworths.feature.shop.more.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsState;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/feature/shop/more/data/MoreRewardsCard;", "", "", "cardNumber", "", "canBeUnlinked", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;", "rewardsState", "<init>", "(Ljava/lang/String;ZLau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "a", "()Z", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;", "c", "()Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MoreRewardsCard {

    @SerializedName("canBeUnlinked")
    private final boolean canBeUnlinked;

    @SerializedName("cardNumber")
    @NotNull
    private final String cardNumber;

    @SerializedName("rewardsState")
    @NotNull
    private final RewardsState rewardsState;

    public MoreRewardsCard(@NotNull String cardNumber, boolean z, @NotNull RewardsState rewardsState) {
        Intrinsics.h(cardNumber, "cardNumber");
        Intrinsics.h(rewardsState, "rewardsState");
        this.cardNumber = cardNumber;
        this.canBeUnlinked = z;
        this.rewardsState = rewardsState;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getCanBeUnlinked() {
        return this.canBeUnlinked;
    }

    /* renamed from: b, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: c, reason: from getter */
    public final RewardsState getRewardsState() {
        return this.rewardsState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreRewardsCard)) {
            return false;
        }
        MoreRewardsCard moreRewardsCard = (MoreRewardsCard) obj;
        return Intrinsics.c(this.cardNumber, moreRewardsCard.cardNumber) && this.canBeUnlinked == moreRewardsCard.canBeUnlinked && this.rewardsState == moreRewardsCard.rewardsState;
    }

    public final int hashCode() {
        return this.rewardsState.hashCode() + b.e(this.cardNumber.hashCode() * 31, 31, this.canBeUnlinked);
    }

    public final String toString() {
        String str = this.cardNumber;
        boolean z = this.canBeUnlinked;
        RewardsState rewardsState = this.rewardsState;
        StringBuilder sbQ = a.q("MoreRewardsCard(cardNumber=", str, ", canBeUnlinked=", ", rewardsState=", z);
        sbQ.append(rewardsState);
        sbQ.append(")");
        return sbQ.toString();
    }
}
