package au.com.woolworths.shop.checkout.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/DeliveryNowStatus;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryNowStatus {
    public static final DeliveryNowStatus d;
    public static final DeliveryNowStatus e;
    public static final DeliveryNowStatus f;
    public static final DeliveryNowStatus g;
    public static final DeliveryNowStatus h;
    public static final DeliveryNowStatus i;
    public static final /* synthetic */ DeliveryNowStatus[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        DeliveryNowStatus deliveryNowStatus = new DeliveryNowStatus("Open", 0);
        d = deliveryNowStatus;
        DeliveryNowStatus deliveryNowStatus2 = new DeliveryNowStatus("Closed", 1);
        e = deliveryNowStatus2;
        DeliveryNowStatus deliveryNowStatus3 = new DeliveryNowStatus("Exhausted", 2);
        f = deliveryNowStatus3;
        DeliveryNowStatus deliveryNowStatus4 = new DeliveryNowStatus("Error", 3);
        g = deliveryNowStatus4;
        DeliveryNowStatus deliveryNowStatus5 = new DeliveryNowStatus("Ineligible", 4);
        h = deliveryNowStatus5;
        DeliveryNowStatus deliveryNowStatus6 = new DeliveryNowStatus("UNKNOWN", 5);
        i = deliveryNowStatus6;
        DeliveryNowStatus[] deliveryNowStatusArr = {deliveryNowStatus, deliveryNowStatus2, deliveryNowStatus3, deliveryNowStatus4, deliveryNowStatus5, deliveryNowStatus6};
        j = deliveryNowStatusArr;
        k = EnumEntriesKt.a(deliveryNowStatusArr);
    }

    public static DeliveryNowStatus valueOf(String str) {
        return (DeliveryNowStatus) Enum.valueOf(DeliveryNowStatus.class, str);
    }

    public static DeliveryNowStatus[] values() {
        return (DeliveryNowStatus[]) j.clone();
    }
}
