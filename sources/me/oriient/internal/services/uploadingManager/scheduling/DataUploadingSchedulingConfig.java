package me.oriient.internal.services.uploadingManager.scheduling;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.locationManager.K;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadingSchedulingConfig;", "", "chargerTaskIntervalMin", "", "controlTaskIntervalMin", "controlTaskMaxTimeMin", "uploadTaskMaxDelayMin", "(JJJJ)V", "getChargerTaskIntervalMin", "()J", "getControlTaskIntervalMin", "getControlTaskMaxTimeMin", "getUploadTaskMaxDelayMin", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DataUploadingSchedulingConfig {
    private final long chargerTaskIntervalMin;
    private final long controlTaskIntervalMin;
    private final long controlTaskMaxTimeMin;
    private final long uploadTaskMaxDelayMin;

    public DataUploadingSchedulingConfig(long j, long j2, long j3, long j4) {
        this.chargerTaskIntervalMin = j;
        this.controlTaskIntervalMin = j2;
        this.controlTaskMaxTimeMin = j3;
        this.uploadTaskMaxDelayMin = j4;
    }

    public static /* synthetic */ DataUploadingSchedulingConfig copy$default(DataUploadingSchedulingConfig dataUploadingSchedulingConfig, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dataUploadingSchedulingConfig.chargerTaskIntervalMin;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = dataUploadingSchedulingConfig.controlTaskIntervalMin;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = dataUploadingSchedulingConfig.controlTaskMaxTimeMin;
        }
        return dataUploadingSchedulingConfig.copy(j5, j6, j3, (i & 8) != 0 ? dataUploadingSchedulingConfig.uploadTaskMaxDelayMin : j4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getChargerTaskIntervalMin() {
        return this.chargerTaskIntervalMin;
    }

    /* renamed from: component2, reason: from getter */
    public final long getControlTaskIntervalMin() {
        return this.controlTaskIntervalMin;
    }

    /* renamed from: component3, reason: from getter */
    public final long getControlTaskMaxTimeMin() {
        return this.controlTaskMaxTimeMin;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUploadTaskMaxDelayMin() {
        return this.uploadTaskMaxDelayMin;
    }

    @NotNull
    public final DataUploadingSchedulingConfig copy(long chargerTaskIntervalMin, long controlTaskIntervalMin, long controlTaskMaxTimeMin, long uploadTaskMaxDelayMin) {
        return new DataUploadingSchedulingConfig(chargerTaskIntervalMin, controlTaskIntervalMin, controlTaskMaxTimeMin, uploadTaskMaxDelayMin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataUploadingSchedulingConfig)) {
            return false;
        }
        DataUploadingSchedulingConfig dataUploadingSchedulingConfig = (DataUploadingSchedulingConfig) other;
        return this.chargerTaskIntervalMin == dataUploadingSchedulingConfig.chargerTaskIntervalMin && this.controlTaskIntervalMin == dataUploadingSchedulingConfig.controlTaskIntervalMin && this.controlTaskMaxTimeMin == dataUploadingSchedulingConfig.controlTaskMaxTimeMin && this.uploadTaskMaxDelayMin == dataUploadingSchedulingConfig.uploadTaskMaxDelayMin;
    }

    public final long getChargerTaskIntervalMin() {
        return this.chargerTaskIntervalMin;
    }

    public final long getControlTaskIntervalMin() {
        return this.controlTaskIntervalMin;
    }

    public final long getControlTaskMaxTimeMin() {
        return this.controlTaskMaxTimeMin;
    }

    public final long getUploadTaskMaxDelayMin() {
        return this.uploadTaskMaxDelayMin;
    }

    public int hashCode() {
        return Long.hashCode(this.uploadTaskMaxDelayMin) + K.a(this.controlTaskMaxTimeMin, K.a(this.controlTaskIntervalMin, Long.hashCode(this.chargerTaskIntervalMin) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DataUploadingSchedulingConfig(chargerTaskIntervalMin=");
        sb.append(this.chargerTaskIntervalMin);
        sb.append(", controlTaskIntervalMin=");
        sb.append(this.controlTaskIntervalMin);
        sb.append(", controlTaskMaxTimeMin=");
        sb.append(this.controlTaskMaxTimeMin);
        sb.append(", uploadTaskMaxDelayMin=");
        return androidx.camera.core.impl.b.q(sb, this.uploadTaskMaxDelayMin, ')');
    }
}
