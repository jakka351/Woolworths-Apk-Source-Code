package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeliveryUnlimitedPaymentInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedPaymentInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11319a;
    public final Optional b;

    public DeliveryUnlimitedPaymentInput(Optional optional, String planId) {
        Intrinsics.h(planId, "planId");
        this.f11319a = planId;
        this.b = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedPaymentInput)) {
            return false;
        }
        DeliveryUnlimitedPaymentInput deliveryUnlimitedPaymentInput = (DeliveryUnlimitedPaymentInput) obj;
        return Intrinsics.c(this.f11319a, deliveryUnlimitedPaymentInput.f11319a) && Intrinsics.c(this.b, deliveryUnlimitedPaymentInput.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11319a.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryUnlimitedPaymentInput(planId=" + this.f11319a + ", selectedId=" + this.b + ")";
    }
}
