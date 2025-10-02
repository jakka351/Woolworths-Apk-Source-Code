package au.com.woolworths.foundation.shop.storelocator.pickup.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/storelocator/pickup/models/PickUpType;", "Landroid/os/Parcelable;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PickUpType implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PickUpType> CREATOR = new Creator();
    public final String d;
    public final PickUpOption e;
    public final String f;
    public final String g;
    public final String h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PickUpType> {
        @Override // android.os.Parcelable.Creator
        public final PickUpType createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PickUpType(parcel.readString(), PickUpOption.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PickUpType[] newArray(int i) {
            return new PickUpType[i];
        }
    }

    public PickUpType(String addressId, PickUpOption type, String label, String text, String shoppingModeId) {
        Intrinsics.h(addressId, "addressId");
        Intrinsics.h(type, "type");
        Intrinsics.h(label, "label");
        Intrinsics.h(text, "text");
        Intrinsics.h(shoppingModeId, "shoppingModeId");
        this.d = addressId;
        this.e = type;
        this.f = label;
        this.g = text;
        this.h = shoppingModeId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickUpType)) {
            return false;
        }
        PickUpType pickUpType = (PickUpType) obj;
        return Intrinsics.c(this.d, pickUpType.d) && this.e == pickUpType.e && Intrinsics.c(this.f, pickUpType.f) && Intrinsics.c(this.g, pickUpType.g) && Intrinsics.c(this.h, pickUpType.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + b.c(b.c((this.e.hashCode() + (this.d.hashCode() * 31)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickUpType(addressId=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", label=");
        a.B(sb, this.f, ", text=", this.g, ", shoppingModeId=");
        return YU.a.o(sb, this.h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e.name());
        dest.writeString(this.f);
        dest.writeString(this.g);
        dest.writeString(this.h);
    }
}
