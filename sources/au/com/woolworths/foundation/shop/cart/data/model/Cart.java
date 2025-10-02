package au.com.woolworths.foundation.shop.cart.data.model;

import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/Cart;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Cart {

    /* renamed from: a, reason: collision with root package name */
    public final int f8671a;
    public final CartHeader b;
    public final CartRewardsInfo c;
    public final ArrayList d;
    public final CartFooterData e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final ArrayList j;
    public final CartAlert k;
    public final ArrayList l;

    public Cart(int i, CartHeader cartHeader, CartRewardsInfo cartRewardsInfo, ArrayList arrayList, CartFooterData cartFooterData, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ArrayList arrayList2, CartAlert cartAlert, ArrayList arrayList3) {
        this.f8671a = i;
        this.b = cartHeader;
        this.c = cartRewardsInfo;
        this.d = arrayList;
        this.e = cartFooterData;
        this.f = bool;
        this.g = bool2;
        this.h = bool3;
        this.i = bool4;
        this.j = arrayList2;
        this.k = cartAlert;
        this.l = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cart)) {
            return false;
        }
        Cart cart = (Cart) obj;
        return this.f8671a == cart.f8671a && this.b.equals(cart.b) && Intrinsics.c(this.c, cart.c) && this.d.equals(cart.d) && this.e.equals(cart.e) && this.f.equals(cart.f) && this.g.equals(cart.g) && this.h.equals(cart.h) && this.i.equals(cart.i) && this.j.equals(cart.j) && Intrinsics.c(this.k, cart.k) && this.l.equals(cart.l);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.f8671a) * 31)) * 31;
        CartRewardsInfo cartRewardsInfo = this.c;
        int iB = a.b((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + a.b((iHashCode + (cartRewardsInfo == null ? 0 : cartRewardsInfo.hashCode())) * 31, 31, this.d)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.j);
        CartAlert cartAlert = this.k;
        return this.l.hashCode() + ((iB + (cartAlert != null ? cartAlert.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Cart(totalProducts=" + this.f8671a + ", header=" + this.b + ", rewardsInfo=" + this.c + ", cartSections=" + this.d + ", footer=" + this.e + ", requiresProductReview=" + this.f + ", requiresFulfilmentWindow=" + this.g + ", requiresHaveYouForgotten=" + this.h + ", requiresFulfilmentAddress=" + this.i + ", analytics=" + this.j + ", requiredAlert=" + this.k + ", cartProductQuantities=" + this.l + ")";
    }
}
