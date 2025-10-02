package au.com.woolworths.shop.lists.generated.callback;

import android.view.View;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.shop.lists.databinding.ActivityShoppingListBindingImpl;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;

/* loaded from: classes4.dex */
public final class StatefulButtonClickHandler implements au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler {
    public final ActivityShoppingListBindingImpl d;

    public interface Listener {
    }

    public StatefulButtonClickHandler(ActivityShoppingListBindingImpl activityShoppingListBindingImpl) {
        this.d = activityShoppingListBindingImpl;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler
    public final void T2(View view, StatefulButtonState statefulButtonState) {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.d.R;
        if (iShoppingListDetailsViewModel != null) {
            iShoppingListDetailsViewModel.G1();
        }
    }
}
