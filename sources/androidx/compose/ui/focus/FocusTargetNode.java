package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "FocusTargetElement", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {
    public final Function2 r;
    public boolean s;
    public boolean t;
    public final int u;
    public int v;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {
        public static final FocusTargetElement d = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final Modifier.Node a() {
            return new FocusTargetNode(0, 7, null);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final /* bridge */ /* synthetic */ void b(Modifier.Node node) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CustomDestinationResult customDestinationResult = CustomDestinationResult.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CustomDestinationResult customDestinationResult2 = CustomDestinationResult.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CustomDestinationResult customDestinationResult3 = CustomDestinationResult.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                FocusStateImpl focusStateImpl = FocusStateImpl.d;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                FocusStateImpl focusStateImpl2 = FocusStateImpl.d;
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                FocusStateImpl focusStateImpl3 = FocusStateImpl.d;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public FocusTargetNode(int i, int i2, Function2 function2) {
        i = (i2 & 1) != 0 ? 1 : i;
        this.r = (i2 & 2) != 0 ? null : function2;
        this.u = i;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    public final boolean T0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zE = false;
            if (!t2().getF1748a()) {
                Trace.endSection();
                return false;
            }
            int iOrdinal = FocusTransactionsKt.d(this, i).ordinal();
            if (iOrdinal == 0) {
                zE = FocusTransactionsKt.e(this);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zE = true;
                } else if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return zE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        int iOrdinal = a1().ordinal();
        if (iOrdinal == 0 || (iOrdinal != 1 && iOrdinal == 2)) {
            FocusOwner focusOwner = DelegatableNodeKt.h(this).getFocusOwner();
            focusOwner.r(8, true, false);
            focusOwner.d();
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void o1() {
        v2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.runtime.collection.MutableVector] */
    public final void s2(FocusStateImpl focusStateImpl, FocusStateImpl focusStateImpl2) {
        NodeChain nodeChain;
        Function2 function2;
        FocusOwner focusOwner = DelegatableNodeKt.h(this).getFocusOwner();
        FocusTargetNode focusTargetNodeC = focusOwner.c();
        if (!focusStateImpl.equals(focusStateImpl2) && (function2 = this.r) != null) {
            function2.invoke(focusStateImpl, focusStateImpl2);
        }
        Modifier.Node node = this.d;
        if (!node.q) {
            InlineClassHelperKt.b("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = this.d;
        LayoutNode layoutNodeG = DelegatableNodeKt.g(this);
        while (layoutNodeG != null) {
            if ((layoutNodeG.K.e.g & 5120) != 0) {
                while (node2 != null) {
                    int i = node2.f;
                    if ((i & 5120) != 0) {
                        if (node2 != node && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            DelegatingNode delegatingNodeB = node2;
                            ?? mutableVector = 0;
                            while (delegatingNodeB != 0) {
                                if (delegatingNodeB instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) delegatingNodeB;
                                    if (focusTargetNodeC == focusOwner.c()) {
                                        focusEventModifierNode.J(focusStateImpl2);
                                    }
                                } else if ((delegatingNodeB.f & 4096) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                    Modifier.Node node3 = delegatingNodeB.s;
                                    int i2 = 0;
                                    delegatingNodeB = delegatingNodeB;
                                    mutableVector = mutableVector;
                                    while (node3 != null) {
                                        if ((node3.f & 4096) != 0) {
                                            i2++;
                                            mutableVector = mutableVector;
                                            if (i2 == 1) {
                                                delegatingNodeB = node3;
                                            } else {
                                                if (mutableVector == 0) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodeB != 0) {
                                                    mutableVector.c(delegatingNodeB);
                                                    delegatingNodeB = 0;
                                                }
                                                mutableVector.c(node3);
                                            }
                                        }
                                        node3 = node3.i;
                                        delegatingNodeB = delegatingNodeB;
                                        mutableVector = mutableVector;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNodeB = DelegatableNodeKt.b(mutableVector);
                            }
                        }
                    }
                    node2 = node2.h;
                }
            }
            layoutNodeG = layoutNodeG.K();
            node2 = (layoutNodeG == null || (nodeChain = layoutNodeG.K) == null) ? null : nodeChain.d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.runtime.collection.MutableVector] */
    public final FocusPropertiesImpl t2() {
        boolean z;
        NodeChain nodeChain;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        int i = this.u;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((InputModeManager) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.m)).a() == 1);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z = false;
        }
        focusPropertiesImpl.a(z);
        Modifier.Node node = this.d;
        if (!node.q) {
            InlineClassHelperKt.b("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = this.d;
        LayoutNode layoutNodeG = DelegatableNodeKt.g(this);
        loop0: while (layoutNodeG != null) {
            if ((layoutNodeG.K.e.g & 3072) != 0) {
                while (node2 != null) {
                    int i2 = node2.f;
                    if ((i2 & 3072) != 0) {
                        if (node2 != node && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            DelegatingNode delegatingNodeB = node2;
                            ?? mutableVector = 0;
                            while (delegatingNodeB != 0) {
                                if (delegatingNodeB instanceof FocusPropertiesModifierNode) {
                                    ((FocusPropertiesModifierNode) delegatingNodeB).E1(focusPropertiesImpl);
                                } else if ((delegatingNodeB.f & 2048) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                    Modifier.Node node3 = delegatingNodeB.s;
                                    int i3 = 0;
                                    delegatingNodeB = delegatingNodeB;
                                    mutableVector = mutableVector;
                                    while (node3 != null) {
                                        if ((node3.f & 2048) != 0) {
                                            i3++;
                                            mutableVector = mutableVector;
                                            if (i3 == 1) {
                                                delegatingNodeB = node3;
                                            } else {
                                                if (mutableVector == 0) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodeB != 0) {
                                                    mutableVector.c(delegatingNodeB);
                                                    delegatingNodeB = 0;
                                                }
                                                mutableVector.c(node3);
                                            }
                                        }
                                        node3 = node3.i;
                                        delegatingNodeB = delegatingNodeB;
                                        mutableVector = mutableVector;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                delegatingNodeB = DelegatableNodeKt.b(mutableVector);
                            }
                        }
                    }
                    node2 = node2.h;
                }
            }
            layoutNodeG = layoutNodeG.K();
            node2 = (layoutNodeG == null || (nodeChain = layoutNodeG.K) == null) ? null : nodeChain.d;
        }
        return focusPropertiesImpl;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public final FocusStateImpl a1() {
        FocusOwner focusOwner;
        FocusTargetNode focusTargetNodeC;
        NodeChain nodeChain;
        if (this.q && (focusTargetNodeC = (focusOwner = DelegatableNodeKt.h(this).getFocusOwner()).c()) != null) {
            if (this == focusTargetNodeC) {
                return focusOwner.g() ? FocusStateImpl.f : FocusStateImpl.d;
            }
            if (focusTargetNodeC.q) {
                if (!focusTargetNodeC.d.q) {
                    InlineClassHelperKt.b("visitAncestors called on an unattached node");
                }
                Modifier.Node node = focusTargetNodeC.d.h;
                LayoutNode layoutNodeG = DelegatableNodeKt.g(focusTargetNodeC);
                while (layoutNodeG != null) {
                    if ((layoutNodeG.K.e.g & 1024) != 0) {
                        while (node != null) {
                            if ((node.f & 1024) != 0) {
                                Modifier.Node nodeB = node;
                                MutableVector mutableVector = null;
                                while (nodeB != null) {
                                    if (nodeB instanceof FocusTargetNode) {
                                        if (this == ((FocusTargetNode) nodeB)) {
                                            return FocusStateImpl.e;
                                        }
                                    } else if ((nodeB.f & 1024) != 0 && (nodeB instanceof DelegatingNode)) {
                                        int i = 0;
                                        for (Modifier.Node node2 = ((DelegatingNode) nodeB).s; node2 != null; node2 = node2.i) {
                                            if ((node2.f & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    nodeB = node2;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodeB != null) {
                                                        mutableVector.c(nodeB);
                                                        nodeB = null;
                                                    }
                                                    mutableVector.c(node2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    nodeB = DelegatableNodeKt.b(mutableVector);
                                }
                            }
                            node = node.h;
                        }
                    }
                    layoutNodeG = layoutNodeG.K();
                    node = (layoutNodeG == null || (nodeChain = layoutNodeG.K) == null) ? null : nodeChain.d;
                }
            }
            return FocusStateImpl.g;
        }
        return FocusStateImpl.g;
    }

    public final void v2() {
        int iOrdinal = a1().ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ObserverModifierNodeKt.a(this, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    objectRef.d = this.t2();
                    return Unit.f24250a;
                }
            });
            Object obj = objectRef.d;
            if (obj == null) {
                Intrinsics.p("focusProperties");
                throw null;
            }
            if (((FocusProperties) obj).getF1748a()) {
                return;
            }
            DelegatableNodeKt.h(this).getFocusOwner().u(true);
        }
    }
}
