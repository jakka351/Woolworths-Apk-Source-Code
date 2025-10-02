package au.com.woolworths.feature.rewards.offers.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/OfferDetailsParams;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OfferDetailsParams {

    /* renamed from: a, reason: collision with root package name */
    public final String f6274a;
    public final String b;

    public OfferDetailsParams(String str, String str2) {
        this.f6274a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetailsParams)) {
            return false;
        }
        OfferDetailsParams offerDetailsParams = (OfferDetailsParams) obj;
        return Intrinsics.c(this.f6274a, offerDetailsParams.f6274a) && Intrinsics.c(this.b, offerDetailsParams.b);
    }

    public final int hashCode() {
        int iHashCode = this.f6274a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.j("OfferDetailsParams(offerOrCampaignId=", this.f6274a, ", offerType=", this.b, ")");
    }
}
