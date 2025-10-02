package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public interface IPSRoute {
    double getDistanceFromStart(@NonNull String str);

    double getDistanceFromStart(@NonNull IPSRouteFloorTransition iPSRouteFloorTransition);

    double getDistanceFromStart(@NonNull IPSWaypoint iPSWaypoint);

    @NonNull
    List<? extends IPSRouteFloorTransition> getFloorTransitions();

    int getIndexOnRoute(@NonNull String str);

    int getIndexOnRoute(@NonNull IPSWaypoint iPSWaypoint);

    @NonNull
    List<? extends IPSCoordinateInBuilding> getRouteCoordinates();

    @NonNull
    List<? extends IPSWaypoint> getWaypoints();

    boolean isFloorTransitionOnRoute(@NonNull IPSRouteFloorTransition iPSRouteFloorTransition);

    boolean isWaypointOnRoute(@NonNull String str);

    boolean isWaypointOnRoute(@NonNull IPSWaypoint iPSWaypoint);
}
