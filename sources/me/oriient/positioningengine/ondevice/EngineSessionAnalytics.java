package me.oriient.positioningengine.ondevice;

import androidx.annotation.Keep;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lme/oriient/positioningengine/ondevice/EngineSessionAnalytics;", "", "duration", "", "freePathLength", "timeJumpsCount", "maxTimeJumps", "", "timeFreezesCount", "accelIsMissingAccumTimeSec", "gyroIsMissingAccumTimeSec", "(DDD[DDDD)V", "getAccelIsMissingAccumTimeSec", "()D", "getDuration", "getFreePathLength", "getGyroIsMissingAccumTimeSec", "getMaxTimeJumps", "()[D", "getTimeFreezesCount", "getTimeJumpsCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EngineSessionAnalytics {
    private final double accelIsMissingAccumTimeSec;
    private final double duration;
    private final double freePathLength;
    private final double gyroIsMissingAccumTimeSec;

    @NotNull
    private final double[] maxTimeJumps;
    private final double timeFreezesCount;
    private final double timeJumpsCount;

    public EngineSessionAnalytics(double d, double d2, double d3, @NotNull double[] maxTimeJumps, double d4, double d5, double d6) {
        Intrinsics.h(maxTimeJumps, "maxTimeJumps");
        this.duration = d;
        this.freePathLength = d2;
        this.timeJumpsCount = d3;
        this.maxTimeJumps = maxTimeJumps;
        this.timeFreezesCount = d4;
        this.accelIsMissingAccumTimeSec = d5;
        this.gyroIsMissingAccumTimeSec = d6;
    }

    /* renamed from: component1, reason: from getter */
    public final double getDuration() {
        return this.duration;
    }

    /* renamed from: component2, reason: from getter */
    public final double getFreePathLength() {
        return this.freePathLength;
    }

    /* renamed from: component3, reason: from getter */
    public final double getTimeJumpsCount() {
        return this.timeJumpsCount;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final double[] getMaxTimeJumps() {
        return this.maxTimeJumps;
    }

    /* renamed from: component5, reason: from getter */
    public final double getTimeFreezesCount() {
        return this.timeFreezesCount;
    }

    /* renamed from: component6, reason: from getter */
    public final double getAccelIsMissingAccumTimeSec() {
        return this.accelIsMissingAccumTimeSec;
    }

    /* renamed from: component7, reason: from getter */
    public final double getGyroIsMissingAccumTimeSec() {
        return this.gyroIsMissingAccumTimeSec;
    }

    @NotNull
    public final EngineSessionAnalytics copy(double duration, double freePathLength, double timeJumpsCount, @NotNull double[] maxTimeJumps, double timeFreezesCount, double accelIsMissingAccumTimeSec, double gyroIsMissingAccumTimeSec) {
        Intrinsics.h(maxTimeJumps, "maxTimeJumps");
        return new EngineSessionAnalytics(duration, freePathLength, timeJumpsCount, maxTimeJumps, timeFreezesCount, accelIsMissingAccumTimeSec, gyroIsMissingAccumTimeSec);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EngineSessionAnalytics)) {
            return false;
        }
        EngineSessionAnalytics engineSessionAnalytics = (EngineSessionAnalytics) other;
        return this.duration == engineSessionAnalytics.duration && this.freePathLength == engineSessionAnalytics.freePathLength && this.timeJumpsCount == engineSessionAnalytics.timeJumpsCount && Arrays.equals(this.maxTimeJumps, engineSessionAnalytics.maxTimeJumps) && this.timeFreezesCount == engineSessionAnalytics.timeFreezesCount && this.accelIsMissingAccumTimeSec == engineSessionAnalytics.accelIsMissingAccumTimeSec && this.gyroIsMissingAccumTimeSec == engineSessionAnalytics.gyroIsMissingAccumTimeSec;
    }

    public final double getAccelIsMissingAccumTimeSec() {
        return this.accelIsMissingAccumTimeSec;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final double getFreePathLength() {
        return this.freePathLength;
    }

    public final double getGyroIsMissingAccumTimeSec() {
        return this.gyroIsMissingAccumTimeSec;
    }

    @NotNull
    public final double[] getMaxTimeJumps() {
        return this.maxTimeJumps;
    }

    public final double getTimeFreezesCount() {
        return this.timeFreezesCount;
    }

    public final double getTimeJumpsCount() {
        return this.timeJumpsCount;
    }

    public int hashCode() {
        return Double.hashCode(this.gyroIsMissingAccumTimeSec) + me.oriient.positioningengine.common.v.a(this.accelIsMissingAccumTimeSec, me.oriient.positioningengine.common.v.a(this.timeFreezesCount, (Arrays.hashCode(this.maxTimeJumps) + me.oriient.positioningengine.common.v.a(this.timeJumpsCount, me.oriient.positioningengine.common.v.a(this.freePathLength, Double.hashCode(this.duration) * 31, 31), 31)) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EngineSessionAnalytics(duration=");
        sb.append(this.duration);
        sb.append(", freePathLength=");
        sb.append(this.freePathLength);
        sb.append(", timeJumpsCount=");
        sb.append(this.timeJumpsCount);
        sb.append(", maxTimeJumps=");
        sb.append(Arrays.toString(this.maxTimeJumps));
        sb.append(", timeFreezesCount=");
        sb.append(this.timeFreezesCount);
        sb.append(", accelIsMissingAccumTimeSec=");
        sb.append(this.accelIsMissingAccumTimeSec);
        sb.append(", gyroIsMissingAccumTimeSec=");
        return me.oriient.positioningengine.common.a.a(sb, this.gyroIsMissingAccumTimeSec, ')');
    }
}
