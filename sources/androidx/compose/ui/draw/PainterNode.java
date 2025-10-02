package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    public Painter r;
    public boolean s;
    public Alignment t;
    public ContentScale u;
    public float v;
    public ColorFilter w;

    public static boolean t2(long j) {
        return !Size.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean u2(long j) {
        return !Size.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.d;
        long l = this.r.getJ();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(u2(l) ? Float.intBitsToFloat((int) (l >> 32)) : Float.intBitsToFloat((int) (canvasDrawScope.h() >> 32))) << 32) | (Float.floatToRawIntBits(t2(l) ? Float.intBitsToFloat((int) (l & 4294967295L)) : Float.intBitsToFloat((int) (canvasDrawScope.h() & 4294967295L))) & 4294967295L);
        long jA = (Float.intBitsToFloat((int) (canvasDrawScope.h() >> 32)) == BitmapDescriptorFactory.HUE_RED || Float.intBitsToFloat((int) (canvasDrawScope.h() & 4294967295L)) == BitmapDescriptorFactory.HUE_RED) ? 0L : ScaleFactorKt.a(jFloatToRawIntBits, this.u.a(jFloatToRawIntBits, canvasDrawScope.h()));
        long jA2 = this.t.a((Math.round(Float.intBitsToFloat((int) (jA >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jA & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (canvasDrawScope.h() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (canvasDrawScope.h() & 4294967295L))) & 4294967295L), layoutNodeDrawScope.getLayoutDirection());
        float f = (int) (jA2 >> 32);
        float f2 = (int) (jA2 & 4294967295L);
        canvasDrawScope.e.f1798a.f(f, f2);
        try {
            this.r.e(layoutNodeDrawScope, jA, this.v, this.w);
            canvasDrawScope.e.f1798a.f(-f, -f2);
            layoutNodeDrawScope.Q0();
        } catch (Throwable th) {
            canvasDrawScope.e.f1798a.f(-f, -f2);
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!s2()) {
            return intrinsicMeasurable.T(i);
        }
        long jV2 = v2(ConstraintsKt.b(i, 0, 13));
        return Math.max(Constraints.i(jV2), intrinsicMeasurable.T(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!s2()) {
            return intrinsicMeasurable.b0(i);
        }
        long jV2 = v2(ConstraintsKt.b(0, i, 7));
        return Math.max(Constraints.j(jV2), intrinsicMeasurable.b0(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!s2()) {
            return intrinsicMeasurable.J(i);
        }
        long jV2 = v2(ConstraintsKt.b(i, 0, 13));
        return Math.max(Constraints.i(jV2), intrinsicMeasurable.J(i));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableC0 = measurable.c0(v2(j));
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
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

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!s2()) {
            return intrinsicMeasurable.a0(i);
        }
        long jV2 = v2(ConstraintsKt.b(0, i, 7));
        return Math.max(Constraints.j(jV2), intrinsicMeasurable.a0(i));
    }

    public final boolean s2() {
        return this.s && this.r.getJ() != 9205357640488583168L;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.r + ", sizeToIntrinsics=" + this.s + ", alignment=" + this.t + ", alpha=" + this.v + ", colorFilter=" + this.w + ')';
    }

    public final long v2(long j) {
        boolean z = false;
        boolean z2 = Constraints.d(j) && Constraints.c(j);
        if (Constraints.f(j) && Constraints.e(j)) {
            z = true;
        }
        if ((!s2() && z2) || z) {
            return Constraints.a(j, Constraints.h(j), 0, Constraints.g(j), 0, 10);
        }
        long l = this.r.getJ();
        int iRound = u2(l) ? Math.round(Float.intBitsToFloat((int) (l >> 32))) : Constraints.j(j);
        int iRound2 = t2(l) ? Math.round(Float.intBitsToFloat((int) (l & 4294967295L))) : Constraints.i(j);
        int iG = ConstraintsKt.g(iRound, j);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(ConstraintsKt.f(iRound2, j)) & 4294967295L) | (Float.floatToRawIntBits(iG) << 32);
        if (s2()) {
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(!u2(this.r.getJ()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.r.getJ() >> 32))) << 32) | (Float.floatToRawIntBits(!t2(this.r.getJ()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.r.getJ() & 4294967295L))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == BitmapDescriptorFactory.HUE_RED || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == BitmapDescriptorFactory.HUE_RED) ? 0L : ScaleFactorKt.a(jFloatToRawIntBits2, this.u.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return Constraints.a(j, ConstraintsKt.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, ConstraintsKt.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }
}
