package me.oriient.ipssdk.base.remoteconfig;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ`\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\u0011R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010\u000f¨\u00063"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/ELogConfig;", "", "", "shouldUseELog", "", "eLogLevel", "metricsLevel", "eLogQueueSize", "eLogReportAttemptsLimit", "eLogLevelSendingBatchSize", "eLogLevelSendingIntervalSeconds", "considerGeofenceAlwaysInside", "<init>", "(ZIIIIIIZ)V", "component1", "()Z", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZIIIIIIZ)Lme/oriient/ipssdk/base/remoteconfig/ELogConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getShouldUseELog", "b", "I", "getELogLevel", "c", "getMetricsLevel", "d", "getELogQueueSize", "e", "getELogReportAttemptsLimit", "f", "getELogLevelSendingBatchSize", "g", "getELogLevelSendingIntervalSeconds", "h", "getConsiderGeofenceAlwaysInside", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ELogConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldUseELog;

    /* renamed from: b, reason: from kotlin metadata */
    private final int eLogLevel;

    /* renamed from: c, reason: from kotlin metadata */
    private final int metricsLevel;

    /* renamed from: d, reason: from kotlin metadata */
    private final int eLogQueueSize;

    /* renamed from: e, reason: from kotlin metadata */
    private final int eLogReportAttemptsLimit;

    /* renamed from: f, reason: from kotlin metadata */
    private final int eLogLevelSendingBatchSize;

    /* renamed from: g, reason: from kotlin metadata */
    private final int eLogLevelSendingIntervalSeconds;

    /* renamed from: h, reason: from kotlin metadata */
    private final boolean considerGeofenceAlwaysInside;

    public ELogConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        this.shouldUseELog = z;
        this.eLogLevel = i;
        this.metricsLevel = i2;
        this.eLogQueueSize = i3;
        this.eLogReportAttemptsLimit = i4;
        this.eLogLevelSendingBatchSize = i5;
        this.eLogLevelSendingIntervalSeconds = i6;
        this.considerGeofenceAlwaysInside = z2;
    }

    public static /* synthetic */ ELogConfig copy$default(ELogConfig eLogConfig, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z = eLogConfig.shouldUseELog;
        }
        if ((i7 & 2) != 0) {
            i = eLogConfig.eLogLevel;
        }
        if ((i7 & 4) != 0) {
            i2 = eLogConfig.metricsLevel;
        }
        if ((i7 & 8) != 0) {
            i3 = eLogConfig.eLogQueueSize;
        }
        if ((i7 & 16) != 0) {
            i4 = eLogConfig.eLogReportAttemptsLimit;
        }
        if ((i7 & 32) != 0) {
            i5 = eLogConfig.eLogLevelSendingBatchSize;
        }
        if ((i7 & 64) != 0) {
            i6 = eLogConfig.eLogLevelSendingIntervalSeconds;
        }
        if ((i7 & 128) != 0) {
            z2 = eLogConfig.considerGeofenceAlwaysInside;
        }
        int i8 = i6;
        boolean z3 = z2;
        int i9 = i4;
        int i10 = i5;
        return eLogConfig.copy(z, i, i2, i3, i9, i10, i8, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShouldUseELog() {
        return this.shouldUseELog;
    }

    /* renamed from: component2, reason: from getter */
    public final int getELogLevel() {
        return this.eLogLevel;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMetricsLevel() {
        return this.metricsLevel;
    }

    /* renamed from: component4, reason: from getter */
    public final int getELogQueueSize() {
        return this.eLogQueueSize;
    }

    /* renamed from: component5, reason: from getter */
    public final int getELogReportAttemptsLimit() {
        return this.eLogReportAttemptsLimit;
    }

    /* renamed from: component6, reason: from getter */
    public final int getELogLevelSendingBatchSize() {
        return this.eLogLevelSendingBatchSize;
    }

    /* renamed from: component7, reason: from getter */
    public final int getELogLevelSendingIntervalSeconds() {
        return this.eLogLevelSendingIntervalSeconds;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getConsiderGeofenceAlwaysInside() {
        return this.considerGeofenceAlwaysInside;
    }

    @NotNull
    public final ELogConfig copy(boolean shouldUseELog, int eLogLevel, int metricsLevel, int eLogQueueSize, int eLogReportAttemptsLimit, int eLogLevelSendingBatchSize, int eLogLevelSendingIntervalSeconds, boolean considerGeofenceAlwaysInside) {
        return new ELogConfig(shouldUseELog, eLogLevel, metricsLevel, eLogQueueSize, eLogReportAttemptsLimit, eLogLevelSendingBatchSize, eLogLevelSendingIntervalSeconds, considerGeofenceAlwaysInside);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ELogConfig)) {
            return false;
        }
        ELogConfig eLogConfig = (ELogConfig) other;
        return this.shouldUseELog == eLogConfig.shouldUseELog && this.eLogLevel == eLogConfig.eLogLevel && this.metricsLevel == eLogConfig.metricsLevel && this.eLogQueueSize == eLogConfig.eLogQueueSize && this.eLogReportAttemptsLimit == eLogConfig.eLogReportAttemptsLimit && this.eLogLevelSendingBatchSize == eLogConfig.eLogLevelSendingBatchSize && this.eLogLevelSendingIntervalSeconds == eLogConfig.eLogLevelSendingIntervalSeconds && this.considerGeofenceAlwaysInside == eLogConfig.considerGeofenceAlwaysInside;
    }

    public final boolean getConsiderGeofenceAlwaysInside() {
        return this.considerGeofenceAlwaysInside;
    }

    public final int getELogLevel() {
        return this.eLogLevel;
    }

    public final int getELogLevelSendingBatchSize() {
        return this.eLogLevelSendingBatchSize;
    }

    public final int getELogLevelSendingIntervalSeconds() {
        return this.eLogLevelSendingIntervalSeconds;
    }

    public final int getELogQueueSize() {
        return this.eLogQueueSize;
    }

    public final int getELogReportAttemptsLimit() {
        return this.eLogReportAttemptsLimit;
    }

    public final int getMetricsLevel() {
        return this.metricsLevel;
    }

    public final boolean getShouldUseELog() {
        return this.shouldUseELog;
    }

    public int hashCode() {
        return Boolean.hashCode(this.considerGeofenceAlwaysInside) + androidx.camera.core.impl.b.a(this.eLogLevelSendingIntervalSeconds, androidx.camera.core.impl.b.a(this.eLogLevelSendingBatchSize, androidx.camera.core.impl.b.a(this.eLogReportAttemptsLimit, androidx.camera.core.impl.b.a(this.eLogQueueSize, androidx.camera.core.impl.b.a(this.metricsLevel, androidx.camera.core.impl.b.a(this.eLogLevel, Boolean.hashCode(this.shouldUseELog) * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ELogConfig(shouldUseELog=");
        sb.append(this.shouldUseELog);
        sb.append(", eLogLevel=");
        sb.append(this.eLogLevel);
        sb.append(", metricsLevel=");
        sb.append(this.metricsLevel);
        sb.append(", eLogQueueSize=");
        sb.append(this.eLogQueueSize);
        sb.append(", eLogReportAttemptsLimit=");
        sb.append(this.eLogReportAttemptsLimit);
        sb.append(", eLogLevelSendingBatchSize=");
        sb.append(this.eLogLevelSendingBatchSize);
        sb.append(", eLogLevelSendingIntervalSeconds=");
        sb.append(this.eLogLevelSendingIntervalSeconds);
        sb.append(", considerGeofenceAlwaysInside=");
        return androidx.camera.core.impl.b.s(sb, this.considerGeofenceAlwaysInside, ')');
    }
}
