package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningControllerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1745x extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChargingBasedPositioningControllerImpl f26170a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745x(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl, Continuation continuation) {
        super(2, continuation);
        this.f26170a = chargingBasedPositioningControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1745x(this.f26170a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1745x(this.f26170a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Logger loggerAccess$getLogger = ChargingBasedPositioningControllerImpl.access$getLogger(this.f26170a);
        StringBuilder sb = new StringBuilder("activate ");
        sb.append(this.f26170a.l != null);
        loggerAccess$getLogger.d("ChargingBasedPositioning", sb.toString());
        Job job = this.f26170a.l;
        Unit unit = Unit.f24250a;
        if (job != null) {
            return unit;
        }
        ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl = this.f26170a;
        chargingBasedPositioningControllerImpl.l = BuildersKt.c(chargingBasedPositioningControllerImpl.f25869a, null, null, new C1725t(this.f26170a, null), 3);
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1C = FlowKt.C(this.f26170a.j, ChargingBasedPositioningControllerImpl.access$getBuildingGeofenceManager(this.f26170a).getCircularStatus(), new C1740w(null));
        ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl2 = this.f26170a;
        chargingBasedPositioningControllerImpl2.m = BuildersKt.c(chargingBasedPositioningControllerImpl2.f25869a, null, null, new C1735v(flowKt__ZipKt$combine$$inlined$unsafeFlow$1C, this.f26170a, null), 3);
        return unit;
    }
}
