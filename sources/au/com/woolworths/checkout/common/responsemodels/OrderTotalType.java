package au.com.woolworths.checkout.common.responsemodels;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/OrderTotalType;", "", "<init>", "(Ljava/lang/String;I)V", "NEGATIVE", "POINTS", "PLAIN", "TOTAL", "HEADER", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderTotalType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderTotalType[] $VALUES;

    @SerializedName("negative")
    public static final OrderTotalType NEGATIVE = new OrderTotalType("NEGATIVE", 0);

    @SerializedName("points")
    public static final OrderTotalType POINTS = new OrderTotalType("POINTS", 1);

    @DefaultValue
    @SerializedName("plain")
    public static final OrderTotalType PLAIN = new OrderTotalType("PLAIN", 2);

    @SerializedName("total")
    public static final OrderTotalType TOTAL = new OrderTotalType("TOTAL", 3);

    @SerializedName("header")
    public static final OrderTotalType HEADER = new OrderTotalType("HEADER", 4);

    private static final /* synthetic */ OrderTotalType[] $values() {
        return new OrderTotalType[]{NEGATIVE, POINTS, PLAIN, TOTAL, HEADER};
    }

    static {
        OrderTotalType[] orderTotalTypeArr$values = $values();
        $VALUES = orderTotalTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(orderTotalTypeArr$values);
    }

    private OrderTotalType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<OrderTotalType> getEntries() {
        return $ENTRIES;
    }

    public static OrderTotalType valueOf(String str) {
        return (OrderTotalType) Enum.valueOf(OrderTotalType.class, str);
    }

    public static OrderTotalType[] values() {
        return (OrderTotalType[]) $VALUES.clone();
    }
}
