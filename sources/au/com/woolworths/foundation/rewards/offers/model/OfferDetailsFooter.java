package au.com.woolworths.foundation.rewards.offers.model;

import au.com.woolworths.android.onesite.data.ContentCta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsFooter;", "", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfferDetailsFooter {

    /* renamed from: a, reason: collision with root package name */
    public final String f8610a;
    public final ContentCta b;
    public final OfferDetailsStatusBadge c;

    public OfferDetailsFooter(String str, ContentCta contentCta, OfferDetailsStatusBadge offerDetailsStatusBadge) {
        this.f8610a = str;
        this.b = contentCta;
        this.c = offerDetailsStatusBadge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetailsFooter)) {
            return false;
        }
        OfferDetailsFooter offerDetailsFooter = (OfferDetailsFooter) obj;
        return Intrinsics.c(this.f8610a, offerDetailsFooter.f8610a) && Intrinsics.c(this.b, offerDetailsFooter.b) && Intrinsics.c(this.c, offerDetailsFooter.c);
    }

    public final int hashCode() {
        String str = this.f8610a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ContentCta contentCta = this.b;
        int iHashCode2 = (iHashCode + (contentCta == null ? 0 : contentCta.hashCode())) * 31;
        OfferDetailsStatusBadge offerDetailsStatusBadge = this.c;
        return iHashCode2 + (offerDetailsStatusBadge != null ? offerDetailsStatusBadge.hashCode() : 0);
    }

    public final String toString() {
        return "OfferDetailsFooter(label=" + this.f8610a + ", cta=" + this.b + ", statusBadge=" + this.c + ")";
    }
}
