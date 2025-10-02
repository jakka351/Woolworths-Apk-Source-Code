package au.com.woolworths.shop.cart.ui.cart;

import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/foundation/shop/cart/data/model/CartProductQuantitiesUpdatedResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.cart.CartViewModel$startListeningPendingUpdates$2", f = "CartViewModel.kt", l = {563}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CartViewModel$startListeningPendingUpdates$2 extends SuspendLambda implements Function2<CartProductQuantitiesUpdatedResponse, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CartViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartViewModel$startListeningPendingUpdates$2(CartViewModel cartViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = cartViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CartViewModel$startListeningPendingUpdates$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CartViewModel$startListeningPendingUpdates$2) create((CartProductQuantitiesUpdatedResponse) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            au.com.woolworths.android.onesite.deeplink.h hVar = new au.com.woolworths.android.onesite.deeplink.h(20);
            this.p = 1;
            if (CartViewModel.p6(this.q, hVar, this) == coroutineSingletons) {
                return coroutineSingletons;
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
