package me.oriient.positioningengine.ondevice.util.locationReporter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.common.w;
import me.oriient.positioningengine.common.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006'"}, d2 = {"Lme/oriient/positioningengine/ondevice/util/locationReporter/LocationReporterConfig;", "", "apiKey", "", "spaceId", "reportingIntervalMillis", "", "reportingTimeoutMillis", "timeoutsToFail", "", "queueLimit", "connectionRetryInitialIntervalMillis", "connectionRetryMaxIntervalMillis", "(Ljava/lang/String;Ljava/lang/String;JJIIJJ)V", "getApiKey", "()Ljava/lang/String;", "getConnectionRetryInitialIntervalMillis", "()J", "getConnectionRetryMaxIntervalMillis", "getQueueLimit", "()I", "getReportingIntervalMillis", "getReportingTimeoutMillis", "getSpaceId", "getTimeoutsToFail", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class LocationReporterConfig {

    @NotNull
    private final String apiKey;
    private final long connectionRetryInitialIntervalMillis;
    private final long connectionRetryMaxIntervalMillis;
    private final int queueLimit;
    private final long reportingIntervalMillis;
    private final long reportingTimeoutMillis;

    @NotNull
    private final String spaceId;
    private final int timeoutsToFail;

    public LocationReporterConfig(@NotNull String apiKey, @NotNull String spaceId, long j, long j2, int i, int i2, long j3, long j4) {
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(spaceId, "spaceId");
        this.apiKey = apiKey;
        this.spaceId = spaceId;
        this.reportingIntervalMillis = j;
        this.reportingTimeoutMillis = j2;
        this.timeoutsToFail = i;
        this.queueLimit = i2;
        this.connectionRetryInitialIntervalMillis = j3;
        this.connectionRetryMaxIntervalMillis = j4;
    }

    public static /* synthetic */ LocationReporterConfig copy$default(LocationReporterConfig locationReporterConfig, String str, String str2, long j, long j2, int i, int i2, long j3, long j4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = locationReporterConfig.apiKey;
        }
        if ((i3 & 2) != 0) {
            str2 = locationReporterConfig.spaceId;
        }
        if ((i3 & 4) != 0) {
            j = locationReporterConfig.reportingIntervalMillis;
        }
        if ((i3 & 8) != 0) {
            j2 = locationReporterConfig.reportingTimeoutMillis;
        }
        if ((i3 & 16) != 0) {
            i = locationReporterConfig.timeoutsToFail;
        }
        if ((i3 & 32) != 0) {
            i2 = locationReporterConfig.queueLimit;
        }
        if ((i3 & 64) != 0) {
            j3 = locationReporterConfig.connectionRetryInitialIntervalMillis;
        }
        if ((i3 & 128) != 0) {
            j4 = locationReporterConfig.connectionRetryMaxIntervalMillis;
        }
        long j5 = j4;
        long j6 = j2;
        long j7 = j;
        return locationReporterConfig.copy(str, str2, j7, j6, i, i2, j3, j5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getReportingIntervalMillis() {
        return this.reportingIntervalMillis;
    }

    /* renamed from: component4, reason: from getter */
    public final long getReportingTimeoutMillis() {
        return this.reportingTimeoutMillis;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTimeoutsToFail() {
        return this.timeoutsToFail;
    }

    /* renamed from: component6, reason: from getter */
    public final int getQueueLimit() {
        return this.queueLimit;
    }

    /* renamed from: component7, reason: from getter */
    public final long getConnectionRetryInitialIntervalMillis() {
        return this.connectionRetryInitialIntervalMillis;
    }

    /* renamed from: component8, reason: from getter */
    public final long getConnectionRetryMaxIntervalMillis() {
        return this.connectionRetryMaxIntervalMillis;
    }

    @NotNull
    public final LocationReporterConfig copy(@NotNull String apiKey, @NotNull String spaceId, long reportingIntervalMillis, long reportingTimeoutMillis, int timeoutsToFail, int queueLimit, long connectionRetryInitialIntervalMillis, long connectionRetryMaxIntervalMillis) {
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(spaceId, "spaceId");
        return new LocationReporterConfig(apiKey, spaceId, reportingIntervalMillis, reportingTimeoutMillis, timeoutsToFail, queueLimit, connectionRetryInitialIntervalMillis, connectionRetryMaxIntervalMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationReporterConfig)) {
            return false;
        }
        LocationReporterConfig locationReporterConfig = (LocationReporterConfig) other;
        return Intrinsics.c(this.apiKey, locationReporterConfig.apiKey) && Intrinsics.c(this.spaceId, locationReporterConfig.spaceId) && this.reportingIntervalMillis == locationReporterConfig.reportingIntervalMillis && this.reportingTimeoutMillis == locationReporterConfig.reportingTimeoutMillis && this.timeoutsToFail == locationReporterConfig.timeoutsToFail && this.queueLimit == locationReporterConfig.queueLimit && this.connectionRetryInitialIntervalMillis == locationReporterConfig.connectionRetryInitialIntervalMillis && this.connectionRetryMaxIntervalMillis == locationReporterConfig.connectionRetryMaxIntervalMillis;
    }

    @NotNull
    public final String getApiKey() {
        return this.apiKey;
    }

    public final long getConnectionRetryInitialIntervalMillis() {
        return this.connectionRetryInitialIntervalMillis;
    }

    public final long getConnectionRetryMaxIntervalMillis() {
        return this.connectionRetryMaxIntervalMillis;
    }

    public final int getQueueLimit() {
        return this.queueLimit;
    }

    public final long getReportingIntervalMillis() {
        return this.reportingIntervalMillis;
    }

    public final long getReportingTimeoutMillis() {
        return this.reportingTimeoutMillis;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    public final int getTimeoutsToFail() {
        return this.timeoutsToFail;
    }

    public int hashCode() {
        return Long.hashCode(this.connectionRetryMaxIntervalMillis) + w.a(this.connectionRetryInitialIntervalMillis, androidx.camera.core.impl.b.a(this.queueLimit, androidx.camera.core.impl.b.a(this.timeoutsToFail, w.a(this.reportingTimeoutMillis, w.a(this.reportingIntervalMillis, z.a(this.spaceId, this.apiKey.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LocationReporterConfig(apiKey=");
        sb.append(this.apiKey);
        sb.append(", spaceId=");
        sb.append(this.spaceId);
        sb.append(", reportingIntervalMillis=");
        sb.append(this.reportingIntervalMillis);
        sb.append(", reportingTimeoutMillis=");
        sb.append(this.reportingTimeoutMillis);
        sb.append(", timeoutsToFail=");
        sb.append(this.timeoutsToFail);
        sb.append(", queueLimit=");
        sb.append(this.queueLimit);
        sb.append(", connectionRetryInitialIntervalMillis=");
        sb.append(this.connectionRetryInitialIntervalMillis);
        sb.append(", connectionRetryMaxIntervalMillis=");
        return androidx.camera.core.impl.b.q(sb, this.connectionRetryMaxIntervalMillis, ')');
    }
}
