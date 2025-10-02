package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CardSize;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardSize {
    public static final Companion e;
    public static final CardSize f;
    public static final /* synthetic */ CardSize[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CardSize$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CardSize cardSize = new CardSize("SMALL", 0, "SMALL");
        CardSize cardSize2 = new CardSize("MEDIUM", 1, "MEDIUM");
        CardSize cardSize3 = new CardSize("LARGE", 2, "LARGE");
        CardSize cardSize4 = new CardSize("COMPACT", 3, "COMPACT");
        CardSize cardSize5 = new CardSize("REGULAR", 4, "REGULAR");
        CardSize cardSize6 = new CardSize("UNKNOWN__", 5, "UNKNOWN__");
        f = cardSize6;
        CardSize[] cardSizeArr = {cardSize, cardSize2, cardSize3, cardSize4, cardSize5, cardSize6};
        g = cardSizeArr;
        h = EnumEntriesKt.a(cardSizeArr);
        e = new Companion();
        CollectionsKt.R("SMALL", "MEDIUM", "LARGE", "COMPACT", "REGULAR");
    }

    public CardSize(String str, int i, String str2) {
        this.d = str2;
    }

    public static CardSize valueOf(String str) {
        return (CardSize) Enum.valueOf(CardSize.class, str);
    }

    public static CardSize[] values() {
        return (CardSize[]) g.clone();
    }
}
