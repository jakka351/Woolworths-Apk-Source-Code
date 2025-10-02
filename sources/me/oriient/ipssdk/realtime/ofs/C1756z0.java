package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.systemStateManager.EngineEvent;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.positioningengine.common.PositioningEngineState;

/* renamed from: me.oriient.ipssdk.realtime.ofs.z0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1756z0 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final C1756z0 f26182a = new C1756z0();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        PositioningEngineState positioningEngineState = (PositioningEngineState) obj;
        CoreLogic coreLogic = CoreLogic.INSTANCE;
        Logger loggerAccess$getLogger = CoreLogic.access$getLogger(coreLogic);
        String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
        Intrinsics.g(strAccess$getTAG$p, "access$getTAG$p(...)");
        loggerAccess$getLogger.d(strAccess$getTAG$p, "onStateChanged() called with: state = [" + positioningEngineState + ']');
        CoreLogic.access$getSystemStateManager(coreLogic).onEngineEvent(new EngineEvent.IsCalibrationActiveChanged(positioningEngineState instanceof PositioningEngineState.Calibrating));
        CoreLogic.access$onSessionStateChanged(coreLogic, positioningEngineState);
        return Unit.f24250a;
    }
}
