package au.com.woolworths.feature.rewards.offers.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferListPageFooter;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsOfferListPageFooter {

    /* renamed from: a, reason: collision with root package name */
    public final String f6291a;
    public final ContentCta b;

    public RewardsOfferListPageFooter(String str, ContentCta contentCta) {
        this.f6291a = str;
        this.b = contentCta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsOfferListPageFooter)) {
            return false;
        }
        RewardsOfferListPageFooter rewardsOfferListPageFooter = (RewardsOfferListPageFooter) obj;
        return Intrinsics.c(this.f6291a, rewardsOfferListPageFooter.f6291a) && Intrinsics.c(this.b, rewardsOfferListPageFooter.b);
    }

    public final int hashCode() {
        String str = this.f6291a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ContentCta contentCta = this.b;
        return iHashCode + (contentCta != null ? contentCta.hashCode() : 0);
    }

    public final String toString() {
        return "RewardsOfferListPageFooter(title=" + this.f6291a + ", cta=" + this.b + ")";
    }
}
