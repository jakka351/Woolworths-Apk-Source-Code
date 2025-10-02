package au.com.woolworths.feature.shop.myorders.orders.data;

import au.com.woolworths.shop.graphql.type.OrderStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderStatusExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[au.com.woolworths.shop.graphql.type.OrderStatus.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OrderStatus.Companion companion = au.com.woolworths.shop.graphql.type.OrderStatus.e;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OrderStatus.Companion companion2 = au.com.woolworths.shop.graphql.type.OrderStatus.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OrderStatus.Companion companion3 = au.com.woolworths.shop.graphql.type.OrderStatus.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final OrderStatus a(au.com.woolworths.shop.graphql.type.OrderStatus orderStatus) {
        Intrinsics.h(orderStatus, "<this>");
        int iOrdinal = orderStatus.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? OrderStatus.m : OrderStatus.l : OrderStatus.k : OrderStatus.i : OrderStatus.j;
    }
}
