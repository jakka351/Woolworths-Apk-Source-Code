package me.oriient.ipssdk.realtime.ofs;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManagerImpl;
import me.oriient.positioningengine.common.PositioningEngine;

/* loaded from: classes8.dex */
public final class H3 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProximityEventManagerImpl f25951a;

    public H3(ProximityEventManagerImpl proximityEventManagerImpl) {
        this.f25951a = proximityEventManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        PositioningEngine positioningEngine = (PositioningEngine) obj;
        Iterator it = this.f25951a.k.iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel((CancellationException) null);
        }
        this.f25951a.k.clear();
        Unit unit = Unit.f24250a;
        if (positioningEngine == null) {
            return unit;
        }
        this.f25951a.k.add(BuildersKt.c(this.f25951a.i, null, null, new E3(positioningEngine, this.f25951a, null), 3));
        this.f25951a.k.add(BuildersKt.c(this.f25951a.i, null, null, new G3(positioningEngine, this.f25951a, null), 3));
        return unit;
    }
}
