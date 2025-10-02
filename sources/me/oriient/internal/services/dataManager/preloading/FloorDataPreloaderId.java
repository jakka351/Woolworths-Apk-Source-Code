package me.oriient.internal.services.dataManager.preloading;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lme/oriient/internal/services/dataManager/preloading/FloorDataPreloaderId;", "", "buildingId", "", "floorId", "(Ljava/lang/String;Ljava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "getFloorId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FloorDataPreloaderId {

    @NotNull
    private final String buildingId;

    @NotNull
    private final String floorId;

    public FloorDataPreloaderId(@NotNull String buildingId, @NotNull String floorId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        this.buildingId = buildingId;
        this.floorId = floorId;
    }

    public static /* synthetic */ FloorDataPreloaderId copy$default(FloorDataPreloaderId floorDataPreloaderId, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = floorDataPreloaderId.buildingId;
        }
        if ((i & 2) != 0) {
            str2 = floorDataPreloaderId.floorId;
        }
        return floorDataPreloaderId.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    public final FloorDataPreloaderId copy(@NotNull String buildingId, @NotNull String floorId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        return new FloorDataPreloaderId(buildingId, floorId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorDataPreloaderId)) {
            return false;
        }
        FloorDataPreloaderId floorDataPreloaderId = (FloorDataPreloaderId) other;
        return Intrinsics.c(this.buildingId, floorDataPreloaderId.buildingId) && Intrinsics.c(this.floorId, floorDataPreloaderId.floorId);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    public int hashCode() {
        return this.floorId.hashCode() + (this.buildingId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FloorDataPreloaderId(buildingId=");
        sb.append(this.buildingId);
        sb.append(", floorId=");
        return me.oriient.internal.infra.rest.e.a(sb, this.floorId, ')');
    }
}
