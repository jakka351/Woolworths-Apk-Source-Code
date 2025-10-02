package androidx.compose.ui.layout;

import YU.a;
import android.view.ViewGroup;
import androidx.collection.MutableOrderedScatterSet;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "ApproachMeasureScopeImpl", "NodeState", "Scope", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {
    public final LayoutNode d;
    public CompositionContext e;
    public SubcomposeSlotReusePolicy f;
    public int g;
    public int h;
    public final MutableScatterMap i;
    public final MutableScatterMap j;
    public final Scope k;
    public final ApproachMeasureScopeImpl l;
    public final MutableScatterMap m;
    public final SubcomposeSlotReusePolicy.SlotIdsSet n;
    public final MutableScatterMap o;
    public final MutableVector p;
    public int q;
    public int r;
    public final String s;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ApproachMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {
        public final /* synthetic */ Scope d;

        public ApproachMeasureScopeImpl() {
            this.d = LayoutNodeSubcompositionsState.this.k;
        }

        @Override // androidx.compose.ui.unit.Density
        public final float B(int i) {
            return this.d.B(i);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public final MeasureResult B1(int i, int i2, Map map, Function1 function1) {
            return this.d.B1(i, i2, map, function1);
        }

        @Override // androidx.compose.ui.unit.Density
        public final float C(float f) {
            return f / this.d.getE();
        }

        @Override // androidx.compose.ui.unit.Density
        public final long F(long j) {
            return this.d.F(j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public final long H(float f) {
            return this.d.H(f);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public final MeasureResult L0(int i, int i2, Map map, Function1 function1) {
            return this.d.B1(i, i2, map, function1);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: Q1 */
        public final float getF() {
            return this.d.f;
        }

        @Override // androidx.compose.ui.unit.Density
        public final float T1(float f) {
            return this.d.getE() * f;
        }

        @Override // androidx.compose.ui.unit.Density
        public final int W1(long j) {
            return this.d.W1(j);
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public final List X0(Object obj, Function2 function2) {
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            LayoutNode layoutNode = layoutNodeSubcompositionsState.d;
            LayoutNode layoutNode2 = (LayoutNode) layoutNodeSubcompositionsState.j.e(obj);
            if (layoutNode2 != null && layoutNode.E().indexOf(layoutNode2) < layoutNodeSubcompositionsState.g) {
                return layoutNode2.C();
            }
            MutableScatterMap mutableScatterMap = layoutNodeSubcompositionsState.m;
            MutableVector mutableVector = layoutNodeSubcompositionsState.p;
            if (mutableVector.f < layoutNodeSubcompositionsState.h) {
                InlineClassHelperKt.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
            }
            int i = mutableVector.f;
            int i2 = layoutNodeSubcompositionsState.h;
            if (i == i2) {
                mutableVector.c(obj);
            } else {
                Object[] objArr = mutableVector.d;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
            }
            layoutNodeSubcompositionsState.h++;
            if (!mutableScatterMap.b(obj)) {
                layoutNodeSubcompositionsState.o.m(obj, layoutNodeSubcompositionsState.f(obj, function2));
                if (layoutNode.L.d == LayoutNode.LayoutState.f) {
                    layoutNode.j0(true);
                } else {
                    LayoutNode.k0(layoutNode, true, 6);
                }
            }
            LayoutNode layoutNode3 = (LayoutNode) mutableScatterMap.e(obj);
            if (layoutNode3 == null) {
                return EmptyList.d;
            }
            List listW0 = layoutNode3.L.p.w0();
            int size = listW0.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((MeasurePassDelegate) listW0.get(i3)).i.b = true;
            }
            return listW0;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: getDensity */
        public final float getE() {
            return this.d.e;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        /* renamed from: getLayoutDirection */
        public final LayoutDirection getD() {
            return this.d.d;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public final boolean l1() {
            return this.d.l1();
        }

        @Override // androidx.compose.ui.unit.Density
        public final long p(long j) {
            return this.d.p(j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public final float r(long j) {
            return this.d.r(j);
        }

        @Override // androidx.compose.ui.unit.Density
        public final int r1(float f) {
            return this.d.r1(f);
        }

        @Override // androidx.compose.ui.unit.Density
        public final long t(int i) {
            return this.d.t(i);
        }

        @Override // androidx.compose.ui.unit.Density
        public final float t1(long j) {
            return this.d.t1(j);
        }

        @Override // androidx.compose.ui.unit.Density
        public final long v(float f) {
            return this.d.v(f);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NodeState {

        /* renamed from: a, reason: collision with root package name */
        public Object f1884a;
        public Function2 b;
        public ReusableComposition c;
        public boolean d;
        public boolean e;
        public MutableState f;
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class Scope implements SubcomposeMeasureScope {
        public LayoutDirection d = LayoutDirection.e;
        public float e;
        public float f;

        public Scope() {
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public final MeasureResult B1(final int i, final int i2, final Map map, final Function1 function1) {
            if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
                InlineClassHelperKt.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
                @Override // androidx.compose.ui.layout.MeasureResult
                /* renamed from: getHeight, reason: from getter */
                public final int getB() {
                    return i2;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                /* renamed from: getWidth, reason: from getter */
                public final int getF1885a() {
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
                    LookaheadDelegate lookaheadDelegate;
                    boolean zL1 = this.l1();
                    Function1 function12 = function1;
                    LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                    if (!zL1 || (lookaheadDelegate = layoutNodeSubcompositionsState2.d.K.b.V) == null) {
                        function12.invoke(layoutNodeSubcompositionsState2.d.K.b.l);
                    } else {
                        function12.invoke(lookaheadDelegate.l);
                    }
                }
            };
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: Q1, reason: from getter */
        public final float getF() {
            return this.f;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public final List X0(Object obj, Function2 function2) {
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            layoutNodeSubcompositionsState.d();
            LayoutNode layoutNode = layoutNodeSubcompositionsState.d;
            LayoutNode.LayoutState layoutState = layoutNode.L.d;
            LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.d;
            if (layoutState != layoutState2 && layoutState != LayoutNode.LayoutState.f && layoutState != LayoutNode.LayoutState.e && layoutState != LayoutNode.LayoutState.g) {
                InlineClassHelperKt.b("subcompose can only be used inside the measure or layout blocks");
            }
            MutableScatterMap mutableScatterMap = layoutNodeSubcompositionsState.j;
            Object objE = mutableScatterMap.e(obj);
            if (objE == null) {
                objE = (LayoutNode) layoutNodeSubcompositionsState.m.k(obj);
                if (objE != null) {
                    if (layoutNodeSubcompositionsState.r <= 0) {
                        InlineClassHelperKt.b("Check failed.");
                    }
                    layoutNodeSubcompositionsState.r--;
                } else {
                    objE = layoutNodeSubcompositionsState.h(obj);
                    if (objE == null) {
                        int i = layoutNodeSubcompositionsState.g;
                        LayoutNode layoutNode2 = new LayoutNode(2);
                        layoutNode.v = true;
                        layoutNode.P(i, layoutNode2);
                        layoutNode.v = false;
                        objE = layoutNode2;
                    }
                }
                mutableScatterMap.m(obj, objE);
            }
            LayoutNode layoutNode3 = (LayoutNode) objE;
            if (CollectionsKt.J(layoutNodeSubcompositionsState.g, layoutNode.E()) != layoutNode3) {
                int iIndexOf = layoutNode.E().indexOf(layoutNode3);
                if (iIndexOf < layoutNodeSubcompositionsState.g) {
                    InlineClassHelperKt.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                }
                int i2 = layoutNodeSubcompositionsState.g;
                if (i2 != iIndexOf) {
                    layoutNode.v = true;
                    layoutNode.b0(iIndexOf, i2, 1);
                    layoutNode.v = false;
                }
            }
            layoutNodeSubcompositionsState.g++;
            layoutNodeSubcompositionsState.g(layoutNode3, obj, function2);
            return (layoutState == layoutState2 || layoutState == LayoutNode.LayoutState.f) ? layoutNode3.C() : layoutNode3.B();
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: getDensity, reason: from getter */
        public final float getE() {
            return this.e;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        /* renamed from: getLayoutDirection, reason: from getter */
        public final LayoutDirection getD() {
            return this.d;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public final boolean l1() {
            LayoutNode.LayoutState layoutState = LayoutNodeSubcompositionsState.this.d.L.d;
            return layoutState == LayoutNode.LayoutState.g || layoutState == LayoutNode.LayoutState.e;
        }
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.d = layoutNode;
        this.f = subcomposeSlotReusePolicy;
        long[] jArr = ScatterMapKt.f699a;
        this.i = new MutableScatterMap();
        this.j = new MutableScatterMap();
        this.k = new Scope();
        this.l = new ApproachMeasureScopeImpl();
        this.m = new MutableScatterMap();
        this.n = new SubcomposeSlotReusePolicy.SlotIdsSet();
        this.o = new MutableScatterMap();
        this.p = new MutableVector(new Object[16], 0);
        this.s = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            androidx.compose.ui.node.LayoutNode r2 = r0.d
            r2.v = r1
            androidx.collection.MutableScatterMap r1 = r0.i
            java.lang.Object[] r3 = r1.c
            long[] r4 = r1.f698a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState r13 = (androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState) r13
            androidx.compose.runtime.ReusableComposition r13 = r13.c
            if (r13 == 0) goto L47
            r13.dispose()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.g0()
            r2.v = r6
            r1.g()
            androidx.collection.MutableScatterMap r1 = r0.j
            r1.g()
            r0.r = r6
            r0.q = r6
            androidx.collection.MutableScatterMap r1 = r0.m
            r1.g()
            r0.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.a():void");
    }

    public final void b(int i) {
        boolean z = false;
        this.q = 0;
        LayoutNode layoutNode = this.d;
        List listE = layoutNode.E();
        int size = (listE.size() - this.r) - 1;
        if (i <= size) {
            SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet = this.n;
            slotIdsSet.clear();
            MutableOrderedScatterSet mutableOrderedScatterSet = slotIdsSet.d;
            MutableScatterMap mutableScatterMap = this.i;
            if (i <= size) {
                int i2 = i;
                while (true) {
                    Object objE = mutableScatterMap.e((LayoutNode) listE.get(i2));
                    Intrinsics.e(objE);
                    mutableOrderedScatterSet.b(((NodeState) objE).f1884a);
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f.a(slotIdsSet);
            Snapshot snapshotA = Snapshot.Companion.a();
            Function1 g = snapshotA != null ? snapshotA.getG() : null;
            Snapshot snapshotB = Snapshot.Companion.b(snapshotA);
            boolean z2 = false;
            while (size >= i) {
                try {
                    LayoutNode layoutNode2 = (LayoutNode) listE.get(size);
                    Object objE2 = mutableScatterMap.e(layoutNode2);
                    Intrinsics.e(objE2);
                    NodeState nodeState = (NodeState) objE2;
                    Object obj = nodeState.f1884a;
                    if (mutableOrderedScatterSet.a(obj)) {
                        this.q++;
                        if (((Boolean) ((SnapshotMutableStateImpl) nodeState.f).getD()).booleanValue()) {
                            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode2.L;
                            layoutNodeLayoutDelegate.p.o = LayoutNode.UsageByParent.f;
                            LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.q;
                            if (lookaheadPassDelegate != null) {
                                lookaheadPassDelegate.f1();
                            }
                            ((SnapshotMutableStateImpl) nodeState.f).setValue(Boolean.FALSE);
                            z2 = true;
                        }
                    } else {
                        layoutNode.v = true;
                        mutableScatterMap.k(layoutNode2);
                        ReusableComposition reusableComposition = nodeState.c;
                        if (reusableComposition != null) {
                            reusableComposition.dispose();
                        }
                        layoutNode.h0(size, 1);
                        layoutNode.v = false;
                    }
                    this.j.k(obj);
                    size--;
                } catch (Throwable th) {
                    Snapshot.Companion.e(snapshotA, snapshotB, g);
                    throw th;
                }
            }
            Snapshot.Companion.e(snapshotA, snapshotB, g);
            z = z2;
        }
        if (z) {
            Snapshot.Companion.f();
        }
        d();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void c() {
        e(true);
    }

    public final void d() {
        int size = this.d.E().size();
        MutableScatterMap mutableScatterMap = this.i;
        if (mutableScatterMap.e != size) {
            InlineClassHelperKt.a("Inconsistency between the count of nodes tracked by the state (" + mutableScatterMap.e + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((size - this.q) - this.r < 0) {
            StringBuilder sbR = a.r(size, "Incorrect state. Total children ", ". Reusable children ");
            sbR.append(this.q);
            sbR.append(". Precomposed children ");
            sbR.append(this.r);
            InlineClassHelperKt.a(sbR.toString());
        }
        MutableScatterMap mutableScatterMap2 = this.m;
        if (mutableScatterMap2.e == this.r) {
            return;
        }
        InlineClassHelperKt.a("Incorrect state. Precomposed children " + this.r + ". Map size " + mutableScatterMap2.e);
    }

    public final void e(boolean z) {
        this.r = 0;
        this.m.g();
        List listE = this.d.E();
        int size = listE.size();
        if (this.q != size) {
            this.q = size;
            Snapshot snapshotA = Snapshot.Companion.a();
            Function1 g = snapshotA != null ? snapshotA.getG() : null;
            Snapshot snapshotB = Snapshot.Companion.b(snapshotA);
            for (int i = 0; i < size; i++) {
                try {
                    LayoutNode layoutNode = (LayoutNode) listE.get(i);
                    NodeState nodeState = (NodeState) this.i.e(layoutNode);
                    if (nodeState != null && ((Boolean) ((SnapshotMutableStateImpl) nodeState.f).getD()).booleanValue()) {
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.L;
                        layoutNodeLayoutDelegate.p.o = LayoutNode.UsageByParent.f;
                        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.q;
                        if (lookaheadPassDelegate != null) {
                            lookaheadPassDelegate.f1();
                        }
                        if (z) {
                            ReusableComposition reusableComposition = nodeState.c;
                            if (reusableComposition != null) {
                                reusableComposition.deactivate();
                            }
                            nodeState.f = SnapshotStateKt.f(Boolean.FALSE);
                        } else {
                            ((SnapshotMutableStateImpl) nodeState.f).setValue(Boolean.FALSE);
                        }
                        nodeState.f1884a = SubcomposeLayoutKt.f1895a;
                    }
                } catch (Throwable th) {
                    Snapshot.Companion.e(snapshotA, snapshotB, g);
                    throw th;
                }
            }
            Snapshot.Companion.e(snapshotA, snapshotB, g);
            this.j.g();
        }
        d();
    }

    public final SubcomposeLayoutState.PrecomposedSlotHandle f(final Object obj, Function2 function2) {
        LayoutNode layoutNode = this.d;
        if (!layoutNode.q()) {
            return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$1
                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
                public final void dispose() {
                }
            };
        }
        d();
        if (!this.j.c(obj)) {
            this.o.k(obj);
            MutableScatterMap mutableScatterMap = this.m;
            Object objE = mutableScatterMap.e(obj);
            if (objE == null) {
                objE = h(obj);
                if (objE != null) {
                    int iIndexOf = layoutNode.E().indexOf(objE);
                    int size = layoutNode.E().size();
                    layoutNode.v = true;
                    layoutNode.b0(iIndexOf, size, 1);
                    layoutNode.v = false;
                    this.r++;
                } else {
                    int size2 = layoutNode.E().size();
                    LayoutNode layoutNode2 = new LayoutNode(2);
                    layoutNode.v = true;
                    layoutNode.P(size2, layoutNode2);
                    layoutNode.v = false;
                    this.r++;
                    objE = layoutNode2;
                }
                mutableScatterMap.m(obj, objE);
            }
            g((LayoutNode) objE, obj, function2);
        }
        return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function1] */
            /* JADX WARN: Type inference failed for: r7v0 */
            /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
            /* JADX WARN: Type inference failed for: r7v10 */
            /* JADX WARN: Type inference failed for: r7v11 */
            /* JADX WARN: Type inference failed for: r7v12 */
            /* JADX WARN: Type inference failed for: r7v13 */
            /* JADX WARN: Type inference failed for: r7v14 */
            /* JADX WARN: Type inference failed for: r7v15 */
            /* JADX WARN: Type inference failed for: r7v7 */
            /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.Modifier$Node] */
            /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v0 */
            /* JADX WARN: Type inference failed for: r8v1 */
            /* JADX WARN: Type inference failed for: r8v10 */
            /* JADX WARN: Type inference failed for: r8v11 */
            /* JADX WARN: Type inference failed for: r8v2 */
            /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.MutableVector] */
            /* JADX WARN: Type inference failed for: r8v4 */
            /* JADX WARN: Type inference failed for: r8v5 */
            /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.MutableVector] */
            /* JADX WARN: Type inference failed for: r8v8 */
            /* JADX WARN: Type inference failed for: r8v9 */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public final void a(Function1 function1) {
                NodeChain nodeChain;
                Modifier.Node node;
                LayoutNode layoutNode3 = (LayoutNode) this.f1886a.m.e(obj);
                if (layoutNode3 == null || (nodeChain = layoutNode3.K) == null || (node = nodeChain.e) == null) {
                    return;
                }
                if (!node.d.q) {
                    InlineClassHelperKt.b("visitSubtreeIf called on an unattached node");
                }
                MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node node2 = node.d;
                Modifier.Node node3 = node2.i;
                if (node3 == null) {
                    DelegatableNodeKt.a(mutableVector, node2);
                } else {
                    mutableVector.c(node3);
                }
                while (true) {
                    int i = mutableVector.f;
                    if (i == 0) {
                        return;
                    }
                    Modifier.Node node4 = (Modifier.Node) mutableVector.l(i - 1);
                    if ((node4.g & 262144) != 0) {
                        for (Modifier.Node node5 = node4; node5 != null; node5 = node5.i) {
                            if ((node5.f & 262144) != 0) {
                                DelegatingNode delegatingNodeB = node5;
                                ?? mutableVector2 = 0;
                                while (delegatingNodeB != 0) {
                                    if (delegatingNodeB instanceof TraversableNode) {
                                        TraversableNode traversableNode = (TraversableNode) delegatingNodeB;
                                        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(traversableNode.getT()) ? (TraversableNode.Companion.TraverseDescendantsAction) function1.invoke(traversableNode) : TraversableNode.Companion.TraverseDescendantsAction.d;
                                        if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.f) {
                                            return;
                                        }
                                        if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.e) {
                                            break;
                                        }
                                    } else if ((delegatingNodeB.f & 262144) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                        Modifier.Node node6 = delegatingNodeB.s;
                                        int i2 = 0;
                                        delegatingNodeB = delegatingNodeB;
                                        mutableVector2 = mutableVector2;
                                        while (node6 != null) {
                                            if ((node6.f & 262144) != 0) {
                                                i2++;
                                                mutableVector2 = mutableVector2;
                                                if (i2 == 1) {
                                                    delegatingNodeB = node6;
                                                } else {
                                                    if (mutableVector2 == 0) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (delegatingNodeB != 0) {
                                                        mutableVector2.c(delegatingNodeB);
                                                        delegatingNodeB = 0;
                                                    }
                                                    mutableVector2.c(node6);
                                                }
                                            }
                                            node6 = node6.i;
                                            delegatingNodeB = delegatingNodeB;
                                            mutableVector2 = mutableVector2;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    delegatingNodeB = DelegatableNodeKt.b(mutableVector2);
                                }
                            }
                        }
                    }
                    DelegatableNodeKt.a(mutableVector, node4);
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public final int b() {
                LayoutNode layoutNode3 = (LayoutNode) this.f1886a.m.e(obj);
                if (layoutNode3 != null) {
                    return layoutNode3.D().size();
                }
                return 0;
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public final void c(int i, long j) {
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f1886a;
                LayoutNode layoutNode3 = (LayoutNode) layoutNodeSubcompositionsState.m.e(obj);
                if (layoutNode3 == null || !layoutNode3.q()) {
                    return;
                }
                int size3 = layoutNode3.D().size();
                if (i < 0 || i >= size3) {
                    InlineClassHelperKt.d("Index (" + i + ") is out of bound of [0, " + size3 + ')');
                }
                if (layoutNode3.u()) {
                    InlineClassHelperKt.a("Pre-measure called on node that is not placed");
                }
                LayoutNode layoutNode4 = layoutNodeSubcompositionsState.d;
                layoutNode4.v = true;
                LayoutNodeKt.a(layoutNode3).g((LayoutNode) layoutNode3.D().get(i), j);
                layoutNode4.v = false;
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public final void dispose() {
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f1886a;
                LayoutNode layoutNode3 = layoutNodeSubcompositionsState.d;
                layoutNodeSubcompositionsState.d();
                LayoutNode layoutNode4 = (LayoutNode) layoutNodeSubcompositionsState.m.k(obj);
                if (layoutNode4 != null) {
                    if (layoutNodeSubcompositionsState.r <= 0) {
                        InlineClassHelperKt.b("No pre-composed items to dispose");
                    }
                    int iIndexOf2 = layoutNode3.E().indexOf(layoutNode4);
                    if (iIndexOf2 < layoutNode3.E().size() - layoutNodeSubcompositionsState.r) {
                        InlineClassHelperKt.b("Item is not in pre-composed item range");
                    }
                    layoutNodeSubcompositionsState.q++;
                    layoutNodeSubcompositionsState.r--;
                    int size3 = (layoutNode3.E().size() - layoutNodeSubcompositionsState.r) - layoutNodeSubcompositionsState.q;
                    layoutNode3.v = true;
                    layoutNode3.b0(iIndexOf2, size3, 1);
                    layoutNode3.v = false;
                    layoutNodeSubcompositionsState.b(size3);
                }
            }
        };
    }

    public final void g(LayoutNode layoutNode, Object obj, Function2 function2) {
        MutableScatterMap mutableScatterMap = this.i;
        Object objE = mutableScatterMap.e(layoutNode);
        Object obj2 = objE;
        if (objE == null) {
            ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$SubcomposeLayoutKt.f1879a;
            NodeState nodeState = new NodeState();
            nodeState.f1884a = obj;
            nodeState.b = composableLambdaImpl;
            nodeState.c = null;
            nodeState.f = SnapshotStateKt.f(Boolean.TRUE);
            mutableScatterMap.m(layoutNode, nodeState);
            obj2 = nodeState;
        }
        final NodeState nodeState2 = (NodeState) obj2;
        ReusableComposition reusableComposition = nodeState2.c;
        boolean zQ = reusableComposition != null ? reusableComposition.q() : true;
        if (nodeState2.b != function2 || zQ || nodeState2.d) {
            nodeState2.b = function2;
            Snapshot snapshotA = Snapshot.Companion.a();
            Function1 g = snapshotA != null ? snapshotA.getG() : null;
            Snapshot snapshotB = Snapshot.Companion.b(snapshotA);
            try {
                LayoutNode layoutNode2 = this.d;
                layoutNode2.v = true;
                final Function2 function22 = nodeState2.b;
                ReusableComposition compositionImpl = nodeState2.c;
                CompositionContext compositionContext = this.e;
                if (compositionContext == null) {
                    InlineClassHelperKt.c("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                boolean z = nodeState2.e;
                ComposableLambdaImpl composableLambdaImpl2 = new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Composer composer = (Composer) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Boolean bool = (Boolean) ((SnapshotMutableStateImpl) nodeState2.f).getD();
                            boolean zBooleanValue = bool.booleanValue();
                            composer.h(bool);
                            boolean zP = composer.p(zBooleanValue);
                            if (zBooleanValue) {
                                function22.invoke(composer, 0);
                            } else {
                                composer.b(zP);
                            }
                            composer.E();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -1750409193);
                if (compositionImpl == null || compositionImpl.getW()) {
                    ViewGroup.LayoutParams layoutParams = Wrapper_androidKt.f1994a;
                    compositionImpl = new CompositionImpl(compositionContext, new UiApplier(layoutNode));
                }
                if (z) {
                    compositionImpl.t(composableLambdaImpl2);
                } else {
                    compositionImpl.d(composableLambdaImpl2);
                }
                nodeState2.c = compositionImpl;
                nodeState2.e = false;
                layoutNode2.v = false;
                Snapshot.Companion.e(snapshotA, snapshotB, g);
                nodeState2.d = false;
            } catch (Throwable th) {
                Snapshot.Companion.e(snapshotA, snapshotB, g);
                throw th;
            }
        }
    }

    public final LayoutNode h(Object obj) {
        MutableScatterMap mutableScatterMap;
        int i;
        if (this.q == 0) {
            return null;
        }
        LayoutNode layoutNode = this.d;
        List listE = layoutNode.E();
        int size = listE.size() - this.r;
        int i2 = size - this.q;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            mutableScatterMap = this.i;
            if (i4 < i2) {
                i = -1;
                break;
            }
            Object objE = mutableScatterMap.e((LayoutNode) listE.get(i4));
            Intrinsics.e(objE);
            if (Intrinsics.c(((NodeState) objE).f1884a, obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (i3 >= i2) {
                Object objE2 = mutableScatterMap.e((LayoutNode) listE.get(i3));
                Intrinsics.e(objE2);
                NodeState nodeState = (NodeState) objE2;
                Object obj2 = nodeState.f1884a;
                if (obj2 == SubcomposeLayoutKt.f1895a || this.f.b(obj, obj2)) {
                    nodeState.f1884a = obj;
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
            i4 = i3;
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            layoutNode.v = true;
            layoutNode.b0(i4, i2, 1);
            layoutNode.v = false;
        }
        this.q--;
        LayoutNode layoutNode2 = (LayoutNode) listE.get(i2);
        Object objE3 = mutableScatterMap.e(layoutNode2);
        Intrinsics.e(objE3);
        NodeState nodeState2 = (NodeState) objE3;
        nodeState2.f = SnapshotStateKt.f(Boolean.TRUE);
        nodeState2.e = true;
        nodeState2.d = true;
        return layoutNode2;
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void k() {
        e(false);
    }
}
