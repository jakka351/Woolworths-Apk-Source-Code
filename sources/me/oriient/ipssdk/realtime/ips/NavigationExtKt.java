package me.oriient.ipssdk.realtime.ips;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.ipssdk.api.models.IPSWaypoint;
import me.oriient.ipssdk.common.utils.models.BuildingId;
import me.oriient.ipssdk.realtime.utils.models.RouteFloorTransition;
import me.oriient.ipssdk.realtime.utils.models.SdkCoordinateInBuilding;
import me.oriient.navigation.common.models.FloorTransition;
import me.oriient.navigation.common.models.FloorTransitionType;
import me.oriient.navigation.common.models.NavigationCoordinateInBuilding;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.common.models.Route;
import me.oriient.navigation.common.models.Turn;
import me.oriient.navigation.common.models.TurnDirection;
import me.oriient.navigation.turnByTurn.models.NavigationDirection;
import me.oriient.navigation.turnByTurn.models.NavigationInstruction;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0000\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0000\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\u0001*\u00020\u0012H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0018H\u0000\u001a\f\u0010\u0019\u001a\u00020\u001a*\u00020\u0006H\u0000¨\u0006\u001b"}, d2 = {"toIPSFloorTransitionTypes", "", "Lme/oriient/navigation/common/models/FloorTransitionType;", "toIPSTurnDirection", "Lme/oriient/navigation/common/models/TurnDirection;", "toNavigationWaypoint", "Lme/oriient/navigation/common/models/NavigationWaypoint;", "Lme/oriient/ipssdk/api/models/IPSWaypoint;", "toSdkCoordinateInBuilding", "Lme/oriient/ipssdk/realtime/utils/models/SdkCoordinateInBuilding;", "Lme/oriient/navigation/common/models/NavigationCoordinateInBuilding;", "toSdkFloorTransition", "Lme/oriient/ipssdk/realtime/utils/models/RouteFloorTransition;", "Lme/oriient/navigation/common/models/FloorTransition;", "toSdkInstruction", "Lme/oriient/ipssdk/realtime/ips/SdkInstruction;", "Lme/oriient/navigation/turnByTurn/models/NavigationInstruction;", "toSdkNavigationDirection", "Lme/oriient/navigation/turnByTurn/models/NavigationDirection;", "toSdkRoute", "Lme/oriient/ipssdk/realtime/ips/SdkRoute;", "Lme/oriient/navigation/common/models/Route;", "toSdkTurn", "Lme/oriient/ipssdk/realtime/ips/SdkTurn;", "Lme/oriient/navigation/common/models/Turn;", "toSdkWaypoint", "Lme/oriient/ipssdk/realtime/ips/SdkWaypoint;", "me.oriient.sdk-realtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class NavigationExtKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[FloorTransitionType.values().length];
            try {
                iArr[FloorTransitionType.STAIRS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FloorTransitionType.ELEVATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FloorTransitionType.ESCALATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FloorTransitionType.RAMP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FloorTransitionType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TurnDirection.values().length];
            try {
                iArr2[TurnDirection.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TurnDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NavigationDirection.values().length];
            try {
                iArr3[NavigationDirection.TURN_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[NavigationDirection.TURN_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[NavigationDirection.TURN_AROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[NavigationDirection.TURN_AROUND_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[NavigationDirection.TURN_AROUND_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[NavigationDirection.CONTINUE_STRAIGHT_TO_NEXT_TURN.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[NavigationDirection.CONTINUE_STRAIGHT_TO_DESTINATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[NavigationDirection.ARRIVED.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final int toIPSFloorTransitionTypes(@NotNull FloorTransitionType floorTransitionType) {
        Intrinsics.h(floorTransitionType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[floorTransitionType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int toIPSTurnDirection(@NotNull TurnDirection turnDirection) {
        Intrinsics.h(turnDirection, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[turnDirection.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final NavigationWaypoint toNavigationWaypoint(@NotNull IPSWaypoint iPSWaypoint) {
        Intrinsics.h(iPSWaypoint, "<this>");
        String f7346a = iPSWaypoint.getF25863a();
        Intrinsics.g(f7346a, "getId(...)");
        String c = iPSWaypoint.getB();
        Intrinsics.g(c, "getBuildingId(...)");
        return new NavigationWaypoint(f7346a, c, iPSWaypoint.getC(), new IndoorCoordinate(iPSWaypoint.getD(), iPSWaypoint.getE(), iPSWaypoint.getF()));
    }

    @NotNull
    public static final SdkCoordinateInBuilding toSdkCoordinateInBuilding(@NotNull NavigationCoordinateInBuilding navigationCoordinateInBuilding) {
        Intrinsics.h(navigationCoordinateInBuilding, "<this>");
        return new SdkCoordinateInBuilding(navigationCoordinateInBuilding.getCoordinate().getX(), navigationCoordinateInBuilding.getCoordinate().getY(), navigationCoordinateInBuilding.getCoordinate().getZ(), navigationCoordinateInBuilding.getFloorOrder(), BuildingId.m441constructorimpl(navigationCoordinateInBuilding.getBuildingId()), null);
    }

    @NotNull
    public static final RouteFloorTransition toSdkFloorTransition(@NotNull FloorTransition floorTransition) {
        Intrinsics.h(floorTransition, "<this>");
        return new RouteFloorTransition(floorTransition.getId(), BuildingId.m441constructorimpl(floorTransition.getBuildingId()), toIPSFloorTransitionTypes(floorTransition.getType()), floorTransition.getFloorOrder(), floorTransition.getDestinationFloorOrder(), floorTransition.getCoordinate().getX(), floorTransition.getCoordinate().getY(), floorTransition.getCoordinate().getZ(), floorTransition.getIndexOnRoute(), null);
    }

    @NotNull
    public static final SdkInstruction toSdkInstruction(@NotNull NavigationInstruction navigationInstruction) {
        Intrinsics.h(navigationInstruction, "<this>");
        return new SdkInstruction(toSdkNavigationDirection(navigationInstruction.getDirection()), navigationInstruction.getDistance());
    }

    public static final int toSdkNavigationDirection(@NotNull NavigationDirection navigationDirection) {
        Intrinsics.h(navigationDirection, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[navigationDirection.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 3;
            case 7:
                return 4;
            case 8:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final SdkRoute toSdkRoute(@NotNull Route route) {
        Intrinsics.h(route, "<this>");
        List<NavigationCoordinateInBuilding> routeCoordinates = route.getRouteCoordinates();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(routeCoordinates, 10));
        Iterator<T> it = routeCoordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(toSdkCoordinateInBuilding((NavigationCoordinateInBuilding) it.next()));
        }
        List<Integer> waypointsOrder = route.getWaypointsOrder();
        List<NavigationWaypoint> waypoints = route.getWaypoints();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(waypoints, 10));
        Iterator<T> it2 = waypoints.iterator();
        while (it2.hasNext()) {
            arrayList2.add(toSdkWaypoint((NavigationWaypoint) it2.next()));
        }
        List<FloorTransition> floorTransitions = route.getFloorTransitions();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(floorTransitions, 10));
        Iterator<T> it3 = floorTransitions.iterator();
        while (it3.hasNext()) {
            arrayList3.add(toSdkFloorTransition((FloorTransition) it3.next()));
        }
        return new SdkRoute(arrayList, arrayList2, arrayList3, route.getDistancesFromStartToWaypoints(), route.getDistancesFromStartToFloorTransitions(), waypointsOrder);
    }

    @NotNull
    public static final SdkTurn toSdkTurn(@NotNull Turn turn) {
        Intrinsics.h(turn, "<this>");
        return new SdkTurn(turn.getId(), new SdkCoordinateInBuilding(turn.getCoordinate().getX(), turn.getCoordinate().getY(), turn.getCoordinate().getZ(), turn.getFloorOrder(), BuildingId.m441constructorimpl(turn.getBuildingId()), null), toIPSTurnDirection(turn.getDirection()));
    }

    @NotNull
    public static final SdkWaypoint toSdkWaypoint(@NotNull NavigationWaypoint navigationWaypoint) {
        Intrinsics.h(navigationWaypoint, "<this>");
        return new SdkWaypoint(navigationWaypoint.getId(), navigationWaypoint.getBuildingId(), navigationWaypoint.getFloorOrder(), navigationWaypoint.getCoordinate().getX(), navigationWaypoint.getCoordinate().getY(), navigationWaypoint.getCoordinate().getZ());
    }
}
