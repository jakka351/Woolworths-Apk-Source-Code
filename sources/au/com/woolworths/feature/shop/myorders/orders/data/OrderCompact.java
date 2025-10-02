package au.com.woolworths.feature.shop.myorders.orders.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/data/OrderCompact;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderCompact {

    /* renamed from: a, reason: collision with root package name */
    public final String f7867a;
    public final String b;
    public final String c;
    public final OrderStatus d;
    public final String e;
    public final String f;
    public final String g;

    public OrderCompact(String str, String str2, String str3, OrderStatus orderStatus, String str4, String str5, String str6) {
        this.f7867a = str;
        this.b = str2;
        this.c = str3;
        this.d = orderStatus;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCompact)) {
            return false;
        }
        OrderCompact orderCompact = (OrderCompact) obj;
        return Intrinsics.c(this.f7867a, orderCompact.f7867a) && Intrinsics.c(this.b, orderCompact.b) && Intrinsics.c(this.c, orderCompact.c) && this.d == orderCompact.d && Intrinsics.c(this.e, orderCompact.e) && Intrinsics.c(this.f, orderCompact.f) && Intrinsics.c(this.g, orderCompact.g);
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f7867a.hashCode() * 31, 31, this.b), 31, this.c);
        OrderStatus orderStatus = this.d;
        return this.g.hashCode() + b.c(b.c((iC + (orderStatus == null ? 0 : orderStatus.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbV = a.v("OrderCompact(id=", this.f7867a, ", title=", this.b, ", subtitle=");
        sbV.append(this.c);
        sbV.append(", status=");
        sbV.append(this.d);
        sbV.append(", total=");
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", date=", this.f, ", iconUrl=");
        return a.o(sbV, this.g, ")");
    }
}
