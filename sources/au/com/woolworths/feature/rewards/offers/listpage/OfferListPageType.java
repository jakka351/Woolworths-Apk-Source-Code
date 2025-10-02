package au.com.woolworths.feature.rewards.offers.listpage;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/listpage/OfferListPageType;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferListPageType {
    public static final OfferListPageType e;
    public static final /* synthetic */ OfferListPageType[] f;
    public static final /* synthetic */ EnumEntries g;
    public final String d;

    static {
        OfferListPageType offerListPageType = new OfferListPageType("Unknown", 0, "");
        e = offerListPageType;
        OfferListPageType[] offerListPageTypeArr = {offerListPageType, new OfferListPageType("EndedOffers", 1, "ended_offers"), new OfferListPageType("WeeklyBoosters", 2, "product_offers"), new OfferListPageType("TigerNew", 3, "new_to_woolworths")};
        f = offerListPageTypeArr;
        g = EnumEntriesKt.a(offerListPageTypeArr);
    }

    public OfferListPageType(String str, int i, String str2) {
        this.d = str2;
    }

    public static OfferListPageType valueOf(String str) {
        return (OfferListPageType) Enum.valueOf(OfferListPageType.class, str);
    }

    public static OfferListPageType[] values() {
        return (OfferListPageType[]) f.clone();
    }
}
