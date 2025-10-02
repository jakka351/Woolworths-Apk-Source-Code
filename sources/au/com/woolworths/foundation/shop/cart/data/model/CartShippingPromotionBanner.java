package au.com.woolworths.foundation.shop.cart.data.model;

import au.com.woolworths.promotion.banner.ui.PromotionBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartShippingPromotionBanner;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartShippingMessageBanner;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartShippingPromotionBanner implements CartShippingMessageBanner {

    /* renamed from: a, reason: collision with root package name */
    public final PromotionBanner f8691a;

    public CartShippingPromotionBanner(PromotionBanner promotionBanner) {
        this.f8691a = promotionBanner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CartShippingPromotionBanner) && Intrinsics.c(this.f8691a, ((CartShippingPromotionBanner) obj).f8691a);
    }

    public final int hashCode() {
        return this.f8691a.hashCode();
    }

    public final String toString() {
        return "CartShippingPromotionBanner(promotionBanner=" + this.f8691a + ")";
    }
}
