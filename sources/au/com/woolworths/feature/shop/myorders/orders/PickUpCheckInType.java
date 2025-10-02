package au.com.woolworths.feature.shop.myorders.orders;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/PickUpCheckInType;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickUpCheckInType {
    public static final PickUpCheckInType d;
    public static final PickUpCheckInType e;
    public static final /* synthetic */ PickUpCheckInType[] f;
    public static final /* synthetic */ EnumEntries g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PickUpCheckInType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PickUpCheckInType pickUpCheckInType = PickUpCheckInType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        PickUpCheckInType pickUpCheckInType = new PickUpCheckInType("CHECK_IN_15_MINS", 0);
        d = pickUpCheckInType;
        PickUpCheckInType pickUpCheckInType2 = new PickUpCheckInType("CHECK_IN_NOW", 1);
        e = pickUpCheckInType2;
        PickUpCheckInType[] pickUpCheckInTypeArr = {pickUpCheckInType, pickUpCheckInType2};
        f = pickUpCheckInTypeArr;
        g = EnumEntriesKt.a(pickUpCheckInTypeArr);
    }

    public static PickUpCheckInType valueOf(String str) {
        return (PickUpCheckInType) Enum.valueOf(PickUpCheckInType.class, str);
    }

    public static PickUpCheckInType[] values() {
        return (PickUpCheckInType[]) f.clone();
    }
}
