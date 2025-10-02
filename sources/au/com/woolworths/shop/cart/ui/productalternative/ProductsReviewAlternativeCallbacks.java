package au.com.woolworths.shop.cart.ui.productalternative;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productalternative/ProductsReviewAlternativeCallbacks;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ProductsReviewAlternativeCallbacks {
    void I3(AnalyticsData analyticsData);

    void K2();

    void U0(AnalyticsData analyticsData);

    void i1();

    void j1(ProductReviewCard productReviewCard, ProductCard productCard);

    void q(ProductCard productCard);

    void q5(AnalyticsData analyticsData);

    void z();
}
