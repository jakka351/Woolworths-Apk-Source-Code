package au.com.woolworths.shop.addtolist.add;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetActions;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetContract;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
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
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$onCreateShoppingListClicked$1", f = "AddToListBottomSheetViewModel.kt", l = {255}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AddToListBottomSheetViewModel$onCreateShoppingListClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AddToListBottomSheetViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToListBottomSheetViewModel$onCreateShoppingListClicked$1(AddToListBottomSheetViewModel addToListBottomSheetViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = addToListBottomSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddToListBottomSheetViewModel$onCreateShoppingListClicked$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddToListBottomSheetViewModel$onCreateShoppingListClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AddToListBottomSheetViewModel addToListBottomSheetViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = addToListBottomSheetViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ShoppingListInteractor shoppingListInteractor = addToListBottomSheetViewModel.e;
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
            if (addToListBottomSheetViewModel.r.size() > 1) {
                addToListBottomSheetViewModel.h.j(new AddToListBottomSheetActions.NewList(addToListBottomSheetViewModel.v6()), TrackingMetadata.Companion.a(TrackableValue.R1, new Integer(addToListBottomSheetViewModel.r.size())));
            } else {
                addToListBottomSheetViewModel.D6(new AddToListBottomSheetActions.NewList(addToListBottomSheetViewModel.v6()));
            }
            sharedFlowImpl.f(AddToListBottomSheetContract.Actions.LaunchCreateShoppingListActivity.f10108a);
        } else {
            sharedFlowImpl.f(new AddToListBottomSheetContract.Actions.ShowSnackbar(new ResWithArgText(R.string.shop_lists_max_list_count_reached, new Integer(50))));
        }
        return Unit.f24250a;
    }
}
