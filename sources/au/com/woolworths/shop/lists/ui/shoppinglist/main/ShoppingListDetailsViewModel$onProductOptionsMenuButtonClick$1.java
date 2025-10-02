package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import android.view.View;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
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
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$onProductOptionsMenuButtonClick$1", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListDetailsViewModel$onProductOptionsMenuButtonClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ShoppingListDetailsViewModel p;
    public final /* synthetic */ ProductItemUiModel q;
    public final /* synthetic */ View r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsViewModel$onProductOptionsMenuButtonClick$1(ShoppingListDetailsViewModel shoppingListDetailsViewModel, ProductItemUiModel productItemUiModel, View view, Continuation continuation) {
        super(2, continuation);
        this.p = shoppingListDetailsViewModel;
        this.q = productItemUiModel;
        this.r = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListDetailsViewModel$onProductOptionsMenuButtonClick$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ShoppingListDetailsViewModel$onProductOptionsMenuButtonClick$1 shoppingListDetailsViewModel$onProductOptionsMenuButtonClick$1 = (ShoppingListDetailsViewModel$onProductOptionsMenuButtonClick$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        shoppingListDetailsViewModel$onProductOptionsMenuButtonClick$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.p.x.f(new ShoppingListDetailsContract.Actions.ShowProductItemOptionsMenu(this.r, this.q));
        return Unit.f24250a;
    }
}
