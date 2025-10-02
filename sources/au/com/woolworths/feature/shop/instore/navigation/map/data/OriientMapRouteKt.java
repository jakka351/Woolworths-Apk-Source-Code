package au.com.woolworths.feature.shop.instore.navigation.map.data;

import au.com.woolworths.feature.shop.instore.navigation.map.data.FloorTransitionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.ipssdk.api.models.IPSCoordinateInBuilding;
import me.oriient.ipssdk.api.models.IPSRoute;
import me.oriient.ipssdk.api.models.IPSRouteFloorTransition;
import me.oriient.ipssdk.api.models.IPSWaypoint;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OriientMapRouteKt {
    public static final OriientFloorTransition a(IPSRouteFloorTransition iPSRouteFloorTransition) {
        String id = iPSRouteFloorTransition.getId();
        Intrinsics.g(id, "getId(...)");
        OriientMetersCoordinate oriientMetersCoordinateA = IpsCoordinateExtKt.a(iPSRouteFloorTransition);
        FloorTransitionType.Companion companion = FloorTransitionType.d;
        int type = iPSRouteFloorTransition.getType();
        companion.getClass();
        return new OriientFloorTransition(id, oriientMetersCoordinateA, type != 0 ? type != 1 ? type != 2 ? type != 3 ? FloorTransitionType.e : FloorTransitionType.h : FloorTransitionType.g : FloorTransitionType.f : FloorTransitionType.e, iPSRouteFloorTransition.getFloorOrder(), iPSRouteFloorTransition.getDestinationFloorOrder());
    }

    public static final OriientMapRoute b(IPSRoute iPSRoute) {
        int indexOnRoute = iPSRoute.getIndexOnRoute(iPSRoute.getWaypoints().get(0));
        if (indexOnRoute == 0 && iPSRoute.getWaypoints().size() > 1) {
            indexOnRoute = iPSRoute.getIndexOnRoute(iPSRoute.getWaypoints().get(1));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<? extends IPSRouteFloorTransition> floorTransitions = iPSRoute.getFloorTransitions();
        Intrinsics.g(floorTransitions, "getFloorTransitions(...)");
        for (IPSRouteFloorTransition iPSRouteFloorTransition : floorTransitions) {
            if (iPSRouteFloorTransition.getIndexOnRoute() < indexOnRoute) {
                arrayList.add(a(iPSRouteFloorTransition));
            } else {
                arrayList2.add(a(iPSRouteFloorTransition));
            }
        }
        List<? extends IPSCoordinateInBuilding> listSubList = iPSRoute.getRouteCoordinates().subList(0, indexOnRoute + 1);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(listSubList, 10));
        for (IPSCoordinateInBuilding iPSCoordinateInBuilding : listSubList) {
            Intrinsics.e(iPSCoordinateInBuilding);
            arrayList3.add(new OriientCoordinateInBuilding(iPSCoordinateInBuilding.getFloorOrder(), IpsCoordinateExtKt.a(iPSCoordinateInBuilding)));
        }
        List<? extends IPSCoordinateInBuilding> listSubList2 = iPSRoute.getRouteCoordinates().subList(indexOnRoute, iPSRoute.getRouteCoordinates().size());
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(listSubList2, 10));
        for (IPSCoordinateInBuilding iPSCoordinateInBuilding2 : listSubList2) {
            Intrinsics.e(iPSCoordinateInBuilding2);
            arrayList4.add(new OriientCoordinateInBuilding(iPSCoordinateInBuilding2.getFloorOrder(), IpsCoordinateExtKt.a(iPSCoordinateInBuilding2)));
        }
        List<? extends IPSWaypoint> waypoints = iPSRoute.getWaypoints();
        Intrinsics.g(waypoints, "getWaypoints(...)");
        List<? extends IPSWaypoint> list = waypoints;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(list, 10));
        for (IPSWaypoint iPSWaypoint : list) {
            Intrinsics.e(iPSWaypoint);
            String f25863a = iPSWaypoint.getF7346a();
            Intrinsics.g(f25863a, "getId(...)");
            OriientMetersCoordinate oriientMetersCoordinateA = IpsCoordinateExtKt.a(iPSWaypoint);
            String buildingId = iPSWaypoint.getBuildingId();
            Intrinsics.g(buildingId, "getBuildingId(...)");
            arrayList5.add(new OriientWaypoint(f25863a, oriientMetersCoordinateA, buildingId, iPSWaypoint.getFloorOrder()));
        }
        return new OriientMapRoute(arrayList3, arrayList, arrayList4, arrayList2, arrayList5, iPSRoute.getDistanceFromStart(iPSRoute.getWaypoints().get(0)));
    }
}
