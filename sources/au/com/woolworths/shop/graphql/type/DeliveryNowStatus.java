package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeliveryNowStatus;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryNowStatus {
    public static final Companion e;
    public static final EnumType f;
    public static final DeliveryNowStatus g;
    public static final /* synthetic */ DeliveryNowStatus[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeliveryNowStatus$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        DeliveryNowStatus deliveryNowStatus = new DeliveryNowStatus("Open", 0, "Open");
        DeliveryNowStatus deliveryNowStatus2 = new DeliveryNowStatus("Closed", 1, "Closed");
        DeliveryNowStatus deliveryNowStatus3 = new DeliveryNowStatus("Exhausted", 2, "Exhausted");
        DeliveryNowStatus deliveryNowStatus4 = new DeliveryNowStatus("Error", 3, "Error");
        DeliveryNowStatus deliveryNowStatus5 = new DeliveryNowStatus("Ineligible", 4, "Ineligible");
        DeliveryNowStatus deliveryNowStatus6 = new DeliveryNowStatus("UNKNOWN__", 5, "UNKNOWN__");
        g = deliveryNowStatus6;
        DeliveryNowStatus[] deliveryNowStatusArr = {deliveryNowStatus, deliveryNowStatus2, deliveryNowStatus3, deliveryNowStatus4, deliveryNowStatus5, deliveryNowStatus6};
        h = deliveryNowStatusArr;
        i = EnumEntriesKt.a(deliveryNowStatusArr);
        e = new Companion();
        f = new EnumType("DeliveryNowStatus", CollectionsKt.R("Open", "Closed", "Exhausted", "Error", "Ineligible"));
    }

    public DeliveryNowStatus(String str, int i2, String str2) {
        this.d = str2;
    }

    public static DeliveryNowStatus valueOf(String str) {
        return (DeliveryNowStatus) Enum.valueOf(DeliveryNowStatus.class, str);
    }

    public static DeliveryNowStatus[] values() {
        return (DeliveryNowStatus[]) h.clone();
    }
}
