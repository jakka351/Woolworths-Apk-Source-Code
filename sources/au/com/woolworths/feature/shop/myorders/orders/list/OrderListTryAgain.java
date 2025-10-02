package au.com.woolworths.feature.shop.myorders.orders.list;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListTryAgain;", "Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderListTryAgain implements OrderListItem {

    /* renamed from: a, reason: collision with root package name */
    public final int f7875a;

    public OrderListTryAgain(int i) {
        this.f7875a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderListTryAgain) && this.f7875a == ((OrderListTryAgain) obj).f7875a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7875a);
    }

    public final String toString() {
        return a.e(this.f7875a, "OrderListTryAgain(nextPage=", ")");
    }
}
