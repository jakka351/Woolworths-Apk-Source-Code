package me.oriient.navigation.ondevice;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;
import me.oriient.navigation.common.models.CoordinateInFloorCore;
import me.oriient.navigation.common.models.RouteCore;
import me.oriient.navigation.common.models.TransitionCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u001b"}, d2 = {"Lme/oriient/navigation/ondevice/NavigationOutput;", "", com.salesforce.marketingcloud.config.a.j, "", "", "waypointsIdxInPath", "", "transitions", "Lme/oriient/navigation/ondevice/NavEngineTransition;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getPath", "()Ljava/util/List;", "getTransitions", "getWaypointsIdxInPath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toRouteCore", "Lme/oriient/navigation/common/models/RouteCore;", "toString", "", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class NavigationOutput {

    @NotNull
    private final List<Float> path;

    @NotNull
    private final List<NavEngineTransition> transitions;

    @NotNull
    private final List<Double> waypointsIdxInPath;

    public NavigationOutput(@NotNull List<Float> path, @NotNull List<Double> waypointsIdxInPath, @NotNull List<NavEngineTransition> transitions) {
        Intrinsics.h(path, "path");
        Intrinsics.h(waypointsIdxInPath, "waypointsIdxInPath");
        Intrinsics.h(transitions, "transitions");
        this.path = path;
        this.waypointsIdxInPath = waypointsIdxInPath;
        this.transitions = transitions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigationOutput copy$default(NavigationOutput navigationOutput, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = navigationOutput.path;
        }
        if ((i & 2) != 0) {
            list2 = navigationOutput.waypointsIdxInPath;
        }
        if ((i & 4) != 0) {
            list3 = navigationOutput.transitions;
        }
        return navigationOutput.copy(list, list2, list3);
    }

    @NotNull
    public final List<Float> component1() {
        return this.path;
    }

    @NotNull
    public final List<Double> component2() {
        return this.waypointsIdxInPath;
    }

    @NotNull
    public final List<NavEngineTransition> component3() {
        return this.transitions;
    }

    @NotNull
    public final NavigationOutput copy(@NotNull List<Float> path, @NotNull List<Double> waypointsIdxInPath, @NotNull List<NavEngineTransition> transitions) {
        Intrinsics.h(path, "path");
        Intrinsics.h(waypointsIdxInPath, "waypointsIdxInPath");
        Intrinsics.h(transitions, "transitions");
        return new NavigationOutput(path, waypointsIdxInPath, transitions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationOutput)) {
            return false;
        }
        NavigationOutput navigationOutput = (NavigationOutput) other;
        return Intrinsics.c(this.path, navigationOutput.path) && Intrinsics.c(this.waypointsIdxInPath, navigationOutput.waypointsIdxInPath) && Intrinsics.c(this.transitions, navigationOutput.transitions);
    }

    @NotNull
    public final List<Float> getPath() {
        return this.path;
    }

    @NotNull
    public final List<NavEngineTransition> getTransitions() {
        return this.transitions;
    }

    @NotNull
    public final List<Double> getWaypointsIdxInPath() {
        return this.waypointsIdxInPath;
    }

    public int hashCode() {
        return this.transitions.hashCode() + androidx.camera.core.impl.b.d(this.path.hashCode() * 31, 31, this.waypointsIdxInPath);
    }

    @NotNull
    public final RouteCore toRouteCore() {
        ArrayList arrayList = new ArrayList();
        int size = this.path.size() / 4;
        IntProgressionIterator it = RangesKt.o(0, size).iterator();
        while (it.f) {
            arrayList.add(new CoordinateInFloorCore(this.path.get(r3).floatValue(), this.path.get(r3 + size).floatValue(), this.path.get((size * 2) + r3).floatValue(), (int) this.path.get((size * 3) + it.nextInt()).floatValue()));
        }
        List<NavEngineTransition> list = this.transitions;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list, 10));
        for (NavEngineTransition navEngineTransition : list) {
            String uuid = navEngineTransition.getUuid();
            int index = (int) navEngineTransition.getIndex();
            me.oriient.navigation.common.models.j jVar = TransitionCore.a.Companion;
            String rawValue = navEngineTransition.getType();
            jVar.getClass();
            Intrinsics.h(rawValue, "rawValue");
            TransitionCore.a aVar = TransitionCore.a.ESCALATOR;
            if (!rawValue.equals(aVar.getValue())) {
                aVar = TransitionCore.a.ELEVATOR;
                if (!rawValue.equals(aVar.getValue())) {
                    aVar = TransitionCore.a.STAIRS;
                    if (!rawValue.equals(aVar.getValue())) {
                        aVar = TransitionCore.a.RAMP;
                        if (!rawValue.equals(aVar.getValue())) {
                            aVar = TransitionCore.a.UNKNOWN;
                        }
                    }
                }
            }
            arrayList2.add(new TransitionCore(uuid, index, aVar));
        }
        List<Double> list2 = this.waypointsIdxInPath;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf((int) ((Number) it2.next()).doubleValue()));
        }
        return new RouteCore(arrayList, arrayList2, arrayList3);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavigationOutput(path=");
        sb.append(this.path);
        sb.append(", waypointsIdxInPath=");
        sb.append(this.waypointsIdxInPath);
        sb.append(", transitions=");
        return androidx.compose.ui.input.pointer.a.o(sb, this.transitions, ')');
    }
}
