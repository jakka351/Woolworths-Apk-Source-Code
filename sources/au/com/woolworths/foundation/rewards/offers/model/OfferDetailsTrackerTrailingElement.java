package au.com.woolworths.foundation.rewards.offers.model;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsTrackerTrailingElement;", "", "OfferDetailsTrackerTrailingElementLabel", "OfferDetailsTrackerTrailingElementPoints", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsTrackerTrailingElement$OfferDetailsTrackerTrailingElementLabel;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsTrackerTrailingElement$OfferDetailsTrackerTrailingElementPoints;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OfferDetailsTrackerTrailingElement {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsTrackerTrailingElement$OfferDetailsTrackerTrailingElementLabel;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsTrackerTrailingElement;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferDetailsTrackerTrailingElementLabel implements OfferDetailsTrackerTrailingElement {

        /* renamed from: a, reason: collision with root package name */
        public final String f8615a;

        public OfferDetailsTrackerTrailingElementLabel(String str) {
            this.f8615a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OfferDetailsTrackerTrailingElementLabel) && Intrinsics.c(this.f8615a, ((OfferDetailsTrackerTrailingElementLabel) obj).f8615a);
        }

        public final int hashCode() {
            return this.f8615a.hashCode();
        }

        public final String toString() {
            return a.h("OfferDetailsTrackerTrailingElementLabel(elementLabel=", this.f8615a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsTrackerTrailingElement$OfferDetailsTrackerTrailingElementPoints;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsTrackerTrailingElement;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferDetailsTrackerTrailingElementPoints implements OfferDetailsTrackerTrailingElement {

        /* renamed from: a, reason: collision with root package name */
        public final String f8616a;
        public final String b;

        public OfferDetailsTrackerTrailingElementPoints(String str, String str2) {
            this.f8616a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferDetailsTrackerTrailingElementPoints)) {
                return false;
            }
            OfferDetailsTrackerTrailingElementPoints offerDetailsTrackerTrailingElementPoints = (OfferDetailsTrackerTrailingElementPoints) obj;
            return Intrinsics.c(this.f8616a, offerDetailsTrackerTrailingElementPoints.f8616a) && Intrinsics.c(this.b, offerDetailsTrackerTrailingElementPoints.b);
        }

        public final int hashCode() {
            String str = this.f8616a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return a.j("OfferDetailsTrackerTrailingElementPoints(pointsPrefix=", this.f8616a, ", pointsLabel=", this.b, ")");
        }
    }
}
