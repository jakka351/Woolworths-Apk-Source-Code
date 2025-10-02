package au.com.woolworths.base.shopapp.modules.collectionmode.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/data/DeliveryWindowStatusData;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeliveryWindowStatusData {
    public static final /* synthetic */ DeliveryWindowStatusData[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        DeliveryWindowStatusData[] deliveryWindowStatusDataArr = {new DeliveryWindowStatusData("CLOSED", 0), new DeliveryWindowStatusData("NOT_STARTED", 1), new DeliveryWindowStatusData("AVAILABLE", 2), new DeliveryWindowStatusData("CLOSING_SOON", 3), new DeliveryWindowStatusData("EXHAUSTED", 4), new DeliveryWindowStatusData("INELIGIBLE", 5), new DeliveryWindowStatusData("FULL", 6), new DeliveryWindowStatusData("ERROR", 7), new DeliveryWindowStatusData("UNKNOWN", 8)};
        d = deliveryWindowStatusDataArr;
        e = EnumEntriesKt.a(deliveryWindowStatusDataArr);
    }

    public static DeliveryWindowStatusData valueOf(String str) {
        return (DeliveryWindowStatusData) Enum.valueOf(DeliveryWindowStatusData.class, str);
    }

    public static DeliveryWindowStatusData[] values() {
        return (DeliveryWindowStatusData[]) d.clone();
    }
}
