package me.oriient.positioningengine.support;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.internal.services.uploadingManager.DataUploaderFilesManager;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;
import me.oriient.positioningengine.common.CalibrationContext;
import me.oriient.positioningengine.common.EngineStopReason;
import me.oriient.positioningengine.common.PositioningContext;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.models.WorldCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001:J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H¦@¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH&J\u0018\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH¦@¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H&J\u001e\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H¦@¢\u0006\u0002\u0010'J0\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u000200H¦@¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u000204H¦@¢\u0006\u0002\u00105J\u0016\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u000208H¦@¢\u0006\u0002\u00109R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007¨\u0006;"}, d2 = {"Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManager;", "", "canStartUploading", "", "getCanStartUploading", "()Z", "setCanStartUploading", "(Z)V", "positionsUploadingEnabled", "getPositionsUploadingEnabled", "setPositionsUploadingEnabled", "sensorsDataUploadingEnabled", "getSensorsDataUploadingEnabled", "setSensorsDataUploadingEnabled", "systemEventsUploadingEnabled", "getSystemEventsUploadingEnabled", "setSystemEventsUploadingEnabled", "validationUploadingEnabled", "getValidationUploadingEnabled", "setValidationUploadingEnabled", "clearAllCaches", "", "exceptLastDays", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSpaceUsageStats", "Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager$FileManagerStats;", "onNewEngine", "engine", "Lme/oriient/positioningengine/common/PositioningEngine;", "(Lme/oriient/positioningengine/common/PositioningEngine;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNewSample", "sample", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "onUploadTrigger", "trigger", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "scheduledWork", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startCalibration", "context", "Lme/oriient/positioningengine/common/CalibrationContext;", "sensorStartTimeMillis", "", "currentLocation", "Lme/oriient/positioningengine/common/models/WorldCoordinate;", "userId", "", "(Lme/oriient/positioningengine/common/CalibrationContext;JLme/oriient/positioningengine/common/models/WorldCoordinate;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startPositioning", "params", "Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManager$StartPositioningParams;", "(Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManager$StartPositioningParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "reason", "Lme/oriient/positioningengine/common/EngineStopReason;", "(Lme/oriient/positioningengine/common/EngineStopReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "StartPositioningParams", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface OnDeviceSessionsUploadManager {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0002\u0010\u0019J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010'J\t\u00108\u001a\u00020\u0017HÆ\u0003J\t\u00109\u001a\u00020\u0017HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u000bHÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003Jº\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0015HÖ\u0001J\t\u0010G\u001a\u00020\tHÖ\u0001R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001d¨\u0006H"}, d2 = {"Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManager$StartPositioningParams;", "", "context", "Lme/oriient/positioningengine/common/PositioningContext;", "sensorStartTimeMillis", "", "currentLocation", "Lme/oriient/positioningengine/common/models/WorldCoordinate;", "userId", "", "horizontalAccuracy", "", "buildingGeofenceOrigin", "buildingOrigin", "buildingRotationToENU", "buildingName", "mapId", "mapName", "floorId", "floorName", "floorOrder", "", "strictModeEnabled", "", "gpsFusionEnabled", "(Lme/oriient/positioningengine/common/PositioningContext;JLme/oriient/positioningengine/common/models/WorldCoordinate;Ljava/lang/String;DLme/oriient/positioningengine/common/models/WorldCoordinate;Lme/oriient/positioningengine/common/models/WorldCoordinate;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZ)V", "getBuildingGeofenceOrigin", "()Lme/oriient/positioningengine/common/models/WorldCoordinate;", "getBuildingName", "()Ljava/lang/String;", "getBuildingOrigin", "getBuildingRotationToENU", "()D", "getContext", "()Lme/oriient/positioningengine/common/PositioningContext;", "getCurrentLocation", "getFloorId", "getFloorName", "getFloorOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGpsFusionEnabled", "()Z", "getHorizontalAccuracy", "getMapId", "getMapName", "getSensorStartTimeMillis", "()J", "getStrictModeEnabled", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lme/oriient/positioningengine/common/PositioningContext;JLme/oriient/positioningengine/common/models/WorldCoordinate;Ljava/lang/String;DLme/oriient/positioningengine/common/models/WorldCoordinate;Lme/oriient/positioningengine/common/models/WorldCoordinate;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZ)Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManager$StartPositioningParams;", "equals", "other", "hashCode", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartPositioningParams {

        @NotNull
        private final WorldCoordinate buildingGeofenceOrigin;

        @NotNull
        private final String buildingName;

        @NotNull
        private final WorldCoordinate buildingOrigin;
        private final double buildingRotationToENU;

        @NotNull
        private final PositioningContext context;

        @Nullable
        private final WorldCoordinate currentLocation;

        @Nullable
        private final String floorId;

        @Nullable
        private final String floorName;

        @Nullable
        private final Integer floorOrder;
        private final boolean gpsFusionEnabled;
        private final double horizontalAccuracy;

        @Nullable
        private final String mapId;

        @Nullable
        private final String mapName;
        private final long sensorStartTimeMillis;
        private final boolean strictModeEnabled;

        @NotNull
        private final String userId;

        public StartPositioningParams(@NotNull PositioningContext context, long j, @Nullable WorldCoordinate worldCoordinate, @NotNull String userId, double d, @NotNull WorldCoordinate buildingGeofenceOrigin, @NotNull WorldCoordinate buildingOrigin, double d2, @NotNull String buildingName, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, boolean z, boolean z2) {
            Intrinsics.h(context, "context");
            Intrinsics.h(userId, "userId");
            Intrinsics.h(buildingGeofenceOrigin, "buildingGeofenceOrigin");
            Intrinsics.h(buildingOrigin, "buildingOrigin");
            Intrinsics.h(buildingName, "buildingName");
            this.context = context;
            this.sensorStartTimeMillis = j;
            this.currentLocation = worldCoordinate;
            this.userId = userId;
            this.horizontalAccuracy = d;
            this.buildingGeofenceOrigin = buildingGeofenceOrigin;
            this.buildingOrigin = buildingOrigin;
            this.buildingRotationToENU = d2;
            this.buildingName = buildingName;
            this.mapId = str;
            this.mapName = str2;
            this.floorId = str3;
            this.floorName = str4;
            this.floorOrder = num;
            this.strictModeEnabled = z;
            this.gpsFusionEnabled = z2;
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PositioningContext getContext() {
            return this.context;
        }

        @Nullable
        /* renamed from: component10, reason: from getter */
        public final String getMapId() {
            return this.mapId;
        }

        @Nullable
        /* renamed from: component11, reason: from getter */
        public final String getMapName() {
            return this.mapName;
        }

        @Nullable
        /* renamed from: component12, reason: from getter */
        public final String getFloorId() {
            return this.floorId;
        }

        @Nullable
        /* renamed from: component13, reason: from getter */
        public final String getFloorName() {
            return this.floorName;
        }

        @Nullable
        /* renamed from: component14, reason: from getter */
        public final Integer getFloorOrder() {
            return this.floorOrder;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getStrictModeEnabled() {
            return this.strictModeEnabled;
        }

        /* renamed from: component16, reason: from getter */
        public final boolean getGpsFusionEnabled() {
            return this.gpsFusionEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final long getSensorStartTimeMillis() {
            return this.sensorStartTimeMillis;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final WorldCoordinate getCurrentLocation() {
            return this.currentLocation;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* renamed from: component5, reason: from getter */
        public final double getHorizontalAccuracy() {
            return this.horizontalAccuracy;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final WorldCoordinate getBuildingGeofenceOrigin() {
            return this.buildingGeofenceOrigin;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final WorldCoordinate getBuildingOrigin() {
            return this.buildingOrigin;
        }

        /* renamed from: component8, reason: from getter */
        public final double getBuildingRotationToENU() {
            return this.buildingRotationToENU;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final String getBuildingName() {
            return this.buildingName;
        }

        @NotNull
        public final StartPositioningParams copy(@NotNull PositioningContext context, long sensorStartTimeMillis, @Nullable WorldCoordinate currentLocation, @NotNull String userId, double horizontalAccuracy, @NotNull WorldCoordinate buildingGeofenceOrigin, @NotNull WorldCoordinate buildingOrigin, double buildingRotationToENU, @NotNull String buildingName, @Nullable String mapId, @Nullable String mapName, @Nullable String floorId, @Nullable String floorName, @Nullable Integer floorOrder, boolean strictModeEnabled, boolean gpsFusionEnabled) {
            Intrinsics.h(context, "context");
            Intrinsics.h(userId, "userId");
            Intrinsics.h(buildingGeofenceOrigin, "buildingGeofenceOrigin");
            Intrinsics.h(buildingOrigin, "buildingOrigin");
            Intrinsics.h(buildingName, "buildingName");
            return new StartPositioningParams(context, sensorStartTimeMillis, currentLocation, userId, horizontalAccuracy, buildingGeofenceOrigin, buildingOrigin, buildingRotationToENU, buildingName, mapId, mapName, floorId, floorName, floorOrder, strictModeEnabled, gpsFusionEnabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartPositioningParams)) {
                return false;
            }
            StartPositioningParams startPositioningParams = (StartPositioningParams) other;
            return Intrinsics.c(this.context, startPositioningParams.context) && this.sensorStartTimeMillis == startPositioningParams.sensorStartTimeMillis && Intrinsics.c(this.currentLocation, startPositioningParams.currentLocation) && Intrinsics.c(this.userId, startPositioningParams.userId) && Double.compare(this.horizontalAccuracy, startPositioningParams.horizontalAccuracy) == 0 && Intrinsics.c(this.buildingGeofenceOrigin, startPositioningParams.buildingGeofenceOrigin) && Intrinsics.c(this.buildingOrigin, startPositioningParams.buildingOrigin) && Double.compare(this.buildingRotationToENU, startPositioningParams.buildingRotationToENU) == 0 && Intrinsics.c(this.buildingName, startPositioningParams.buildingName) && Intrinsics.c(this.mapId, startPositioningParams.mapId) && Intrinsics.c(this.mapName, startPositioningParams.mapName) && Intrinsics.c(this.floorId, startPositioningParams.floorId) && Intrinsics.c(this.floorName, startPositioningParams.floorName) && Intrinsics.c(this.floorOrder, startPositioningParams.floorOrder) && this.strictModeEnabled == startPositioningParams.strictModeEnabled && this.gpsFusionEnabled == startPositioningParams.gpsFusionEnabled;
        }

        @NotNull
        public final WorldCoordinate getBuildingGeofenceOrigin() {
            return this.buildingGeofenceOrigin;
        }

        @NotNull
        public final String getBuildingName() {
            return this.buildingName;
        }

        @NotNull
        public final WorldCoordinate getBuildingOrigin() {
            return this.buildingOrigin;
        }

        public final double getBuildingRotationToENU() {
            return this.buildingRotationToENU;
        }

        @NotNull
        public final PositioningContext getContext() {
            return this.context;
        }

        @Nullable
        public final WorldCoordinate getCurrentLocation() {
            return this.currentLocation;
        }

        @Nullable
        public final String getFloorId() {
            return this.floorId;
        }

        @Nullable
        public final String getFloorName() {
            return this.floorName;
        }

        @Nullable
        public final Integer getFloorOrder() {
            return this.floorOrder;
        }

        public final boolean getGpsFusionEnabled() {
            return this.gpsFusionEnabled;
        }

        public final double getHorizontalAccuracy() {
            return this.horizontalAccuracy;
        }

        @Nullable
        public final String getMapId() {
            return this.mapId;
        }

        @Nullable
        public final String getMapName() {
            return this.mapName;
        }

        public final long getSensorStartTimeMillis() {
            return this.sensorStartTimeMillis;
        }

        public final boolean getStrictModeEnabled() {
            return this.strictModeEnabled;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            int iA = me.oriient.positioningengine.common.w.a(this.sensorStartTimeMillis, this.context.hashCode() * 31, 31);
            WorldCoordinate worldCoordinate = this.currentLocation;
            int iA2 = me.oriient.positioningengine.common.z.a(this.buildingName, me.oriient.positioningengine.common.v.a(this.buildingRotationToENU, (this.buildingOrigin.hashCode() + ((this.buildingGeofenceOrigin.hashCode() + me.oriient.positioningengine.common.v.a(this.horizontalAccuracy, me.oriient.positioningengine.common.z.a(this.userId, (iA + (worldCoordinate == null ? 0 : worldCoordinate.hashCode())) * 31, 31), 31)) * 31)) * 31, 31), 31);
            String str = this.mapId;
            int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.mapName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.floorId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.floorName;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.floorOrder;
            return Boolean.hashCode(this.gpsFusionEnabled) + me.oriient.positioningengine.common.x.a(this.strictModeEnabled, (iHashCode4 + (num != null ? num.hashCode() : 0)) * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("StartPositioningParams(context=");
            sb.append(this.context);
            sb.append(", sensorStartTimeMillis=");
            sb.append(this.sensorStartTimeMillis);
            sb.append(", currentLocation=");
            sb.append(this.currentLocation);
            sb.append(", userId=");
            sb.append(this.userId);
            sb.append(", horizontalAccuracy=");
            sb.append(this.horizontalAccuracy);
            sb.append(", buildingGeofenceOrigin=");
            sb.append(this.buildingGeofenceOrigin);
            sb.append(", buildingOrigin=");
            sb.append(this.buildingOrigin);
            sb.append(", buildingRotationToENU=");
            sb.append(this.buildingRotationToENU);
            sb.append(", buildingName=");
            sb.append(this.buildingName);
            sb.append(", mapId=");
            sb.append(this.mapId);
            sb.append(", mapName=");
            sb.append(this.mapName);
            sb.append(", floorId=");
            sb.append(this.floorId);
            sb.append(", floorName=");
            sb.append(this.floorName);
            sb.append(", floorOrder=");
            sb.append(this.floorOrder);
            sb.append(", strictModeEnabled=");
            sb.append(this.strictModeEnabled);
            sb.append(", gpsFusionEnabled=");
            return androidx.camera.core.impl.b.s(sb, this.gpsFusionEnabled, ')');
        }
    }

    @Nullable
    Object clearAllCaches(double d, @NotNull Continuation<? super Unit> continuation);

    boolean getCanStartUploading();

    boolean getPositionsUploadingEnabled();

    boolean getSensorsDataUploadingEnabled();

    @NotNull
    DataUploaderFilesManager.FileManagerStats getSpaceUsageStats();

    boolean getSystemEventsUploadingEnabled();

    boolean getValidationUploadingEnabled();

    @Nullable
    Object onNewEngine(@Nullable PositioningEngine positioningEngine, @NotNull Continuation<? super Unit> continuation);

    void onNewSample(@NotNull SensorsDataSample sample);

    @Nullable
    Object onUploadTrigger(@NotNull DataUploadScheduler.UploadTrigger uploadTrigger, @NotNull DataUploadScheduledWork dataUploadScheduledWork, @NotNull Continuation<? super Unit> continuation);

    void setCanStartUploading(boolean z);

    void setPositionsUploadingEnabled(boolean z);

    void setSensorsDataUploadingEnabled(boolean z);

    void setSystemEventsUploadingEnabled(boolean z);

    void setValidationUploadingEnabled(boolean z);

    @Nullable
    Object startCalibration(@NotNull CalibrationContext calibrationContext, long j, @Nullable WorldCoordinate worldCoordinate, @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object startPositioning(@NotNull StartPositioningParams startPositioningParams, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object stop(@NotNull EngineStopReason engineStopReason, @NotNull Continuation<? super Unit> continuation);
}
