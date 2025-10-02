package au.com.woolworths.feature.rewards.offers.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/OfferSectionLayout;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferSectionLayout {
    public static final OfferSectionLayout d;
    public static final OfferSectionLayout e;
    public static final OfferSectionLayout f;
    public static final /* synthetic */ OfferSectionLayout[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        OfferSectionLayout offerSectionLayout = new OfferSectionLayout("VerticalList", 0);
        d = offerSectionLayout;
        OfferSectionLayout offerSectionLayout2 = new OfferSectionLayout("Carousel", 1);
        e = offerSectionLayout2;
        OfferSectionLayout offerSectionLayout3 = new OfferSectionLayout("SingleRowCarousel", 2);
        f = offerSectionLayout3;
        OfferSectionLayout[] offerSectionLayoutArr = {offerSectionLayout, offerSectionLayout2, offerSectionLayout3};
        g = offerSectionLayoutArr;
        h = EnumEntriesKt.a(offerSectionLayoutArr);
    }

    public static OfferSectionLayout valueOf(String str) {
        return (OfferSectionLayout) Enum.valueOf(OfferSectionLayout.class, str);
    }

    public static OfferSectionLayout[] values() {
        return (OfferSectionLayout[]) g.clone();
    }
}
