package au.com.woolworths.shop.auth;

import au.com.woolworths.auth.api.AuthManagerApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAuthManager$hasCredentials$2", f = "ShopAuthManager.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShopAuthManager$hasCredentials$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    public int p;
    public final /* synthetic */ ShopAuthManager q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopAuthManager$hasCredentials$2(ShopAuthManager shopAuthManager, Continuation continuation) {
        super(2, continuation);
        this.q = shopAuthManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShopAuthManager$hasCredentials$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShopAuthManager$hasCredentials$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        AuthManagerApi authManagerApiG = this.q.g();
        this.p = 1;
        Object objA = authManagerApiG.a(this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
