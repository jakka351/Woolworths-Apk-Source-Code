package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OrderType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderType {
    public static final Companion e;
    public static final OrderType f;
    public static final OrderType g;
    public static final OrderType h;
    public static final /* synthetic */ OrderType[] i;
    public static final /* synthetic */ EnumEntries j;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OrderType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        OrderType orderType = new OrderType("CURRENT", 0, "CURRENT");
        f = orderType;
        OrderType orderType2 = new OrderType("PAST", 1, "PAST");
        g = orderType2;
        OrderType orderType3 = new OrderType("UNKNOWN__", 2, "UNKNOWN__");
        h = orderType3;
        OrderType[] orderTypeArr = {orderType, orderType2, orderType3};
        i = orderTypeArr;
        j = EnumEntriesKt.a(orderTypeArr);
        e = new Companion();
        CollectionsKt.R("CURRENT", "PAST");
    }

    public OrderType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static OrderType valueOf(String str) {
        return (OrderType) Enum.valueOf(OrderType.class, str);
    }

    public static OrderType[] values() {
        return (OrderType[]) i.clone();
    }
}
