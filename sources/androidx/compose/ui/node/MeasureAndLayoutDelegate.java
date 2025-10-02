package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "PostponedRequest", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MeasureAndLayoutDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f1923a;
    public boolean c;
    public boolean d;
    public Constraints i;
    public final DepthSortedSetsForDifferentPasses b = new DepthSortedSetsForDifferentPasses();
    public final OnPositionedDispatcher e = new OnPositionedDispatcher();
    public final MutableVector f = new MutableVector(new Owner.OnLayoutCompletedListener[16], 0);
    public final long g = 1;
    public final MutableVector h = new MutableVector(new PostponedRequest[16], 0);

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PostponedRequest {

        /* renamed from: a, reason: collision with root package name */
        public final LayoutNode f1924a;
        public final boolean b;
        public final boolean c;

        public PostponedRequest(LayoutNode layoutNode, boolean z, boolean z2) {
            this.f1924a = layoutNode;
            this.b = z;
            this.c = z2;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.d;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.d;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LayoutNode.LayoutState layoutState4 = LayoutNode.LayoutState.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MeasureAndLayoutDelegate(LayoutNode layoutNode) {
        this.f1923a = layoutNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(androidx.compose.ui.node.LayoutNode r5, androidx.compose.ui.unit.Constraints r6) {
        /*
            androidx.compose.ui.node.LayoutNode r0 = r5.m
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r1 = r5.L
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            androidx.compose.ui.node.LookaheadPassDelegate r0 = r1.q
            kotlin.jvm.internal.Intrinsics.e(r0)
            long r3 = r6.f2197a
            boolean r6 = r0.Z0(r3)
            goto L35
        L18:
            r6 = r2
            goto L35
        L1a:
            androidx.compose.ui.node.LookaheadPassDelegate r6 = r1.q
            if (r6 == 0) goto L23
            androidx.compose.ui.unit.Constraints r6 = r6.getQ()
            goto L24
        L23:
            r6 = 0
        L24:
            if (r6 == 0) goto L18
            androidx.compose.ui.node.LayoutNode r0 = r5.m
            if (r0 == 0) goto L18
            androidx.compose.ui.node.LookaheadPassDelegate r0 = r1.q
            kotlin.jvm.internal.Intrinsics.e(r0)
            long r3 = r6.f2197a
            boolean r6 = r0.Z0(r3)
        L35:
            androidx.compose.ui.node.LayoutNode r0 = r5.K()
            if (r6 == 0) goto L5d
            if (r0 == 0) goto L5d
            androidx.compose.ui.node.LayoutNode r1 = r0.m
            r3 = 3
            if (r1 != 0) goto L46
            androidx.compose.ui.node.LayoutNode.m0(r0, r2, r3)
            return r6
        L46:
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = r5.I()
            androidx.compose.ui.node.LayoutNode$UsageByParent r4 = androidx.compose.ui.node.LayoutNode.UsageByParent.d
            if (r1 != r4) goto L52
            androidx.compose.ui.node.LayoutNode.k0(r0, r2, r3)
            return r6
        L52:
            androidx.compose.ui.node.LayoutNode$UsageByParent r5 = r5.I()
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.e
            if (r5 != r1) goto L5d
            r0.j0(r2)
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasureAndLayoutDelegate.b(androidx.compose.ui.node.LayoutNode, androidx.compose.ui.unit.Constraints):boolean");
    }

    public static boolean c(LayoutNode layoutNode, Constraints constraints) {
        boolean zE0 = constraints != null ? layoutNode.e0(constraints) : LayoutNode.f0(layoutNode);
        LayoutNode layoutNodeK = layoutNode.K();
        if (zE0 && layoutNodeK != null) {
            if (layoutNode.H() == LayoutNode.UsageByParent.d) {
                LayoutNode.m0(layoutNodeK, false, 3);
                return zE0;
            }
            if (layoutNode.H() == LayoutNode.UsageByParent.e) {
                layoutNodeK.l0(false);
            }
        }
        return zE0;
    }

    public static boolean h(LayoutNode layoutNode) {
        if (!layoutNode.G()) {
            return false;
        }
        do {
            if (!i(layoutNode)) {
                LayoutNode layoutNodeK = layoutNode.K();
                if ((layoutNodeK != null ? layoutNodeK.L.d : null) != LayoutNode.LayoutState.d) {
                    return false;
                }
            }
            layoutNode = layoutNode.K();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.u());
        return true;
    }

    public static boolean i(LayoutNode layoutNode) {
        return layoutNode.H() == LayoutNode.UsageByParent.d || layoutNode.L.p.B.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r7) {
        /*
            r6 = this;
            r0 = 1
            androidx.compose.ui.node.OnPositionedDispatcher r1 = r6.e
            if (r7 == 0) goto L11
            androidx.compose.runtime.collection.MutableVector r7 = r1.f1930a
            r7.h()
            androidx.compose.ui.node.LayoutNode r2 = r6.f1923a
            r7.c(r2)
            r2.T = r0
        L11:
            androidx.compose.runtime.collection.MutableVector r7 = r1.f1930a
            androidx.compose.ui.node.OnPositionedDispatcher$Companion$DepthComparator r2 = androidx.compose.ui.node.OnPositionedDispatcher.Companion.DepthComparator.d
            r7.o(r2)
            int r2 = r7.f
            androidx.compose.ui.node.LayoutNode[] r3 = r1.b
            if (r3 == 0) goto L21
            int r4 = r3.length
            if (r4 >= r2) goto L29
        L21:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r2)
            androidx.compose.ui.node.LayoutNode[] r3 = new androidx.compose.ui.node.LayoutNode[r3]
        L29:
            r4 = 0
            r1.b = r4
            r4 = 0
        L2d:
            if (r4 >= r2) goto L38
            java.lang.Object[] r5 = r7.d
            r5 = r5[r4]
            r3[r4] = r5
            int r4 = r4 + 1
            goto L2d
        L38:
            r7.h()
            int r2 = r2 - r0
        L3c:
            r7 = -1
            if (r7 >= r2) goto L4e
            r7 = r3[r2]
            kotlin.jvm.internal.Intrinsics.e(r7)
            boolean r0 = r7.T
            if (r0 == 0) goto L4b
            androidx.compose.ui.node.OnPositionedDispatcher.a(r7)
        L4b:
            int r2 = r2 + (-1)
            goto L3c
        L4e:
            r1.b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasureAndLayoutDelegate.a(boolean):void");
    }

    public final void d() {
        MutableVector mutableVector = this.h;
        int i = mutableVector.f;
        if (i != 0) {
            Object[] objArr = mutableVector.d;
            for (int i2 = 0; i2 < i; i2++) {
                PostponedRequest postponedRequest = (PostponedRequest) objArr[i2];
                LayoutNode layoutNode = postponedRequest.f1924a;
                boolean z = postponedRequest.c;
                LayoutNode layoutNode2 = postponedRequest.f1924a;
                if (layoutNode.q()) {
                    if (postponedRequest.b) {
                        LayoutNode.k0(layoutNode2, z, 2);
                    } else {
                        LayoutNode.m0(layoutNode2, z, 2);
                    }
                }
            }
            mutableVector.h();
        }
    }

    public final void e(LayoutNode layoutNode) {
        MutableVector mutableVectorN = layoutNode.N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (Intrinsics.c(layoutNode2.Z(), Boolean.TRUE) && !layoutNode2.U) {
                if (this.b.b(layoutNode2)) {
                    layoutNode2.a0();
                }
                e(layoutNode2);
            }
        }
    }

    public final void f(LayoutNode layoutNode, boolean z) {
        if (!this.c) {
            InlineClassHelperKt.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? layoutNode.L.e : layoutNode.G()) {
            InlineClassHelperKt.a("node not yet measured");
        }
        g(layoutNode, z);
    }

    public final void g(LayoutNode layoutNode, boolean z) {
        LookaheadPassDelegate lookaheadPassDelegate;
        AlignmentLines alignmentLinesO;
        MutableVector mutableVectorN = layoutNode.N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if ((!z && i(layoutNode2)) || (z && (layoutNode2.I() == LayoutNode.UsageByParent.d || ((lookaheadPassDelegate = layoutNode2.L.q) != null && (alignmentLinesO = lookaheadPassDelegate.o()) != null && alignmentLinesO.f())))) {
                boolean zA = LayoutNodeLayoutDelegateKt.a(layoutNode2);
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode2.L;
                if (zA && !z) {
                    if (layoutNodeLayoutDelegate.e && this.b.b(layoutNode2)) {
                        m(layoutNode2, true, false);
                    } else {
                        f(layoutNode2, true);
                    }
                }
                if (z ? layoutNodeLayoutDelegate.e : layoutNode2.G()) {
                    m(layoutNode2, z, false);
                }
                if (!(z ? layoutNodeLayoutDelegate.e : layoutNode2.G())) {
                    g(layoutNode2, z);
                }
            }
        }
        if (z ? layoutNode.L.e : layoutNode.G()) {
            m(layoutNode, z, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(Function0 function0) {
        boolean z;
        LayoutNode layoutNode;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.b;
        LayoutNode layoutNode2 = this.f1923a;
        if (!layoutNode2.q()) {
            InlineClassHelperKt.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.u()) {
            InlineClassHelperKt.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            InlineClassHelperKt.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                if (depthSortedSetsForDifferentPasses.c()) {
                    z = false;
                    while (true) {
                        boolean zC = depthSortedSetsForDifferentPasses.c();
                        DepthSortedSet depthSortedSet = depthSortedSetsForDifferentPasses.f1908a;
                        if (!zC) {
                            break;
                        }
                        boolean zIsEmpty = depthSortedSet.f1906a.isEmpty();
                        boolean z2 = !zIsEmpty;
                        if (zIsEmpty) {
                            DepthSortedSet depthSortedSet2 = depthSortedSetsForDifferentPasses.b;
                            LayoutNode layoutNode3 = (LayoutNode) depthSortedSet2.f1906a.first();
                            depthSortedSet2.b(layoutNode3);
                            layoutNode = layoutNode3;
                        } else {
                            layoutNode = (LayoutNode) depthSortedSet.f1906a.first();
                            depthSortedSet.b(layoutNode);
                        }
                        boolean zM = m(layoutNode, z2, true);
                        if (layoutNode == layoutNode2 && zM) {
                            z = true;
                        }
                    }
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                this.c = false;
                this.d = false;
                throw th;
            }
        } else {
            z = false;
        }
        MutableVector mutableVector = this.f;
        Object[] objArr = mutableVector.d;
        int i = mutableVector.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((Owner.OnLayoutCompletedListener) objArr[i2]).l();
        }
        mutableVector.h();
        return z;
    }

    public final void k(LayoutNode layoutNode, long j) {
        if (layoutNode.U) {
            return;
        }
        LayoutNode layoutNode2 = this.f1923a;
        if (layoutNode.equals(layoutNode2)) {
            InlineClassHelperKt.a("measureAndLayout called on root");
        }
        if (!layoutNode2.q()) {
            InlineClassHelperKt.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.u()) {
            InlineClassHelperKt.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            InlineClassHelperKt.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.b;
                depthSortedSetsForDifferentPasses.f1908a.b(layoutNode);
                depthSortedSetsForDifferentPasses.b.b(layoutNode);
                if ((b(layoutNode, new Constraints(j)) || layoutNode.L.f) && Intrinsics.c(layoutNode.Z(), Boolean.TRUE)) {
                    layoutNode.a0();
                }
                e(layoutNode);
                c(layoutNode, new Constraints(j));
                if (layoutNode.F() && layoutNode.u()) {
                    layoutNode.i0();
                    this.e.f1930a.c(layoutNode);
                    layoutNode.T = true;
                }
                d();
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                this.c = false;
                this.d = false;
                throw th;
            }
        }
        MutableVector mutableVector = this.f;
        Object[] objArr = mutableVector.d;
        int i = mutableVector.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((Owner.OnLayoutCompletedListener) objArr[i2]).l();
        }
        mutableVector.h();
    }

    public final void l() {
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.b;
        if (depthSortedSetsForDifferentPasses.c()) {
            LayoutNode layoutNode = this.f1923a;
            if (!layoutNode.q()) {
                InlineClassHelperKt.a("performMeasureAndLayout called with unattached root");
            }
            if (!layoutNode.u()) {
                InlineClassHelperKt.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                InlineClassHelperKt.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!depthSortedSetsForDifferentPasses.f1908a.f1906a.isEmpty()) {
                        if (layoutNode.m != null) {
                            o(layoutNode, true);
                        } else {
                            n(layoutNode);
                        }
                    }
                    o(layoutNode, false);
                    this.c = false;
                    this.d = false;
                } catch (Throwable th) {
                    this.c = false;
                    this.d = false;
                    throw th;
                }
            }
        }
    }

    public final boolean m(LayoutNode layoutNode, boolean z, boolean z2) {
        Constraints constraints;
        boolean zB;
        Placeable.PlacementScope placementScope;
        InnerNodeCoordinator innerNodeCoordinator;
        LayoutNode layoutNodeK;
        LookaheadPassDelegate lookaheadPassDelegate;
        AlignmentLines alignmentLinesO;
        LookaheadPassDelegate lookaheadPassDelegate2;
        AlignmentLines alignmentLinesO2;
        boolean z3 = layoutNode.U;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.L;
        if (z3 || (!layoutNode.u() && !layoutNodeLayoutDelegate.p.x && !h(layoutNode) && !Intrinsics.c(layoutNode.Z(), Boolean.TRUE) && ((!layoutNodeLayoutDelegate.e || (layoutNode.I() != LayoutNode.UsageByParent.d && ((lookaheadPassDelegate2 = layoutNodeLayoutDelegate.q) == null || (alignmentLinesO2 = lookaheadPassDelegate2.o()) == null || !alignmentLinesO2.f()))) && !layoutNodeLayoutDelegate.p.B.f() && ((lookaheadPassDelegate = layoutNodeLayoutDelegate.q) == null || (alignmentLinesO = lookaheadPassDelegate.o()) == null || !alignmentLinesO.f())))) {
            return false;
        }
        LayoutNode layoutNode2 = this.f1923a;
        if (layoutNode == layoutNode2) {
            constraints = this.i;
            Intrinsics.e(constraints);
        } else {
            constraints = null;
        }
        if (z) {
            zB = layoutNodeLayoutDelegate.e ? b(layoutNode, constraints) : false;
            if (z2 && ((zB || layoutNodeLayoutDelegate.f) && Intrinsics.c(layoutNode.Z(), Boolean.TRUE))) {
                layoutNode.a0();
            }
        } else {
            boolean zC = layoutNode.G() ? c(layoutNode, constraints) : false;
            if (z2 && layoutNode.F() && (layoutNode == layoutNode2 || ((layoutNodeK = layoutNode.K()) != null && layoutNodeK.u() && layoutNodeLayoutDelegate.p.x))) {
                if (layoutNode == layoutNode2) {
                    if (layoutNode.H == LayoutNode.UsageByParent.f) {
                        layoutNode.p();
                    }
                    LayoutNode layoutNodeK2 = layoutNode.K();
                    if (layoutNodeK2 == null || (innerNodeCoordinator = layoutNodeK2.K.b) == null || (placementScope = innerNodeCoordinator.l) == null) {
                        placementScope = LayoutNodeKt.a(layoutNode).getPlacementScope();
                    }
                    Placeable.PlacementScope.h(placementScope, layoutNodeLayoutDelegate.p, 0, 0);
                } else {
                    layoutNode.i0();
                }
                this.e.f1930a.c(layoutNode);
                layoutNode.T = true;
                LayoutNodeKt.a(layoutNode).getRectManager().d(layoutNode);
            }
            zB = zC;
        }
        d();
        return zB;
    }

    public final void n(LayoutNode layoutNode) {
        MutableVector mutableVectorN = layoutNode.N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (i(layoutNode2)) {
                if (LayoutNodeLayoutDelegateKt.a(layoutNode2)) {
                    o(layoutNode2, true);
                } else {
                    n(layoutNode2);
                }
            }
        }
    }

    public final void o(LayoutNode layoutNode, boolean z) {
        Constraints constraints;
        if (layoutNode.U) {
            return;
        }
        if (layoutNode == this.f1923a) {
            constraints = this.i;
            Intrinsics.e(constraints);
        } else {
            constraints = null;
        }
        if (z) {
            b(layoutNode, constraints);
        } else {
            c(layoutNode, constraints);
        }
    }

    public final boolean p(LayoutNode layoutNode, boolean z) {
        int iOrdinal = layoutNode.L.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.c(new PostponedRequest(layoutNode, false, z));
            } else {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!layoutNode.G() || z) {
                    layoutNode.L.p.y = true;
                    if (!layoutNode.U && (layoutNode.u() || h(layoutNode))) {
                        LayoutNode layoutNodeK = layoutNode.K();
                        if (layoutNodeK == null || !layoutNodeK.G()) {
                            this.b.a(layoutNode, false);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j) {
        Constraints constraints = this.i;
        if (constraints == null ? false : Constraints.b(constraints.f2197a, j)) {
            return;
        }
        if (this.c) {
            InlineClassHelperKt.a("updateRootConstraints called while measuring");
        }
        this.i = new Constraints(j);
        LayoutNode layoutNode = this.f1923a;
        LayoutNode layoutNode2 = layoutNode.m;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.L;
        if (layoutNode2 != null) {
            layoutNodeLayoutDelegate.e = true;
        }
        layoutNodeLayoutDelegate.p.y = true;
        this.b.a(layoutNode, layoutNode2 != null);
    }
}
