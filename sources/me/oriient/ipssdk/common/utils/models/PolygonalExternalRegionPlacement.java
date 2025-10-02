package me.oriient.ipssdk.common.utils.models;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSEntrance;
import me.oriient.ipssdk.api.models.IPSGlobalCoordinate;
import me.oriient.ipssdk.api.models.IPSPolygonalExternalRegionPlacement;
import me.oriient.ipssdk.api.models.IPSRegionPlacementFeatures;
import me.oriient.ipssdk.common.utils.PolyUtil;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\u0010\rJ\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0016J\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\""}, d2 = {"Lme/oriient/ipssdk/common/utils/models/PolygonalExternalRegionPlacement;", "Lme/oriient/ipssdk/common/utils/models/ExternalRegionPlacement;", "Lme/oriient/ipssdk/api/models/IPSPolygonalExternalRegionPlacement;", "id", "", "buildingId", "placementEntrances", "", "Lme/oriient/ipssdk/common/utils/models/Entrance;", "placementFeatures", "Lme/oriient/ipssdk/common/utils/models/RegionPlacementFeatures;", "placementVertices", "Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lme/oriient/ipssdk/common/utils/models/RegionPlacementFeatures;Ljava/util/List;)V", "getPlacementEntrances", "()Ljava/util/List;", "getPlacementFeatures", "()Lme/oriient/ipssdk/common/utils/models/RegionPlacementFeatures;", "getPlacementVertices", "getBuildingId", "getEntrances", "Lme/oriient/ipssdk/api/models/IPSEntrance;", "getFeatures", "Lme/oriient/ipssdk/api/models/IPSRegionPlacementFeatures;", "getId", "getShapeType", "", "getVertices", "Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;", "isCoordinateInside", "", "coordinate", "(Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;)Ljava/lang/Boolean;", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PolygonalExternalRegionPlacement extends ExternalRegionPlacement implements IPSPolygonalExternalRegionPlacement {

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PolygonalExternalRegionPlacement(@NotNull String id, @NotNull String buildingId, @NotNull List<Entrance> placementEntrances, @NotNull RegionPlacementFeatures placementFeatures, @NotNull List<? extends WorldCoordinate> placementVertices) {
        super(id, buildingId, placementEntrances, placementFeatures);
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

    @Override // me.oriient.ipssdk.common.utils.models.ExternalRegionPlacement, me.oriient.ipssdk.api.models.IPSExternalRegionPlacement
    @NotNull
    public String getBuildingId() {
        return this.buildingId;
    }

    @Override // me.oriient.ipssdk.common.utils.models.ExternalRegionPlacement, me.oriient.ipssdk.api.models.IPSExternalRegionPlacement
    @NotNull
    public List<IPSEntrance> getEntrances() {
        return this.placementEntrances;
    }

    @Override // me.oriient.ipssdk.common.utils.models.ExternalRegionPlacement, me.oriient.ipssdk.api.models.IPSExternalRegionPlacement
    @NotNull
    public IPSRegionPlacementFeatures getFeatures() {
        return this.placementFeatures;
    }

    @Override // me.oriient.ipssdk.common.utils.models.ExternalRegionPlacement, me.oriient.ipssdk.api.models.IPSExternalRegionPlacement
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final List<Entrance> getPlacementEntrances() {
        return this.placementEntrances;
    }

    @NotNull
    public final RegionPlacementFeatures getPlacementFeatures() {
        return this.placementFeatures;
    }

    @NotNull
    public final List<WorldCoordinate> getPlacementVertices() {
        return this.placementVertices;
    }

    @Override // me.oriient.ipssdk.api.models.IPSExternalRegionPlacement
    public int getShapeType() {
        return 2;
    }

    @Override // me.oriient.ipssdk.api.models.IPSPolygonalExternalRegionPlacement
    @NotNull
    public List<IPSGlobalCoordinate> getVertices() {
        return this.placementVertices;
    }

    @Override // me.oriient.ipssdk.api.models.IPSExternalRegionPlacement
    @NotNull
    public Boolean isCoordinateInside(@NotNull IPSGlobalCoordinate coordinate) {
        Intrinsics.h(coordinate, "coordinate");
        return Boolean.valueOf(PolyUtil.INSTANCE.containsLocation(coordinate, getVertices(), true));
    }

    @Override // me.oriient.ipssdk.common.utils.models.ExternalRegionPlacement
    @NotNull
    public String toString() {
        return "PolygonalExternalRegionPlacement(id='" + this.id + "', buildingId='" + this.buildingId + "', entrances=" + getEntrances() + ", features=" + getFeatures() + ", vertices=" + getVertices() + ')';
    }
}
