package ovh.plrapps.mapcompose.api;

import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.DpOffset;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import ovh.plrapps.mapcompose.ui.state.MapState;
import ovh.plrapps.mapcompose.ui.state.markers.MarkerState;
import ovh.plrapps.mapcompose.ui.state.markers.model.MarkerData;
import ovh.plrapps.mapcompose.ui.state.markers.model.RenderingStrategy;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarkerApiKt {
    public static void a(MapState addMarker, String str, double d, double d2, long j, ComposableLambdaImpl composableLambdaImpl, int i) {
        long jA = (i & 8) != 0 ? OffsetKt.a(-0.5f, -1.0f) : j;
        boolean z = (i & 64) != 0;
        long jA2 = OffsetKt.a(1.0f, 1.0f);
        long jA3 = OffsetKt.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Intrinsics.h(addMarker, "$this$addMarker");
        MarkerState markerState = addMarker.d;
        markerState.getClass();
        MutableStateFlow mutableStateFlow = markerState.b;
        Iterable iterable = (Iterable) mutableStateFlow.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((MarkerData) it.next()).f26963a.equals(str)) {
                    return;
                }
            }
        }
        mutableStateFlow.setValue(CollectionsKt.d0(new MarkerData(str, d, d2, jA, z, jA2, jA3, RenderingStrategy.Default.f26965a, composableLambdaImpl), (Collection) mutableStateFlow.getValue()));
    }

    public static final MarkerInfo b(MapState mapState, String id) {
        Intrinsics.h(mapState, "<this>");
        Intrinsics.h(id, "id");
        MarkerData markerDataB = mapState.d.b(id);
        if (markerDataB != null) {
            return new MarkerInfo(markerDataB.f26963a, ((SnapshotMutableDoubleStateImpl) markerDataB.d).f(), ((SnapshotMutableDoubleStateImpl) markerDataB.e).f(), markerDataB.b(), ((DpOffset) ((SnapshotMutableStateImpl) markerDataB.g).getD()).f2198a, ((SnapshotMutableFloatStateImpl) markerDataB.o).a());
        }
        return null;
    }

    public static final void c(MapState mapState, String str) {
        MarkerState markerState = mapState.d;
        markerState.getClass();
        MarkerData markerDataB = markerState.b(str);
        if (markerDataB != null) {
            MutableStateFlow mutableStateFlow = markerState.b;
            mutableStateFlow.setValue(CollectionsKt.X((Iterable) mutableStateFlow.getValue(), markerDataB));
        }
    }
}
