package au.com.woolworths.feature.rewards.offers.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/domain/model/OfferDetailsMutationResponse;", "", "OfferDetailsMutationResult", "Lau/com/woolworths/feature/rewards/offers/domain/model/OfferDetailsMutationResponse$OfferDetailsMutationResult;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OfferDetailsMutationResponse {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/domain/model/OfferDetailsMutationResponse$OfferDetailsMutationResult;", "Lau/com/woolworths/feature/rewards/offers/domain/model/OfferDetailsMutationResponse;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferDetailsMutationResult implements OfferDetailsMutationResponse {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsOfferData f6336a;
        public final OfferDetailsPageResponse.OfferDetailsPage b;

        public OfferDetailsMutationResult(RewardsOfferData rewardsOfferData, OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage) {
            Intrinsics.h(offerDetailsPage, "offerDetailsPage");
            this.f6336a = rewardsOfferData;
            this.b = offerDetailsPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferDetailsMutationResult)) {
                return false;
            }
            OfferDetailsMutationResult offerDetailsMutationResult = (OfferDetailsMutationResult) obj;
            return Intrinsics.c(this.f6336a, offerDetailsMutationResult.f6336a) && Intrinsics.c(this.b, offerDetailsMutationResult.b);
        }

        public final int hashCode() {
            RewardsOfferData rewardsOfferData = this.f6336a;
            return this.b.hashCode() + ((rewardsOfferData == null ? 0 : rewardsOfferData.hashCode()) * 31);
        }

        public final String toString() {
            return "OfferDetailsMutationResult(rewardsOffer=" + this.f6336a + ", offerDetailsPage=" + this.b + ")";
        }
    }
}
