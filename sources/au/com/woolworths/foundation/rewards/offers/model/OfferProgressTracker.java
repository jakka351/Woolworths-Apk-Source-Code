package au.com.woolworths.foundation.rewards.offers.model;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferProgressTracker;", "Landroid/os/Parcelable;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfferProgressTracker implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OfferProgressTracker> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;
    public final CircularProgressIndicator g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OfferProgressTracker> {
        @Override // android.os.Parcelable.Creator
        public final OfferProgressTracker createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new OfferProgressTracker(parcel.readString(), parcel.readString(), parcel.readString(), CircularProgressIndicator.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OfferProgressTracker[] newArray(int i) {
            return new OfferProgressTracker[i];
        }
    }

    public OfferProgressTracker(String title, String str, String description, CircularProgressIndicator circularProgressIndicator) {
        Intrinsics.h(title, "title");
        Intrinsics.h(description, "description");
        Intrinsics.h(circularProgressIndicator, "circularProgressIndicator");
        this.d = title;
        this.e = str;
        this.f = description;
        this.g = circularProgressIndicator;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferProgressTracker)) {
            return false;
        }
        OfferProgressTracker offerProgressTracker = (OfferProgressTracker) obj;
        return Intrinsics.c(this.d, offerProgressTracker.d) && Intrinsics.c(this.e, offerProgressTracker.e) && Intrinsics.c(this.f, offerProgressTracker.f) && Intrinsics.c(this.g, offerProgressTracker.g);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        return this.g.d.hashCode() + b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbV = a.v("OfferProgressTracker(title=", this.d, ", titleSuffix=", this.e, ", description=");
        sbV.append(this.f);
        sbV.append(", circularProgressIndicator=");
        sbV.append(this.g);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        this.g.writeToParcel(dest, i);
    }
}
