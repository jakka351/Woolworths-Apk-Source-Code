package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManagerImpl;
import me.oriient.positioningengine.common.PositioningUpdate;

/* loaded from: classes8.dex */
public final class D3 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProximityEventManagerImpl f25927a;

    public D3(ProximityEventManagerImpl proximityEventManagerImpl) {
        this.f25927a = proximityEventManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        ProximityEventManagerImpl.access$onNewPosition(this.f25927a, (PositioningUpdate) obj);
        return Unit.f24250a;
    }
}
