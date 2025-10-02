package au.com.woolworths.foundation.shop.cart.data.mapper;

import au.com.woolworths.foundation.shop.cart.data.model.MemberPricePromotionInfo;
import au.com.woolworths.shop.cart.data.common.fragment.CartProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"cart-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartProductCardSingleMemberPricePromotionInfoExtKt {
    public static final MemberPricePromotionInfo a(CartProductCard.SingleMemberPricePromotionInfo singleMemberPricePromotionInfo) {
        Intrinsics.h(singleMemberPricePromotionInfo, "<this>");
        return new MemberPricePromotionInfo(singleMemberPricePromotionInfo.f10408a, singleMemberPricePromotionInfo.b, singleMemberPricePromotionInfo.c);
    }
}
