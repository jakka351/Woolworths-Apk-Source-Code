package au.com.woolworths.feature.rewards.offers.personalisedoffers;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/personalisedoffers/OfferSwapEligibility;", "", "Available", "Unavailable", "Lau/com/woolworths/feature/rewards/offers/personalisedoffers/OfferSwapEligibility$Available;", "Lau/com/woolworths/feature/rewards/offers/personalisedoffers/OfferSwapEligibility$Unavailable;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OfferSwapEligibility {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/personalisedoffers/OfferSwapEligibility$Available;", "Lau/com/woolworths/feature/rewards/offers/personalisedoffers/OfferSwapEligibility;", "Swappable", "Unswappable", "Lau/com/woolworths/feature/rewards/offers/personalisedoffers/OfferSwapEligibility$Available$Swappable;", "Lau/com/woolworths/feature/rewards/offers/personalisedoffers/OfferSwapEligibility$Available$Unswappable;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Available extends OfferSwapEligibility {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/personalisedoffers/OfferSwapEligibility$Available$Swappable;", "Lau/com/woolworths/feature/rewards/offers/personalisedoffers/OfferSwapEligibility$Available;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Swappable implements Available {

            /* renamed from: a, reason: collision with root package name */
            public static final Swappable f6364a = new Swappable();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Swappable);
            }

            public final int hashCode() {
                return -2086875896;
            }

            public final String toString() {
                return "Swappable";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/personalisedoffers/OfferSwapEligibility$Available$Unswappable;", "Lau/com/woolworths/feature/rewards/offers/personalisedoffers/OfferSwapEligibility$Available;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Unswappable implements Available {

            /* renamed from: a, reason: collision with root package name */
            public static final Unswappable f6365a = new Unswappable();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Unswappable);
            }

            public final int hashCode() {
                return -408575409;
            }

            public final String toString() {
                return "Unswappable";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/personalisedoffers/OfferSwapEligibility$Unavailable;", "Lau/com/woolworths/feature/rewards/offers/personalisedoffers/OfferSwapEligibility;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unavailable implements OfferSwapEligibility {

        /* renamed from: a, reason: collision with root package name */
        public static final Unavailable f6366a = new Unavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public final int hashCode() {
            return -1104391098;
        }

        public final String toString() {
            return "Unavailable";
        }
    }
}
