package me.oriient.positioningengine.common;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.preloading.DataPreloadingManager;
import me.oriient.positioningengine.ondevice.StartPosition;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0011HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003Jk\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0007HÆ\u0001J\u0013\u0010.\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\t\u00102\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lme/oriient/positioningengine/common/PositioningContext;", "", "engineSession", "Lme/oriient/positioningengine/ondevice/models/OnDeviceEngineSession;", "initiatedBy", "Lme/oriient/positioningengine/common/InitiatedBy;", "buildingId", "", "initialFloorIds", "", "startPosition", "Lme/oriient/positioningengine/ondevice/StartPosition;", "startTimeMillis", "", "isOutOfGeofence", "", "dataPreloadingStatus", "Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingStatus;", "sessionId", "(Lme/oriient/positioningengine/ondevice/models/OnDeviceEngineSession;Lme/oriient/positioningengine/common/InitiatedBy;Ljava/lang/String;Ljava/util/List;Lme/oriient/positioningengine/ondevice/StartPosition;JZLme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingStatus;Ljava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "getDataPreloadingStatus", "()Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingStatus;", "getEngineSession", "()Lme/oriient/positioningengine/ondevice/models/OnDeviceEngineSession;", "getInitialFloorIds", "()Ljava/util/List;", "getInitiatedBy", "()Lme/oriient/positioningengine/common/InitiatedBy;", "()Z", "getSessionId", "getStartPosition", "()Lme/oriient/positioningengine/ondevice/StartPosition;", "getStartTimeMillis", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PositioningContext {

    @NotNull
    private final String buildingId;

    @NotNull
    private final DataPreloadingManager.PreloadingStatus dataPreloadingStatus;

    @NotNull
    private final OnDeviceEngineSession engineSession;

    @NotNull
    private final List<String> initialFloorIds;

    @NotNull
    private final InitiatedBy initiatedBy;
    private final boolean isOutOfGeofence;

    @NotNull
    private final String sessionId;

    @Nullable
    private final StartPosition startPosition;
    private final long startTimeMillis;

    public PositioningContext(@NotNull OnDeviceEngineSession engineSession, @NotNull InitiatedBy initiatedBy, @NotNull String buildingId, @NotNull List<String> initialFloorIds, @Nullable StartPosition startPosition, long j, boolean z, @NotNull DataPreloadingManager.PreloadingStatus dataPreloadingStatus, @NotNull String sessionId) {
        Intrinsics.h(engineSession, "engineSession");
        Intrinsics.h(initiatedBy, "initiatedBy");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(initialFloorIds, "initialFloorIds");
        Intrinsics.h(dataPreloadingStatus, "dataPreloadingStatus");
        Intrinsics.h(sessionId, "sessionId");
        this.engineSession = engineSession;
        this.initiatedBy = initiatedBy;
        this.buildingId = buildingId;
        this.initialFloorIds = initialFloorIds;
        this.startPosition = startPosition;
        this.startTimeMillis = j;
        this.isOutOfGeofence = z;
        this.dataPreloadingStatus = dataPreloadingStatus;
        this.sessionId = sessionId;
    }

    public static /* synthetic */ PositioningContext copy$default(PositioningContext positioningContext, OnDeviceEngineSession onDeviceEngineSession, InitiatedBy initiatedBy, String str, List list, StartPosition startPosition, long j, boolean z, DataPreloadingManager.PreloadingStatus preloadingStatus, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            onDeviceEngineSession = positioningContext.engineSession;
        }
        if ((i & 2) != 0) {
            initiatedBy = positioningContext.initiatedBy;
        }
        if ((i & 4) != 0) {
            str = positioningContext.buildingId;
        }
        if ((i & 8) != 0) {
            list = positioningContext.initialFloorIds;
        }
        if ((i & 16) != 0) {
            startPosition = positioningContext.startPosition;
        }
        if ((i & 32) != 0) {
            j = positioningContext.startTimeMillis;
        }
        if ((i & 64) != 0) {
            z = positioningContext.isOutOfGeofence;
        }
        if ((i & 128) != 0) {
            preloadingStatus = positioningContext.dataPreloadingStatus;
        }
        if ((i & 256) != 0) {
            str2 = positioningContext.sessionId;
        }
        String str3 = str2;
        boolean z2 = z;
        long j2 = j;
        List list2 = list;
        StartPosition startPosition2 = startPosition;
        String str4 = str;
        return positioningContext.copy(onDeviceEngineSession, initiatedBy, str4, list2, startPosition2, j2, z2, preloadingStatus, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OnDeviceEngineSession getEngineSession() {
        return this.engineSession;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InitiatedBy getInitiatedBy() {
        return this.initiatedBy;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final List<String> component4() {
        return this.initialFloorIds;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final StartPosition getStartPosition() {
        return this.startPosition;
    }

    /* renamed from: component6, reason: from getter */
    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsOutOfGeofence() {
        return this.isOutOfGeofence;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final DataPreloadingManager.PreloadingStatus getDataPreloadingStatus() {
        return this.dataPreloadingStatus;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final PositioningContext copy(@NotNull OnDeviceEngineSession engineSession, @NotNull InitiatedBy initiatedBy, @NotNull String buildingId, @NotNull List<String> initialFloorIds, @Nullable StartPosition startPosition, long startTimeMillis, boolean isOutOfGeofence, @NotNull DataPreloadingManager.PreloadingStatus dataPreloadingStatus, @NotNull String sessionId) {
        Intrinsics.h(engineSession, "engineSession");
        Intrinsics.h(initiatedBy, "initiatedBy");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(initialFloorIds, "initialFloorIds");
        Intrinsics.h(dataPreloadingStatus, "dataPreloadingStatus");
        Intrinsics.h(sessionId, "sessionId");
        return new PositioningContext(engineSession, initiatedBy, buildingId, initialFloorIds, startPosition, startTimeMillis, isOutOfGeofence, dataPreloadingStatus, sessionId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PositioningContext) && Intrinsics.c(this.sessionId, ((PositioningContext) other).sessionId);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final DataPreloadingManager.PreloadingStatus getDataPreloadingStatus() {
        return this.dataPreloadingStatus;
    }

    @NotNull
    public final OnDeviceEngineSession getEngineSession() {
        return this.engineSession;
    }

    @NotNull
    public final List<String> getInitialFloorIds() {
        return this.initialFloorIds;
    }

    @NotNull
    public final InitiatedBy getInitiatedBy() {
        return this.initiatedBy;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final StartPosition getStartPosition() {
        return this.startPosition;
    }

    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    public int hashCode() {
        return this.sessionId.hashCode();
    }

    public final boolean isOutOfGeofence() {
        return this.isOutOfGeofence;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PositioningContext(engineSession=");
        sb.append(this.engineSession);
        sb.append(", initiatedBy=");
        sb.append(this.initiatedBy);
        sb.append(", buildingId=");
        sb.append(this.buildingId);
        sb.append(", initialFloorIds=");
        sb.append(this.initialFloorIds);
        sb.append(", startPosition=");
        sb.append(this.startPosition);
        sb.append(", startTimeMillis=");
        sb.append(this.startTimeMillis);
        sb.append(", isOutOfGeofence=");
        sb.append(this.isOutOfGeofence);
        sb.append(", dataPreloadingStatus=");
        sb.append(this.dataPreloadingStatus);
        sb.append(", sessionId=");
        return androidx.camera.core.impl.b.r(sb, this.sessionId, ')');
    }

    public /* synthetic */ PositioningContext(OnDeviceEngineSession onDeviceEngineSession, InitiatedBy initiatedBy, String str, List list, StartPosition startPosition, long j, boolean z, DataPreloadingManager.PreloadingStatus preloadingStatus, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onDeviceEngineSession, initiatedBy, str, list, startPosition, j, z, preloadingStatus, (i & 256) != 0 ? androidx.constraintlayout.core.state.a.h("toString(...)") : str2);
    }
}
