package au.com.woolworths.shop.pickup.order.data;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/pickup/order/data/PickUpMode;", "", "Companion", "shop-pickup-order-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PickUpMode {
    public static final /* synthetic */ PickUpMode[] e;
    public static final /* synthetic */ EnumEntries f;
    public final String d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/pickup/order/data/PickUpMode$Companion;", "", "", "", "Lau/com/woolworths/shop/pickup/order/data/PickUpMode;", "valueMap", "Ljava/util/Map;", "shop-pickup-order-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        PickUpMode[] pickUpModeArr = {new PickUpMode("DRIVE_UP", 0, com.woolworths.R.string.pickup_collection_bay, "DU"), new PickUpMode("DRIVE_THRU", 1, com.woolworths.R.string.pickup_collection_bay, "DT"), new PickUpMode("IN_STORE", 2, com.woolworths.R.string.pickup_service_desk, "CC")};
        e = pickUpModeArr;
        EnumEntries enumEntriesA = EnumEntriesKt.a(pickUpModeArr);
        f = enumEntriesA;
        int iH = MapsKt.h(CollectionsKt.s(enumEntriesA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        Iterator it = ((AbstractList) enumEntriesA).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((PickUpMode) next).d, next);
        }
    }

    public PickUpMode(String str, int i, int i2, String str2) {
        this.d = str2;
    }

    public static PickUpMode valueOf(String str) {
        return (PickUpMode) Enum.valueOf(PickUpMode.class, str);
    }

    public static PickUpMode[] values() {
        return (PickUpMode[]) e.clone();
    }
}
