package au.com.woolworths.feature.shop.myorders.orders.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/data/PickUpOrder;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PickUpOrder {

    /* renamed from: a, reason: collision with root package name */
    public final String f7869a;
    public final String b;
    public final OrderStatus c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public PickUpOrder(String str, String str2, OrderStatus orderStatus, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f7869a = str;
        this.b = str2;
        this.c = orderStatus;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickUpOrder)) {
            return false;
        }
        PickUpOrder pickUpOrder = (PickUpOrder) obj;
        return Intrinsics.c(this.f7869a, pickUpOrder.f7869a) && Intrinsics.c(this.b, pickUpOrder.b) && this.c == pickUpOrder.c && Intrinsics.c(this.d, pickUpOrder.d) && Intrinsics.c(this.e, pickUpOrder.e) && Intrinsics.c(this.f, pickUpOrder.f) && Intrinsics.c(this.g, pickUpOrder.g) && Intrinsics.c(this.h, pickUpOrder.h) && Intrinsics.c(this.i, pickUpOrder.i) && Intrinsics.c(this.j, pickUpOrder.j);
    }

    public final int hashCode() {
        int iC = b.c(this.f7869a.hashCode() * 31, 31, this.b);
        OrderStatus orderStatus = this.c;
        return this.j.hashCode() + b.c(b.c(b.c(b.c(b.c(b.c((iC + (orderStatus == null ? 0 : orderStatus.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbV = a.v("PickUpOrder(title=", this.f7869a, ", subtitle=", this.b, ", status=");
        sbV.append(this.c);
        sbV.append(", id=");
        sbV.append(this.d);
        sbV.append(", total=");
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", actionTitle=", this.f, ", actionPath=");
        androidx.constraintlayout.core.state.a.B(sbV, this.g, ", timeLabel=", this.h, ", timeValue=");
        return androidx.constraintlayout.core.state.a.l(sbV, this.i, ", date=", this.j, ")");
    }
}
