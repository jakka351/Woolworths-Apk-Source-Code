package androidx.compose.foundation;

import androidx.camera.core.impl.b;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {
    public Job u;
    public GraphicsLayer v;
    public final MutableIntState r = SnapshotIntStateKt.a(0);
    public final MutableIntState s = SnapshotIntStateKt.a(0);
    public final MutableState t = SnapshotStateKt.f(Boolean.FALSE);
    public final MutableState w = SnapshotStateKt.f(null);
    public final MutableState x = SnapshotStateKt.f(new MarqueeAnimationMode());
    public final Animatable y = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
    public final State z = SnapshotStateKt.d(new Function0<Integer>() { // from class: androidx.compose.foundation.MarqueeModifierNode$spacingPx$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            MarqueeModifierNode marqueeModifierNode = this.h;
            Density density = DelegatableNodeKt.g(marqueeModifierNode).D;
            ((SnapshotMutableIntStateImpl) marqueeModifierNode.r).d();
            ((SnapshotMutableIntStateImpl) marqueeModifierNode.s).d();
            throw null;
        }
    });

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutDirection layoutDirection = LayoutDirection.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(final LayoutNodeDrawScope layoutNodeDrawScope) {
        long j;
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.d;
        Animatable animatable = this.y;
        float fFloatValue = ((Number) animatable.f()).floatValue() * s2();
        float fS2 = s2();
        MutableIntState mutableIntState = this.s;
        MutableIntState mutableIntState2 = this.r;
        boolean z = fS2 != 1.0f ? ((Number) animatable.f()).floatValue() < ((float) ((SnapshotMutableIntStateImpl) mutableIntState).d()) : ((Number) animatable.f()).floatValue() < ((float) ((SnapshotMutableIntStateImpl) mutableIntState2).d());
        boolean z2 = s2() != 1.0f ? ((Number) animatable.f()).floatValue() > ((float) t2()) : ((Number) animatable.f()).floatValue() > ((float) ((((SnapshotMutableIntStateImpl) mutableIntState2).d() + t2()) - ((SnapshotMutableIntStateImpl) mutableIntState).d()));
        float fD = s2() == 1.0f ? ((SnapshotMutableIntStateImpl) mutableIntState2).d() + t2() : (-((SnapshotMutableIntStateImpl) mutableIntState2).d()) - t2();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (canvasDrawScope.h() & 4294967295L));
        GraphicsLayer graphicsLayer = this.v;
        if (graphicsLayer != null) {
            j = 4294967295L;
            layoutNodeDrawScope.n((MathKt.b(fIntBitsToFloat) & 4294967295L) | (((SnapshotMutableIntStateImpl) mutableIntState2).d() << 32), graphicsLayer, new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.MarqueeModifierNode$draw$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    layoutNodeDrawScope.Q0();
                    return Unit.f24250a;
                }
            });
        } else {
            j = 4294967295L;
        }
        float fD2 = fFloatValue + ((SnapshotMutableIntStateImpl) mutableIntState).d();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (canvasDrawScope.h() & j));
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.e;
        long jD = canvasDrawScope$drawContext$1.d();
        canvasDrawScope$drawContext$1.a().save();
        try {
            canvasDrawScope$drawContext$1.f1798a.b(fFloatValue, BitmapDescriptorFactory.HUE_RED, fD2, fIntBitsToFloat2, 1);
            GraphicsLayer graphicsLayer2 = this.v;
            if (graphicsLayer2 != null) {
                if (z) {
                    GraphicsLayerKt.a(layoutNodeDrawScope, graphicsLayer2);
                }
                if (z2) {
                    canvasDrawScope.e.f1798a.f(fD, BitmapDescriptorFactory.HUE_RED);
                    try {
                        GraphicsLayerKt.a(layoutNodeDrawScope, graphicsLayer2);
                        canvasDrawScope.e.f1798a.f(-fD, -0.0f);
                    } finally {
                    }
                }
            } else {
                if (z) {
                    layoutNodeDrawScope.Q0();
                }
                if (z2) {
                    canvasDrawScope.e.f1798a.f(fD, BitmapDescriptorFactory.HUE_RED);
                    try {
                        layoutNodeDrawScope.Q0();
                        canvasDrawScope.e.f1798a.f(-fD, -0.0f);
                    } finally {
                    }
                }
            }
            b.C(canvasDrawScope$drawContext$1, jD);
        } catch (Throwable th) {
            b.C(canvasDrawScope$drawContext$1, jD);
            throw th;
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void J(FocusStateImpl focusStateImpl) {
        ((SnapshotMutableStateImpl) this.t).setValue(Boolean.valueOf(focusStateImpl.b()));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.T(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.b0(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.J(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        GraphicsLayer graphicsLayer = this.v;
        GraphicsContext graphicsContext = DelegatableNodeKt.h(this).getGraphicsContext();
        if (graphicsLayer != null) {
            graphicsContext.b(graphicsLayer);
        }
        this.v = graphicsContext.a();
        u2();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        Job job = this.u;
        if (job != null) {
            ((JobSupport) job).cancel((CancellationException) null);
        }
        this.u = null;
        GraphicsLayer graphicsLayer = this.v;
        if (graphicsLayer != null) {
            DelegatableNodeKt.h(this).getGraphicsContext().b(graphicsLayer);
            this.v = null;
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableC0 = measurable.c0(Constraints.a(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        int iG = ConstraintsKt.g(placeableC0.d, j);
        SnapshotMutableIntStateImpl snapshotMutableIntStateImpl = (SnapshotMutableIntStateImpl) this.s;
        snapshotMutableIntStateImpl.i(iG);
        ((SnapshotMutableIntStateImpl) this.r).i(placeableC0.d);
        return measureScope.L0(snapshotMutableIntStateImpl.d(), placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.MarqueeModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                MarqueeModifierNode marqueeModifierNode = this;
                Placeable.PlacementScope.m(placementScope, placeableC0, MathKt.b((-((Number) marqueeModifierNode.y.f()).floatValue()) * marqueeModifierNode.s2()), 0, null, 12);
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return 0;
    }

    public final float s2() {
        float fSignum = Math.signum(BitmapDescriptorFactory.HUE_RED);
        int iOrdinal = DelegatableNodeKt.g(this).E.ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = -1;
        }
        return fSignum * i;
    }

    public final int t2() {
        return ((Number) this.z.getD()).intValue();
    }

    public final void u2() {
        Job job = this.u;
        if (job != null) {
            ((JobSupport) job).cancel((CancellationException) null);
        }
        if (this.q) {
            this.u = BuildersKt.c(g2(), null, null, new MarqueeModifierNode$restartAnimation$1(job, this, null), 3);
        }
    }
}
