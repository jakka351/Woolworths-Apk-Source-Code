package au.com.woolworths.shop.lists.ui.lists.menu;

import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetViewModel$fetchShoppingListWithItems$1", f = "ListsBottomSheetViewModel.kt", l = {42, 48}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ListsBottomSheetViewModel$fetchShoppingListWithItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ShoppingListWithItems p;
    public ShoppingListWithItems q;
    public ListsBottomSheetViewModel r;
    public Object s;
    public boolean t;
    public int u;
    public final /* synthetic */ ListsBottomSheetViewModel v;
    public final /* synthetic */ String w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListsBottomSheetViewModel$fetchShoppingListWithItems$1(ListsBottomSheetViewModel listsBottomSheetViewModel, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = listsBottomSheetViewModel;
        this.w = str;
        this.x = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ListsBottomSheetViewModel$fetchShoppingListWithItems$1(this.v, this.w, this.x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ListsBottomSheetViewModel$fetchShoppingListWithItems$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableStateFlow mutableStateFlow;
        boolean z;
        ShoppingListWithItems shoppingListWithItems;
        ShoppingListWithItems shoppingListWithItems2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.u;
        ListsBottomSheetViewModel listsBottomSheetViewModel = this.v;
        if (i == 0) {
            ResultKt.b(obj);
            ShoppingListInteractor shoppingListInteractor = listsBottomSheetViewModel.e;
            this.u = 1;
            obj = shoppingListInteractor.e(this.w, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.t;
            mutableStateFlow = (MutableStateFlow) this.s;
            listsBottomSheetViewModel = this.r;
            shoppingListWithItems2 = this.q;
            shoppingListWithItems = this.p;
            ResultKt.b(obj);
            mutableStateFlow.setValue(new ListsBottomSheetContract.ViewState(listsBottomSheetViewModel.q6(shoppingListWithItems2, z, ((Boolean) obj).booleanValue()), shoppingListWithItems));
            return Unit.f24250a;
        }
        ResultKt.b(obj);
        ShoppingListWithItems shoppingListWithItems3 = (ShoppingListWithItems) obj;
        mutableStateFlow = listsBottomSheetViewModel.h;
        this.p = shoppingListWithItems3;
        this.q = shoppingListWithItems3;
        this.r = listsBottomSheetViewModel;
        this.s = mutableStateFlow;
        boolean z2 = this.x;
        this.t = z2;
        this.u = 2;
        Object objP6 = ListsBottomSheetViewModel.p6(listsBottomSheetViewModel, this);
        if (objP6 != coroutineSingletons) {
            z = z2;
            shoppingListWithItems = shoppingListWithItems3;
            obj = objP6;
            shoppingListWithItems2 = shoppingListWithItems;
            mutableStateFlow.setValue(new ListsBottomSheetContract.ViewState(listsBottomSheetViewModel.q6(shoppingListWithItems2, z, ((Boolean) obj).booleanValue()), shoppingListWithItems));
            return Unit.f24250a;
        }
        return coroutineSingletons;
    }
}
