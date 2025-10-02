package au.com.woolworths.feature.rewards.offers.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.rewards.account.data.RewardsBalanceData;
import au.com.woolworths.feature.rewards.offers.personalisedoffers.OfferSwapEligibility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferFeedData;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsOfferFeedData {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsBalanceData f6287a;
    public final RewardsOfferFeed b;
    public final OfferSwapEligibility c;

    public RewardsOfferFeedData(RewardsBalanceData rewardsBalanceData, RewardsOfferFeed rewardsOfferFeed, OfferSwapEligibility offerSwapEligibility) {
        this.f6287a = rewardsBalanceData;
        this.b = rewardsOfferFeed;
        this.c = offerSwapEligibility;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsOfferFeedData)) {
            return false;
        }
        RewardsOfferFeedData rewardsOfferFeedData = (RewardsOfferFeedData) obj;
        return Intrinsics.c(this.f6287a, rewardsOfferFeedData.f6287a) && Intrinsics.c(this.b, rewardsOfferFeedData.b) && Intrinsics.c(this.c, rewardsOfferFeedData.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f6287a.hashCode() * 31)) * 31;
        OfferSwapEligibility offerSwapEligibility = this.c;
        return iHashCode + (offerSwapEligibility == null ? 0 : offerSwapEligibility.hashCode());
    }

    public final String toString() {
        return "RewardsOfferFeedData(balance=" + this.f6287a + ", offerFeed=" + this.b + ", offerSwapEligibility=" + this.c + ")";
    }
}
