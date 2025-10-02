package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScopeImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "Companion", "LookaheadDelegateForLayoutModifierNode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final AndroidPaint Y;
    public LayoutModifierNode U;
    public Constraints V;
    public LookaheadDelegate W;
    public ApproachMeasureScopeImpl X;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$Companion;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode;", "Landroidx/compose/ui/node/LookaheadDelegate;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int J(int i) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.U;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.s;
            Intrinsics.e(nodeCoordinator);
            LookaheadDelegate w = nodeCoordinator.getV();
            Intrinsics.e(w);
            return layoutModifierNode.O(this, w, i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int T(int i) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.U;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.s;
            Intrinsics.e(nodeCoordinator);
            LookaheadDelegate w = nodeCoordinator.getV();
            Intrinsics.e(w);
            return layoutModifierNode.M(this, w, i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int a0(int i) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.U;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.s;
            Intrinsics.e(nodeCoordinator);
            LookaheadDelegate w = nodeCoordinator.getV();
            Intrinsics.e(w);
            return layoutModifierNode.o(this, w, i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int b0(int i) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.U;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.s;
            Intrinsics.e(nodeCoordinator);
            LookaheadDelegate w = nodeCoordinator.getV();
            Intrinsics.e(w);
            return layoutModifierNode.N(this, w, i);
        }

        @Override // androidx.compose.ui.layout.Measurable
        public final Placeable c0(long j) {
            v0(j);
            Constraints constraints = new Constraints(j);
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            layoutModifierNodeCoordinator.V = constraints;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.U;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.s;
            Intrinsics.e(nodeCoordinator);
            LookaheadDelegate w = nodeCoordinator.getV();
            Intrinsics.e(w);
            LookaheadDelegate.P0(this, layoutModifierNode.n(this, w, j));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public final int w0(AlignmentLine alignmentLine) {
            int iA = LayoutModifierNodeCoordinatorKt.a(this, alignmentLine);
            this.u.h(iA, alignmentLine);
            return iA;
        }
    }

    static {
        AndroidPaint androidPaintA = AndroidPaint_androidKt.a();
        androidPaintA.d(Color.h);
        androidPaintA.q(1.0f);
        androidPaintA.r(1);
        Y = androidPaintA;
    }

    public LayoutModifierNodeCoordinator(LayoutNode layoutNode, LayoutModifierNode layoutModifierNode) {
        super(layoutNode);
        this.U = layoutModifierNode;
        this.W = layoutNode.m != null ? new LookaheadDelegateForLayoutModifierNode() : null;
        this.X = (layoutModifierNode.getD().f & 512) != 0 ? new ApproachMeasureScopeImpl(this, (ApproachLayoutModifierNode) layoutModifierNode) : null;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int J(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.X;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachLayoutModifierNode = approachMeasureScopeImpl.e;
            NodeCoordinator nodeCoordinator = this.s;
            Intrinsics.e(nodeCoordinator);
            return approachLayoutModifierNode.B0(approachMeasureScopeImpl, nodeCoordinator, i);
        }
        LayoutModifierNode layoutModifierNode = this.U;
        NodeCoordinator nodeCoordinator2 = this.s;
        Intrinsics.e(nodeCoordinator2);
        return layoutModifierNode.O(this, nodeCoordinator2, i);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void L1(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.s;
        Intrinsics.e(nodeCoordinator);
        nodeCoordinator.V0(canvas, graphicsLayer);
        if (LayoutNodeKt.a(this.p).getShowLayoutBounds()) {
            long j = this.f;
            canvas.k(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, Y);
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int T(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.X;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachLayoutModifierNode = approachMeasureScopeImpl.e;
            NodeCoordinator nodeCoordinator = this.s;
            Intrinsics.e(nodeCoordinator);
            return approachLayoutModifierNode.F0(approachMeasureScopeImpl, nodeCoordinator, i);
        }
        LayoutModifierNode layoutModifierNode = this.U;
        NodeCoordinator nodeCoordinator2 = this.s;
        Intrinsics.e(nodeCoordinator2);
        return layoutModifierNode.M(this, nodeCoordinator2, i);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void Z0() {
        if (this.W == null) {
            this.W = new LookaheadDelegateForLayoutModifierNode();
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int a0(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.X;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachLayoutModifierNode = approachMeasureScopeImpl.e;
            NodeCoordinator nodeCoordinator = this.s;
            Intrinsics.e(nodeCoordinator);
            return approachLayoutModifierNode.s1(approachMeasureScopeImpl, nodeCoordinator, i);
        }
        LayoutModifierNode layoutModifierNode = this.U;
        NodeCoordinator nodeCoordinator2 = this.s;
        Intrinsics.e(nodeCoordinator2);
        return layoutModifierNode.o(this, nodeCoordinator2, i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int b0(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.X;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachLayoutModifierNode = approachMeasureScopeImpl.e;
            NodeCoordinator nodeCoordinator = this.s;
            Intrinsics.e(nodeCoordinator);
            return approachLayoutModifierNode.A0(approachMeasureScopeImpl, nodeCoordinator, i);
        }
        LayoutModifierNode layoutModifierNode = this.U;
        NodeCoordinator nodeCoordinator2 = this.s;
        Intrinsics.e(nodeCoordinator2);
        return layoutModifierNode.N(this, nodeCoordinator2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    @Override // androidx.compose.ui.layout.Measurable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.layout.Placeable c0(long r8) {
        /*
            r7 = this;
            boolean r0 = r7.r
            if (r0 == 0) goto L13
            androidx.compose.ui.unit.Constraints r8 = r7.V
            if (r8 == 0) goto Lb
            long r8 = r8.f2197a
            goto L13
        Lb:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Lookahead constraints cannot be null in approach pass."
            r8.<init>(r9)
            throw r8
        L13:
            r7.v0(r8)
            androidx.compose.ui.layout.ApproachMeasureScopeImpl r0 = r7.X
            if (r0 == 0) goto L9e
            androidx.compose.ui.layout.ApproachLayoutModifierNode r1 = r0.e
            long r2 = r0.t0()
            boolean r2 = r1.w1(r2)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L36
            androidx.compose.ui.unit.Constraints r2 = r7.V
            if (r2 != 0) goto L2d
            goto L36
        L2d:
            long r5 = r2.f2197a
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 == 0) goto L34
            goto L36
        L34:
            r2 = r4
            goto L37
        L36:
            r2 = r3
        L37:
            r0.f = r2
            if (r2 != 0) goto L42
            androidx.compose.ui.node.NodeCoordinator r2 = r7.s
            kotlin.jvm.internal.Intrinsics.e(r2)
            r2.r = r3
        L42:
            androidx.compose.ui.node.NodeCoordinator r2 = r7.s
            kotlin.jvm.internal.Intrinsics.e(r2)
            androidx.compose.ui.layout.MeasureResult r8 = r1.s0(r0, r2, r8)
            androidx.compose.ui.node.NodeCoordinator r9 = r7.s
            kotlin.jvm.internal.Intrinsics.e(r9)
            r9.r = r4
            int r9 = r8.getB()
            androidx.compose.ui.node.LookaheadDelegate r1 = r7.W
            kotlin.jvm.internal.Intrinsics.e(r1)
            int r1 = r1.d
            if (r9 != r1) goto L6d
            int r9 = r8.getC()
            androidx.compose.ui.node.LookaheadDelegate r1 = r7.W
            kotlin.jvm.internal.Intrinsics.e(r1)
            int r1 = r1.e
            if (r9 != r1) goto L6d
            goto L6e
        L6d:
            r3 = r4
        L6e:
            boolean r9 = r0.f
            if (r9 != 0) goto La9
            androidx.compose.ui.node.NodeCoordinator r9 = r7.s
            kotlin.jvm.internal.Intrinsics.e(r9)
            long r0 = r9.f
            androidx.compose.ui.node.NodeCoordinator r9 = r7.s
            kotlin.jvm.internal.Intrinsics.e(r9)
            androidx.compose.ui.node.LookaheadDelegate r9 = r9.getV()
            if (r9 == 0) goto L8e
            long r4 = r9.R0()
            androidx.compose.ui.unit.IntSize r9 = new androidx.compose.ui.unit.IntSize
            r9.<init>(r4)
            goto L8f
        L8e:
            r9 = 0
        L8f:
            boolean r9 = androidx.compose.ui.unit.IntSize.a(r0, r9)
            if (r9 == 0) goto La9
            if (r3 != 0) goto La9
            androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1 r9 = new androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1
            r9.<init>(r7)
            r8 = r9
            goto La9
        L9e:
            androidx.compose.ui.node.LayoutModifierNode r0 = r7.U
            androidx.compose.ui.node.NodeCoordinator r1 = r7.s
            kotlin.jvm.internal.Intrinsics.e(r1)
            androidx.compose.ui.layout.MeasureResult r8 = r0.n(r7, r1, r8)
        La9:
            r7.U1(r8)
            r7.G1()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutModifierNodeCoordinator.c0(long):androidx.compose.ui.layout.Placeable");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g2() {
        /*
            r7 = this;
            boolean r0 = r7.j
            if (r0 == 0) goto L5
            return
        L5:
            r7.H1()
            androidx.compose.ui.layout.ApproachMeasureScopeImpl r0 = r7.X
            r1 = 0
            if (r0 == 0) goto L66
            androidx.compose.ui.layout.ApproachLayoutModifierNode r2 = r0.e
            androidx.compose.ui.node.LookaheadDelegate r3 = r7.W
            kotlin.jvm.internal.Intrinsics.e(r3)
            androidx.compose.ui.layout.LookaheadLayoutCoordinates r3 = r3.s
            androidx.compose.ui.layout.Placeable$PlacementScope r4 = r7.l
            boolean r2 = r2.e2(r4, r3)
            if (r2 != 0) goto L5e
            boolean r0 = r0.f
            if (r0 != 0) goto L5e
            long r2 = r7.f
            androidx.compose.ui.node.LookaheadDelegate r0 = r7.W
            r4 = 0
            if (r0 == 0) goto L33
            long r5 = r0.R0()
            androidx.compose.ui.unit.IntSize r0 = new androidx.compose.ui.unit.IntSize
            r0.<init>(r5)
            goto L34
        L33:
            r0 = r4
        L34:
            boolean r0 = androidx.compose.ui.unit.IntSize.a(r2, r0)
            if (r0 == 0) goto L5e
            androidx.compose.ui.node.NodeCoordinator r0 = r7.s
            kotlin.jvm.internal.Intrinsics.e(r0)
            long r2 = r0.f
            androidx.compose.ui.node.NodeCoordinator r0 = r7.s
            kotlin.jvm.internal.Intrinsics.e(r0)
            androidx.compose.ui.node.LookaheadDelegate r0 = r0.getV()
            if (r0 == 0) goto L56
            long r4 = r0.R0()
            androidx.compose.ui.unit.IntSize r0 = new androidx.compose.ui.unit.IntSize
            r0.<init>(r4)
            r4 = r0
        L56:
            boolean r0 = androidx.compose.ui.unit.IntSize.a(r2, r4)
            if (r0 == 0) goto L5e
            r0 = 1
            goto L5f
        L5e:
            r0 = r1
        L5f:
            androidx.compose.ui.node.NodeCoordinator r2 = r7.s
            kotlin.jvm.internal.Intrinsics.e(r2)
            r2.q = r0
        L66:
            androidx.compose.ui.layout.MeasureResult r0 = r7.D0()
            r0.q()
            androidx.compose.ui.node.NodeCoordinator r0 = r7.s
            kotlin.jvm.internal.Intrinsics.e(r0)
            r0.q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutModifierNodeCoordinator.g2():void");
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* renamed from: h1, reason: from getter */
    public final LookaheadDelegate getV() {
        return this.W;
    }

    public final void h2(LayoutModifierNode layoutModifierNode) {
        if (!layoutModifierNode.equals(this.U)) {
            if ((layoutModifierNode.getD().f & 512) != 0) {
                ApproachLayoutModifierNode approachLayoutModifierNode = (ApproachLayoutModifierNode) layoutModifierNode;
                ApproachMeasureScopeImpl approachMeasureScopeImpl = this.X;
                if (approachMeasureScopeImpl != null) {
                    approachMeasureScopeImpl.e = approachLayoutModifierNode;
                } else {
                    approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, approachLayoutModifierNode);
                }
                this.X = approachMeasureScopeImpl;
            } else {
                this.X = null;
            }
        }
        this.U = layoutModifierNode;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final Modifier.Node j1() {
        return this.U.getD();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    public final void n0(long j, float f, GraphicsLayer graphicsLayer) {
        super.n0(j, f, graphicsLayer);
        g2();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    public final void s0(long j, float f, Function1 function1) {
        super.s0(j, f, function1);
        g2();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int w0(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = this.W;
        if (lookaheadDelegate == null) {
            return LayoutModifierNodeCoordinatorKt.a(this, alignmentLine);
        }
        MutableObjectIntMap mutableObjectIntMap = lookaheadDelegate.u;
        int iA = mutableObjectIntMap.a(alignmentLine);
        if (iA >= 0) {
            return mutableObjectIntMap.c[iA];
        }
        return Integer.MIN_VALUE;
    }
}
