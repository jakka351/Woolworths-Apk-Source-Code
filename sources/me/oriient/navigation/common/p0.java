package me.oriient.navigation.common;

import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataModel.navigation.NavigationConfig;
import me.oriient.navigation.common.models.NavigationCoordinateInBuilding;
import me.oriient.navigation.common.models.NavigationPosition;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.common.models.Route;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class p0 implements n0 {

    @NotNull
    private static final o0 Companion = new o0();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26261a = DiKt.a().inject(Reflection.f24268a.b(Logger.class));

    public final AbstractC1765f a(NavigationConfig config, Route route, NavigationPosition navigationPosition) {
        double d;
        Route routeToCorrect = route;
        Intrinsics.h(config, "config");
        Intrinsics.h(routeToCorrect, "routeToCorrect");
        NavigationPosition newPosition = navigationPosition;
        Intrinsics.h(newPosition, "newPosition");
        double acceptableDistanceToRouteSegmentMeters = config.getAcceptableDistanceToRouteSegmentMeters();
        double routeSegmentLengthMeters = config.getRouteSegmentLengthMeters();
        double distanceShrinkingRation = config.getDistanceShrinkingRation();
        if (routeToCorrect.getRouteCoordinates().size() < 2) {
            return C1760a.f26230a;
        }
        NavigationWaypoint navigationWaypoint = (NavigationWaypoint) CollectionsKt.F(routeToCorrect.getWaypoints());
        int indexOnRoute = navigationWaypoint != null ? routeToCorrect.getIndexOnRoute(navigationWaypoint.getId()) : -1;
        if (indexOnRoute == 0) {
            return C1762c.f26234a;
        }
        int size = routeToCorrect.getRouteCoordinates().size();
        double d2 = Double.MAX_VALUE;
        Integer numValueOf = null;
        int i = 1;
        boolean z = false;
        while (i < size && i <= indexOnRoute) {
            NavigationCoordinateInBuilding navigationCoordinateInBuilding = routeToCorrect.getRouteCoordinates().get(i - 1);
            if (navigationCoordinateInBuilding.getFloorOrder() == newPosition.getFloorOrder()) {
                NavigationCoordinateInBuilding navigationCoordinateInBuilding2 = route.getRouteCoordinates().get(i);
                double dPlainDistanceTo = navigationCoordinateInBuilding.getCoordinate().plainDistanceTo(navigationCoordinateInBuilding2.getCoordinate());
                NavigationCoordinateInBuilding navigationCoordinateInBuilding3 = navigationCoordinateInBuilding;
                while (true) {
                    if (dPlainDistanceTo <= 0.0d) {
                        d = distanceShrinkingRation;
                        break;
                    }
                    d = distanceShrinkingRation;
                    double d3 = acceptableDistanceToRouteSegmentMeters;
                    NavigationCoordinateInBuilding navigationCoordinateInBuilding4 = new NavigationCoordinateInBuilding(navigationCoordinateInBuilding.getBuildingId(), navigationCoordinateInBuilding.getFloorOrder(), IndoorCoordinate.INSTANCE.getPointOnInterval(navigationCoordinateInBuilding.getCoordinate(), navigationCoordinateInBuilding2.getCoordinate(), routeSegmentLengthMeters));
                    double dDistanceToInterval = navigationPosition.getCoordinate().distanceToInterval(navigationCoordinateInBuilding3.getCoordinate(), navigationCoordinateInBuilding4.getCoordinate());
                    boolean z2 = dDistanceToInterval < d3;
                    if (dDistanceToInterval < d2) {
                        d2 = dDistanceToInterval;
                        numValueOf = Integer.valueOf(i);
                    }
                    if (z2) {
                        z = true;
                    } else if (z) {
                        acceptableDistanceToRouteSegmentMeters = d3;
                        break;
                    }
                    acceptableDistanceToRouteSegmentMeters = d3 - (routeSegmentLengthMeters * d);
                    dPlainDistanceTo -= routeSegmentLengthMeters;
                    navigationCoordinateInBuilding3 = navigationCoordinateInBuilding4;
                    distanceShrinkingRation = d;
                }
            } else {
                d = distanceShrinkingRation;
            }
            i++;
            routeToCorrect = route;
            newPosition = navigationPosition;
            distanceShrinkingRation = d;
        }
        if (numValueOf == null) {
            ((Logger) this.f26261a.getD()).d("RouteCorrector", "result is reached waypoint");
            return C1762c.f26234a;
        }
        if (!z) {
            ((Logger) this.f26261a.getD()).d("RouteCorrector", "result is out of range");
            return C1761b.f26232a;
        }
        NavigationCoordinateInBuilding navigationCoordinateInBuilding5 = route.getRouteCoordinates().get(numValueOf.intValue() - 1);
        NavigationCoordinateInBuilding navigationCoordinateInBuilding6 = route.getRouteCoordinates().get(numValueOf.intValue());
        IndoorCoordinate.Companion companion = IndoorCoordinate.INSTANCE;
        double dAbs = Math.abs(companion.angleBetweenVectors(navigationCoordinateInBuilding5.getCoordinate(), navigationCoordinateInBuilding6.getCoordinate(), navigationCoordinateInBuilding5.getCoordinate(), navigationPosition.getCoordinate()));
        boolean z3 = dAbs > 1.5707963267948966d && dAbs < 4.71238898038469d;
        Route routeDeepCopy = route.deepCopy();
        if (numValueOf.intValue() > 1) {
            routeDeepCopy.removeTail$service_navigation_publishRelease(numValueOf.intValue() - 1);
        }
        if (!z3) {
            double dAbs2 = Math.abs(companion.angleBetweenVectors(navigationCoordinateInBuilding6.getCoordinate(), navigationCoordinateInBuilding5.getCoordinate(), navigationCoordinateInBuilding6.getCoordinate(), navigationPosition.getCoordinate()));
            if (dAbs2 <= 1.5707963267948966d || dAbs2 >= 4.71238898038469d) {
                NavigationCoordinateInBuilding navigationCoordinateInBuilding7 = new NavigationCoordinateInBuilding(navigationCoordinateInBuilding5.getBuildingId(), navigationCoordinateInBuilding5.getFloorOrder(), companion.getPointOnInterval(navigationCoordinateInBuilding5.getCoordinate(), navigationCoordinateInBuilding6.getCoordinate(), Math.cos(dAbs) * navigationCoordinateInBuilding5.getCoordinate().plainDistanceTo(navigationPosition.getCoordinate())));
                routeDeepCopy.removeTail$service_navigation_publishRelease(1);
                routeDeepCopy.addPointToBeginning$service_navigation_publishRelease(navigationCoordinateInBuilding7);
            } else {
                routeDeepCopy.removeTail$service_navigation_publishRelease(1);
                if (numValueOf.intValue() > 1) {
                    routeDeepCopy.addPointToBeginning$service_navigation_publishRelease(navigationCoordinateInBuilding6);
                }
            }
        }
        return z3 ? new C1764e(routeDeepCopy) : new C1763d(routeDeepCopy);
    }
}
