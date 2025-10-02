package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListsExtKt$sortByCategory$$inlined$thenBy$1<T> implements Comparator {
    public final /* synthetic */ ShoppingListsExtKt$sortByCategory$$inlined$compareBy$1 d;

    public ShoppingListsExtKt$sortByCategory$$inlined$thenBy$1(ShoppingListsExtKt$sortByCategory$$inlined$compareBy$1 shoppingListsExtKt$sortByCategory$$inlined$compareBy$1) {
        this.d = shoppingListsExtKt$sortByCategory$$inlined$compareBy$1;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.d.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        ProductItemUiModel productItemUiModel = (ProductItemUiModel) obj;
        ProductItemUiModel productItemUiModel2 = (ProductItemUiModel) obj2;
        return ComparisonsKt.a(Boolean.valueOf(!ShoppingListsExtKt.a(productItemUiModel, 1).equals("Other") && productItemUiModel.b()), Boolean.valueOf(!ShoppingListsExtKt.a(productItemUiModel2, 1).equals("Other") && productItemUiModel2.b()));
    }
}
