package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OrderCheckInOnMyWayInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderCheckInOnMyWayInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11633a;
    public final Optional b;
    public final Optional c;

    public OrderCheckInOnMyWayInput(Optional optional, Optional optional2, String orderId) {
        Intrinsics.h(orderId, "orderId");
        this.f11633a = orderId;
        this.b = optional;
        this.c = optional2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCheckInOnMyWayInput)) {
            return false;
        }
        OrderCheckInOnMyWayInput orderCheckInOnMyWayInput = (OrderCheckInOnMyWayInput) obj;
        return Intrinsics.c(this.f11633a, orderCheckInOnMyWayInput.f11633a) && Intrinsics.c(this.b, orderCheckInOnMyWayInput.b) && Intrinsics.c(this.c, orderCheckInOnMyWayInput.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a.c(this.b, this.f11633a.hashCode() * 31, 31);
    }

    public final String toString() {
        return a.o(a.r("OrderCheckInOnMyWayInput(orderId=", this.f11633a, ", onMyWayEta=", this.b, ", geoLocation="), this.c, ")");
    }
}
