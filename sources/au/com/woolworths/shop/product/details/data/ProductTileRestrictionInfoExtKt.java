package au.com.woolworths.shop.product.details.data;

import au.com.woolworths.product.models.PurchaseRestrictionExtKt;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import au.com.woolworths.shop.productcard.data.RestrictionInfo;
import com.woolworths.shop.productcard.data.fragment.ProductTile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductTileRestrictionInfoExtKt {
    public static final RestrictionInfo a(ProductTile.RestrictionInfo restrictionInfo) {
        Intrinsics.h(restrictionInfo, "<this>");
        PurchaseRestriction purchaseRestriction = restrictionInfo.f23658a;
        return new RestrictionInfo(purchaseRestriction != null ? PurchaseRestrictionExtKt.toUiModel(purchaseRestriction) : null, restrictionInfo.b, restrictionInfo.c);
    }
}
