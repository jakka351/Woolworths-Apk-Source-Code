package ovh.plrapps.mapcompose.ui.state;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.a;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import ovh.plrapps.mapcompose.ui.paths.PathData;
import ovh.plrapps.mapcompose.ui.paths.model.Cap;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/DrawablePathState;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DrawablePathState {
    public final MutableState b;
    public final MutableState d;
    public final MutableState e;
    public final MutableState g;

    /* renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f26953a = StateFlowKt.a(null);
    public final MutableState c = SnapshotStateKt.f(Boolean.TRUE);
    public final MutableState f = SnapshotStateKt.f(null);
    public final MutableState h = SnapshotStateKt.f(Boolean.FALSE);
    public final MutableFloatState i = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
    public final MutableState j = SnapshotStateKt.f(null);
    public final MutableState k = SnapshotStateKt.f(new IntOffset(IntOffsetKt.a(0, RangesKt.c(a().f26948a.size(), 0, a().f26948a.size()))));
    public final MutableFloatState l = PrimitiveSnapshotStateKt.a(1.0f);
    public final MutableStateFlow m = StateFlowKt.a(0);

    public DrawablePathState(PathData pathData, Dp dp, Color color, Cap cap) {
        this.b = SnapshotStateKt.f(pathData);
        this.d = SnapshotStateKt.f(new Dp(dp.d));
        this.e = SnapshotStateKt.f(new Color(color.f1766a));
        this.g = SnapshotStateKt.f(cap);
    }

    public final PathData a() {
        return (PathData) ((SnapshotMutableStateImpl) this.b).getD();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DrawablePathState.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type ovh.plrapps.mapcompose.ui.state.DrawablePathState");
        return a().f26948a.size() == ((DrawablePathState) obj).a().f26948a.size();
    }

    public final int hashCode() {
        return a.c(31, 1514107640, a().f26948a);
    }
}
