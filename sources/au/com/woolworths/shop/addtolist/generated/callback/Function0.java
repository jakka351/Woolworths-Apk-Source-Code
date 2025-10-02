package au.com.woolworths.shop.addtolist.generated.callback;

import au.com.woolworths.shop.addtolist.databinding.ActivityCreateUpdateShoppingListBindingImpl;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListViewModel;

/* loaded from: classes4.dex */
public final class Function0 implements kotlin.jvm.functions.Function0 {
    public final ActivityCreateUpdateShoppingListBindingImpl d;

    public interface Listener {
    }

    public Function0(ActivityCreateUpdateShoppingListBindingImpl activityCreateUpdateShoppingListBindingImpl) {
        this.d = activityCreateUpdateShoppingListBindingImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CreateUpdateShoppingListViewModel createUpdateShoppingListViewModel = this.d.G;
        if (createUpdateShoppingListViewModel == null) {
            return null;
        }
        createUpdateShoppingListViewModel.r6();
        return null;
    }
}
