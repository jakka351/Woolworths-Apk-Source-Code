package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import android.view.View;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel;
import com.dynatrace.android.callback.Callback;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ShoppingListDetailsActivity shoppingListDetailsActivity = (ShoppingListDetailsActivity) obj2;
                Function0 function0 = (Function0) obj;
                int i2 = ShoppingListDetailsActivity.R;
                Callback.g(view);
                try {
                    BuildersKt.c(shoppingListDetailsActivity.R4().D1(), null, null, new ShoppingListDetailsActivity$showSnackbar$2$1$1$1(function0, null), 3);
                    return;
                } finally {
                }
            case 1:
                ShoppingListDetailsActivity shoppingListDetailsActivity2 = (ShoppingListDetailsActivity) obj2;
                ShoppingListItemUiModel shoppingListItemUiModel = (ShoppingListItemUiModel) obj;
                int i3 = ShoppingListDetailsActivity.R;
                Callback.g(view);
                try {
                    shoppingListDetailsActivity2.R4().e0(shoppingListItemUiModel);
                    return;
                } finally {
                }
            default:
                ShoppingListDetailsListController.m48xb7db664b((ShoppingListDetailsListController) obj2, (ProductItemUiModel) obj, view);
                return;
        }
    }
}
