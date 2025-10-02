package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ShoppingListDetailsViewModel e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j(ShoppingListDetailsViewModel shoppingListDetailsViewModel, Object obj, int i) {
        this.d = i;
        this.e = shoppingListDetailsViewModel;
        this.f = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.x.f(new ShoppingListDetailsContract.Actions.LaunchEditList((String) this.f));
                break;
            default:
                this.e.s3((ShoppingListItemUiModel) this.f);
                break;
        }
        return Unit.f24250a;
    }
}
