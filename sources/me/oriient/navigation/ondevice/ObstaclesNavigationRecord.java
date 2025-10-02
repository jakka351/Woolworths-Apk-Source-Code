package me.oriient.navigation.ondevice;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.obstacles.Obstacles;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lme/oriient/navigation/ondevice/ObstaclesNavigationRecord;", "", "buildingId", "", "floorId", "obstacles", "Lme/oriient/internal/services/dataManager/obstacles/Obstacles;", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/obstacles/Obstacles;)V", "getBuildingId", "()Ljava/lang/String;", "getFloorId", "getObstacles", "()Lme/oriient/internal/services/dataManager/obstacles/Obstacles;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ObstaclesNavigationRecord {

    @NotNull
    private final String buildingId;

    @NotNull
    private final String floorId;

    @NotNull
    private final Obstacles obstacles;

    public ObstaclesNavigationRecord(@NotNull String buildingId, @NotNull String floorId, @NotNull Obstacles obstacles) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(obstacles, "obstacles");
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.obstacles = obstacles;
    }

    public static /* synthetic */ ObstaclesNavigationRecord copy$default(ObstaclesNavigationRecord obstaclesNavigationRecord, String str, String str2, Obstacles obstacles, int i, Object obj) {
        if ((i & 1) != 0) {
            str = obstaclesNavigationRecord.buildingId;
        }
        if ((i & 2) != 0) {
            str2 = obstaclesNavigationRecord.floorId;
        }
        if ((i & 4) != 0) {
            obstacles = obstaclesNavigationRecord.obstacles;
        }
        return obstaclesNavigationRecord.copy(str, str2, obstacles);
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
    public final Obstacles getObstacles() {
        return this.obstacles;
    }

    @NotNull
    public final ObstaclesNavigationRecord copy(@NotNull String buildingId, @NotNull String floorId, @NotNull Obstacles obstacles) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(obstacles, "obstacles");
        return new ObstaclesNavigationRecord(buildingId, floorId, obstacles);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ObstaclesNavigationRecord)) {
            return false;
        }
        ObstaclesNavigationRecord obstaclesNavigationRecord = (ObstaclesNavigationRecord) other;
        return Intrinsics.c(this.buildingId, obstaclesNavigationRecord.buildingId) && Intrinsics.c(this.floorId, obstaclesNavigationRecord.floorId) && Intrinsics.c(this.obstacles, obstaclesNavigationRecord.obstacles);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    public final Obstacles getObstacles() {
        return this.obstacles;
    }

    public int hashCode() {
        return this.obstacles.hashCode() + androidx.camera.core.impl.b.c(this.buildingId.hashCode() * 31, 31, this.floorId);
    }

    @NotNull
    public String toString() {
        return "ObstaclesNavigationRecord(buildingId=" + this.buildingId + ", floorId=" + this.floorId + ", obstacles=" + this.obstacles + ')';
    }
}
