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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsLinkError;", "Landroid/os/Parcelable;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsLinkError implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardsLinkError> CREATOR = new Creator();
    public final String d;
    public final int e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsLinkError> {
        @Override // android.os.Parcelable.Creator
        public final RewardsLinkError createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RewardsLinkError(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RewardsLinkError[] newArray(int i) {
            return new RewardsLinkError[i];
        }
    }

    public RewardsLinkError(String message, int i) {
        Intrinsics.h(message, "message");
        this.d = message;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsLinkError)) {
            return false;
        }
        RewardsLinkError rewardsLinkError = (RewardsLinkError) obj;
        return Intrinsics.c(this.d, rewardsLinkError.d) && this.e == rewardsLinkError.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return android.support.v4.media.session.a.p("RewardsLinkError(message=", this.e, this.d, ", status=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeInt(this.e);
    }
}
