package ovh.plrapps.mapcompose.ui.state.markers;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import ovh.plrapps.mapcompose.ui.state.markers.model.MarkerData;
import ovh.plrapps.mapcompose.utils.Point;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/markers/MarkerRenderState;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarkerRenderState {

    /* renamed from: a, reason: collision with root package name */
    public final State f26961a = SnapshotStateKt.d(new Function0<List<? extends MarkerData>>() { // from class: ovh.plrapps.mapcompose.ui.state.markers.MarkerRenderState$markers$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            MarkerRenderState markerRenderState = this.h;
            return CollectionsKt.c0(markerRenderState.e, CollectionsKt.c0(markerRenderState.d, markerRenderState.c));
        }
    });
    public final State b = SnapshotStateKt.d(new Function0<Boolean>() { // from class: ovh.plrapps.mapcompose.ui.state.markers.MarkerRenderState$hasClickable$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterable iterable = (Iterable) this.h.f26961a.getD();
            boolean z = false;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Boolean) ((SnapshotMutableStateImpl) ((MarkerData) it.next()).l).getD()).booleanValue()) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    });
    public final SnapshotStateList c = new SnapshotStateList();
    public final SnapshotStateList d = new SnapshotStateList();
    public final SnapshotStateList e = new SnapshotStateList();
    public final SnapshotStateMap f = new SnapshotStateMap();

    public static final double a(MarkerRenderState markerRenderState, MarkerData markerData, int i, int i2) {
        Point pointA = markerData.a();
        if (pointA == null) {
            return Double.MAX_VALUE;
        }
        double d = pointA.f26966a;
        double d2 = 2;
        return Math.pow(pointA.b - i2, d2) + Math.pow(d - i, d2);
    }
}
