package au.com.woolworths.shop.cart.ui.productreview;

import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.ProductTileButtonType;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductReviewCardExtKt {
    public static final ProductCard a(ProductReviewCard productReviewCard) {
        String str;
        ProductTrolleyData productTrolleyData;
        Intrinsics.h(productReviewCard, "<this>");
        String str2 = productReviewCard.b;
        String str3 = productReviewCard.f10444a;
        String str4 = productReviewCard.d;
        Integer num = productReviewCard.g;
        boolean z = productReviewCard.h;
        CartProductQuantityInfo cartProductQuantityInfo = productReviewCard.f;
        if (cartProductQuantityInfo != null) {
            str = str2;
            productTrolleyData = new ProductTrolleyData(cartProductQuantityInfo.f8683a, cartProductQuantityInfo.b, cartProductQuantityInfo.c, cartProductQuantityInfo.d, Double.valueOf(productReviewCard.c), cartProductQuantityInfo.e, ProductTileButtonType.UPDATE, "", null, null);
        } else {
            str = str2;
            productTrolleyData = null;
        }
        return new ProductCard(str, str3, str4, null, num, null, null, null, null, z, false, null, null, null, null, productTrolleyData, null, cartProductQuantityInfo != null ? new ProductShoppingList(cartProductQuantityInfo.f8683a, cartProductQuantityInfo.b, cartProductQuantityInfo.c, cartProductQuantityInfo.d, cartProductQuantityInfo.e) : new ProductShoppingList(1.0d, 36.0d, 1.0d, 1.0d, null, 16, null), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, -165400, 255, null);
    }
}
