package au.com.woolworths.product.details.models;

import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerColorTheme;
import au.com.woolworths.shop.graphql.type.CouponBannerColorTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/modules/couponbanner/EverydayMarketCouponBannerColorTheme;", "Lau/com/woolworths/shop/graphql/type/CouponBannerColorTheme;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CouponBannerColorThemeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CouponBannerColorTheme.values().length];
            try {
                CouponBannerColorTheme.Companion companion = CouponBannerColorTheme.e;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CouponBannerColorTheme.Companion companion2 = CouponBannerColorTheme.e;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final EverydayMarketCouponBannerColorTheme toUiModel(@NotNull CouponBannerColorTheme couponBannerColorTheme) {
        Intrinsics.h(couponBannerColorTheme, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[couponBannerColorTheme.ordinal()];
        if (i != 1 && i == 2) {
            return EverydayMarketCouponBannerColorTheme.e;
        }
        return EverydayMarketCouponBannerColorTheme.d;
    }
}
