package au.com.woolworths.feature.rewards.everydayextras.signup.data.shared;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/AlertDialogAnalytics;", "Landroid/os/Parcelable;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AlertDialogAnalytics implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlertDialogAnalytics> CREATOR = new Creator();
    public final String d;
    public final String e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AlertDialogAnalytics> {
        @Override // android.os.Parcelable.Creator
        public final AlertDialogAnalytics createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new AlertDialogAnalytics(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AlertDialogAnalytics[] newArray(int i) {
            return new AlertDialogAnalytics[i];
        }
    }

    public AlertDialogAnalytics(String eventCategory, String eventDescription) {
        Intrinsics.h(eventCategory, "eventCategory");
        Intrinsics.h(eventDescription, "eventDescription");
        this.d = eventCategory;
        this.e = eventDescription;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertDialogAnalytics)) {
            return false;
        }
        AlertDialogAnalytics alertDialogAnalytics = (AlertDialogAnalytics) obj;
        return Intrinsics.c(this.d, alertDialogAnalytics.d) && Intrinsics.c(this.e, alertDialogAnalytics.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return a.j("AlertDialogAnalytics(eventCategory=", this.d, ", eventDescription=", this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
