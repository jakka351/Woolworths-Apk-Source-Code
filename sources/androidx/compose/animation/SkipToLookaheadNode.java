package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SkipToLookaheadNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SkipToLookaheadNode extends Modifier.Node implements LayoutModifierNode {
    public Constraints r;
    public long s;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (lookaheadCapablePlaceable.l1() || !AnimationModifierKt.c(this.s)) ? intrinsicMeasurable.T(i) : (int) (this.s & 4294967295L);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (lookaheadCapablePlaceable.l1() || !AnimationModifierKt.c(this.s)) ? intrinsicMeasurable.b0(i) : (int) (this.s >> 32);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (lookaheadCapablePlaceable.l1() || !AnimationModifierKt.c(this.s)) ? intrinsicMeasurable.J(i) : (int) (this.s & 4294967295L);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(final MeasureScope measureScope, Measurable measurable, long j) {
        if (measureScope.l1()) {
            this.r = new Constraints(j);
        }
        Constraints constraints = this.r;
        Intrinsics.e(constraints);
        final Placeable placeableC0 = measurable.c0(constraints.f2197a);
        long j2 = (placeableC0.d << 32) | (placeableC0.e & 4294967295L);
        this.s = j2;
        final long jD = ConstraintsKt.d(j, j2);
        return measureScope.L0((int) (jD >> 32), (int) (jD & 4294967295L), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>(this, placeableC0, jD, measureScope) { // from class: androidx.compose.animation.SkipToLookaheadNode$measure$1
            public final /* synthetic */ MeasureScope h;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: androidx.compose.animation.SkipToLookaheadNode$measure$1$1, reason: invalid class name */
            final class AnonymousClass1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.h = measureScope;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                throw null;
            }
        });
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (lookaheadCapablePlaceable.l1() || !AnimationModifierKt.c(this.s)) ? intrinsicMeasurable.a0(i) : (int) (this.s >> 32);
    }
}
