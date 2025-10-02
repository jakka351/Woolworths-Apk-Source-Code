package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.InternalError;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.retryOperation.RetryExtensionsKt;

/* loaded from: classes7.dex */
public final class P extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25202a;
    public /* synthetic */ Object b;
    public final /* synthetic */ U c;
    public final /* synthetic */ C1324w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(U u, C1324w c1324w, Continuation continuation) {
        super(2, continuation);
        this.c = u;
        this.d = c1324w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        P p = new P(this.c, this.d, continuation);
        p.b = obj;
        return p;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((MapGridUrl) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25202a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        MapGridUrl mapGridUrl = (MapGridUrl) this.b;
        if (mapGridUrl.getUrl() == null) {
            ELog eLog = (ELog) this.c.e.getD();
            C1324w c1324w = this.d;
            eLog.e("MapGridSource", "MapGridURL is Empty", MapsKt.j(new Pair("buildingId", c1324w.f25227a), new Pair("floorId", c1324w.b), new Pair("mapId", c1324w.c)));
            return new Outcome.Failure(new InternalError("MapGridURL is Empty. Failed to fetch the map"));
        }
        ((Logger) this.c.d.getD()).d("MapGridSource", "map grid url - " + mapGridUrl);
        Logger logger = (Logger) this.c.d.getD();
        int retryRequestCount = ((InternalConfig) ((InternalConfigManager) this.c.f.getD()).getConfig().getValue()).getCommonDataRepositoryConfig().getRetryRequestCount();
        O o = new O(this.c, this.d, mapGridUrl, null);
        this.f25202a = 1;
        Object objRetryTo$default = RetryExtensionsKt.retryTo$default("MapGridSource", "get map grid from rest", logger, retryRequestCount, 0L, 0L, 0.0d, o, this, 112, null);
        return objRetryTo$default == coroutineSingletons ? coroutineSingletons : objRetryTo$default;
    }
}
