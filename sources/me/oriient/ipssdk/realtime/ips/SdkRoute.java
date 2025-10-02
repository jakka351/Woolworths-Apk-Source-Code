package me.oriient.ipssdk.realtime.ips;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.ipssdk.api.models.IPSCoordinateInBuilding;
import me.oriient.ipssdk.api.models.IPSRoute;
import me.oriient.ipssdk.api.models.IPSRouteFloorTransition;
import me.oriient.ipssdk.api.models.IPSWaypoint;
import me.oriient.ipssdk.realtime.utils.models.RouteFloorTransition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0080\b\u0018\u0000 02\u00020\u0001:\u00010B[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0016\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010#J\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0018H\u0016¢\u0006\u0004\b&\u0010'Jp\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u001b2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/¨\u00061"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/SdkRoute;", "Lme/oriient/ipssdk/api/models/IPSRoute;", "", "Lme/oriient/ipssdk/api/models/IPSCoordinateInBuilding;", "routeCoordinates", "Lme/oriient/ipssdk/api/models/IPSWaypoint;", "waypointsInOrder", "Lme/oriient/ipssdk/realtime/utils/models/RouteFloorTransition;", "floorTransitions", "", "distancesFromStartToWaypoints", "distancesFromStartToFloorTransitions", "", "waypointsOrder", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getRouteCoordinates", "()Ljava/util/List;", "getWaypoints", "Lme/oriient/ipssdk/api/models/IPSRouteFloorTransition;", "getFloorTransitions", "waypoint", "getDistanceFromStart", "(Lme/oriient/ipssdk/api/models/IPSWaypoint;)D", "", "waypointId", "(Ljava/lang/String;)D", "", "isWaypointOnRoute", "(Lme/oriient/ipssdk/api/models/IPSWaypoint;)Z", "(Ljava/lang/String;)Z", "getIndexOnRoute", "(Lme/oriient/ipssdk/api/models/IPSWaypoint;)I", "(Ljava/lang/String;)I", "transition", "(Lme/oriient/ipssdk/api/models/IPSRouteFloorTransition;)D", "isFloorTransitionOnRoute", "(Lme/oriient/ipssdk/api/models/IPSRouteFloorTransition;)Z", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lme/oriient/ipssdk/realtime/ips/SdkRoute;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class SdkRoute implements IPSRoute {

    /* renamed from: a, reason: collision with root package name */
    private final List f25861a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;

    public SdkRoute(@NotNull List<? extends IPSCoordinateInBuilding> routeCoordinates, @NotNull List<? extends IPSWaypoint> waypointsInOrder, @NotNull List<RouteFloorTransition> floorTransitions, @NotNull List<Double> distancesFromStartToWaypoints, @NotNull List<Double> distancesFromStartToFloorTransitions, @NotNull List<Integer> waypointsOrder) {
        Intrinsics.h(routeCoordinates, "routeCoordinates");
        Intrinsics.h(waypointsInOrder, "waypointsInOrder");
        Intrinsics.h(floorTransitions, "floorTransitions");
        Intrinsics.h(distancesFromStartToWaypoints, "distancesFromStartToWaypoints");
        Intrinsics.h(distancesFromStartToFloorTransitions, "distancesFromStartToFloorTransitions");
        Intrinsics.h(waypointsOrder, "waypointsOrder");
        this.f25861a = routeCoordinates;
        this.b = waypointsInOrder;
        this.c = floorTransitions;
        this.d = distancesFromStartToWaypoints;
        this.e = distancesFromStartToFloorTransitions;
        this.f = waypointsOrder;
    }

    public static /* synthetic */ SdkRoute copy$default(SdkRoute sdkRoute, List list, List list2, List list3, List list4, List list5, List list6, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sdkRoute.f25861a;
        }
        if ((i & 2) != 0) {
            list2 = sdkRoute.b;
        }
        if ((i & 4) != 0) {
            list3 = sdkRoute.c;
        }
        if ((i & 8) != 0) {
            list4 = sdkRoute.d;
        }
        if ((i & 16) != 0) {
            list5 = sdkRoute.e;
        }
        if ((i & 32) != 0) {
            list6 = sdkRoute.f;
        }
        List list7 = list5;
        List list8 = list6;
        return sdkRoute.copy(list, list2, list3, list4, list7, list8);
    }

    @NotNull
    public final SdkRoute copy(@NotNull List<? extends IPSCoordinateInBuilding> routeCoordinates, @NotNull List<? extends IPSWaypoint> waypointsInOrder, @NotNull List<RouteFloorTransition> floorTransitions, @NotNull List<Double> distancesFromStartToWaypoints, @NotNull List<Double> distancesFromStartToFloorTransitions, @NotNull List<Integer> waypointsOrder) {
        Intrinsics.h(routeCoordinates, "routeCoordinates");
        Intrinsics.h(waypointsInOrder, "waypointsInOrder");
        Intrinsics.h(floorTransitions, "floorTransitions");
        Intrinsics.h(distancesFromStartToWaypoints, "distancesFromStartToWaypoints");
        Intrinsics.h(distancesFromStartToFloorTransitions, "distancesFromStartToFloorTransitions");
        Intrinsics.h(waypointsOrder, "waypointsOrder");
        return new SdkRoute(routeCoordinates, waypointsInOrder, floorTransitions, distancesFromStartToWaypoints, distancesFromStartToFloorTransitions, waypointsOrder);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkRoute)) {
            return false;
        }
        SdkRoute sdkRoute = (SdkRoute) other;
        return Intrinsics.c(this.f25861a, sdkRoute.f25861a) && Intrinsics.c(this.b, sdkRoute.b) && Intrinsics.c(this.c, sdkRoute.c) && Intrinsics.c(this.d, sdkRoute.d) && Intrinsics.c(this.e, sdkRoute.e) && Intrinsics.c(this.f, sdkRoute.f);
    }

    @Override // me.oriient.ipssdk.api.models.IPSRoute
    public double getDistanceFromStart(@NotNull IPSWaypoint waypoint) {
        Intrinsics.h(waypoint, "waypoint");
        String f7346a = waypoint.getF7346a();
        Intrinsics.g(f7346a, "getId(...)");
        return getDistanceFromStart(f7346a);
    }

    @Override // me.oriient.ipssdk.api.models.IPSRoute
    @NotNull
    public List<IPSRouteFloorTransition> getFloorTransitions() {
        return this.c;
    }

    @Override // me.oriient.ipssdk.api.models.IPSRoute
    public int getIndexOnRoute(@NotNull IPSWaypoint waypoint) {
        Intrinsics.h(waypoint, "waypoint");
        String f7346a = waypoint.getF7346a();
        Intrinsics.g(f7346a, "getId(...)");
        return getIndexOnRoute(f7346a);
    }

    @Override // me.oriient.ipssdk.api.models.IPSRoute
    @NotNull
    public List<IPSCoordinateInBuilding> getRouteCoordinates() {
        return new ArrayList(this.f25861a);
    }

    @Override // me.oriient.ipssdk.api.models.IPSRoute
    @NotNull
    public List<IPSWaypoint> getWaypoints() {
        return new ArrayList(this.b);
    }

    public int hashCode() {
        return this.f.hashCode() + androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d(this.f25861a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // me.oriient.ipssdk.api.models.IPSRoute
    public boolean isFloorTransitionOnRoute(@NotNull IPSRouteFloorTransition transition) {
        Integer numValueOf;
        Intrinsics.h(transition, "transition");
        int size = this.c.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                numValueOf = null;
                break;
            }
            RouteFloorTransition routeFloorTransition = (RouteFloorTransition) this.c.get(i);
            if (Intrinsics.c(routeFloorTransition.getId(), transition.getId()) && routeFloorTransition.getIndexInRoute() == transition.getIndexOnRoute()) {
                numValueOf = Integer.valueOf(i);
                break;
            }
            i++;
        }
        return numValueOf != null;
    }

    @Override // me.oriient.ipssdk.api.models.IPSRoute
    public boolean isWaypointOnRoute(@NotNull IPSWaypoint waypoint) {
        Intrinsics.h(waypoint, "waypoint");
        String f7346a = waypoint.getF7346a();
        Intrinsics.g(f7346a, "getId(...)");
        return isWaypointOnRoute(f7346a);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SdkRoute{routeCoordinates=");
        sb.append(this.f25861a);
        sb.append(", waypointsInOrder=");
        sb.append(this.b);
        sb.append(", floorTransitions=");
        sb.append(this.c);
        sb.append(", distancesFromStart=");
        return androidx.camera.core.impl.b.r(sb, CollectionsKt.M(this.d, null, null, null, null, 63), '}');
    }

    @Override // me.oriient.ipssdk.api.models.IPSRoute
    public double getDistanceFromStart(@NotNull IPSRouteFloorTransition transition) {
        Integer numValueOf;
        Intrinsics.h(transition, "transition");
        int size = this.c.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                numValueOf = null;
                break;
            }
            RouteFloorTransition routeFloorTransition = (RouteFloorTransition) this.c.get(i);
            if (Intrinsics.c(routeFloorTransition.getId(), transition.getId()) && routeFloorTransition.getIndexInRoute() == transition.getIndexOnRoute()) {
                numValueOf = Integer.valueOf(i);
                break;
            }
            i++;
        }
        if (numValueOf != null) {
            return ((Number) this.e.get(numValueOf.intValue())).doubleValue();
        }
        return -1.0d;
    }

    @Override // me.oriient.ipssdk.api.models.IPSRoute
    public int getIndexOnRoute(@NotNull String waypointId) {
        Intrinsics.h(waypointId, "waypointId");
        Iterator it = this.b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.c(((IPSWaypoint) it.next()).getF7346a(), waypointId)) {
                break;
            }
            i++;
        }
        if (i < 0 || i >= this.f.size()) {
            return -1;
        }
        return ((Number) this.f.get(i)).intValue();
    }

    @Override // me.oriient.ipssdk.api.models.IPSRoute
    public boolean isWaypointOnRoute(@NotNull String waypointId) {
        Object next;
        Intrinsics.h(waypointId, "waypointId");
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((IPSWaypoint) next).getF7346a(), waypointId)) {
                break;
            }
        }
        return next != null;
    }

    @Override // me.oriient.ipssdk.api.models.IPSRoute
    public double getDistanceFromStart(@NotNull String waypointId) {
        Intrinsics.h(waypointId, "waypointId");
        Iterator it = this.b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.c(((IPSWaypoint) it.next()).getF7346a(), waypointId)) {
                break;
            }
            i++;
        }
        if (i < 0 || i >= this.d.size()) {
            return -1.0d;
        }
        return ((Number) this.d.get(i)).doubleValue();
    }
}
