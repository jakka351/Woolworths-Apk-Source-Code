package au.com.woolworths.foundation.shop.cart.data.mapper;

import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityInfo;
import au.com.woolworths.shop.cart.data.common.fragment.CartProductCard;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"cart-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartProductCardQuantityInfoExtKt {
    public static final CartProductQuantityInfo a(CartProductCard.QuantityInfo quantityInfo) {
        return new CartProductQuantityInfo(quantityInfo.f10407a, quantityInfo.b, quantityInfo.c, quantityInfo.d, quantityInfo.e);
    }
}
