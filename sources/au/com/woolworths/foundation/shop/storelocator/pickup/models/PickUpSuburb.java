package au.com.woolworths.foundation.shop.storelocator.pickup.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/storelocator/pickup/models/PickUpSuburb;", "Landroid/os/Parcelable;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PickUpSuburb implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PickUpSuburb> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PickUpSuburb> {
        @Override // android.os.Parcelable.Creator
        public final PickUpSuburb createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PickUpSuburb(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PickUpSuburb[] newArray(int i) {
            return new PickUpSuburb[i];
        }
    }

    public PickUpSuburb(String name, String state, String postcode) {
        Intrinsics.h(name, "name");
        Intrinsics.h(state, "state");
        Intrinsics.h(postcode, "postcode");
        this.d = name;
        this.e = state;
        this.f = postcode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickUpSuburb)) {
            return false;
        }
        PickUpSuburb pickUpSuburb = (PickUpSuburb) obj;
        return Intrinsics.c(this.d, pickUpSuburb.d) && Intrinsics.c(this.e, pickUpSuburb.e) && Intrinsics.c(this.f, pickUpSuburb.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
    }

    public final String toString() {
        return a.o(a.v("PickUpSuburb(name=", this.d, ", state=", this.e, ", postcode="), this.f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
