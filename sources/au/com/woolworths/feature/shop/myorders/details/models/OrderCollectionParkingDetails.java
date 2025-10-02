package au.com.woolworths.feature.shop.myorders.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderCollectionParkingDetails;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderCollectionParkingDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderCollectionParkingDetails> CREATOR = new Creator();
    public final String d;
    public final List e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderCollectionParkingDetails> {
        @Override // android.os.Parcelable.Creator
        public final OrderCollectionParkingDetails createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new OrderCollectionParkingDetails(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderCollectionParkingDetails[] newArray(int i) {
            return new OrderCollectionParkingDetails[i];
        }
    }

    public OrderCollectionParkingDetails(String str, List parkingDirections) {
        Intrinsics.h(parkingDirections, "parkingDirections");
        this.d = str;
        this.e = parkingDirections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCollectionParkingDetails)) {
            return false;
        }
        OrderCollectionParkingDetails orderCollectionParkingDetails = (OrderCollectionParkingDetails) obj;
        return Intrinsics.c(this.d, orderCollectionParkingDetails.d) && Intrinsics.c(this.e, orderCollectionParkingDetails.e);
    }

    public final int hashCode() {
        String str = this.d;
        return this.e.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.i("OrderCollectionParkingDetails(parkingMapUrl=", this.d, ", parkingDirections=", ")", this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeStringList(this.e);
    }
}
