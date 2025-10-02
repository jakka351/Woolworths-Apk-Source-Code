package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.positioningengine.common.CalibrationUpdate;

/* loaded from: classes8.dex */
public final class B0 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final B0 f25913a = new B0();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        CoreLogic.access$onCalibrationUpdate(CoreLogic.INSTANCE, (float) ((CalibrationUpdate) obj).getProgressPercent());
        return Unit.f24250a;
    }
}
