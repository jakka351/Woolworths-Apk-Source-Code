package au.com.woolworths.foundation.shop.storelocator.pickup.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/storelocator/pickup/models/PickUpOption;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PickUpOption {
    public static final PickUpOption d;
    public static final PickUpOption e;
    public static final PickUpOption f;
    public static final PickUpOption g;
    public static final /* synthetic */ PickUpOption[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        PickUpOption pickUpOption = new PickUpOption("DRIVE_THRU", 0);
        d = pickUpOption;
        PickUpOption pickUpOption2 = new PickUpOption("DTB_DRIVE_UP", 1);
        e = pickUpOption2;
        PickUpOption pickUpOption3 = new PickUpOption("IN_STORE", 2);
        f = pickUpOption3;
        PickUpOption pickUpOption4 = new PickUpOption("E_LOCKER", 3);
        g = pickUpOption4;
        PickUpOption[] pickUpOptionArr = {pickUpOption, pickUpOption2, pickUpOption3, pickUpOption4};
        h = pickUpOptionArr;
        i = EnumEntriesKt.a(pickUpOptionArr);
    }

    public static PickUpOption valueOf(String str) {
        return (PickUpOption) Enum.valueOf(PickUpOption.class, str);
    }

    public static PickUpOption[] values() {
        return (PickUpOption[]) h.clone();
    }
}
