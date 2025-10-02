package au.com.woolworths.shop.productcard.data;

import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import com.woolworths.shop.productcard.data.fragment.ProductTile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductTileFooterExtKt {
    public static final ProductFooter a(ProductTile.Footer footer) {
        Intrinsics.h(footer, "<this>");
        String str = footer.f23642a;
        ProductTile.FooterIcon footerIcon = footer.b;
        ActionData actionData = null;
        IconAsset.CoreIcon coreIcon = footerIcon != null ? new IconAsset.CoreIcon(footerIcon.f23644a) : null;
        boolean z = footer.c;
        ProductTile.FooterAction footerAction = footer.d;
        if (footerAction != null) {
            String str2 = footerAction.b;
            int iOrdinal = footerAction.f23643a.ordinal();
            ActionType actionType = (iOrdinal == 0 || iOrdinal != 1) ? ActionType.e : ActionType.d;
            actionData = new ActionData(str2, actionType, footerAction.c, null);
        }
        return new ProductFooter(str, coreIcon, z, actionData);
    }
}
