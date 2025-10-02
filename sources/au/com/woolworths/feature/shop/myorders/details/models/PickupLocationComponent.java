package au.com.woolworths.feature.shop.myorders.details.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/PickupLocationComponent;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickupLocationComponent {
    public static final PickupLocationComponent d;
    public static final PickupLocationComponent e;
    public static final /* synthetic */ PickupLocationComponent[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        PickupLocationComponent pickupLocationComponent = new PickupLocationComponent("LOCATION_TRACKING_STARTED", 0);
        d = pickupLocationComponent;
        PickupLocationComponent pickupLocationComponent2 = new PickupLocationComponent("LOCATION_TRACKING_STOPPED", 1);
        e = pickupLocationComponent2;
        PickupLocationComponent[] pickupLocationComponentArr = {pickupLocationComponent, pickupLocationComponent2};
        f = pickupLocationComponentArr;
        g = EnumEntriesKt.a(pickupLocationComponentArr);
    }

    public static PickupLocationComponent valueOf(String str) {
        return (PickupLocationComponent) Enum.valueOf(PickupLocationComponent.class, str);
    }

    public static PickupLocationComponent[] values() {
        return (PickupLocationComponent[]) f.clone();
    }
}
