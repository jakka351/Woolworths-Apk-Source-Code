package au.com.woolworths.feature.shop.myorders.orders.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/data/DeliveryOrder;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeliveryOrder {

    /* renamed from: a, reason: collision with root package name */
    public final String f7865a;
    public final String b;
    public final OrderStatus c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public DeliveryOrder(String str, String str2, OrderStatus orderStatus, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f7865a = str;
        this.b = str2;
        this.c = orderStatus;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryOrder)) {
            return false;
        }
        DeliveryOrder deliveryOrder = (DeliveryOrder) obj;
        return Intrinsics.c(this.f7865a, deliveryOrder.f7865a) && Intrinsics.c(this.b, deliveryOrder.b) && this.c == deliveryOrder.c && Intrinsics.c(this.d, deliveryOrder.d) && Intrinsics.c(this.e, deliveryOrder.e) && Intrinsics.c(this.f, deliveryOrder.f) && Intrinsics.c(this.g, deliveryOrder.g) && Intrinsics.c(this.h, deliveryOrder.h) && Intrinsics.c(this.i, deliveryOrder.i) && Intrinsics.c(this.j, deliveryOrder.j) && Intrinsics.c(this.k, deliveryOrder.k);
    }

    public final int hashCode() {
        int iC = b.c(this.f7865a.hashCode() * 31, 31, this.b);
        OrderStatus orderStatus = this.c;
        int iC2 = b.c(b.c(b.c(b.c(b.c(b.c((iC + (orderStatus == null ? 0 : orderStatus.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("DeliveryOrder(title=", this.f7865a, ", subtitle=", this.b, ", status=");
        sbV.append(this.c);
        sbV.append(", id=");
        sbV.append(this.d);
        sbV.append(", total=");
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", location=", this.f, ", timeLabel=");
        androidx.constraintlayout.core.state.a.B(sbV, this.g, ", timeValue=", this.h, ", date=");
        androidx.constraintlayout.core.state.a.B(sbV, this.i, ", windowTime=", this.j, ", windowDate=");
        return a.o(sbV, this.k, ")");
    }
}
