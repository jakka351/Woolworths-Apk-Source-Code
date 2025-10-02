package me.oriient.navigation.common.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.navigation.common.DiKt;
import me.oriient.navigation.common.models.FloorTransitionType;
import me.oriient.navigation.common.models.TransitionCore;

/* loaded from: classes8.dex */
public final class i {
    public static Route a(RouteCore routeCore, List list, NavigationWaypoint navigationWaypoint, String str) {
        Object next;
        ArrayList arrayListO0;
        ArrayList arrayListO02;
        FloorTransitionType floorTransitionType;
        List waypoints = list;
        String buildingId = str;
        Intrinsics.h(routeCore, "routeCore");
        Intrinsics.h(waypoints, "waypoints");
        Intrinsics.h(buildingId, "buildingId");
        if (navigationWaypoint != null) {
            waypoints = CollectionsKt.d0(navigationWaypoint, waypoints);
        }
        List listX = waypoints;
        List<CoordinateInFloorCore> path = routeCore.getPath();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(path, 10));
        for (CoordinateInFloorCore coordinateInFloorCore : path) {
            NavigationCoordinateInBuilding.INSTANCE.getClass();
            Intrinsics.h(coordinateInFloorCore, "coordinateInFloorCore");
            arrayList.add(new NavigationCoordinateInBuilding(buildingId, coordinateInFloorCore.getFloorOrder(), new IndoorCoordinate(coordinateInFloorCore.getX(), coordinateInFloorCore.getY(), coordinateInFloorCore.getZ())));
        }
        List listU0 = CollectionsKt.u0(new e(), routeCore.getTransitions());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listU0.iterator();
        while (true) {
            FloorTransition floorTransition = null;
            if (!it.hasNext()) {
                Iterator it2 = listX.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.c(((NavigationWaypoint) next).getId(), NavigationWaypoint.USER_ID)) {
                        break;
                    }
                }
                NavigationWaypoint navigationWaypoint2 = (NavigationWaypoint) next;
                boolean z = navigationWaypoint2 != null;
                if (((Boolean) new g(z).invoke()).booleanValue()) {
                    listX = CollectionsKt.x(listX, 1);
                }
                List<Integer> waypointsOrder = routeCore.getWaypointsOrder();
                if (((Boolean) new h(z).invoke()).booleanValue()) {
                    waypointsOrder = CollectionsKt.x(waypointsOrder, 1);
                }
                List listU02 = CollectionsKt.u0(new f(), CollectionsKt.Q0(listX, waypointsOrder));
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(listU02, 10));
                Iterator it3 = listU02.iterator();
                while (it3.hasNext()) {
                    arrayList3.add((NavigationWaypoint) ((Pair) it3.next()).d);
                }
                List listT0 = CollectionsKt.t0(waypointsOrder);
                ArrayList arrayListJ0 = CollectionsKt.J0(arrayList);
                ArrayList arrayListJ02 = CollectionsKt.J0(arrayList2);
                ArrayList arrayListJ03 = CollectionsKt.J0(arrayList3);
                int size = arrayList.size();
                double[] dArr = new double[size];
                if (arrayList3.isEmpty()) {
                    arrayListO0 = new ArrayList();
                } else {
                    int size2 = listT0.size();
                    double[] dArrCopyOf = new double[size2];
                    if (!arrayList.isEmpty()) {
                        dArr[0] = 0.0d;
                        int size3 = arrayList.size();
                        for (int i = 1; i < size3; i++) {
                            int i2 = i - 1;
                            dArr[i] = ((NavigationCoordinateInBuilding) arrayList.get(i2)).getCoordinate().plainDistanceTo(((NavigationCoordinateInBuilding) arrayList.get(i)).getCoordinate()) + dArr[i2];
                        }
                    }
                    Iterator it4 = listT0.iterator();
                    int i3 = 0;
                    while (it4.hasNext()) {
                        int iIntValue = ((Number) it4.next()).intValue();
                        if (iIntValue < 0 || iIntValue >= size) {
                            Logger logger = (Logger) DiKt.a().get(Reflection.f24268a.b(Logger.class), null);
                            StringBuilder sbR = YU.a.r(iIntValue, "getDistancesFromStart: got way point index out of coordinate range. index: ", ", coordinate size: ");
                            sbR.append(arrayList.size());
                            logger.e("Route", sbR.toString());
                        } else {
                            dArrCopyOf[i3] = dArr[iIntValue];
                            i3++;
                        }
                    }
                    if (size2 != 0) {
                        dArrCopyOf = Arrays.copyOf(dArrCopyOf, size2);
                        Intrinsics.g(dArrCopyOf, "copyOf(...)");
                        if (dArrCopyOf.length > 1) {
                            Arrays.sort(dArrCopyOf);
                        }
                    }
                    arrayListO0 = ArraysKt.o0(dArrCopyOf);
                }
                ArrayList arrayList4 = arrayListO0;
                if (!arrayList2.isEmpty()) {
                    double[] dArr2 = new double[arrayList2.size()];
                    int i4 = 0;
                    NavigationCoordinateInBuilding navigationCoordinateInBuilding = (NavigationCoordinateInBuilding) arrayList.get(0);
                    int size4 = arrayList.size();
                    NavigationCoordinateInBuilding navigationCoordinateInBuilding2 = navigationCoordinateInBuilding;
                    double dPlainDistanceTo = 0.0d;
                    int i5 = 0;
                    while (true) {
                        if (i4 >= size4) {
                            arrayListO02 = ArraysKt.o0(dArr2);
                            break;
                        }
                        if (((FloorTransition) arrayList2.get(i5)).getIndexOnRoute() == i4) {
                            dArr2[i5] = dPlainDistanceTo;
                            i5++;
                            if (i5 >= arrayList2.size()) {
                                arrayListO02 = ArraysKt.o0(dArr2);
                                break;
                            }
                        }
                        dPlainDistanceTo += navigationCoordinateInBuilding2.getCoordinate().plainDistanceTo(((NavigationCoordinateInBuilding) arrayList.get(i4)).getCoordinate());
                        navigationCoordinateInBuilding2 = (NavigationCoordinateInBuilding) arrayList.get(i4);
                        i4++;
                    }
                } else {
                    arrayListO02 = new ArrayList();
                }
                return new Route(navigationWaypoint2, arrayListJ03, arrayListJ0, arrayListJ02, arrayList4, arrayListO02, CollectionsKt.J0(listT0));
            }
            TransitionCore response = (TransitionCore) it.next();
            FloorTransition.INSTANCE.getClass();
            Intrinsics.h(response, "response");
            FloorTransitionType.Companion companion = FloorTransitionType.INSTANCE;
            TransitionCore.a floorTransitionType2 = response.getType();
            companion.getClass();
            Intrinsics.h(floorTransitionType2, "floorTransitionType");
            int i6 = c.$EnumSwitchMapping$0[floorTransitionType2.ordinal()];
            if (i6 == 1) {
                floorTransitionType = FloorTransitionType.ESCALATOR;
            } else if (i6 == 2) {
                floorTransitionType = FloorTransitionType.ELEVATOR;
            } else if (i6 == 3) {
                floorTransitionType = FloorTransitionType.STAIRS;
            } else if (i6 == 4) {
                floorTransitionType = FloorTransitionType.RAMP;
            } else {
                if (i6 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                floorTransitionType = FloorTransitionType.UNKNOWN;
            }
            if (arrayList.size() >= response.getIndex()) {
                NavigationCoordinateInBuilding navigationCoordinateInBuilding3 = (NavigationCoordinateInBuilding) arrayList.get(response.getIndex());
                floorTransition = new FloorTransition(response.getUuid(), floorTransitionType, buildingId, navigationCoordinateInBuilding3.getFloorOrder(), response.getIndex(), ((NavigationCoordinateInBuilding) arrayList.get(response.getIndex() + 1)).getFloorOrder(), navigationCoordinateInBuilding3.getCoordinate());
            }
            if (floorTransition != null) {
                arrayList2.add(floorTransition);
            }
            buildingId = str;
        }
    }
}
