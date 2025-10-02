package au.com.woolworths.shop.addtolist.add;

import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetActions;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetContract;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.data.model.ProductListItem;
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
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$onRemoveClicked$1$1", f = "AddToListBottomSheetViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AddToListBottomSheetViewModel$onRemoveClicked$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ AddToListBottomSheetViewModel p;
    public final /* synthetic */ ProductListItem q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToListBottomSheetViewModel$onRemoveClicked$1$1(AddToListBottomSheetViewModel addToListBottomSheetViewModel, ProductListItem productListItem, Continuation continuation) {
        super(2, continuation);
        this.p = addToListBottomSheetViewModel;
        this.q = productListItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddToListBottomSheetViewModel$onRemoveClicked$1$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AddToListBottomSheetViewModel$onRemoveClicked$1$1 addToListBottomSheetViewModel$onRemoveClicked$1$1 = (AddToListBottomSheetViewModel$onRemoveClicked$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        addToListBottomSheetViewModel$onRemoveClicked$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        AddToListBottomSheetViewModel addToListBottomSheetViewModel = this.p;
        ShoppingListItemInteractor shoppingListItemInteractor = addToListBottomSheetViewModel.f;
        ProductListItem productListItem = this.q;
        shoppingListItemInteractor.d(productListItem.getListId(), productListItem.getProductId());
        addToListBottomSheetViewModel.h.c(new AddToListBottomSheetActions.RemoveFromList(addToListBottomSheetViewModel.v6()));
        addToListBottomSheetViewModel.j.f(new AddToListBottomSheetContract.Actions.RemoveListItemSuccess(new ListChangeEvent.RemoveFromListSuccessEvent(productListItem)));
        return Unit.f24250a;
    }
}
