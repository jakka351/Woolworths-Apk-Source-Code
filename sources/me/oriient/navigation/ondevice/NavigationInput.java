package me.oriient.navigation.ondevice;

import androidx.annotation.Keep;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.navigation.common.models.NavigationWaypoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0013\u001a\u00020\bHÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lme/oriient/navigation/ondevice/NavigationInput;", "", "buildingId", "", "waypoints", "", "Lme/oriient/navigation/common/models/NavigationWaypoint;", "finalWaypointIndex", "", "(Ljava/lang/String;[Lme/oriient/navigation/common/models/NavigationWaypoint;I)V", "getBuildingId", "()Ljava/lang/String;", "getFinalWaypointIndex", "()I", "getWaypoints", "()[Lme/oriient/navigation/common/models/NavigationWaypoint;", "[Lme/oriient/navigation/common/models/NavigationWaypoint;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;[Lme/oriient/navigation/common/models/NavigationWaypoint;I)Lme/oriient/navigation/ondevice/NavigationInput;", "equals", "", "other", "hashCode", "toString", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NavigationInput {

    @NotNull
    private final String buildingId;
    private final int finalWaypointIndex;

    @NotNull
    private final NavigationWaypoint[] waypoints;

    public NavigationInput(@NotNull String buildingId, @NotNull NavigationWaypoint[] waypoints, int i) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(waypoints, "waypoints");
        this.buildingId = buildingId;
        this.waypoints = waypoints;
        this.finalWaypointIndex = i;
    }

    public static /* synthetic */ NavigationInput copy$default(NavigationInput navigationInput, String str, NavigationWaypoint[] navigationWaypointArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = navigationInput.buildingId;
        }
        if ((i2 & 2) != 0) {
            navigationWaypointArr = navigationInput.waypoints;
        }
        if ((i2 & 4) != 0) {
            i = navigationInput.finalWaypointIndex;
        }
        return navigationInput.copy(str, navigationWaypointArr, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final NavigationWaypoint[] getWaypoints() {
        return this.waypoints;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFinalWaypointIndex() {
        return this.finalWaypointIndex;
    }

    @NotNull
    public final NavigationInput copy(@NotNull String buildingId, @NotNull NavigationWaypoint[] waypoints, int finalWaypointIndex) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(waypoints, "waypoints");
        return new NavigationInput(buildingId, waypoints, finalWaypointIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationInput)) {
            return false;
        }
        NavigationInput navigationInput = (NavigationInput) other;
        return Intrinsics.c(this.buildingId, navigationInput.buildingId) && Intrinsics.c(this.waypoints, navigationInput.waypoints) && this.finalWaypointIndex == navigationInput.finalWaypointIndex;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    public final int getFinalWaypointIndex() {
        return this.finalWaypointIndex;
    }

    @NotNull
    public final NavigationWaypoint[] getWaypoints() {
        return this.waypoints;
    }

    public int hashCode() {
        return Integer.hashCode(this.finalWaypointIndex) + ((Arrays.hashCode(this.waypoints) + (this.buildingId.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavigationInput(buildingId=");
        sb.append(this.buildingId);
        sb.append(", waypoints=");
        sb.append(Arrays.toString(this.waypoints));
        sb.append(", finalWaypointIndex=");
        return YU.a.l(sb, this.finalWaypointIndex, ')');
    }
}
