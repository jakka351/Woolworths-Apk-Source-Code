package au.com.woolworths.feature.shop.myorders.orders.data;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/data/OrderStatus;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderStatus {
    public static final OrderStatus i;
    public static final OrderStatus j;
    public static final OrderStatus k;
    public static final OrderStatus l;
    public static final OrderStatus m;
    public static final /* synthetic */ OrderStatus[] n;
    public static final /* synthetic */ EnumEntries o;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final int g;
    public final int h;

    static {
        OrderStatus orderStatus = new OrderStatus("READY", 0, null, R.drawable.ic_order_status_activated, 15);
        i = orderStatus;
        OrderStatus orderStatus2 = new OrderStatus("PENDING", 1, null, R.drawable.ic_order_status_disabled, 15);
        j = orderStatus2;
        OrderStatus orderStatus3 = new OrderStatus("COMPLETE", 2, Integer.valueOf(R.drawable.ic_checked_tick), 0, 30);
        k = orderStatus3;
        OrderStatus orderStatus4 = new OrderStatus("CANCELLED", 3, Integer.valueOf(R.drawable.ic_order_cancelled), 0, 16);
        l = orderStatus4;
        OrderStatus orderStatus5 = new OrderStatus("UNKNOWN", 4, null, 0, 31);
        m = orderStatus5;
        OrderStatus[] orderStatusArr = {orderStatus, orderStatus2, orderStatus3, orderStatus4, orderStatus5};
        n = orderStatusArr;
        o = EnumEntriesKt.a(orderStatusArr);
    }

    public OrderStatus(String str, int i2, Integer num, int i3, int i4) {
        Integer numValueOf = Integer.valueOf(R.color.order_status_cancelled_tint);
        Integer numValueOf2 = Integer.valueOf(R.color.order_status_cancelled_text_color);
        num = (i4 & 1) != 0 ? null : num;
        numValueOf = (i4 & 2) != 0 ? null : numValueOf;
        numValueOf2 = (i4 & 4) != 0 ? null : numValueOf2;
        int i5 = (i4 & 8) != 0 ? R.style.TextAppearance_Caption : R.style.TextAppearance_Caption_Medium;
        i3 = (i4 & 16) != 0 ? R.drawable.ic_order_status_disabled : i3;
        this.d = num;
        this.e = numValueOf;
        this.f = numValueOf2;
        this.g = i5;
        this.h = i3;
    }

    public static OrderStatus valueOf(String str) {
        return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
    }

    public static OrderStatus[] values() {
        return (OrderStatus[]) n.clone();
    }
}
