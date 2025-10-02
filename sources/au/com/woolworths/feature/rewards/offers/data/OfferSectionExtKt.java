package au.com.woolworths.feature.rewards.offers.data;

import YU.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferSectionExtKt {
    public static final List a(OffersSections offersSections) {
        Intrinsics.h(offersSections, "<this>");
        boolean z = offersSections instanceof StandardBannerWrapper;
        EmptyList emptyList = EmptyList.d;
        if (z || (offersSections instanceof SpinSurpriseBanner) || (offersSections instanceof RewardsCtaCard) || (offersSections instanceof PersonalisedOffersBanner)) {
            return emptyList;
        }
        if (offersSections instanceof StandardOffersSection) {
            return ((StandardOffersSection) offersSections).c;
        }
        if (offersSections instanceof ProductOffersSection) {
            return ((ProductOffersSection) offersSections).f;
        }
        if ((offersSections instanceof OfferFeedInlineBanner) || (offersSections instanceof MandyBanner) || (offersSections instanceof NoOffersCard)) {
            return emptyList;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List b(List list) {
        Intrinsics.h(list, "<this>");
        Iterator it = list.iterator();
        List listC0 = EmptyList.d;
        while (it.hasNext()) {
            listC0 = CollectionsKt.c0(a((OffersSections) it.next()), listC0);
        }
        return listC0;
    }

    public static final String c(OffersSections offersSections) {
        Intrinsics.h(offersSections, "<this>");
        if (offersSections instanceof StandardBannerWrapper) {
            return ((StandardBannerWrapper) offersSections).f6298a.d;
        }
        if (offersSections instanceof SpinSurpriseBanner) {
            return ((SpinSurpriseBanner) offersSections).f6297a;
        }
        if (offersSections instanceof RewardsCtaCard) {
            return ((RewardsCtaCard) offersSections).f6281a;
        }
        if (offersSections instanceof PersonalisedOffersBanner) {
            return ((PersonalisedOffersBanner) offersSections).f6279a;
        }
        if (offersSections instanceof ProductOffersSection) {
            return ((ProductOffersSection) offersSections).f6280a;
        }
        if (offersSections instanceof StandardOffersSection) {
            return ((StandardOffersSection) offersSections).f6299a;
        }
        if (offersSections instanceof OfferFeedInlineBanner) {
            return ((OfferFeedInlineBanner) offersSections).f6276a;
        }
        if (offersSections instanceof MandyBanner) {
            return ((MandyBanner) offersSections).f6272a;
        }
        if (offersSections instanceof NoOffersCard) {
            return a.d(((NoOffersCard) offersSections).hashCode(), "noOffersCard");
        }
        throw new NoWhenBranchMatchedException();
    }
}
