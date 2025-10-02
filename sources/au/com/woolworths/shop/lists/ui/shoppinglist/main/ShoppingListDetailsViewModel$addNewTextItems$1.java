package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import au.com.woolworths.android.onesite.models.text.PluralResText;
import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import com.woolworths.R;
import java.util.List;
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
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$addNewTextItems$1", f = "ShoppingListDetailsViewModel.kt", l = {804}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListDetailsViewModel$addNewTextItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListDetailsViewModel q;
    public final /* synthetic */ List r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsViewModel$addNewTextItems$1(ShoppingListDetailsViewModel shoppingListDetailsViewModel, List list, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListDetailsViewModel;
        this.r = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListDetailsViewModel$addNewTextItems$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListDetailsViewModel$addNewTextItems$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objC;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        ShoppingListDetailsViewModel shoppingListDetailsViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ShoppingListItemInteractor shoppingListItemInteractor = shoppingListDetailsViewModel.g;
                String strX6 = shoppingListDetailsViewModel.x6();
                List list = this.r;
                this.p = 1;
                objC = shoppingListItemInteractor.c(strX6, list, this);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objC = obj;
            }
            List list2 = (List) objC;
            ShoppingListDetailsViewModel.y6(shoppingListDetailsViewModel, shoppingListDetailsViewModel.w, null, null, null, false, false, false, null, null, null, null, null, list2, 2047);
            if (!list2.isEmpty()) {
                shoppingListDetailsViewModel.x.f(new ShoppingListDetailsContract.Actions.ShowSnackbar(new PluralResText(R.plurals.shop_lists_snap_message_items_added, list2.size())));
            }
            ShoppingListDetailsViewModel.t6(shoppingListDetailsViewModel);
        } catch (IllegalArgumentException unused) {
            ShoppingListDetailsViewModel.s6(shoppingListDetailsViewModel);
        }
        return Unit.f24250a;
    }
}
