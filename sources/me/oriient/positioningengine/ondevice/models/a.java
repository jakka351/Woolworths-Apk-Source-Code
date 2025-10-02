package me.oriient.positioningengine.ondevice.models;

import me.oriient.positioningengine.common.w;

/* loaded from: classes8.dex */
public final class a implements EnginePerformanceReport {

    /* renamed from: a, reason: collision with root package name */
    public long f26470a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    public /* synthetic */ a() {
        this(-1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f26470a == aVar.f26470a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EnginePerformanceReport
    public final long getAverageLagTimeAfterFirstLock() {
        return this.g;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EnginePerformanceReport
    public final long getAverageLagTimeBeforeFirstLock() {
        return this.e;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EnginePerformanceReport
    public final long getAverageProcessingTimeAfterFirstLock() {
        return this.c;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EnginePerformanceReport
    public final long getAverageProcessingTimeBeforeFirstLock() {
        return this.f26470a;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EnginePerformanceReport
    public final long getMaxLagTimeAfterFirstLock() {
        return this.h;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EnginePerformanceReport
    public final long getMaxLagTimeBeforeFirstLock() {
        return this.f;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EnginePerformanceReport
    public final long getMaxProcessingTimeAfterFirstLock() {
        return this.d;
    }

    @Override // me.oriient.positioningengine.ondevice.models.EnginePerformanceReport
    public final long getMaxProcessingTimeBeforeFirstLock() {
        return this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + w.a(this.g, w.a(this.f, w.a(this.e, w.a(this.d, w.a(this.c, w.a(this.b, Long.hashCode(this.f26470a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableEnginePerformanceReport(averageProcessingTimeBeforeFirstLock=");
        sb.append(this.f26470a);
        sb.append(", maxProcessingTimeBeforeFirstLock=");
        sb.append(this.b);
        sb.append(", averageProcessingTimeAfterFirstLock=");
        sb.append(this.c);
        sb.append(", maxProcessingTimeAfterFirstLock=");
        sb.append(this.d);
        sb.append(", averageLagTimeBeforeFirstLock=");
        sb.append(this.e);
        sb.append(", maxLagTimeBeforeFirstLock=");
        sb.append(this.f);
        sb.append(", averageLagTimeAfterFirstLock=");
        sb.append(this.g);
        sb.append(", maxLagTimeAfterFirstLock=");
        return androidx.camera.core.impl.b.q(sb, this.h, ')');
    }

    public a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f26470a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }
}
