package me.oriient.navigation.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.navigation.common.models.NavigationBuilding;
import me.oriient.navigation.common.models.NavigationFloor;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class v0 implements u0 {
    public static Outcome a(NavigationWaypoint navigationWaypoint, String str, NavigationBuilding navigationBuilding) {
        String id;
        if (navigationWaypoint.getId().length() == 0) {
            return new Outcome.Failure(new NavigationError.InvalidInputError("Waypoint must contain an ID."));
        }
        if (Double.isNaN(navigationWaypoint.getCoordinate().getX()) || Double.isNaN(navigationWaypoint.getCoordinate().getY())) {
            return new Outcome.Failure(new NavigationError.InvalidInputError("Waypoint's coordinates must be real numbers. Waypoint id: " + navigationWaypoint.getId()));
        }
        if (Double.isInfinite(navigationWaypoint.getCoordinate().getX()) || Double.isInfinite(navigationWaypoint.getCoordinate().getY())) {
            return new Outcome.Failure(new NavigationError.InvalidInputError("Waypoint's coordinates must be inside the map's bounds. Waypoint id: " + navigationWaypoint.getId()));
        }
        if (navigationBuilding != null && (id = navigationBuilding.getId()) != null) {
            str = id;
        }
        if (str != null && !Intrinsics.c(navigationWaypoint.getBuildingId(), str)) {
            return new Outcome.Failure(new NavigationError.InvalidInputError("Waypoint's building id should match the building. Waypoint id: " + navigationWaypoint.getId()));
        }
        if (navigationBuilding != null) {
            List<NavigationFloor> floors = navigationBuilding.getFloors();
            if (!(floors instanceof Collection) || !floors.isEmpty()) {
                Iterator<T> it = floors.iterator();
                while (it.hasNext()) {
                    if (((NavigationFloor) it.next()).getOrder() == navigationWaypoint.getFloorOrder()) {
                    }
                }
            }
            return new Outcome.Failure(new NavigationError.InvalidInputError("Waypoint's floor order should match one of the floors inside the building. Waypoint id: " + navigationWaypoint.getId()));
        }
        return new Outcome.Success(Unit.f24250a);
    }

    public final Outcome a(List waypoints, String str, NavigationBuilding navigationBuilding) {
        Intrinsics.h(waypoints, "waypoints");
        Iterator it = waypoints.iterator();
        while (it.hasNext()) {
            Outcome outcomeA = a((NavigationWaypoint) it.next(), str, navigationBuilding);
            if (outcomeA instanceof Outcome.Failure) {
                return new Outcome.Failure((NavigationError) ((Outcome.Failure) outcomeA).getValue());
            }
        }
        return new Outcome.Success(waypoints);
    }
}
