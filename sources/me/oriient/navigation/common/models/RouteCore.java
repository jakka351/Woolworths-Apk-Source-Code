package me.oriient.navigation.common.models;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lme/oriient/navigation/common/models/RouteCore;", "", com.salesforce.marketingcloud.config.a.j, "", "Lme/oriient/navigation/common/models/CoordinateInFloorCore;", "transitions", "Lme/oriient/navigation/common/models/TransitionCore;", "waypointsOrder", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getPath", "()Ljava/util/List;", "getTransitions", "getWaypointsOrder", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RouteCore {

    @NotNull
    private final List<CoordinateInFloorCore> path;

    @NotNull
    private final List<TransitionCore> transitions;

    @NotNull
    private final List<Integer> waypointsOrder;

    public RouteCore(@NotNull List<CoordinateInFloorCore> path, @NotNull List<TransitionCore> transitions, @NotNull List<Integer> waypointsOrder) {
        Intrinsics.h(path, "path");
        Intrinsics.h(transitions, "transitions");
        Intrinsics.h(waypointsOrder, "waypointsOrder");
        this.path = path;
        this.transitions = transitions;
        this.waypointsOrder = waypointsOrder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteCore copy$default(RouteCore routeCore, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = routeCore.path;
        }
        if ((i & 2) != 0) {
            list2 = routeCore.transitions;
        }
        if ((i & 4) != 0) {
            list3 = routeCore.waypointsOrder;
        }
        return routeCore.copy(list, list2, list3);
    }

    @NotNull
    public final List<CoordinateInFloorCore> component1() {
        return this.path;
    }

    @NotNull
    public final List<TransitionCore> component2() {
        return this.transitions;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.waypointsOrder;
    }

    @NotNull
    public final RouteCore copy(@NotNull List<CoordinateInFloorCore> path, @NotNull List<TransitionCore> transitions, @NotNull List<Integer> waypointsOrder) {
        Intrinsics.h(path, "path");
        Intrinsics.h(transitions, "transitions");
        Intrinsics.h(waypointsOrder, "waypointsOrder");
        return new RouteCore(path, transitions, waypointsOrder);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteCore)) {
            return false;
        }
        RouteCore routeCore = (RouteCore) other;
        return Intrinsics.c(this.path, routeCore.path) && Intrinsics.c(this.transitions, routeCore.transitions) && Intrinsics.c(this.waypointsOrder, routeCore.waypointsOrder);
    }

    @NotNull
    public final List<CoordinateInFloorCore> getPath() {
        return this.path;
    }

    @NotNull
    public final List<TransitionCore> getTransitions() {
        return this.transitions;
    }

    @NotNull
    public final List<Integer> getWaypointsOrder() {
        return this.waypointsOrder;
    }

    public int hashCode() {
        return this.waypointsOrder.hashCode() + androidx.camera.core.impl.b.d(this.path.hashCode() * 31, 31, this.transitions);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RouteCore(path=");
        sb.append(this.path);
        sb.append(", transitions=");
        sb.append(this.transitions);
        sb.append(", waypointsOrder=");
        return androidx.compose.ui.input.pointer.a.o(sb, this.waypointsOrder, ')');
    }
}
