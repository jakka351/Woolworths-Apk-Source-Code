package me.oriient.positioningengine.ondevice.models.calibration;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.common.z;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f26472a;
    public final String b;
    public final EngineCalibrationInfo c;
    public final c d;

    public b(long j, String sessionId, EngineCalibrationInfo calibrationInfo, c calibrationType) {
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(calibrationInfo, "calibrationInfo");
        Intrinsics.h(calibrationType, "calibrationType");
        this.f26472a = j;
        this.b = sessionId;
        this.c = calibrationInfo;
        this.d = calibrationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f26472a == bVar.f26472a && Intrinsics.c(this.b, bVar.b) && Intrinsics.c(this.c, bVar.c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + z.a(this.b, Long.hashCode(this.f26472a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "CalibrationRecord(timeCreatedInMillis=" + this.f26472a + ", sessionId=" + this.b + ", calibrationInfo=" + this.c + ", calibrationType=" + this.d + ')';
    }
}
