package au.com.woolworths.feature.rewards.offers.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsCtaCard;", "Lau/com/woolworths/feature/rewards/offers/data/OffersSections;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsCtaCard implements OffersSections {

    /* renamed from: a, reason: collision with root package name */
    public final String f6281a;
    public final String b;
    public final String c;

    public RewardsCtaCard(String str, String str2, String str3) {
        this.f6281a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsCtaCard)) {
            return false;
        }
        RewardsCtaCard rewardsCtaCard = (RewardsCtaCard) obj;
        return this.f6281a.equals(rewardsCtaCard.f6281a) && this.b.equals(rewardsCtaCard.b) && this.c.equals(rewardsCtaCard.c);
    }

    public final int hashCode() {
        return b.c(b.c(this.f6281a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return a.o(a.v("RewardsCtaCard(id=", this.f6281a, ", title=", this.b, ", actionUrl="), this.c, ", analytics=null)");
    }
}
