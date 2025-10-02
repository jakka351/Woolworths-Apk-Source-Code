package me.oriient.positioningengine.support;

import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.engine.EngineVersionProvider;
import me.oriient.internal.services.retryOperation.RetryExtensionsKt;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession;

/* renamed from: me.oriient.positioningengine.support.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1843e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26528a;
    public final /* synthetic */ C1846f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1843e(C1846f c1846f, Continuation continuation) {
        super(2, continuation);
        this.b = c1846f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1843e(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1843e(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26528a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        C1846f c1846f = this.b;
        OnDeviceEngineSession onDeviceEngineSession = c1846f.h;
        if (onDeviceEngineSession != null) {
            if (onDeviceEngineSession.getExpirationTimeStamp() - (((me.oriient.positioningengine.common.config.a) ((me.oriient.positioningengine.common.config.d) ((me.oriient.positioningengine.common.config.c) c1846f.d.getD())).f26374a.getValue()).e * TimeUnit.SECONDS.toMillis(1L)) >= ((TimeProvider) c1846f.c.getD()).getCurrentTimeMillis()) {
                return new Outcome.Success(onDeviceEngineSession);
            }
        }
        long currentTimeMillis = ((TimeProvider) this.b.c.getD()).getCurrentTimeMillis();
        String shortVersion = ((EngineVersionProvider) this.b.e.getD()).getShortVersion();
        Logger logger = (Logger) this.b.f26551a.getD();
        int i2 = ((me.oriient.positioningengine.common.config.a) ((me.oriient.positioningengine.common.config.d) ((me.oriient.positioningengine.common.config.c) this.b.d.getD())).f26374a.getValue()).c;
        long j = ((me.oriient.positioningengine.common.config.a) ((me.oriient.positioningengine.common.config.d) ((me.oriient.positioningengine.common.config.c) this.b.d.getD())).f26374a.getValue()).d;
        C1842d c1842d = new C1842d(this.b, shortVersion, currentTimeMillis, null);
        this.f26528a = 1;
        Object objRetryTo$default = RetryExtensionsKt.retryTo$default("OnDeviceEngineSessionRepository", "loading on device engine session", logger, i2, j, 0L, 0.0d, c1842d, this, 96, null);
        return objRetryTo$default == coroutineSingletons ? coroutineSingletons : objRetryTo$default;
    }
}
