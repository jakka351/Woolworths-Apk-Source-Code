package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OrderFulfilmentType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderFulfilmentType {
    public static final Companion e;
    public static final EnumType f;
    public static final OrderFulfilmentType g;
    public static final /* synthetic */ OrderFulfilmentType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OrderFulfilmentType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static EnumType a() {
            return OrderFulfilmentType.f;
        }
    }

    static {
        OrderFulfilmentType orderFulfilmentType = new OrderFulfilmentType("Unknown", 0, "Unknown");
        OrderFulfilmentType orderFulfilmentType2 = new OrderFulfilmentType("Pickup", 1, "Pickup");
        OrderFulfilmentType orderFulfilmentType3 = new OrderFulfilmentType("DriveUp", 2, "DriveUp");
        OrderFulfilmentType orderFulfilmentType4 = new OrderFulfilmentType("Courier", 3, "Courier");
        OrderFulfilmentType orderFulfilmentType5 = new OrderFulfilmentType("Express", 4, "Express");
        OrderFulfilmentType orderFulfilmentType6 = new OrderFulfilmentType("Crowd", 5, "Crowd");
        OrderFulfilmentType orderFulfilmentType7 = new OrderFulfilmentType("DTBNow", 6, "DTBNow");
        OrderFulfilmentType orderFulfilmentType8 = new OrderFulfilmentType("UNKNOWN__", 7, "UNKNOWN__");
        g = orderFulfilmentType8;
        OrderFulfilmentType[] orderFulfilmentTypeArr = {orderFulfilmentType, orderFulfilmentType2, orderFulfilmentType3, orderFulfilmentType4, orderFulfilmentType5, orderFulfilmentType6, orderFulfilmentType7, orderFulfilmentType8};
        h = orderFulfilmentTypeArr;
        i = EnumEntriesKt.a(orderFulfilmentTypeArr);
        e = new Companion();
        f = new EnumType("OrderFulfilmentType", CollectionsKt.R("Unknown", "Pickup", "DriveUp", "Courier", "Express", "Crowd", "DTBNow"));
    }

    public OrderFulfilmentType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static OrderFulfilmentType valueOf(String str) {
        return (OrderFulfilmentType) Enum.valueOf(OrderFulfilmentType.class, str);
    }

    public static OrderFulfilmentType[] values() {
        return (OrderFulfilmentType[]) h.clone();
    }
}
