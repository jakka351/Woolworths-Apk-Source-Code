package me.oriient.internal.services.geofence.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.building.BuildingSearchResult;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"toGeofenceBuilding", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "Lme/oriient/internal/services/dataManager/building/Building;", "Lme/oriient/internal/services/dataManager/building/BuildingSearchResult;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GeofenceBuildingKt {
    @Keep
    @NotNull
    public static final GeofenceBuilding toGeofenceBuilding(@NotNull Building building) {
        Intrinsics.h(building, "<this>");
        return new GeofenceBuilding(building.getId(), building.getGeofenceOrigin(), building.getGeofenceRadiusMeters(), building.getExternalRegions());
    }

    @Keep
    @NotNull
    public static final GeofenceBuilding toGeofenceBuilding(@NotNull BuildingSearchResult buildingSearchResult) {
        Intrinsics.h(buildingSearchResult, "<this>");
        return new GeofenceBuilding(buildingSearchResult.getId(), buildingSearchResult.getGeofenceOrigin(), buildingSearchResult.getGeofenceRadius(), null);
    }
}
