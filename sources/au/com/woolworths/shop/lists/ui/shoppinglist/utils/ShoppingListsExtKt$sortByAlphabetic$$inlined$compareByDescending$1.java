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
public final class ShoppingListsExtKt$sortByAlphabetic$$inlined$compareByDescending$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String name;
        String name2;
        ProductCard productCard = ((ProductItemUiModel) obj2).i;
        String str = "";
        if (productCard == null || (name = productCard.getName()) == null) {
            name = "";
        }
        ProductCard productCard2 = ((ProductItemUiModel) obj).i;
        if (productCard2 != null && (name2 = productCard2.getName()) != null) {
            str = name2;
        }
        return ComparisonsKt.a(name, str);
    }
}
