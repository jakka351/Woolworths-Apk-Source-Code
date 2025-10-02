package me.oriient.ipssdk.realtime.ofs;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningControllerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1750y extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26175a;
    public final /* synthetic */ ChargingBasedPositioningControllerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750y(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = chargingBasedPositioningControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1750y(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1750y(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26175a;
        Unit unit = Unit.f24250a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        Logger loggerAccess$getLogger = ChargingBasedPositioningControllerImpl.access$getLogger(this.b);
        StringBuilder sb = new StringBuilder("deactivate ");
        sb.append(this.b.l == null);
        loggerAccess$getLogger.d("ChargingBasedPositioning", sb.toString());
        if (this.b.l != null) {
            Job job = this.b.l;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            this.b.l = null;
            Job job2 = this.b.m;
            if (job2 != null) {
                job2.cancel((CancellationException) null);
            }
            this.b.m = null;
            ChargingBasedPositioningControllerImpl.access$getBuildingGeofenceManager(this.b).enableCircularStrategy(false, ChargingBasedPositioningControllerImpl.GEOFENCE_REQUEST_ID);
            ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl = this.b;
            this.f26175a = 1;
            if (ChargingBasedPositioningControllerImpl.access$stopPositioningIfNeeded(chargingBasedPositioningControllerImpl, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
