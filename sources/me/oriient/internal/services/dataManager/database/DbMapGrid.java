package me.oriient.internal.services.dataManager.database;

import com.squareup.sqldelight.ColumnAdapter;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.services.config.a;
import me.oriient.internal.services.dataModel.engine.MapGridType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001:Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u0011HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\u008b\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\tHÖ\u0001J\b\u00109\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%¨\u0006;"}, d2 = {"Lme/oriient/internal/services/dataManager/database/DbMapGrid;", "", "buildingId", "", "floorId", "mapId", "spaceId", "engineVersion", "mapVersion", "", "filePath", "tag", "", "vector", "lastReadTimeStampMillis", "", "gridType", "Lme/oriient/internal/services/dataModel/engine/MapGridType;", "majorVersion", "createdBy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[B[BJLme/oriient/internal/services/dataModel/engine/MapGridType;ILjava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "getCreatedBy", "getEngineVersion", "getFilePath", "getFloorId", "getGridType", "()Lme/oriient/internal/services/dataModel/engine/MapGridType;", "getLastReadTimeStampMillis", "()J", "getMajorVersion", "()I", "getMapId", "getMapVersion", "getSpaceId", "getTag", "()[B", "getVector", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Adapter", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DbMapGrid {

    @NotNull
    private final String buildingId;

    @NotNull
    private final String createdBy;

    @NotNull
    private final String engineVersion;

    @NotNull
    private final String filePath;

    @NotNull
    private final String floorId;

    @NotNull
    private final MapGridType gridType;
    private final long lastReadTimeStampMillis;
    private final int majorVersion;

    @NotNull
    private final String mapId;
    private final int mapVersion;

    @NotNull
    private final String spaceId;

    @NotNull
    private final byte[] tag;

    @NotNull
    private final byte[] vector;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lme/oriient/internal/services/dataManager/database/DbMapGrid$Adapter;", "", "gridTypeAdapter", "Lcom/squareup/sqldelight/ColumnAdapter;", "Lme/oriient/internal/services/dataModel/engine/MapGridType;", "", "(Lcom/squareup/sqldelight/ColumnAdapter;)V", "getGridTypeAdapter", "()Lcom/squareup/sqldelight/ColumnAdapter;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Adapter {

        @NotNull
        private final ColumnAdapter<MapGridType, String> gridTypeAdapter;

        public Adapter(@NotNull ColumnAdapter<MapGridType, String> gridTypeAdapter) {
            Intrinsics.h(gridTypeAdapter, "gridTypeAdapter");
            this.gridTypeAdapter = gridTypeAdapter;
        }

        @NotNull
        public final ColumnAdapter<MapGridType, String> getGridTypeAdapter() {
            return this.gridTypeAdapter;
        }
    }

    public DbMapGrid(@NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull String spaceId, @NotNull String engineVersion, int i, @NotNull String filePath, @NotNull byte[] tag, @NotNull byte[] vector, long j, @NotNull MapGridType gridType, int i2, @NotNull String createdBy) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(engineVersion, "engineVersion");
        Intrinsics.h(filePath, "filePath");
        Intrinsics.h(tag, "tag");
        Intrinsics.h(vector, "vector");
        Intrinsics.h(gridType, "gridType");
        Intrinsics.h(createdBy, "createdBy");
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.mapId = mapId;
        this.spaceId = spaceId;
        this.engineVersion = engineVersion;
        this.mapVersion = i;
        this.filePath = filePath;
        this.tag = tag;
        this.vector = vector;
        this.lastReadTimeStampMillis = j;
        this.gridType = gridType;
        this.majorVersion = i2;
        this.createdBy = createdBy;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    /* renamed from: component10, reason: from getter */
    public final long getLastReadTimeStampMillis() {
        return this.lastReadTimeStampMillis;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final MapGridType getGridType() {
        return this.gridType;
    }

    /* renamed from: component12, reason: from getter */
    public final int getMajorVersion() {
        return this.majorVersion;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMapId() {
        return this.mapId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getEngineVersion() {
        return this.engineVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMapVersion() {
        return this.mapVersion;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final byte[] getTag() {
        return this.tag;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final byte[] getVector() {
        return this.vector;
    }

    @NotNull
    public final DbMapGrid copy(@NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull String spaceId, @NotNull String engineVersion, int mapVersion, @NotNull String filePath, @NotNull byte[] tag, @NotNull byte[] vector, long lastReadTimeStampMillis, @NotNull MapGridType gridType, int majorVersion, @NotNull String createdBy) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(engineVersion, "engineVersion");
        Intrinsics.h(filePath, "filePath");
        Intrinsics.h(tag, "tag");
        Intrinsics.h(vector, "vector");
        Intrinsics.h(gridType, "gridType");
        Intrinsics.h(createdBy, "createdBy");
        return new DbMapGrid(buildingId, floorId, mapId, spaceId, engineVersion, mapVersion, filePath, tag, vector, lastReadTimeStampMillis, gridType, majorVersion, createdBy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbMapGrid)) {
            return false;
        }
        DbMapGrid dbMapGrid = (DbMapGrid) other;
        return Intrinsics.c(this.buildingId, dbMapGrid.buildingId) && Intrinsics.c(this.floorId, dbMapGrid.floorId) && Intrinsics.c(this.mapId, dbMapGrid.mapId) && Intrinsics.c(this.spaceId, dbMapGrid.spaceId) && Intrinsics.c(this.engineVersion, dbMapGrid.engineVersion) && this.mapVersion == dbMapGrid.mapVersion && Intrinsics.c(this.filePath, dbMapGrid.filePath) && Intrinsics.c(this.tag, dbMapGrid.tag) && Intrinsics.c(this.vector, dbMapGrid.vector) && this.lastReadTimeStampMillis == dbMapGrid.lastReadTimeStampMillis && this.gridType == dbMapGrid.gridType && this.majorVersion == dbMapGrid.majorVersion && Intrinsics.c(this.createdBy, dbMapGrid.createdBy);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getCreatedBy() {
        return this.createdBy;
    }

    @NotNull
    public final String getEngineVersion() {
        return this.engineVersion;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    public final MapGridType getGridType() {
        return this.gridType;
    }

    public final long getLastReadTimeStampMillis() {
        return this.lastReadTimeStampMillis;
    }

    public final int getMajorVersion() {
        return this.majorVersion;
    }

    @NotNull
    public final String getMapId() {
        return this.mapId;
    }

    public final int getMapVersion() {
        return this.mapVersion;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    public final byte[] getTag() {
        return this.tag;
    }

    @NotNull
    public final byte[] getVector() {
        return this.vector;
    }

    public int hashCode() {
        return this.createdBy.hashCode() + a.a(this.majorVersion, (this.gridType.hashCode() + K.a(this.lastReadTimeStampMillis, androidx.compose.ui.input.pointer.a.d(androidx.compose.ui.input.pointer.a.d(me.oriient.internal.infra.rest.a.a(this.filePath, a.a(this.mapVersion, me.oriient.internal.infra.rest.a.a(this.engineVersion, me.oriient.internal.infra.rest.a.a(this.spaceId, me.oriient.internal.infra.rest.a.a(this.mapId, me.oriient.internal.infra.rest.a.a(this.floorId, this.buildingId.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31, this.tag), 31, this.vector), 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("\n  |DbMapGrid [\n  |  buildingId: ");
        sb.append(this.buildingId);
        sb.append("\n  |  floorId: ");
        sb.append(this.floorId);
        sb.append("\n  |  mapId: ");
        sb.append(this.mapId);
        sb.append("\n  |  spaceId: ");
        sb.append(this.spaceId);
        sb.append("\n  |  engineVersion: ");
        sb.append(this.engineVersion);
        sb.append("\n  |  mapVersion: ");
        sb.append(this.mapVersion);
        sb.append("\n  |  filePath: ");
        sb.append(this.filePath);
        sb.append("\n  |  tag: ");
        String string = Arrays.toString(this.tag);
        Intrinsics.g(string, "toString(...)");
        sb.append(string);
        sb.append("\n  |  vector: ");
        String string2 = Arrays.toString(this.vector);
        Intrinsics.g(string2, "toString(...)");
        sb.append(string2);
        sb.append("\n  |  lastReadTimeStampMillis: ");
        sb.append(this.lastReadTimeStampMillis);
        sb.append("\n  |  gridType: ");
        sb.append(this.gridType);
        sb.append("\n  |  majorVersion: ");
        sb.append(this.majorVersion);
        sb.append("\n  |  createdBy: ");
        sb.append(this.createdBy);
        sb.append("\n  |]\n  ");
        return StringsKt.n0(sb.toString());
    }
}
