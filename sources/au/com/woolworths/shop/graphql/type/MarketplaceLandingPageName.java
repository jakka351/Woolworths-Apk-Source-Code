package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/MarketplaceLandingPageName;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MarketplaceLandingPageName {
    public static final Companion e;
    public static final EnumType f;
    public static final MarketplaceLandingPageName g;
    public static final MarketplaceLandingPageName h;
    public static final MarketplaceLandingPageName i;
    public static final MarketplaceLandingPageName j;
    public static final MarketplaceLandingPageName k;
    public static final MarketplaceLandingPageName l;
    public static final /* synthetic */ MarketplaceLandingPageName[] m;
    public static final /* synthetic */ EnumEntries n;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/MarketplaceLandingPageName$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        MarketplaceLandingPageName marketplaceLandingPageName = new MarketplaceLandingPageName("default", 0, "default");
        g = marketplaceLandingPageName;
        MarketplaceLandingPageName marketplaceLandingPageName2 = new MarketplaceLandingPageName("personalised", 1, "personalised");
        h = marketplaceLandingPageName2;
        MarketplaceLandingPageName marketplaceLandingPageName3 = new MarketplaceLandingPageName("categories", 2, "categories");
        i = marketplaceLandingPageName3;
        MarketplaceLandingPageName marketplaceLandingPageName4 = new MarketplaceLandingPageName("brands", 3, "brands");
        j = marketplaceLandingPageName4;
        MarketplaceLandingPageName marketplaceLandingPageName5 = new MarketplaceLandingPageName("sellers", 4, "sellers");
        k = marketplaceLandingPageName5;
        MarketplaceLandingPageName marketplaceLandingPageName6 = new MarketplaceLandingPageName("UNKNOWN__", 5, "UNKNOWN__");
        l = marketplaceLandingPageName6;
        MarketplaceLandingPageName[] marketplaceLandingPageNameArr = {marketplaceLandingPageName, marketplaceLandingPageName2, marketplaceLandingPageName3, marketplaceLandingPageName4, marketplaceLandingPageName5, marketplaceLandingPageName6};
        m = marketplaceLandingPageNameArr;
        n = EnumEntriesKt.a(marketplaceLandingPageNameArr);
        e = new Companion();
        f = new EnumType("MarketplaceLandingPageName", CollectionsKt.R("default", "personalised", "categories", "brands", "sellers"));
    }

    public MarketplaceLandingPageName(String str, int i2, String str2) {
        this.d = str2;
    }

    public static MarketplaceLandingPageName valueOf(String str) {
        return (MarketplaceLandingPageName) Enum.valueOf(MarketplaceLandingPageName.class, str);
    }

    public static MarketplaceLandingPageName[] values() {
        return (MarketplaceLandingPageName[]) m.clone();
    }
}
