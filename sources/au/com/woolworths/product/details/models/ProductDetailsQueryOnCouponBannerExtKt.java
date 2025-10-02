package au.com.woolworths.product.details.models;

import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerData;
import com.woolworths.product.details.ProductDetailsQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/modules/couponbanner/EverydayMarketCouponBannerData;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnCouponBanner;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsQueryOnCouponBannerExtKt {
    @NotNull
    public static final EverydayMarketCouponBannerData toUiModel(@NotNull ProductDetailsQuery.OnCouponBanner onCouponBanner) {
        Intrinsics.h(onCouponBanner, "<this>");
        return new EverydayMarketCouponBannerData(CouponBannerColorThemeExtKt.toUiModel(onCouponBanner.getCouponBannerColorTheme()), onCouponBanner.getCouponBannerDescription(), onCouponBanner.getCouponBannerCouponCode(), onCouponBanner.getCouponBannerImage(), onCouponBanner.getCouponBannerMinimumSpend(), null, null, ProductDetailsQueryCouponBannerTermsAndConditionsExtKt.toUiModel(onCouponBanner.getCouponBannerTermsAndConditions()));
    }
}
