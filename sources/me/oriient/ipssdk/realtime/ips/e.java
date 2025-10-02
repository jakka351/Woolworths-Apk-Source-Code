package me.oriient.ipssdk.realtime.ips;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.services.systemStateManager.EngineEvent;
import me.oriient.positioningengine.common.models.CalibrationNeeded;

/* loaded from: classes8.dex */
public final class e implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final e f25879a = new e();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        CalibrationNeeded calibrationNeeded = (CalibrationNeeded) obj;
        CoreLogic coreLogic = CoreLogic.INSTANCE;
        CoreLogic.access$getSystemStateManager(coreLogic).onEngineEvent(new EngineEvent.IsCalibrationNeededChanged(calibrationNeeded != null));
        if (calibrationNeeded != null) {
            CoreLogic.access$onCalibrationNeeded(coreLogic, CalibrationReason.INSTANCE.from(calibrationNeeded.getReason()), calibrationNeeded.getInfo());
        }
        return Unit.f24250a;
    }
}
