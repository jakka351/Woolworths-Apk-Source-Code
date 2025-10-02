package au.com.woolworths.base.shopapp.network;

import au.com.woolworths.auth.auth0.Auth0AuthManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.base.shopapp.network.ApigeeXHttpInterceptor$getAccessToken$1", f = "ApigeeXHttpInterceptor.kt", l = {62, 63}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ApigeeXHttpInterceptor$getAccessToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Ref.ObjectRef p;
    public int q;
    public final /* synthetic */ Ref.ObjectRef r;
    public final /* synthetic */ ApigeeXHttpInterceptor s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApigeeXHttpInterceptor$getAccessToken$1(Ref.ObjectRef objectRef, ApigeeXHttpInterceptor apigeeXHttpInterceptor, Continuation continuation) {
        super(2, continuation);
        this.r = objectRef;
        this.s = apigeeXHttpInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ApigeeXHttpInterceptor$getAccessToken$1(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ApigeeXHttpInterceptor$getAccessToken$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        String str;
        Ref.ObjectRef objectRef2;
        Auth0AuthManager auth0AuthManager = this.s.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            Ref.ObjectRef objectRef3 = this.r;
            this.p = objectRef3;
            this.q = 1;
            Object objA = auth0AuthManager.a(this);
            if (objA != coroutineSingletons) {
                objectRef = objectRef3;
                obj = objA;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef2 = this.p;
            ResultKt.b(obj);
            str = (String) obj;
            objectRef = objectRef2;
            objectRef.d = str;
            return Unit.f24250a;
        }
        objectRef = this.p;
        ResultKt.b(obj);
        if (!((Boolean) obj).booleanValue()) {
            str = null;
            objectRef.d = str;
            return Unit.f24250a;
        }
        this.p = objectRef;
        this.q = 2;
        obj = auth0AuthManager.b(this);
        if (obj != coroutineSingletons) {
            objectRef2 = objectRef;
            str = (String) obj;
            objectRef = objectRef2;
            objectRef.d = str;
            return Unit.f24250a;
        }
        return coroutineSingletons;
    }
}
