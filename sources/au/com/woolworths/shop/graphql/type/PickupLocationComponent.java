package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/PickupLocationComponent;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PickupLocationComponent {
    public static final Companion e;
    public static final PickupLocationComponent f;
    public static final PickupLocationComponent g;
    public static final PickupLocationComponent h;
    public static final /* synthetic */ PickupLocationComponent[] i;
    public static final /* synthetic */ EnumEntries j;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/PickupLocationComponent$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        PickupLocationComponent pickupLocationComponent = new PickupLocationComponent("LOCATION_TRACKING_STARTED", 0, "LOCATION_TRACKING_STARTED");
        f = pickupLocationComponent;
        PickupLocationComponent pickupLocationComponent2 = new PickupLocationComponent("LOCATION_TRACKING_STOPPED", 1, "LOCATION_TRACKING_STOPPED");
        g = pickupLocationComponent2;
        PickupLocationComponent pickupLocationComponent3 = new PickupLocationComponent("UNKNOWN__", 2, "UNKNOWN__");
        h = pickupLocationComponent3;
        PickupLocationComponent[] pickupLocationComponentArr = {pickupLocationComponent, pickupLocationComponent2, pickupLocationComponent3};
        i = pickupLocationComponentArr;
        j = EnumEntriesKt.a(pickupLocationComponentArr);
        e = new Companion();
        CollectionsKt.R("LOCATION_TRACKING_STARTED", "LOCATION_TRACKING_STOPPED");
    }

    public PickupLocationComponent(String str, int i2, String str2) {
        this.d = str2;
    }

    public static PickupLocationComponent valueOf(String str) {
        return (PickupLocationComponent) Enum.valueOf(PickupLocationComponent.class, str);
    }

    public static PickupLocationComponent[] values() {
        return (PickupLocationComponent[]) i.clone();
    }
}
