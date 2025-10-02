package au.com.woolworths.shop.cart.domain.interactor;

import au.com.woolworths.foundation.shop.cart.data.model.Cart;
import au.com.woolworths.shop.cart.data.CartRepositoryImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/foundation/shop/cart/data/model/Cart;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor$clearAllTrolleyItems$2", f = "CartUpdateInteractor.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CartUpdateInteractor$clearAllTrolleyItems$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Cart>, Object> {
    public int p;
    public final /* synthetic */ CartUpdateInteractor q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartUpdateInteractor$clearAllTrolleyItems$2(CartUpdateInteractor cartUpdateInteractor, Continuation continuation) {
        super(2, continuation);
        this.q = cartUpdateInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CartUpdateInteractor$clearAllTrolleyItems$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CartUpdateInteractor$clearAllTrolleyItems$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        CartUpdateInteractor cartUpdateInteractor = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            CartRepositoryImpl cartRepositoryImpl = cartUpdateInteractor.d;
            this.p = 1;
            obj = cartRepositoryImpl.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        cartUpdateInteractor.b.K();
        cartUpdateInteractor.k.setValue(0);
        return obj;
    }
}
