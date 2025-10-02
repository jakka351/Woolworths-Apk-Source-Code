package me.oriient.ipssdk.realtime.ips.automatic;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.positioningengine.common.EngineStopReason;
import me.oriient.positioningengine.common.ValidationUpdate;

/* loaded from: classes8.dex */
public final class b implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AutomaticNotLockedSessionStopper f25872a;

    public b(AutomaticNotLockedSessionStopper automaticNotLockedSessionStopper) {
        this.f25872a = automaticNotLockedSessionStopper;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objStopSession;
        return (AutomaticNotLockedSessionStopper.access$getOnDeviceEngineAutoStopDetector(this.f25872a).shouldStop((ValidationUpdate) obj) && (objStopSession = this.f25872a.f25867a.stopSession(new EngineStopReason.OutOfExternalRegion(), continuation)) == CoroutineSingletons.d) ? objStopSession : Unit.f24250a;
    }
}
