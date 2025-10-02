package au.com.woolworths.foundation.rewards.offers.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsStatusBadge;", "", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfferDetailsStatusBadge {

    /* renamed from: a, reason: collision with root package name */
    public final String f8612a;
    public final RewardsOfferStatus b;

    public OfferDetailsStatusBadge(String str, RewardsOfferStatus status) {
        Intrinsics.h(status, "status");
        this.f8612a = str;
        this.b = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetailsStatusBadge)) {
            return false;
        }
        OfferDetailsStatusBadge offerDetailsStatusBadge = (OfferDetailsStatusBadge) obj;
        return Intrinsics.c(this.f8612a, offerDetailsStatusBadge.f8612a) && this.b == offerDetailsStatusBadge.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8612a.hashCode() * 31);
    }

    public final String toString() {
        return "OfferDetailsStatusBadge(label=" + this.f8612a + ", status=" + this.b + ")";
    }
}
