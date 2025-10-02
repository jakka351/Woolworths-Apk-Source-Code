package au.com.woolworths.feature.shop.myorders.orders.data;

import com.woolworths.feature.shop.myorders.MyOrdersQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MyOrdersQueryOrdersExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [au.com.woolworths.feature.shop.myorders.orders.data.OrderCompact] */
    /* JADX WARN: Type inference failed for: r7v2, types: [au.com.woolworths.feature.shop.myorders.orders.data.DeliveryOrder] */
    public static final MyOrders a(MyOrdersQuery.Orders orders) {
        ?? arrayList;
        Iterator it;
        PickUpOrder orderCompact;
        int i = orders.f20011a;
        Integer num = orders.b;
        List list = orders.c;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MyOrdersQuery.Feed feed = (MyOrdersQuery.Feed) it2.next();
                MyOrdersQuery.OnPickUpOrder onPickUpOrder = feed.b;
                if (onPickUpOrder != null) {
                    String str = onPickUpOrder.b;
                    String str2 = onPickUpOrder.c;
                    au.com.woolworths.shop.graphql.type.OrderStatus orderStatus = onPickUpOrder.e;
                    orderCompact = new PickUpOrder(str, str2, orderStatus != null ? OrderStatusExtKt.a(orderStatus) : null, onPickUpOrder.f20010a, onPickUpOrder.f, onPickUpOrder.j, onPickUpOrder.i, onPickUpOrder.g, onPickUpOrder.h, onPickUpOrder.d);
                    it = it2;
                } else {
                    MyOrdersQuery.OnDeliveryOrder onDeliveryOrder = feed.c;
                    if (onDeliveryOrder != null) {
                        String str3 = onDeliveryOrder.b;
                        String str4 = onDeliveryOrder.c;
                        au.com.woolworths.shop.graphql.type.OrderStatus orderStatus2 = onDeliveryOrder.e;
                        it = it2;
                        orderCompact = new DeliveryOrder(str3, str4, orderStatus2 != null ? OrderStatusExtKt.a(orderStatus2) : null, onDeliveryOrder.f20009a, onDeliveryOrder.f, onDeliveryOrder.i, onDeliveryOrder.g, onDeliveryOrder.h, onDeliveryOrder.d, onDeliveryOrder.j, onDeliveryOrder.k);
                    } else {
                        it = it2;
                        MyOrdersQuery.OnCompactOrder onCompactOrder = feed.d;
                        if (onCompactOrder != null) {
                            String str5 = onCompactOrder.f20008a;
                            String str6 = onCompactOrder.b;
                            String str7 = onCompactOrder.c;
                            au.com.woolworths.shop.graphql.type.OrderStatus orderStatus3 = onCompactOrder.d;
                            orderCompact = new OrderCompact(str5, str6, str7, orderStatus3 != null ? OrderStatusExtKt.a(orderStatus3) : null, onCompactOrder.e, onCompactOrder.f, onCompactOrder.g);
                        } else {
                            orderCompact = null;
                        }
                    }
                }
                if (orderCompact != null) {
                    arrayList.add(orderCompact);
                }
                it2 = it;
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = EmptyList.d;
        }
        MyOrdersQuery.Message message = orders.d;
        return new MyOrders(i, num, arrayList, message != null ? new OrdersMessage(message.f20007a, message.b) : null);
    }
}
