package au.com.woolworths.foundation.shop.cart.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/ErrorUpdateCartProductQuantity;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ErrorUpdateCartProductQuantity {

    /* renamed from: a, reason: collision with root package name */
    public final UpdateCartProductQuantityFailedReason f8692a;
    public final String b;

    public ErrorUpdateCartProductQuantity(UpdateCartProductQuantityFailedReason updateCartProductQuantityFailedReason, String str) {
        this.f8692a = updateCartProductQuantityFailedReason;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorUpdateCartProductQuantity)) {
            return false;
        }
        ErrorUpdateCartProductQuantity errorUpdateCartProductQuantity = (ErrorUpdateCartProductQuantity) obj;
        return this.f8692a == errorUpdateCartProductQuantity.f8692a && Intrinsics.c(this.b, errorUpdateCartProductQuantity.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8692a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorUpdateCartProductQuantity(reason=" + this.f8692a + ", message=" + this.b + ")";
    }
}
