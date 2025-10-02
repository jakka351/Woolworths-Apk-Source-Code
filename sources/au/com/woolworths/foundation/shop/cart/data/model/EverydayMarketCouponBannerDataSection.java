package au.com.woolworths.foundation.shop.cart.data.model;

import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/EverydayMarketCouponBannerDataSection;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartSection;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EverydayMarketCouponBannerDataSection implements CartSection {

    /* renamed from: a, reason: collision with root package name */
    public final EverydayMarketCouponBannerData f8693a;

    public EverydayMarketCouponBannerDataSection(EverydayMarketCouponBannerData everydayMarketCouponBannerData) {
        this.f8693a = everydayMarketCouponBannerData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EverydayMarketCouponBannerDataSection) && Intrinsics.c(this.f8693a, ((EverydayMarketCouponBannerDataSection) obj).f8693a);
    }

    public final int hashCode() {
        return this.f8693a.hashCode();
    }

    public final String toString() {
        return "EverydayMarketCouponBannerDataSection(data=" + this.f8693a + ")";
    }
}
