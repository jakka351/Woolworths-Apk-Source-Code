package me.oriient.ipssdk.realtime.utils.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.region.BuildingRegion;
import me.oriient.internal.services.dataManager.region.BuildingRegionPlacement;
import me.oriient.internal.services.dataManager.region.RegionShape;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0000¨\u0006\t"}, d2 = {"toRegion", "Lme/oriient/ipssdk/realtime/utils/models/Region;", "Lme/oriient/internal/services/dataManager/region/BuildingRegion;", "toRegionPlacementInBuilding", "Lme/oriient/ipssdk/realtime/utils/models/RegionPlacementInBuilding;", "Lme/oriient/internal/services/dataManager/region/BuildingRegionPlacement;", "toShape", "Lme/oriient/ipssdk/realtime/utils/models/Shape;", "Lme/oriient/internal/services/dataManager/region/RegionShape;", "me.oriient.sdk-realtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class RegionKt {
    @NotNull
    public static final Region toRegion(@NotNull BuildingRegion buildingRegion) {
        Intrinsics.h(buildingRegion, "<this>");
        Region region = new Region(buildingRegion.getId(), buildingRegion.getName(), buildingRegion.getMetadata());
        List<BuildingRegionPlacement> placements = buildingRegion.getPlacements();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(placements, 10));
        Iterator<T> it = placements.iterator();
        while (it.hasNext()) {
            arrayList.add(toRegionPlacementInBuilding((BuildingRegionPlacement) it.next()));
        }
        region.placements = arrayList;
        return region;
    }

    @NotNull
    public static final RegionPlacementInBuilding toRegionPlacementInBuilding(@NotNull BuildingRegionPlacement buildingRegionPlacement) {
        Intrinsics.h(buildingRegionPlacement, "<this>");
        RegionPlacementInBuilding regionPlacementInBuilding = new RegionPlacementInBuilding(buildingRegionPlacement.getId(), buildingRegionPlacement.getFloorIndex(), toShape(buildingRegionPlacement.getShape()));
        regionPlacementInBuilding.buildingId = buildingRegionPlacement.getBuildingId().getValue();
        return regionPlacementInBuilding;
    }

    @NotNull
    public static final Shape toShape(@NotNull RegionShape regionShape) {
        Intrinsics.h(regionShape, "<this>");
        if (regionShape instanceof RegionShape.Circle) {
            RegionShape.Circle circle = (RegionShape.Circle) regionShape;
            return new CircularShape(CoordinateKt.toCoordinate(circle.getCenter()), circle.getRadiusMeters());
        }
        if (!(regionShape instanceof RegionShape.Polygon)) {
            if (!(regionShape instanceof RegionShape.Rectangle)) {
                throw new NoWhenBranchMatchedException();
            }
            RegionShape.Rectangle rectangle = (RegionShape.Rectangle) regionShape;
            return new RectangularShape(CoordinateKt.toCoordinate(rectangle.getTopRight()), CoordinateKt.toCoordinate(rectangle.getBottomLeft()));
        }
        List<IndoorCoordinate> vertices = ((RegionShape.Polygon) regionShape).getVertices();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(vertices, 10));
        Iterator<T> it = vertices.iterator();
        while (it.hasNext()) {
            arrayList.add(CoordinateKt.toCoordinate((IndoorCoordinate) it.next()));
        }
        return new PolygonalShape(arrayList);
    }
}
