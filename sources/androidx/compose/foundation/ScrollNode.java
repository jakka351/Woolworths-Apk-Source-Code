package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/ScrollNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScrollNode extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    public ScrollState r;
    public boolean s;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!this.s) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.T(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.s) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.b0(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!this.s) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.J(i);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void b2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.u(semanticsPropertyReceiver);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.foundation.ScrollNode$applySemantics$accessibilityScrollState$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(((SnapshotMutableIntStateImpl) this.h.r.f848a).d());
            }
        }, new Function0<Float>() { // from class: androidx.compose.foundation.ScrollNode$applySemantics$accessibilityScrollState$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(((SnapshotMutableIntStateImpl) this.h.r.d).d());
            }
        }, false);
        if (this.s) {
            SemanticsPropertiesKt.w(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.m(semanticsPropertyReceiver, scrollAxisRange);
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        CheckScrollableContainerConstraintsKt.a(j, this.s ? Orientation.d : Orientation.e);
        final Placeable placeableC0 = measurable.c0(Constraints.a(j, 0, this.s ? Constraints.h(j) : Integer.MAX_VALUE, 0, this.s ? Integer.MAX_VALUE : Constraints.g(j), 5));
        int i = placeableC0.d;
        int iH = Constraints.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = placeableC0.e;
        int iG = Constraints.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        final int i3 = placeableC0.e - i2;
        int i4 = placeableC0.d - i;
        if (!this.s) {
            i3 = i4;
        }
        ScrollState scrollState = this.r;
        MutableIntState mutableIntState = scrollState.f848a;
        ((SnapshotMutableIntStateImpl) scrollState.d).i(i3);
        Snapshot snapshotA = Snapshot.Companion.a();
        Function1 e = snapshotA != null ? snapshotA.getE() : null;
        Snapshot snapshotB = Snapshot.Companion.b(snapshotA);
        try {
            if (((SnapshotMutableIntStateImpl) mutableIntState).d() > i3) {
                ((SnapshotMutableIntStateImpl) mutableIntState).i(i3);
            }
            Snapshot.Companion.e(snapshotA, snapshotB, e);
            ((SnapshotMutableIntStateImpl) this.r.b).i(this.s ? i2 : i);
            return measureScope.L0(i, i2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.ScrollNode$measure$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                    ScrollNode scrollNode = this.h;
                    int iD = ((SnapshotMutableIntStateImpl) scrollNode.r.f848a).d();
                    if (iD < 0) {
                        iD = 0;
                    }
                    int i5 = i3;
                    if (iD > i5) {
                        iD = i5;
                    }
                    final int i6 = -iD;
                    boolean z = scrollNode.s;
                    final int i7 = z ? 0 : i6;
                    if (!z) {
                        i6 = 0;
                    }
                    final Placeable placeable = placeableC0;
                    Function1<Placeable.PlacementScope, Unit> function1 = new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.ScrollNode$measure$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Placeable.PlacementScope.i((Placeable.PlacementScope) obj2, placeable, i7, i6);
                            return Unit.f24250a;
                        }
                    };
                    placementScope.f1892a = true;
                    function1.invoke(placementScope);
                    placementScope.f1892a = false;
                    return Unit.f24250a;
                }
            });
        } catch (Throwable th) {
            Snapshot.Companion.e(snapshotA, snapshotB, e);
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.s) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.a0(i);
    }
}
