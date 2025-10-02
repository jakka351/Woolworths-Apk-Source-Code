package au.com.woolworths.foundation.shop.cart.data.model;

import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartHeader;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartHeader {

    /* renamed from: a, reason: collision with root package name */
    public final String f8675a;
    public final ButtonApiData b;
    public final CartSaving c;
    public final String d;

    public CartHeader(String str, ButtonApiData buttonApiData, CartSaving cartSaving, String str2) {
        this.f8675a = str;
        this.b = buttonApiData;
        this.c = cartSaving;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartHeader)) {
            return false;
        }
        CartHeader cartHeader = (CartHeader) obj;
        return Intrinsics.c(this.f8675a, cartHeader.f8675a) && Intrinsics.c(this.b, cartHeader.b) && Intrinsics.c(this.c, cartHeader.c) && Intrinsics.c(this.d, cartHeader.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f8675a.hashCode() * 31)) * 31;
        CartSaving cartSaving = this.c;
        int iHashCode2 = (iHashCode + (cartSaving == null ? 0 : cartSaving.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CartHeader(total=" + this.f8675a + ", button=" + this.b + ", saving=" + this.c + ", subtitle=" + this.d + ")";
    }
}
