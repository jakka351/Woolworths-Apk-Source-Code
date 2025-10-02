package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\""}, d2 = {"Lme/oriient/internal/services/dataManager/building/PolygonalExternalRegionPlacement;", "Lme/oriient/internal/services/dataManager/building/ExternalRegionPlacement;", "id", "", "buildingId", "placementEntrances", "", "Lme/oriient/internal/services/dataManager/building/Entrance;", "placementFeatures", "Lme/oriient/internal/services/dataManager/building/RegionPlacementFeatures;", "placementVertices", "Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lme/oriient/internal/services/dataManager/building/RegionPlacementFeatures;Ljava/util/List;)V", "getBuildingId", "()Ljava/lang/String;", "getId", "getPlacementEntrances", "()Ljava/util/List;", "getPlacementFeatures", "()Lme/oriient/internal/services/dataManager/building/RegionPlacementFeatures;", "getPlacementVertices", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PolygonalExternalRegionPlacement extends ExternalRegionPlacement {

    @NotNull
    private final String buildingId;

    @NotNull
    private final String id;

    @NotNull
    private final List<Entrance> placementEntrances;

    @NotNull
    private final RegionPlacementFeatures placementFeatures;

    @NotNull
    private final List<WorldCoordinate> placementVertices;

    public PolygonalExternalRegionPlacement(@NotNull String id, @NotNull String buildingId, @NotNull List<Entrance> placementEntrances, @NotNull RegionPlacementFeatures placementFeatures, @NotNull List<WorldCoordinate> placementVertices) {
        Intrinsics.h(id, "id");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(placementEntrances, "placementEntrances");
        Intrinsics.h(placementFeatures, "placementFeatures");
        Intrinsics.h(placementVertices, "placementVertices");
        this.id = id;
        this.buildingId = buildingId;
        this.placementEntrances = placementEntrances;
        this.placementFeatures = placementFeatures;
        this.placementVertices = placementVertices;
    }

    public static /* synthetic */ PolygonalExternalRegionPlacement copy$default(PolygonalExternalRegionPlacement polygonalExternalRegionPlacement, String str, String str2, List list, RegionPlacementFeatures regionPlacementFeatures, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = polygonalExternalRegionPlacement.id;
        }
        if ((i & 2) != 0) {
            str2 = polygonalExternalRegionPlacement.buildingId;
        }
        if ((i & 4) != 0) {
            list = polygonalExternalRegionPlacement.placementEntrances;
        }
        if ((i & 8) != 0) {
            regionPlacementFeatures = polygonalExternalRegionPlacement.placementFeatures;
        }
        if ((i & 16) != 0) {
            list2 = polygonalExternalRegionPlacement.placementVertices;
        }
        List list3 = list2;
        List list4 = list;
        return polygonalExternalRegionPlacement.copy(str, str2, list4, regionPlacementFeatures, list3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final List<Entrance> component3() {
        return this.placementEntrances;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final RegionPlacementFeatures getPlacementFeatures() {
        return this.placementFeatures;
    }

    @NotNull
    public final List<WorldCoordinate> component5() {
        return this.placementVertices;
    }

    @NotNull
    public final PolygonalExternalRegionPlacement copy(@NotNull String id, @NotNull String buildingId, @NotNull List<Entrance> placementEntrances, @NotNull RegionPlacementFeatures placementFeatures, @NotNull List<WorldCoordinate> placementVertices) {
        Intrinsics.h(id, "id");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(placementEntrances, "placementEntrances");
        Intrinsics.h(placementFeatures, "placementFeatures");
        Intrinsics.h(placementVertices, "placementVertices");
        return new PolygonalExternalRegionPlacement(id, buildingId, placementEntrances, placementFeatures, placementVertices);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PolygonalExternalRegionPlacement)) {
            return false;
        }
        PolygonalExternalRegionPlacement polygonalExternalRegionPlacement = (PolygonalExternalRegionPlacement) other;
        return Intrinsics.c(this.id, polygonalExternalRegionPlacement.id) && Intrinsics.c(this.buildingId, polygonalExternalRegionPlacement.buildingId) && Intrinsics.c(this.placementEntrances, polygonalExternalRegionPlacement.placementEntrances) && Intrinsics.c(this.placementFeatures, polygonalExternalRegionPlacement.placementFeatures) && Intrinsics.c(this.placementVertices, polygonalExternalRegionPlacement.placementVertices);
    }

    @Override // me.oriient.internal.services.dataManager.building.ExternalRegionPlacement
    @NotNull
    public String getBuildingId() {
        return this.buildingId;
    }

    @Override // me.oriient.internal.services.dataManager.building.ExternalRegionPlacement
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // me.oriient.internal.services.dataManager.building.ExternalRegionPlacement
    @NotNull
    public List<Entrance> getPlacementEntrances() {
        return this.placementEntrances;
    }

    @Override // me.oriient.internal.services.dataManager.building.ExternalRegionPlacement
    @NotNull
    public RegionPlacementFeatures getPlacementFeatures() {
        return this.placementFeatures;
    }

    @NotNull
    public final List<WorldCoordinate> getPlacementVertices() {
        return this.placementVertices;
    }

    public int hashCode() {
        return this.placementVertices.hashCode() + ((this.placementFeatures.hashCode() + androidx.camera.core.impl.b.d(me.oriient.internal.infra.rest.a.a(this.buildingId, this.id.hashCode() * 31, 31), 31, this.placementEntrances)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PolygonalExternalRegionPlacement(id=");
        sb.append(this.id);
        sb.append(", buildingId=");
        sb.append(this.buildingId);
        sb.append(", placementEntrances=");
        sb.append(this.placementEntrances);
        sb.append(", placementFeatures=");
        sb.append(this.placementFeatures);
        sb.append(", placementVertices=");
        return me.oriient.internal.services.auth.rest.m.a(sb, this.placementVertices, ')');
    }
}
