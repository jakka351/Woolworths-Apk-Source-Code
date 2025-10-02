package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeliveryNowTitle;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryNowTitle {
    public static final Companion e;
    public static final DeliveryNowTitle f;
    public static final /* synthetic */ DeliveryNowTitle[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeliveryNowTitle$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        DeliveryNowTitle deliveryNowTitle = new DeliveryNowTitle("Delivery", 0, "Delivery");
        DeliveryNowTitle deliveryNowTitle2 = new DeliveryNowTitle("Now", 1, "Now");
        DeliveryNowTitle deliveryNowTitle3 = new DeliveryNowTitle("UNKNOWN__", 2, "UNKNOWN__");
        f = deliveryNowTitle3;
        DeliveryNowTitle[] deliveryNowTitleArr = {deliveryNowTitle, deliveryNowTitle2, deliveryNowTitle3};
        g = deliveryNowTitleArr;
        h = EnumEntriesKt.a(deliveryNowTitleArr);
        e = new Companion();
        CollectionsKt.R("Delivery", "Now");
    }

    public DeliveryNowTitle(String str, int i, String str2) {
        this.d = str2;
    }

    public static DeliveryNowTitle valueOf(String str) {
        return (DeliveryNowTitle) Enum.valueOf(DeliveryNowTitle.class, str);
    }

    public static DeliveryNowTitle[] values() {
        return (DeliveryNowTitle[]) g.clone();
    }
}
