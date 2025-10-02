package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OrderStatusType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderStatusType {
    public static final Companion e;
    public static final EnumType f;
    public static final OrderStatusType g;
    public static final /* synthetic */ OrderStatusType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OrderStatusType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        OrderStatusType orderStatusType = new OrderStatusType("PENDING", 0, "PENDING");
        OrderStatusType orderStatusType2 = new OrderStatusType("READY", 1, "READY");
        OrderStatusType orderStatusType3 = new OrderStatusType("COMPLETE", 2, "COMPLETE");
        OrderStatusType orderStatusType4 = new OrderStatusType("CANCELLED", 3, "CANCELLED");
        OrderStatusType orderStatusType5 = new OrderStatusType("UNKNOWN__", 4, "UNKNOWN__");
        g = orderStatusType5;
        OrderStatusType[] orderStatusTypeArr = {orderStatusType, orderStatusType2, orderStatusType3, orderStatusType4, orderStatusType5};
        h = orderStatusTypeArr;
        i = EnumEntriesKt.a(orderStatusTypeArr);
        e = new Companion();
        f = new EnumType("OrderStatusType", CollectionsKt.R("PENDING", "READY", "COMPLETE", "CANCELLED"));
    }

    public OrderStatusType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static OrderStatusType valueOf(String str) {
        return (OrderStatusType) Enum.valueOf(OrderStatusType.class, str);
    }

    public static OrderStatusType[] values() {
        return (OrderStatusType[]) h.clone();
    }
}
