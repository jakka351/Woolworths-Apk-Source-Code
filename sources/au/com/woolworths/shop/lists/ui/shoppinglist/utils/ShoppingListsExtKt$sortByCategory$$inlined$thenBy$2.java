package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListsExtKt$sortByCategory$$inlined$thenBy$2<T> implements Comparator {
    public final /* synthetic */ ShoppingListsExtKt$sortByCategory$$inlined$thenBy$1 d;

    public ShoppingListsExtKt$sortByCategory$$inlined$thenBy$2(ShoppingListsExtKt$sortByCategory$$inlined$thenBy$1 shoppingListsExtKt$sortByCategory$$inlined$thenBy$1) {
        this.d = shoppingListsExtKt$sortByCategory$$inlined$thenBy$1;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.d.compare(obj, obj2);
        return iCompare != 0 ? iCompare : ComparisonsKt.a(ShoppingListsExtKt.a((ProductItemUiModel) obj, 2), ShoppingListsExtKt.a((ProductItemUiModel) obj2, 2));
    }
}
