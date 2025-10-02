package au.com.woolworths.foundation.shop.cart.data.model;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartBanner;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartSection;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartBanner implements CartSection {

    /* renamed from: a, reason: collision with root package name */
    public final InsetBannerApiData f8673a;
    public final CartBannerType b;

    public CartBanner(InsetBannerApiData insetBannerApiData, CartBannerType cartBannerType) {
        this.f8673a = insetBannerApiData;
        this.b = cartBannerType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartBanner)) {
            return false;
        }
        CartBanner cartBanner = (CartBanner) obj;
        return Intrinsics.c(this.f8673a, cartBanner.f8673a) && this.b == cartBanner.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8673a.hashCode() * 31);
    }

    public final String toString() {
        return "CartBanner(banner=" + this.f8673a + ", type=" + this.b + ")";
    }
}
