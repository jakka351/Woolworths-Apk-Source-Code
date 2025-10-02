package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.engine.EngineVersionProvider;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import me.oriient.internal.services.elog.ELog;

/* loaded from: classes7.dex */
public final class O extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f25201a;
    public final /* synthetic */ U b;
    public final /* synthetic */ C1324w c;
    public final /* synthetic */ MapGridUrl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(U u, C1324w c1324w, MapGridUrl mapGridUrl, Continuation continuation) {
        super(1, continuation);
        this.b = u;
        this.c = c1324w;
        this.d = mapGridUrl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new O(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((O) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        O o;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25201a;
        if (i == 0) {
            ResultKt.b(obj);
            H h = (H) this.b.c.getD();
            C1324w c1324w = this.c;
            String url = this.d.getUrl();
            String shortVersion = ((EngineVersionProvider) this.b.f25205a.getD()).getShortVersion();
            int mapVersion = this.d.getMapVersion();
            int majorVersion = this.d.getMajorVersion();
            String createdBy = this.d.getCreatedBy();
            this.f25201a = 1;
            o = this;
            obj = ((RestHelper) ((L) h).b.getD()).getBytesData("MapGridRest", url, true, new J(c1324w, shortVersion, mapVersion, majorVersion, createdBy), o);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            o = this;
        }
        Outcome outcome = (Outcome) obj;
        U u = o.b;
        C1324w c1324w2 = o.c;
        MapGridUrl mapGridUrl = o.d;
        if (outcome instanceof Outcome.Success) {
            ((ELog) u.e.getD()).d("MapGridSource", "Grid fetching is done", MapsKt.j(new Pair("buildingId", c1324w2.f25227a), new Pair("floorId", c1324w2.b), new Pair("mapId", c1324w2.c), new Pair("mapGridVersion", new Integer(mapGridUrl.getMapVersion())), new Pair("mapGridMajorVersion", new Integer(mapGridUrl.getMajorVersion())), new Pair("mapGridCreatedBy", mapGridUrl.getCreatedBy())));
        }
        return outcome;
    }
}
