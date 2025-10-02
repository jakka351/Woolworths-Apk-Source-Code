package me.oriient.internal.services.dataManager.region;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lme/oriient/internal/services/dataManager/region/BuildingExitRegion;", "", "id", "", "buildingId", "floorOrder", "", "shape", "Lme/oriient/internal/services/dataManager/region/RegionShape;", "(Ljava/lang/String;Ljava/lang/String;ILme/oriient/internal/services/dataManager/region/RegionShape;)V", "getBuildingId", "()Ljava/lang/String;", "getFloorOrder", "()I", "getId", "getShape", "()Lme/oriient/internal/services/dataManager/region/RegionShape;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BuildingExitRegion {

    @NotNull
    private final String buildingId;
    private final int floorOrder;

    @NotNull
    private final String id;

    @NotNull
    private final RegionShape shape;

    public BuildingExitRegion(@NotNull String id, @NotNull String buildingId, int i, @NotNull RegionShape shape) {
        Intrinsics.h(id, "id");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(shape, "shape");
        this.id = id;
        this.buildingId = buildingId;
        this.floorOrder = i;
        this.shape = shape;
    }

    public static /* synthetic */ BuildingExitRegion copy$default(BuildingExitRegion buildingExitRegion, String str, String str2, int i, RegionShape regionShape, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = buildingExitRegion.id;
        }
        if ((i2 & 2) != 0) {
            str2 = buildingExitRegion.buildingId;
        }
        if ((i2 & 4) != 0) {
            i = buildingExitRegion.floorOrder;
        }
        if ((i2 & 8) != 0) {
            regionShape = buildingExitRegion.shape;
        }
        return buildingExitRegion.copy(str, str2, i, regionShape);
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

    /* renamed from: component3, reason: from getter */
    public final int getFloorOrder() {
        return this.floorOrder;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final RegionShape getShape() {
        return this.shape;
    }

    @NotNull
    public final BuildingExitRegion copy(@NotNull String id, @NotNull String buildingId, int floorOrder, @NotNull RegionShape shape) {
        Intrinsics.h(id, "id");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(shape, "shape");
        return new BuildingExitRegion(id, buildingId, floorOrder, shape);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildingExitRegion)) {
            return false;
        }
        BuildingExitRegion buildingExitRegion = (BuildingExitRegion) other;
        return Intrinsics.c(this.id, buildingExitRegion.id) && Intrinsics.c(this.buildingId, buildingExitRegion.buildingId) && this.floorOrder == buildingExitRegion.floorOrder && Intrinsics.c(this.shape, buildingExitRegion.shape);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    public final int getFloorOrder() {
        return this.floorOrder;
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
        return this.shape.hashCode() + me.oriient.internal.services.config.a.a(this.floorOrder, me.oriient.internal.infra.rest.a.a(this.buildingId, this.id.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "BuildingExitRegion(id=" + this.id + ", buildingId=" + this.buildingId + ", floorOrder=" + this.floorOrder + ", shape=" + this.shape + ')';
    }
}
