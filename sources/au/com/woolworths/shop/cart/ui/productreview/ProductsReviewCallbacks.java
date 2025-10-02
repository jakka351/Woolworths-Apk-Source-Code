package au.com.woolworths.shop.cart.ui.productreview;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import au.com.woolworths.shop.cart.domain.model.ProductReviewFeed;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductsReviewCallbacks;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ProductsReviewCallbacks {
    void U2(ProductReviewCard productReviewCard);

    void V4(ProductReviewFeed.ProductReviewGroup productReviewGroup);

    void Z3(ProductReviewCard productReviewCard);

    void d3(List list);

    void f0(String str);

    void j5(ProductReviewCard productReviewCard, double d);

    void q(ProductCard productCard);

    void r1(List list, AnalyticsData analyticsData);

    void y5();

    void z();
}
