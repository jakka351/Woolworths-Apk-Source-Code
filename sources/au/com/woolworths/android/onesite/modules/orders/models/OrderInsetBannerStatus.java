package au.com.woolworths.android.onesite.modules.orders.models;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/modules/orders/models/OrderInsetBannerStatus;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "INFORMATION", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderInsetBannerStatus {

    @SerializedName("INFO")
    public static final OrderInsetBannerStatus INFORMATION;

    @SerializedName("WARNING")
    public static final OrderInsetBannerStatus WARNING;
    public static final /* synthetic */ OrderInsetBannerStatus[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        OrderInsetBannerStatus orderInsetBannerStatus = new OrderInsetBannerStatus("WARNING", 0);
        WARNING = orderInsetBannerStatus;
        OrderInsetBannerStatus orderInsetBannerStatus2 = new OrderInsetBannerStatus("INFORMATION", 1);
        INFORMATION = orderInsetBannerStatus2;
        OrderInsetBannerStatus[] orderInsetBannerStatusArr = {orderInsetBannerStatus, orderInsetBannerStatus2};
        d = orderInsetBannerStatusArr;
        e = EnumEntriesKt.a(orderInsetBannerStatusArr);
    }

    private OrderInsetBannerStatus(String str, int i) {
    }

    public static OrderInsetBannerStatus valueOf(String str) {
        return (OrderInsetBannerStatus) Enum.valueOf(OrderInsetBannerStatus.class, str);
    }

    public static OrderInsetBannerStatus[] values() {
        return (OrderInsetBannerStatus[]) d.clone();
    }
}
