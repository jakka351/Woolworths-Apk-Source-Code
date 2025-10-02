package au.com.woolworths.shop.lists.ui.lists.compose;

import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((MyListsViewModel) this.e).q6(((ShoppingListWithItems) this.f).getShoppingList());
                break;
            default:
                ((Function1) this.e).invoke((SuggestedListItem) this.f);
                break;
        }
        return Unit.f24250a;
    }
}
