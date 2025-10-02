package au.com.woolworths.feature.rewards.offers.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsOffersHeader;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsOffersHeader {

    /* renamed from: a, reason: collision with root package name */
    public final String f6293a;
    public final RewardsSummaryContent b;

    public RewardsOffersHeader(String str, RewardsSummaryContent rewardsSummaryContent) {
        this.f6293a = str;
        this.b = rewardsSummaryContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsOffersHeader)) {
            return false;
        }
        RewardsOffersHeader rewardsOffersHeader = (RewardsOffersHeader) obj;
        return Intrinsics.c(this.f6293a, rewardsOffersHeader.f6293a) && Intrinsics.c(this.b, rewardsOffersHeader.b);
    }

    public final int hashCode() {
        int iHashCode = this.f6293a.hashCode() * 31;
        RewardsSummaryContent rewardsSummaryContent = this.b;
        return iHashCode + (rewardsSummaryContent == null ? 0 : rewardsSummaryContent.hashCode());
    }

    public final String toString() {
        return "RewardsOffersHeader(title=" + this.f6293a + ", summary=" + this.b + ")";
    }
}
