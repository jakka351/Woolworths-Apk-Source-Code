package au.com.woolworths.foundation.shop.cart.data.model;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartProductCategory;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartProductFeed;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartProductCategory implements CartProductFeed {

    /* renamed from: a, reason: collision with root package name */
    public final String f8680a;

    public CartProductCategory(String str) {
        this.f8680a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CartProductCategory) && Intrinsics.c(this.f8680a, ((CartProductCategory) obj).f8680a);
    }

    public final int hashCode() {
        return this.f8680a.hashCode();
    }

    public final String toString() {
        return a.h("CartProductCategory(title=", this.f8680a, ")");
    }
}
