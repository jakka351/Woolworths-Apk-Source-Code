package au.com.woolworths.foundation.rewards.offers.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/CircularProgressRing;", "Landroid/os/Parcelable;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CircularProgressRing implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CircularProgressRing> CREATOR = new Creator();
    public final double d;
    public final String e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CircularProgressRing> {
        @Override // android.os.Parcelable.Creator
        public final CircularProgressRing createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CircularProgressRing(parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CircularProgressRing[] newArray(int i) {
            return new CircularProgressRing[i];
        }
    }

    public CircularProgressRing(double d, String ringColor) {
        Intrinsics.h(ringColor, "ringColor");
        this.d = d;
        this.e = ringColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CircularProgressRing)) {
            return false;
        }
        CircularProgressRing circularProgressRing = (CircularProgressRing) obj;
        return Double.compare(this.d, circularProgressRing.d) == 0 && Intrinsics.c(this.e, circularProgressRing.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (Double.hashCode(this.d) * 31);
    }

    public final String toString() {
        return "CircularProgressRing(ringPercent=" + this.d + ", ringColor=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeDouble(this.d);
        dest.writeString(this.e);
    }
}
