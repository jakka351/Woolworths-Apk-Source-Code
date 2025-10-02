package au.com.woolworths.feature.shop.myorders.details.models;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/PickupOrderMessage;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PickupOrderMessage {

    /* renamed from: a, reason: collision with root package name */
    public final String f7774a;
    public final PickupOrderStatus b;

    public PickupOrderMessage(String orderId, PickupOrderStatus pickupOrderStatus) {
        Intrinsics.h(orderId, "orderId");
        this.f7774a = orderId;
        this.b = pickupOrderStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickupOrderMessage)) {
            return false;
        }
        PickupOrderMessage pickupOrderMessage = (PickupOrderMessage) obj;
        return Intrinsics.c(this.f7774a, pickupOrderMessage.f7774a) && this.b == pickupOrderMessage.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7774a.hashCode() * 31);
    }

    public final String toString() {
        return "PickupOrderMessage(orderId=" + this.f7774a + ", orderStatus=" + this.b + ")";
    }
}
