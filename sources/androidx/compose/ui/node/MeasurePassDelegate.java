package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/MeasurePassDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
    public boolean A;
    public boolean E;
    public float I;
    public boolean J;
    public Function1 K;
    public GraphicsLayer L;
    public float N;
    public boolean P;
    public final LayoutNodeLayoutDelegate i;
    public boolean j;
    public boolean m;
    public boolean n;
    public boolean p;
    public Function1 r;
    public GraphicsLayer s;
    public float t;
    public Object v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int k = Integer.MAX_VALUE;
    public int l = Integer.MAX_VALUE;
    public LayoutNode.UsageByParent o = LayoutNode.UsageByParent.f;
    public long q = 0;
    public boolean u = true;
    public final LayoutNodeAlignmentLines B = new LayoutNodeAlignmentLines(this);
    public final MutableVector C = new MutableVector(new MeasurePassDelegate[16], 0);
    public boolean D = true;
    public long F = ConstraintsKt.b(0, 0, 15);
    public final Function0 G = new Function0<Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            MeasurePassDelegate measurePassDelegate = this.h;
            measurePassDelegate.i.a().c0(measurePassDelegate.F);
            return Unit.f24250a;
        }
    };
    public final Function0 H = new Function0<Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1$1, reason: invalid class name */
        final class AnonymousClass1 extends Lambda implements Function1<AlignmentLinesOwner, Unit> {
            public static final AnonymousClass1 h = new AnonymousClass1(1);

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((AlignmentLinesOwner) obj).o().d = false;
                return Unit.f24250a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1$2, reason: invalid class name */
        final class AnonymousClass2 extends Lambda implements Function1<AlignmentLinesOwner, Unit> {
            public static final AnonymousClass2 h = new AnonymousClass2(1);

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AlignmentLinesOwner alignmentLinesOwner = (AlignmentLinesOwner) obj;
                alignmentLinesOwner.o().e = alignmentLinesOwner.o().d;
                return Unit.f24250a;
            }
        }

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            MeasurePassDelegate measurePassDelegate = this.h;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = measurePassDelegate.i;
            layoutNodeLayoutDelegate.i = 0;
            MutableVector mutableVectorN = layoutNodeLayoutDelegate.f1921a.N();
            Object[] objArr = mutableVectorN.d;
            int i = mutableVectorN.f;
            for (int i2 = 0; i2 < i; i2++) {
                MeasurePassDelegate measurePassDelegate2 = ((LayoutNode) objArr[i2]).L.p;
                measurePassDelegate2.k = measurePassDelegate2.l;
                measurePassDelegate2.l = Integer.MAX_VALUE;
                measurePassDelegate2.x = false;
                if (measurePassDelegate2.o == LayoutNode.UsageByParent.e) {
                    measurePassDelegate2.o = LayoutNode.UsageByParent.f;
                }
            }
            measurePassDelegate.f0(AnonymousClass1.h);
            measurePassDelegate.U().D0().q();
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f1921a;
            MutableVector mutableVectorN2 = layoutNode.N();
            Object[] objArr2 = mutableVectorN2.d;
            int i3 = mutableVectorN2.f;
            for (int i4 = 0; i4 < i3; i4++) {
                LayoutNode layoutNode2 = (LayoutNode) objArr2[i4];
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode2.L;
                if (layoutNodeLayoutDelegate2.p.k != layoutNode2.L()) {
                    layoutNode.d0();
                    layoutNode.Q();
                    if (layoutNode2.L() == Integer.MAX_VALUE) {
                        if (layoutNodeLayoutDelegate2.c) {
                            LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate2.q;
                            Intrinsics.e(lookaheadPassDelegate);
                            lookaheadPassDelegate.J0(false);
                        }
                        layoutNodeLayoutDelegate2.p.A0();
                    }
                }
            }
            measurePassDelegate.f0(AnonymousClass2.h);
            return Unit.f24250a;
        }
    };
    public long M = 0;
    public final Function0 O = new Function0<Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$placeOuterCoordinatorBlock$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Placeable.PlacementScope placementScope;
            MeasurePassDelegate measurePassDelegate = this.h;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = measurePassDelegate.i;
            NodeCoordinator nodeCoordinator = layoutNodeLayoutDelegate.a().t;
            if (nodeCoordinator == null || (placementScope = nodeCoordinator.l) == null) {
                placementScope = LayoutNodeKt.a(layoutNodeLayoutDelegate.f1921a).getPlacementScope();
            }
            Function1 function1 = measurePassDelegate.K;
            GraphicsLayer graphicsLayer = measurePassDelegate.L;
            if (graphicsLayer != null) {
                NodeCoordinator nodeCoordinatorA = layoutNodeLayoutDelegate.a();
                long j = measurePassDelegate.M;
                float f = measurePassDelegate.N;
                placementScope.getClass();
                Placeable.PlacementScope.a(placementScope, nodeCoordinatorA);
                nodeCoordinatorA.n0(IntOffset.d(j, nodeCoordinatorA.h), f, graphicsLayer);
            } else if (function1 == null) {
                NodeCoordinator nodeCoordinatorA2 = layoutNodeLayoutDelegate.a();
                long j2 = measurePassDelegate.M;
                float f2 = measurePassDelegate.N;
                placementScope.getClass();
                Placeable.PlacementScope.a(placementScope, nodeCoordinatorA2);
                nodeCoordinatorA2.s0(IntOffset.d(j2, nodeCoordinatorA2.h), f2, null);
            } else {
                NodeCoordinator nodeCoordinatorA3 = layoutNodeLayoutDelegate.a();
                long j3 = measurePassDelegate.M;
                float f3 = measurePassDelegate.N;
                placementScope.getClass();
                Placeable.PlacementScope.a(placementScope, nodeCoordinatorA3);
                nodeCoordinatorA3.s0(IntOffset.d(j3, nodeCoordinatorA3.h), f3, function1);
            }
            return Unit.f24250a;
        }
    };

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MeasurePassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.i = layoutNodeLayoutDelegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void A0() {
        if (this.w) {
            this.w = false;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
            NodeChain nodeChain = layoutNodeLayoutDelegate.f1921a.K;
            NodeCoordinator nodeCoordinator = nodeChain.b.s;
            for (NodeCoordinator nodeCoordinator2 = nodeChain.c; !Intrinsics.c(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.s) {
                Modifier.Node nodeO1 = nodeCoordinator2.o1(NodeKindKt.g(1048576));
                if (nodeO1 != null && (nodeO1.d.g & 1048576) != 0) {
                    boolean zG = NodeKindKt.g(1048576);
                    Modifier.Node nodeJ1 = nodeCoordinator2.j1();
                    if (zG || (nodeJ1 = nodeJ1.h) != null) {
                        for (Modifier.Node nodeO12 = nodeCoordinator2.o1(zG); nodeO12 != null && (nodeO12.g & 1048576) != 0; nodeO12 = nodeO12.i) {
                            if ((nodeO12.f & 1048576) != 0) {
                                DelegatingNode delegatingNodeB = nodeO12;
                                ?? mutableVector = 0;
                                while (delegatingNodeB != 0) {
                                    if (delegatingNodeB instanceof OnUnplacedModifierNode) {
                                        ((OnUnplacedModifierNode) delegatingNodeB).f2();
                                    } else if ((delegatingNodeB.f & 1048576) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                        Modifier.Node node = delegatingNodeB.s;
                                        int i = 0;
                                        delegatingNodeB = delegatingNodeB;
                                        mutableVector = mutableVector;
                                        while (node != null) {
                                            if ((node.f & 1048576) != 0) {
                                                i++;
                                                mutableVector = mutableVector;
                                                if (i == 1) {
                                                    delegatingNodeB = node;
                                                } else {
                                                    if (mutableVector == 0) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (delegatingNodeB != 0) {
                                                        mutableVector.c(delegatingNodeB);
                                                        delegatingNodeB = 0;
                                                    }
                                                    mutableVector.c(node);
                                                }
                                            }
                                            node = node.i;
                                            delegatingNodeB = delegatingNodeB;
                                            mutableVector = mutableVector;
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    delegatingNodeB = DelegatableNodeKt.b(mutableVector);
                                }
                            }
                            if (nodeO12 == nodeJ1) {
                                break;
                            }
                        }
                    }
                }
                if (nodeCoordinator2.L != null) {
                    if (nodeCoordinator2.M != null) {
                        nodeCoordinator2.M = null;
                    }
                    nodeCoordinator2.d2(null, false);
                    nodeCoordinator2.p.l0(false);
                }
            }
            MutableVector mutableVectorN = layoutNodeLayoutDelegate.f1921a.N();
            Object[] objArr = mutableVectorN.d;
            int i2 = mutableVectorN.f;
            for (int i3 = 0; i3 < i2; i3++) {
                ((LayoutNode) objArr[i3]).L.p.A0();
            }
        }
    }

    public final void B0() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        if (layoutNodeLayoutDelegate.l > 0) {
            MutableVector mutableVectorN = layoutNodeLayoutDelegate.f1921a.N();
            Object[] objArr = mutableVectorN.d;
            int i = mutableVectorN.f;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode.L;
                boolean z = layoutNodeLayoutDelegate2.j;
                MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate2.p;
                if ((z || layoutNodeLayoutDelegate2.k) && !measurePassDelegate.z) {
                    layoutNode.l0(false);
                }
                measurePassDelegate.B0();
            }
        }
    }

    public final void C0() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        LayoutNode.m0(layoutNodeLayoutDelegate.f1921a, false, 7);
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f1921a;
        LayoutNode layoutNodeK = layoutNode.K();
        if (layoutNodeK == null || layoutNode.H != LayoutNode.UsageByParent.f) {
            return;
        }
        int iOrdinal = layoutNodeK.L.d.ordinal();
        layoutNode.H = iOrdinal != 0 ? iOrdinal != 2 ? layoutNodeK.H : LayoutNode.UsageByParent.e : LayoutNode.UsageByParent.d;
    }

    public final void D0() {
        this.J = true;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        LayoutNode layoutNodeK = layoutNodeLayoutDelegate.f1921a.K();
        float f = U().D;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f1921a;
        NodeChain nodeChain = layoutNode.K;
        InnerNodeCoordinator innerNodeCoordinator = nodeChain.b;
        for (NodeCoordinator nodeCoordinator = nodeChain.c; nodeCoordinator != innerNodeCoordinator; nodeCoordinator = nodeCoordinator.s) {
            Intrinsics.f(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            f += ((LayoutModifierNodeCoordinator) nodeCoordinator).D;
        }
        if (f != this.I) {
            this.I = f;
            if (layoutNodeK != null) {
                layoutNodeK.d0();
            }
            if (layoutNodeK != null) {
                layoutNodeK.Q();
            }
        }
        if (this.w) {
            layoutNode.K.b.H1();
        } else {
            if (layoutNodeK != null) {
                layoutNodeK.Q();
            }
            x0();
            if (this.j && layoutNodeK != null) {
                layoutNodeK.l0(false);
            }
        }
        if (layoutNodeK != null) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNodeK.L;
            if (!this.j && layoutNodeLayoutDelegate2.d == LayoutNode.LayoutState.f) {
                if (this.l != Integer.MAX_VALUE) {
                    InlineClassHelperKt.b("Place was called on a node which was placed already");
                }
                int i = layoutNodeLayoutDelegate2.i;
                this.l = i;
                layoutNodeLayoutDelegate2.i = i + 1;
            }
        } else {
            this.l = 0;
        }
        R();
    }

    public final void E0(long j, float f, Function1 function1, GraphicsLayer graphicsLayer) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f1921a;
        LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f1921a;
        if (layoutNode.U) {
            InlineClassHelperKt.a("place is called on a deactivated node");
        }
        layoutNodeLayoutDelegate.d = LayoutNode.LayoutState.f;
        boolean z = !this.n;
        this.q = j;
        this.t = f;
        this.r = function1;
        this.s = graphicsLayer;
        this.n = true;
        this.J = false;
        Owner ownerA = LayoutNodeKt.a(layoutNode2);
        ownerA.getRectManager().f(layoutNode2, j, z);
        if (this.z || !this.w) {
            this.B.g = false;
            layoutNodeLayoutDelegate.e(false);
            this.K = function1;
            this.M = j;
            this.N = f;
            this.L = graphicsLayer;
            OwnerSnapshotObserver snapshotObserver = ownerA.getSnapshotObserver();
            snapshotObserver.b(layoutNode2, snapshotObserver.f, this.O);
        } else {
            NodeCoordinator nodeCoordinatorA = layoutNodeLayoutDelegate.a();
            nodeCoordinatorA.M1(IntOffset.d(j, nodeCoordinatorA.h), f, function1, graphicsLayer);
            D0();
        }
        layoutNodeLayoutDelegate.d = LayoutNode.LayoutState.h;
    }

    public final void F0(long j, float f, Function1 function1, GraphicsLayer graphicsLayer) {
        Placeable.PlacementScope placementScope;
        this.x = true;
        boolean zB = IntOffset.b(j, this.q);
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        if (!zB || this.P) {
            if (layoutNodeLayoutDelegate.k || layoutNodeLayoutDelegate.j || this.P) {
                this.z = true;
                this.P = false;
            }
            B0();
        }
        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.q;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f1921a;
        if (lookaheadPassDelegate != null && lookaheadPassDelegate.C0()) {
            NodeCoordinator nodeCoordinator = layoutNodeLayoutDelegate.a().t;
            if (nodeCoordinator == null || (placementScope = nodeCoordinator.l) == null) {
                placementScope = LayoutNodeKt.a(layoutNode).getPlacementScope();
            }
            LookaheadPassDelegate lookaheadPassDelegate2 = layoutNodeLayoutDelegate.q;
            Intrinsics.e(lookaheadPassDelegate2);
            LayoutNode layoutNodeK = layoutNode.K();
            if (layoutNodeK != null) {
                layoutNodeK.L.h = 0;
            }
            lookaheadPassDelegate2.h1();
            placementScope.e(lookaheadPassDelegate2, (int) (j >> 32), (int) (4294967295L & j), BitmapDescriptorFactory.HUE_RED);
        }
        LookaheadPassDelegate lookaheadPassDelegate3 = layoutNodeLayoutDelegate.q;
        if (lookaheadPassDelegate3 != null && !lookaheadPassDelegate3.getO()) {
            InlineClassHelperKt.b("Error: Placement happened before lookahead.");
        }
        E0(j, f, function1, graphicsLayer);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void I() {
        LayoutNode.m0(this.i.f1921a, false, 7);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int J(int i) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        if (!LayoutNodeLayoutDelegateKt.a(layoutNodeLayoutDelegate.f1921a)) {
            C0();
            return layoutNodeLayoutDelegate.a().J(i);
        }
        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.q;
        Intrinsics.e(lookaheadPassDelegate);
        return lookaheadPassDelegate.J(i);
    }

    public final boolean J0(long j) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f1921a;
        LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f1921a;
        if (layoutNode.U) {
            InlineClassHelperKt.a("measure is called on a deactivated node");
        }
        Owner ownerA = LayoutNodeKt.a(layoutNode2);
        LayoutNode layoutNodeK = layoutNode2.K();
        boolean z = true;
        layoutNode2.J = layoutNode2.J || (layoutNodeK != null && layoutNodeK.J);
        if (!layoutNode2.G() && Constraints.b(this.g, j)) {
            ownerA.s(layoutNode2, false);
            layoutNode2.o0();
            return false;
        }
        this.B.f = false;
        f0(MeasurePassDelegate$remeasure$2.h);
        this.m = true;
        long j2 = layoutNodeLayoutDelegate.a().f;
        v0(j);
        LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.d;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.h;
        if (layoutState != layoutState2) {
            InlineClassHelperKt.b("layout state is not idle before measure starts");
        }
        this.F = j;
        LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.d;
        layoutNodeLayoutDelegate.d = layoutState3;
        this.y = false;
        OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.a(layoutNode2).getSnapshotObserver();
        snapshotObserver.b(layoutNode2, snapshotObserver.c, this.G);
        if (layoutNodeLayoutDelegate.d == layoutState3) {
            this.z = true;
            this.A = true;
            layoutNodeLayoutDelegate.d = layoutState2;
        }
        if (IntSize.b(layoutNodeLayoutDelegate.a().f, j2) && layoutNodeLayoutDelegate.a().d == this.d && layoutNodeLayoutDelegate.a().e == this.e) {
            z = false;
        }
        u0((layoutNodeLayoutDelegate.a().e & 4294967295L) | (layoutNodeLayoutDelegate.a().d << 32));
        return z;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final AlignmentLinesOwner O() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
        LayoutNode layoutNodeK = this.i.f1921a.K();
        if (layoutNodeK == null || (layoutNodeLayoutDelegate = layoutNodeK.L) == null) {
            return null;
        }
        return layoutNodeLayoutDelegate.p;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void R() {
        this.E = true;
        LayoutNodeAlignmentLines layoutNodeAlignmentLines = this.B;
        layoutNodeAlignmentLines.i();
        boolean z = this.z;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        if (z) {
            MutableVector mutableVectorN = layoutNodeLayoutDelegate.f1921a.N();
            Object[] objArr = mutableVectorN.d;
            int i = mutableVectorN.f;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                if (layoutNode.G() && layoutNode.H() == LayoutNode.UsageByParent.d && LayoutNode.f0(layoutNode)) {
                    LayoutNode.m0(layoutNodeLayoutDelegate.f1921a, false, 7);
                }
            }
        }
        if (this.A || (!this.p && !U().k && this.z)) {
            this.z = false;
            LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.d;
            layoutNodeLayoutDelegate.d = LayoutNode.LayoutState.f;
            layoutNodeLayoutDelegate.f(false);
            LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f1921a;
            OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.a(layoutNode2).getSnapshotObserver();
            snapshotObserver.b(layoutNode2, snapshotObserver.e, this.H);
            layoutNodeLayoutDelegate.d = layoutState;
            if (U().k && layoutNodeLayoutDelegate.j) {
                requestLayout();
            }
            this.A = false;
        }
        if (layoutNodeAlignmentLines.d) {
            layoutNodeAlignmentLines.e = true;
        }
        if (layoutNodeAlignmentLines.b && layoutNodeAlignmentLines.f()) {
            layoutNodeAlignmentLines.h();
        }
        this.E = false;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int T(int i) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        if (!LayoutNodeLayoutDelegateKt.a(layoutNodeLayoutDelegate.f1921a)) {
            C0();
            return layoutNodeLayoutDelegate.a().T(i);
        }
        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.q;
        Intrinsics.e(lookaheadPassDelegate);
        return lookaheadPassDelegate.T(i);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final InnerNodeCoordinator U() {
        return this.i.f1921a.K.b;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int a0(int i) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        if (!LayoutNodeLayoutDelegateKt.a(layoutNodeLayoutDelegate.f1921a)) {
            C0();
            return layoutNodeLayoutDelegate.a().a0(i);
        }
        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.q;
        Intrinsics.e(lookaheadPassDelegate);
        return lookaheadPassDelegate.a0(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int b0(int i) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        if (!LayoutNodeLayoutDelegateKt.a(layoutNodeLayoutDelegate.f1921a)) {
            C0();
            return layoutNodeLayoutDelegate.a().b0(i);
        }
        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.q;
        Intrinsics.e(lookaheadPassDelegate);
        return lookaheadPassDelegate.b0(i);
    }

    @Override // androidx.compose.ui.layout.Measurable
    public final Placeable c0(long j) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f1921a;
        LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f1921a;
        LayoutNode.UsageByParent usageByParent2 = layoutNode.H;
        LayoutNode.UsageByParent usageByParent3 = LayoutNode.UsageByParent.f;
        if (usageByParent2 == usageByParent3) {
            layoutNode.o();
        }
        if (LayoutNodeLayoutDelegateKt.a(layoutNode2)) {
            LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.q;
            Intrinsics.e(lookaheadPassDelegate);
            lookaheadPassDelegate.f1();
            lookaheadPassDelegate.c0(j);
        }
        LayoutNode layoutNodeK = layoutNode2.K();
        if (layoutNodeK != null) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNodeK.L;
            if (this.o != usageByParent3 && !layoutNode2.J) {
                InlineClassHelperKt.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = layoutNodeLayoutDelegate2.d.ordinal();
            if (iOrdinal == 0) {
                usageByParent = LayoutNode.UsageByParent.d;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + layoutNodeLayoutDelegate2.d);
                }
                usageByParent = LayoutNode.UsageByParent.e;
            }
            this.o = usageByParent;
        } else {
            this.o = usageByParent3;
        }
        J0(j);
        return this;
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int d0(AlignmentLine alignmentLine) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        LayoutNode layoutNodeK = layoutNodeLayoutDelegate.f1921a.K();
        LayoutNode.LayoutState layoutState = layoutNodeK != null ? layoutNodeK.L.d : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.d;
        LayoutNodeAlignmentLines layoutNodeAlignmentLines = this.B;
        if (layoutState == layoutState2) {
            layoutNodeAlignmentLines.c = true;
        } else {
            LayoutNode layoutNodeK2 = layoutNodeLayoutDelegate.f1921a.K();
            if ((layoutNodeK2 != null ? layoutNodeK2.L.d : null) == LayoutNode.LayoutState.f) {
                layoutNodeAlignmentLines.d = true;
            }
        }
        this.p = true;
        int iD0 = layoutNodeLayoutDelegate.a().d0(alignmentLine);
        this.p = false;
        return iD0;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void f0(Function1 function1) {
        MutableVector mutableVectorN = this.i.f1921a.N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            function1.invoke(((LayoutNode) objArr[i2]).L.p);
        }
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final int h0() {
        return this.i.a().h0();
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    /* renamed from: i, reason: from getter */
    public final Object getA() {
        return this.v;
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final int i0() {
        return this.i.a().i0();
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final void n0(long j, float f, GraphicsLayer graphicsLayer) {
        F0(j, f, null, graphicsLayer);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final AlignmentLines o() {
        return this.B;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void requestLayout() {
        LayoutNode layoutNode = this.i.f1921a;
        LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.V;
        layoutNode.l0(false);
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final void s0(long j, float f, Function1 function1) {
        F0(j, f, function1, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    /* renamed from: u, reason: from getter */
    public final boolean getW() {
        return this.w;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public final void w(boolean z) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        if (z != layoutNodeLayoutDelegate.a().i) {
            layoutNodeLayoutDelegate.a().i = z;
            this.P = true;
        }
    }

    public final List w0() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.i;
        layoutNodeLayoutDelegate.f1921a.q0();
        boolean z = this.D;
        MutableVector mutableVector = this.C;
        if (!z) {
            return mutableVector.g();
        }
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f1921a;
        MutableVector mutableVectorN = layoutNode.N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (mutableVector.f <= i2) {
                mutableVector.c(layoutNode2.L.p);
            } else {
                MeasurePassDelegate measurePassDelegate = layoutNode2.L.p;
                Object[] objArr2 = mutableVector.d;
                Object obj = objArr2[i2];
                objArr2[i2] = measurePassDelegate;
            }
        }
        mutableVector.m(layoutNode.D().size(), mutableVector.f);
        this.D = false;
        return mutableVector.g();
    }

    public final void x0() {
        boolean z = this.w;
        this.w = true;
        LayoutNode layoutNode = this.i.f1921a;
        NodeChain nodeChain = layoutNode.K;
        if (!z) {
            nodeChain.b.H1();
            if (layoutNode.G()) {
                LayoutNode.m0(layoutNode, true, 6);
            } else if (layoutNode.L.e) {
                LayoutNode.k0(layoutNode, true, 6);
            }
        }
        NodeCoordinator nodeCoordinator = nodeChain.b.s;
        for (NodeCoordinator nodeCoordinator2 = nodeChain.c; !Intrinsics.c(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.s) {
            if (nodeCoordinator2.K) {
                nodeCoordinator2.z1();
            }
        }
        MutableVector mutableVectorN = layoutNode.N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.L() != Integer.MAX_VALUE) {
                layoutNode2.L.p.x0();
                LayoutNode.n0(layoutNode2);
            }
        }
    }
}
