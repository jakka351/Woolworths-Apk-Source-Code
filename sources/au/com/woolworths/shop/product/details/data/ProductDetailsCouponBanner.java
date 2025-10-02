package au.com.woolworths.shop.product.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/ProductDetailsCouponBanner;", "Lau/com/woolworths/shop/product/details/data/ProductDetailsItem;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductDetailsCouponBanner implements ProductDetailsItem {

    /* renamed from: a, reason: collision with root package name */
    public final EverydayMarketCouponBannerData f12606a;

    public ProductDetailsCouponBanner(EverydayMarketCouponBannerData everydayMarketCouponBannerData) {
        this.f12606a = everydayMarketCouponBannerData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductDetailsCouponBanner) && Intrinsics.c(this.f12606a, ((ProductDetailsCouponBanner) obj).f12606a);
    }

    public final int hashCode() {
        EverydayMarketCouponBannerData everydayMarketCouponBannerData = this.f12606a;
        if (everydayMarketCouponBannerData == null) {
            return 0;
        }
        return everydayMarketCouponBannerData.hashCode();
    }

    public final String toString() {
        return "ProductDetailsCouponBanner(everydayMarketCouponBannerData=" + this.f12606a + ")";
    }
}
