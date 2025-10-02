package au.com.woolworths.shop.lists.ui.lists.menu;

import androidx.activity.result.ActivityResultCaller;
import androidx.core.view.KeyEventDispatcher;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetContract;
import au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class ListsBottomSheetFragment$setContent$1$1$1$1 extends FunctionReferenceImpl implements Function1<ListAction, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ListsBottomSheetFragment.ListMenuDialogListener listMenuDialogListener;
        ListAction p0 = (ListAction) obj;
        Intrinsics.h(p0, "p0");
        ListsBottomSheetFragment listsBottomSheetFragment = (ListsBottomSheetFragment) this.receiver;
        listsBottomSheetFragment.getClass();
        listsBottomSheetFragment.dismiss();
        ActivityResultCaller parentFragment = listsBottomSheetFragment.getParentFragment();
        if (parentFragment != null) {
            listMenuDialogListener = (ListsBottomSheetFragment.ListMenuDialogListener) parentFragment;
        } else {
            KeyEventDispatcher.Component activity = listsBottomSheetFragment.getActivity();
            if (activity == null) {
                throw new IllegalStateException("Listener must not be null");
            }
            listMenuDialogListener = (ListsBottomSheetFragment.ListMenuDialogListener) activity;
        }
        Object value = ((ListsBottomSheetViewModel) listsBottomSheetFragment.i.getD()).i.getValue();
        Intrinsics.e(value);
        ShoppingListWithItems shoppingListWithItems = ((ListsBottomSheetContract.ViewState) value).b;
        Intrinsics.e(shoppingListWithItems);
        listMenuDialogListener.O1(shoppingListWithItems.getShoppingList(), p0);
        return Unit.f24250a;
    }
}
