package au.com.woolworths.shop.addtolist.add;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetContract;
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
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$onUpdateClicked$1$1", f = "AddToListBottomSheetViewModel.kt", l = {220}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AddToListBottomSheetViewModel$onUpdateClicked$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AddToListBottomSheetViewModel q;
    public final /* synthetic */ ProductListItem r;
    public final /* synthetic */ float s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToListBottomSheetViewModel$onUpdateClicked$1$1(AddToListBottomSheetViewModel addToListBottomSheetViewModel, ProductListItem productListItem, float f, Continuation continuation) {
        super(2, continuation);
        this.q = addToListBottomSheetViewModel;
        this.r = productListItem;
        this.s = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddToListBottomSheetViewModel$onUpdateClicked$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddToListBottomSheetViewModel$onUpdateClicked$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        ProductListItem productListItem = this.r;
        AddToListBottomSheetViewModel addToListBottomSheetViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            ShoppingListItemInteractor shoppingListItemInteractor = addToListBottomSheetViewModel.f;
            String listId = productListItem.getListId();
            ProductCard productCardW6 = addToListBottomSheetViewModel.w6();
            this.p = 1;
            if (shoppingListItemInteractor.a(listId, productCardW6, this.s, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        addToListBottomSheetViewModel.u6(new AddToListBottomSheetContract.Actions.UpdateListItemSuccess(productListItem));
        return Unit.f24250a;
    }
}
