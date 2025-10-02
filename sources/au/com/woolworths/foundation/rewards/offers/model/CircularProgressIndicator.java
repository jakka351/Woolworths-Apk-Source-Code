package au.com.woolworths.foundation.rewards.offers.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/CircularProgressIndicator;", "Landroid/os/Parcelable;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CircularProgressIndicator implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CircularProgressIndicator> CREATOR = new Creator();
    public final CircularProgressRing d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CircularProgressIndicator> {
        @Override // android.os.Parcelable.Creator
        public final CircularProgressIndicator createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CircularProgressIndicator(CircularProgressRing.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CircularProgressIndicator[] newArray(int i) {
            return new CircularProgressIndicator[i];
        }
    }

    public CircularProgressIndicator(CircularProgressRing primaryRing) {
        Intrinsics.h(primaryRing, "primaryRing");
        this.d = primaryRing;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CircularProgressIndicator) && Intrinsics.c(this.d, ((CircularProgressIndicator) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "CircularProgressIndicator(primaryRing=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        this.d.writeToParcel(dest, i);
    }
}
