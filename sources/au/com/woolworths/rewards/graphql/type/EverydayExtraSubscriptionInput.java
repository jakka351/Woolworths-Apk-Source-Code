package au.com.woolworths.rewards.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/EverydayExtraSubscriptionInput;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EverydayExtraSubscriptionInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f9555a;
    public final Optional.Present b;
    public final Optional c;
    public final Optional.Present d;

    public EverydayExtraSubscriptionInput(String planId, Optional.Present present, Optional optional, Optional.Present present2) {
        Intrinsics.h(planId, "planId");
        this.f9555a = planId;
        this.b = present;
        this.c = optional;
        this.d = present2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtraSubscriptionInput)) {
            return false;
        }
        EverydayExtraSubscriptionInput everydayExtraSubscriptionInput = (EverydayExtraSubscriptionInput) obj;
        return Intrinsics.c(this.f9555a, everydayExtraSubscriptionInput.f9555a) && this.b.equals(everydayExtraSubscriptionInput.b) && this.c.equals(everydayExtraSubscriptionInput.c) && this.d.equals(everydayExtraSubscriptionInput.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.c(this.c, a.b(this.b, this.f9555a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "EverydayExtraSubscriptionInput(planId=" + this.f9555a + ", paymentInstrumentId=" + this.b + ", acquisitionOfferName=" + this.c + ", stepUpToken=" + this.d + ")";
    }
}
