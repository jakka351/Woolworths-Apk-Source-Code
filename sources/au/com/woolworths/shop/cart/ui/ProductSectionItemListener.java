package au.com.woolworths.shop.cart.ui;

import au.com.woolworths.foundation.shop.cart.data.model.CartProductCard;
import au.com.woolworths.foundation.shop.cart.data.model.CartPromotionInfo;
import au.com.woolworths.promotion.banner.ui.PromotionBannerListener;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/cart/ui/ProductSectionItemListener;", "Lau/com/woolworths/promotion/banner/ui/PromotionBannerListener;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ProductSectionItemListener extends PromotionBannerListener {
    void O3(CartProductCard cartProductCard);

    void S1(CartProductCard cartProductCard, double d);

    void e6(String str, boolean z);

    void i6(CartPromotionInfo cartPromotionInfo);

    void p3(CartProductCard cartProductCard);

    void q3(CartPromotionInfo cartPromotionInfo);

    void r0(CartProductCard cartProductCard);
}
