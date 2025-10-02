package au.com.woolworths.feature.shop.myorders.details.models;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderDetailSummary;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderDetailSummary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderDetailSummary> CREATOR = new Creator();
    public final String d;
    public final String e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderDetailSummary> {
        @Override // android.os.Parcelable.Creator
        public final OrderDetailSummary createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new OrderDetailSummary(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderDetailSummary[] newArray(int i) {
            return new OrderDetailSummary[i];
        }
    }

    public OrderDetailSummary(String orderNumber, String orderDate) {
        Intrinsics.h(orderNumber, "orderNumber");
        Intrinsics.h(orderDate, "orderDate");
        this.d = orderNumber;
        this.e = orderDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailSummary)) {
            return false;
        }
        OrderDetailSummary orderDetailSummary = (OrderDetailSummary) obj;
        return Intrinsics.c(this.d, orderDetailSummary.d) && Intrinsics.c(this.e, orderDetailSummary.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return a.j("OrderDetailSummary(orderNumber=", this.d, ", orderDate=", this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
