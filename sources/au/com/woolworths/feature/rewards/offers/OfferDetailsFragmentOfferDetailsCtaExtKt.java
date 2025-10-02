package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsCta;
import com.woolworths.rewards.offers.fragment.fragment.OfferDetailsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferDetailsFragmentOfferDetailsCtaExtKt {
    public static final OfferDetailsCta a(OfferDetailsFragment.OfferDetailsCta offerDetailsCta) {
        Intrinsics.h(offerDetailsCta, "<this>");
        OfferDetailsFragment.Cta cta = offerDetailsCta.f20984a;
        Intrinsics.h(cta, "<this>");
        return new OfferDetailsCta(new ContentCta(cta.f20980a, cta.b, (String) null, cta.c, (AnalyticsData) null, 20, (DefaultConstructorMarker) null), offerDetailsCta.b);
    }
}
