package au.com.woolworths.shop.lists.ui.shoppinglist.sort;

import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.data.prefs.SortBy;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewContract;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel$initialise$1", f = "SortByViewModel.kt", l = {107}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SortByViewModel$initialise$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SortByViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortByViewModel$initialise$1(SortByViewModel sortByViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = sortByViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SortByViewModel$initialise$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SortByViewModel$initialise$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final SortByViewModel sortByViewModel = this.q;
            Flow flowR = FlowKt.r(sortByViewModel.e.f(this.r));
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel$initialise$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    ShoppingListWithItems shoppingListWithItems = (ShoppingListWithItems) obj2;
                    SortByViewModel sortByViewModel2 = sortByViewModel;
                    ListsUtils listsUtils = sortByViewModel2.j;
                    if (shoppingListWithItems != null) {
                        sortByViewModel2.o = listsUtils.b(shoppingListWithItems.getShoppingList());
                        MutableStateFlow mutableStateFlow = sortByViewModel2.m;
                        String id = shoppingListWithItems.getShoppingList().getId();
                        int size = shoppingListWithItems.getProductItems().size();
                        int size2 = shoppingListWithItems.getTextItems().size();
                        SortByViewContract.ViewState viewState = (SortByViewContract.ViewState) mutableStateFlow.getValue();
                        SortBy sortByD = listsUtils.d();
                        viewState.getClass();
                        mutableStateFlow.f(new SortByViewContract.ViewState(id, size, size2, sortByD));
                        Object objP6 = SortByViewModel.p6(sortByViewModel2, continuation);
                        if (objP6 == CoroutineSingletons.d) {
                            return objP6;
                        }
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flowR.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
