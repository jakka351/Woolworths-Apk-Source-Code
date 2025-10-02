package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import au.com.woolworths.android.onesite.utils.NumberAwareComparator;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/utils/LocationTextComparator;", "Ljava/util/Comparator;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ProductItemUiModel;", "Lkotlin/Comparator;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class LocationTextComparator implements Comparator<ProductItemUiModel> {
    public final NumberAwareComparator d = new NumberAwareComparator();

    @Override // java.util.Comparator
    public final int compare(ProductItemUiModel productItemUiModel, ProductItemUiModel productItemUiModel2) {
        ProductCard productCard;
        ProductCard productCard2;
        ProductItemUiModel productItemUiModel3 = productItemUiModel;
        ProductItemUiModel productItemUiModel4 = productItemUiModel2;
        String instoreLocationText = null;
        String instoreLocationText2 = (productItemUiModel3 == null || (productCard2 = productItemUiModel3.i) == null) ? null : ProductCardKt.getInstoreLocationText(productCard2);
        if (instoreLocationText2 == null) {
            instoreLocationText2 = "";
        }
        if (productItemUiModel4 != null && (productCard = productItemUiModel4.i) != null) {
            instoreLocationText = ProductCardKt.getInstoreLocationText(productCard);
        }
        return this.d.compare(instoreLocationText2, instoreLocationText != null ? instoreLocationText : "");
    }
}
