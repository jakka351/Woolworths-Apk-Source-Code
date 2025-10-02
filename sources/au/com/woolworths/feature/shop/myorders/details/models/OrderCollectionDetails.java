package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderCollectionDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderCollectionDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f7762a;
    public final String b;
    public final String c;
    public final OrderCollectionParkingDetails d;

    public OrderCollectionDetails(String str, String str2, String str3, OrderCollectionParkingDetails orderCollectionParkingDetails) {
        this.f7762a = str;
        this.b = str2;
        this.c = str3;
        this.d = orderCollectionParkingDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCollectionDetails)) {
            return false;
        }
        OrderCollectionDetails orderCollectionDetails = (OrderCollectionDetails) obj;
        return Intrinsics.c(this.f7762a, orderCollectionDetails.f7762a) && Intrinsics.c(this.b, orderCollectionDetails.b) && Intrinsics.c(this.c, orderCollectionDetails.c) && Intrinsics.c(this.d, orderCollectionDetails.d);
    }

    public final int hashCode() {
        int iC = b.c(this.f7762a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        OrderCollectionParkingDetails orderCollectionParkingDetails = this.d;
        return iHashCode + (orderCollectionParkingDetails != null ? orderCollectionParkingDetails.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("OrderCollectionDetails(fulfillmentLabel=", this.f7762a, ", fulfillmentType=", this.b, ", actionTitle=");
        sbV.append(this.c);
        sbV.append(", parkingDetails=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
