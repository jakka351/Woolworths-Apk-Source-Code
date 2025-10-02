package me.oriient.positioningengine.common;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.systemStateManager.SystemState;
import me.oriient.internal.services.systemStateManager.SystemStateUpdateCause;
import me.oriient.internal.services.uploadingManager.models.UploadableSample;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00015B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0015R\u001a\u0010,\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010\u0010R\u001a\u0010.\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010\u0010R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lme/oriient/positioningengine/common/SystemEventUpdate;", "Lme/oriient/internal/services/uploadingManager/models/UploadableSample;", "Lme/oriient/internal/services/systemStateManager/SystemStateUpdateCause;", "eventType", "", "timestampMillis", "timeSinceLastUpdateMillis", "", "travelledDistance", "Lme/oriient/internal/services/systemStateManager/SystemState;", "systemState", "<init>", "(Lme/oriient/internal/services/systemStateManager/SystemStateUpdateCause;JJDLme/oriient/internal/services/systemStateManager/SystemState;)V", "component1", "()Lme/oriient/internal/services/systemStateManager/SystemStateUpdateCause;", "component2", "()J", "component3", "component4", "()D", "component5", "()Lme/oriient/internal/services/systemStateManager/SystemState;", "copy", "(Lme/oriient/internal/services/systemStateManager/SystemStateUpdateCause;JJDLme/oriient/internal/services/systemStateManager/SystemState;)Lme/oriient/positioningengine/common/SystemEventUpdate;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lme/oriient/internal/services/systemStateManager/SystemStateUpdateCause;", "getEventType", "J", "getTimestampMillis", "getTimeSinceLastUpdateMillis", "D", "getTravelledDistance", "Lme/oriient/internal/services/systemStateManager/SystemState;", "getSystemState", "startTimeMillis", "getStartTimeMillis", "endTimeMillis", "getEndTimeMillis", "", "getPayload", "()[B", "payload", "Companion", "me/oriient/positioningengine/common/y", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class SystemEventUpdate implements UploadableSample {

    @NotNull
    private static final byte[] CHUNK_FILE_HEADER;

    @NotNull
    public static final y Companion = new y();
    public static final double UPLOADING_FORMAT_VERSION = 1.0d;
    private final long endTimeMillis;

    @NotNull
    private final SystemStateUpdateCause eventType;
    private final long startTimeMillis;

    @NotNull
    private final SystemState systemState;
    private final long timeSinceLastUpdateMillis;
    private final long timestampMillis;
    private final double travelledDistance;

    static {
        byte[] bytes = CollectionsKt.M(CollectionsKt.R("eventType", "timestamp", "travelledDistance", "applicationState", "mapState", "calibrationDialogState", "navigationPathState", "userPositionState", "walkToLockIndicatorState", "isPositionLocked", "isCalibrationNeeded", "isCalibrationActive"), ",", null, "\n", null, 58).getBytes(Charsets.f24671a);
        Intrinsics.g(bytes, "getBytes(...)");
        CHUNK_FILE_HEADER = bytes;
    }

    public SystemEventUpdate(@NotNull SystemStateUpdateCause eventType, long j, long j2, double d, @NotNull SystemState systemState) {
        Intrinsics.h(eventType, "eventType");
        Intrinsics.h(systemState, "systemState");
        this.eventType = eventType;
        this.timestampMillis = j;
        this.timeSinceLastUpdateMillis = j2;
        this.travelledDistance = d;
        this.systemState = systemState;
        this.startTimeMillis = j - j2;
        this.endTimeMillis = j;
    }

    public static /* synthetic */ SystemEventUpdate copy$default(SystemEventUpdate systemEventUpdate, SystemStateUpdateCause systemStateUpdateCause, long j, long j2, double d, SystemState systemState, int i, Object obj) {
        if ((i & 1) != 0) {
            systemStateUpdateCause = systemEventUpdate.eventType;
        }
        if ((i & 2) != 0) {
            j = systemEventUpdate.timestampMillis;
        }
        if ((i & 4) != 0) {
            j2 = systemEventUpdate.timeSinceLastUpdateMillis;
        }
        if ((i & 8) != 0) {
            d = systemEventUpdate.travelledDistance;
        }
        if ((i & 16) != 0) {
            systemState = systemEventUpdate.systemState;
        }
        SystemState systemState2 = systemState;
        double d2 = d;
        return systemEventUpdate.copy(systemStateUpdateCause, j, j2, d2, systemState2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SystemStateUpdateCause getEventType() {
        return this.eventType;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimeSinceLastUpdateMillis() {
        return this.timeSinceLastUpdateMillis;
    }

    /* renamed from: component4, reason: from getter */
    public final double getTravelledDistance() {
        return this.travelledDistance;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final SystemState getSystemState() {
        return this.systemState;
    }

    @NotNull
    public final SystemEventUpdate copy(@NotNull SystemStateUpdateCause eventType, long timestampMillis, long timeSinceLastUpdateMillis, double travelledDistance, @NotNull SystemState systemState) {
        Intrinsics.h(eventType, "eventType");
        Intrinsics.h(systemState, "systemState");
        return new SystemEventUpdate(eventType, timestampMillis, timeSinceLastUpdateMillis, travelledDistance, systemState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SystemEventUpdate)) {
            return false;
        }
        SystemEventUpdate systemEventUpdate = (SystemEventUpdate) other;
        return this.eventType == systemEventUpdate.eventType && this.timestampMillis == systemEventUpdate.timestampMillis && this.timeSinceLastUpdateMillis == systemEventUpdate.timeSinceLastUpdateMillis && Double.compare(this.travelledDistance, systemEventUpdate.travelledDistance) == 0 && Intrinsics.c(this.systemState, systemEventUpdate.systemState);
    }

    @Override // me.oriient.internal.services.uploadingManager.models.UploadableSample
    public long getEndTimeMillis() {
        return this.endTimeMillis;
    }

    @NotNull
    public final SystemStateUpdateCause getEventType() {
        return this.eventType;
    }

    @Override // me.oriient.internal.services.uploadingManager.models.UploadableSample
    @NotNull
    public byte[] getPayload() {
        byte[] bytes = CollectionsKt.M(CollectionsKt.R(this.eventType.getUploadableName(), me.oriient.positioningengine.common.util.a.a(this.timestampMillis, ((TimeProvider) DiKt.getDi().get(Reflection.f24268a.b(TimeProvider.class), null)).getTimeZoneGmt()), String.valueOf(this.travelledDistance), String.valueOf(this.systemState.getAppState().getCode()), this.systemState.getMapState().getUploadableName(), this.systemState.getCalibrationDialogState().getUploadableName(), this.systemState.getNavigationPathState().getUploadableName(), this.systemState.getUserPositionState().getUploadableName(), this.systemState.getWalkToLockIndicatorState().getUploadableName(), String.valueOf(this.systemState.isPositionLocked()), String.valueOf(this.systemState.isCalibrationNeeded()), String.valueOf(this.systemState.isCalibrationActive())), ",", null, "\n", null, 58).getBytes(Charsets.f24671a);
        Intrinsics.g(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // me.oriient.internal.services.uploadingManager.models.UploadableSample
    public long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    @NotNull
    public final SystemState getSystemState() {
        return this.systemState;
    }

    public final long getTimeSinceLastUpdateMillis() {
        return this.timeSinceLastUpdateMillis;
    }

    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    public final double getTravelledDistance() {
        return this.travelledDistance;
    }

    public int hashCode() {
        return this.systemState.hashCode() + v.a(this.travelledDistance, w.a(this.timeSinceLastUpdateMillis, w.a(this.timestampMillis, this.eventType.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "SystemEventUpdate(eventType=" + this.eventType + ", timestampMillis=" + this.timestampMillis + ", timeSinceLastUpdateMillis=" + this.timeSinceLastUpdateMillis + ", travelledDistance=" + this.travelledDistance + ", systemState=" + this.systemState + ')';
    }
}
