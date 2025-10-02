package au.com.woolworths.feature.shop.myorders.details.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/CancelOrderReason;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CancelOrderReason {
    public static final CancelOrderReason d;
    public static final CancelOrderReason e;
    public static final /* synthetic */ CancelOrderReason[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        CancelOrderReason cancelOrderReason = new CancelOrderReason("WINDOW_CLOSED", 0);
        d = cancelOrderReason;
        CancelOrderReason cancelOrderReason2 = new CancelOrderReason("UNKNOWN", 1);
        e = cancelOrderReason2;
        CancelOrderReason[] cancelOrderReasonArr = {cancelOrderReason, cancelOrderReason2};
        f = cancelOrderReasonArr;
        g = EnumEntriesKt.a(cancelOrderReasonArr);
    }

    public static CancelOrderReason valueOf(String str) {
        return (CancelOrderReason) Enum.valueOf(CancelOrderReason.class, str);
    }

    public static CancelOrderReason[] values() {
        return (CancelOrderReason[]) f.clone();
    }
}
