package androidx.compose.ui.node;

import androidx.camera.core.impl.b;
import androidx.collection.MutableObjectList;
import androidx.compose.foundation.lazy.layout.a;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsListener;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0004\r\u000e\u000f\u0010J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/semantics/SemanticsInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/InteroperableComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "instance", "", "A", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, SemanticsInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final Function0 W = null;
    public boolean A;
    public MeasurePolicy B;
    public IntrinsicsPolicy C;
    public Density D;
    public LayoutDirection E;
    public ViewConfiguration F;
    public CompositionLocalMap G;
    public UsageByParent H;
    public UsageByParent I;
    public boolean J;
    public final NodeChain K;
    public final LayoutNodeLayoutDelegate L;
    public LayoutNodeSubcompositionsState M;
    public NodeCoordinator N;
    public boolean O;
    public Modifier P;
    public Modifier Q;
    public Function1 R;
    public Function1 S;
    public boolean T;
    public boolean U;
    public final boolean d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public LayoutNode m;
    public int n;
    public final MutableVectorWithMutationTracking o;
    public MutableVector p;
    public boolean q;
    public LayoutNode r;
    public Owner s;
    public AndroidViewHolder t;
    public int u;
    public boolean v;
    public boolean w;
    public SemanticsConfiguration x;
    public boolean y;
    public final MutableVector z;
    public static final LayoutNode$Companion$ErrorMeasurePolicy$1 V = new LayoutNode$Companion$ErrorMeasurePolicy$1("Undefined intrinsics block and it is required");
    public static final LayoutNode$Companion$DummyViewConfiguration$1 X = new LayoutNode$Companion$DummyViewConfiguration$1();
    public static final a Y = new a(1);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static Function0 a() {
            LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.V;
            return LayoutNode$Companion$Constructor$1.h;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LayoutState {
        public static final LayoutState d;
        public static final LayoutState e;
        public static final LayoutState f;
        public static final LayoutState g;
        public static final LayoutState h;
        public static final /* synthetic */ LayoutState[] i;
        public static final /* synthetic */ EnumEntries j;

        static {
            LayoutState layoutState = new LayoutState("Measuring", 0);
            d = layoutState;
            LayoutState layoutState2 = new LayoutState("LookaheadMeasuring", 1);
            e = layoutState2;
            LayoutState layoutState3 = new LayoutState("LayingOut", 2);
            f = layoutState3;
            LayoutState layoutState4 = new LayoutState("LookaheadLayingOut", 3);
            g = layoutState4;
            LayoutState layoutState5 = new LayoutState("Idle", 4);
            h = layoutState5;
            LayoutState[] layoutStateArr = {layoutState, layoutState2, layoutState3, layoutState4, layoutState5};
            i = layoutStateArr;
            j = EnumEntriesKt.a(layoutStateArr);
        }

        public static LayoutState valueOf(String str) {
            return (LayoutState) Enum.valueOf(LayoutState.class, str);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) i.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public final String f1918a;

        public NoIntrinsicsMeasurePolicy(String str) {
            this.f1918a = str;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            throw new IllegalStateException(this.f1918a.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int e(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            throw new IllegalStateException(this.f1918a.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            throw new IllegalStateException(this.f1918a.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            throw new IllegalStateException(this.f1918a.toString());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UsageByParent {
        public static final UsageByParent d;
        public static final UsageByParent e;
        public static final UsageByParent f;
        public static final /* synthetic */ UsageByParent[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            UsageByParent usageByParent = new UsageByParent("InMeasureBlock", 0);
            d = usageByParent;
            UsageByParent usageByParent2 = new UsageByParent("InLayoutBlock", 1);
            e = usageByParent2;
            UsageByParent usageByParent3 = new UsageByParent("NotUsed", 2);
            f = usageByParent3;
            UsageByParent[] usageByParentArr = {usageByParent, usageByParent2, usageByParent3};
            g = usageByParentArr;
            h = EnumEntriesKt.a(usageByParentArr);
        }

        public static UsageByParent valueOf(String str) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, str);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) g.clone();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1919a;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                LayoutState layoutState = LayoutState.d;
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f1919a = iArr;
        }
    }

    public LayoutNode(int i) {
        this((i & 1) == 0, SemanticsModifierKt.f2017a.addAndGet(1));
    }

    private final String A(LayoutNode instance) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(instance);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(r(0));
        sb.append(" Other tree: ");
        LayoutNode layoutNode = instance.r;
        sb.append(layoutNode != null ? layoutNode.r(0) : null);
        return sb.toString();
    }

    public static boolean f0(LayoutNode layoutNode) {
        MeasurePassDelegate measurePassDelegate = layoutNode.L.p;
        return layoutNode.e0(measurePassDelegate.m ? new Constraints(measurePassDelegate.g) : null);
    }

    public static void k0(LayoutNode layoutNode, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (layoutNode.m == null) {
            InlineClassHelperKt.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        Owner owner = layoutNode.s;
        if (owner == null || layoutNode.v || layoutNode.d) {
            return;
        }
        owner.i(layoutNode, true, z, z2);
        if (z3) {
            LookaheadPassDelegate lookaheadPassDelegate = layoutNode.L.q;
            Intrinsics.e(lookaheadPassDelegate);
            lookaheadPassDelegate.E0(z);
        }
    }

    public static void m0(LayoutNode layoutNode, boolean z, int i) {
        Owner owner;
        LayoutNode layoutNodeK;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (layoutNode.v || layoutNode.d || (owner = layoutNode.s) == null) {
            return;
        }
        owner.i(layoutNode, false, z, z2);
        if (z3) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.L.p.i;
            LayoutNode layoutNodeK2 = layoutNodeLayoutDelegate.f1921a.K();
            UsageByParent usageByParent = layoutNodeLayoutDelegate.f1921a.H;
            if (layoutNodeK2 == null || usageByParent == UsageByParent.f) {
                return;
            }
            while (layoutNodeK2.H == usageByParent && (layoutNodeK = layoutNodeK2.K()) != null) {
                layoutNodeK2 = layoutNodeK;
            }
            int iOrdinal = usageByParent.ordinal();
            if (iOrdinal == 0) {
                m0(layoutNodeK2, z, 6);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                layoutNodeK2.l0(z);
            }
        }
    }

    public static void n0(LayoutNode layoutNode) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.L;
        if (WhenMappings.f1919a[layoutNodeLayoutDelegate.d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNodeLayoutDelegate.d);
        }
        if (layoutNodeLayoutDelegate.e) {
            k0(layoutNode, true, 6);
            return;
        }
        if (layoutNodeLayoutDelegate.f) {
            layoutNode.j0(true);
        }
        if (layoutNode.G()) {
            m0(layoutNode, true, 6);
        } else if (layoutNode.F()) {
            layoutNode.l0(true);
        }
    }

    public final List B() {
        LookaheadPassDelegate lookaheadPassDelegate = this.L.q;
        Intrinsics.e(lookaheadPassDelegate);
        return lookaheadPassDelegate.w0();
    }

    public final List C() {
        return this.L.p.w0();
    }

    public final List D() {
        return N().g();
    }

    public final List E() {
        return this.o.f1925a.g();
    }

    public final boolean F() {
        return this.L.p.z;
    }

    public final boolean G() {
        return this.L.p.y;
    }

    public final UsageByParent H() {
        return this.L.p.o;
    }

    public final UsageByParent I() {
        UsageByParent usageByParentB0;
        LookaheadPassDelegate lookaheadPassDelegate = this.L.q;
        return (lookaheadPassDelegate == null || (usageByParentB0 = lookaheadPassDelegate.getM()) == null) ? UsageByParent.f : usageByParentB0;
    }

    public final IntrinsicsPolicy J() {
        IntrinsicsPolicy intrinsicsPolicy = this.C;
        if (intrinsicsPolicy != null) {
            return intrinsicsPolicy;
        }
        IntrinsicsPolicy intrinsicsPolicy2 = new IntrinsicsPolicy(this, this.B);
        this.C = intrinsicsPolicy2;
        return intrinsicsPolicy2;
    }

    public final LayoutNode K() {
        LayoutNode layoutNode = this.r;
        while (layoutNode != null && layoutNode.d) {
            layoutNode = layoutNode.r;
        }
        return layoutNode;
    }

    public final int L() {
        return this.L.p.l;
    }

    public final MutableVector M() {
        boolean z = this.A;
        MutableVector mutableVector = this.z;
        if (z) {
            mutableVector.h();
            mutableVector.d(mutableVector.f, N());
            mutableVector.o(Y);
            this.A = false;
        }
        return mutableVector;
    }

    public final MutableVector N() {
        q0();
        if (this.n == 0) {
            return this.o.f1925a;
        }
        MutableVector mutableVector = this.p;
        Intrinsics.e(mutableVector);
        return mutableVector;
    }

    public final void O(long j, HitTestResult hitTestResult, int i, boolean z) {
        NodeChain nodeChain = this.K;
        NodeCoordinator nodeCoordinator = nodeChain.c;
        Function1 function1 = NodeCoordinator.N;
        nodeChain.c.v1(NodeCoordinator.S, nodeCoordinator.e1(j, true), hitTestResult, i, z);
    }

    public final void P(int i, LayoutNode layoutNode) {
        if (layoutNode.r != null && layoutNode.s != null) {
            InlineClassHelperKt.b(A(layoutNode));
        }
        layoutNode.r = this;
        MutableVectorWithMutationTracking mutableVectorWithMutationTracking = this.o;
        mutableVectorWithMutationTracking.f1925a.b(i, layoutNode);
        ((LayoutNode$_foldedChildren$1) mutableVectorWithMutationTracking.b).invoke();
        d0();
        if (layoutNode.d) {
            this.n++;
        }
        Y();
        Owner owner = this.s;
        if (owner != null) {
            layoutNode.n(owner);
        }
        if (layoutNode.L.l > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.L;
            layoutNodeLayoutDelegate.c(layoutNodeLayoutDelegate.l + 1);
        }
    }

    public final void Q() {
        if (this.O) {
            NodeChain nodeChain = this.K;
            NodeCoordinator nodeCoordinator = nodeChain.b;
            NodeCoordinator nodeCoordinator2 = nodeChain.c.t;
            this.N = null;
            while (true) {
                if (Intrinsics.c(nodeCoordinator, nodeCoordinator2)) {
                    break;
                }
                if ((nodeCoordinator != null ? nodeCoordinator.L : null) != null) {
                    this.N = nodeCoordinator;
                    break;
                }
                nodeCoordinator = nodeCoordinator != null ? nodeCoordinator.t : null;
            }
        }
        NodeCoordinator nodeCoordinator3 = this.N;
        if (nodeCoordinator3 != null && nodeCoordinator3.L == null) {
            throw b.w("layer was not set");
        }
        if (nodeCoordinator3 != null) {
            nodeCoordinator3.z1();
            return;
        }
        LayoutNode layoutNodeK = K();
        if (layoutNodeK != null) {
            layoutNodeK.Q();
        }
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public final SemanticsConfiguration R() {
        if (q() && !this.U && this.K.d(8)) {
            return this.x;
        }
        return null;
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public final LayoutNode S() {
        return K();
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public final List T() {
        return D();
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public final boolean U() {
        return this.K.c.A1();
    }

    public final void V() {
        NodeChain nodeChain = this.K;
        InnerNodeCoordinator innerNodeCoordinator = nodeChain.b;
        for (NodeCoordinator nodeCoordinator = nodeChain.c; nodeCoordinator != innerNodeCoordinator; nodeCoordinator = nodeCoordinator.s) {
            Intrinsics.f(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            OwnedLayer ownedLayer = ((LayoutModifierNodeCoordinator) nodeCoordinator).L;
            if (ownedLayer != null) {
                ownedLayer.invalidate();
            }
        }
        OwnedLayer ownedLayer2 = nodeChain.b.L;
        if (ownedLayer2 != null) {
            ownedLayer2.invalidate();
        }
    }

    public final void W() {
        this.i = true;
        if (this.m != null) {
            k0(this, false, 7);
        } else {
            m0(this, false, 7);
        }
    }

    public final void X() {
        if (this.y) {
            return;
        }
        this.K.getClass();
        if (NodeChainKt.f1928a.i != null || this.Q != null) {
            this.w = true;
            return;
        }
        SemanticsConfiguration semanticsConfiguration = this.x;
        this.y = true;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = new SemanticsConfiguration();
        OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.a(this).getSnapshotObserver();
        snapshotObserver.b(this, snapshotObserver.d, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$calculateSemanticsConfiguration$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
            /* JADX WARN: Type inference failed for: r2v10 */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v6 */
            /* JADX WARN: Type inference failed for: r2v7 */
            /* JADX WARN: Type inference failed for: r2v8 */
            /* JADX WARN: Type inference failed for: r2v9 */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v11 */
            /* JADX WARN: Type inference failed for: r3v2 */
            /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.MutableVector] */
            /* JADX WARN: Type inference failed for: r3v4 */
            /* JADX WARN: Type inference failed for: r3v5 */
            /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.MutableVector] */
            /* JADX WARN: Type inference failed for: r3v8 */
            /* JADX WARN: Type inference failed for: r3v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NodeChain nodeChain = this.h.K;
                if ((nodeChain.e.g & 8) != 0) {
                    for (Modifier.Node node = nodeChain.d; node != null; node = node.h) {
                        if ((node.f & 8) != 0) {
                            DelegatingNode delegatingNodeB = node;
                            ?? mutableVector = 0;
                            while (delegatingNodeB != 0) {
                                if (delegatingNodeB instanceof SemanticsModifierNode) {
                                    SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) delegatingNodeB;
                                    boolean s = semanticsModifierNode.getS();
                                    Ref.ObjectRef objectRef2 = objectRef;
                                    if (s) {
                                        SemanticsConfiguration semanticsConfiguration2 = new SemanticsConfiguration();
                                        objectRef2.d = semanticsConfiguration2;
                                        semanticsConfiguration2.g = true;
                                    }
                                    if (semanticsModifierNode.getR()) {
                                        ((SemanticsConfiguration) objectRef2.d).f = true;
                                    }
                                    semanticsModifierNode.b2((SemanticsPropertyReceiver) objectRef2.d);
                                } else if ((delegatingNodeB.f & 8) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                    Modifier.Node node2 = delegatingNodeB.s;
                                    int i = 0;
                                    delegatingNodeB = delegatingNodeB;
                                    mutableVector = mutableVector;
                                    while (node2 != null) {
                                        if ((node2.f & 8) != 0) {
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
                }
                return Unit.f24250a;
            }
        });
        this.y = false;
        this.x = (SemanticsConfiguration) objectRef.d;
        this.w = false;
        Owner ownerA = LayoutNodeKt.a(this);
        MutableObjectList mutableObjectList = ownerA.getSemanticsOwner().d;
        Object[] objArr = mutableObjectList.f694a;
        int i = mutableObjectList.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((SemanticsListener) objArr[i2]).a(this, semanticsConfiguration);
        }
        ownerA.C();
    }

    public final void Y() {
        LayoutNode layoutNode;
        if (this.n > 0) {
            this.q = true;
        }
        if (!this.d || (layoutNode = this.r) == null) {
            return;
        }
        layoutNode.Y();
    }

    public final Boolean Z() {
        LookaheadPassDelegate lookaheadPassDelegate = this.L.q;
        if (lookaheadPassDelegate != null) {
            return Boolean.valueOf(lookaheadPassDelegate.getW());
        }
        return null;
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void a() {
        AndroidViewHolder androidViewHolder = this.t;
        if (androidViewHolder != null) {
            androidViewHolder.a();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.M;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.a();
        }
        NodeChain nodeChain = this.K;
        NodeCoordinator nodeCoordinator = nodeChain.b.s;
        for (NodeCoordinator nodeCoordinator2 = nodeChain.c; !Intrinsics.c(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.s) {
            nodeCoordinator2.u = true;
            ((NodeCoordinator$invalidateParentLayer$1) nodeCoordinator2.J).invoke();
            if (nodeCoordinator2.L != null) {
                if (nodeCoordinator2.M != null) {
                    nodeCoordinator2.M = null;
                }
                nodeCoordinator2.d2(null, false);
                nodeCoordinator2.p.l0(false);
            }
        }
    }

    public final void a0() {
        if (this.H == UsageByParent.f) {
            p();
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.L.q;
        Intrinsics.e(lookaheadPassDelegate);
        lookaheadPassDelegate.a1();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void b(int i) {
        this.k = i;
    }

    public final void b0(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            MutableVectorWithMutationTracking mutableVectorWithMutationTracking = this.o;
            MutableVector mutableVector = mutableVectorWithMutationTracking.f1925a;
            Function0 function0 = mutableVectorWithMutationTracking.b;
            Object objL = mutableVector.l(i5);
            ((LayoutNode$_foldedChildren$1) function0).invoke();
            mutableVectorWithMutationTracking.f1925a.b(i6, (LayoutNode) objL);
            ((LayoutNode$_foldedChildren$1) function0).invoke();
        }
        d0();
        Y();
        W();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void c() {
        AndroidViewHolder androidViewHolder = this.t;
        if (androidViewHolder != null) {
            androidViewHolder.c();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.M;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.e(true);
        }
        this.U = true;
        NodeChain nodeChain = this.K;
        for (Modifier.Node node = nodeChain.d; node != null; node = node.h) {
            if (node.q) {
                node.n2();
            }
        }
        nodeChain.f();
        for (Modifier.Node node2 = nodeChain.d; node2 != null; node2 = node2.h) {
            if (node2.q) {
                node2.j2();
            }
        }
        if (q()) {
            this.x = null;
            this.w = false;
        }
        Owner owner = this.s;
        if (owner != null) {
            owner.D(this);
        }
    }

    public final void c0(LayoutNode layoutNode) {
        if (layoutNode.L.l > 0) {
            this.L.c(r0.l - 1);
        }
        if (this.s != null) {
            layoutNode.s();
        }
        layoutNode.r = null;
        layoutNode.K.c.t = null;
        if (layoutNode.d) {
            this.n--;
            MutableVector mutableVector = layoutNode.o.f1925a;
            Object[] objArr = mutableVector.d;
            int i = mutableVector.f;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).K.c.t = null;
            }
        }
        Y();
        d0();
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public final void d() {
        if (this.m != null) {
            k0(this, false, 5);
        } else {
            m0(this, false, 5);
        }
        MeasurePassDelegate measurePassDelegate = this.L.p;
        Constraints constraints = measurePassDelegate.m ? new Constraints(measurePassDelegate.g) : null;
        if (constraints != null) {
            Owner owner = this.s;
            if (owner != null) {
                owner.g(this, constraints.f2197a);
                return;
            }
            return;
        }
        Owner owner2 = this.s;
        if (owner2 != null) {
            owner2.a(true);
        }
    }

    public final void d0() {
        if (!this.d) {
            this.A = true;
            return;
        }
        LayoutNode layoutNodeK = K();
        if (layoutNodeK != null) {
            layoutNodeK.d0();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void e(LayoutDirection layoutDirection) {
        if (this.E != layoutDirection) {
            this.E = layoutDirection;
            W();
            LayoutNode layoutNodeK = K();
            if (layoutNodeK != null) {
                layoutNodeK.Q();
            }
            V();
            for (Modifier.Node node = this.K.e; node != null; node = node.i) {
                node.j1();
            }
        }
    }

    public final boolean e0(Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.H == UsageByParent.f) {
            o();
        }
        return this.L.p.J0(constraints.f2197a);
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void f(MeasurePolicy measurePolicy) {
        if (Intrinsics.c(this.B, measurePolicy)) {
            return;
        }
        this.B = measurePolicy;
        IntrinsicsPolicy intrinsicsPolicy = this.C;
        if (intrinsicsPolicy != null) {
            intrinsicsPolicy.f(measurePolicy);
        }
        W();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void g(Modifier modifier) {
        if (this.d && this.P != Modifier.Companion.d) {
            InlineClassHelperKt.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.U) {
            InlineClassHelperKt.a("modifier is updated when deactivated");
        }
        if (!q()) {
            this.Q = modifier;
            return;
        }
        m(modifier);
        if (this.w) {
            X();
        }
    }

    public final void g0() {
        MutableVectorWithMutationTracking mutableVectorWithMutationTracking = this.o;
        int i = mutableVectorWithMutationTracking.f1925a.f;
        while (true) {
            i--;
            if (-1 >= i) {
                mutableVectorWithMutationTracking.f1925a.h();
                mutableVectorWithMutationTracking.b.invoke();
                return;
            }
            c0((LayoutNode) mutableVectorWithMutationTracking.f1925a.d[i]);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final int getHeight() {
        return this.L.p.e;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final int getWidth() {
        return this.L.p.d;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void h(Density density) {
        if (Intrinsics.c(this.D, density)) {
            return;
        }
        this.D = density;
        W();
        LayoutNode layoutNodeK = K();
        if (layoutNodeK != null) {
            layoutNodeK.Q();
        }
        V();
        for (Modifier.Node node = this.K.e; node != null; node = node.i) {
            node.P();
        }
    }

    public final void h0(int i, int i2) {
        if (i2 < 0) {
            InlineClassHelperKt.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            MutableVectorWithMutationTracking mutableVectorWithMutationTracking = this.o;
            c0((LayoutNode) mutableVectorWithMutationTracking.f1925a.d[i3]);
            Object objL = mutableVectorWithMutationTracking.f1925a.l(i3);
            ((LayoutNode$_foldedChildren$1) mutableVectorWithMutationTracking.b).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void i(CompositionLocalMap compositionLocalMap) {
        this.G = compositionLocalMap;
        h((Density) compositionLocalMap.a(CompositionLocalsKt.h));
        e((LayoutDirection) compositionLocalMap.a(CompositionLocalsKt.n));
        j((ViewConfiguration) compositionLocalMap.a(CompositionLocalsKt.s));
        Modifier.Node node = this.K.e;
        if ((node.g & 32768) != 0) {
            while (node != null) {
                if ((node.f & 32768) != 0) {
                    DelegatingNode delegatingNodeB = node;
                    ?? mutableVector = 0;
                    while (delegatingNodeB != 0) {
                        if (delegatingNodeB instanceof CompositionLocalConsumerModifierNode) {
                            Modifier.Node d = ((CompositionLocalConsumerModifierNode) delegatingNodeB).getD();
                            if (d.q) {
                                NodeKindKt.c(d);
                            } else {
                                d.m = true;
                            }
                        } else if ((delegatingNodeB.f & 32768) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                            Modifier.Node node2 = delegatingNodeB.s;
                            int i = 0;
                            delegatingNodeB = delegatingNodeB;
                            mutableVector = mutableVector;
                            while (node2 != null) {
                                if ((node2.f & 32768) != 0) {
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
                if ((node.g & 32768) == 0) {
                    return;
                } else {
                    node = node.i;
                }
            }
        }
    }

    public final void i0() {
        LayoutNode layoutNodeK;
        if (this.H == UsageByParent.f) {
            p();
        }
        MeasurePassDelegate measurePassDelegate = this.L.p;
        measurePassDelegate.getClass();
        try {
            measurePassDelegate.j = true;
            if (!measurePassDelegate.n) {
                InlineClassHelperKt.b("replace called on unplaced item");
            }
            boolean z = measurePassDelegate.w;
            measurePassDelegate.E0(measurePassDelegate.q, measurePassDelegate.t, measurePassDelegate.r, measurePassDelegate.s);
            if (z && !measurePassDelegate.J && (layoutNodeK = measurePassDelegate.i.f1921a.K()) != null) {
                layoutNodeK.l0(false);
            }
            measurePassDelegate.j = false;
        } catch (Throwable th) {
            measurePassDelegate.j = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void j(ViewConfiguration viewConfiguration) {
        if (Intrinsics.c(this.F, viewConfiguration)) {
            return;
        }
        this.F = viewConfiguration;
        Modifier.Node node = this.K.e;
        if ((node.g & 16) != 0) {
            while (node != null) {
                if ((node.f & 16) != 0) {
                    DelegatingNode delegatingNodeB = node;
                    ?? mutableVector = 0;
                    while (delegatingNodeB != 0) {
                        if (delegatingNodeB instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) delegatingNodeB).c2();
                        } else if ((delegatingNodeB.f & 16) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                            Modifier.Node node2 = delegatingNodeB.s;
                            int i = 0;
                            delegatingNodeB = delegatingNodeB;
                            mutableVector = mutableVector;
                            while (node2 != null) {
                                if ((node2.f & 16) != 0) {
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
                if ((node.g & 16) == 0) {
                    return;
                } else {
                    node = node.i;
                }
            }
        }
    }

    public final void j0(boolean z) {
        Owner owner;
        if (this.d || (owner = this.s) == null) {
            return;
        }
        owner.o(this, true, z);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void k() {
        if (!q()) {
            InlineClassHelperKt.a("onReuse is only expected on attached node");
        }
        AndroidViewHolder androidViewHolder = this.t;
        if (androidViewHolder != null) {
            androidViewHolder.k();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.M;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.e(false);
        }
        this.y = false;
        boolean z = this.U;
        NodeChain nodeChain = this.K;
        if (z) {
            this.U = false;
        } else {
            for (Modifier.Node node = nodeChain.d; node != null; node = node.h) {
                if (node.q) {
                    node.n2();
                }
            }
            nodeChain.f();
            for (Modifier.Node node2 = nodeChain.d; node2 != null; node2 = node2.h) {
                if (node2.q) {
                    node2.j2();
                }
            }
        }
        int i = this.e;
        this.e = SemanticsModifierKt.f2017a.addAndGet(1);
        Owner owner = this.s;
        if (owner != null) {
            owner.w(i, this);
        }
        for (Modifier.Node node3 = nodeChain.e; node3 != null; node3 = node3.i) {
            node3.i2();
        }
        nodeChain.e();
        if (nodeChain.d(8)) {
            X();
        }
        n0(this);
        Owner owner2 = this.s;
        if (owner2 != null) {
            owner2.x(i, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
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
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public final void l() {
        Modifier.Node node;
        NodeChain nodeChain = this.K;
        InnerNodeCoordinator innerNodeCoordinator = nodeChain.b;
        boolean zG = NodeKindKt.g(128);
        if (zG) {
            node = innerNodeCoordinator.U;
        } else {
            node = innerNodeCoordinator.U.h;
            if (node == null) {
                return;
            }
        }
        Function1 function1 = NodeCoordinator.N;
        for (Modifier.Node nodeO1 = innerNodeCoordinator.o1(zG); nodeO1 != null && (nodeO1.g & 128) != 0; nodeO1 = nodeO1.i) {
            if ((nodeO1.f & 128) != 0) {
                DelegatingNode delegatingNodeB = nodeO1;
                ?? mutableVector = 0;
                while (delegatingNodeB != 0) {
                    if (delegatingNodeB instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNodeB).q(nodeChain.b);
                    } else if ((delegatingNodeB.f & 128) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                        Modifier.Node node2 = delegatingNodeB.s;
                        int i = 0;
                        delegatingNodeB = delegatingNodeB;
                        mutableVector = mutableVector;
                        while (node2 != null) {
                            if ((node2.f & 128) != 0) {
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
            if (nodeO1 == node) {
                return;
            }
        }
    }

    public final void l0(boolean z) {
        Owner owner;
        this.i = true;
        if (this.d || (owner = this.s) == null) {
            return;
        }
        owner.o(this, false, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v34, types: [androidx.compose.ui.node.NodeChain] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.node.NodeChain] */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean] */
    public final void m(Modifier modifier) {
        MutableVector mutableVector;
        NodeChain nodeChain;
        NodeChain nodeChain2;
        this.P = modifier;
        NodeChain nodeChain3 = this.K;
        InnerNodeCoordinator innerNodeCoordinator = nodeChain3.b;
        TailModifierNode tailModifierNode = nodeChain3.d;
        LayoutNode layoutNode = nodeChain3.f1926a;
        Modifier.Node node = nodeChain3.e;
        Modifier.Node nodeB = NodeChainKt.f1928a;
        if (node == nodeB) {
            InlineClassHelperKt.b("padChain called on already padded chain");
        }
        Modifier.Node node2 = nodeChain3.e;
        node2.h = nodeB;
        nodeB.i = node2;
        MutableVector mutableVector2 = nodeChain3.f;
        int i = mutableVector2 != null ? mutableVector2.f : 0;
        final MutableVector mutableVector3 = nodeChain3.g;
        if (mutableVector3 == null) {
            mutableVector3 = new MutableVector(new Modifier.Element[16], 0);
        }
        int i2 = mutableVector3.f;
        if (i2 < 16) {
            i2 = 16;
        }
        MutableVector mutableVector4 = new MutableVector(new Modifier[i2], 0);
        mutableVector4.c(modifier);
        Function1<Modifier.Element, Boolean> function1 = null;
        while (true) {
            int i3 = mutableVector4.f;
            if (i3 == 0) {
                break;
            }
            Modifier modifier2 = (Modifier) mutableVector4.l(i3 - 1);
            if (modifier2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifier2;
                mutableVector4.c(combinedModifier.e);
                mutableVector4.c(combinedModifier.d);
            } else if (modifier2 instanceof Modifier.Element) {
                mutableVector3.c(modifier2);
            } else {
                if (function1 == null) {
                    function1 = new Function1<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.node.NodeChainKt$fillVector$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            mutableVector3.c((Modifier.Element) obj);
                            return Boolean.TRUE;
                        }
                    };
                }
                modifier2.y(function1);
                function1 = function1;
            }
        }
        int i4 = mutableVector3.f;
        if (i4 == i) {
            Modifier.Node node3 = nodeB.i;
            int i5 = 0;
            while (true) {
                if (node3 == null || i5 >= i) {
                    break;
                }
                if (mutableVector2 == null) {
                    throw b.w("expected prior modifier list to be non-empty");
                }
                Modifier.Element element = (Modifier.Element) mutableVector2.d[i5];
                Modifier.Element element2 = (Modifier.Element) mutableVector3.d[i5];
                char c = Intrinsics.c(element, element2) ? (char) 2 : element.getClass() == element2.getClass() ? (char) 1 : (char) 0;
                if (c == 0) {
                    node3 = node3.h;
                    break;
                }
                if (c == 1) {
                    NodeChain.i(element, element2, node3);
                }
                node3 = node3.i;
                i5++;
            }
            if (i5 >= i) {
                nodeChain3 = nodeChain3;
                nodeChain2 = nodeChain3;
                mutableVector = mutableVector3;
            } else {
                if (mutableVector2 == null) {
                    throw b.w("expected prior modifier list to be non-empty");
                }
                if (node3 == null) {
                    throw b.w("structuralUpdate requires a non-null tail");
                }
                i = layoutNode.Q != null ? 1 : 0;
                Modifier.Node node4 = node3;
                ?? r1 = nodeChain3;
                mutableVector = mutableVector3;
                r1.g(i5, mutableVector2, mutableVector, node4, i ^ 1);
                nodeChain = r1;
                i = 1;
                nodeChain2 = nodeChain;
            }
        } else {
            Modifier modifier3 = layoutNode.Q;
            if (modifier3 != null && i == 0) {
                for (int i6 = 0; i6 < mutableVector3.f; i6++) {
                    nodeB = NodeChain.b((Modifier.Element) mutableVector3.d[i6], nodeB);
                }
                for (Modifier.Node node5 = tailModifierNode.h; node5 != null && node5 != NodeChainKt.f1928a; node5 = node5.h) {
                    i |= node5.f;
                    node5.g = i;
                }
                nodeChain = nodeChain3;
                mutableVector = mutableVector3;
            } else if (i4 != 0) {
                if (mutableVector2 == null) {
                    mutableVector2 = new MutableVector(new Modifier.Element[16], 0);
                }
                ?? r12 = nodeChain3;
                mutableVector = mutableVector3;
                r12.g(0, mutableVector2, mutableVector, nodeB, (modifier3 != null ? 1 : 0) ^ 1);
                nodeChain = r12;
            } else {
                if (mutableVector2 == null) {
                    throw b.w("expected prior modifier list to be non-empty");
                }
                Modifier.Node node6 = nodeB.i;
                for (int i7 = 0; node6 != null && i7 < mutableVector2.f; i7++) {
                    node6 = NodeChain.c(node6).i;
                }
                LayoutNode layoutNodeK = layoutNode.K();
                innerNodeCoordinator.t = layoutNodeK != null ? layoutNodeK.K.b : null;
                nodeChain3.c = innerNodeCoordinator;
                nodeChain2 = nodeChain3;
                mutableVector = mutableVector3;
            }
            i = 1;
            nodeChain2 = nodeChain;
        }
        nodeChain2.f = mutableVector;
        if (mutableVector2 != null) {
            mutableVector2.h();
        } else {
            mutableVector2 = null;
        }
        nodeChain2.g = mutableVector2;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1 = NodeChainKt.f1928a;
        ?? r3 = nodeChainKt$SentinelHead$1.i;
        if (r3 != 0) {
            tailModifierNode = r3;
        }
        tailModifierNode.h = null;
        nodeChainKt$SentinelHead$1.i = null;
        nodeChainKt$SentinelHead$1.g = -1;
        nodeChainKt$SentinelHead$1.k = null;
        if (tailModifierNode == nodeChainKt$SentinelHead$1) {
            InlineClassHelperKt.b("trimChain did not update the head");
        }
        nodeChain2.e = tailModifierNode;
        if (i != 0) {
            nodeChain2.h();
        }
        this.L.i();
        if (this.m == null && nodeChain2.d(512)) {
            p0(this);
        }
    }

    public final void n(Owner owner) {
        LayoutNode layoutNode;
        if (this.s != null) {
            InlineClassHelperKt.b("Cannot attach " + this + " as it already is attached.  Tree: " + r(0));
        }
        LayoutNode layoutNode2 = this.r;
        if (layoutNode2 != null && !Intrinsics.c(layoutNode2.s, owner)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(owner);
            sb.append(") than the parent's owner(");
            LayoutNode layoutNodeK = K();
            sb.append(layoutNodeK != null ? layoutNodeK.s : null);
            sb.append("). This tree: ");
            sb.append(r(0));
            sb.append(" Parent tree: ");
            LayoutNode layoutNode3 = this.r;
            sb.append(layoutNode3 != null ? layoutNode3.r(0) : null);
            InlineClassHelperKt.b(sb.toString());
        }
        LayoutNode layoutNodeK2 = K();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.L;
        if (layoutNodeK2 == null) {
            layoutNodeLayoutDelegate.p.w = true;
            LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.q;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.R0();
            }
        }
        NodeChain nodeChain = this.K;
        nodeChain.c.t = layoutNodeK2 != null ? layoutNodeK2.K.b : null;
        this.s = owner;
        this.u = (layoutNodeK2 != null ? layoutNodeK2.u : -1) + 1;
        Modifier modifier = this.Q;
        if (modifier != null) {
            m(modifier);
        }
        this.Q = null;
        owner.u(this);
        if (this.l) {
            p0(this);
        } else {
            LayoutNode layoutNode4 = this.r;
            if (layoutNode4 == null || (layoutNode = layoutNode4.m) == null) {
                layoutNode = this.m;
            }
            p0(layoutNode);
            if (this.m == null && nodeChain.d(512)) {
                p0(this);
            }
        }
        if (!this.U) {
            for (Modifier.Node node = nodeChain.e; node != null; node = node.i) {
                node.i2();
            }
        }
        MutableVector mutableVector = this.o.f1925a;
        Object[] objArr = mutableVector.d;
        int i = mutableVector.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).n(owner);
        }
        if (!this.U) {
            nodeChain.e();
        }
        W();
        if (layoutNodeK2 != null) {
            layoutNodeK2.W();
        }
        NodeCoordinator nodeCoordinator = nodeChain.b.s;
        for (NodeCoordinator nodeCoordinator2 = nodeChain.c; !Intrinsics.c(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.s) {
            nodeCoordinator2.d2(nodeCoordinator2.w, true);
            OwnedLayer ownedLayer = nodeCoordinator2.L;
            if (ownedLayer != null) {
                ownedLayer.invalidate();
            }
        }
        Function1 function1 = this.R;
        if (function1 != null) {
            function1.invoke(owner);
        }
        layoutNodeLayoutDelegate.i();
        if (!this.U && nodeChain.d(8)) {
            X();
        }
        owner.t(this);
    }

    public final void o() {
        this.I = this.H;
        this.H = UsageByParent.f;
        MutableVector mutableVectorN = N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.H != UsageByParent.f) {
                layoutNode.o();
            }
        }
    }

    public final void o0() {
        MutableVector mutableVectorN = N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            UsageByParent usageByParent = layoutNode.I;
            layoutNode.H = usageByParent;
            if (usageByParent != UsageByParent.f) {
                layoutNode.o0();
            }
        }
    }

    public final void p() {
        this.I = this.H;
        this.H = UsageByParent.f;
        MutableVector mutableVectorN = N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.H == UsageByParent.e) {
                layoutNode.p();
            }
        }
    }

    public final void p0(LayoutNode layoutNode) {
        if (Intrinsics.c(layoutNode, this.m)) {
            return;
        }
        this.m = layoutNode;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.L;
        if (layoutNode != null) {
            if (layoutNodeLayoutDelegate.q == null) {
                layoutNodeLayoutDelegate.q = new LookaheadPassDelegate(layoutNodeLayoutDelegate);
            }
            NodeChain nodeChain = this.K;
            NodeCoordinator nodeCoordinator = nodeChain.b.s;
            for (NodeCoordinator nodeCoordinator2 = nodeChain.c; !Intrinsics.c(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.s) {
                nodeCoordinator2.Z0();
            }
        } else {
            layoutNodeLayoutDelegate.q = null;
        }
        W();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final boolean q() {
        return this.s != null;
    }

    public final void q0() {
        if (this.n <= 0 || !this.q) {
            return;
        }
        this.q = false;
        MutableVector mutableVector = this.p;
        if (mutableVector == null) {
            mutableVector = new MutableVector(new LayoutNode[16], 0);
            this.p = mutableVector;
        }
        mutableVector.h();
        MutableVector mutableVector2 = this.o.f1925a;
        Object[] objArr = mutableVector2.d;
        int i = mutableVector2.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.d) {
                mutableVector.d(mutableVector.f, layoutNode.N());
            } else {
                mutableVector.c(layoutNode);
            }
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.L;
        layoutNodeLayoutDelegate.p.D = true;
        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.q;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.e1();
        }
    }

    public final String r(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector mutableVectorN = N();
        Object[] objArr = mutableVectorN.d;
        int i3 = mutableVectorN.f;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((LayoutNode) objArr[i4]).r(i + 1));
        }
        String string = sb.toString();
        if (i != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void s() {
        AlignmentLines alignmentLinesO;
        Owner owner = this.s;
        if (owner == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode layoutNodeK = K();
            sb.append(layoutNodeK != null ? layoutNodeK.r(0) : null);
            InlineClassHelperKt.c(sb.toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode layoutNodeK2 = K();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.L;
        if (layoutNodeK2 != null) {
            layoutNodeK2.Q();
            layoutNodeK2.W();
            layoutNodeLayoutDelegate.p.o = UsageByParent.f;
            LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.q;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.f1();
            }
        }
        LayoutNodeAlignmentLines layoutNodeAlignmentLines = layoutNodeLayoutDelegate.p.B;
        layoutNodeAlignmentLines.b = true;
        layoutNodeAlignmentLines.c = false;
        layoutNodeAlignmentLines.e = false;
        layoutNodeAlignmentLines.d = false;
        layoutNodeAlignmentLines.f = false;
        layoutNodeAlignmentLines.g = false;
        layoutNodeAlignmentLines.h = null;
        LookaheadPassDelegate lookaheadPassDelegate2 = layoutNodeLayoutDelegate.q;
        if (lookaheadPassDelegate2 != null && (alignmentLinesO = lookaheadPassDelegate2.o()) != null) {
            alignmentLinesO.b = true;
            alignmentLinesO.c = false;
            alignmentLinesO.e = false;
            alignmentLinesO.d = false;
            alignmentLinesO.f = false;
            alignmentLinesO.g = false;
            alignmentLinesO.h = null;
        }
        Function1 function1 = this.S;
        if (function1 != null) {
            function1.invoke(owner);
        }
        NodeChain nodeChain = this.K;
        nodeChain.f();
        this.v = true;
        MutableVector mutableVector = this.o.f1925a;
        Object[] objArr = mutableVector.d;
        int i = mutableVector.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).s();
        }
        this.v = false;
        for (Modifier.Node node = nodeChain.d; node != null; node = node.h) {
            if (node.q) {
                node.j2();
            }
        }
        owner.y(this);
        this.s = null;
        p0(null);
        this.u = 0;
        MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate.p;
        measurePassDelegate.l = Integer.MAX_VALUE;
        measurePassDelegate.k = Integer.MAX_VALUE;
        measurePassDelegate.w = false;
        LookaheadPassDelegate lookaheadPassDelegate3 = layoutNodeLayoutDelegate.q;
        if (lookaheadPassDelegate3 != null) {
            lookaheadPassDelegate3.T0();
        }
        if (nodeChain.d(8)) {
            SemanticsConfiguration semanticsConfiguration = this.x;
            this.x = null;
            this.w = false;
            MutableObjectList mutableObjectList = owner.getSemanticsOwner().d;
            Object[] objArr2 = mutableObjectList.f694a;
            int i3 = mutableObjectList.b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((SemanticsListener) objArr2[i4]).a(this, semanticsConfiguration);
            }
            owner.C();
        }
    }

    public final void t(Canvas canvas, GraphicsLayer graphicsLayer) {
        this.K.c.V0(canvas, graphicsLayer);
    }

    public final String toString() {
        return JvmActuals_jvmKt.a(this) + " children: " + D().size() + " measurePolicy: " + this.B;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final boolean u() {
        return this.L.p.w;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final LayoutCoordinates v() {
        return this.K.b;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    /* renamed from: w, reason: from getter */
    public final int getE() {
        return this.e;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final LayoutNode x() {
        return K();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final List y() {
        NodeChain nodeChain = this.K;
        MutableVector mutableVector = nodeChain.f;
        if (mutableVector == null) {
            return EmptyList.d;
        }
        int i = 0;
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.f], 0);
        Modifier.Node node = nodeChain.e;
        while (node != null) {
            TailModifierNode tailModifierNode = nodeChain.d;
            if (node == tailModifierNode) {
                break;
            }
            NodeCoordinator nodeCoordinator = node.k;
            if (nodeCoordinator == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            OwnedLayer ownedLayer = nodeCoordinator.L;
            OwnedLayer ownedLayer2 = nodeChain.b.L;
            Modifier.Node node2 = node.i;
            if (node2 != tailModifierNode || nodeCoordinator == node2.k) {
                ownedLayer2 = null;
            }
            if (ownedLayer == null) {
                ownedLayer = ownedLayer2;
            }
            mutableVector2.c(new ModifierInfo((Modifier) mutableVector.d[i], nodeCoordinator, ownedLayer));
            node = node.i;
            i++;
        }
        return mutableVector2.g();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean y0() {
        return q();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    /* renamed from: z, reason: from getter */
    public final boolean getU() {
        return this.U;
    }

    public LayoutNode(boolean z, int i) {
        this.d = z;
        this.e = i;
        this.f = 9223372034707292159L;
        this.g = 0L;
        this.h = 9223372034707292159L;
        this.i = true;
        this.o = new MutableVectorWithMutationTracking(new MutableVector(new LayoutNode[16], 0), new LayoutNode$_foldedChildren$1(this));
        this.z = new MutableVector(new LayoutNode[16], 0);
        this.A = true;
        this.B = V;
        this.D = LayoutNodeKt.f1920a;
        this.E = LayoutDirection.d;
        this.F = X;
        CompositionLocalMap.d3.getClass();
        this.G = CompositionLocalMap.Companion.b;
        UsageByParent usageByParent = UsageByParent.f;
        this.H = usageByParent;
        this.I = usageByParent;
        this.K = new NodeChain(this);
        this.L = new LayoutNodeLayoutDelegate(this);
        this.O = true;
        this.P = Modifier.Companion.d;
    }
}
