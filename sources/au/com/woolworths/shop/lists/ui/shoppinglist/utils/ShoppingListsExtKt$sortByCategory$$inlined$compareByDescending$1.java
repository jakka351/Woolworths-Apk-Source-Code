package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListsExtKt$sortByCategory$$inlined$compareByDescending$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(ShoppingListsExtKt.a((ProductItemUiModel) obj2, 1), ShoppingListsExtKt.a((ProductItemUiModel) obj, 1));
    }
}
