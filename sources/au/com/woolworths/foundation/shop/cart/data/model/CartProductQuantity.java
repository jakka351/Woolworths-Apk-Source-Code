package au.com.woolworths.foundation.shop.cart.data.model;

import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartProductQuantity;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartProductQuantity {

    /* renamed from: a, reason: collision with root package name */
    public final String f8682a;
    public final double b;

    public CartProductQuantity(String str, double d) {
        this.f8682a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartProductQuantity)) {
            return false;
        }
        CartProductQuantity cartProductQuantity = (CartProductQuantity) obj;
        return Intrinsics.c(this.f8682a, cartProductQuantity.f8682a) && Double.compare(this.b, cartProductQuantity.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.f8682a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbR = a.r(this.b, "CartProductQuantity(productId=", this.f8682a, ", quantity=");
        sbR.append(")");
        return sbR.toString();
    }
}
