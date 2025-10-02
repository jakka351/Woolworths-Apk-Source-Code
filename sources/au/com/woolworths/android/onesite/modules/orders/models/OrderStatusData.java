package au.com.woolworths.android.onesite.modules.orders.models;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/modules/orders/models/OrderStatusData;", "", "<init>", "(Ljava/lang/String;I)V", "READY", "PENDING", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderStatusData {

    @DefaultValue
    @SerializedName("PENDING")
    public static final OrderStatusData PENDING;

    @SerializedName("READY")
    public static final OrderStatusData READY;
    public static final /* synthetic */ OrderStatusData[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        OrderStatusData orderStatusData = new OrderStatusData("READY", 0);
        READY = orderStatusData;
        OrderStatusData orderStatusData2 = new OrderStatusData("PENDING", 1);
        PENDING = orderStatusData2;
        OrderStatusData[] orderStatusDataArr = {orderStatusData, orderStatusData2};
        d = orderStatusDataArr;
        e = EnumEntriesKt.a(orderStatusDataArr);
    }

    private OrderStatusData(String str, int i) {
    }

    public static OrderStatusData valueOf(String str) {
        return (OrderStatusData) Enum.valueOf(OrderStatusData.class, str);
    }

    public static OrderStatusData[] values() {
        return (OrderStatusData[]) d.clone();
    }
}
