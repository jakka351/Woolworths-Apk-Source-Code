package au.com.woolworths.feature.shop.myorders.details.infomodal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/infomodal/DeliveryMethodStyle;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeliveryMethodStyle {
    public static final DeliveryMethodStyle d;
    public static final DeliveryMethodStyle e;
    public static final DeliveryMethodStyle f;
    public static final /* synthetic */ DeliveryMethodStyle[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        DeliveryMethodStyle deliveryMethodStyle = new DeliveryMethodStyle("TABS", 0);
        d = deliveryMethodStyle;
        DeliveryMethodStyle deliveryMethodStyle2 = new DeliveryMethodStyle("SINGLE_PAGE", 1);
        e = deliveryMethodStyle2;
        DeliveryMethodStyle deliveryMethodStyle3 = new DeliveryMethodStyle("NONE", 2);
        f = deliveryMethodStyle3;
        DeliveryMethodStyle[] deliveryMethodStyleArr = {deliveryMethodStyle, deliveryMethodStyle2, deliveryMethodStyle3};
        g = deliveryMethodStyleArr;
        h = EnumEntriesKt.a(deliveryMethodStyleArr);
    }

    public static DeliveryMethodStyle valueOf(String str) {
        return (DeliveryMethodStyle) Enum.valueOf(DeliveryMethodStyle.class, str);
    }

    public static DeliveryMethodStyle[] values() {
        return (DeliveryMethodStyle[]) g.clone();
    }
}
