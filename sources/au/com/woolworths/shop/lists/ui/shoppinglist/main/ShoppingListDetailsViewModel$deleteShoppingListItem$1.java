package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$deleteShoppingListItem$1", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListDetailsViewModel$deleteShoppingListItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ShoppingListItemUiModel p;
    public final /* synthetic */ ShoppingListDetailsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsViewModel$deleteShoppingListItem$1(ShoppingListItemUiModel shoppingListItemUiModel, ShoppingListDetailsViewModel shoppingListDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.p = shoppingListItemUiModel;
        this.q = shoppingListDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListDetailsViewModel$deleteShoppingListItem$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ShoppingListDetailsViewModel$deleteShoppingListItem$1 shoppingListDetailsViewModel$deleteShoppingListItem$1 = (ShoppingListDetailsViewModel$deleteShoppingListItem$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        shoppingListDetailsViewModel$deleteShoppingListItem$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        ShoppingListItemInteractor shoppingListItemInteractor = this.q.g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ShoppingListItemUiModel shoppingListItemUiModel = this.p;
        if (shoppingListItemUiModel instanceof ProductItemUiModel) {
            ProductItemUiModel productItemUiModel = (ProductItemUiModel) shoppingListItemUiModel;
            String listId = productItemUiModel.b;
            ProductId productId = productItemUiModel.g;
            shoppingListItemInteractor.getClass();
            Intrinsics.h(listId, "listId");
            Intrinsics.h(productId, "productId");
            ShoppingListItemsLocalRepositoryWithSoftDeletion shoppingListItemsLocalRepositoryWithSoftDeletion = shoppingListItemInteractor.b;
            shoppingListItemsLocalRepositoryWithSoftDeletion.getClass();
            MutableStateFlow mutableStateFlow = shoppingListItemsLocalRepositoryWithSoftDeletion.b;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, SetsKt.h((Set) value2, new Pair(listId, productId))));
        } else {
            if (!(shoppingListItemUiModel instanceof TextItemUiModel)) {
                throw new NoWhenBranchMatchedException();
            }
            String textItemId = ((TextItemUiModel) shoppingListItemUiModel).f12435a;
            shoppingListItemInteractor.getClass();
            Intrinsics.h(textItemId, "textItemId");
            ShoppingListItemsLocalRepositoryWithSoftDeletion shoppingListItemsLocalRepositoryWithSoftDeletion2 = shoppingListItemInteractor.b;
            shoppingListItemsLocalRepositoryWithSoftDeletion2.getClass();
            MutableStateFlow mutableStateFlow2 = shoppingListItemsLocalRepositoryWithSoftDeletion2.c;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.d(value, SetsKt.h((Set) value, textItemId)));
        }
        return Unit.f24250a;
    }
}
