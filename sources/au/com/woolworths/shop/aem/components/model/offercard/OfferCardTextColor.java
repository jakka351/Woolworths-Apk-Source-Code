package au.com.woolworths.shop.aem.components.model.offercard;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/offercard/OfferCardTextColor;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferCardTextColor {
    public static final OfferCardTextColor d;
    public static final OfferCardTextColor e;
    public static final /* synthetic */ OfferCardTextColor[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        OfferCardTextColor offerCardTextColor = new OfferCardTextColor("LIGHT", 0);
        d = offerCardTextColor;
        OfferCardTextColor offerCardTextColor2 = new OfferCardTextColor("DARK", 1);
        e = offerCardTextColor2;
        OfferCardTextColor[] offerCardTextColorArr = {offerCardTextColor, offerCardTextColor2};
        f = offerCardTextColorArr;
        g = EnumEntriesKt.a(offerCardTextColorArr);
    }

    public static OfferCardTextColor valueOf(String str) {
        return (OfferCardTextColor) Enum.valueOf(OfferCardTextColor.class, str);
    }

    public static OfferCardTextColor[] values() {
        return (OfferCardTextColor[]) f.clone();
    }
}
