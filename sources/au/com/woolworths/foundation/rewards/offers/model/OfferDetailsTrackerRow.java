package au.com.woolworths.foundation.rewards.offers.model;

import au.com.woolworths.rewards.base.data.IconAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsTrackerRow;", "", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfferDetailsTrackerRow {

    /* renamed from: a, reason: collision with root package name */
    public final IconAsset f8614a;
    public final String b;
    public final OfferDetailsTrackerTrailingElement c;

    public OfferDetailsTrackerRow(IconAsset iconAsset, String str, OfferDetailsTrackerTrailingElement offerDetailsTrackerTrailingElement) {
        this.f8614a = iconAsset;
        this.b = str;
        this.c = offerDetailsTrackerTrailingElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetailsTrackerRow)) {
            return false;
        }
        OfferDetailsTrackerRow offerDetailsTrackerRow = (OfferDetailsTrackerRow) obj;
        return Intrinsics.c(this.f8614a, offerDetailsTrackerRow.f8614a) && Intrinsics.c(this.b, offerDetailsTrackerRow.b) && Intrinsics.c(this.c, offerDetailsTrackerRow.c);
    }

    public final int hashCode() {
        IconAsset iconAsset = this.f8614a;
        int iHashCode = (iconAsset == null ? 0 : iconAsset.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        OfferDetailsTrackerTrailingElement offerDetailsTrackerTrailingElement = this.c;
        return iHashCode2 + (offerDetailsTrackerTrailingElement != null ? offerDetailsTrackerTrailingElement.hashCode() : 0);
    }

    public final String toString() {
        return "OfferDetailsTrackerRow(rowLeadingAsset=" + this.f8614a + ", rowLabel=" + this.b + ", rowTrailingElement=" + this.c + ")";
    }
}
