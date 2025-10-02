package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListsExtKt$sortBySpecials$$inlined$thenByDescending$1<T> implements Comparator {
    public final /* synthetic */ ShoppingListsExtKt$sortBySpecials$$inlined$compareByDescending$1 d;

    public ShoppingListsExtKt$sortBySpecials$$inlined$thenByDescending$1(ShoppingListsExtKt$sortBySpecials$$inlined$compareByDescending$1 shoppingListsExtKt$sortBySpecials$$inlined$compareByDescending$1) {
        this.d = shoppingListsExtKt$sortBySpecials$$inlined$compareByDescending$1;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        PromotionInfo promotionInfo;
        PromotionInfo promotionInfo2;
        int iCompare = this.d.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        ProductCard productCard = ((ProductItemUiModel) obj2).i;
        String label = null;
        String label2 = (productCard == null || (promotionInfo2 = productCard.getPromotionInfo()) == null) ? null : promotionInfo2.getLabel();
        if (label2 == null) {
            label2 = "";
        }
        ProductCard productCard2 = ((ProductItemUiModel) obj).i;
        if (productCard2 != null && (promotionInfo = productCard2.getPromotionInfo()) != null) {
            label = promotionInfo.getLabel();
        }
        return ComparisonsKt.a(label2, label != null ? label : "");
    }
}
