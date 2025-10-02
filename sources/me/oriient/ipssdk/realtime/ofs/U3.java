package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManagerImpl;
import me.oriient.positioningengine.common.PositioningEngineState;

/* loaded from: classes8.dex */
public final class U3 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProximityStatsManagerImpl f26017a;

    public U3(ProximityStatsManagerImpl proximityStatsManagerImpl) {
        this.f26017a = proximityStatsManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        PositioningEngineState positioningEngineState = (PositioningEngineState) obj;
        if (positioningEngineState instanceof PositioningEngineState.Calibrating ? true : positioningEngineState instanceof PositioningEngineState.Idle) {
            ProximityStatsManagerImpl.access$onPositioningSessionStopped(this.f26017a);
        } else if (positioningEngineState instanceof PositioningEngineState.Positioning) {
            ProximityStatsManagerImpl.access$onPositioningSessionStarted(this.f26017a);
        }
        return Unit.f24250a;
    }
}
