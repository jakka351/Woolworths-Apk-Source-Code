package ovh.plrapps.mapcompose.ui.state;

import android.content.res.Resources;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import ovh.plrapps.mapcompose.ui.gestures.model.HitType;
import ovh.plrapps.mapcompose.utils.GeometryKt;
import ovh.plrapps.mapcompose.utils.Point;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/PathState;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PathState {

    /* renamed from: a, reason: collision with root package name */
    public final int f26956a;
    public final int b;
    public final SnapshotStateMap c = new SnapshotStateMap();
    public final State d = SnapshotStateKt.d(new Function0<Boolean>() { // from class: ovh.plrapps.mapcompose.ui.state.PathState$hasClickable$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Collection collection = this.h.c.g;
            boolean z = false;
            if (collection == null || !collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Boolean) ((SnapshotMutableStateImpl) ((DrawablePathState) it.next()).h).getD()).booleanValue()) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    });

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[HitType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HitType hitType = HitType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PathState(int i, int i2) {
        this.f26956a = i;
        this.b = i2;
    }

    public final boolean a(double d, double d2, double d3, HitType hitType) {
        DrawablePathState drawablePathState;
        double dA;
        Iterator it;
        if (!((Boolean) this.d.getD()).booleanValue()) {
            return false;
        }
        double d4 = d * this.f26956a;
        double d5 = d2 * this.b;
        double d6 = (12.0f * Resources.getSystem().getDisplayMetrics().density) / d3;
        new ArrayList();
        Set set = this.c.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((Boolean) ((SnapshotMutableStateImpl) ((DrawablePathState) ((Map.Entry) obj).getValue()).h).getD()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = CollectionsKt.u0(new PathState$onHit$$inlined$sortedByDescending$1(), arrayList).iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            DrawablePathState drawablePathState2 = (DrawablePathState) entry.getValue();
            Pair pair = drawablePathState2.a().b;
            Point point = (Point) pair.d;
            Point point2 = (Point) pair.e;
            double d7 = point.f26966a;
            double d8 = point.b;
            double d9 = d6;
            double d10 = point2.f26966a;
            double d11 = point2.b;
            if (d7 > d4 || d4 > d10 || d8 > d5 || d5 > d11) {
                if (d4 < d7) {
                    drawablePathState = drawablePathState2;
                    dA = GeometryKt.a(d4, d5, d7, d8, d7, d11);
                } else {
                    drawablePathState = drawablePathState2;
                    dA = d4 > d10 ? GeometryKt.a(d4, d5, d10, d8, d10, d11) : d5 < d8 ? GeometryKt.a(d4, d5, d7, d8, d10, d8) : d5 > d11 ? GeometryKt.a(d4, d5, d7, d11, d10, d11) : 0.0d;
                }
                if (dA > d9) {
                    it = it2;
                }
                d6 = d9;
                it2 = it;
            } else {
                drawablePathState = drawablePathState2;
            }
            List list = (List) drawablePathState.f26953a.getValue();
            if (list == null) {
                list = drawablePathState.a().f26948a;
            }
            int size = list.size();
            Point point3 = null;
            double d12 = Double.MAX_VALUE;
            int i = 0;
            Point point4 = null;
            while (i < size) {
                int i2 = i + 1;
                if (i2 == list.size()) {
                    break;
                }
                Point point5 = (Point) list.get(i);
                Point point6 = (Point) list.get(i2);
                Iterator it3 = it2;
                Point point7 = point4;
                double dA2 = GeometryKt.a(d4, d5, point5.f26966a, point5.b, point6.f26966a, point6.b);
                if (dA2 >= d9 || dA2 >= d12) {
                    point4 = point7;
                } else {
                    d12 = dA2;
                    point3 = point5;
                    point4 = point6;
                }
                it2 = it3;
                i = i2;
            }
            it = it2;
            Point point8 = point4;
            if (point3 != null && point8 != null) {
                double d13 = point3.f26966a;
                double d14 = point3.b;
                double d15 = point8.f26966a;
                double d16 = point8.b;
                double d17 = d15 - d13;
                double d18 = d16 - d14;
                double d19 = (d18 * d18) + (d17 * d17);
                double d20 = d19 == 0.0d ? -1.0d : (((d5 - d14) * d18) + ((d4 - d13) * d17)) / d19;
                Pair pair2 = d20 < 0.0d ? new Pair(Double.valueOf(d13), Double.valueOf(d14)) : d20 > 1.0d ? new Pair(Double.valueOf(d15), Double.valueOf(d16)) : new Pair(Double.valueOf((d17 * d20) + d13), Double.valueOf((d20 * d18) + d14));
                ((Number) pair2.d).doubleValue();
                ((Number) pair2.e).doubleValue();
                hitType.ordinal();
                return true;
            }
            d6 = d9;
            it2 = it;
        }
        return false;
    }
}
