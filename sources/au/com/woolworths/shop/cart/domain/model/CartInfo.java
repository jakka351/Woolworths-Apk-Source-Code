package au.com.woolworths.shop.cart.domain.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/CartInfo;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartInfo {

    /* renamed from: a, reason: collision with root package name */
    public final int f10432a;

    public CartInfo(int i) {
        this.f10432a = i;
    }

    /* renamed from: a, reason: from getter */
    public final int getF10432a() {
        return this.f10432a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CartInfo) && this.f10432a == ((CartInfo) obj).f10432a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10432a);
    }

    public final String toString() {
        return a.e(this.f10432a, "CartInfo(totalProductCount=", ")");
    }
}
