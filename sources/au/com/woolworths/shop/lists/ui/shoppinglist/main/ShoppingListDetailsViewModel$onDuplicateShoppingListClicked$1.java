package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$onDuplicateShoppingListClicked$1", f = "ShoppingListDetailsViewModel.kt", l = {665}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListDetailsViewModel$onDuplicateShoppingListClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListDetailsViewModel q;
    public final /* synthetic */ ShoppingList r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsViewModel$onDuplicateShoppingListClicked$1(ShoppingListDetailsViewModel shoppingListDetailsViewModel, ShoppingList shoppingList, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListDetailsViewModel;
        this.r = shoppingList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListDetailsViewModel$onDuplicateShoppingListClicked$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListDetailsViewModel$onDuplicateShoppingListClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ShoppingListDetailsViewModel shoppingListDetailsViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = shoppingListDetailsViewModel.x;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ShoppingListInteractor shoppingListInteractor = shoppingListDetailsViewModel.f;
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
            sharedFlowImpl.f(new ShoppingListDetailsContract.Actions.LaunchDuplicateShoppingListActivity(this.r));
        } else {
            sharedFlowImpl.f(new ShoppingListDetailsContract.Actions.ShowMaxListCountReachedErrorDialog(new ResText(R.string.shop_lists_max_list_count_reached_error_title), new ResWithArgText(R.string.shop_lists_max_list_count_reached, 50)));
        }
        return Unit.f24250a;
    }
}
