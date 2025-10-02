package au.com.woolworths.base.rewards.account.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsTwoFactorAuth;", "Landroid/os/Parcelable;", "stepUpUrl", "", "<init>", "(Ljava/lang/String;)V", "getStepUpUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsTwoFactorAuth implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<RewardsTwoFactorAuth> CREATOR = new Creator();

    @SerializedName("stepUpUrl")
    @NotNull
    private final String stepUpUrl;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsTwoFactorAuth> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsTwoFactorAuth createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RewardsTwoFactorAuth(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsTwoFactorAuth[] newArray(int i) {
            return new RewardsTwoFactorAuth[i];
        }
    }

    public RewardsTwoFactorAuth(@NotNull String stepUpUrl) {
        Intrinsics.h(stepUpUrl, "stepUpUrl");
        this.stepUpUrl = stepUpUrl;
    }

    public static /* synthetic */ RewardsTwoFactorAuth copy$default(RewardsTwoFactorAuth rewardsTwoFactorAuth, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsTwoFactorAuth.stepUpUrl;
        }
        return rewardsTwoFactorAuth.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStepUpUrl() {
        return this.stepUpUrl;
    }

    @NotNull
    public final RewardsTwoFactorAuth copy(@NotNull String stepUpUrl) {
        Intrinsics.h(stepUpUrl, "stepUpUrl");
        return new RewardsTwoFactorAuth(stepUpUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RewardsTwoFactorAuth) && Intrinsics.c(this.stepUpUrl, ((RewardsTwoFactorAuth) other).stepUpUrl);
    }

    @NotNull
    public final String getStepUpUrl() {
        return this.stepUpUrl;
    }

    public int hashCode() {
        return this.stepUpUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return a.h("RewardsTwoFactorAuth(stepUpUrl=", this.stepUpUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.stepUpUrl);
    }
}
