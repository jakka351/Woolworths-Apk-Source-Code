package au.com.woolworths.shop.productcard.data;

import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import com.woolworths.shop.productcard.data.fragment.ProductTile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductTileProductCardActionExtKt {
    public static final ActionData a(ProductTile.ProductCardAction productCardAction) {
        Intrinsics.h(productCardAction, "<this>");
        String str = productCardAction.b;
        int iOrdinal = productCardAction.f23654a.ordinal();
        ActionType actionType = (iOrdinal == 0 || iOrdinal != 1) ? ActionType.e : ActionType.d;
        return new ActionData(str, actionType, productCardAction.c, null);
    }
}
