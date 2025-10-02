package me.oriient.positioningengine.ondevice.models;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\bg\u0018\u00002\u00020\u0001:\u0005%&'()R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u0004\u0018\u00010 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0012\u0010#\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001e¨\u0006*"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/EngineSessionInfo;", "", "floors", "", "Lme/oriient/positioningengine/ondevice/models/EngineSessionInfo$FloorChange;", "getFloors", "()Ljava/util/List;", "floorsDataVersions", "Lme/oriient/positioningengine/ondevice/models/EngineSessionInfo$FloorDataVersion;", "getFloorsDataVersions", "floorsLoadingTimestamps", "Lme/oriient/positioningengine/ondevice/models/EngineSessionInfo$FloorLoadingTimestamp;", "getFloorsLoadingTimestamps", "mappingDataVersions", "Lme/oriient/positioningengine/ondevice/models/EngineSessionInfo$MappingDataVersion;", "getMappingDataVersions", "mapsLoadingTimestamps", "Lme/oriient/positioningengine/ondevice/models/EngineSessionInfo$MapLoadingTimestamp;", "getMapsLoadingTimestamps", "performanceReport", "Lme/oriient/positioningengine/ondevice/models/EnginePerformanceReport;", "getPerformanceReport", "()Lme/oriient/positioningengine/ondevice/models/EnginePerformanceReport;", "startFromContinousCalibration", "", "getStartFromContinousCalibration", "()Z", "timeDwellingLockedMillis", "", "getTimeDwellingLockedMillis", "()J", "timeToStartPositioningSeconds", "", "getTimeToStartPositioningSeconds", "()Ljava/lang/Double;", "timeWalkingLockedMillis", "getTimeWalkingLockedMillis", "FloorChange", "FloorDataVersion", "FloorLoadingTimestamp", "MapLoadingTimestamp", "MappingDataVersion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface EngineSessionInfo {

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/EngineSessionInfo$FloorChange;", "", "timestampMillis", "", "floorId", "", "(JLjava/lang/String;)V", "getFloorId", "()Ljava/lang/String;", "getTimestampMillis", "()J", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FloorChange {

        @NotNull
        private final String floorId;
        private final long timestampMillis;

        public FloorChange(long j, @NotNull String floorId) {
            Intrinsics.h(floorId, "floorId");
            this.timestampMillis = j;
            this.floorId = floorId;
        }

        @NotNull
        public final String getFloorId() {
            return this.floorId;
        }

        public final long getTimestampMillis() {
            return this.timestampMillis;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/EngineSessionInfo$FloorDataVersion;", "", "floorId", "", "obstaclesVersion", "", "(Ljava/lang/String;I)V", "getFloorId", "()Ljava/lang/String;", "getObstaclesVersion", "()I", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FloorDataVersion {

        @NotNull
        private final String floorId;
        private final int obstaclesVersion;

        public FloorDataVersion(@NotNull String floorId, int i) {
            Intrinsics.h(floorId, "floorId");
            this.floorId = floorId;
            this.obstaclesVersion = i;
        }

        @NotNull
        public final String getFloorId() {
            return this.floorId;
        }

        public final int getObstaclesVersion() {
            return this.obstaclesVersion;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/EngineSessionInfo$FloorLoadingTimestamp;", "", "floorId", "", "timestampMillis", "", "(Ljava/lang/String;J)V", "getFloorId", "()Ljava/lang/String;", "getTimestampMillis", "()J", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FloorLoadingTimestamp {

        @NotNull
        private final String floorId;
        private final long timestampMillis;

        public FloorLoadingTimestamp(@NotNull String floorId, long j) {
            Intrinsics.h(floorId, "floorId");
            this.floorId = floorId;
            this.timestampMillis = j;
        }

        @NotNull
        public final String getFloorId() {
            return this.floorId;
        }

        public final long getTimestampMillis() {
            return this.timestampMillis;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/EngineSessionInfo$MapLoadingTimestamp;", "", "mapId", "", "timestampMillis", "", "(Ljava/lang/String;J)V", "getMapId", "()Ljava/lang/String;", "getTimestampMillis", "()J", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MapLoadingTimestamp {

        @NotNull
        private final String mapId;
        private final long timestampMillis;

        public MapLoadingTimestamp(@NotNull String mapId, long j) {
            Intrinsics.h(mapId, "mapId");
            this.mapId = mapId;
            this.timestampMillis = j;
        }

        @NotNull
        public final String getMapId() {
            return this.mapId;
        }

        public final long getTimestampMillis() {
            return this.timestampMillis;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/EngineSessionInfo$MappingDataVersion;", "", "mapId", "", "mapGridVersion", "", "mapGridMajorVersion", "mapGridCreatedBy", "mapGridType", "algoMapGridMajorVersion", "algoMapGridVersion", "plmVersion", "(Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;D)V", "getAlgoMapGridMajorVersion", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAlgoMapGridVersion", "getMapGridCreatedBy", "()Ljava/lang/String;", "getMapGridMajorVersion", "()D", "getMapGridType", "getMapGridVersion", "getMapId", "getPlmVersion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MappingDataVersion {

        @Nullable
        private final Double algoMapGridMajorVersion;

        @Nullable
        private final Double algoMapGridVersion;

        @NotNull
        private final String mapGridCreatedBy;
        private final double mapGridMajorVersion;

        @NotNull
        private final String mapGridType;
        private final double mapGridVersion;

        @NotNull
        private final String mapId;
        private final double plmVersion;

        public MappingDataVersion(@NotNull String mapId, double d, double d2, @NotNull String mapGridCreatedBy, @NotNull String mapGridType, @Nullable Double d3, @Nullable Double d4, double d5) {
            Intrinsics.h(mapId, "mapId");
            Intrinsics.h(mapGridCreatedBy, "mapGridCreatedBy");
            Intrinsics.h(mapGridType, "mapGridType");
            this.mapId = mapId;
            this.mapGridVersion = d;
            this.mapGridMajorVersion = d2;
            this.mapGridCreatedBy = mapGridCreatedBy;
            this.mapGridType = mapGridType;
            this.algoMapGridMajorVersion = d3;
            this.algoMapGridVersion = d4;
            this.plmVersion = d5;
        }

        @Nullable
        public final Double getAlgoMapGridMajorVersion() {
            return this.algoMapGridMajorVersion;
        }

        @Nullable
        public final Double getAlgoMapGridVersion() {
            return this.algoMapGridVersion;
        }

        @NotNull
        public final String getMapGridCreatedBy() {
            return this.mapGridCreatedBy;
        }

        public final double getMapGridMajorVersion() {
            return this.mapGridMajorVersion;
        }

        @NotNull
        public final String getMapGridType() {
            return this.mapGridType;
        }

        public final double getMapGridVersion() {
            return this.mapGridVersion;
        }

        @NotNull
        public final String getMapId() {
            return this.mapId;
        }

        public final double getPlmVersion() {
            return this.plmVersion;
        }
    }

    @NotNull
    List<FloorChange> getFloors();

    @NotNull
    List<FloorDataVersion> getFloorsDataVersions();

    @NotNull
    List<FloorLoadingTimestamp> getFloorsLoadingTimestamps();

    @NotNull
    List<MappingDataVersion> getMappingDataVersions();

    @NotNull
    List<MapLoadingTimestamp> getMapsLoadingTimestamps();

    @NotNull
    EnginePerformanceReport getPerformanceReport();

    boolean getStartFromContinousCalibration();

    long getTimeDwellingLockedMillis();

    @Nullable
    Double getTimeToStartPositioningSeconds();

    long getTimeWalkingLockedMillis();
}
