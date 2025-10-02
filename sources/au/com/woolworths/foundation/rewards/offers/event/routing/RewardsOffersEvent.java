package au.com.woolworths.foundation.rewards.offers.event.routing;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/event/routing/RewardsOffersEvent;", "", "Boosted", "Lau/com/woolworths/foundation/rewards/offers/event/routing/RewardsOffersEvent$Boosted;", "offers-event-routing"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface RewardsOffersEvent {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/event/routing/RewardsOffersEvent$Boosted;", "Lau/com/woolworths/foundation/rewards/offers/event/routing/RewardsOffersEvent;", "offers-event-routing"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Boosted implements RewardsOffersEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f8602a;

        public Boosted(String offerId) {
            Intrinsics.h(offerId, "offerId");
            this.f8602a = offerId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Boosted) && Intrinsics.c(this.f8602a, ((Boosted) obj).f8602a);
        }

        public final int hashCode() {
            return this.f8602a.hashCode();
        }

        public final String toString() {
            return a.h("Boosted(offerId=", this.f8602a, ")");
        }
    }
}
