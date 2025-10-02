package coil.compose;

import android.support.v4.media.session.a;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcoil/compose/ContentPainterModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final /* data */ class ContentPainterModifier extends InspectorValueInfo implements LayoutModifier, DrawModifier {
    public final Painter e;
    public final Alignment f;
    public final ContentScale g;
    public final float h;
    public final ColorFilter i;

    public ContentPainterModifier(Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        super(InspectableValueKt.a());
        this.e = painter;
        this.f = alignment;
        this.g = contentScale;
        this.h = f;
        this.i = colorFilter;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.d;
        long jC = c(canvasDrawScope.h());
        int i = UtilsKt.f12972a;
        long jA = IntSizeKt.a(MathKt.b(Size.d(jC)), MathKt.b(Size.b(jC)));
        long jH = canvasDrawScope.h();
        long jA2 = this.f.a(jA, IntSizeKt.a(MathKt.b(Size.d(jH)), MathKt.b(Size.b(jH))), layoutNodeDrawScope.getLayoutDirection());
        float f = (int) (jA2 >> 32);
        float f2 = (int) (jA2 & 4294967295L);
        canvasDrawScope.e.f1798a.f(f, f2);
        this.e.e(layoutNodeDrawScope, jC, this.h, this.i);
        canvasDrawScope.e.f1798a.f(-f, -f2);
        layoutNodeDrawScope.Q0();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.e.getJ() == 9205357640488583168L) {
            return intrinsicMeasurable.T(i);
        }
        int iT = intrinsicMeasurable.T(Constraints.h(d(ConstraintsKt.b(i, 0, 13))));
        return Math.max(MathKt.b(Size.b(c(SizeKt.a(i, iT)))), iT);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.e.getJ() == 9205357640488583168L) {
            return intrinsicMeasurable.b0(i);
        }
        int iB0 = intrinsicMeasurable.b0(Constraints.g(d(ConstraintsKt.b(0, i, 7))));
        return Math.max(MathKt.b(Size.d(c(SizeKt.a(iB0, i)))), iB0);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.e.getJ() == 9205357640488583168L) {
            return intrinsicMeasurable.J(i);
        }
        int iJ = intrinsicMeasurable.J(Constraints.h(d(ConstraintsKt.b(i, 0, 13))));
        return Math.max(MathKt.b(Size.b(c(SizeKt.a(i, iJ)))), iJ);
    }

    public final long c(long j) {
        if (Size.e(j)) {
            return 0L;
        }
        long j2 = this.e.getJ();
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
        long jA2 = this.g.a(jA, j);
        int i = ScaleFactor.f1894a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA2 >> 32));
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return j;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jA2));
        return (Float.isInfinite(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat2)) ? j : ScaleFactorKt.a(jA, jA2);
    }

    public final long d(long j) {
        float fJ;
        int i;
        float fB;
        boolean zF = Constraints.f(j);
        boolean zE = Constraints.e(j);
        if (!zF || !zE) {
            boolean z = Constraints.d(j) && Constraints.c(j);
            long j2 = this.e.getJ();
            if (j2 != 9205357640488583168L) {
                if (z && (zF || zE)) {
                    fJ = Constraints.h(j);
                    i = Constraints.g(j);
                } else {
                    float fD = Size.d(j2);
                    float fB2 = Size.b(j2);
                    if (Float.isInfinite(fD) || Float.isNaN(fD)) {
                        fJ = Constraints.j(j);
                    } else {
                        int i2 = UtilsKt.f12972a;
                        fJ = RangesKt.b(fD, Constraints.j(j), Constraints.h(j));
                    }
                    if (!Float.isInfinite(fB2) && !Float.isNaN(fB2)) {
                        int i3 = UtilsKt.f12972a;
                        fB = RangesKt.b(fB2, Constraints.i(j), Constraints.g(j));
                        long jC = c(SizeKt.a(fJ, fB));
                        return Constraints.a(j, ConstraintsKt.g(MathKt.b(Size.d(jC)), j), 0, ConstraintsKt.f(MathKt.b(Size.b(jC)), j), 0, 10);
                    }
                    i = Constraints.i(j);
                }
                fB = i;
                long jC2 = c(SizeKt.a(fJ, fB));
                return Constraints.a(j, ConstraintsKt.g(MathKt.b(Size.d(jC2)), j), 0, ConstraintsKt.f(MathKt.b(Size.b(jC2)), j), 0, 10);
            }
            if (z) {
                return Constraints.a(j, Constraints.h(j), 0, Constraints.g(j), 0, 10);
            }
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterModifier)) {
            return false;
        }
        ContentPainterModifier contentPainterModifier = (ContentPainterModifier) obj;
        return Intrinsics.c(this.e, contentPainterModifier.e) && Intrinsics.c(this.f, contentPainterModifier.f) && Intrinsics.c(this.g, contentPainterModifier.g) && Float.compare(this.h, contentPainterModifier.h) == 0 && Intrinsics.c(this.i, contentPainterModifier.i);
    }

    public final int hashCode() {
        int iB = a.b(this.h, (this.g.hashCode() + ((this.f.hashCode() + (this.e.hashCode() * 31)) * 31)) * 31, 31);
        ColorFilter colorFilter = this.i;
        return iB + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableC0 = measurable.c0(d(j));
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: coil.compose.ContentPainterModifier$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope.h((Placeable.PlacementScope) obj, placeableC0, 0, 0);
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.e.getJ() == 9205357640488583168L) {
            return intrinsicMeasurable.a0(i);
        }
        int iA0 = intrinsicMeasurable.a0(Constraints.g(d(ConstraintsKt.b(0, i, 7))));
        return Math.max(MathKt.b(Size.d(c(SizeKt.a(iA0, i)))), iA0);
    }

    public final String toString() {
        return "ContentPainterModifier(painter=" + this.e + ", alignment=" + this.f + ", contentScale=" + this.g + ", alpha=" + this.h + ", colorFilter=" + this.i + ')';
    }
}
