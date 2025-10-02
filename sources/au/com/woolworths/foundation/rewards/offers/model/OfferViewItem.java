package au.com.woolworths.foundation.rewards.offers.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferViewItem;", "", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfferViewItem {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8617a;
    public final RewardsOfferData b;

    public OfferViewItem(boolean z, RewardsOfferData rewardsOfferData) {
        this.f8617a = z;
        this.b = rewardsOfferData;
    }

    public static OfferViewItem a(OfferViewItem offerViewItem, boolean z) {
        RewardsOfferData rewardsOfferData = offerViewItem.b;
        offerViewItem.getClass();
        return new OfferViewItem(z, rewardsOfferData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferViewItem)) {
            return false;
        }
        OfferViewItem offerViewItem = (OfferViewItem) obj;
        return this.f8617a == offerViewItem.f8617a && Intrinsics.c(this.b, offerViewItem.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f8617a) * 31);
    }

    public final String toString() {
        return "OfferViewItem(isActivating=" + this.f8617a + ", offerData=" + this.b + ")";
    }
}
