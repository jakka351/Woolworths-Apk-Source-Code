package coil3.compose.internal;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactorKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.LongSaturatedMathKt;
import kotlin.time.MonotonicTimeSource;
import kotlin.time.TimeSource;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/internal/CrossfadePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CrossfadePainter extends Painter {
    public Painter i;
    public final Painter j;
    public final ContentScale k;
    public final int l;
    public final boolean m;
    public TimeSource.Monotonic.ValueTimeMark o;
    public boolean p;
    public final MutableIntState n = SnapshotIntStateKt.a(0);
    public final MutableFloatState q = PrimitiveSnapshotStateKt.a(1.0f);
    public final MutableState r = SnapshotStateKt.f(null);

    public CrossfadePainter(Painter painter, Painter painter2, ContentScale contentScale, int i, boolean z) {
        this.i = painter;
        this.j = painter2;
        this.k = contentScale;
        this.l = i;
        this.m = z;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean a(float f) {
        ((SnapshotMutableFloatStateImpl) this.q).p(f);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean b(ColorFilter colorFilter) {
        ((SnapshotMutableStateImpl) this.r).setValue(colorFilter);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: f */
    public final long getJ() {
        Painter painter = this.i;
        long l = painter != null ? painter.getJ() : 0L;
        Painter painter2 = this.j;
        long l2 = painter2 != null ? painter2.getJ() : 0L;
        boolean z = l != 9205357640488583168L;
        boolean z2 = l2 != 9205357640488583168L;
        if (z && z2) {
            return SizeKt.a(Math.max(Size.d(l), Size.d(l2)), Math.max(Size.b(l), Size.b(l2)));
        }
        return 9205357640488583168L;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void h(DrawScope drawScope) {
        long jA;
        boolean z = this.p;
        Painter painter = this.j;
        MutableFloatState mutableFloatState = this.q;
        if (z) {
            j(drawScope, painter, ((SnapshotMutableFloatStateImpl) mutableFloatState).a());
            return;
        }
        TimeSource.Monotonic.ValueTimeMark valueTimeMark = this.o;
        if (valueTimeMark != null) {
            jA = valueTimeMark.d;
        } else {
            jA = MonotonicTimeSource.a();
            this.o = new TimeSource.Monotonic.ValueTimeMark(jA);
        }
        long jA2 = MonotonicTimeSource.a();
        DurationUnit unit = DurationUnit.e;
        Intrinsics.h(unit, "unit");
        float fD = Duration.d((1 | (jA - 1)) == Long.MAX_VALUE ? Duration.o(LongSaturatedMathKt.a(jA)) : LongSaturatedMathKt.b(jA2, jA, unit)) / this.l;
        SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = (SnapshotMutableFloatStateImpl) mutableFloatState;
        float fA = snapshotMutableFloatStateImpl.a() * RangesKt.b(fD, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float fA2 = this.m ? snapshotMutableFloatStateImpl.a() - fA : snapshotMutableFloatStateImpl.a();
        this.p = fD >= 1.0f;
        j(drawScope, this.i, fA2);
        j(drawScope, painter, fA);
        if (this.p) {
            this.i = null;
        } else {
            SnapshotMutableIntStateImpl snapshotMutableIntStateImpl = (SnapshotMutableIntStateImpl) this.n;
            snapshotMutableIntStateImpl.i(snapshotMutableIntStateImpl.d() + 1);
        }
    }

    public final void j(DrawScope drawScope, Painter painter, float f) {
        if (painter == null || f <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        long jH = drawScope.h();
        long l = painter.getJ();
        long jA = (l == 9205357640488583168L || Size.e(l) || jH == 9205357640488583168L || Size.e(jH)) ? jH : ScaleFactorKt.a(l, this.k.a(l, jH));
        MutableState mutableState = this.r;
        if (jH == 9205357640488583168L || Size.e(jH)) {
            painter.e(drawScope, jA, f, (ColorFilter) ((SnapshotMutableStateImpl) mutableState).getD());
            return;
        }
        float f2 = 2;
        float fD = (Size.d(jH) - Size.d(jA)) / f2;
        float fB = (Size.b(jH) - Size.b(jA)) / f2;
        drawScope.getE().f1798a.c(fD, fB, fD, fB);
        try {
            painter.e(drawScope, jA, f, (ColorFilter) ((SnapshotMutableStateImpl) mutableState).getD());
        } finally {
            CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = drawScope.getE().f1798a;
            float f3 = -fD;
            float f4 = -fB;
            canvasDrawScopeKt$asDrawTransform$1.c(f3, f4, f3, f4);
        }
    }
}
