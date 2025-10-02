package au.com.woolworths.shop.lists.ui.magicmatch.interactor;

import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.type.ProductPromotionTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardPromotionInfoExtKt {
    public static final PromotionInfo a(ProductCard.PromotionInfo promotionInfo) {
        Intrinsics.h(promotionInfo, "<this>");
        ProductPromotionTypes productPromotionTypes = promotionInfo.f8971a;
        Intrinsics.h(productPromotionTypes, "<this>");
        int iOrdinal = productPromotionTypes.ordinal();
        return new PromotionInfo(iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? au.com.woolworths.android.onesite.products.models.ProductPromotionTypes.PRICE_DROPPED : au.com.woolworths.android.onesite.products.models.ProductPromotionTypes.LOWER_PRICE : au.com.woolworths.android.onesite.products.models.ProductPromotionTypes.LOWER_SHELF_PRICE : au.com.woolworths.android.onesite.products.models.ProductPromotionTypes.CONTAINER_CREDITS : au.com.woolworths.android.onesite.products.models.ProductPromotionTypes.PRICE_DROPPED : au.com.woolworths.android.onesite.products.models.ProductPromotionTypes.LOW_PRICE : au.com.woolworths.android.onesite.products.models.ProductPromotionTypes.SPECIAL, promotionInfo.b);
    }
}
