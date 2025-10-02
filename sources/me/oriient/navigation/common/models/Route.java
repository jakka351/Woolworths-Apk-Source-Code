package me.oriient.navigation.common.models;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0017\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0001NBg\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0004HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0004HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0004HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0004HÂ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\rH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010&\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0006H\u0000¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020\u0000¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J|\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010*R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00107R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00107R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00107R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00107R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\u0006088\u0006¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010\u0012R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\b088\u0006¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u0010\u0012R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0006088\u0006¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b>\u0010\u0012R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\b088\u0006¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u0010\u0012R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0006088F¢\u0006\u0006\u001a\u0004\bA\u0010\u0012R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\b088F¢\u0006\u0006\u001a\u0004\bC\u0010\u0012R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u0002088F¢\u0006\u0006\u001a\u0004\bE\u0010\u0012R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\n088F¢\u0006\u0006\u001a\u0004\bG\u0010\u0012R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\n088F¢\u0006\u0006\u001a\u0004\bI\u0010\u0012R\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\r088F¢\u0006\u0006\u001a\u0004\bK\u0010\u0012¨\u0006O"}, d2 = {"Lme/oriient/navigation/common/models/Route;", "", "Lme/oriient/navigation/common/models/NavigationWaypoint;", "userWaypoint", "", "_waypoints", "Lme/oriient/navigation/common/models/NavigationCoordinateInBuilding;", "_routeCoordinates", "Lme/oriient/navigation/common/models/FloorTransition;", "_floorTransitions", "", "_distancesFromStartToWaypoints", "_distancesFromStartToFloorTransitions", "", "_waypointsOrder", "<init>", "(Lme/oriient/navigation/common/models/NavigationWaypoint;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "", "waypointId", "getIndexOnRoute", "(Ljava/lang/String;)I", "", "removeFirstWaypoint", "()V", "count", "removeTail$service_navigation_publishRelease", "(I)V", "removeTail", "point", "addPointToBeginning$service_navigation_publishRelease", "(Lme/oriient/navigation/common/models/NavigationCoordinateInBuilding;)V", "addPointToBeginning", "deepCopy", "()Lme/oriient/navigation/common/models/Route;", "component1", "()Lme/oriient/navigation/common/models/NavigationWaypoint;", "copy", "(Lme/oriient/navigation/common/models/NavigationWaypoint;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lme/oriient/navigation/common/models/Route;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lme/oriient/navigation/common/models/NavigationWaypoint;", "getUserWaypoint", "Ljava/util/List;", "", "coordinatesToFirstWaypoint", "getCoordinatesToFirstWaypoint", "floorTransitionsToFirstWaypoint", "getFloorTransitionsToFirstWaypoint", "coordinatesFromFirstWaypoint", "getCoordinatesFromFirstWaypoint", "floorTransitionsFromFirstWaypoint", "getFloorTransitionsFromFirstWaypoint", "getRouteCoordinates", "routeCoordinates", "getFloorTransitions", "floorTransitions", "getWaypoints", "waypoints", "getDistancesFromStartToWaypoints", "distancesFromStartToWaypoints", "getDistancesFromStartToFloorTransitions", "distancesFromStartToFloorTransitions", "getWaypointsOrder", "waypointsOrder", "Companion", "me/oriient/navigation/common/models/i", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class Route {

    @NotNull
    public static final i Companion = new i();

    @NotNull
    private static final String TAG = "Route";

    @NotNull
    private final List<Double> _distancesFromStartToFloorTransitions;

    @NotNull
    private final List<Double> _distancesFromStartToWaypoints;

    @NotNull
    private List<FloorTransition> _floorTransitions;

    @NotNull
    private final List<NavigationCoordinateInBuilding> _routeCoordinates;

    @NotNull
    private List<NavigationWaypoint> _waypoints;

    @NotNull
    private final List<Integer> _waypointsOrder;

    @NotNull
    private final List<NavigationCoordinateInBuilding> coordinatesFromFirstWaypoint;

    @NotNull
    private final List<NavigationCoordinateInBuilding> coordinatesToFirstWaypoint;

    @NotNull
    private final List<FloorTransition> floorTransitionsFromFirstWaypoint;

    @NotNull
    private final List<FloorTransition> floorTransitionsToFirstWaypoint;

    @Nullable
    private final NavigationWaypoint userWaypoint;

    public Route(@Nullable NavigationWaypoint navigationWaypoint, @NotNull List<NavigationWaypoint> _waypoints, @NotNull List<NavigationCoordinateInBuilding> _routeCoordinates, @NotNull List<FloorTransition> _floorTransitions, @NotNull List<Double> _distancesFromStartToWaypoints, @NotNull List<Double> _distancesFromStartToFloorTransitions, @NotNull List<Integer> _waypointsOrder) {
        Intrinsics.h(_waypoints, "_waypoints");
        Intrinsics.h(_routeCoordinates, "_routeCoordinates");
        Intrinsics.h(_floorTransitions, "_floorTransitions");
        Intrinsics.h(_distancesFromStartToWaypoints, "_distancesFromStartToWaypoints");
        Intrinsics.h(_distancesFromStartToFloorTransitions, "_distancesFromStartToFloorTransitions");
        Intrinsics.h(_waypointsOrder, "_waypointsOrder");
        this.userWaypoint = navigationWaypoint;
        this._waypoints = _waypoints;
        this._routeCoordinates = _routeCoordinates;
        this._floorTransitions = _floorTransitions;
        this._distancesFromStartToWaypoints = _distancesFromStartToWaypoints;
        this._distancesFromStartToFloorTransitions = _distancesFromStartToFloorTransitions;
        this._waypointsOrder = _waypointsOrder;
        if (getWaypoints().isEmpty()) {
            EmptyList emptyList = EmptyList.d;
            this.coordinatesToFirstWaypoint = emptyList;
            this.coordinatesFromFirstWaypoint = emptyList;
            this.floorTransitionsToFirstWaypoint = emptyList;
            this.floorTransitionsFromFirstWaypoint = emptyList;
            return;
        }
        int indexOnRoute = getIndexOnRoute(getWaypoints().get(0).getId());
        if (indexOnRoute == 0 && getWaypoints().size() > 1) {
            indexOnRoute = getIndexOnRoute(getWaypoints().get(1).getId());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (FloorTransition floorTransition : getFloorTransitions()) {
            if (floorTransition.getIndexOnRoute() < indexOnRoute) {
                arrayList.add(floorTransition);
            } else {
                arrayList2.add(floorTransition);
            }
        }
        this.coordinatesToFirstWaypoint = getRouteCoordinates().subList(0, indexOnRoute + 1);
        this.coordinatesFromFirstWaypoint = getRouteCoordinates().subList(indexOnRoute, getRouteCoordinates().size());
        this.floorTransitionsToFirstWaypoint = arrayList;
        this.floorTransitionsFromFirstWaypoint = arrayList2;
    }

    private final List<NavigationWaypoint> component2() {
        return this._waypoints;
    }

    private final List<NavigationCoordinateInBuilding> component3() {
        return this._routeCoordinates;
    }

    private final List<FloorTransition> component4() {
        return this._floorTransitions;
    }

    private final List<Double> component5() {
        return this._distancesFromStartToWaypoints;
    }

    private final List<Double> component6() {
        return this._distancesFromStartToFloorTransitions;
    }

    private final List<Integer> component7() {
        return this._waypointsOrder;
    }

    public static /* synthetic */ Route copy$default(Route route, NavigationWaypoint navigationWaypoint, List list, List list2, List list3, List list4, List list5, List list6, int i, Object obj) {
        if ((i & 1) != 0) {
            navigationWaypoint = route.userWaypoint;
        }
        if ((i & 2) != 0) {
            list = route._waypoints;
        }
        if ((i & 4) != 0) {
            list2 = route._routeCoordinates;
        }
        if ((i & 8) != 0) {
            list3 = route._floorTransitions;
        }
        if ((i & 16) != 0) {
            list4 = route._distancesFromStartToWaypoints;
        }
        if ((i & 32) != 0) {
            list5 = route._distancesFromStartToFloorTransitions;
        }
        if ((i & 64) != 0) {
            list6 = route._waypointsOrder;
        }
        List list7 = list5;
        List list8 = list6;
        List list9 = list4;
        List list10 = list2;
        return route.copy(navigationWaypoint, list, list10, list3, list9, list7, list8);
    }

    public final void addPointToBeginning$service_navigation_publishRelease(@NotNull NavigationCoordinateInBuilding point) {
        Intrinsics.h(point, "point");
        double dPlainDistanceTo = getRouteCoordinates().isEmpty() ? 0.0d : ((NavigationCoordinateInBuilding) CollectionsKt.D(getRouteCoordinates())).getCoordinate().plainDistanceTo(point.getCoordinate());
        this._routeCoordinates.add(0, point);
        List<FloorTransition> floorTransitions = getFloorTransitions();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(floorTransitions, 10));
        for (FloorTransition floorTransition : floorTransitions) {
            arrayList.add(FloorTransition.copy$default(floorTransition, null, null, null, 0, floorTransition.getIndexOnRoute() + 1, 0, null, 111, null));
        }
        this._floorTransitions = CollectionsKt.J0(arrayList);
        int size = this._distancesFromStartToWaypoints.size();
        for (int i = 0; i < size; i++) {
            List<Double> list = this._distancesFromStartToWaypoints;
            list.set(i, Double.valueOf(list.get(i).doubleValue() + dPlainDistanceTo));
        }
        int size2 = this._distancesFromStartToFloorTransitions.size();
        for (int i2 = 0; i2 < size2; i2++) {
            List<Double> list2 = this._distancesFromStartToFloorTransitions;
            list2.set(i2, Double.valueOf(list2.get(i2).doubleValue() + dPlainDistanceTo));
        }
        int size3 = this._waypointsOrder.size();
        for (int i3 = 0; i3 < size3; i3++) {
            List<Integer> list3 = this._waypointsOrder;
            list3.set(i3, Integer.valueOf(list3.get(i3).intValue() + 1));
        }
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final NavigationWaypoint getUserWaypoint() {
        return this.userWaypoint;
    }

    @NotNull
    public final Route copy(@Nullable NavigationWaypoint userWaypoint, @NotNull List<NavigationWaypoint> _waypoints, @NotNull List<NavigationCoordinateInBuilding> _routeCoordinates, @NotNull List<FloorTransition> _floorTransitions, @NotNull List<Double> _distancesFromStartToWaypoints, @NotNull List<Double> _distancesFromStartToFloorTransitions, @NotNull List<Integer> _waypointsOrder) {
        Intrinsics.h(_waypoints, "_waypoints");
        Intrinsics.h(_routeCoordinates, "_routeCoordinates");
        Intrinsics.h(_floorTransitions, "_floorTransitions");
        Intrinsics.h(_distancesFromStartToWaypoints, "_distancesFromStartToWaypoints");
        Intrinsics.h(_distancesFromStartToFloorTransitions, "_distancesFromStartToFloorTransitions");
        Intrinsics.h(_waypointsOrder, "_waypointsOrder");
        return new Route(userWaypoint, _waypoints, _routeCoordinates, _floorTransitions, _distancesFromStartToWaypoints, _distancesFromStartToFloorTransitions, _waypointsOrder);
    }

    @NotNull
    public final Route deepCopy() {
        return new Route(this.userWaypoint, CollectionsKt.J0(this._waypoints), CollectionsKt.J0(this._routeCoordinates), CollectionsKt.J0(this._floorTransitions), CollectionsKt.J0(this._distancesFromStartToWaypoints), CollectionsKt.J0(this._distancesFromStartToFloorTransitions), CollectionsKt.J0(this._waypointsOrder));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Route)) {
            return false;
        }
        Route route = (Route) other;
        return Intrinsics.c(this.userWaypoint, route.userWaypoint) && Intrinsics.c(this._waypoints, route._waypoints) && Intrinsics.c(this._routeCoordinates, route._routeCoordinates) && Intrinsics.c(this._floorTransitions, route._floorTransitions) && Intrinsics.c(this._distancesFromStartToWaypoints, route._distancesFromStartToWaypoints) && Intrinsics.c(this._distancesFromStartToFloorTransitions, route._distancesFromStartToFloorTransitions) && Intrinsics.c(this._waypointsOrder, route._waypointsOrder);
    }

    @NotNull
    public final List<NavigationCoordinateInBuilding> getCoordinatesFromFirstWaypoint() {
        return this.coordinatesFromFirstWaypoint;
    }

    @NotNull
    public final List<NavigationCoordinateInBuilding> getCoordinatesToFirstWaypoint() {
        return this.coordinatesToFirstWaypoint;
    }

    @NotNull
    public final List<Double> getDistancesFromStartToFloorTransitions() {
        return this._distancesFromStartToFloorTransitions;
    }

    @NotNull
    public final List<Double> getDistancesFromStartToWaypoints() {
        return this._distancesFromStartToWaypoints;
    }

    @NotNull
    public final List<FloorTransition> getFloorTransitions() {
        return this._floorTransitions;
    }

    @NotNull
    public final List<FloorTransition> getFloorTransitionsFromFirstWaypoint() {
        return this.floorTransitionsFromFirstWaypoint;
    }

    @NotNull
    public final List<FloorTransition> getFloorTransitionsToFirstWaypoint() {
        return this.floorTransitionsToFirstWaypoint;
    }

    public final int getIndexOnRoute(@NotNull String waypointId) {
        Intrinsics.h(waypointId, "waypointId");
        Iterator<NavigationWaypoint> it = getWaypoints().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.c(it.next().getId(), waypointId)) {
                break;
            }
            i++;
        }
        if (i < 0 || i >= this._waypointsOrder.size()) {
            return -1;
        }
        return this._waypointsOrder.get(i).intValue();
    }

    @NotNull
    public final List<NavigationCoordinateInBuilding> getRouteCoordinates() {
        return this._routeCoordinates;
    }

    @Nullable
    public final NavigationWaypoint getUserWaypoint() {
        return this.userWaypoint;
    }

    @NotNull
    public final List<NavigationWaypoint> getWaypoints() {
        return this._waypoints;
    }

    @NotNull
    public final List<Integer> getWaypointsOrder() {
        return this._waypointsOrder;
    }

    public int hashCode() {
        NavigationWaypoint navigationWaypoint = this.userWaypoint;
        return this._waypointsOrder.hashCode() + androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d((navigationWaypoint == null ? 0 : navigationWaypoint.hashCode()) * 31, 31, this._waypoints), 31, this._routeCoordinates), 31, this._floorTransitions), 31, this._distancesFromStartToWaypoints), 31, this._distancesFromStartToFloorTransitions);
    }

    public final void removeFirstWaypoint() {
        if (getWaypoints().isEmpty()) {
            return;
        }
        removeTail$service_navigation_publishRelease(getIndexOnRoute(getWaypoints().get(0).getId()));
        CollectionsKt.h0(this._waypointsOrder);
        CollectionsKt.h0(this._distancesFromStartToWaypoints);
        CollectionsKt.h0(this._waypoints);
    }

    public final void removeTail$service_navigation_publishRelease(int count) {
        if (getRouteCoordinates().isEmpty()) {
            return;
        }
        Iterator<NavigationCoordinateInBuilding> it = getRouteCoordinates().iterator();
        int iMin = Math.min(count, getRouteCoordinates().size() - 1);
        NavigationCoordinateInBuilding next = it.next();
        int i = iMin;
        double dPlainDistanceTo = 0.0d;
        while (it.hasNext() && i > 0) {
            NavigationCoordinateInBuilding next2 = it.next();
            dPlainDistanceTo += next2.getCoordinate().plainDistanceTo(next.getCoordinate());
            i--;
            next = next2;
        }
        for (int i2 = 0; i2 < iMin; i2++) {
            CollectionsKt.h0(this._routeCoordinates);
        }
        List<FloorTransition> floorTransitions = getFloorTransitions();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(floorTransitions, 10));
        for (FloorTransition floorTransition : floorTransitions) {
            arrayList.add(FloorTransition.copy$default(floorTransition, null, null, null, 0, floorTransition.getIndexOnRoute() - iMin, 0, null, 111, null));
        }
        this._floorTransitions = CollectionsKt.J0(arrayList);
        int size = this._distancesFromStartToWaypoints.size();
        for (int i3 = 0; i3 < size; i3++) {
            List<Double> list = this._distancesFromStartToWaypoints;
            list.set(i3, Double.valueOf(Math.max(list.get(i3).doubleValue() - dPlainDistanceTo, 0.0d)));
        }
        int size2 = this._distancesFromStartToFloorTransitions.size();
        for (int i4 = 0; i4 < size2; i4++) {
            List<Double> list2 = this._distancesFromStartToFloorTransitions;
            list2.set(i4, Double.valueOf(Math.max(list2.get(i4).doubleValue() - dPlainDistanceTo, 0.0d)));
        }
        int size3 = this._waypointsOrder.size();
        for (int i5 = 0; i5 < size3; i5++) {
            List<Integer> list3 = this._waypointsOrder;
            list3.set(i5, Integer.valueOf(list3.get(i5).intValue() - iMin));
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Route(userWaypoint=");
        sb.append(this.userWaypoint);
        sb.append(", _waypoints=");
        sb.append(this._waypoints);
        sb.append(", _routeCoordinates=");
        sb.append(this._routeCoordinates);
        sb.append(", _floorTransitions=");
        sb.append(this._floorTransitions);
        sb.append(", _distancesFromStartToWaypoints=");
        sb.append(this._distancesFromStartToWaypoints);
        sb.append(", _distancesFromStartToFloorTransitions=");
        sb.append(this._distancesFromStartToFloorTransitions);
        sb.append(", _waypointsOrder=");
        return androidx.compose.ui.input.pointer.a.o(sb, this._waypointsOrder, ')');
    }
}
