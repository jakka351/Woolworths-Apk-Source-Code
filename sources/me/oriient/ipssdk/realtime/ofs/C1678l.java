package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopperImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1678l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AutomaticSessionStopperImpl f26102a;
    public final /* synthetic */ Building b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1678l(AutomaticSessionStopperImpl automaticSessionStopperImpl, Building building, Continuation continuation) {
        super(2, continuation);
        this.f26102a = automaticSessionStopperImpl;
        this.b = building;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1678l(this.f26102a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1678l(this.f26102a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        AutomaticSessionStopperImpl.access$getLogger(this.f26102a).d("AutomaticSessionStopper", "start() called");
        boolean zAccess$isActive = AutomaticSessionStopperImpl.access$isActive(this.f26102a);
        Unit unit = Unit.f24250a;
        if (zAccess$isActive) {
            AutomaticSessionStopperImpl.access$getLogger(this.f26102a).d("AutomaticSessionStopper", "start: already active. doing nothing...");
            return unit;
        }
        this.f26102a.i = this.b;
        AutomaticSessionStopperImpl automaticSessionStopperImpl = this.f26102a;
        AutomaticSessionStopperImpl.access$setGeofenceJob(automaticSessionStopperImpl, BuildersKt.c(automaticSessionStopperImpl.b, null, null, new C1672k(this.f26102a, null), 3));
        AutomaticSessionStopperImpl.access$getBuildingGeofenceManager(this.f26102a).enableCircularLiveGeofence(true, AutomaticSessionStopperImpl.GEOFENCE_REQUEST_ID);
        return unit;
    }
}
