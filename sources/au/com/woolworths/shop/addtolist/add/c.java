package au.com.woolworths.shop.addtolist.add;

import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetContract;
import au.com.woolworths.shop.addtolist.databinding.FragmentAddToListBottomSheetBinding;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ AddToListBottomSheetFragment d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        AddToListBottomSheetContract.ViewState viewState = (AddToListBottomSheetContract.ViewState) obj;
        AddToListBottomSheetFragment addToListBottomSheetFragment = this.d;
        AddToListBottomSheetEpoxyController addToListBottomSheetEpoxyController = addToListBottomSheetFragment.k;
        if (addToListBottomSheetEpoxyController == null) {
            Intrinsics.p("epoxyController");
            throw null;
        }
        List list = viewState.b;
        String str = viewState.g;
        addToListBottomSheetEpoxyController.setData(list, str);
        Iterator it = viewState.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((ShoppingList) next).getId(), str)) {
                break;
            }
        }
        ShoppingList shoppingList = (ShoppingList) next;
        FragmentAddToListBottomSheetBinding fragmentAddToListBottomSheetBinding = addToListBottomSheetFragment.j;
        if (fragmentAddToListBottomSheetBinding != null) {
            fragmentAddToListBottomSheetBinding.K.setVisibility(shoppingList != null ? 0 : 8);
            return Unit.f24250a;
        }
        Intrinsics.p("fragmentBinding");
        throw null;
    }
}
