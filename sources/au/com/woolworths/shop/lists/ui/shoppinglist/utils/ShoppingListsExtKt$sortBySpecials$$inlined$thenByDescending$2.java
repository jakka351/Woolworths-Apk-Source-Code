package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListsExtKt$sortBySpecials$$inlined$thenByDescending$2<T> implements Comparator {
    public final /* synthetic */ ShoppingListsExtKt$sortBySpecials$$inlined$thenByDescending$1 d;

    public ShoppingListsExtKt$sortBySpecials$$inlined$thenByDescending$2(ShoppingListsExtKt$sortBySpecials$$inlined$thenByDescending$1 shoppingListsExtKt$sortBySpecials$$inlined$thenByDescending$1) {
        this.d = shoppingListsExtKt$sortBySpecials$$inlined$thenByDescending$1;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MemberPriceInfo memberPriceInfo;
        MemberPriceInfo memberPriceInfo2;
        int iCompare = this.d.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        ProductCard productCard = ((ProductItemUiModel) obj2).i;
        String header = null;
        String header2 = (productCard == null || (memberPriceInfo2 = productCard.getMemberPriceInfo()) == null) ? null : memberPriceInfo2.getHeader();
        if (header2 == null) {
            header2 = "";
        }
        ProductCard productCard2 = ((ProductItemUiModel) obj).i;
        if (productCard2 != null && (memberPriceInfo = productCard2.getMemberPriceInfo()) != null) {
            header = memberPriceInfo.getHeader();
        }
        return ComparisonsKt.a(header2, header != null ? header : "");
    }
}
