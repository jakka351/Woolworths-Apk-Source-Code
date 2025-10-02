package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/EverydayExtraSubscriptionNoPaymentInput;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EverydayExtraSubscriptionNoPaymentInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f9556a;

    public EverydayExtraSubscriptionNoPaymentInput(Optional optional) {
        this.f9556a = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EverydayExtraSubscriptionNoPaymentInput) && Intrinsics.c(this.f9556a, ((EverydayExtraSubscriptionNoPaymentInput) obj).f9556a);
    }

    public final int hashCode() {
        return this.f9556a.hashCode();
    }

    public final String toString() {
        return "EverydayExtraSubscriptionNoPaymentInput(acquisitionOfferName=" + this.f9556a + ")";
    }
}
