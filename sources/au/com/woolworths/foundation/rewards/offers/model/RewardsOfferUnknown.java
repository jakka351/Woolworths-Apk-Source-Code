package au.com.woolworths.foundation.rewards.offers.model;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.data.ContentCta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferUnknown;", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferScreenData;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsOfferUnknown implements RewardsOfferScreenData {
    public final String d;
    public final String e;
    public final ContentCta f;

    public RewardsOfferUnknown(String str, String str2, ContentCta contentCta) {
        this.d = str;
        this.e = str2;
        this.f = contentCta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsOfferUnknown)) {
            return false;
        }
        RewardsOfferUnknown rewardsOfferUnknown = (RewardsOfferUnknown) obj;
        return Intrinsics.c(this.d, rewardsOfferUnknown.d) && Intrinsics.c(this.e, rewardsOfferUnknown.e) && Intrinsics.c(this.f, rewardsOfferUnknown.f);
    }

    public final int hashCode() {
        int iC = b.c(this.d.hashCode() * 31, 31, this.e);
        ContentCta contentCta = this.f;
        return iC + (contentCta == null ? 0 : contentCta.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = a.v("RewardsOfferUnknown(title=", this.d, ", description=", this.e, ", cta=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
