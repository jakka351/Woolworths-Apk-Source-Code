package au.com.woolworths.shop.addtolist.edit;

import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListContract;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListViewModel$fetchList$1", f = "CreateUpdateShoppingListViewModel.kt", l = {107}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CreateUpdateShoppingListViewModel$fetchList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CreateUpdateShoppingListViewModel q;
    public final /* synthetic */ String r;
    public final /* synthetic */ CreateUpdateShoppingListContract.ActivityMode s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateUpdateShoppingListViewModel$fetchList$1(CreateUpdateShoppingListViewModel createUpdateShoppingListViewModel, String str, CreateUpdateShoppingListContract.ActivityMode activityMode, Continuation continuation) {
        super(2, continuation);
        this.q = createUpdateShoppingListViewModel;
        this.r = str;
        this.s = activityMode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreateUpdateShoppingListViewModel$fetchList$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CreateUpdateShoppingListViewModel$fetchList$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        CreateUpdateShoppingListViewModel createUpdateShoppingListViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            ShoppingListInteractor shoppingListInteractor = createUpdateShoppingListViewModel.e;
            this.p = 1;
            obj = shoppingListInteractor.d(this.r, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ShoppingList shoppingListCopy$default = (ShoppingList) obj;
        Unit unit = Unit.f24250a;
        if (shoppingListCopy$default == null) {
            createUpdateShoppingListViewModel.i.f(new CreateUpdateShoppingListContract.Actions.ShowSnackbar(new ResText(R.string.shop_lists_list_not_found)));
            createUpdateShoppingListViewModel.i.f(new CreateUpdateShoppingListContract.Actions.FinishActivity(false, null, null));
            return unit;
        }
        CreateUpdateShoppingListContract.ActivityMode activityMode = CreateUpdateShoppingListContract.ActivityMode.e;
        CreateUpdateShoppingListContract.ActivityMode activityMode2 = this.s;
        if (activityMode2 == activityMode) {
            shoppingListCopy$default = ShoppingList.copy$default(shoppingListCopy$default, null, "", 0, 0L, null, null, 61, null);
        }
        CreateUpdateShoppingListViewModel.s6(createUpdateShoppingListViewModel.j, activityMode2, shoppingListCopy$default, false);
        return unit;
    }
}
