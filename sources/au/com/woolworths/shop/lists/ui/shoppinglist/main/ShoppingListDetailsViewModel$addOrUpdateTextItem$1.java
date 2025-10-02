package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel;
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
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$addOrUpdateTextItem$1", f = "ShoppingListDetailsViewModel.kt", l = {881}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListDetailsViewModel$addOrUpdateTextItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListDetailsViewModel q;
    public final /* synthetic */ TextItemUiModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsViewModel$addOrUpdateTextItem$1(ShoppingListDetailsViewModel shoppingListDetailsViewModel, TextItemUiModel textItemUiModel, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListDetailsViewModel;
        this.r = textItemUiModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListDetailsViewModel$addOrUpdateTextItem$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListDetailsViewModel$addOrUpdateTextItem$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        ShoppingListDetailsViewModel shoppingListDetailsViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ShoppingListItemInteractor shoppingListItemInteractor = shoppingListDetailsViewModel.g;
                TextItemUiModel textItemUiModel = this.r;
                String str = textItemUiModel.f12435a;
                String str2 = textItemUiModel.b;
                String str3 = textItemUiModel.g;
                this.p = 1;
                if (shoppingListItemInteractor.b(str, str2, str3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (IllegalArgumentException unused) {
            ShoppingListDetailsViewModel.s6(shoppingListDetailsViewModel);
        }
        return Unit.f24250a;
    }
}
