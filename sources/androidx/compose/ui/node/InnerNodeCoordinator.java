package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "Companion", "LookaheadDelegateImpl", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final AndroidPaint W;
    public final TailModifierNode U;
    public LookaheadDelegate V;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$Companion;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl;", "Landroidx/compose/ui/node/LookaheadDelegate;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public final class LookaheadDelegateImpl extends LookaheadDelegate {
        public LookaheadDelegateImpl(InnerNodeCoordinator innerNodeCoordinator) {
            super(innerNodeCoordinator);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int J(int i) {
            IntrinsicsPolicy intrinsicsPolicyJ = this.p.p.J();
            MeasurePolicy measurePolicyA = intrinsicsPolicyJ.a();
            LayoutNode layoutNode = intrinsicsPolicyJ.f1911a;
            return measurePolicyA.f(layoutNode.K.c, layoutNode.B(), i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        public final void S0() {
            LookaheadPassDelegate lookaheadPassDelegate = this.p.p.L.q;
            Intrinsics.e(lookaheadPassDelegate);
            lookaheadPassDelegate.V0();
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int T(int i) {
            IntrinsicsPolicy intrinsicsPolicyJ = this.p.p.J();
            MeasurePolicy measurePolicyA = intrinsicsPolicyJ.a();
            LayoutNode layoutNode = intrinsicsPolicyJ.f1911a;
            return measurePolicyA.d(layoutNode.K.c, layoutNode.B(), i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int a0(int i) {
            IntrinsicsPolicy intrinsicsPolicyJ = this.p.p.J();
            MeasurePolicy measurePolicyA = intrinsicsPolicyJ.a();
            LayoutNode layoutNode = intrinsicsPolicyJ.f1911a;
            return measurePolicyA.e(layoutNode.K.c, layoutNode.B(), i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int b0(int i) {
            IntrinsicsPolicy intrinsicsPolicyJ = this.p.p.J();
            MeasurePolicy measurePolicyA = intrinsicsPolicyJ.a();
            LayoutNode layoutNode = intrinsicsPolicyJ.f1911a;
            return measurePolicyA.h(layoutNode.K.c, layoutNode.B(), i);
        }

        @Override // androidx.compose.ui.layout.Measurable
        public final Placeable c0(long j) {
            v0(j);
            NodeCoordinator nodeCoordinator = this.p;
            MutableVector mutableVectorN = nodeCoordinator.p.N();
            Object[] objArr = mutableVectorN.d;
            int i = mutableVectorN.f;
            for (int i2 = 0; i2 < i; i2++) {
                LookaheadPassDelegate lookaheadPassDelegate = ((LayoutNode) objArr[i2]).L.q;
                Intrinsics.e(lookaheadPassDelegate);
                lookaheadPassDelegate.m = LayoutNode.UsageByParent.f;
            }
            LayoutNode layoutNode = nodeCoordinator.p;
            LookaheadDelegate.P0(this, layoutNode.B.c(this, layoutNode.B(), j));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public final int w0(AlignmentLine alignmentLine) {
            LookaheadPassDelegate lookaheadPassDelegate = this.p.p.L.q;
            Intrinsics.e(lookaheadPassDelegate);
            LookaheadAlignmentLines lookaheadAlignmentLines = lookaheadPassDelegate.v;
            if (!lookaheadPassDelegate.n) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = lookaheadPassDelegate.i;
                if (layoutNodeLayoutDelegate.d == LayoutNode.LayoutState.e) {
                    lookaheadAlignmentLines.f = true;
                    if (lookaheadAlignmentLines.b) {
                        layoutNodeLayoutDelegate.f = true;
                        layoutNodeLayoutDelegate.g = true;
                    }
                } else {
                    lookaheadAlignmentLines.g = true;
                }
            }
            LookaheadDelegate lookaheadDelegate = lookaheadPassDelegate.U().V;
            if (lookaheadDelegate != null) {
                lookaheadDelegate.k = true;
            }
            lookaheadPassDelegate.R();
            LookaheadDelegate lookaheadDelegate2 = lookaheadPassDelegate.U().V;
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.k = false;
            }
            Integer num = (Integer) lookaheadAlignmentLines.i.get(alignmentLine);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            this.u.h(iIntValue, alignmentLine);
            return iIntValue;
        }
    }

    static {
        AndroidPaint androidPaintA = AndroidPaint_androidKt.a();
        androidPaintA.d(Color.g);
        androidPaintA.q(1.0f);
        androidPaintA.r(1);
        W = androidPaintA;
    }

    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        TailModifierNode tailModifierNode = new TailModifierNode();
        tailModifierNode.g = 0;
        this.U = tailModifierNode;
        tailModifierNode.k = this;
        this.V = layoutNode.m != null ? new LookaheadDelegateImpl(this) : null;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int J(int i) {
        return this.p.J().b(i);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void L1(Canvas canvas, GraphicsLayer graphicsLayer) {
        LayoutNode layoutNode = this.p;
        Owner ownerA = LayoutNodeKt.a(layoutNode);
        MutableVector mutableVectorM = layoutNode.M();
        Object[] objArr = mutableVectorM.d;
        int i = mutableVectorM.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.u()) {
                layoutNode2.t(canvas, graphicsLayer);
            }
        }
        if (ownerA.getShowLayoutBounds()) {
            long j = this.f;
            canvas.k(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, W);
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int T(int i) {
        return this.p.J().d(i);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void Z0() {
        if (this.V == null) {
            this.V = new LookaheadDelegateImpl(this);
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int a0(int i) {
        return this.p.J().e(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int b0(int i) {
        return this.p.J().c(i);
    }

    @Override // androidx.compose.ui.layout.Measurable
    public final Placeable c0(long j) {
        if (this.r) {
            LookaheadDelegate lookaheadDelegate = this.V;
            Intrinsics.e(lookaheadDelegate);
            j = lookaheadDelegate.g;
        }
        v0(j);
        LayoutNode layoutNode = this.p;
        MutableVector mutableVectorN = layoutNode.N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).L.p.o = LayoutNode.UsageByParent.f;
        }
        U1(layoutNode.B.c(this, layoutNode.C(), j));
        G1();
        return this;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* renamed from: h1, reason: from getter */
    public final LookaheadDelegate getW() {
        return this.V;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final Modifier.Node j1() {
        return this.U;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    public final void n0(long j, float f, GraphicsLayer graphicsLayer) {
        super.n0(j, f, graphicsLayer);
        if (this.j) {
            return;
        }
        this.p.L.p.D0();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    public final void s0(long j, float f, Function1 function1) {
        super.s0(j, f, function1);
        if (this.j) {
            return;
        }
        this.p.L.p.D0();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int w0(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = this.V;
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.w0(alignmentLine);
        }
        MeasurePassDelegate measurePassDelegate = this.p.L.p;
        LayoutNodeAlignmentLines layoutNodeAlignmentLines = measurePassDelegate.B;
        if (!measurePassDelegate.p) {
            if (measurePassDelegate.i.d == LayoutNode.LayoutState.d) {
                layoutNodeAlignmentLines.f = true;
                if (layoutNodeAlignmentLines.b) {
                    measurePassDelegate.z = true;
                    measurePassDelegate.A = true;
                }
            } else {
                layoutNodeAlignmentLines.g = true;
            }
        }
        measurePassDelegate.U().k = true;
        measurePassDelegate.R();
        measurePassDelegate.U().k = false;
        Integer num = (Integer) layoutNodeAlignmentLines.i.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w1(androidx.compose.ui.node.NodeCoordinator.HitTestSource r18, long r19, androidx.compose.ui.node.HitTestResult r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerNodeCoordinator.w1(androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, int, boolean):void");
    }
}
