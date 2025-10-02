package androidx.compose.ui.node;

import androidx.camera.core.impl.b;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Companion", "HitTestSource", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final Function1 N = null;
    public static final Function1 O = null;
    public static final ReusableGraphicsLayerScope P;
    public static final LayerPositionalProperties Q;
    public static final float[] R;
    public static final NodeCoordinator$Companion$PointerInputSource$1 S;
    public static final NodeCoordinator$Companion$SemanticsSource$1 T;
    public MeasureResult A;
    public MutableObjectIntMap B;
    public float D;
    public MutableRect E;
    public LayerPositionalProperties F;
    public GraphicsLayer G;
    public Canvas H;
    public Function2 I;
    public boolean K;
    public OwnedLayer L;
    public GraphicsLayer M;
    public final LayoutNode p;
    public boolean q;
    public boolean r;
    public NodeCoordinator s;
    public NodeCoordinator t;
    public boolean u;
    public boolean v;
    public Function1 w;
    public Density x;
    public LayoutDirection y;
    public float z = 0.8f;
    public long C = 0;
    public final Function0 J = new NodeCoordinator$invalidateParentLayer$1(this);

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayer", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLayerParams", "Landroidx/compose/ui/node/LayerPositionalProperties;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "Landroidx/compose/ui/graphics/Matrix;", "tmpMatrix", "[F", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface HitTestSource {
        int a();

        boolean b(Modifier.Node node);

        void c(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z);

        boolean d(LayoutNode layoutNode);
    }

    static {
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = new ReusableGraphicsLayerScope();
        reusableGraphicsLayerScope.e = 1.0f;
        reusableGraphicsLayerScope.f = 1.0f;
        reusableGraphicsLayerScope.g = 1.0f;
        long j = GraphicsLayerScopeKt.f1769a;
        reusableGraphicsLayerScope.k = j;
        reusableGraphicsLayerScope.l = j;
        reusableGraphicsLayerScope.p = 8.0f;
        reusableGraphicsLayerScope.q = TransformOrigin.b;
        reusableGraphicsLayerScope.r = RectangleShapeKt.f1779a;
        reusableGraphicsLayerScope.t = 9205357640488583168L;
        reusableGraphicsLayerScope.u = DensityKt.b();
        reusableGraphicsLayerScope.v = LayoutDirection.d;
        P = reusableGraphicsLayerScope;
        Q = new LayerPositionalProperties();
        R = Matrix.a();
        S = new NodeCoordinator$Companion$PointerInputSource$1();
        T = new NodeCoordinator$Companion$SemanticsSource$1();
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.p = layoutNode;
        this.x = layoutNode.D;
        this.y = layoutNode.E;
    }

    public static NodeCoordinator Z1(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator nodeCoordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (nodeCoordinator = lookaheadLayoutCoordinates.d.p) != null) {
            return nodeCoordinator;
        }
        Intrinsics.f(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable A0() {
        return this.s;
    }

    public final boolean A1() {
        if (this.L != null && this.z <= BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.t;
        if (nodeCoordinator != null) {
            return nodeCoordinator.A1();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LayoutCoordinates B0() {
        return this;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final boolean C0() {
        return this.A != null;
    }

    public final long C1(LayoutCoordinates layoutCoordinates, long j, boolean z) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            LookaheadLayoutCoordinates lookaheadLayoutCoordinates = (LookaheadLayoutCoordinates) layoutCoordinates;
            lookaheadLayoutCoordinates.d.p.F1();
            return lookaheadLayoutCoordinates.c(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        NodeCoordinator nodeCoordinatorZ1 = Z1(layoutCoordinates);
        nodeCoordinatorZ1.F1();
        NodeCoordinator nodeCoordinatorA1 = a1(nodeCoordinatorZ1);
        while (nodeCoordinatorZ1 != nodeCoordinatorA1) {
            OwnedLayer ownedLayer = nodeCoordinatorZ1.L;
            if (ownedLayer != null) {
                j = ownedLayer.e(j, false);
            }
            if (z || !nodeCoordinatorZ1.i) {
                j = IntOffsetKt.b(j, nodeCoordinatorZ1.C);
            }
            nodeCoordinatorZ1 = nodeCoordinatorZ1.t;
            Intrinsics.e(nodeCoordinatorZ1);
        }
        return R0(nodeCoordinatorA1, j, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final Rect D(LayoutCoordinates layoutCoordinates, boolean z) {
        if (!j1().q) {
            InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!layoutCoordinates.q()) {
            InlineClassHelperKt.b("LayoutCoordinates " + layoutCoordinates + " is not attached!");
        }
        NodeCoordinator nodeCoordinatorZ1 = Z1(layoutCoordinates);
        nodeCoordinatorZ1.F1();
        NodeCoordinator nodeCoordinatorA1 = a1(nodeCoordinatorZ1);
        MutableRect mutableRect = this.E;
        if (mutableRect == null) {
            mutableRect = new MutableRect();
            this.E = mutableRect;
        }
        mutableRect.f1750a = BitmapDescriptorFactory.HUE_RED;
        mutableRect.b = BitmapDescriptorFactory.HUE_RED;
        mutableRect.c = (int) (layoutCoordinates.a() >> 32);
        mutableRect.d = (int) (layoutCoordinates.a() & 4294967295L);
        while (nodeCoordinatorZ1 != nodeCoordinatorA1) {
            nodeCoordinatorZ1.O1(mutableRect, z, false);
            if (mutableRect.b()) {
                return Rect.e;
            }
            nodeCoordinatorZ1 = nodeCoordinatorZ1.t;
            Intrinsics.e(nodeCoordinatorZ1);
        }
        P0(nodeCoordinatorA1, mutableRect, z);
        return new Rect(mutableRect.f1750a, mutableRect.b, mutableRect.c, mutableRect.d);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final MeasureResult D0() {
        MeasureResult measureResult = this.A;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates E() {
        if (!j1().q) {
            InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        F1();
        return this.p.K.c.t;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable E0() {
        return this.t;
    }

    public final void E1() {
        if (this.L != null || this.w == null) {
            return;
        }
        OwnedLayer ownedLayerJ = Owner.j(LayoutNodeKt.a(this.p), f1(), this.J, this.M, false, 8);
        ownedLayerJ.f(this.f);
        ownedLayerJ.j(this.C);
        ownedLayerJ.invalidate();
        this.L = ownedLayerJ;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: F0, reason: from getter */
    public final long getQ() {
        return this.C;
    }

    public final void F1() {
        this.p.L.b();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long G(long j) {
        if (!j1().q) {
            InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        F1();
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.t) {
            OwnedLayer ownedLayer = nodeCoordinator.L;
            if (ownedLayer != null) {
                j = ownedLayer.e(j, false);
            }
            j = IntOffsetKt.b(j, nodeCoordinator.C);
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void G1() {
        Modifier.Node nodeJ1;
        boolean zG = NodeKindKt.g(128);
        Modifier.Node nodeO1 = o1(zG);
        if (nodeO1 == null || (nodeO1.d.g & 128) == 0) {
            return;
        }
        Snapshot snapshotA = Snapshot.Companion.a();
        Function1 function1E = snapshotA != null ? snapshotA.getE() : null;
        Snapshot snapshotB = Snapshot.Companion.b(snapshotA);
        try {
            if (!zG) {
                nodeJ1 = j1().h;
                if (nodeJ1 == null) {
                }
            }
            nodeJ1 = j1();
            for (Modifier.Node nodeO12 = o1(zG); nodeO12 != null; nodeO12 = nodeO12.i) {
                if ((nodeO12.g & 128) == 0) {
                    break;
                }
                if ((nodeO12.f & 128) != 0) {
                    DelegatingNode delegatingNodeB = nodeO12;
                    ?? mutableVector = 0;
                    while (delegatingNodeB != 0) {
                        if (delegatingNodeB instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) delegatingNodeB).G(this.f);
                        } else if ((delegatingNodeB.f & 128) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                            Modifier.Node node = delegatingNodeB.s;
                            int i = 0;
                            delegatingNodeB = delegatingNodeB;
                            mutableVector = mutableVector;
                            while (node != null) {
                                if ((node.f & 128) != 0) {
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
        } finally {
            Snapshot.Companion.e(snapshotA, snapshotB, function1E);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void H1() {
        boolean zG = NodeKindKt.g(128);
        Modifier.Node nodeJ1 = j1();
        if (!zG && (nodeJ1 = nodeJ1.h) == null) {
            return;
        }
        for (Modifier.Node nodeO1 = o1(zG); nodeO1 != null && (nodeO1.g & 128) != 0; nodeO1 = nodeO1.i) {
            if ((nodeO1.f & 128) != 0) {
                DelegatingNode delegatingNodeB = nodeO1;
                ?? mutableVector = 0;
                while (delegatingNodeB != 0) {
                    if (delegatingNodeB instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNodeB).q(this);
                    } else if ((delegatingNodeB.f & 128) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                        Modifier.Node node = delegatingNodeB.s;
                        int i = 0;
                        delegatingNodeB = delegatingNodeB;
                        mutableVector = mutableVector;
                        while (node != null) {
                            if ((node.f & 128) != 0) {
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
            if (nodeO1 == nodeJ1) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0169 A[PHI: r2
  0x0169: PHI (r2v4 androidx.compose.runtime.collection.MutableVector) = 
  (r2v1 androidx.compose.runtime.collection.MutableVector)
  (r2v1 androidx.compose.runtime.collection.MutableVector)
  (r2v6 androidx.compose.runtime.collection.MutableVector)
 binds: [B:38:0x0135, B:40:0x0139, B:54:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I1(final androidx.compose.ui.Modifier.Node r16, final androidx.compose.ui.node.NodeCoordinator.HitTestSource r17, final long r18, final androidx.compose.ui.node.HitTestResult r20, final int r21, final boolean r22, final float r23, final boolean r24) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.I1(androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, int, boolean, float, boolean):void");
    }

    public void L1(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.s;
        if (nodeCoordinator != null) {
            nodeCoordinator.V0(canvas, graphicsLayer);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long M(LayoutCoordinates layoutCoordinates, long j) {
        return C1(layoutCoordinates, j, true);
    }

    public final void M1(long j, float f, Function1 function1, GraphicsLayer graphicsLayer) {
        LayoutNode layoutNode = this.p;
        if (graphicsLayer != null) {
            if (function1 != null) {
                InlineClassHelperKt.a("both ways to create layers shouldn't be used together");
            }
            if (this.M != graphicsLayer) {
                this.M = null;
                d2(null, false);
                this.M = graphicsLayer;
            }
            if (this.L == null) {
                Owner ownerA = LayoutNodeKt.a(layoutNode);
                Function2 function2F1 = f1();
                Function0 function0 = this.J;
                OwnedLayer ownedLayerJ = Owner.j(ownerA, function2F1, function0, graphicsLayer, false, 8);
                ownedLayerJ.f(this.f);
                ownedLayerJ.j(j);
                this.L = ownedLayerJ;
                layoutNode.O = true;
                ((NodeCoordinator$invalidateParentLayer$1) function0).invoke();
            }
        } else {
            if (this.M != null) {
                this.M = null;
                d2(null, false);
            }
            d2(function1, false);
        }
        if (!IntOffset.b(this.C, j)) {
            this.C = j;
            layoutNode.L.p.B0();
            OwnedLayer ownedLayer = this.L;
            if (ownedLayer != null) {
                ownedLayer.j(j);
            } else {
                NodeCoordinator nodeCoordinator = this.t;
                if (nodeCoordinator != null) {
                    nodeCoordinator.z1();
                }
            }
            LookaheadCapablePlaceable.J0(this);
            Owner owner = layoutNode.s;
            if (owner != null) {
                owner.q(layoutNode);
            }
        }
        this.D = f;
        if (this.k) {
            return;
        }
        x0(new PlaceableResult(D0(), this));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates N() {
        if (!j1().q) {
            InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        F1();
        return this.t;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    /* renamed from: N0, reason: from getter */
    public final LayoutNode getP() {
        return this.p;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final void O0() {
        GraphicsLayer graphicsLayer = this.M;
        if (graphicsLayer != null) {
            n0(this.C, this.D, graphicsLayer);
        } else {
            s0(this.C, this.D, this.w);
        }
    }

    public final void O1(MutableRect mutableRect, boolean z, boolean z2) {
        OwnedLayer ownedLayer = this.L;
        if (ownedLayer != null) {
            if (this.v) {
                if (z2) {
                    long jI1 = i1();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jI1 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI1 & 4294967295L)) / 2.0f;
                    long j = this.f;
                    mutableRect.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z) {
                    long j2 = this.f;
                    mutableRect.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (mutableRect.b()) {
                    return;
                }
            }
            ownedLayer.c(mutableRect, false);
        }
        long j3 = this.C;
        float f = (int) (j3 >> 32);
        mutableRect.f1750a += f;
        mutableRect.c += f;
        float f2 = (int) (j3 & 4294967295L);
        mutableRect.b += f2;
        mutableRect.d += f2;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long P(long j) {
        if (!j1().q) {
            InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        LayoutCoordinates layoutCoordinatesC = LayoutCoordinatesKt.c(this);
        return C1(layoutCoordinatesC, Offset.g(LayoutNodeKt.a(this.p).h(j), layoutCoordinatesC.G(0L)), true);
    }

    public final void P0(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.t;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.P0(nodeCoordinator, mutableRect, z);
        }
        long j = this.C;
        float f = (int) (j >> 32);
        mutableRect.f1750a -= f;
        mutableRect.c -= f;
        float f2 = (int) (j & 4294967295L);
        mutableRect.b -= f2;
        mutableRect.d -= f2;
        OwnedLayer ownedLayer = this.L;
        if (ownedLayer != null) {
            ownedLayer.c(mutableRect, true);
            if (this.v && z) {
                long j2 = this.f;
                mutableRect.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final void Q(LayoutCoordinates layoutCoordinates, float[] fArr) {
        NodeCoordinator nodeCoordinatorZ1 = Z1(layoutCoordinates);
        nodeCoordinatorZ1.F1();
        NodeCoordinator nodeCoordinatorA1 = a1(nodeCoordinatorZ1);
        Matrix.d(fArr);
        nodeCoordinatorZ1.c2(nodeCoordinatorA1, fArr);
        b2(nodeCoordinatorA1, fArr);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: Q1 */
    public final float getF() {
        return this.p.D.getF();
    }

    public final long R0(NodeCoordinator nodeCoordinator, long j, boolean z) {
        if (nodeCoordinator == this) {
            return j;
        }
        NodeCoordinator nodeCoordinator2 = this.t;
        return (nodeCoordinator2 == null || Intrinsics.c(nodeCoordinator, nodeCoordinator2)) ? e1(j, z) : e1(nodeCoordinator2.R0(nodeCoordinator, j, z), z);
    }

    public final long S0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - i0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - h0();
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(fMax2) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float T0(long j, long j2) {
        if (i0() >= Float.intBitsToFloat((int) (j2 >> 32)) && h0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jS0 = S0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jS0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jS0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat3 < BitmapDescriptorFactory.HUE_RED ? -fIntBitsToFloat3 : fIntBitsToFloat3 - i0());
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (j & 4294967295L)) < BitmapDescriptorFactory.HUE_RED ? -r9 : r9 - h0())) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
        if ((fIntBitsToFloat <= BitmapDescriptorFactory.HUE_RED && fIntBitsToFloat2 <= BitmapDescriptorFactory.HUE_RED) || Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) > fIntBitsToFloat || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) > fIntBitsToFloat2) {
            return Float.POSITIVE_INFINITY;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        return (fIntBitsToFloat5 * fIntBitsToFloat5) + (fIntBitsToFloat4 * fIntBitsToFloat4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [androidx.compose.runtime.collection.MutableVector] */
    public final void U1(MeasureResult measureResult) {
        NodeCoordinator nodeCoordinator;
        MeasureResult measureResult2 = this.A;
        if (measureResult != measureResult2) {
            this.A = measureResult;
            LayoutNode layoutNode = this.p;
            int i = 0;
            if (measureResult2 == null || measureResult.getF1885a() != measureResult2.getF1885a() || measureResult.getB() != measureResult2.getB()) {
                int f1887a = measureResult.getF1885a();
                int b = measureResult.getB();
                OwnedLayer ownedLayer = this.L;
                if (ownedLayer != null) {
                    ownedLayer.f((f1887a << 32) | (b & 4294967295L));
                } else if (layoutNode.u() && (nodeCoordinator = this.t) != null) {
                    nodeCoordinator.z1();
                }
                u0((b & 4294967295L) | (f1887a << 32));
                if (this.w != null) {
                    e2(false);
                }
                boolean zG = NodeKindKt.g(4);
                Modifier.Node nodeJ1 = j1();
                if (zG || (nodeJ1 = nodeJ1.h) != null) {
                    for (Modifier.Node nodeO1 = o1(zG); nodeO1 != null && (nodeO1.g & 4) != 0; nodeO1 = nodeO1.i) {
                        if ((nodeO1.f & 4) != 0) {
                            DelegatingNode delegatingNodeB = nodeO1;
                            ?? mutableVector = 0;
                            while (delegatingNodeB != 0) {
                                if (delegatingNodeB instanceof DrawModifierNode) {
                                    ((DrawModifierNode) delegatingNodeB).E0();
                                } else if ((delegatingNodeB.f & 4) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                    Modifier.Node node = delegatingNodeB.s;
                                    int i2 = 0;
                                    delegatingNodeB = delegatingNodeB;
                                    mutableVector = mutableVector;
                                    while (node != null) {
                                        if ((node.f & 4) != 0) {
                                            i2++;
                                            mutableVector = mutableVector;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNodeB = DelegatableNodeKt.b(mutableVector);
                            }
                        }
                        if (nodeO1 == nodeJ1) {
                            break;
                        }
                    }
                }
                Owner owner = layoutNode.s;
                if (owner != null) {
                    owner.q(layoutNode);
                }
            }
            MutableObjectIntMap mutableObjectIntMap = this.B;
            if ((mutableObjectIntMap == null || mutableObjectIntMap.e == 0) && measureResult.getF1074a().isEmpty()) {
                return;
            }
            MutableObjectIntMap mutableObjectIntMap2 = this.B;
            Map c = measureResult.getF1074a();
            if (mutableObjectIntMap2 != null && mutableObjectIntMap2.e == c.size()) {
                Object[] objArr = mutableObjectIntMap2.b;
                int[] iArr = mutableObjectIntMap2.c;
                long[] jArr = mutableObjectIntMap2.f692a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) c.get((AlignmentLine) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            layoutNode.L.p.B.g();
            MutableObjectIntMap mutableObjectIntMap3 = this.B;
            if (mutableObjectIntMap3 == null) {
                MutableObjectIntMap mutableObjectIntMap4 = ObjectIntMapKt.f693a;
                mutableObjectIntMap3 = new MutableObjectIntMap();
                this.B = mutableObjectIntMap3;
            }
            mutableObjectIntMap3.c();
            for (Map.Entry entry : measureResult.getF1074a().entrySet()) {
                mutableObjectIntMap3.h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final void V(float[] fArr) {
        Owner ownerA = LayoutNodeKt.a(this.p);
        NodeCoordinator nodeCoordinatorZ1 = Z1(LayoutCoordinatesKt.c(this));
        c2(nodeCoordinatorZ1, fArr);
        if (ownerA instanceof MatrixPositionCalculator) {
            ((MatrixPositionCalculator) ownerA).c(fArr);
            return;
        }
        if (!nodeCoordinatorZ1.j1().q) {
            InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        long jA = LayoutNodeKt.a(nodeCoordinatorZ1.p).A(nodeCoordinatorZ1.G(0L));
        if ((9223372034707292159L & jA) != 9205357640488583168L) {
            Matrix.g(fArr, Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
        }
    }

    public final void V0(Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.L;
        if (ownedLayer != null) {
            ownedLayer.b(canvas, graphicsLayer);
            return;
        }
        long j = this.C;
        float f = (int) (j >> 32);
        float f2 = (int) (j & 4294967295L);
        canvas.c(f, f2);
        W0(canvas, graphicsLayer);
        canvas.c(-f, -f2);
    }

    public final void W0(Canvas canvas, GraphicsLayer graphicsLayer) {
        Canvas canvas2;
        GraphicsLayer graphicsLayer2;
        Modifier.Node nodeK1 = k1(4);
        if (nodeK1 == null) {
            L1(canvas, graphicsLayer);
            return;
        }
        LayoutNode layoutNode = this.p;
        layoutNode.getClass();
        LayoutNodeDrawScope sharedDrawScope = LayoutNodeKt.a(layoutNode).getSharedDrawScope();
        long jD = IntSizeKt.d(this.f);
        sharedDrawScope.getClass();
        MutableVector mutableVector = null;
        while (nodeK1 != null) {
            if (nodeK1 instanceof DrawModifierNode) {
                canvas2 = canvas;
                graphicsLayer2 = graphicsLayer;
                sharedDrawScope.i(canvas2, jD, this, (DrawModifierNode) nodeK1, graphicsLayer2);
            } else {
                canvas2 = canvas;
                graphicsLayer2 = graphicsLayer;
                if ((nodeK1.f & 4) != 0 && (nodeK1 instanceof DelegatingNode)) {
                    int i = 0;
                    for (Modifier.Node node = ((DelegatingNode) nodeK1).s; node != null; node = node.i) {
                        if ((node.f & 4) != 0) {
                            i++;
                            if (i == 1) {
                                nodeK1 = node;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (nodeK1 != null) {
                                    mutableVector.c(nodeK1);
                                    nodeK1 = null;
                                }
                                mutableVector.c(node);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                canvas = canvas2;
                graphicsLayer = graphicsLayer2;
            }
            nodeK1 = DelegatableNodeKt.b(mutableVector);
            canvas = canvas2;
            graphicsLayer = graphicsLayer2;
        }
    }

    public abstract void Z0();

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long a() {
        return this.f;
    }

    public final NodeCoordinator a1(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNodeK = nodeCoordinator.p;
        LayoutNode layoutNode = this.p;
        if (layoutNodeK == layoutNode) {
            Modifier.Node nodeJ1 = nodeCoordinator.j1();
            Modifier.Node nodeJ12 = j1();
            if (!nodeJ12.d.q) {
                InlineClassHelperKt.b("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.Node node = nodeJ12.d.h; node != null; node = node.h) {
                if ((node.f & 2) != 0 && node == nodeJ1) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (layoutNodeK.u > layoutNode.u) {
            layoutNodeK = layoutNodeK.K();
            Intrinsics.e(layoutNodeK);
        }
        LayoutNode layoutNodeK2 = layoutNode;
        while (layoutNodeK2.u > layoutNodeK.u) {
            layoutNodeK2 = layoutNodeK2.K();
            Intrinsics.e(layoutNodeK2);
        }
        while (layoutNodeK != layoutNodeK2) {
            layoutNodeK = layoutNodeK.K();
            layoutNodeK2 = layoutNodeK2.K();
            if (layoutNodeK == null || layoutNodeK2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNodeK2 != layoutNode) {
            if (layoutNodeK != nodeCoordinator.p) {
                return layoutNodeK.K.b;
            }
            return nodeCoordinator;
        }
        return this;
    }

    public final void b2(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (Intrinsics.c(nodeCoordinator, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.t;
        Intrinsics.e(nodeCoordinator2);
        nodeCoordinator2.b2(nodeCoordinator, fArr);
        if (!IntOffset.b(this.C, 0L)) {
            float[] fArr2 = R;
            Matrix.d(fArr2);
            long j = this.C;
            Matrix.h(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)), 4);
            Matrix.f(fArr, fArr2);
        }
        OwnedLayer ownedLayer = this.L;
        if (ownedLayer != null) {
            ownedLayer.i(fArr);
        }
    }

    public final void c2(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!nodeCoordinator2.equals(nodeCoordinator)) {
            OwnedLayer ownedLayer = nodeCoordinator2.L;
            if (ownedLayer != null) {
                ownedLayer.d(fArr);
            }
            if (!IntOffset.b(nodeCoordinator2.C, 0L)) {
                float[] fArr2 = R;
                Matrix.d(fArr2);
                Matrix.h(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L), 4);
                Matrix.f(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.t;
            Intrinsics.e(nodeCoordinator2);
        }
    }

    public final void d2(Function1 function1, boolean z) {
        Owner owner;
        if (function1 != null && this.M != null) {
            InlineClassHelperKt.a("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = this.p;
        boolean z2 = (!z && this.w == function1 && Intrinsics.c(this.x, layoutNode.D) && this.y == layoutNode.E) ? false : true;
        this.x = layoutNode.D;
        this.y = layoutNode.E;
        boolean zQ = layoutNode.q();
        Function0 function0 = this.J;
        if (!zQ || function1 == null) {
            this.w = null;
            OwnedLayer ownedLayer = this.L;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                layoutNode.O = true;
                ((NodeCoordinator$invalidateParentLayer$1) function0).invoke();
                if (j1().q && layoutNode.u() && (owner = layoutNode.s) != null) {
                    owner.q(layoutNode);
                }
            }
            this.L = null;
            this.K = false;
            return;
        }
        this.w = function1;
        if (this.L != null) {
            if (z2 && e2(true)) {
                LayoutNodeKt.a(layoutNode).getRectManager().e(layoutNode);
                return;
            }
            return;
        }
        OwnedLayer ownedLayerJ = Owner.j(LayoutNodeKt.a(layoutNode), f1(), function0, null, layoutNode.j, 4);
        ownedLayerJ.f(this.f);
        ownedLayerJ.j(this.C);
        this.L = ownedLayerJ;
        e2(true);
        layoutNode.O = true;
        ((NodeCoordinator$invalidateParentLayer$1) function0).invoke();
    }

    public final long e1(long j, boolean z) {
        if (z || !this.i) {
            long j2 = this.C;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
            j = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        OwnedLayer ownedLayer = this.L;
        return ownedLayer != null ? ownedLayer.e(j, true) : j;
    }

    public final boolean e2(boolean z) {
        Owner owner;
        boolean z2 = false;
        if (this.M == null) {
            OwnedLayer ownedLayer = this.L;
            if (ownedLayer != null) {
                final Function1 function1 = this.w;
                if (function1 == null) {
                    throw b.w("updateLayerParameters requires a non-null layerBlock");
                }
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = P;
                reusableGraphicsLayerScope.j(1.0f);
                reusableGraphicsLayerScope.l(1.0f);
                reusableGraphicsLayerScope.b(1.0f);
                reusableGraphicsLayerScope.m(BitmapDescriptorFactory.HUE_RED);
                reusableGraphicsLayerScope.c(BitmapDescriptorFactory.HUE_RED);
                reusableGraphicsLayerScope.A(BitmapDescriptorFactory.HUE_RED);
                long j = GraphicsLayerScopeKt.f1769a;
                reusableGraphicsLayerScope.K(j);
                reusableGraphicsLayerScope.L(j);
                reusableGraphicsLayerScope.e(BitmapDescriptorFactory.HUE_RED);
                reusableGraphicsLayerScope.f(BitmapDescriptorFactory.HUE_RED);
                reusableGraphicsLayerScope.g(BitmapDescriptorFactory.HUE_RED);
                reusableGraphicsLayerScope.d(8.0f);
                reusableGraphicsLayerScope.p0(TransformOrigin.b);
                reusableGraphicsLayerScope.H0(RectangleShapeKt.f1779a);
                reusableGraphicsLayerScope.z(false);
                reusableGraphicsLayerScope.k(null);
                reusableGraphicsLayerScope.t = 9205357640488583168L;
                reusableGraphicsLayerScope.x = null;
                reusableGraphicsLayerScope.d = 0;
                LayoutNode layoutNode = this.p;
                reusableGraphicsLayerScope.u = layoutNode.D;
                reusableGraphicsLayerScope.v = layoutNode.E;
                reusableGraphicsLayerScope.t = IntSizeKt.d(this.f);
                LayoutNodeKt.a(layoutNode).getSnapshotObserver().b(this, NodeCoordinator$Companion$onCommitAffectingLayerParams$1.h, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = NodeCoordinator.P;
                        function1.invoke(reusableGraphicsLayerScope2);
                        reusableGraphicsLayerScope2.x = reusableGraphicsLayerScope2.r.a(reusableGraphicsLayerScope2.t, reusableGraphicsLayerScope2.v, reusableGraphicsLayerScope2.u);
                        return Unit.f24250a;
                    }
                });
                LayerPositionalProperties layerPositionalProperties = this.F;
                if (layerPositionalProperties == null) {
                    layerPositionalProperties = new LayerPositionalProperties();
                    this.F = layerPositionalProperties;
                }
                LayerPositionalProperties layerPositionalProperties2 = Q;
                layerPositionalProperties2.getClass();
                layerPositionalProperties2.f1912a = layerPositionalProperties.f1912a;
                layerPositionalProperties2.b = layerPositionalProperties.b;
                layerPositionalProperties2.c = layerPositionalProperties.c;
                layerPositionalProperties2.d = layerPositionalProperties.d;
                layerPositionalProperties2.e = layerPositionalProperties.e;
                layerPositionalProperties2.f = layerPositionalProperties.f;
                layerPositionalProperties2.g = layerPositionalProperties.g;
                layerPositionalProperties2.h = layerPositionalProperties.h;
                layerPositionalProperties2.i = layerPositionalProperties.i;
                layerPositionalProperties.f1912a = reusableGraphicsLayerScope.e;
                layerPositionalProperties.b = reusableGraphicsLayerScope.f;
                layerPositionalProperties.c = reusableGraphicsLayerScope.h;
                layerPositionalProperties.d = reusableGraphicsLayerScope.i;
                layerPositionalProperties.e = reusableGraphicsLayerScope.m;
                layerPositionalProperties.f = reusableGraphicsLayerScope.n;
                layerPositionalProperties.g = reusableGraphicsLayerScope.o;
                layerPositionalProperties.h = reusableGraphicsLayerScope.p;
                layerPositionalProperties.i = reusableGraphicsLayerScope.q;
                ownedLayer.h(reusableGraphicsLayerScope);
                boolean z3 = this.v;
                this.v = reusableGraphicsLayerScope.s;
                this.z = reusableGraphicsLayerScope.g;
                if (layerPositionalProperties2.f1912a == layerPositionalProperties.f1912a && layerPositionalProperties2.b == layerPositionalProperties.b && layerPositionalProperties2.c == layerPositionalProperties.c && layerPositionalProperties2.d == layerPositionalProperties.d && layerPositionalProperties2.e == layerPositionalProperties.e && layerPositionalProperties2.f == layerPositionalProperties.f && layerPositionalProperties2.g == layerPositionalProperties.g && layerPositionalProperties2.h == layerPositionalProperties.h && TransformOrigin.a(layerPositionalProperties2.i, layerPositionalProperties.i)) {
                    z2 = true;
                }
                boolean z4 = !z2;
                if (z && ((!z2 || z3 != this.v) && (owner = layoutNode.s) != null)) {
                    owner.q(layoutNode);
                }
                return z4;
            }
            if (this.w != null) {
                InlineClassHelperKt.b("null layer with a non-null layerBlock");
                return false;
            }
        }
        return false;
    }

    public final Function2 f1() {
        Function2 function2 = this.I;
        if (function2 != null) {
            return function2;
        }
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NodeCoordinator nodeCoordinator = this.h;
                Canvas canvas = nodeCoordinator.H;
                Intrinsics.e(canvas);
                nodeCoordinator.W0(canvas, nodeCoordinator.G);
                return Unit.f24250a;
            }
        };
        Function2<Canvas, GraphicsLayer, Unit> function22 = new Function2<Canvas, GraphicsLayer, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Canvas canvas = (Canvas) obj;
                GraphicsLayer graphicsLayer = (GraphicsLayer) obj2;
                NodeCoordinator nodeCoordinator = this.h;
                LayoutNode layoutNode = nodeCoordinator.p;
                if (layoutNode.u()) {
                    nodeCoordinator.H = canvas;
                    nodeCoordinator.G = graphicsLayer;
                    OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.a(layoutNode).getSnapshotObserver();
                    Function1 function1 = NodeCoordinator.N;
                    snapshotObserver.b(nodeCoordinator, NodeCoordinator$Companion$onCommitAffectingLayer$1.h, function0);
                    nodeCoordinator.K = false;
                } else {
                    nodeCoordinator.K = true;
                }
                return Unit.f24250a;
            }
        };
        this.I = function22;
        return function22;
    }

    public final boolean f2(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        OwnedLayer ownedLayer = this.L;
        return ownedLayer == null || !this.v || ownedLayer.g(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity */
    public final float getE() {
        return this.p.D.getE();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    /* renamed from: getLayoutDirection */
    public final LayoutDirection getD() {
        return this.p.E;
    }

    /* renamed from: h1 */
    public abstract LookaheadDelegate getW();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    /* renamed from: i */
    public final Object getA() {
        LayoutNode layoutNode = this.p;
        if (!layoutNode.K.d(64)) {
            return null;
        }
        j1();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Modifier.Node node = layoutNode.K.d; node != null; node = node.h) {
            if ((node.f & 64) != 0) {
                ?? mutableVector = 0;
                DelegatingNode delegatingNodeB = node;
                while (delegatingNodeB != 0) {
                    if (delegatingNodeB instanceof ParentDataModifierNode) {
                        objectRef.d = ((ParentDataModifierNode) delegatingNodeB).D(layoutNode.D, objectRef.d);
                    } else if ((delegatingNodeB.f & 64) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                        Modifier.Node node2 = delegatingNodeB.s;
                        int i = 0;
                        delegatingNodeB = delegatingNodeB;
                        mutableVector = mutableVector;
                        while (node2 != null) {
                            if ((node2.f & 64) != 0) {
                                i++;
                                mutableVector = mutableVector;
                                if (i == 1) {
                                    delegatingNodeB = node2;
                                } else {
                                    if (mutableVector == 0) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNodeB != 0) {
                                        mutableVector.c(delegatingNodeB);
                                        delegatingNodeB = 0;
                                    }
                                    mutableVector.c(node2);
                                }
                            }
                            node2 = node2.i;
                            delegatingNodeB = delegatingNodeB;
                            mutableVector = mutableVector;
                        }
                        if (i == 1) {
                        }
                    }
                    delegatingNodeB = DelegatableNodeKt.b(mutableVector);
                }
            }
        }
        return objectRef.d;
    }

    public final long i1() {
        return this.x.F(this.p.F.f());
    }

    public abstract Modifier.Node j1();

    public final Modifier.Node k1(int i) {
        boolean zG = NodeKindKt.g(i);
        Modifier.Node nodeJ1 = j1();
        if (!zG && (nodeJ1 = nodeJ1.h) == null) {
            return null;
        }
        for (Modifier.Node nodeO1 = o1(zG); nodeO1 != null && (nodeO1.g & i) != 0; nodeO1 = nodeO1.i) {
            if ((nodeO1.f & i) != 0) {
                return nodeO1;
            }
            if (nodeO1 == nodeJ1) {
                return null;
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long n(long j) {
        if (!j1().q) {
            InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return C1(LayoutCoordinatesKt.c(this), LayoutNodeKt.a(this.p).n(j), true);
    }

    @Override // androidx.compose.ui.layout.Placeable
    public void n0(long j, float f, GraphicsLayer graphicsLayer) {
        if (!this.q) {
            M1(j, f, null, graphicsLayer);
            return;
        }
        LookaheadDelegate lookaheadDelegateH1 = getW();
        Intrinsics.e(lookaheadDelegateH1);
        M1(lookaheadDelegateH1.q, f, null, graphicsLayer);
    }

    public final Modifier.Node o1(boolean z) {
        Modifier.Node nodeJ1;
        NodeChain nodeChain = this.p.K;
        if (nodeChain.c == this) {
            return nodeChain.e;
        }
        if (!z) {
            NodeCoordinator nodeCoordinator = this.t;
            if (nodeCoordinator != null) {
                return nodeCoordinator.j1();
            }
            return null;
        }
        NodeCoordinator nodeCoordinator2 = this.t;
        if (nodeCoordinator2 == null || (nodeJ1 = nodeCoordinator2.j1()) == null) {
            return null;
        }
        return nodeJ1.i;
    }

    public final void p1(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        if (node == null) {
            w1(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        int i2 = hitTestResult.f;
        MutableObjectList mutableObjectList = hitTestResult.d;
        hitTestResult.d(i2 + 1, mutableObjectList.b);
        hitTestResult.f++;
        mutableObjectList.g(node);
        hitTestResult.e.a(HitTestResultKt.a(-1.0f, z, false));
        p1(NodeCoordinatorKt.a(node, hitTestSource.a()), hitTestSource, j, hitTestResult, i, z);
        hitTestResult.f = i2;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean q() {
        return j1().q;
    }

    @Override // androidx.compose.ui.layout.Placeable
    public void s0(long j, float f, Function1 function1) {
        if (!this.q) {
            M1(j, f, function1, null);
            return;
        }
        LookaheadDelegate lookaheadDelegateH1 = getW();
        Intrinsics.e(lookaheadDelegateH1);
        M1(lookaheadDelegateH1.q, f, function1, null);
    }

    public final void s1(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z, float f) {
        if (node == null) {
            w1(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        int i2 = hitTestResult.f;
        MutableObjectList mutableObjectList = hitTestResult.d;
        hitTestResult.d(i2 + 1, mutableObjectList.b);
        hitTestResult.f++;
        mutableObjectList.g(node);
        hitTestResult.e.a(HitTestResultKt.a(f, z, false));
        I1(NodeCoordinatorKt.a(node, hitTestSource.a()), hitTestSource, j, hitTestResult, i, z, f, true);
        hitTestResult.f = i2;
    }

    public final void v1(HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        boolean z2;
        boolean z3;
        Modifier.Node nodeK1 = k1(hitTestSource.a());
        if (!f2(j)) {
            if (i == 1) {
                float fT0 = T0(j, i1());
                if ((Float.floatToRawIntBits(fT0) & Integer.MAX_VALUE) < 2139095040) {
                    if (hitTestResult.f != CollectionsKt.I(hitTestResult)) {
                        if (DistanceAndFlags.a(hitTestResult.b(), HitTestResultKt.a(fT0, false, false)) <= 0) {
                            return;
                        }
                    }
                    s1(nodeK1, hitTestSource, j, hitTestResult, i, false, fT0);
                    return;
                }
                return;
            }
            return;
        }
        if (nodeK1 == null) {
            w1(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= BitmapDescriptorFactory.HUE_RED && fIntBitsToFloat2 >= BitmapDescriptorFactory.HUE_RED && fIntBitsToFloat < i0() && fIntBitsToFloat2 < h0()) {
            p1(nodeK1, hitTestSource, j, hitTestResult, i, z);
            return;
        }
        float fT02 = i == 1 ? T0(j, i1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fT02) & Integer.MAX_VALUE) < 2139095040) {
            if (hitTestResult.f != CollectionsKt.I(hitTestResult)) {
                z2 = z;
                if (DistanceAndFlags.a(hitTestResult.b(), HitTestResultKt.a(fT02, z2, false)) > 0) {
                }
                I1(nodeK1, hitTestSource, j, hitTestResult, i, z2, fT02, z3);
            }
            z2 = z;
            z3 = true;
            I1(nodeK1, hitTestSource, j, hitTestResult, i, z2, fT02, z3);
        }
        z2 = z;
        z3 = false;
        I1(nodeK1, hitTestSource, j, hitTestResult, i, z2, fT02, z3);
    }

    public void w1(HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        NodeCoordinator nodeCoordinator = this.s;
        if (nodeCoordinator != null) {
            nodeCoordinator.v1(hitTestSource, nodeCoordinator.e1(j, true), hitTestResult, i, z);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long y(long j) {
        return LayoutNodeKt.a(this.p).p(G(j));
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean y0() {
        return (this.L == null || this.u || !this.p.q()) ? false : true;
    }

    public final void z1() {
        OwnedLayer ownedLayer = this.L;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.t;
        if (nodeCoordinator != null) {
            nodeCoordinator.z1();
        }
    }
}
