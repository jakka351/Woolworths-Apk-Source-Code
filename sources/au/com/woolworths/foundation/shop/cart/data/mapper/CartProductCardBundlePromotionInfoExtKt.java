package au.com.woolworths.foundation.shop.cart.data.mapper;

import au.com.woolworths.foundation.shop.cart.data.model.BundlePromotionInfo;
import au.com.woolworths.shop.cart.data.common.fragment.CartProductCard;
import au.com.woolworths.shop.graphql.type.BundleType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"cart-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartProductCardBundlePromotionInfoExtKt {
    public static final BundlePromotionInfo a(CartProductCard.BundlePromotionInfo bundlePromotionInfo) {
        Intrinsics.h(bundlePromotionInfo, "<this>");
        String str = bundlePromotionInfo.f10399a;
        boolean z = bundlePromotionInfo.b;
        BundleType bundleType = bundlePromotionInfo.c;
        Intrinsics.h(bundleType, "<this>");
        int iOrdinal = bundleType.ordinal();
        return new BundlePromotionInfo(str, z, iOrdinal != 0 ? iOrdinal != 1 ? au.com.woolworths.foundation.shop.cart.data.model.BundleType.e : au.com.woolworths.foundation.shop.cart.data.model.BundleType.e : au.com.woolworths.foundation.shop.cart.data.model.BundleType.d, bundlePromotionInfo.d);
    }
}
