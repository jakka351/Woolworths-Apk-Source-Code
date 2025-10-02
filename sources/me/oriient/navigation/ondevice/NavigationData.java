package me.oriient.navigation.ondevice;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.floorTransitions.FloorTransitions;
import me.oriient.navigation.ondevice.navgraph.NavGraphRecord;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001f"}, d2 = {"Lme/oriient/navigation/ondevice/NavigationData;", "", "building", "Lme/oriient/internal/services/dataManager/building/Building;", "floorTransitions", "Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions;", "navGraphsRecords", "", "Lme/oriient/navigation/ondevice/navgraph/NavGraphRecord;", "obstaclesRecords", "Lme/oriient/navigation/ondevice/ObstaclesNavigationRecord;", "(Lme/oriient/internal/services/dataManager/building/Building;Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions;Ljava/util/List;Ljava/util/List;)V", "getBuilding", "()Lme/oriient/internal/services/dataManager/building/Building;", "getFloorTransitions", "()Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions;", "getNavGraphsRecords", "()Ljava/util/List;", "getObstaclesRecords", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NavigationData {

    @NotNull
    private final Building building;

    @NotNull
    private final FloorTransitions floorTransitions;

    @NotNull
    private final List<NavGraphRecord> navGraphsRecords;

    @NotNull
    private final List<ObstaclesNavigationRecord> obstaclesRecords;

    public NavigationData(@NotNull Building building, @NotNull FloorTransitions floorTransitions, @NotNull List<NavGraphRecord> navGraphsRecords, @NotNull List<ObstaclesNavigationRecord> obstaclesRecords) {
        Intrinsics.h(building, "building");
        Intrinsics.h(floorTransitions, "floorTransitions");
        Intrinsics.h(navGraphsRecords, "navGraphsRecords");
        Intrinsics.h(obstaclesRecords, "obstaclesRecords");
        this.building = building;
        this.floorTransitions = floorTransitions;
        this.navGraphsRecords = navGraphsRecords;
        this.obstaclesRecords = obstaclesRecords;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigationData copy$default(NavigationData navigationData, Building building, FloorTransitions floorTransitions, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            building = navigationData.building;
        }
        if ((i & 2) != 0) {
            floorTransitions = navigationData.floorTransitions;
        }
        if ((i & 4) != 0) {
            list = navigationData.navGraphsRecords;
        }
        if ((i & 8) != 0) {
            list2 = navigationData.obstaclesRecords;
        }
        return navigationData.copy(building, floorTransitions, list, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Building getBuilding() {
        return this.building;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FloorTransitions getFloorTransitions() {
        return this.floorTransitions;
    }

    @NotNull
    public final List<NavGraphRecord> component3() {
        return this.navGraphsRecords;
    }

    @NotNull
    public final List<ObstaclesNavigationRecord> component4() {
        return this.obstaclesRecords;
    }

    @NotNull
    public final NavigationData copy(@NotNull Building building, @NotNull FloorTransitions floorTransitions, @NotNull List<NavGraphRecord> navGraphsRecords, @NotNull List<ObstaclesNavigationRecord> obstaclesRecords) {
        Intrinsics.h(building, "building");
        Intrinsics.h(floorTransitions, "floorTransitions");
        Intrinsics.h(navGraphsRecords, "navGraphsRecords");
        Intrinsics.h(obstaclesRecords, "obstaclesRecords");
        return new NavigationData(building, floorTransitions, navGraphsRecords, obstaclesRecords);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationData)) {
            return false;
        }
        NavigationData navigationData = (NavigationData) other;
        return Intrinsics.c(this.building, navigationData.building) && Intrinsics.c(this.floorTransitions, navigationData.floorTransitions) && Intrinsics.c(this.navGraphsRecords, navigationData.navGraphsRecords) && Intrinsics.c(this.obstaclesRecords, navigationData.obstaclesRecords);
    }

    @NotNull
    public final Building getBuilding() {
        return this.building;
    }

    @NotNull
    public final FloorTransitions getFloorTransitions() {
        return this.floorTransitions;
    }

    @NotNull
    public final List<NavGraphRecord> getNavGraphsRecords() {
        return this.navGraphsRecords;
    }

    @NotNull
    public final List<ObstaclesNavigationRecord> getObstaclesRecords() {
        return this.obstaclesRecords;
    }

    public int hashCode() {
        return this.obstaclesRecords.hashCode() + androidx.camera.core.impl.b.d((this.floorTransitions.hashCode() + (this.building.hashCode() * 31)) * 31, 31, this.navGraphsRecords);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavigationData(building=");
        sb.append(this.building);
        sb.append(", floorTransitions=");
        sb.append(this.floorTransitions);
        sb.append(", navGraphsRecords=");
        sb.append(this.navGraphsRecords);
        sb.append(", obstaclesRecords=");
        return androidx.compose.ui.input.pointer.a.o(sb, this.obstaclesRecords, ')');
    }
}
