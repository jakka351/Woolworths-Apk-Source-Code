package me.oriient.internal.services.dataManager.obstacles;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.floorMetadata.FloorImage;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadata;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.retryOperation.RetryExtensionsKt;

/* loaded from: classes7.dex */
public final class Q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25242a;
    public /* synthetic */ Object b;
    public final /* synthetic */ U c;
    public final /* synthetic */ String d;
    public final /* synthetic */ C1349u e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(U u, String str, C1349u c1349u, Continuation continuation) {
        super(2, continuation);
        this.c = u;
        this.d = str;
        this.e = c1349u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Q q = new Q(this.c, this.d, this.e, continuation);
        q.b = obj;
        return q;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((FloorMetadata) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25242a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        FloorImage obstacleMap = ((FloorMetadata) this.b).getObstacleMap();
        if (obstacleMap == null) {
            U u = this.c;
            String str = this.d;
            C1349u c1349u = this.e;
            ((ELog) u.b.getD()).i("ObstaclesSource", "Map has empty obstacles");
            return new Outcome.Success(new w(str, c1349u.f25263a, c1349u.b, new Obstacles()));
        }
        int retryRequestCount = ((InternalConfig) ((InternalConfigManager) this.c.f.getD()).getConfig().getValue()).getCommonDataRepositoryConfig().getRetryRequestCount();
        Logger logger = (Logger) this.c.f25245a.getD();
        P p = new P(this.c, obstacleMap, this.d, this.e, null);
        this.f25242a = 1;
        Object objRetryTo$default = RetryExtensionsKt.retryTo$default("ObstaclesSource", "ObstaclesRequest", logger, retryRequestCount, 0L, 0L, 0.0d, p, this, 112, null);
        return objRetryTo$default == coroutineSingletons ? coroutineSingletons : objRetryTo$default;
    }
}
