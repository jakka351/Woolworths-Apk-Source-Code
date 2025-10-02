package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListsExtKt$sortByAisle$$inlined$thenBy$3<T> implements Comparator {
    public final /* synthetic */ Comparator d;

    public ShoppingListsExtKt$sortByAisle$$inlined$thenBy$3(Comparator comparator) {
        this.d = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.d.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        ProductItemUiModel productItemUiModel = (ProductItemUiModel) obj;
        Intrinsics.e(productItemUiModel);
        boolean z = false;
        Boolean boolValueOf = Boolean.valueOf(ShoppingListsExtKt.b(productItemUiModel) && productItemUiModel.b());
        ProductItemUiModel productItemUiModel2 = (ProductItemUiModel) obj2;
        Intrinsics.e(productItemUiModel2);
        if (ShoppingListsExtKt.b(productItemUiModel2) && productItemUiModel2.b()) {
            z = true;
        }
        return ComparisonsKt.a(boolValueOf, Boolean.valueOf(z));
    }
}
