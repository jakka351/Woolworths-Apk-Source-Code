package au.com.woolworths.shop.lists.ui.magicmatch;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract;
import au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchInteractor;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchViewModel;", "Landroidx/lifecycle/ViewModel;", "Factory", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MagicMatchViewModel extends ViewModel {
    public final String e;
    public final MagicMatchInteractor f;
    public final ShoppingListInteractor g;
    public final MutableStateFlow h;
    public final SharedFlowImpl i;
    public final Flow j;

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchViewModel$Factory;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        MagicMatchViewModel a(String str);
    }

    public MagicMatchViewModel(String listId, MagicMatchInteractor interactor, ShoppingListInteractor shoppingListInteractor) {
        Intrinsics.h(listId, "listId");
        Intrinsics.h(interactor, "interactor");
        Intrinsics.h(shoppingListInteractor, "shoppingListInteractor");
        this.e = listId;
        this.f = interactor;
        this.g = shoppingListInteractor;
        this.h = StateFlowKt.a(new MagicMatchContract.ViewState(false));
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = FlowKt.a(sharedFlowImplB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable p6(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel$getSearchedProducts$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel$getSearchedProducts$1 r0 = (au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel$getSearchedProducts$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel$getSearchedProducts$1 r0 = new au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel$getSearchedProducts$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            java.lang.String r3 = r5.e
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.shop.lists.data.ShoppingListInteractor r6 = r5.g
            au.com.woolworths.shop.lists.data.ShoppingListInteractor$shoppingListWithItems$$inlined$map$1 r6 = r6.f(r3)
            r0.r = r4
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.y(r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            au.com.woolworths.shop.lists.data.model.ShoppingListWithItems r6 = (au.com.woolworths.shop.lists.data.model.ShoppingListWithItems) r6
            if (r6 == 0) goto L4c
            java.util.List r6 = r6.getTextItems()
            goto L4d
        L4c:
            r6 = 0
        L4d:
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L87
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L87
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.s(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L69:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L86
            java.lang.Object r1 = r6.next()
            au.com.woolworths.shop.lists.data.model.TextListItem r1 = (au.com.woolworths.shop.lists.data.model.TextListItem) r1
            au.com.woolworths.shop.graphql.type.SearchedProductInput r2 = new au.com.woolworths.shop.graphql.type.SearchedProductInput
            java.lang.String r3 = r1.getId()
            java.lang.String r1 = r1.getText()
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L69
        L86:
            return r0
        L87:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "No text items found in list with id: "
            java.lang.String r0 = YU.a.A(r0, r3)
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel.p6(kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
