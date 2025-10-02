package au.com.woolworths.foundation.rewards.cart.info.domain.model;

import au.com.woolworths.foundation.rewards.cart.CartInfoQuery;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"cart-info_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartInfoQueryCartInfoExtKt {
    public static final CartInfoResponse a(CartInfoQuery.CartInfo cartInfo) {
        return new CartInfoResponse(cartInfo.f8546a, cartInfo.b);
    }
}
