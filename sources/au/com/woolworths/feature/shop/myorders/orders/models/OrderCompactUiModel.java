package au.com.woolworths.feature.shop.myorders.orders.models;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.orders.data.OrderCompact;
import au.com.woolworths.feature.shop.myorders.orders.data.OrderStatus;
import au.com.woolworths.feature.shop.myorders.orders.list.OrderListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/models/OrderCompactUiModel;", "Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderCompactUiModel implements OrderListItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f7879a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final OrderStatus f;
    public final String g;

    public OrderCompactUiModel(OrderCompact orderCompact) {
        String str = orderCompact.f7867a;
        String str2 = orderCompact.b;
        String str3 = orderCompact.c;
        String str4 = orderCompact.e;
        String str5 = orderCompact.f;
        OrderStatus orderStatus = orderCompact.d;
        String str6 = orderCompact.g;
        this.f7879a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = orderStatus;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCompactUiModel)) {
            return false;
        }
        OrderCompactUiModel orderCompactUiModel = (OrderCompactUiModel) obj;
        return Intrinsics.c(this.f7879a, orderCompactUiModel.f7879a) && Intrinsics.c(this.b, orderCompactUiModel.b) && Intrinsics.c(this.c, orderCompactUiModel.c) && Intrinsics.c(this.d, orderCompactUiModel.d) && Intrinsics.c(this.e, orderCompactUiModel.e) && this.f == orderCompactUiModel.f && Intrinsics.c(this.g, orderCompactUiModel.g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f7879a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        OrderStatus orderStatus = this.f;
        return this.g.hashCode() + ((iHashCode + (orderStatus == null ? 0 : orderStatus.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderCompactUiModel(id=");
        sb.append(this.f7879a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", subtitle=");
        sb.append((Object) this.c);
        sb.append(", total=");
        sb.append((Object) this.d);
        sb.append(", date=");
        sb.append((Object) this.e);
        sb.append(", status=");
        sb.append(this.f);
        sb.append(", iconUrl=");
        return a.o(sb, this.g, ")");
    }
}
