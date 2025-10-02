package me.oriient.internal.services.geofence.models;

import androidx.annotation.Keep;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.services.auth.rest.m;
import me.oriient.internal.services.dataManager.building.ExternalRegion;
import me.oriient.internal.services.dataManager.building.ExternalRegionPlacement;
import me.oriient.internal.services.dataManager.building.PolygonalExternalRegionPlacement;
import me.oriient.internal.services.dataManager.building.RegionPlacementFeatures;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010\u001c\u001a\u00020\u001aJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001d\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\"J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "", "id", "", "geofenceOrigin", "Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "geofenceRadiusMeters", "", "externalRegions", "", "Lme/oriient/internal/services/dataManager/building/ExternalRegion;", "(Ljava/lang/String;Lme/oriient/internal/services/dataManager/common/WorldCoordinate;DLjava/util/List;)V", "getExternalRegions", "()Ljava/util/List;", "getGeofenceOrigin", "()Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "getGeofenceRadiusMeters", "()D", "getId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hasPositioningFeature", "hashCode", "", "isInsideRadius", "location", "radiusMeters", "isInsideRadius$internal_publishRelease", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class GeofenceBuilding {

    @Nullable
    private final List<ExternalRegion> externalRegions;

    @NotNull
    private final WorldCoordinate geofenceOrigin;
    private final double geofenceRadiusMeters;

    @NotNull
    private final String id;

    public GeofenceBuilding(@NotNull String id, @NotNull WorldCoordinate geofenceOrigin, double d, @Nullable List<ExternalRegion> list) {
        Intrinsics.h(id, "id");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        this.id = id;
        this.geofenceOrigin = geofenceOrigin;
        this.geofenceRadiusMeters = d;
        this.externalRegions = list;
    }

    public static /* synthetic */ GeofenceBuilding copy$default(GeofenceBuilding geofenceBuilding, String str, WorldCoordinate worldCoordinate, double d, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = geofenceBuilding.id;
        }
        if ((i & 2) != 0) {
            worldCoordinate = geofenceBuilding.geofenceOrigin;
        }
        if ((i & 4) != 0) {
            d = geofenceBuilding.geofenceRadiusMeters;
        }
        if ((i & 8) != 0) {
            list = geofenceBuilding.externalRegions;
        }
        List list2 = list;
        return geofenceBuilding.copy(str, worldCoordinate, d, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final WorldCoordinate getGeofenceOrigin() {
        return this.geofenceOrigin;
    }

    /* renamed from: component3, reason: from getter */
    public final double getGeofenceRadiusMeters() {
        return this.geofenceRadiusMeters;
    }

    @Nullable
    public final List<ExternalRegion> component4() {
        return this.externalRegions;
    }

    @NotNull
    public final GeofenceBuilding copy(@NotNull String id, @NotNull WorldCoordinate geofenceOrigin, double geofenceRadiusMeters, @Nullable List<ExternalRegion> externalRegions) {
        Intrinsics.h(id, "id");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        return new GeofenceBuilding(id, geofenceOrigin, geofenceRadiusMeters, externalRegions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GeofenceBuilding) && Intrinsics.c(this.id, ((GeofenceBuilding) other).id);
    }

    @Nullable
    public final List<ExternalRegion> getExternalRegions() {
        return this.externalRegions;
    }

    @NotNull
    public final WorldCoordinate getGeofenceOrigin() {
        return this.geofenceOrigin;
    }

    public final double getGeofenceRadiusMeters() {
        return this.geofenceRadiusMeters;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean hasPositioningFeature() {
        RegionPlacementFeatures placementFeatures;
        List<ExternalRegion> list = this.externalRegions;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<ExternalRegionPlacement> placements = ((ExternalRegion) it.next()).getPlacements();
            if (!(placements instanceof Collection) || !placements.isEmpty()) {
                for (ExternalRegionPlacement externalRegionPlacement : placements) {
                    PolygonalExternalRegionPlacement polygonalExternalRegionPlacement = externalRegionPlacement instanceof PolygonalExternalRegionPlacement ? (PolygonalExternalRegionPlacement) externalRegionPlacement : null;
                    if (polygonalExternalRegionPlacement != null && (placementFeatures = polygonalExternalRegionPlacement.getPlacementFeatures()) != null && placementFeatures.getCanStartPositioning()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public final boolean isInsideRadius$internal_publishRelease(@NotNull WorldCoordinate location, double radiusMeters) {
        Intrinsics.h(location, "location");
        return this.geofenceOrigin.distanceTo(location) <= radiusMeters;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GeofenceBuilding(id=");
        sb.append(this.id);
        sb.append(", geofenceOrigin=");
        sb.append(this.geofenceOrigin);
        sb.append(", geofenceRadiusMeters=");
        sb.append(this.geofenceRadiusMeters);
        sb.append(", externalRegions=");
        return m.a(sb, this.externalRegions, ')');
    }
}
