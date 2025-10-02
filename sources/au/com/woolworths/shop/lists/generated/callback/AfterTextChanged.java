package au.com.woolworths.shop.lists.generated.callback;

import android.text.Editable;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListTextBindingImpl;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel;

/* loaded from: classes4.dex */
public final class AfterTextChanged implements TextViewBindingAdapter.AfterTextChanged {

    /* renamed from: a, reason: collision with root package name */
    public final EpoxyItemShoppingListTextBindingImpl f12295a;

    public interface Listener {
    }

    public AfterTextChanged(EpoxyItemShoppingListTextBindingImpl epoxyItemShoppingListTextBindingImpl) {
        this.f12295a = epoxyItemShoppingListTextBindingImpl;
    }

    @Override // androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged
    public final void afterTextChanged(Editable editable) {
        EpoxyItemShoppingListTextBindingImpl epoxyItemShoppingListTextBindingImpl = this.f12295a;
        ShoppingListItemListener shoppingListItemListener = epoxyItemShoppingListTextBindingImpl.F;
        TextItemUiModel textItemUiModel = epoxyItemShoppingListTextBindingImpl.C;
        if (shoppingListItemListener == null || editable == null) {
            return;
        }
        editable.toString();
        shoppingListItemListener.b(textItemUiModel, editable.toString());
    }
}
