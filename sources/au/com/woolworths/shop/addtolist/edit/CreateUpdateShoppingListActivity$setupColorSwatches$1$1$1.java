package au.com.woolworths.shop.addtolist.edit;

import au.com.woolworths.shop.lists.data.model.ShoppingList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class CreateUpdateShoppingListActivity$setupColorSwatches$1$1$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        CreateUpdateShoppingListViewModel createUpdateShoppingListViewModel = (CreateUpdateShoppingListViewModel) this.receiver;
        createUpdateShoppingListViewModel.h.c(createUpdateShoppingListViewModel.m.a(createUpdateShoppingListViewModel.p6()).b());
        CreateUpdateShoppingListViewModel.t6(createUpdateShoppingListViewModel, createUpdateShoppingListViewModel.j, null, ShoppingList.copy$default(createUpdateShoppingListViewModel.q6(), null, null, iIntValue, 0L, null, null, 59, null), false, 5);
        return Unit.f24250a;
    }
}
