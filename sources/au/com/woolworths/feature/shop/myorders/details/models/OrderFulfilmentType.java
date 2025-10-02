package au.com.woolworths.feature.shop.myorders.details.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderFulfilmentType;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OrderFulfilmentType {
    public static final OrderFulfilmentType d;
    public static final OrderFulfilmentType e;
    public static final OrderFulfilmentType f;
    public static final OrderFulfilmentType g;
    public static final OrderFulfilmentType h;
    public static final OrderFulfilmentType i;
    public static final OrderFulfilmentType j;
    public static final /* synthetic */ OrderFulfilmentType[] k;
    public static final /* synthetic */ EnumEntries l;

    static {
        OrderFulfilmentType orderFulfilmentType = new OrderFulfilmentType() { // from class: au.com.woolworths.feature.shop.myorders.details.models.OrderFulfilmentType.PICKUP
            @Override // au.com.woolworths.feature.shop.myorders.details.models.OrderFulfilmentType
            public final String a() {
                return "Pickup";
            }
        };
        d = orderFulfilmentType;
        OrderFulfilmentType orderFulfilmentType2 = new OrderFulfilmentType() { // from class: au.com.woolworths.feature.shop.myorders.details.models.OrderFulfilmentType.DRIVE_UP
            @Override // au.com.woolworths.feature.shop.myorders.details.models.OrderFulfilmentType
            public final String a() {
                return "DriveUp";
            }
        };
        e = orderFulfilmentType2;
        OrderFulfilmentType orderFulfilmentType3 = new OrderFulfilmentType() { // from class: au.com.woolworths.feature.shop.myorders.details.models.OrderFulfilmentType.COURIER
            @Override // au.com.woolworths.feature.shop.myorders.details.models.OrderFulfilmentType
            public final String a() {
                return "Courier";
            }
        };
        f = orderFulfilmentType3;
        OrderFulfilmentType orderFulfilmentType4 = new OrderFulfilmentType() { // from class: au.com.woolworths.feature.shop.myorders.details.models.OrderFulfilmentType.EXPRESS
            @Override // au.com.woolworths.feature.shop.myorders.details.models.OrderFulfilmentType
            public final String a() {
                return "Express";
            }
        };
        g = orderFulfilmentType4;
        OrderFulfilmentType orderFulfilmentType5 = new OrderFulfilmentType() { // from class: au.com.woolworths.feature.shop.myorders.details.models.OrderFulfilmentType.CROWD
            @Override // au.com.woolworths.feature.shop.myorders.details.models.OrderFulfilmentType
            public final String a() {
                return "Crowd";
            }
        };
        h = orderFulfilmentType5;
        OrderFulfilmentType orderFulfilmentType6 = new OrderFulfilmentType() { // from class: au.com.woolworths.feature.shop.myorders.details.models.OrderFulfilmentType.DTB_NOW
            @Override // au.com.woolworths.feature.shop.myorders.details.models.OrderFulfilmentType
            public final String a() {
                return "DTBNow";
            }
        };
        i = orderFulfilmentType6;
        OrderFulfilmentType orderFulfilmentType7 = new OrderFulfilmentType() { // from class: au.com.woolworths.feature.shop.myorders.details.models.OrderFulfilmentType.UNKNOWN
            @Override // au.com.woolworths.feature.shop.myorders.details.models.OrderFulfilmentType
            public final String a() {
                return "Unknown";
            }
        };
        j = orderFulfilmentType7;
        OrderFulfilmentType[] orderFulfilmentTypeArr = {orderFulfilmentType, orderFulfilmentType2, orderFulfilmentType3, orderFulfilmentType4, orderFulfilmentType5, orderFulfilmentType6, orderFulfilmentType7};
        k = orderFulfilmentTypeArr;
        l = EnumEntriesKt.a(orderFulfilmentTypeArr);
    }

    public static OrderFulfilmentType valueOf(String str) {
        return (OrderFulfilmentType) Enum.valueOf(OrderFulfilmentType.class, str);
    }

    public static OrderFulfilmentType[] values() {
        return (OrderFulfilmentType[]) k.clone();
    }

    public abstract String a();
}
