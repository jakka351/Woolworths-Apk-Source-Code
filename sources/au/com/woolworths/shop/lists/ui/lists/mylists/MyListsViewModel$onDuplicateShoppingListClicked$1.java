package au.com.woolworths.shop.lists.ui.lists.mylists;

import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.ui.lists.analytics.ListsActions;
import au.com.woolworths.shop.lists.ui.lists.mylists.MyListsContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel$onDuplicateShoppingListClicked$1", f = "MyListsViewModel.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MyListsViewModel$onDuplicateShoppingListClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MyListsViewModel q;
    public final /* synthetic */ ShoppingList r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListsViewModel$onDuplicateShoppingListClicked$1(MyListsViewModel myListsViewModel, ShoppingList shoppingList, Continuation continuation) {
        super(2, continuation);
        this.q = myListsViewModel;
        this.r = shoppingList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyListsViewModel$onDuplicateShoppingListClicked$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyListsViewModel$onDuplicateShoppingListClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        MyListsViewModel myListsViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            ShoppingListInteractor shoppingListInteractor = myListsViewModel.f;
            this.p = 1;
            obj = shoppingListInteractor.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            myListsViewModel.j.c(new ListsActions.DuplicateListClick(myListsViewModel.k.a()));
            myListsViewModel.o.f(new MyListsContract.Actions.LaunchDuplicateShoppingListActivity(this.r));
        } else {
            MyListsViewModel.p6(myListsViewModel);
        }
        return Unit.f24250a;
    }
}
