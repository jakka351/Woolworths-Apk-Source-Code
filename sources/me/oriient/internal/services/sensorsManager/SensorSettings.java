package me.oriient.internal.services.sensorsManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JB\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006 "}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorSettings;", "", "forceCritical", "", "correctionThresholdMillis", "", "warningThresholdMillis", "sameValueThresholdMillis", "maxReportLatencyMicroSec", "", "(Ljava/lang/Boolean;JJJI)V", "getCorrectionThresholdMillis", "()J", "getForceCritical", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxReportLatencyMicroSec", "()I", "getSameValueThresholdMillis", "getWarningThresholdMillis", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;JJJI)Lme/oriient/internal/services/sensorsManager/SensorSettings;", "equals", "other", "hashCode", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SensorSettings {
    private final long correctionThresholdMillis;

    @Nullable
    private final Boolean forceCritical;
    private final int maxReportLatencyMicroSec;
    private final long sameValueThresholdMillis;
    private final long warningThresholdMillis;

    public SensorSettings(@Nullable Boolean bool, long j, long j2, long j3, int i) {
        this.forceCritical = bool;
        this.correctionThresholdMillis = j;
        this.warningThresholdMillis = j2;
        this.sameValueThresholdMillis = j3;
        this.maxReportLatencyMicroSec = i;
    }

    public static /* synthetic */ SensorSettings copy$default(SensorSettings sensorSettings, Boolean bool, long j, long j2, long j3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = sensorSettings.forceCritical;
        }
        if ((i2 & 2) != 0) {
            j = sensorSettings.correctionThresholdMillis;
        }
        if ((i2 & 4) != 0) {
            j2 = sensorSettings.warningThresholdMillis;
        }
        if ((i2 & 8) != 0) {
            j3 = sensorSettings.sameValueThresholdMillis;
        }
        if ((i2 & 16) != 0) {
            i = sensorSettings.maxReportLatencyMicroSec;
        }
        int i3 = i;
        long j4 = j3;
        return sensorSettings.copy(bool, j, j2, j4, i3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getForceCritical() {
        return this.forceCritical;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCorrectionThresholdMillis() {
        return this.correctionThresholdMillis;
    }

    /* renamed from: component3, reason: from getter */
    public final long getWarningThresholdMillis() {
        return this.warningThresholdMillis;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSameValueThresholdMillis() {
        return this.sameValueThresholdMillis;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxReportLatencyMicroSec() {
        return this.maxReportLatencyMicroSec;
    }

    @NotNull
    public final SensorSettings copy(@Nullable Boolean forceCritical, long correctionThresholdMillis, long warningThresholdMillis, long sameValueThresholdMillis, int maxReportLatencyMicroSec) {
        return new SensorSettings(forceCritical, correctionThresholdMillis, warningThresholdMillis, sameValueThresholdMillis, maxReportLatencyMicroSec);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SensorSettings)) {
            return false;
        }
        SensorSettings sensorSettings = (SensorSettings) other;
        return Intrinsics.c(this.forceCritical, sensorSettings.forceCritical) && this.correctionThresholdMillis == sensorSettings.correctionThresholdMillis && this.warningThresholdMillis == sensorSettings.warningThresholdMillis && this.sameValueThresholdMillis == sensorSettings.sameValueThresholdMillis && this.maxReportLatencyMicroSec == sensorSettings.maxReportLatencyMicroSec;
    }

    public final long getCorrectionThresholdMillis() {
        return this.correctionThresholdMillis;
    }

    @Nullable
    public final Boolean getForceCritical() {
        return this.forceCritical;
    }

    public final int getMaxReportLatencyMicroSec() {
        return this.maxReportLatencyMicroSec;
    }

    public final long getSameValueThresholdMillis() {
        return this.sameValueThresholdMillis;
    }

    public final long getWarningThresholdMillis() {
        return this.warningThresholdMillis;
    }

    public int hashCode() {
        Boolean bool = this.forceCritical;
        return Integer.hashCode(this.maxReportLatencyMicroSec) + me.oriient.internal.infra.locationManager.K.a(this.sameValueThresholdMillis, me.oriient.internal.infra.locationManager.K.a(this.warningThresholdMillis, me.oriient.internal.infra.locationManager.K.a(this.correctionThresholdMillis, (bool == null ? 0 : bool.hashCode()) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SensorSettings(forceCritical=");
        sb.append(this.forceCritical);
        sb.append(", correctionThresholdMillis=");
        sb.append(this.correctionThresholdMillis);
        sb.append(", warningThresholdMillis=");
        sb.append(this.warningThresholdMillis);
        sb.append(", sameValueThresholdMillis=");
        sb.append(this.sameValueThresholdMillis);
        sb.append(", maxReportLatencyMicroSec=");
        return YU.a.l(sb, this.maxReportLatencyMicroSec, ')');
    }

    public /* synthetic */ SensorSettings(Boolean bool, long j, long j2, long j3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : bool, j, j2, j3, i);
    }
}
