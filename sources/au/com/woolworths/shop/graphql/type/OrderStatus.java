package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OrderStatus;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderStatus {
    public static final Companion e;
    public static final EnumType f;
    public static final OrderStatus g;
    public static final /* synthetic */ OrderStatus[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OrderStatus$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        OrderStatus orderStatus = new OrderStatus("PENDING", 0, "PENDING");
        OrderStatus orderStatus2 = new OrderStatus("READY", 1, "READY");
        OrderStatus orderStatus3 = new OrderStatus("COMPLETE", 2, "COMPLETE");
        OrderStatus orderStatus4 = new OrderStatus("CANCELLED", 3, "CANCELLED");
        OrderStatus orderStatus5 = new OrderStatus("UNKNOWN__", 4, "UNKNOWN__");
        g = orderStatus5;
        OrderStatus[] orderStatusArr = {orderStatus, orderStatus2, orderStatus3, orderStatus4, orderStatus5};
        h = orderStatusArr;
        i = EnumEntriesKt.a(orderStatusArr);
        e = new Companion();
        f = new EnumType("OrderStatus", CollectionsKt.R("PENDING", "READY", "COMPLETE", "CANCELLED"));
    }

    public OrderStatus(String str, int i2, String str2) {
        this.d = str2;
    }

    public static OrderStatus valueOf(String str) {
        return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
    }

    public static OrderStatus[] values() {
        return (OrderStatus[]) h.clone();
    }
}
