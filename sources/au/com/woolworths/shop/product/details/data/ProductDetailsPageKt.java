package au.com.woolworths.shop.product.details.data;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.shop.fragment.CoreRowUI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsPageKt {
    public static final ProductCard a(ProductDetailsPage productDetailsPage) {
        List list;
        if (productDetailsPage == null || (list = productDetailsPage.f12608a) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ProductDetailsProductPanel) {
                arrayList.add(obj);
            }
        }
        ProductDetailsProductPanel productDetailsProductPanel = (ProductDetailsProductPanel) CollectionsKt.F(arrayList);
        if (productDetailsProductPanel != null) {
            return productDetailsProductPanel.b;
        }
        return null;
    }

    public static final IconAsset b(CoreRowUI.LeadingAsset leadingAsset) {
        Intrinsics.h(leadingAsset, "<this>");
        CoreRowUI.OnHostedIcon onHostedIcon = leadingAsset.b;
        if (onHostedIcon != null) {
            if (onHostedIcon != null) {
                return new IconAsset.HostedIcon(onHostedIcon.f10048a);
            }
            return null;
        }
        CoreRowUI.OnCoreIcon onCoreIcon = leadingAsset.c;
        if (onCoreIcon == null || onCoreIcon == null) {
            return null;
        }
        return new IconAsset.CoreIcon(onCoreIcon.f10046a);
    }

    public static final IconAsset c(CoreRowUI.TrailingAsset trailingAsset) {
        Intrinsics.h(trailingAsset, "<this>");
        CoreRowUI.OnHostedIcon1 onHostedIcon1 = trailingAsset.b;
        if (onHostedIcon1 != null) {
            if (onHostedIcon1 != null) {
                return new IconAsset.HostedIcon(onHostedIcon1.f10049a);
            }
            return null;
        }
        CoreRowUI.OnCoreIcon1 onCoreIcon1 = trailingAsset.c;
        if (onCoreIcon1 == null || onCoreIcon1 == null) {
            return null;
        }
        return new IconAsset.CoreIcon(onCoreIcon1.f10047a);
    }
}
