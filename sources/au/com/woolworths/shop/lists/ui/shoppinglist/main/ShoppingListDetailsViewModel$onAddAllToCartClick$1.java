package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListsExtKt;
import com.google.android.gms.wallet.WalletConstants;
import com.woolworths.R;
import java.util.ArrayList;
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
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$onAddAllToCartClick$1", f = "ShoppingListDetailsViewModel.kt", l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListDetailsViewModel$onAddAllToCartClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListDetailsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsViewModel$onAddAllToCartClick$1(ShoppingListDetailsViewModel shoppingListDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListDetailsViewModel$onAddAllToCartClick$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListDetailsViewModel$onAddAllToCartClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ShoppingListDetailsViewModel shoppingListDetailsViewModel = this.q;
            ShoppingListDetailsContract.ListState listState = ((ShoppingListDetailsContract.ViewState) shoppingListDetailsViewModel.y.getValue()).c;
            ArrayList arrayListC = listState != null ? ShoppingListsExtKt.c(listState.b) : null;
            if (arrayListC == null || arrayListC.isEmpty()) {
                shoppingListDetailsViewModel.x.f(new ShoppingListDetailsContract.Actions.ShowSnackbar(new ResText(R.string.shop_lists_add_all_to_cart_unavailable_message)));
            } else {
                this.p = 1;
                if (ShoppingListDetailsViewModel.q6(shoppingListDetailsViewModel, arrayListC, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
