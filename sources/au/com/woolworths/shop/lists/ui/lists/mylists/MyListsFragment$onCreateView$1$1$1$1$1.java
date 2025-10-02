package au.com.woolworths.shop.lists.ui.lists.mylists;

import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class MyListsFragment$onCreateView$1$1$1$1$1 extends FunctionReferenceImpl implements Function1<List<? extends ShoppingListWithItems>, List<? extends ShoppingListWithItems>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List p0 = (List) obj;
        Intrinsics.h(p0, "p0");
        ((ListsUtils) this.receiver).getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : p0) {
            if (!Intrinsics.c(((ShoppingListWithItems) obj2).getShoppingList().isWatchlist(), Boolean.TRUE)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
