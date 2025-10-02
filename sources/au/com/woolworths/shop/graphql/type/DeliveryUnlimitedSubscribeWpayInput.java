package au.com.woolworths.shop.graphql.type;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeliveryUnlimitedSubscribeWpayInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSubscribeWpayInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11342a;
    public final String b;

    public DeliveryUnlimitedSubscribeWpayInput(String paymentSessionId, String planId) {
        Intrinsics.h(paymentSessionId, "paymentSessionId");
        Intrinsics.h(planId, "planId");
        this.f11342a = paymentSessionId;
        this.b = planId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSubscribeWpayInput)) {
            return false;
        }
        DeliveryUnlimitedSubscribeWpayInput deliveryUnlimitedSubscribeWpayInput = (DeliveryUnlimitedSubscribeWpayInput) obj;
        return Intrinsics.c(this.f11342a, deliveryUnlimitedSubscribeWpayInput.f11342a) && Intrinsics.c(this.b, deliveryUnlimitedSubscribeWpayInput.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11342a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("DeliveryUnlimitedSubscribeWpayInput(paymentSessionId=", this.f11342a, ", planId=", this.b, ")");
    }
}
