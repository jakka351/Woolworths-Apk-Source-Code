package me.oriient.internal.services.uploadingManager.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadingSchedulingConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploadManagerConfig;", "", "writeToFileRecords", "", "writeToFileIntervalMillis", "", "chunkLengthSeconds", "maxSessionLengthMin", "uploadingExpirationTimeDays", "", "schedulingConfig", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadingSchedulingConfig;", "(IJJJDLme/oriient/internal/services/uploadingManager/scheduling/DataUploadingSchedulingConfig;)V", "getChunkLengthSeconds", "()J", "getMaxSessionLengthMin", "getSchedulingConfig", "()Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadingSchedulingConfig;", "getUploadingExpirationTimeDays", "()D", "getWriteToFileIntervalMillis", "getWriteToFileRecords", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DataUploadManagerConfig {
    private final long chunkLengthSeconds;
    private final long maxSessionLengthMin;

    @NotNull
    private final DataUploadingSchedulingConfig schedulingConfig;
    private final double uploadingExpirationTimeDays;
    private final long writeToFileIntervalMillis;
    private final int writeToFileRecords;

    public DataUploadManagerConfig(int i, long j, long j2, long j3, double d, @NotNull DataUploadingSchedulingConfig schedulingConfig) {
        Intrinsics.h(schedulingConfig, "schedulingConfig");
        this.writeToFileRecords = i;
        this.writeToFileIntervalMillis = j;
        this.chunkLengthSeconds = j2;
        this.maxSessionLengthMin = j3;
        this.uploadingExpirationTimeDays = d;
        this.schedulingConfig = schedulingConfig;
    }

    public static /* synthetic */ DataUploadManagerConfig copy$default(DataUploadManagerConfig dataUploadManagerConfig, int i, long j, long j2, long j3, double d, DataUploadingSchedulingConfig dataUploadingSchedulingConfig, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dataUploadManagerConfig.writeToFileRecords;
        }
        if ((i2 & 2) != 0) {
            j = dataUploadManagerConfig.writeToFileIntervalMillis;
        }
        if ((i2 & 4) != 0) {
            j2 = dataUploadManagerConfig.chunkLengthSeconds;
        }
        if ((i2 & 8) != 0) {
            j3 = dataUploadManagerConfig.maxSessionLengthMin;
        }
        if ((i2 & 16) != 0) {
            d = dataUploadManagerConfig.uploadingExpirationTimeDays;
        }
        if ((i2 & 32) != 0) {
            dataUploadingSchedulingConfig = dataUploadManagerConfig.schedulingConfig;
        }
        DataUploadingSchedulingConfig dataUploadingSchedulingConfig2 = dataUploadingSchedulingConfig;
        double d2 = d;
        long j4 = j3;
        return dataUploadManagerConfig.copy(i, j, j2, j4, d2, dataUploadingSchedulingConfig2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWriteToFileRecords() {
        return this.writeToFileRecords;
    }

    /* renamed from: component2, reason: from getter */
    public final long getWriteToFileIntervalMillis() {
        return this.writeToFileIntervalMillis;
    }

    /* renamed from: component3, reason: from getter */
    public final long getChunkLengthSeconds() {
        return this.chunkLengthSeconds;
    }

    /* renamed from: component4, reason: from getter */
    public final long getMaxSessionLengthMin() {
        return this.maxSessionLengthMin;
    }

    /* renamed from: component5, reason: from getter */
    public final double getUploadingExpirationTimeDays() {
        return this.uploadingExpirationTimeDays;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final DataUploadingSchedulingConfig getSchedulingConfig() {
        return this.schedulingConfig;
    }

    @NotNull
    public final DataUploadManagerConfig copy(int writeToFileRecords, long writeToFileIntervalMillis, long chunkLengthSeconds, long maxSessionLengthMin, double uploadingExpirationTimeDays, @NotNull DataUploadingSchedulingConfig schedulingConfig) {
        Intrinsics.h(schedulingConfig, "schedulingConfig");
        return new DataUploadManagerConfig(writeToFileRecords, writeToFileIntervalMillis, chunkLengthSeconds, maxSessionLengthMin, uploadingExpirationTimeDays, schedulingConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataUploadManagerConfig)) {
            return false;
        }
        DataUploadManagerConfig dataUploadManagerConfig = (DataUploadManagerConfig) other;
        return this.writeToFileRecords == dataUploadManagerConfig.writeToFileRecords && this.writeToFileIntervalMillis == dataUploadManagerConfig.writeToFileIntervalMillis && this.chunkLengthSeconds == dataUploadManagerConfig.chunkLengthSeconds && this.maxSessionLengthMin == dataUploadManagerConfig.maxSessionLengthMin && Double.compare(this.uploadingExpirationTimeDays, dataUploadManagerConfig.uploadingExpirationTimeDays) == 0 && Intrinsics.c(this.schedulingConfig, dataUploadManagerConfig.schedulingConfig);
    }

    public final long getChunkLengthSeconds() {
        return this.chunkLengthSeconds;
    }

    public final long getMaxSessionLengthMin() {
        return this.maxSessionLengthMin;
    }

    @NotNull
    public final DataUploadingSchedulingConfig getSchedulingConfig() {
        return this.schedulingConfig;
    }

    public final double getUploadingExpirationTimeDays() {
        return this.uploadingExpirationTimeDays;
    }

    public final long getWriteToFileIntervalMillis() {
        return this.writeToFileIntervalMillis;
    }

    public final int getWriteToFileRecords() {
        return this.writeToFileRecords;
    }

    public int hashCode() {
        return this.schedulingConfig.hashCode() + J.a(this.uploadingExpirationTimeDays, K.a(this.maxSessionLengthMin, K.a(this.chunkLengthSeconds, K.a(this.writeToFileIntervalMillis, Integer.hashCode(this.writeToFileRecords) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "DataUploadManagerConfig(writeToFileRecords=" + this.writeToFileRecords + ", writeToFileIntervalMillis=" + this.writeToFileIntervalMillis + ", chunkLengthSeconds=" + this.chunkLengthSeconds + ", maxSessionLengthMin=" + this.maxSessionLengthMin + ", uploadingExpirationTimeDays=" + this.uploadingExpirationTimeDays + ", schedulingConfig=" + this.schedulingConfig + ')';
    }
}
