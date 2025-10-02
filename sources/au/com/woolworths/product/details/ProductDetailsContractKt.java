package au.com.woolworths.product.details;

import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.product.details.ProductDetailsContract;
import au.com.woolworths.product.details.models.Footer;
import au.com.woolworths.product.details.models.ProductDetailsMarketplace;
import au.com.woolworths.product.models.ProductCard;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsContractKt {
    public static final Footer a(ProductDetailsContract.ViewState viewState) {
        Footer footer;
        List<ButtonApiData> buttons;
        List list;
        if (viewState == null || (list = viewState.f9310a) == null) {
            footer = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof Footer) {
                    arrayList.add(obj);
                }
            }
            footer = (Footer) CollectionsKt.F(arrayList);
        }
        if (footer == null || (buttons = footer.getButtons()) == null || !buttons.isEmpty()) {
            return footer;
        }
        return null;
    }

    public static final ProductDetailsMarketplace b(ProductDetailsContract.ViewState viewState) {
        List list;
        if (viewState == null || (list = viewState.f9310a) == null) {
            return null;
        }
        return (ProductDetailsMarketplace) CollectionsKt.F(CollectionsKt.A(list, ProductDetailsMarketplace.class));
    }

    public static final ProductCard c(ProductDetailsContract.ViewState viewState) {
        List list;
        if (viewState == null || (list = viewState.f9310a) == null) {
            return null;
        }
        return (ProductCard) CollectionsKt.F(CollectionsKt.A(list, ProductCard.class));
    }
}
