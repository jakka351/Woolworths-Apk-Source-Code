package au.com.woolworths.shop.lists.ui.lists.compose;

import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.ui.lists.analytics.ListsActions;
import au.com.woolworths.shop.lists.ui.lists.mylists.MyListsContract;
import au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MyListsViewModel e;
    public final /* synthetic */ List f;
    public final /* synthetic */ int g;

    public /* synthetic */ d(MyListsViewModel myListsViewModel, List list, int i, int i2) {
        this.d = i2;
        this.e = myListsViewModel;
        this.f = list;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.q6(((ShoppingListWithItems) this.f.get(this.g)).getShoppingList());
                break;
            default:
                ShoppingList list = ((ShoppingListWithItems) this.f.get(this.g)).getShoppingList();
                MyListsViewModel myListsViewModel = this.e;
                myListsViewModel.getClass();
                Intrinsics.h(list, "list");
                myListsViewModel.j.c(new ListsActions.BottomSheetImpression(myListsViewModel.k.a()));
                myListsViewModel.o.f(new MyListsContract.Actions.ShowListMenuDialog(list));
                break;
        }
        return Unit.f24250a;
    }
}
