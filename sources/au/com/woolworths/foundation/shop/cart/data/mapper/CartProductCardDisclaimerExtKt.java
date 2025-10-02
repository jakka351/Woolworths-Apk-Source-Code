package au.com.woolworths.foundation.shop.cart.data.mapper;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.shop.cart.data.common.fragment.CartProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"cart-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartProductCardDisclaimerExtKt {
    public static final InsetBannerApiData a(CartProductCard.Disclaimer disclaimer) {
        Intrinsics.h(disclaimer, "<this>");
        return new InsetBannerApiData(InsetBannerDisplayTypeExtKt.a(disclaimer.f10403a), disclaimer.b, disclaimer.c, null, null, null, 32, null);
    }
}
