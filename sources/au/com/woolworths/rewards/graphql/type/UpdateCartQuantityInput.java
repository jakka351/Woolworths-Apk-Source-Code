package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/UpdateCartQuantityInput;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateCartQuantityInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f9937a;

    public UpdateCartQuantityInput(Optional optional) {
        Intrinsics.h(null, "productId");
        this.f9937a = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateCartQuantityInput) && this.f9937a.equals(((UpdateCartQuantityInput) obj).f9937a);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "UpdateCartQuantityInput(productId=null, quantity=0, searchAnalytics=" + this.f9937a + ")";
    }
}
