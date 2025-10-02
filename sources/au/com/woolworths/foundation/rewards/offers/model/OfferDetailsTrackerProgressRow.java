package au.com.woolworths.foundation.rewards.offers.model;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsTrackerProgressRow;", "", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfferDetailsTrackerProgressRow {

    /* renamed from: a, reason: collision with root package name */
    public final String f8613a;
    public final String b;
    public final CircularProgressIndicator c;

    public OfferDetailsTrackerProgressRow(String str, String str2, CircularProgressIndicator circularProgressIndicator) {
        this.f8613a = str;
        this.b = str2;
        this.c = circularProgressIndicator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetailsTrackerProgressRow)) {
            return false;
        }
        OfferDetailsTrackerProgressRow offerDetailsTrackerProgressRow = (OfferDetailsTrackerProgressRow) obj;
        return Intrinsics.c(this.f8613a, offerDetailsTrackerProgressRow.f8613a) && Intrinsics.c(this.b, offerDetailsTrackerProgressRow.b) && Intrinsics.c(this.c, offerDetailsTrackerProgressRow.c);
    }

    public final int hashCode() {
        String str = this.f8613a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CircularProgressIndicator circularProgressIndicator = this.c;
        return iHashCode2 + (circularProgressIndicator != null ? circularProgressIndicator.d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("OfferDetailsTrackerProgressRow(progressRowTitle=", this.f8613a, ", progressRowDescription=", this.b, ", progressRowCircularIndicator=");
        sbV.append(this.c);
        sbV.append(")");
        return sbV.toString();
    }
}
