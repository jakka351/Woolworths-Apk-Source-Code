package me.oriient.internal.services.auth;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.retryOperation.RetryExtensionsKt;

/* renamed from: me.oriient.internal.services.auth.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1221m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25034a;
    public final /* synthetic */ D b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221m(D d, String str, Continuation continuation) {
        super(2, continuation);
        this.b = d;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1221m(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1221m(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25034a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        Logger loggerA = D.a(this.b);
        int loginRetryAttempts = ((InternalConfig) ((InternalConfigManager) this.b.h.getD()).getConfig().getValue()).getAuthConfig().getLoginRetryAttempts();
        long loginRetryIntervalMillis = ((InternalConfig) ((InternalConfigManager) this.b.h.getD()).getConfig().getValue()).getAuthConfig().getLoginRetryIntervalMillis();
        C1220l c1220l = new C1220l(this.b, this.c, null);
        this.f25034a = 1;
        Object objRetryTo$default = RetryExtensionsKt.retryTo$default("AuthManager", "login", loggerA, loginRetryAttempts, loginRetryIntervalMillis, 0L, 0.0d, c1220l, this, 96, null);
        return objRetryTo$default == coroutineSingletons ? coroutineSingletons : objRetryTo$default;
    }
}
