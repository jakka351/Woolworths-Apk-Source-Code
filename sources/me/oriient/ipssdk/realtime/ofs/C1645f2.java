package me.oriient.ipssdk.realtime.ofs;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarterImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.f2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1645f2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26071a;
    public /* synthetic */ Object b;
    public final /* synthetic */ GeofencePositioningAutoStarterImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1645f2(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl, Continuation continuation) {
        super(2, continuation);
        this.c = geofencePositioningAutoStarterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1645f2 c1645f2 = new C1645f2(this.c, continuation);
        c1645f2.b = obj;
        return c1645f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1645f2 c1645f2 = new C1645f2(this.c, (Continuation) obj2);
        c1645f2.b = (CoroutineScope) obj;
        return c1645f2.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26071a;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            MutableStateFlow mutableStateFlow = this.c.k;
            StateFlow<Map<GeofenceBuilding, BuildingGeofenceStatus>> polygonalStatus = GeofencePositioningAutoStarterImpl.access$getBuildingGeofenceManager(this.c).getPolygonalStatus();
            MutableStateFlow mutableStateFlow2 = this.c.i;
            StateFlow<RemoteConfig> config = GeofencePositioningAutoStarterImpl.access$getConfigManager(this.c).getConfig();
            GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl = this.c;
            GeofencePositioningAutoStarterImpl.Companion.getClass();
            FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3K = FlowKt.k(mutableStateFlow, polygonalStatus, mutableStateFlow2, config, GeofencePositioningAutoStarterImpl.access$tickerFlow(geofencePositioningAutoStarterImpl, GeofencePositioningAutoStarterImpl.n), new C1639e2(coroutineScope, this.c, null));
            this.f26071a = 1;
            if (FlowKt.g(flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3K, this) == coroutineSingletons) {
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
