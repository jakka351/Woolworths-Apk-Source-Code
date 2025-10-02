package au.com.woolworths.feature.shop.myorders.orders.data;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/data/MyOrders;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MyOrders {

    /* renamed from: a, reason: collision with root package name */
    public final int f7866a;
    public final Integer b;
    public final Object c;
    public final OrdersMessage d;

    public MyOrders(int i, Integer num, List list, OrdersMessage ordersMessage) {
        this.f7866a = i;
        this.b = num;
        this.c = list;
        this.d = ordersMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyOrders)) {
            return false;
        }
        MyOrders myOrders = (MyOrders) obj;
        return this.f7866a == myOrders.f7866a && Intrinsics.c(this.b, myOrders.b) && this.c.equals(myOrders.c) && Intrinsics.c(this.d, myOrders.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f7866a) * 31;
        Integer num = this.b;
        int iE = a.e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        OrdersMessage ordersMessage = this.d;
        return iE + (ordersMessage != null ? ordersMessage.hashCode() : 0);
    }

    public final String toString() {
        return "MyOrders(totalItemCount=" + this.f7866a + ", nextPage=" + this.b + ", feed=" + this.c + ", message=" + this.d + ")";
    }
}
