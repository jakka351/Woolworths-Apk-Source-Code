package au.com.woolworths.shop.lists.generated.callback;

import android.view.View;
import au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListTextBindingImpl;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel;

/* loaded from: classes4.dex */
public final class OnFocusChangeListener implements View.OnFocusChangeListener {
    public final EpoxyItemShoppingListTextBindingImpl d;

    public interface Listener {
    }

    public OnFocusChangeListener(EpoxyItemShoppingListTextBindingImpl epoxyItemShoppingListTextBindingImpl) {
        this.d = epoxyItemShoppingListTextBindingImpl;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        EpoxyItemShoppingListTextBindingImpl epoxyItemShoppingListTextBindingImpl = this.d;
        ShoppingListItemListener shoppingListItemListener = epoxyItemShoppingListTextBindingImpl.F;
        TextItemUiModel textItemUiModel = epoxyItemShoppingListTextBindingImpl.C;
        if (shoppingListItemListener != null) {
            shoppingListItemListener.k(textItemUiModel, z);
        }
    }
}
