package au.com.woolworths.feature.shop.myorders.details.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/PickupOrderStatus;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickupOrderStatus {
    public static final PickupOrderStatus d;
    public static final PickupOrderStatus e;
    public static final /* synthetic */ PickupOrderStatus[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        PickupOrderStatus pickupOrderStatus = new PickupOrderStatus("COLLECTED", 0);
        d = pickupOrderStatus;
        PickupOrderStatus pickupOrderStatus2 = new PickupOrderStatus("UNKNOWN", 1);
        e = pickupOrderStatus2;
        PickupOrderStatus[] pickupOrderStatusArr = {pickupOrderStatus, pickupOrderStatus2};
        f = pickupOrderStatusArr;
        g = EnumEntriesKt.a(pickupOrderStatusArr);
    }

    public static PickupOrderStatus valueOf(String str) {
        return (PickupOrderStatus) Enum.valueOf(PickupOrderStatus.class, str);
    }

    public static PickupOrderStatus[] values() {
        return (PickupOrderStatus[]) f.clone();
    }
}
