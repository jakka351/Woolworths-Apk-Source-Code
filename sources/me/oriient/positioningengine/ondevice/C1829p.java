package me.oriient.positioningengine.ondevice;

import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.positioningengine.common.PositioningEngineState;
import me.oriient.positioningengine.common.models.CalibrationNeeded;
import me.oriient.positioningengine.ondevice.models.calibration.CalibrationData;
import me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo;

/* renamed from: me.oriient.positioningengine.ondevice.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1829p implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f26475a;

    public C1829p(I i) {
        this.f26475a = i;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        CalibrationData calibrationData;
        PositioningEngineState positioningEngineState = (PositioningEngineState) obj;
        boolean z = positioningEngineState instanceof PositioningEngineState.Calibrating ? true : positioningEngineState instanceof PositioningEngineState.Positioning;
        Unit unit = Unit.f24250a;
        if (z) {
            me.oriient.positioningengine.ondevice.calibration.e eVar = this.f26475a.b;
            ((ELog) eVar.j.getD()).d("CalibrationDataManager", "Calibration expiration countdown - stopped");
            Job job = eVar.e;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            eVar.e = null;
            return unit;
        }
        if (positioningEngineState instanceof PositioningEngineState.Idle) {
            me.oriient.positioningengine.ondevice.calibration.e eVar2 = this.f26475a.b;
            if (!(eVar2.c.getValue() != null) && !((me.oriient.positioningengine.common.config.a) ((me.oriient.positioningengine.common.config.d) ((me.oriient.positioningengine.common.config.c) eVar2.g.getD())).f26374a.getValue()).g) {
                me.oriient.positioningengine.ondevice.models.calibration.b bVar = eVar2.f;
                EngineCalibrationInfo engineCalibrationInfo = bVar != null ? bVar.c : null;
                double dMax = Math.max(0.0d, ((me.oriient.positioningengine.common.config.a) ((me.oriient.positioningengine.common.config.d) ((me.oriient.positioningengine.common.config.c) eVar2.g.getD())).f26374a.getValue()).f26373a - Math.abs(((TimeProvider) eVar2.i.getD()).timeIntervalSinceNow(((engineCalibrationInfo == null || (calibrationData = engineCalibrationInfo.getCalibrationData()) == null) ? null : calibrationData.getLastSuccessfulTime()) != null ? me.oriient.positioningengine.common.util.a.a(r10, ((TimeProvider) eVar2.i.getD()).getTimeZoneGmt()) : -1L)));
                if (dMax <= 0.0d) {
                    ((ELog) eVar2.j.getD()).d("CalibrationDataRepository", "Calibration expiration countdown - instant clean");
                    CalibrationNeeded.Companion.getClass();
                    eVar2.a(CalibrationNeeded.Timeout);
                } else {
                    ((ELog) eVar2.j.getD()).d("CalibrationDataRepository", "Calibration expiration countdown", MapsKt.i(new Pair("schedule", new Double(dMax))));
                    eVar2.e = BuildersKt.c(eVar2.d, null, null, new me.oriient.positioningengine.ondevice.calibration.c(dMax, eVar2, null), 3);
                }
            }
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        }
        return unit;
    }
}
