package au.com.woolworths.shop.lists.ui.lists.menu;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetContract;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/menu/ListsBottomSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListsBottomSheetViewModel extends ViewModel {
    public final ShoppingListInteractor e;
    public final ListsInMemoryRepository f;
    public final ListsUtils g;
    public final MutableStateFlow h;
    public final StateFlow i;

    public ListsBottomSheetViewModel(ShoppingListInteractor shoppingListInteractor, ListsInMemoryRepository listsInMemoryRepository, ListsUtils listsUtils) {
        Intrinsics.h(shoppingListInteractor, "shoppingListInteractor");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        Intrinsics.h(listsUtils, "listsUtils");
        this.e = shoppingListInteractor;
        this.f = listsInMemoryRepository;
        this.g = listsUtils;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new ListsBottomSheetContract.ViewState(EmptyList.d));
        this.h = mutableStateFlowA;
        this.i = mutableStateFlowA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetViewModel r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetViewModel$isDeleteAllowed$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetViewModel$isDeleteAllowed$1 r0 = (au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetViewModel$isDeleteAllowed$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetViewModel$isDeleteAllowed$1 r0 = new au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetViewModel$isDeleteAllowed$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.shop.lists.data.ShoppingListInteractor r4 = r4.e
            r0.r = r3
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r4 = r4.f12257a
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r5.intValue()
            if (r4 <= r3) goto L48
            goto L49
        L48:
            r3 = 0
        L49:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetViewModel.p6(au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetViewModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList q6(au.com.woolworths.shop.lists.data.model.ShoppingListWithItems r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository r0 = r6.f
            boolean r0 = r0.e()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 1
            r3 = 0
            if (r8 == 0) goto L49
            if (r0 != 0) goto L49
            au.com.woolworths.shop.lists.ui.utils.MenuItem$AddAllToCart r0 = new au.com.woolworths.shop.lists.ui.utils.MenuItem$AddAllToCart
            if (r7 == 0) goto L2a
            java.util.List r4 = r7.getProductItems()
            if (r4 == 0) goto L2a
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L2c
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L2c
        L2a:
            r4 = r3
            goto L43
        L2c:
            java.util.Iterator r4 = r4.iterator()
        L30:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2a
            java.lang.Object r5 = r4.next()
            au.com.woolworths.shop.lists.data.model.ProductListItem r5 = (au.com.woolworths.shop.lists.data.model.ProductListItem) r5
            boolean r5 = r5.isChecked()
            if (r5 != 0) goto L30
            r4 = r2
        L43:
            r0.<init>(r4)
            r1.add(r0)
        L49:
            if (r7 == 0) goto L71
            au.com.woolworths.shop.lists.data.model.ShoppingList r0 = r7.getShoppingList()
            if (r0 == 0) goto L71
            au.com.woolworths.shop.lists.ui.utils.ListsUtils r4 = r6.g
            boolean r0 = r4.b(r0)
            if (r0 != 0) goto L71
            au.com.woolworths.shop.lists.ui.utils.MenuItem$Edit r0 = new au.com.woolworths.shop.lists.ui.utils.MenuItem$Edit
            r0.<init>()
            r1.add(r0)
            au.com.woolworths.shop.lists.ui.utils.MenuItem$Duplicate r0 = new au.com.woolworths.shop.lists.ui.utils.MenuItem$Duplicate
            r0.<init>()
            r1.add(r0)
            au.com.woolworths.shop.lists.ui.utils.MenuItem$Delete r0 = new au.com.woolworths.shop.lists.ui.utils.MenuItem$Delete
            r0.<init>(r9)
            r1.add(r0)
        L71:
            if (r8 == 0) goto L85
            au.com.woolworths.shop.lists.ui.utils.MenuItem$RemoveAll r8 = new au.com.woolworths.shop.lists.ui.utils.MenuItem$RemoveAll
            if (r7 == 0) goto L7e
            int r7 = r7.getItemCount()
            if (r7 <= 0) goto L7e
            goto L7f
        L7e:
            r2 = r3
        L7f:
            r8.<init>(r2)
            r1.add(r8)
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetViewModel.q6(au.com.woolworths.shop.lists.data.model.ShoppingListWithItems, boolean, boolean):java.util.ArrayList");
    }
}
