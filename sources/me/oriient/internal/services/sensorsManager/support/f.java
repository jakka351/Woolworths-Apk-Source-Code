package me.oriient.internal.services.sensorsManager.support;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;

/* loaded from: classes7.dex */
public final class f implements SupportSensorsManager.SensorIssuesCounter {

    /* renamed from: a, reason: collision with root package name */
    public final SystemSensor f25594a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public f(SystemSensor sensor, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.h(sensor, "sensor");
        this.f25594a = sensor;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f25594a == fVar.f25594a && this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager.SensorIssuesCounter
    public final int getNumClockCorrections() {
        return this.f;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager.SensorIssuesCounter
    public final int getNumFreezes() {
        return this.b;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager.SensorIssuesCounter
    public final int getNumNan() {
        return this.d;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager.SensorIssuesCounter
    public final int getNumStuck() {
        return this.e;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager.SensorIssuesCounter
    public final int getNumZeros() {
        return this.c;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager.SensorIssuesCounter
    public final SystemSensor getSensor() {
        return this.f25594a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + me.oriient.internal.services.config.a.a(this.e, me.oriient.internal.services.config.a.a(this.d, me.oriient.internal.services.config.a.a(this.c, me.oriient.internal.services.config.a.a(this.b, this.f25594a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SensorIssuesCounterImpl(sensor=");
        sb.append(this.f25594a);
        sb.append(", numFreezes=");
        sb.append(this.b);
        sb.append(", numZeros=");
        sb.append(this.c);
        sb.append(", numNan=");
        sb.append(this.d);
        sb.append(", numStuck=");
        sb.append(this.e);
        sb.append(", numClockCorrections=");
        return YU.a.l(sb, this.f, ')');
    }
}
