package au.com.woolworths.foundation.shop.cart.data.model;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartProductQuantityUpdated;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartProductQuantityUpdated {

    /* renamed from: a, reason: collision with root package name */
    public final String f8684a;
    public final double b;
    public final boolean c;
    public final ErrorUpdateCartProductQuantity d;
    public final Double e;
    public final String f;
    public final CartProductQuantityAction g;

    public CartProductQuantityUpdated(String str, double d, boolean z, ErrorUpdateCartProductQuantity errorUpdateCartProductQuantity, Double d2, String str2, CartProductQuantityAction cartProductQuantityAction) {
        this.f8684a = str;
        this.b = d;
        this.c = z;
        this.d = errorUpdateCartProductQuantity;
        this.e = d2;
        this.f = str2;
        this.g = cartProductQuantityAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartProductQuantityUpdated)) {
            return false;
        }
        CartProductQuantityUpdated cartProductQuantityUpdated = (CartProductQuantityUpdated) obj;
        return Intrinsics.c(this.f8684a, cartProductQuantityUpdated.f8684a) && Double.compare(this.b, cartProductQuantityUpdated.b) == 0 && this.c == cartProductQuantityUpdated.c && Intrinsics.c(this.d, cartProductQuantityUpdated.d) && Intrinsics.c(this.e, cartProductQuantityUpdated.e) && Intrinsics.c(this.f, cartProductQuantityUpdated.f) && this.g == cartProductQuantityUpdated.g;
    }

    public final int hashCode() {
        int iE = b.e(a.a(this.b, this.f8684a.hashCode() * 31, 31), 31, this.c);
        ErrorUpdateCartProductQuantity errorUpdateCartProductQuantity = this.d;
        int iHashCode = (iE + (errorUpdateCartProductQuantity == null ? 0 : errorUpdateCartProductQuantity.hashCode())) * 31;
        Double d = this.e;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CartProductQuantityAction cartProductQuantityAction = this.g;
        return iHashCode3 + (cartProductQuantityAction != null ? cartProductQuantityAction.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "CartProductQuantityUpdated(productId=", this.f8684a, ", updatedQuantity=");
        sbR.append(", success=");
        sbR.append(this.c);
        sbR.append(", error=");
        sbR.append(this.d);
        sbR.append(", deltaQuantity=");
        sbR.append(this.e);
        sbR.append(", deltaSubtotal=");
        sbR.append(this.f);
        sbR.append(", productQuantityAction=");
        sbR.append(this.g);
        sbR.append(")");
        return sbR.toString();
    }
}
