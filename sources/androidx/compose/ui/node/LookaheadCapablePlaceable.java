package androidx.compose.ui.node;

import androidx.collection.MutableObjectFloatMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.node.LayoutNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/MeasureScopeWithLayoutNode;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode, MotionReferencePlacementDelegate {
    public static final Function1 o = null;
    public boolean i;
    public boolean j;
    public boolean k;
    public final Placeable.PlacementScope l = PlaceableKt.a(this);
    public MutableObjectFloatMap m;
    public MutableObjectFloatMap n;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/node/PlaceableResult;", "", "onCommitAffectingRuler", "Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public static void J0(NodeCoordinator nodeCoordinator) {
        LayoutNodeAlignmentLines layoutNodeAlignmentLines;
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.s;
        LayoutNode layoutNode = nodeCoordinator.p;
        if (!Intrinsics.c(nodeCoordinator2 != null ? nodeCoordinator2.p : null, layoutNode)) {
            layoutNode.L.p.B.g();
            return;
        }
        AlignmentLinesOwner alignmentLinesOwnerO = layoutNode.L.p.O();
        if (alignmentLinesOwnerO == null || (layoutNodeAlignmentLines = ((MeasurePassDelegate) alignmentLinesOwnerO).B) == null) {
            return;
        }
        layoutNodeAlignmentLines.g();
    }

    public abstract LookaheadCapablePlaceable A0();

    public abstract LayoutCoordinates B0();

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult B1(final int i, final int i2, final Map map, final Function1 function1) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            InlineClassHelperKt.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$layout$1
            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: getHeight, reason: from getter */
            public final int getB() {
                return i2;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: getWidth, reason: from getter */
            public final int getF1922a() {
                return i;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: o, reason: from getter */
            public final Map getC() {
                return map;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final Function1 p() {
                return null;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void q() {
                function1.invoke(this.l);
            }
        };
    }

    public abstract boolean C0();

    public abstract MeasureResult D0();

    public abstract LookaheadCapablePlaceable E0();

    /* renamed from: F0 */
    public abstract long getC();

    @Override // androidx.compose.ui.node.MeasureScopeWithLayoutNode
    /* renamed from: N0 */
    public abstract LayoutNode getP();

    public abstract void O0();

    @Override // androidx.compose.ui.layout.Measured
    public final int d0(AlignmentLine alignmentLine) {
        int iW0;
        if (C0() && (iW0 = w0(alignmentLine)) != Integer.MIN_VALUE) {
            return iW0 + ((int) (alignmentLine instanceof VerticalAlignmentLine ? this.h >> 32 : this.h & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean l1() {
        return false;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public final void w(boolean z) {
        LookaheadCapablePlaceable lookaheadCapablePlaceableE0 = E0();
        LayoutNode p = lookaheadCapablePlaceableE0 != null ? lookaheadCapablePlaceableE0.getP() : null;
        if (Intrinsics.c(p, getP())) {
            this.i = z;
            return;
        }
        if ((p != null ? p.L.d : null) != LayoutNode.LayoutState.f) {
            if ((p != null ? p.L.d : null) != LayoutNode.LayoutState.g) {
                return;
            }
        }
        this.i = z;
    }

    public abstract int w0(AlignmentLine alignmentLine);

    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x0(final androidx.compose.ui.node.PlaceableResult r15) {
        /*
            r14 = this;
            boolean r0 = r14.k
            if (r0 == 0) goto L5
            goto Ld
        L5:
            androidx.compose.ui.layout.MeasureResult r0 = r15.d
            kotlin.jvm.functions.Function1 r0 = r0.p()
            if (r0 != 0) goto Le
        Ld:
            return
        Le:
            androidx.collection.MutableObjectFloatMap r0 = r14.n
            if (r0 != 0) goto L19
            androidx.collection.MutableObjectFloatMap r0 = new androidx.collection.MutableObjectFloatMap
            r0.<init>()
            r14.n = r0
        L19:
            androidx.collection.MutableObjectFloatMap r1 = r14.m
            if (r1 != 0) goto L24
            androidx.collection.MutableObjectFloatMap r1 = new androidx.collection.MutableObjectFloatMap
            r1.<init>()
            r14.m = r1
        L24:
            r0.f(r1)
            r1.c()
            androidx.compose.ui.node.LayoutNode r2 = r14.getP()
            androidx.compose.ui.node.Owner r2 = r2.s
            if (r2 == 0) goto L42
            androidx.compose.ui.node.OwnerSnapshotObserver r2 = r2.getSnapshotObserver()
            if (r2 == 0) goto L42
            androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$3 r3 = new androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$3
            r3.<init>()
            androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1 r4 = androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1.h
            r2.b(r15, r4, r3)
        L42:
            java.lang.Object[] r15 = r1.b
            long[] r1 = r1.f690a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto La2
            r3 = 0
            r4 = r3
        L4d:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L9d
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L67:
            if (r9 >= r7) goto L9b
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L97
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            androidx.compose.ui.layout.Ruler r10 = (androidx.compose.ui.layout.Ruler) r10
            boolean r11 = r0.a(r10)
            if (r11 != 0) goto L97
            androidx.compose.ui.node.LookaheadCapablePlaceable r11 = r14.E0()
            if (r11 == 0) goto L97
        L85:
            androidx.collection.MutableObjectFloatMap r12 = r11.m
            if (r12 == 0) goto L91
            boolean r12 = r12.a(r10)
            r13 = 1
            if (r12 != r13) goto L91
            goto L97
        L91:
            androidx.compose.ui.node.LookaheadCapablePlaceable r11 = r11.E0()
            if (r11 != 0) goto L85
        L97:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L67
        L9b:
            if (r7 != r8) goto La2
        L9d:
            if (r4 == r2) goto La2
            int r4 = r4 + 1
            goto L4d
        La2:
            r0.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.x0(androidx.compose.ui.node.PlaceableResult):void");
    }
}
