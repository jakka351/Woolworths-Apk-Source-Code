package me.oriient.ipssdk.realtime.ips;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.building.Entrance;
import me.oriient.internal.services.dataManager.building.ExternalRegion;
import me.oriient.internal.services.dataManager.building.ExternalRegionPlacement;
import me.oriient.internal.services.dataManager.building.Floor;
import me.oriient.internal.services.dataManager.building.PolygonalExternalRegionPlacement;
import me.oriient.internal.services.dataManager.building.RegionPlacementFeatures;
import me.oriient.internal.services.dataManager.common.Heading;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMap;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSGlobalCoordinate;
import me.oriient.ipssdk.api.models.IPSHeading;
import me.oriient.ipssdk.base.auth.SpaceId;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.common.utils.models.BuildingId;
import me.oriient.navigation.common.models.NavigationBuilding;
import me.oriient.navigation.common.models.NavigationFloor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lme/oriient/internal/services/dataManager/building/Building;", "Lme/oriient/ipssdk/common/utils/models/Building;", "toSdkBuilding", "(Lme/oriient/internal/services/dataManager/building/Building;)Lme/oriient/ipssdk/common/utils/models/Building;", "Lme/oriient/internal/services/dataManager/building/Floor;", "Lme/oriient/ipssdk/common/utils/models/Floor;", "toSdkFloor", "(Lme/oriient/internal/services/dataManager/building/Floor;)Lme/oriient/ipssdk/common/utils/models/Floor;", "Lme/oriient/internal/services/dataManager/building/ExternalRegionPlacement;", "Lme/oriient/ipssdk/common/utils/models/ExternalRegionPlacement;", "toSdkExternalRegionPlacement", "(Lme/oriient/internal/services/dataManager/building/ExternalRegionPlacement;)Lme/oriient/ipssdk/common/utils/models/ExternalRegionPlacement;", "Lme/oriient/navigation/common/models/NavigationBuilding;", "toNavigationBuilding", "(Lme/oriient/internal/services/dataManager/building/Building;)Lme/oriient/navigation/common/models/NavigationBuilding;", "Lme/oriient/navigation/common/models/NavigationFloor;", "toNavigationFloor", "(Lme/oriient/internal/services/dataManager/building/Floor;)Lme/oriient/navigation/common/models/NavigationFloor;", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "toIndoorCoordinate", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;)Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;", "Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "toWorldCoordinate", "(Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;)Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "Lme/oriient/ipssdk/api/models/IPSHeading;", "Lme/oriient/internal/services/dataManager/common/Heading;", "toHeading", "(Lme/oriient/ipssdk/api/models/IPSHeading;)Lme/oriient/internal/services/dataManager/common/Heading;", "me.oriient.sdk-realtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class BuildingExtKt {
    @NotNull
    public static final Heading toHeading(@NotNull IPSHeading iPSHeading) {
        Intrinsics.h(iPSHeading, "<this>");
        return new Heading(iPSHeading.getF26195a(), iPSHeading.getB(), 0.0d, 4, null);
    }

    @NotNull
    public static final IndoorCoordinate toIndoorCoordinate(@NotNull IPSCoordinate iPSCoordinate) {
        Intrinsics.h(iPSCoordinate, "<this>");
        return new IndoorCoordinate(iPSCoordinate.getX(), iPSCoordinate.getY(), iPSCoordinate.getZ());
    }

    @NotNull
    public static final NavigationBuilding toNavigationBuilding(@NotNull Building building) {
        Intrinsics.h(building, "<this>");
        String id = building.getId();
        List<Floor> floors = building.getFloors();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(floors, 10));
        Iterator<T> it = floors.iterator();
        while (it.hasNext()) {
            arrayList.add(toNavigationFloor((Floor) it.next()));
        }
        return new NavigationBuilding(id, arrayList);
    }

    @NotNull
    public static final NavigationFloor toNavigationFloor(@NotNull Floor floor) {
        Intrinsics.h(floor, "<this>");
        return new NavigationFloor(floor.getId(), floor.getOrder());
    }

    @NotNull
    public static final me.oriient.ipssdk.common.utils.models.Building toSdkBuilding(@NotNull Building building) {
        Intrinsics.h(building, "<this>");
        String strM441constructorimpl = BuildingId.m441constructorimpl(building.getId());
        String name = building.getName();
        double rotationToEnu = building.getRotationToEnu();
        WorldCoordinate buildingOrigin = building.getBuildingOrigin();
        me.oriient.ipssdk.common.utils.models.WorldCoordinate worldCoordinate = new me.oriient.ipssdk.common.utils.models.WorldCoordinate(buildingOrigin.getLatitude(), buildingOrigin.getLongitude(), buildingOrigin.getAltitude());
        WorldCoordinate geofenceOrigin = building.getGeofenceOrigin();
        me.oriient.ipssdk.common.utils.models.WorldCoordinate worldCoordinate2 = new me.oriient.ipssdk.common.utils.models.WorldCoordinate(geofenceOrigin.getLatitude(), geofenceOrigin.getLongitude(), geofenceOrigin.getAltitude());
        double geofenceRadiusMeters = building.getGeofenceRadiusMeters();
        String id = building.getPrimaryFloor().getId();
        String strM411constructorimpl = SpaceId.m411constructorimpl(building.getSpaceId());
        List<Floor> floors = building.getFloors();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(floors, 10));
        Iterator<T> it = floors.iterator();
        while (it.hasNext()) {
            arrayList.add(toSdkFloor((Floor) it.next()));
        }
        List<ExternalRegion> externalRegions = building.getExternalRegions();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(externalRegions, 10));
        Iterator it2 = externalRegions.iterator();
        while (it2.hasNext()) {
            ExternalRegion externalRegion = (ExternalRegion) it2.next();
            String id2 = externalRegion.getId();
            Iterator it3 = it2;
            String name2 = externalRegion.getName();
            String metadata = externalRegion.getMetadata();
            List<ExternalRegionPlacement> placements = externalRegion.getPlacements();
            String str = strM441constructorimpl;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it4 = placements.iterator();
            while (it4.hasNext()) {
                String str2 = name;
                me.oriient.ipssdk.common.utils.models.ExternalRegionPlacement sdkExternalRegionPlacement = toSdkExternalRegionPlacement((ExternalRegionPlacement) it4.next());
                if (sdkExternalRegionPlacement != null) {
                    arrayList3.add(sdkExternalRegionPlacement);
                }
                name = str2;
            }
            arrayList2.add(new me.oriient.ipssdk.common.utils.models.ExternalRegion(id2, name2, metadata, arrayList3));
            it2 = it3;
            strM441constructorimpl = str;
            name = name;
        }
        return new me.oriient.ipssdk.common.utils.models.Building(strM441constructorimpl, name, rotationToEnu, worldCoordinate, worldCoordinate2, geofenceRadiusMeters, id, strM411constructorimpl, arrayList, arrayList2, building.isFloorDetectionSupported(), building.getClientBuildingId(), building.getDisplayName(), building.getMetadata(), null);
    }

    @Nullable
    public static final me.oriient.ipssdk.common.utils.models.ExternalRegionPlacement toSdkExternalRegionPlacement(@NotNull ExternalRegionPlacement externalRegionPlacement) {
        Intrinsics.h(externalRegionPlacement, "<this>");
        if (!(externalRegionPlacement instanceof PolygonalExternalRegionPlacement)) {
            ((Logger) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(Logger.class))).d("ExternalRegionPlacement", "toSdkExternalRegionPlacement: unknown external region - " + externalRegionPlacement);
            return null;
        }
        PolygonalExternalRegionPlacement polygonalExternalRegionPlacement = (PolygonalExternalRegionPlacement) externalRegionPlacement;
        String id = polygonalExternalRegionPlacement.getId();
        String buildingId = polygonalExternalRegionPlacement.getBuildingId();
        List<Entrance> placementEntrances = polygonalExternalRegionPlacement.getPlacementEntrances();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(placementEntrances, 10));
        for (Entrance entrance : placementEntrances) {
            arrayList.add(new me.oriient.ipssdk.common.utils.models.Entrance(entrance.getId(), entrance.getEntranceDescription(), entrance.isMain(), entrance.getX(), entrance.getY()));
        }
        RegionPlacementFeatures placementFeatures = polygonalExternalRegionPlacement.getPlacementFeatures();
        me.oriient.ipssdk.common.utils.models.RegionPlacementFeatures regionPlacementFeatures = new me.oriient.ipssdk.common.utils.models.RegionPlacementFeatures(placementFeatures.getCanStartPositioning(), placementFeatures.getCanStopPositioning());
        List<WorldCoordinate> placementVertices = polygonalExternalRegionPlacement.getPlacementVertices();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(placementVertices, 10));
        for (WorldCoordinate worldCoordinate : placementVertices) {
            arrayList2.add(new me.oriient.ipssdk.common.utils.models.WorldCoordinate(worldCoordinate.getLatitude(), worldCoordinate.getLongitude(), worldCoordinate.getAltitude()));
        }
        return new me.oriient.ipssdk.common.utils.models.PolygonalExternalRegionPlacement(id, buildingId, arrayList, regionPlacementFeatures, arrayList2);
    }

    @NotNull
    public static final me.oriient.ipssdk.common.utils.models.Floor toSdkFloor(@NotNull Floor floor) {
        Intrinsics.h(floor, "<this>");
        String id = floor.getId();
        String name = floor.getName();
        String shortName = floor.getShortName();
        int order = floor.getOrder();
        List<Entrance> floorEntrances = floor.getFloorEntrances();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(floorEntrances, 10));
        for (Entrance entrance : floorEntrances) {
            arrayList.add(new me.oriient.ipssdk.common.utils.models.Entrance(entrance.getId(), entrance.getEntranceDescription(), entrance.isMain(), entrance.getX(), entrance.getY()));
        }
        double height = floor.getHeight();
        FloorMap primaryMap = floor.getPrimaryMap();
        return new me.oriient.ipssdk.common.utils.models.Floor(id, name, shortName, order, primaryMap != null ? primaryMap.getId() : null, arrayList, height);
    }

    @NotNull
    public static final WorldCoordinate toWorldCoordinate(@NotNull IPSGlobalCoordinate iPSGlobalCoordinate) {
        Intrinsics.h(iPSGlobalCoordinate, "<this>");
        return new WorldCoordinate(iPSGlobalCoordinate.getLatitude(), iPSGlobalCoordinate.getLongitude(), iPSGlobalCoordinate.getAltitude());
    }
}
