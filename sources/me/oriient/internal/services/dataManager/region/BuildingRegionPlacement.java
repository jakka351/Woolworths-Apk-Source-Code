package me.oriient.internal.services.dataManager.region;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.building.BuildingId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lme/oriient/internal/services/dataManager/region/BuildingRegionPlacement;", "", "id", "", "buildingId", "Lme/oriient/internal/services/dataManager/building/BuildingId;", "floorIndex", "", "shape", "Lme/oriient/internal/services/dataManager/region/RegionShape;", "(Ljava/lang/String;Lme/oriient/internal/services/dataManager/building/BuildingId;ILme/oriient/internal/services/dataManager/region/RegionShape;)V", "getBuildingId", "()Lme/oriient/internal/services/dataManager/building/BuildingId;", "getFloorIndex", "()I", "getId", "()Ljava/lang/String;", "getShape", "()Lme/oriient/internal/services/dataManager/region/RegionShape;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BuildingRegionPlacement {

    @NotNull
    private final BuildingId buildingId;
    private final int floorIndex;

    @NotNull
    private final String id;

    @NotNull
    private final RegionShape shape;

    public BuildingRegionPlacement(@NotNull String id, @NotNull BuildingId buildingId, int i, @NotNull RegionShape shape) {
        Intrinsics.h(id, "id");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(shape, "shape");
        this.id = id;
        this.buildingId = buildingId;
        this.floorIndex = i;
        this.shape = shape;
    }

    public static /* synthetic */ BuildingRegionPlacement copy$default(BuildingRegionPlacement buildingRegionPlacement, String str, BuildingId buildingId, int i, RegionShape regionShape, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = buildingRegionPlacement.id;
        }
        if ((i2 & 2) != 0) {
            buildingId = buildingRegionPlacement.buildingId;
        }
        if ((i2 & 4) != 0) {
            i = buildingRegionPlacement.floorIndex;
        }
        if ((i2 & 8) != 0) {
            regionShape = buildingRegionPlacement.shape;
        }
        return buildingRegionPlacement.copy(str, buildingId, i, regionShape);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BuildingId getBuildingId() {
        return this.buildingId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFloorIndex() {
        return this.floorIndex;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final RegionShape getShape() {
        return this.shape;
    }

    @NotNull
    public final BuildingRegionPlacement copy(@NotNull String id, @NotNull BuildingId buildingId, int floorIndex, @NotNull RegionShape shape) {
        Intrinsics.h(id, "id");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(shape, "shape");
        return new BuildingRegionPlacement(id, buildingId, floorIndex, shape);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildingRegionPlacement)) {
            return false;
        }
        BuildingRegionPlacement buildingRegionPlacement = (BuildingRegionPlacement) other;
        return Intrinsics.c(this.id, buildingRegionPlacement.id) && Intrinsics.c(this.buildingId, buildingRegionPlacement.buildingId) && this.floorIndex == buildingRegionPlacement.floorIndex && Intrinsics.c(this.shape, buildingRegionPlacement.shape);
    }

    @NotNull
    public final BuildingId getBuildingId() {
        return this.buildingId;
    }

    public final int getFloorIndex() {
        return this.floorIndex;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final RegionShape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return this.shape.hashCode() + me.oriient.internal.services.config.a.a(this.floorIndex, (this.buildingId.hashCode() + (this.id.hashCode() * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "BuildingRegionPlacement(id=" + this.id + ", buildingId=" + this.buildingId + ", floorIndex=" + this.floorIndex + ", shape=" + this.shape + ')';
    }
}
