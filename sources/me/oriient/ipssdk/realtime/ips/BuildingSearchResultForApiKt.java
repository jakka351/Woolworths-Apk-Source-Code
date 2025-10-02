package me.oriient.ipssdk.realtime.ips;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.building.BuildingSearchResult;
import me.oriient.ipssdk.common.utils.models.WorldCoordinate;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toIpsBuildingSearchResult", "Lme/oriient/ipssdk/realtime/ips/BuildingSearchResultForApi;", "Lme/oriient/internal/services/dataManager/building/BuildingSearchResult;", "me.oriient.sdk-realtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BuildingSearchResultForApiKt {
    @NotNull
    public static final BuildingSearchResultForApi toIpsBuildingSearchResult(@NotNull BuildingSearchResult buildingSearchResult) {
        Intrinsics.h(buildingSearchResult, "<this>");
        return new BuildingSearchResultForApi(buildingSearchResult.getId(), buildingSearchResult.getName(), buildingSearchResult.getBuildingToEnuRotation(), new WorldCoordinate(buildingSearchResult.getBuildingOrigin().getLatitude(), buildingSearchResult.getBuildingOrigin().getLongitude(), buildingSearchResult.getBuildingOrigin().getAltitude()), new WorldCoordinate(buildingSearchResult.getGeofenceOrigin().getLatitude(), buildingSearchResult.getGeofenceOrigin().getLongitude(), buildingSearchResult.getGeofenceOrigin().getAltitude()), buildingSearchResult.getGeofenceRadius(), buildingSearchResult.getPrimaryFloorId(), buildingSearchResult.getClientBuildingId(), buildingSearchResult.getDisplayName());
    }
}
