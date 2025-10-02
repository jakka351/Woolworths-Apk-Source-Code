package com.dynatrace.android.agent.measurement;

import androidx.camera.core.impl.b;

/* loaded from: classes.dex */
public class MeasurementPoint {

    /* renamed from: a, reason: collision with root package name */
    public final long f14128a;
    public final int b;

    public MeasurementPoint(long j, int i) {
        this.f14128a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MeasurementPoint measurementPoint = (MeasurementPoint) obj;
            if (this.b == measurementPoint.b && this.f14128a == measurementPoint.f14128a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        long j = this.f14128a;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MeasurementPoint{sequenceNumber=");
        sb.append(this.b);
        sb.append(", timestamp=");
        return b.q(sb, this.f14128a, '}');
    }
}
