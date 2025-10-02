package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopperImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1684m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AutomaticSessionStopperImpl f26108a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1684m(AutomaticSessionStopperImpl automaticSessionStopperImpl, Continuation continuation) {
        super(2, continuation);
        this.f26108a = automaticSessionStopperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1684m(this.f26108a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1684m(this.f26108a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        AutomaticSessionStopperImpl.access$getLogger(this.f26108a).d("AutomaticSessionStopper", "stop() called");
        boolean zAccess$isActive = AutomaticSessionStopperImpl.access$isActive(this.f26108a);
        Unit unit = Unit.f24250a;
        if (!zAccess$isActive) {
            AutomaticSessionStopperImpl.access$getLogger(this.f26108a).d("AutomaticSessionStopper", "stop: not active. doing nothing...");
            return unit;
        }
        AutomaticSessionStopperImpl.access$setGeofenceJob(this.f26108a, null);
        AutomaticSessionStopperImpl.access$getBuildingGeofenceManager(this.f26108a).enableCircularLiveGeofence(false, AutomaticSessionStopperImpl.GEOFENCE_REQUEST_ID);
        return unit;
    }
}
