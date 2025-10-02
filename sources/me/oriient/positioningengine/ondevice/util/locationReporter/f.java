package me.oriient.positioningengine.ondevice.util.locationReporter;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.eventManager.EventManager;
import me.oriient.internal.services.eventManager.model.EventManagerConfig;
import me.oriient.internal.services.eventManager.model.EventManagerContext;
import me.oriient.positioningengine.common.PositioningContext;
import me.oriient.positioningengine.common.PositioningEngineState;

/* loaded from: classes8.dex */
public final class f implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f26487a;

    public f(h hVar) {
        this.f26487a = hVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        PositioningEngineState positioningEngineState = (PositioningEngineState) obj;
        if (positioningEngineState instanceof PositioningEngineState.Idle ? true : positioningEngineState instanceof PositioningEngineState.Calibrating) {
            h hVar = this.f26487a;
            ((Logger) hVar.k.getD()).d("LocationReporter", "tearDownReporting() called");
            EventManager eventManager = hVar.j;
            if (eventManager != null) {
                eventManager.disconnect();
            }
            hVar.j = null;
        } else if (positioningEngineState instanceof PositioningEngineState.Positioning) {
            h hVar2 = this.f26487a;
            PositioningContext context = ((PositioningEngineState.Positioning) positioningEngineState).getContext();
            ((Logger) hVar2.k.getD()).d("LocationReporter", "create() called with: positionContext = " + context);
            if (hVar2.j != null) {
                ((Logger) hVar2.k.getD()).d("LocationReporter", "Event manager was already created and connected");
            } else {
                EventManager eventManagerCreate = hVar2.c.create(new EventManagerContext(context.getSessionId(), hVar2.f.getOriientApi().getLocationReportingUrl(), hVar2.b.getSpaceId(), hVar2.d.getDeviceId(), hVar2.g), new EventManagerConfig(hVar2.b.getReportingTimeoutMillis(), hVar2.b.getTimeoutsToFail(), hVar2.b.getQueueLimit(), hVar2.b.getConnectionRetryInitialIntervalMillis(), hVar2.b.getConnectionRetryMaxIntervalMillis()));
                hVar2.j = eventManagerCreate;
                if (eventManagerCreate != null) {
                    eventManagerCreate.connect();
                }
                BuildersKt.c(hVar2.i, null, null, new e(hVar2, context, null), 3);
            }
        }
        return Unit.f24250a;
    }
}
