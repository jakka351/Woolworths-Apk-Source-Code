package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OfferCardTextColor;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferCardTextColor {
    public static final Companion e;
    public static final EnumType f;
    public static final OfferCardTextColor g;
    public static final /* synthetic */ OfferCardTextColor[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OfferCardTextColor$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        OfferCardTextColor offerCardTextColor = new OfferCardTextColor("LIGHT", 0, "LIGHT");
        OfferCardTextColor offerCardTextColor2 = new OfferCardTextColor("DARK", 1, "DARK");
        OfferCardTextColor offerCardTextColor3 = new OfferCardTextColor("UNKNOWN__", 2, "UNKNOWN__");
        g = offerCardTextColor3;
        OfferCardTextColor[] offerCardTextColorArr = {offerCardTextColor, offerCardTextColor2, offerCardTextColor3};
        h = offerCardTextColorArr;
        i = EnumEntriesKt.a(offerCardTextColorArr);
        e = new Companion();
        f = new EnumType("OfferCardTextColor", CollectionsKt.R("LIGHT", "DARK"));
    }

    public OfferCardTextColor(String str, int i2, String str2) {
        this.d = str2;
    }

    public static OfferCardTextColor valueOf(String str) {
        return (OfferCardTextColor) Enum.valueOf(OfferCardTextColor.class, str);
    }

    public static OfferCardTextColor[] values() {
        return (OfferCardTextColor[]) h.clone();
    }
}
