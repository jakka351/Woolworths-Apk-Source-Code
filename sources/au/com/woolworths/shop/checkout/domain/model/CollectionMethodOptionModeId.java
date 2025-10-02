package au.com.woolworths.shop.checkout.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CollectionMethodOptionModeId;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CollectionMethodOptionModeId {
    public static final CollectionMethodOptionModeId e;
    public static final CollectionMethodOptionModeId f;
    public static final CollectionMethodOptionModeId g;
    public static final CollectionMethodOptionModeId h;
    public static final /* synthetic */ CollectionMethodOptionModeId[] i;
    public static final /* synthetic */ EnumEntries j;
    public final String d;

    static {
        CollectionMethodOptionModeId collectionMethodOptionModeId = new CollectionMethodOptionModeId("DELIVERY", 0, "Delivery");
        e = collectionMethodOptionModeId;
        CollectionMethodOptionModeId collectionMethodOptionModeId2 = new CollectionMethodOptionModeId("PICKUP", 1, "Pickup");
        f = collectionMethodOptionModeId2;
        CollectionMethodOptionModeId collectionMethodOptionModeId3 = new CollectionMethodOptionModeId("DELIVERY_NOW", 2, "DeliveryNow");
        g = collectionMethodOptionModeId3;
        CollectionMethodOptionModeId collectionMethodOptionModeId4 = new CollectionMethodOptionModeId("UNKNOWN", 3, "");
        h = collectionMethodOptionModeId4;
        CollectionMethodOptionModeId[] collectionMethodOptionModeIdArr = {collectionMethodOptionModeId, collectionMethodOptionModeId2, collectionMethodOptionModeId3, collectionMethodOptionModeId4};
        i = collectionMethodOptionModeIdArr;
        j = EnumEntriesKt.a(collectionMethodOptionModeIdArr);
    }

    public CollectionMethodOptionModeId(String str, int i2, String str2) {
        this.d = str2;
    }

    public static CollectionMethodOptionModeId valueOf(String str) {
        return (CollectionMethodOptionModeId) Enum.valueOf(CollectionMethodOptionModeId.class, str);
    }

    public static CollectionMethodOptionModeId[] values() {
        return (CollectionMethodOptionModeId[]) i.clone();
    }
}
