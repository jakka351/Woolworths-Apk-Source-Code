package au.com.woolworths.foundation.rewards.offers.model;

import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsContentItem;", "", "OfferDetailsCard", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsContentItem$OfferDetailsCard;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OfferDetailsContentItem {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsContentItem$OfferDetailsCard;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsContentItem;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferDetailsCard implements OfferDetailsContentItem {

        /* renamed from: a, reason: collision with root package name */
        public final List f8609a;

        public OfferDetailsCard(List list) {
            this.f8609a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OfferDetailsCard) && Intrinsics.c(this.f8609a, ((OfferDetailsCard) obj).f8609a);
        }

        public final int hashCode() {
            return this.f8609a.hashCode();
        }

        public final String toString() {
            return a.l("OfferDetailsCard(rows=", ")", this.f8609a);
        }
    }
}
