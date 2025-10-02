package me.oriient.ipssdk.realtime.ofs;

import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.ips.ICalibrationListener;
import me.oriient.ipssdk.realtime.ips.Positioning;
import me.oriient.ipssdk.realtime.ips.calibration.PeriodicAutomaticCalibratorImpl;

/* loaded from: classes8.dex */
public final class R2 implements ICalibrationListener {

    /* renamed from: a, reason: collision with root package name */
    public Integer f26000a;
    public final /* synthetic */ PeriodicAutomaticCalibratorImpl b;

    public R2(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl) {
        this.b = periodicAutomaticCalibratorImpl;
    }

    @Override // me.oriient.ipssdk.ips.ICalibrationListener
    public final void onCalibrationError(IPSError error) {
        Intrinsics.h(error, "error");
        PeriodicAutomaticCalibratorImpl.access$getLogger(this.b).d("PeriodicAutomaticCalibrator", "onCalibrationError() called with: error = " + error);
        Positioning.INSTANCE.removeCalibrationListener(PeriodicAutomaticCalibratorImpl.access$getAutoCalibrationListener(this.b));
        PeriodicAutomaticCalibratorImpl.access$cancelBackgroundCalibrationTimeout(this.b);
        PeriodicAutomaticCalibratorImpl.access$onCalibrationProcessError(this.b, error);
    }

    @Override // me.oriient.ipssdk.ips.ICalibrationListener
    public final void onCalibrationProgress(float f) {
        Long lValueOf;
        if (f >= 100.0f) {
            Long l = this.b.p;
            if (l != null) {
                lValueOf = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(PeriodicAutomaticCalibratorImpl.access$getTimeProvider(this.b).timeIntervalSinceNow(l.longValue())));
            } else {
                lValueOf = null;
            }
            ELog eLogAccess$getELog = PeriodicAutomaticCalibratorImpl.access$getELog(this.b);
            String str = this.b.n;
            if (str == null) {
                str = "Unknown";
            }
            eLogAccess$getELog.i("PeriodicAutomaticCalibrator", "Automatic calibration completed", MapsKt.j(new Pair("buildingId", str), new Pair("timeToCalibrate", Long.valueOf(lValueOf != null ? lValueOf.longValue() : 0L))));
            Positioning.INSTANCE.removeCalibrationListener(PeriodicAutomaticCalibratorImpl.access$getAutoCalibrationListener(this.b));
            PeriodicAutomaticCalibratorImpl.access$cancelBackgroundCalibrationTimeout(this.b);
        }
    }

    @Override // me.oriient.ipssdk.ips.ICalibrationListener
    public final void onCalibrationStateChanged(int i) {
        PeriodicAutomaticCalibratorImpl.access$getLogger(this.b).d("PeriodicAutomaticCalibrator", "onCalibrationStateChanged() called with: newState = " + i);
        Integer num = this.f26000a;
        if (num != null && num.intValue() == 3 && i == 0) {
            PeriodicAutomaticCalibratorImpl.access$getLogger(this.b).d("PeriodicAutomaticCalibrator", "Calibration stopped manually, removing autoCalibrationListener");
            Positioning.INSTANCE.removeCalibrationListener(PeriodicAutomaticCalibratorImpl.access$getAutoCalibrationListener(this.b));
            PeriodicAutomaticCalibratorImpl.access$cancelBackgroundCalibrationTimeout(this.b);
        }
        this.f26000a = Integer.valueOf(i);
    }
}
