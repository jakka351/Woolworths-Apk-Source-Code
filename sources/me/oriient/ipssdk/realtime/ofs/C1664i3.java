package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.ipssdk.realtime.ips.Positioning;
import me.oriient.ipssdk.realtime.ips.calibration.AutomaticCalibrator;
import me.oriient.positioningengine.common.EngineStopReason;
import me.oriient.positioningengine.common.InitiatedBy;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.PositioningEngineState;

/* renamed from: me.oriient.ipssdk.realtime.ofs.i3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1664i3 implements AutomaticCalibrator.Delegate {
    @Override // me.oriient.ipssdk.realtime.ips.calibration.AutomaticCalibrator.Delegate
    public final void stopCalibration(EngineStopReason reason) {
        StateFlow<PositioningEngineState> state;
        PositioningEngineState positioningEngineState;
        Intrinsics.h(reason, "reason");
        if (Positioning.b0) {
            return;
        }
        Positioning positioning = Positioning.INSTANCE;
        PositioningEngine positioningEngine = (PositioningEngine) Positioning.access$getEngineManager(positioning).getEngine().getValue();
        if (positioningEngine == null || (state = positioningEngine.getState()) == null || (positioningEngineState = (PositioningEngineState) state.getValue()) == null || !(positioningEngineState instanceof PositioningEngineState.Calibrating) || ((PositioningEngineState.Calibrating) positioningEngineState).getContext().getInitiatedBy() != InitiatedBy.AUTO_START) {
            return;
        }
        Positioning.access$stopCalibrationImpl(positioning, reason, null);
    }
}
