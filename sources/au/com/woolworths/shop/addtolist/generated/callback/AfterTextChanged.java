package au.com.woolworths.shop.addtolist.generated.callback;

import android.text.Editable;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.shop.addtolist.databinding.ActivityCreateUpdateShoppingListBindingImpl;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListViewModel;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AfterTextChanged implements TextViewBindingAdapter.AfterTextChanged {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityCreateUpdateShoppingListBindingImpl f10128a;

    public interface Listener {
    }

    public AfterTextChanged(ActivityCreateUpdateShoppingListBindingImpl activityCreateUpdateShoppingListBindingImpl) {
        this.f10128a = activityCreateUpdateShoppingListBindingImpl;
    }

    @Override // androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged
    public final void afterTextChanged(Editable editable) {
        CreateUpdateShoppingListViewModel createUpdateShoppingListViewModel = this.f10128a.G;
        if (createUpdateShoppingListViewModel == null || editable == null) {
            return;
        }
        editable.toString();
        String title = editable.toString();
        Intrinsics.h(title, "title");
        CreateUpdateShoppingListViewModel.t6(createUpdateShoppingListViewModel, createUpdateShoppingListViewModel.j, null, ShoppingList.copy$default(createUpdateShoppingListViewModel.q6(), null, title, 0, 0L, null, null, 61, null), false, 5);
    }
}
