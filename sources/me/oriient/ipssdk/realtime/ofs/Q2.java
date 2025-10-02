package me.oriient.ipssdk.realtime.ofs;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.realtime.ips.calibration.PeriodicAutomaticCalibratorImpl;

/* loaded from: classes8.dex */
public final class Q2 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PeriodicAutomaticCalibratorImpl f25995a;

    public Q2(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl) {
        this.f25995a = periodicAutomaticCalibratorImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.f25995a.o = (long) (((RemoteConfig) obj).getRealTime().getAutoCalibration().getAutoCalibCheckTimeIntervalSec() * TimeUnit.SECONDS.toMillis(1L));
        return Unit.f24250a;
    }
}
