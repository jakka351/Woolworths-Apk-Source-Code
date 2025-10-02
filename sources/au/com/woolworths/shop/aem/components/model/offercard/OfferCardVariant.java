package au.com.woolworths.shop.aem.components.model.offercard;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/offercard/OfferCardVariant;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferCardVariant {
    public static final OfferCardVariant d;
    public static final OfferCardVariant e;
    public static final OfferCardVariant f;
    public static final OfferCardVariant g;
    public static final OfferCardVariant h;
    public static final OfferCardVariant i;
    public static final /* synthetic */ OfferCardVariant[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        OfferCardVariant offerCardVariant = new OfferCardVariant("SPECIALS", 0);
        d = offerCardVariant;
        OfferCardVariant offerCardVariant2 = new OfferCardVariant("EVERYDAYMARKET", 1);
        e = offerCardVariant2;
        OfferCardVariant offerCardVariant3 = new OfferCardVariant("LOWPRICE", 2);
        f = offerCardVariant3;
        OfferCardVariant offerCardVariant4 = new OfferCardVariant("CUSTOMCOLOR", 3);
        g = offerCardVariant4;
        OfferCardVariant offerCardVariant5 = new OfferCardVariant("IMAGEONLY", 4);
        h = offerCardVariant5;
        OfferCardVariant offerCardVariant6 = new OfferCardVariant("GENERIC", 5);
        i = offerCardVariant6;
        OfferCardVariant[] offerCardVariantArr = {offerCardVariant, offerCardVariant2, offerCardVariant3, offerCardVariant4, offerCardVariant5, offerCardVariant6};
        j = offerCardVariantArr;
        k = EnumEntriesKt.a(offerCardVariantArr);
    }

    public static OfferCardVariant valueOf(String str) {
        return (OfferCardVariant) Enum.valueOf(OfferCardVariant.class, str);
    }

    public static OfferCardVariant[] values() {
        return (OfferCardVariant[]) j.clone();
    }
}
