package au.com.woolworths.feature.rewards.account.authentication;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsLinkErrorWrapper;", "Landroid/os/Parcelable;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsLinkErrorWrapper implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardsLinkErrorWrapper> CREATOR = new Creator();
    public final String d;
    public final RewardsLinkError e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsLinkErrorWrapper> {
        @Override // android.os.Parcelable.Creator
        public final RewardsLinkErrorWrapper createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RewardsLinkErrorWrapper(parcel.readString(), parcel.readInt() == 0 ? null : RewardsLinkError.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RewardsLinkErrorWrapper[] newArray(int i) {
            return new RewardsLinkErrorWrapper[i];
        }
    }

    public RewardsLinkErrorWrapper(String str, RewardsLinkError rewardsLinkError) {
        this.d = str;
        this.e = rewardsLinkError;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsLinkErrorWrapper)) {
            return false;
        }
        RewardsLinkErrorWrapper rewardsLinkErrorWrapper = (RewardsLinkErrorWrapper) obj;
        return Intrinsics.c(this.d, rewardsLinkErrorWrapper.d) && Intrinsics.c(this.e, rewardsLinkErrorWrapper.e);
    }

    public final int hashCode() {
        String str = this.d;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RewardsLinkError rewardsLinkError = this.e;
        return iHashCode + (rewardsLinkError != null ? rewardsLinkError.hashCode() : 0);
    }

    public final String toString() {
        return "RewardsLinkErrorWrapper(type=" + this.d + ", data=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        RewardsLinkError rewardsLinkError = this.e;
        if (rewardsLinkError == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardsLinkError.writeToParcel(dest, i);
        }
    }
}
