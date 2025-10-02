package me.oriient.internal.services.auth;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataModel.auth.AuthConfig;
import me.oriient.internal.services.retryOperation.RetryOperationKt;
import me.oriient.internal.services.retryOperation.RetryStrategy;

/* loaded from: classes7.dex */
public final class B extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25012a;
    public final /* synthetic */ D b;
    public final /* synthetic */ V c;
    public final /* synthetic */ AuthConfig d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(D d, V v, AuthConfig authConfig, Continuation continuation) {
        super(2, continuation);
        this.b = d;
        this.c = v;
        this.d = authConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new B(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25012a;
        if (i == 0) {
            ResultKt.b(obj);
            D.a(this.b).d("AuthManager", "scheduleRefreshRetries: internal refresh scheduled");
            long jAbs = Math.abs(((TimeProvider) this.b.f.getD()).timeIntervalSinceNow(this.c.f25021a.b)) - this.d.getTimeIntervalBeforeRefreshMillis();
            NetworkManager networkManager = (NetworkManager) this.b.i.getD();
            int maxRefreshAttempts = this.d.getMaxRefreshAttempts();
            long refreshBaseIntervalMillis = this.d.getRefreshBaseIntervalMillis();
            RetryStrategy retryStrategy = RetryStrategy.LINEAR;
            z zVar = new z(this.b);
            A a2 = new A(this.b, null);
            this.f25012a = 1;
            if (RetryOperationKt.retryOperationWithNetwork$default(networkManager, maxRefreshAttempts, jAbs, refreshBaseIntervalMillis, 0L, retryStrategy, zVar, a2, this, 16, null) == coroutineSingletons) {
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
