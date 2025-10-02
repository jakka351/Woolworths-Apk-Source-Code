package me.oriient.internal.services.dataManager.database;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.rest.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\bHÖ\u0001J\b\u0010#\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, d2 = {"Lme/oriient/internal/services/dataManager/database/DbObstacles;", "", "buildingId", "", "floorId", "mapId", "spaceId", "mapVersion", "", "filePath", "lastReadTimeStampMillis", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;J)V", "getBuildingId", "()Ljava/lang/String;", "getFilePath", "getFloorId", "getLastReadTimeStampMillis", "()J", "getMapId", "getMapVersion", "()I", "getSpaceId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DbObstacles {

    @NotNull
    private final String buildingId;

    @NotNull
    private final String filePath;

    @NotNull
    private final String floorId;
    private final long lastReadTimeStampMillis;

    @NotNull
    private final String mapId;
    private final int mapVersion;

    @NotNull
    private final String spaceId;

    public DbObstacles(@NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull String spaceId, int i, @NotNull String filePath, long j) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(filePath, "filePath");
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.mapId = mapId;
        this.spaceId = spaceId;
        this.mapVersion = i;
        this.filePath = filePath;
        this.lastReadTimeStampMillis = j;
    }

    public static /* synthetic */ DbObstacles copy$default(DbObstacles dbObstacles, String str, String str2, String str3, String str4, int i, String str5, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dbObstacles.buildingId;
        }
        if ((i2 & 2) != 0) {
            str2 = dbObstacles.floorId;
        }
        if ((i2 & 4) != 0) {
            str3 = dbObstacles.mapId;
        }
        if ((i2 & 8) != 0) {
            str4 = dbObstacles.spaceId;
        }
        if ((i2 & 16) != 0) {
            i = dbObstacles.mapVersion;
        }
        if ((i2 & 32) != 0) {
            str5 = dbObstacles.filePath;
        }
        if ((i2 & 64) != 0) {
            j = dbObstacles.lastReadTimeStampMillis;
        }
        long j2 = j;
        int i3 = i;
        String str6 = str5;
        return dbObstacles.copy(str, str2, str3, str4, i3, str6, j2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
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

    /* renamed from: component5, reason: from getter */
    public final int getMapVersion() {
        return this.mapVersion;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* renamed from: component7, reason: from getter */
    public final long getLastReadTimeStampMillis() {
        return this.lastReadTimeStampMillis;
    }

    @NotNull
    public final DbObstacles copy(@NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull String spaceId, int mapVersion, @NotNull String filePath, long lastReadTimeStampMillis) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(filePath, "filePath");
        return new DbObstacles(buildingId, floorId, mapId, spaceId, mapVersion, filePath, lastReadTimeStampMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbObstacles)) {
            return false;
        }
        DbObstacles dbObstacles = (DbObstacles) other;
        return Intrinsics.c(this.buildingId, dbObstacles.buildingId) && Intrinsics.c(this.floorId, dbObstacles.floorId) && Intrinsics.c(this.mapId, dbObstacles.mapId) && Intrinsics.c(this.spaceId, dbObstacles.spaceId) && this.mapVersion == dbObstacles.mapVersion && Intrinsics.c(this.filePath, dbObstacles.filePath) && this.lastReadTimeStampMillis == dbObstacles.lastReadTimeStampMillis;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    public final long getLastReadTimeStampMillis() {
        return this.lastReadTimeStampMillis;
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

    public int hashCode() {
        return Long.hashCode(this.lastReadTimeStampMillis) + a.a(this.filePath, me.oriient.internal.services.config.a.a(this.mapVersion, a.a(this.spaceId, a.a(this.mapId, a.a(this.floorId, this.buildingId.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return StringsKt.n0("\n  |DbObstacles [\n  |  buildingId: " + this.buildingId + "\n  |  floorId: " + this.floorId + "\n  |  mapId: " + this.mapId + "\n  |  spaceId: " + this.spaceId + "\n  |  mapVersion: " + this.mapVersion + "\n  |  filePath: " + this.filePath + "\n  |  lastReadTimeStampMillis: " + this.lastReadTimeStampMillis + "\n  |]\n  ");
    }
}
