package au.com.woolworths.feature.rewards.offers.points.ui.boosterlist;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/ui/boosterlist/RewardsOfferListItemSeen;", "", "Offer", "Lau/com/woolworths/feature/rewards/offers/points/ui/boosterlist/RewardsOfferListItemSeen$Offer;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsOfferListItemSeen {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/ui/boosterlist/RewardsOfferListItemSeen$Offer;", "Lau/com/woolworths/feature/rewards/offers/points/ui/boosterlist/RewardsOfferListItemSeen;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Offer implements RewardsOfferListItemSeen {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsOfferData f6380a;

        public Offer(RewardsOfferData data) {
            Intrinsics.h(data, "data");
            this.f6380a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Offer) && Intrinsics.c(this.f6380a, ((Offer) obj).f6380a);
        }

        public final int hashCode() {
            return this.f6380a.hashCode();
        }

        public final String toString() {
            return "Offer(data=" + this.f6380a + ")";
        }
    }
}
