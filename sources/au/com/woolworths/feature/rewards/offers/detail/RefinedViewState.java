package au.com.woolworths.feature.rewards.offers.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferUnknown;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState;", "", "Loading", "NotFound", "Error", "OfferDetails", "Unknown", "Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState$Error;", "Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState$Loading;", "Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState$NotFound;", "Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState$OfferDetails;", "Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState$Unknown;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RefinedViewState {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState$Error;", "Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error implements RefinedViewState {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsOfferDetailsFullPageErrorStateLegacy f6314a;

        public Error(RewardsOfferDetailsFullPageErrorStateLegacy errorState) {
            Intrinsics.h(errorState, "errorState");
            this.f6314a = errorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.c(this.f6314a, ((Error) obj).f6314a);
        }

        public final int hashCode() {
            return this.f6314a.hashCode();
        }

        public final String toString() {
            return "Error(errorState=" + this.f6314a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState$Loading;", "Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loading implements RefinedViewState {

        /* renamed from: a, reason: collision with root package name */
        public static final Loading f6315a = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1401975416;
        }

        public final String toString() {
            return "Loading";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState$NotFound;", "Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotFound implements RefinedViewState {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsOfferUnknown f6316a;

        public NotFound(RewardsOfferUnknown state) {
            Intrinsics.h(state, "state");
            this.f6316a = state;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotFound) && Intrinsics.c(this.f6316a, ((NotFound) obj).f6316a);
        }

        public final int hashCode() {
            return this.f6316a.hashCode();
        }

        public final String toString() {
            return "NotFound(state=" + this.f6316a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState$OfferDetails;", "Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferDetails implements RefinedViewState {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsOfferData f6317a;
        public final OfferDetailsCtaViewState b;

        public OfferDetails(RewardsOfferData offerData, OfferDetailsCtaViewState offerDetailsCtaViewState) {
            Intrinsics.h(offerData, "offerData");
            this.f6317a = offerData;
            this.b = offerDetailsCtaViewState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferDetails)) {
                return false;
            }
            OfferDetails offerDetails = (OfferDetails) obj;
            return Intrinsics.c(this.f6317a, offerDetails.f6317a) && Intrinsics.c(this.b, offerDetails.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6317a.hashCode() * 31);
        }

        public final String toString() {
            return "OfferDetails(offerData=" + this.f6317a + ", offerDetailsCtaViewState=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState$Unknown;", "Lau/com/woolworths/feature/rewards/offers/detail/RefinedViewState;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unknown implements RefinedViewState {

        /* renamed from: a, reason: collision with root package name */
        public static final Unknown f6318a = new Unknown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return 780483974;
        }

        public final String toString() {
            return "Unknown";
        }
    }
}
