package me.oriient.ipssdk.common.utils.models;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSEntrance;
import me.oriient.ipssdk.api.models.IPSExternalRegionPlacement;
import me.oriient.ipssdk.api.models.IPSRegionPlacementFeatures;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/ExternalRegionPlacement;", "Lme/oriient/ipssdk/api/models/IPSExternalRegionPlacement;", "id", "", "buildingId", "placementEntrances", "", "Lme/oriient/ipssdk/common/utils/models/Entrance;", "regionFeatures", "Lme/oriient/ipssdk/common/utils/models/RegionPlacementFeatures;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lme/oriient/ipssdk/common/utils/models/RegionPlacementFeatures;)V", "getBuildingId", "getEntrances", "Lme/oriient/ipssdk/api/models/IPSEntrance;", "getFeatures", "Lme/oriient/ipssdk/api/models/IPSRegionPlacementFeatures;", "getId", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ExternalRegionPlacement implements IPSExternalRegionPlacement {

    @NotNull
    private final String buildingId;

    @NotNull
    private final String id;

    @NotNull
    private final List<Entrance> placementEntrances;

    @NotNull
    private final RegionPlacementFeatures regionFeatures;

    public ExternalRegionPlacement(@NotNull String id, @NotNull String buildingId, @NotNull List<Entrance> placementEntrances, @NotNull RegionPlacementFeatures regionFeatures) {
        Intrinsics.h(id, "id");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(placementEntrances, "placementEntrances");
        Intrinsics.h(regionFeatures, "regionFeatures");
        this.id = id;
        this.buildingId = buildingId;
        this.placementEntrances = placementEntrances;
        this.regionFeatures = regionFeatures;
    }

    @Override // me.oriient.ipssdk.api.models.IPSExternalRegionPlacement
    @NotNull
    public String getBuildingId() {
        return this.buildingId;
    }

    @Override // me.oriient.ipssdk.api.models.IPSExternalRegionPlacement
    @NotNull
    public List<IPSEntrance> getEntrances() {
        return this.placementEntrances;
    }

    @Override // me.oriient.ipssdk.api.models.IPSExternalRegionPlacement
    @NotNull
    public IPSRegionPlacementFeatures getFeatures() {
        return this.regionFeatures;
    }

    @Override // me.oriient.ipssdk.api.models.IPSExternalRegionPlacement
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        return "ExternalRegionPlacement(id='" + this.id + "', buildingId='" + this.buildingId + "', entrances=" + getEntrances() + ", features=" + getFeatures() + ')';
    }
}
