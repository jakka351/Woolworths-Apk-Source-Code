package ovh.plrapps.mapcompose.ui.markers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ovh.plrapps.mapcompose.ui.state.markers.model.MarkerData;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/markers/Marker;", "Lovh/plrapps/mapcompose/ui/markers/Placeable;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class Marker implements Placeable {

    /* renamed from: a, reason: collision with root package name */
    public final MarkerData f26945a;

    public Marker(MarkerData markerData) {
        Intrinsics.h(markerData, "markerData");
        this.f26945a = markerData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Marker) && Intrinsics.c(this.f26945a, ((Marker) obj).f26945a);
    }

    public final int hashCode() {
        return this.f26945a.hashCode();
    }

    public final String toString() {
        return "Marker(markerData=" + this.f26945a + ")";
    }
}
