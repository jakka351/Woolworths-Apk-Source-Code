package me.oriient.internal.services.dataModel.sensors;

import YU.a;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.locationManager.J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\tHÆ\u0003JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lme/oriient/internal/services/dataModel/sensors/SensorConfig;", "", "timeJumpCorrectionThresholdsSec", "", "timeJumpWarningThresholdsSec", "sameValueThresholdSec", "forceCriticalPriority", "", "maxReportLatencyMicroSec", "", "(DDDLjava/lang/Boolean;I)V", "getForceCriticalPriority", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxReportLatencyMicroSec", "()I", "getSameValueThresholdSec", "()D", "getTimeJumpCorrectionThresholdsSec", "getTimeJumpWarningThresholdsSec", "component1", "component2", "component3", "component4", "component5", "copy", "(DDDLjava/lang/Boolean;I)Lme/oriient/internal/services/dataModel/sensors/SensorConfig;", "equals", "other", "hashCode", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SensorConfig {

    @Nullable
    private final Boolean forceCriticalPriority;
    private final int maxReportLatencyMicroSec;
    private final double sameValueThresholdSec;
    private final double timeJumpCorrectionThresholdsSec;
    private final double timeJumpWarningThresholdsSec;

    public SensorConfig(double d, double d2, double d3, @Nullable Boolean bool, int i) {
        this.timeJumpCorrectionThresholdsSec = d;
        this.timeJumpWarningThresholdsSec = d2;
        this.sameValueThresholdSec = d3;
        this.forceCriticalPriority = bool;
        this.maxReportLatencyMicroSec = i;
    }

    public static /* synthetic */ SensorConfig copy$default(SensorConfig sensorConfig, double d, double d2, double d3, Boolean bool, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = sensorConfig.timeJumpCorrectionThresholdsSec;
        }
        double d4 = d;
        if ((i2 & 2) != 0) {
            d2 = sensorConfig.timeJumpWarningThresholdsSec;
        }
        double d5 = d2;
        if ((i2 & 4) != 0) {
            d3 = sensorConfig.sameValueThresholdSec;
        }
        return sensorConfig.copy(d4, d5, d3, (i2 & 8) != 0 ? sensorConfig.forceCriticalPriority : bool, (i2 & 16) != 0 ? sensorConfig.maxReportLatencyMicroSec : i);
    }

    /* renamed from: component1, reason: from getter */
    public final double getTimeJumpCorrectionThresholdsSec() {
        return this.timeJumpCorrectionThresholdsSec;
    }

    /* renamed from: component2, reason: from getter */
    public final double getTimeJumpWarningThresholdsSec() {
        return this.timeJumpWarningThresholdsSec;
    }

    /* renamed from: component3, reason: from getter */
    public final double getSameValueThresholdSec() {
        return this.sameValueThresholdSec;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getForceCriticalPriority() {
        return this.forceCriticalPriority;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxReportLatencyMicroSec() {
        return this.maxReportLatencyMicroSec;
    }

    @NotNull
    public final SensorConfig copy(double timeJumpCorrectionThresholdsSec, double timeJumpWarningThresholdsSec, double sameValueThresholdSec, @Nullable Boolean forceCriticalPriority, int maxReportLatencyMicroSec) {
        return new SensorConfig(timeJumpCorrectionThresholdsSec, timeJumpWarningThresholdsSec, sameValueThresholdSec, forceCriticalPriority, maxReportLatencyMicroSec);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SensorConfig)) {
            return false;
        }
        SensorConfig sensorConfig = (SensorConfig) other;
        return Double.compare(this.timeJumpCorrectionThresholdsSec, sensorConfig.timeJumpCorrectionThresholdsSec) == 0 && Double.compare(this.timeJumpWarningThresholdsSec, sensorConfig.timeJumpWarningThresholdsSec) == 0 && Double.compare(this.sameValueThresholdSec, sensorConfig.sameValueThresholdSec) == 0 && Intrinsics.c(this.forceCriticalPriority, sensorConfig.forceCriticalPriority) && this.maxReportLatencyMicroSec == sensorConfig.maxReportLatencyMicroSec;
    }

    @Nullable
    public final Boolean getForceCriticalPriority() {
        return this.forceCriticalPriority;
    }

    public final int getMaxReportLatencyMicroSec() {
        return this.maxReportLatencyMicroSec;
    }

    public final double getSameValueThresholdSec() {
        return this.sameValueThresholdSec;
    }

    public final double getTimeJumpCorrectionThresholdsSec() {
        return this.timeJumpCorrectionThresholdsSec;
    }

    public final double getTimeJumpWarningThresholdsSec() {
        return this.timeJumpWarningThresholdsSec;
    }

    public int hashCode() {
        int iA = J.a(this.sameValueThresholdSec, J.a(this.timeJumpWarningThresholdsSec, Double.hashCode(this.timeJumpCorrectionThresholdsSec) * 31, 31), 31);
        Boolean bool = this.forceCriticalPriority;
        return Integer.hashCode(this.maxReportLatencyMicroSec) + ((iA + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SensorConfig(timeJumpCorrectionThresholdsSec=");
        sb.append(this.timeJumpCorrectionThresholdsSec);
        sb.append(", timeJumpWarningThresholdsSec=");
        sb.append(this.timeJumpWarningThresholdsSec);
        sb.append(", sameValueThresholdSec=");
        sb.append(this.sameValueThresholdSec);
        sb.append(", forceCriticalPriority=");
        sb.append(this.forceCriticalPriority);
        sb.append(", maxReportLatencyMicroSec=");
        return a.l(sb, this.maxReportLatencyMicroSec, ')');
    }
}
