package me.oriient.internal.services.dataManager.floorMetadata;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.region.RegionShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorExitRegion;", "", "id", "", "shape", "Lme/oriient/internal/services/dataManager/region/RegionShape;", "(Ljava/lang/String;Lme/oriient/internal/services/dataManager/region/RegionShape;)V", "getId", "()Ljava/lang/String;", "getShape", "()Lme/oriient/internal/services/dataManager/region/RegionShape;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FloorExitRegion {

    @NotNull
    private final String id;

    @NotNull
    private final RegionShape shape;

    public FloorExitRegion(@NotNull String id, @NotNull RegionShape shape) {
        Intrinsics.h(id, "id");
        Intrinsics.h(shape, "shape");
        this.id = id;
        this.shape = shape;
    }

    public static /* synthetic */ FloorExitRegion copy$default(FloorExitRegion floorExitRegion, String str, RegionShape regionShape, int i, Object obj) {
        if ((i & 1) != 0) {
            str = floorExitRegion.id;
        }
        if ((i & 2) != 0) {
            regionShape = floorExitRegion.shape;
        }
        return floorExitRegion.copy(str, regionShape);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RegionShape getShape() {
        return this.shape;
    }

    @NotNull
    public final FloorExitRegion copy(@NotNull String id, @NotNull RegionShape shape) {
        Intrinsics.h(id, "id");
        Intrinsics.h(shape, "shape");
        return new FloorExitRegion(id, shape);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorExitRegion)) {
            return false;
        }
        FloorExitRegion floorExitRegion = (FloorExitRegion) other;
        return Intrinsics.c(this.id, floorExitRegion.id) && Intrinsics.c(this.shape, floorExitRegion.shape);
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
        return this.shape.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "FloorExitRegion(id=" + this.id + ", shape=" + this.shape + ')';
    }
}
