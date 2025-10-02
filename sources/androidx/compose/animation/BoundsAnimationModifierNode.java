package androidx.compose.animation;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@ExperimentalSharedTransitionApi
@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/BoundsAnimationModifierNode;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BoundsAnimationModifierNode extends Modifier.Node implements ApproachLayoutModifierNode {
    public final BoundsTransformDeferredAnimation r = new BoundsTransformDeferredAnimation();

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public final boolean e2(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        g2();
        this.r.getClass();
        if (placementScope.b() == null) {
            return !r2.a();
        }
        throw null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public final MeasureResult s0(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
        BoundsTransformDeferredAnimation boundsTransformDeferredAnimation = this.r;
        long jE = boundsTransformDeferredAnimation.d;
        if (jE == 9205357640488583168L) {
            jE = IntSizeKt.d(approachMeasureScope.t0());
        }
        Rect rect = boundsTransformDeferredAnimation.a() ? null : (Rect) ((SnapshotMutableStateImpl) boundsTransformDeferredAnimation.e).getD();
        if (rect != null) {
            jE = rect.e();
        }
        IntSizeKt.c(jE);
        throw null;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public final boolean w1(long j) {
        long jD = IntSizeKt.d(j);
        BoundsTransformDeferredAnimation boundsTransformDeferredAnimation = this.r;
        if (boundsTransformDeferredAnimation.f717a != 9205357640488583168L && !IntSize.b(IntSizeKt.c(jD), IntSizeKt.c(boundsTransformDeferredAnimation.f717a))) {
            boundsTransformDeferredAnimation.b = true;
        }
        boundsTransformDeferredAnimation.f717a = jD;
        if (boundsTransformDeferredAnimation.d == 9205357640488583168L) {
            boundsTransformDeferredAnimation.d = jD;
        }
        return !boundsTransformDeferredAnimation.a();
    }
}
