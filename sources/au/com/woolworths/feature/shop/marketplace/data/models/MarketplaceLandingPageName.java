package au.com.woolworths.feature.shop.marketplace.data.models;

import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceLandingPageName;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "PERSONALISED", "CATEGORIES", "BRANDS", "SELLERS", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MarketplaceLandingPageName {

    @SerializedName("brands")
    @MappedName
    public static final MarketplaceLandingPageName BRANDS;

    @SerializedName("categories")
    @MappedName
    public static final MarketplaceLandingPageName CATEGORIES;

    @SerializedName("default")
    @MappedName
    public static final MarketplaceLandingPageName DEFAULT;

    @SerializedName("personalised")
    @MappedName
    public static final MarketplaceLandingPageName PERSONALISED;

    @SerializedName("sellers")
    @MappedName
    public static final MarketplaceLandingPageName SELLERS;
    public static final MarketplaceLandingPageName d;
    public static final /* synthetic */ MarketplaceLandingPageName[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        MarketplaceLandingPageName marketplaceLandingPageName = new MarketplaceLandingPageName("DEFAULT", 0);
        DEFAULT = marketplaceLandingPageName;
        MarketplaceLandingPageName marketplaceLandingPageName2 = new MarketplaceLandingPageName("PERSONALISED", 1);
        PERSONALISED = marketplaceLandingPageName2;
        MarketplaceLandingPageName marketplaceLandingPageName3 = new MarketplaceLandingPageName("CATEGORIES", 2);
        CATEGORIES = marketplaceLandingPageName3;
        MarketplaceLandingPageName marketplaceLandingPageName4 = new MarketplaceLandingPageName("BRANDS", 3);
        BRANDS = marketplaceLandingPageName4;
        MarketplaceLandingPageName marketplaceLandingPageName5 = new MarketplaceLandingPageName("SELLERS", 4);
        SELLERS = marketplaceLandingPageName5;
        MarketplaceLandingPageName marketplaceLandingPageName6 = new MarketplaceLandingPageName("UNKNOWN", 5);
        d = marketplaceLandingPageName6;
        MarketplaceLandingPageName[] marketplaceLandingPageNameArr = {marketplaceLandingPageName, marketplaceLandingPageName2, marketplaceLandingPageName3, marketplaceLandingPageName4, marketplaceLandingPageName5, marketplaceLandingPageName6};
        e = marketplaceLandingPageNameArr;
        f = EnumEntriesKt.a(marketplaceLandingPageNameArr);
    }

    private MarketplaceLandingPageName(String str, int i) {
    }

    public static MarketplaceLandingPageName valueOf(String str) {
        return (MarketplaceLandingPageName) Enum.valueOf(MarketplaceLandingPageName.class, str);
    }

    public static MarketplaceLandingPageName[] values() {
        return (MarketplaceLandingPageName[]) e.clone();
    }
}
