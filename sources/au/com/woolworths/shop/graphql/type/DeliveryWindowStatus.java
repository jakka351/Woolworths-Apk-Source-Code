package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeliveryWindowStatus;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryWindowStatus {
    public static final Companion e;
    public static final EnumType f;
    public static final DeliveryWindowStatus g;
    public static final /* synthetic */ DeliveryWindowStatus[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeliveryWindowStatus$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        DeliveryWindowStatus deliveryWindowStatus = new DeliveryWindowStatus("Closed", 0, "Closed");
        DeliveryWindowStatus deliveryWindowStatus2 = new DeliveryWindowStatus("NotStarted", 1, "NotStarted");
        DeliveryWindowStatus deliveryWindowStatus3 = new DeliveryWindowStatus("Available", 2, "Available");
        DeliveryWindowStatus deliveryWindowStatus4 = new DeliveryWindowStatus("ClosingSoon", 3, "ClosingSoon");
        DeliveryWindowStatus deliveryWindowStatus5 = new DeliveryWindowStatus("Full", 4, "Full");
        DeliveryWindowStatus deliveryWindowStatus6 = new DeliveryWindowStatus("Exhausted", 5, "Exhausted");
        DeliveryWindowStatus deliveryWindowStatus7 = new DeliveryWindowStatus("Error", 6, "Error");
        DeliveryWindowStatus deliveryWindowStatus8 = new DeliveryWindowStatus("Ineligible", 7, "Ineligible");
        DeliveryWindowStatus deliveryWindowStatus9 = new DeliveryWindowStatus("UNKNOWN__", 8, "UNKNOWN__");
        g = deliveryWindowStatus9;
        DeliveryWindowStatus[] deliveryWindowStatusArr = {deliveryWindowStatus, deliveryWindowStatus2, deliveryWindowStatus3, deliveryWindowStatus4, deliveryWindowStatus5, deliveryWindowStatus6, deliveryWindowStatus7, deliveryWindowStatus8, deliveryWindowStatus9};
        h = deliveryWindowStatusArr;
        i = EnumEntriesKt.a(deliveryWindowStatusArr);
        e = new Companion();
        f = new EnumType("DeliveryWindowStatus", CollectionsKt.R("Closed", "NotStarted", "Available", "ClosingSoon", "Full", "Exhausted", "Error", "Ineligible"));
    }

    public DeliveryWindowStatus(String str, int i2, String str2) {
        this.d = str2;
    }

    public static DeliveryWindowStatus valueOf(String str) {
        return (DeliveryWindowStatus) Enum.valueOf(DeliveryWindowStatus.class, str);
    }

    public static DeliveryWindowStatus[] values() {
        return (DeliveryWindowStatus[]) h.clone();
    }
}
