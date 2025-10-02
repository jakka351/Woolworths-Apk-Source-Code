package au.com.woolworths.shop.graphql.type;

import android.support.v4.media.session.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/PickupOrderLocationUpdateInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PickupOrderLocationUpdateInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11697a;
    public final double b;
    public final double c;

    public PickupOrderLocationUpdateInput(String orderId, double d, double d2) {
        Intrinsics.h(orderId, "orderId");
        this.f11697a = orderId;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickupOrderLocationUpdateInput)) {
            return false;
        }
        PickupOrderLocationUpdateInput pickupOrderLocationUpdateInput = (PickupOrderLocationUpdateInput) obj;
        return Intrinsics.c(this.f11697a, pickupOrderLocationUpdateInput.f11697a) && Double.compare(this.b, pickupOrderLocationUpdateInput.b) == 0 && Double.compare(this.c, pickupOrderLocationUpdateInput.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + a.a(this.b, this.f11697a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "PickupOrderLocationUpdateInput(orderId=", this.f11697a, ", latitude=");
        sbR.append(", longitude=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
