package au.com.woolworths.foundation.shop.cart.data.model;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartProductQuantitiesUpdatedResponse;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CartProductQuantitiesUpdatedResponse {

    /* renamed from: a, reason: collision with root package name */
    public final int f8681a;
    public final int b;
    public final Object c;
    public final Cart d;

    public CartProductQuantitiesUpdatedResponse(int i, int i2, List list, Cart cart, int i3) {
        cart = (i3 & 8) != 0 ? null : cart;
        this.f8681a = i;
        this.b = i2;
        this.c = list;
        this.d = cart;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartProductQuantitiesUpdatedResponse)) {
            return false;
        }
        CartProductQuantitiesUpdatedResponse cartProductQuantitiesUpdatedResponse = (CartProductQuantitiesUpdatedResponse) obj;
        return this.f8681a == cartProductQuantitiesUpdatedResponse.f8681a && this.b == cartProductQuantitiesUpdatedResponse.b && this.c.equals(cartProductQuantitiesUpdatedResponse.c) && Intrinsics.c(this.d, cartProductQuantitiesUpdatedResponse.d);
    }

    public final int hashCode() {
        int iE = a.e(b.a(this.b, Integer.hashCode(this.f8681a) * 31, 31), 31, this.c);
        Cart cart = this.d;
        return (iE + (cart == null ? 0 : cart.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sbQ = YU.a.q(this.f8681a, this.b, "CartProductQuantitiesUpdatedResponse(productCount=", ", totalProductCount=", ", updatedProductQuantities=");
        sbQ.append(this.c);
        sbQ.append(", cart=");
        sbQ.append(this.d);
        sbQ.append(", errorPrompt=null)");
        return sbQ.toString();
    }
}
