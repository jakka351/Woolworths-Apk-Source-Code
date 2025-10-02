package coil3.compose.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.c;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/compose/internal/ContentPainterNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ContentPainterNode extends Modifier.Node implements DrawModifierNode, LayoutModifierNode {
    public Painter r;
    public Alignment s;
    public ContentScale t;
    public float u;
    public ColorFilter v;

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.d;
        long jS2 = s2(canvasDrawScope.h());
        Alignment alignment = this.s;
        CoroutineDispatcher coroutineDispatcher = UtilsKt.f13070a;
        long jA = IntSizeKt.a(MathKt.b(Size.d(jS2)), MathKt.b(Size.b(jS2)));
        long jH = canvasDrawScope.h();
        long jA2 = alignment.a(jA, IntSizeKt.a(MathKt.b(Size.d(jH)), MathKt.b(Size.b(jH))), layoutNodeDrawScope.getLayoutDirection());
        float f = (int) (jA2 >> 32);
        float f2 = (int) (jA2 & 4294967295L);
        canvasDrawScope.e.f1798a.f(f, f2);
        try {
            this.r.e(layoutNodeDrawScope, jS2, this.u, this.v);
            canvasDrawScope.e.f1798a.f(-f, -f2);
            layoutNodeDrawScope.Q0();
        } catch (Throwable th) {
            canvasDrawScope.e.f1798a.f(-f, -f2);
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.r.getJ() == 9205357640488583168L) {
            return intrinsicMeasurable.T(i);
        }
        long jT2 = t2(ConstraintsKt.b(i, 0, 13));
        return Math.max(Constraints.i(jT2), intrinsicMeasurable.T(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.r.getJ() == 9205357640488583168L) {
            return intrinsicMeasurable.b0(i);
        }
        long jT2 = t2(ConstraintsKt.b(0, i, 7));
        return Math.max(Constraints.j(jT2), intrinsicMeasurable.b0(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.r.getJ() == 9205357640488583168L) {
            return intrinsicMeasurable.J(i);
        }
        long jT2 = t2(ConstraintsKt.b(i, 0, 13));
        return Math.max(Constraints.i(jT2), intrinsicMeasurable.J(i));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable placeableC0 = measurable.c0(t2(j));
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new c(placeableC0, 1));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.r.getJ() == 9205357640488583168L) {
            return intrinsicMeasurable.a0(i);
        }
        long jT2 = t2(ConstraintsKt.b(0, i, 7));
        return Math.max(Constraints.j(jT2), intrinsicMeasurable.a0(i));
    }

    public final long s2(long j) {
        if (Size.e(j)) {
            return 0L;
        }
        long j2 = this.r.getJ();
        if (j2 == 9205357640488583168L) {
            return j;
        }
        float fD = Size.d(j2);
        if (Float.isInfinite(fD) || Float.isNaN(fD)) {
            fD = Size.d(j);
        }
        float fB = Size.b(j2);
        if (Float.isInfinite(fB) || Float.isNaN(fB)) {
            fB = Size.b(j);
        }
        long jA = SizeKt.a(fD, fB);
        long jA2 = this.t.a(jA, j);
        int i = ScaleFactor.f1894a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA2 >> 32));
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return j;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jA2));
        return (Float.isInfinite(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat2)) ? j : ScaleFactorKt.a(jA, jA2);
    }

    public final long t2(long j) {
        float fJ;
        int i;
        float fB;
        boolean zF = Constraints.f(j);
        boolean zE = Constraints.e(j);
        if (zF && zE) {
            return j;
        }
        Painter painter = this.r;
        boolean z = Constraints.d(j) && Constraints.c(j);
        long j2 = painter.getJ();
        if (j2 == 9205357640488583168L) {
            return z ? ((painter instanceof AsyncImagePainter) && ((AsyncImagePainter.State) ((AsyncImagePainter) painter).x.getValue()).getF13062a() == null) ? j : Constraints.a(j, Constraints.h(j), 0, Constraints.g(j), 0, 10) : j;
        }
        if (z && (zF || zE)) {
            fJ = Constraints.h(j);
            i = Constraints.g(j);
        } else {
            float fD = Size.d(j2);
            float fB2 = Size.b(j2);
            if (Float.isInfinite(fD) || Float.isNaN(fD)) {
                fJ = Constraints.j(j);
            } else {
                CoroutineDispatcher coroutineDispatcher = UtilsKt.f13070a;
                fJ = RangesKt.b(fD, Constraints.j(j), Constraints.h(j));
            }
            if (!Float.isInfinite(fB2) && !Float.isNaN(fB2)) {
                CoroutineDispatcher coroutineDispatcher2 = UtilsKt.f13070a;
                fB = RangesKt.b(fB2, Constraints.i(j), Constraints.g(j));
                long jS2 = s2(SizeKt.a(fJ, fB));
                return Constraints.a(j, ConstraintsKt.g(MathKt.b(Size.d(jS2)), j), 0, ConstraintsKt.f(MathKt.b(Size.b(jS2)), j), 0, 10);
            }
            i = Constraints.i(j);
        }
        fB = i;
        long jS22 = s2(SizeKt.a(fJ, fB));
        return Constraints.a(j, ConstraintsKt.g(MathKt.b(Size.d(jS22)), j), 0, ConstraintsKt.f(MathKt.b(Size.b(jS22)), j), 0, 10);
    }
}
