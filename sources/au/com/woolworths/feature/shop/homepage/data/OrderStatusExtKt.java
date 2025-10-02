package au.com.woolworths.feature.shop.homepage.data;

import au.com.woolworths.shop.graphql.type.OrderStatus;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderStatusExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[OrderStatus.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OrderStatus.Companion companion = OrderStatus.e;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OrderStatus.Companion companion2 = OrderStatus.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OrderStatus.Companion companion3 = OrderStatus.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final au.com.woolworths.feature.shop.myorders.orders.data.OrderStatus a(OrderStatus orderStatus) {
        int iOrdinal = orderStatus.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? au.com.woolworths.feature.shop.myorders.orders.data.OrderStatus.m : au.com.woolworths.feature.shop.myorders.orders.data.OrderStatus.l : au.com.woolworths.feature.shop.myorders.orders.data.OrderStatus.k : au.com.woolworths.feature.shop.myorders.orders.data.OrderStatus.i : au.com.woolworths.feature.shop.myorders.orders.data.OrderStatus.j;
    }
}
