package me.oriient.ipssdk.realtime.ofs;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.base.utils.SdkError;
import me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarterImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.e2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1639e2 extends SuspendLambda implements Function6 {

    /* renamed from: a, reason: collision with root package name */
    public int f26066a;
    public /* synthetic */ boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ int d;
    public /* synthetic */ RemoteConfig e;
    public final /* synthetic */ CoroutineScope f;
    public final /* synthetic */ GeofencePositioningAutoStarterImpl g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1639e2(CoroutineScope coroutineScope, GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl, Continuation continuation) {
        super(6, continuation);
        this.f = coroutineScope;
        this.g = geofencePositioningAutoStarterImpl;
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        C1639e2 c1639e2 = new C1639e2(this.f, this.g, (Continuation) obj6);
        c1639e2.b = zBooleanValue;
        c1639e2.c = (Map) obj2;
        c1639e2.d = iIntValue;
        c1639e2.e = (RemoteConfig) obj4;
        return c1639e2.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GeofenceBuilding geofenceBuilding;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26066a;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            boolean z = this.b;
            Map map = (Map) this.c;
            int i2 = this.d;
            RemoteConfig remoteConfig = this.e;
            if (!z || i2 != 0) {
                return unit;
            }
            GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl = this.g;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (GeofencePositioningAutoStarterImpl.access$isAutoStartCandidate(geofencePositioningAutoStarterImpl, (BuildingGeofenceStatus) entry.getValue(), remoteConfig)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            GeofenceBuilding geofenceBuilding2 = (GeofenceBuilding) CollectionsKt.E(linkedHashMap.keySet());
            if (geofenceBuilding2 == null) {
                return unit;
            }
            GeofencePositioningAutoStarterImpl.access$getLogger(this.g).d("GeofencePositioningAuto", "Starting positioning in geofence of: " + linkedHashMap);
            Function2 function2 = this.g.f25870a;
            String id = geofenceBuilding2.getId();
            this.c = geofenceBuilding2;
            this.f26066a = 1;
            Object objInvoke = function2.invoke(id, this);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            geofenceBuilding = geofenceBuilding2;
            obj = objInvoke;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            geofenceBuilding = (GeofenceBuilding) this.c;
            ResultKt.b(obj);
        }
        Outcome outcome = (Outcome) obj;
        GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl2 = this.g;
        if (outcome instanceof Outcome.Success) {
            GeofencePositioningAutoStarterImpl.access$getELog(geofencePositioningAutoStarterImpl2).i("GeofencePositioningAuto", "Auto-start positioning", new C1627c2(geofenceBuilding));
        }
        GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl3 = this.g;
        if (outcome instanceof Outcome.Failure) {
            SdkError sdkError = (SdkError) ((Outcome.Failure) outcome).getValue();
            GeofencePositioningAutoStarterImpl.access$getLogger(geofencePositioningAutoStarterImpl3).e("GeofencePositioningAuto", "onNewBuildingGeofences: failed to automatically start positioning at " + geofenceBuilding, sdkError);
            GeofencePositioningAutoStarterImpl.access$getELog(geofencePositioningAutoStarterImpl3).e("GeofencePositioningAuto", "Failed to auto-start positioning", new C1633d2(sdkError, geofenceBuilding));
            long autoStartPositioningPauseAfterErrorMillis = GeofencePositioningAutoStarterImpl.access$getConfigManager(geofencePositioningAutoStarterImpl3).getRealTimeConfig().getPositioning().getAutoStartPositioningPauseAfterErrorMillis() + GeofencePositioningAutoStarterImpl.access$getTimeProvider(geofencePositioningAutoStarterImpl3).getCurrentTimeMillis();
            MutableStateFlow mutableStateFlow = geofencePositioningAutoStarterImpl3.j;
            Long l = (Long) geofencePositioningAutoStarterImpl3.j.getValue();
            mutableStateFlow.setValue(new Long(Math.max(l != null ? l.longValue() : 0L, autoStartPositioningPauseAfterErrorMillis)));
        }
        return unit;
    }
}
