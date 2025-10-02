package me.oriient.positioningengine.ondevice.debugging;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\nHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingBuilding;", "", "floors", "", "Lkotlin/Pair;", "", "", "buildingOrigin", "Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "rotationToENU", "", "(Ljava/util/List;Lme/oriient/internal/services/dataManager/common/WorldCoordinate;D)V", "getBuildingOrigin", "()Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "getFloors", "()Ljava/util/List;", "getRotationToENU", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PositioningDebuggingBuilding {

    @NotNull
    private final WorldCoordinate buildingOrigin;

    @NotNull
    private final List<Pair<Integer, String>> floors;
    private final double rotationToENU;

    public PositioningDebuggingBuilding(@NotNull List<Pair<Integer, String>> floors, @NotNull WorldCoordinate buildingOrigin, double d) {
        Intrinsics.h(floors, "floors");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        this.floors = floors;
        this.buildingOrigin = buildingOrigin;
        this.rotationToENU = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PositioningDebuggingBuilding copy$default(PositioningDebuggingBuilding positioningDebuggingBuilding, List list, WorldCoordinate worldCoordinate, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            list = positioningDebuggingBuilding.floors;
        }
        if ((i & 2) != 0) {
            worldCoordinate = positioningDebuggingBuilding.buildingOrigin;
        }
        if ((i & 4) != 0) {
            d = positioningDebuggingBuilding.rotationToENU;
        }
        return positioningDebuggingBuilding.copy(list, worldCoordinate, d);
    }

    @NotNull
    public final List<Pair<Integer, String>> component1() {
        return this.floors;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final WorldCoordinate getBuildingOrigin() {
        return this.buildingOrigin;
    }

    /* renamed from: component3, reason: from getter */
    public final double getRotationToENU() {
        return this.rotationToENU;
    }

    @NotNull
    public final PositioningDebuggingBuilding copy(@NotNull List<Pair<Integer, String>> floors, @NotNull WorldCoordinate buildingOrigin, double rotationToENU) {
        Intrinsics.h(floors, "floors");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        return new PositioningDebuggingBuilding(floors, buildingOrigin, rotationToENU);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositioningDebuggingBuilding)) {
            return false;
        }
        PositioningDebuggingBuilding positioningDebuggingBuilding = (PositioningDebuggingBuilding) other;
        return Intrinsics.c(this.floors, positioningDebuggingBuilding.floors) && Intrinsics.c(this.buildingOrigin, positioningDebuggingBuilding.buildingOrigin) && Double.compare(this.rotationToENU, positioningDebuggingBuilding.rotationToENU) == 0;
    }

    @NotNull
    public final WorldCoordinate getBuildingOrigin() {
        return this.buildingOrigin;
    }

    @NotNull
    public final List<Pair<Integer, String>> getFloors() {
        return this.floors;
    }

    public final double getRotationToENU() {
        return this.rotationToENU;
    }

    public int hashCode() {
        return Double.hashCode(this.rotationToENU) + ((this.buildingOrigin.hashCode() + (this.floors.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PositioningDebuggingBuilding(floors=");
        sb.append(this.floors);
        sb.append(", buildingOrigin=");
        sb.append(this.buildingOrigin);
        sb.append(", rotationToENU=");
        return me.oriient.positioningengine.common.a.a(sb, this.rotationToENU, ')');
    }
}
