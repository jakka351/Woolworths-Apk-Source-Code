package au.com.woolworths.rewards.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/OfferDetailsPageInput;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfferDetailsPageInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f9685a;
    public final Optional.Present b;
    public final Optional c;

    public OfferDetailsPageInput(String offerId, Optional.Present present, Optional optional) {
        Intrinsics.h(offerId, "offerId");
        this.f9685a = offerId;
        this.b = present;
        this.c = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetailsPageInput)) {
            return false;
        }
        OfferDetailsPageInput offerDetailsPageInput = (OfferDetailsPageInput) obj;
        return Intrinsics.c(this.f9685a, offerDetailsPageInput.f9685a) && this.b.equals(offerDetailsPageInput.b) && this.c.equals(offerDetailsPageInput.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a.b(this.b, this.f9685a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferDetailsPageInput(offerId=");
        sb.append(this.f9685a);
        sb.append(", isShopAppInstalled=");
        sb.append(this.b);
        sb.append(", type=");
        return a.o(sb, this.c, ")");
    }
}
