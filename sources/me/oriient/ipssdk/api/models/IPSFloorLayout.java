package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.FindPolygonResult;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.ObstaclesPolygonsFinder;
import me.oriient.ipssdk.realtime.utils.models.Coordinate;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSFloorLayout;", "", "obstaclesFinder", "Lme/oriient/internal/services/dataManager/obstaclesPolygonsFinder/ObstaclesPolygonsFinder;", "(Lme/oriient/internal/services/dataManager/obstaclesPolygonsFinder/ObstaclesPolygonsFinder;)V", "buildingId", "", "getBuildingId", "()Ljava/lang/String;", "floorId", "getFloorId", "mapId", "getMapId$annotations", "()V", "getMapId", "findClosestPart", "Lme/oriient/ipssdk/api/models/IPSFloorLayoutPartFindingResult;", "coordinate", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSFloorLayout {

    @NotNull
    private final ObstaclesPolygonsFinder obstaclesFinder;

    public IPSFloorLayout(@NotNull ObstaclesPolygonsFinder obstaclesFinder) {
        Intrinsics.h(obstaclesFinder, "obstaclesFinder");
        this.obstaclesFinder = obstaclesFinder;
    }

    @Deprecated
    public static /* synthetic */ void getMapId$annotations() {
    }

    @NotNull
    public final IPSFloorLayoutPartFindingResult findClosestPart(@NotNull IPSCoordinate coordinate) {
        Intrinsics.h(coordinate, "coordinate");
        FindPolygonResult findPolygonResultFindClosestPolygon = this.obstaclesFinder.findClosestPolygon(new IndoorCoordinate(coordinate.getX(), coordinate.getY(), 0.0d, 4, (DefaultConstructorMarker) null));
        return findPolygonResultFindClosestPolygon != null ? new IPSFloorLayoutPartFindingResult(new Coordinate(findPolygonResultFindClosestPolygon.getClosestPoint().getX(), findPolygonResultFindClosestPolygon.getClosestPoint().getY(), coordinate.getZ()), findPolygonResultFindClosestPolygon.getDistance()) : new IPSFloorLayoutPartFindingResult(coordinate, 0.0d);
    }

    @NotNull
    public final String getBuildingId() {
        return this.obstaclesFinder.getBuildingId();
    }

    @NotNull
    public final String getFloorId() {
        return this.obstaclesFinder.getFloorId();
    }

    @NotNull
    public final String getMapId() {
        return this.obstaclesFinder.getFloorId();
    }
}
