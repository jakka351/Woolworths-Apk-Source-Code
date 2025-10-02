package me.oriient.internal.services.sensorsManager.support;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.sensorsManager.SensorManagerError;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManagerError f25592a;
    public final boolean b;

    public b(SensorManagerError sensorManagerError, boolean z) {
        this.f25592a = sensorManagerError;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.f25592a, bVar.f25592a) && this.b == bVar.b;
    }

    public final int hashCode() {
        SensorManagerError sensorManagerError = this.f25592a;
        return Boolean.hashCode(this.b) + ((sensorManagerError == null ? 0 : sensorManagerError.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SampleErrorReport(stopError=");
        sb.append(this.f25592a);
        sb.append(", canSampleBeGivenToEngine=");
        return androidx.camera.core.impl.b.s(sb, this.b, ')');
    }
}
