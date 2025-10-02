package me.oriient.internal.services.sensorsManager.support;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;

/* loaded from: classes7.dex */
public final class h implements SupportSensorsManager.SensorIssuesCounter {

    /* renamed from: a, reason: collision with root package name */
    public final SystemSensor f25596a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;

    public h(SystemSensor sensor) {
        Intrinsics.h(sensor, "sensor");
        this.f25596a = sensor;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = false;
        this.i = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f25596a == hVar.f25596a && this.b == hVar.b && this.c == hVar.c && this.d == hVar.d && this.e == hVar.e && this.f == hVar.f && this.g == hVar.g && this.h == hVar.h && this.i == hVar.i;
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
        return this.f25596a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + me.oriient.internal.infra.scheduler.a.a(this.h, me.oriient.internal.infra.scheduler.a.a(this.g, me.oriient.internal.services.config.a.a(this.f, me.oriient.internal.services.config.a.a(this.e, me.oriient.internal.services.config.a.a(this.d, me.oriient.internal.services.config.a.a(this.c, me.oriient.internal.services.config.a.a(this.b, this.f25596a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SensorIssuesTracker(sensor=");
        sb.append(this.f25596a);
        sb.append(", numFreezes=");
        sb.append(this.b);
        sb.append(", numZeros=");
        sb.append(this.c);
        sb.append(", numNan=");
        sb.append(this.d);
        sb.append(", numStuck=");
        sb.append(this.e);
        sb.append(", numClockCorrections=");
        sb.append(this.f);
        sb.append(", handledStuckError=");
        sb.append(this.g);
        sb.append(", handledEmptyError=");
        sb.append(this.h);
        sb.append(", handledNaNError=");
        return androidx.camera.core.impl.b.s(sb, this.i, ')');
    }
}
