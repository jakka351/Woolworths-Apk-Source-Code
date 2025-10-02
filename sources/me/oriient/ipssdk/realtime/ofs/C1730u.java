package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningControllerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1730u extends SuspendLambda implements Function5 {

    /* renamed from: a, reason: collision with root package name */
    public int f26153a;
    public /* synthetic */ GeofenceBuilding b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ ChargingBasedPositioningControllerImpl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1730u(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl, Continuation continuation) {
        super(5, continuation);
        this.d = chargingBasedPositioningControllerImpl;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C1730u c1730u = new C1730u(this.d, (Continuation) obj5);
        c1730u.b = (GeofenceBuilding) obj;
        c1730u.c = zBooleanValue;
        return c1730u.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26153a;
        Unit unit = Unit.f24250a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
                return unit;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        GeofenceBuilding geofenceBuilding = this.b;
        boolean z = this.c;
        ChargingBasedPositioningControllerImpl.access$getLogger(this.d).d("ChargingBasedPositioning", "Status: " + geofenceBuilding + " and " + z + " and " + this.d.n);
        if (!z) {
            if (!this.d.n && geofenceBuilding != null) {
                ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl = this.d;
                this.f26153a = 2;
                if (ChargingBasedPositioningControllerImpl.access$startPositioningIfNeeded(chargingBasedPositioningControllerImpl, geofenceBuilding, this) == coroutineSingletons) {
                }
            }
            return unit;
        }
        this.d.n = false;
        ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl2 = this.d;
        chargingBasedPositioningControllerImpl2.k = new Long(ChargingBasedPositioningControllerImpl.access$getTimeProvider(chargingBasedPositioningControllerImpl2).getCurrentTimeMillis());
        ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl3 = this.d;
        this.f26153a = 1;
        if (ChargingBasedPositioningControllerImpl.access$stopPositioningIfNeeded(chargingBasedPositioningControllerImpl3, this) != coroutineSingletons) {
            return unit;
        }
        return coroutineSingletons;
    }
}
