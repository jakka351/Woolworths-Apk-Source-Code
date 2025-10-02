package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManagerImpl;
import me.oriient.ipssdk.realtime.wrappers.ProximityWrapper;
import me.oriient.positioningengine.common.PositioningEngine;

/* loaded from: classes8.dex */
public final class W3 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProximityStatsManagerImpl f26027a;

    public W3(ProximityStatsManagerImpl proximityStatsManagerImpl) {
        this.f26027a = proximityStatsManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        PositioningEngine positioningEngine = (PositioningEngine) obj;
        Unit unit = Unit.f24250a;
        if (positioningEngine == null) {
            ProximityStatsManagerImpl.access$setEngineObserver(this.f26027a, null);
            return unit;
        }
        ProximityStatsManagerImpl proximityStatsManagerImpl = this.f26027a;
        ProximityStatsManagerImpl.access$setEngineObserver(proximityStatsManagerImpl, BuildersKt.c(((ProximityWrapper) proximityStatsManagerImpl.f25889a.getD()).getProximityCoroutineScope(), null, null, new V3(positioningEngine, this.f26027a, null), 3));
        return unit;
    }
}
