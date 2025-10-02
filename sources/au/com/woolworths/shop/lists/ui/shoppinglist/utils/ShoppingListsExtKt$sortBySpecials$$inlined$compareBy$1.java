package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListsExtKt$sortBySpecials$$inlined$compareBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ProductCard productCard = ((ProductItemUiModel) obj).i;
        String multiBuyPrice = productCard != null ? productCard.getMultiBuyPrice() : null;
        if (multiBuyPrice == null) {
            multiBuyPrice = "";
        }
        ProductCard productCard2 = ((ProductItemUiModel) obj2).i;
        String multiBuyPrice2 = productCard2 != null ? productCard2.getMultiBuyPrice() : null;
        return ComparisonsKt.a(multiBuyPrice, multiBuyPrice2 != null ? multiBuyPrice2 : "");
    }
}
