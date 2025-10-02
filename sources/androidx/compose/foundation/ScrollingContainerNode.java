package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.ComputedProvidableCompositionLocal;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/ScrollingContainerNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class ScrollingContainerNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    public boolean A;
    public OverscrollEffect B;
    public ScrollableNode C;
    public DelegatableNode D;
    public OverscrollFactory E;
    public OverscrollEffect F;
    public boolean G;
    public ScrollableState t;
    public Orientation u;
    public boolean v;
    public boolean w;
    public FlingBehavior x;
    public MutableInteractionSource y;
    public BringIntoViewSpec z;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public final void j1() {
        boolean zW2 = w2();
        if (this.G != zW2) {
            this.G = zW2;
            ScrollableState scrollableState = this.t;
            Orientation orientation = this.u;
            boolean z = this.A;
            OverscrollEffect overscrollEffect = z ? this.F : this.B;
            x2(overscrollEffect, this.z, this.x, orientation, scrollableState, this.y, z, this.v, this.w);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        this.G = w2();
        v2();
        if (this.C == null) {
            ScrollableState scrollableState = this.t;
            OverscrollEffect overscrollEffect = this.A ? this.F : this.B;
            ScrollableNode scrollableNode = new ScrollableNode(overscrollEffect, this.z, this.x, this.u, scrollableState, this.y, this.v, this.G);
            s2(scrollableNode);
            this.C = scrollableNode;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        DelegatableNode delegatableNode = this.D;
        if (delegatableNode != null) {
            t2(delegatableNode);
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void o1() {
        OverscrollFactory overscrollFactory = (OverscrollFactory) CompositionLocalConsumerModifierNodeKt.a(this, OverscrollKt.f844a);
        if (Intrinsics.c(overscrollFactory, this.E)) {
            return;
        }
        this.E = overscrollFactory;
        this.F = null;
        DelegatableNode delegatableNode = this.D;
        if (delegatableNode != null) {
            t2(delegatableNode);
        }
        this.D = null;
        v2();
        ScrollableNode scrollableNode = this.C;
        if (scrollableNode != null) {
            ScrollableState scrollableState = this.t;
            Orientation orientation = this.u;
            OverscrollEffect overscrollEffect = this.A ? this.F : this.B;
            scrollableNode.E2(overscrollEffect, this.z, this.x, orientation, scrollableState, this.y, this.v, this.G);
        }
    }

    public final void v2() {
        DelegatableNode delegatableNode = this.D;
        if (delegatableNode != null) {
            if (delegatableNode.getD().q) {
                return;
            }
            s2(delegatableNode);
            return;
        }
        if (this.A) {
            ObserverModifierNodeKt.a(this, new Function0<Unit>() { // from class: androidx.compose.foundation.ScrollingContainerNode$attachOverscrollNodeIfNeeded$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ComputedProvidableCompositionLocal computedProvidableCompositionLocal = OverscrollKt.f844a;
                    ScrollingContainerNode scrollingContainerNode = this.h;
                    OverscrollFactory overscrollFactory = (OverscrollFactory) CompositionLocalConsumerModifierNodeKt.a(scrollingContainerNode, computedProvidableCompositionLocal);
                    scrollingContainerNode.E = overscrollFactory;
                    scrollingContainerNode.F = overscrollFactory != null ? overscrollFactory.a() : null;
                    return Unit.f24250a;
                }
            });
        }
        OverscrollEffect overscrollEffect = this.A ? this.F : this.B;
        if (overscrollEffect != null) {
            DelegatableNode delegatableNodeI = overscrollEffect.i();
            if (delegatableNodeI.getD().q) {
                return;
            }
            s2(delegatableNodeI);
            this.D = delegatableNodeI;
        }
    }

    public final boolean w2() {
        LayoutDirection layoutDirection = LayoutDirection.d;
        if (this.q) {
            layoutDirection = DelegatableNodeKt.g(this).E;
        }
        Orientation orientation = this.u;
        boolean z = this.w;
        return (layoutDirection != LayoutDirection.e || orientation == Orientation.d) ? !z : z;
    }

    public final void x2(OverscrollEffect overscrollEffect, BringIntoViewSpec bringIntoViewSpec, FlingBehavior flingBehavior, Orientation orientation, ScrollableState scrollableState, MutableInteractionSource mutableInteractionSource, boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.t = scrollableState;
        this.u = orientation;
        boolean z5 = true;
        if (this.A != z) {
            this.A = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (Intrinsics.c(this.B, overscrollEffect)) {
            z5 = false;
        } else {
            this.B = overscrollEffect;
        }
        if (z4 || (z5 && !z)) {
            DelegatableNode delegatableNode = this.D;
            if (delegatableNode != null) {
                t2(delegatableNode);
            }
            this.D = null;
            v2();
        }
        this.v = z2;
        this.w = z3;
        this.x = flingBehavior;
        this.y = mutableInteractionSource;
        this.z = bringIntoViewSpec;
        boolean zW2 = w2();
        this.G = zW2;
        ScrollableNode scrollableNode = this.C;
        if (scrollableNode != null) {
            scrollableNode.E2(this.A ? this.F : this.B, bringIntoViewSpec, flingBehavior, orientation, scrollableState, mutableInteractionSource, z2, zW2);
        }
    }
}
