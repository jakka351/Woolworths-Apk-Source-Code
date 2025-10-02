package au.com.woolworths.foundation.rewards.cart.info.data;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.rewards.cart.info.domain.model.CartInfoResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.rewards.cart.info.data.CartInfoInteractorImpl$fetchCartInfo$1", f = "CartInfoInteractor.kt", l = {44}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class CartInfoInteractorImpl$fetchCartInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public CartInfoInteractorImpl p;
    public int q;
    public final /* synthetic */ CartInfoInteractorImpl r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartInfoInteractorImpl$fetchCartInfo$1(CartInfoInteractorImpl cartInfoInteractorImpl, Continuation continuation) {
        super(2, continuation);
        this.r = cartInfoInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CartInfoInteractorImpl$fetchCartInfo$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CartInfoInteractorImpl$fetchCartInfo$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CartInfoInteractorImpl cartInfoInteractorImpl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CartInfoInteractorImpl cartInfoInteractorImpl2 = this.r;
                CartInfoRepositoryImpl cartInfoRepositoryImpl = cartInfoInteractorImpl2.f8550a;
                this.p = cartInfoInteractorImpl2;
                this.q = 1;
                Object objA = cartInfoRepositoryImpl.a(this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                cartInfoInteractorImpl = cartInfoInteractorImpl2;
                obj = objA;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cartInfoInteractorImpl = this.p;
                ResultKt.b(obj);
            }
            cartInfoInteractorImpl.c.setValue((CartInfoResponse) obj);
        } catch (NoConnectivityException | ServerErrorException unused) {
        }
        return Unit.f24250a;
    }
}
