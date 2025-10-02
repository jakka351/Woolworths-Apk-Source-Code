package au.com.woolworths.shop.auth;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.KeycloakTokenAuthenticator$authenticate$1", f = "KeycloakTokenAuthenticator.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class KeycloakTokenAuthenticator$authenticate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    public int p;
    public final /* synthetic */ KeycloakTokenAuthenticator q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeycloakTokenAuthenticator$authenticate$1(KeycloakTokenAuthenticator keycloakTokenAuthenticator, Continuation continuation) {
        super(2, continuation);
        this.q = keycloakTokenAuthenticator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KeycloakTokenAuthenticator$authenticate$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((KeycloakTokenAuthenticator$authenticate$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        this.p = 1;
        Object objB = KeycloakTokenAuthenticator.b(this.q, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
