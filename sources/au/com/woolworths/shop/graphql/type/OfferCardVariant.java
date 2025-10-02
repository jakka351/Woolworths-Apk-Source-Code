package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OfferCardVariant;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferCardVariant {
    public static final Companion e;
    public static final EnumType f;
    public static final OfferCardVariant g;
    public static final /* synthetic */ OfferCardVariant[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OfferCardVariant$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        OfferCardVariant offerCardVariant = new OfferCardVariant("SPECIALS", 0, "SPECIALS");
        OfferCardVariant offerCardVariant2 = new OfferCardVariant("GENERIC", 1, "GENERIC");
        OfferCardVariant offerCardVariant3 = new OfferCardVariant("EVERYDAYMARKET", 2, "EVERYDAYMARKET");
        OfferCardVariant offerCardVariant4 = new OfferCardVariant("LOWPRICE", 3, "LOWPRICE");
        OfferCardVariant offerCardVariant5 = new OfferCardVariant("CUSTOMCOLOR", 4, "CUSTOMCOLOR");
        OfferCardVariant offerCardVariant6 = new OfferCardVariant("IMAGEONLY", 5, "IMAGEONLY");
        OfferCardVariant offerCardVariant7 = new OfferCardVariant("UNKNOWN__", 6, "UNKNOWN__");
        g = offerCardVariant7;
        OfferCardVariant[] offerCardVariantArr = {offerCardVariant, offerCardVariant2, offerCardVariant3, offerCardVariant4, offerCardVariant5, offerCardVariant6, offerCardVariant7};
        h = offerCardVariantArr;
        i = EnumEntriesKt.a(offerCardVariantArr);
        e = new Companion();
        f = new EnumType("OfferCardVariant", CollectionsKt.R("SPECIALS", "GENERIC", "EVERYDAYMARKET", "LOWPRICE", "CUSTOMCOLOR", "IMAGEONLY"));
    }

    public OfferCardVariant(String str, int i2, String str2) {
        this.d = str2;
    }

    public static OfferCardVariant valueOf(String str) {
        return (OfferCardVariant) Enum.valueOf(OfferCardVariant.class, str);
    }

    public static OfferCardVariant[] values() {
        return (OfferCardVariant[]) h.clone();
    }
}
