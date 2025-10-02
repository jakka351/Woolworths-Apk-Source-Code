package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.collection.MutableObjectList;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements FocusOwner {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f1747a;
    public final Function1 b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;
    public final FocusTargetNode f = new FocusTargetNode(2, 6, null);
    public final FocusInvalidationManager g;
    public final FocusTransactionManager h;
    public final FocusOwnerImpl$modifier$1 i;
    public MutableLongSet j;
    public final MutableObjectList k;
    public FocusTargetNode l;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CustomDestinationResult customDestinationResult = CustomDestinationResult.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CustomDestinationResult customDestinationResult2 = CustomDestinationResult.d;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CustomDestinationResult customDestinationResult3 = CustomDestinationResult.d;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public FocusOwnerImpl(Function1 function1, Function2 function2, Function1 function12, Function0 function0, Function0 function02, Function0 function03) {
        this.f1747a = function2;
        this.b = function12;
        this.c = function0;
        this.d = function02;
        this.e = function03;
        this.g = new FocusInvalidationManager(function1, new FocusOwnerImpl$focusInvalidationManager$1(0, this, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0), new FocusOwnerImpl$focusInvalidationManager$2(this, FocusOwnerImpl.class, "rootState", "getRootState()Landroidx/compose/ui/focus/FocusState;", 0), new FocusOwnerImpl$focusInvalidationManager$3(this, FocusOwnerImpl.class, "activeFocusTargetNode", "getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;", 0));
        FocusTransactionManager focusTransactionManager = new FocusTransactionManager();
        ScatterMapKt.b();
        this.h = focusTransactionManager;
        this.i = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final Modifier.Node a() {
                return this.d.f;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final /* bridge */ /* synthetic */ void b(Modifier.Node node) {
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.d.f.hashCode();
            }
        };
        this.k = new MutableObjectList(1);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: a, reason: from getter */
    public final FocusTransactionManager getH() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean b(KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        NodeChain nodeChain;
        DelegatingNode delegatingNodeB;
        NodeChain nodeChain2;
        if (this.g.g) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeB = FocusTraversalKt.b(this.f);
        if (focusTargetNodeB != null) {
            if (!focusTargetNodeB.d.q) {
                InlineClassHelperKt.b("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNodeB.d;
            LayoutNode layoutNodeG = DelegatableNodeKt.g(focusTargetNodeB);
            loop0: while (true) {
                if (layoutNodeG == null) {
                    delegatingNodeB = 0;
                    break;
                }
                if ((layoutNodeG.K.e.g & 131072) != 0) {
                    while (node != null) {
                        if ((node.f & 131072) != 0) {
                            ?? mutableVector = 0;
                            delegatingNodeB = node;
                            while (delegatingNodeB != 0) {
                                if (delegatingNodeB instanceof SoftKeyboardInterceptionModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNodeB.f & 131072) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                    Modifier.Node node2 = delegatingNodeB.s;
                                    int i = 0;
                                    delegatingNodeB = delegatingNodeB;
                                    mutableVector = mutableVector;
                                    while (node2 != null) {
                                        if ((node2.f & 131072) != 0) {
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
                        node = node.h;
                    }
                }
                layoutNodeG = layoutNodeG.K();
                node = (layoutNodeG == null || (nodeChain2 = layoutNodeG.K) == null) ? null : nodeChain2.d;
            }
            softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) delegatingNodeB;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            if (!softKeyboardInterceptionModifierNode.getD().q) {
                InlineClassHelperKt.b("visitAncestors called on an unattached node");
            }
            Modifier.Node node3 = softKeyboardInterceptionModifierNode.getD().h;
            LayoutNode layoutNodeG2 = DelegatableNodeKt.g(softKeyboardInterceptionModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeG2 != null) {
                if ((layoutNodeG2.K.e.g & 131072) != 0) {
                    while (node3 != null) {
                        if ((node3.f & 131072) != 0) {
                            Modifier.Node nodeB = node3;
                            MutableVector mutableVector2 = null;
                            while (nodeB != null) {
                                if (nodeB instanceof SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodeB);
                                } else if ((nodeB.f & 131072) != 0 && (nodeB instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node node4 = ((DelegatingNode) nodeB).s; node4 != null; node4 = node4.i) {
                                        if ((node4.f & 131072) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodeB = node4;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodeB != null) {
                                                    mutableVector2.c(nodeB);
                                                    nodeB = null;
                                                }
                                                mutableVector2.c(node4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodeB = DelegatableNodeKt.b(mutableVector2);
                            }
                        }
                        node3 = node3.h;
                    }
                }
                layoutNodeG2 = layoutNodeG2.K();
                node3 = (layoutNodeG2 == null || (nodeChain = layoutNodeG2.K) == null) ? null : nodeChain.d;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(size)).U(keyEvent)) {
                        break;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            DelegatingNode d = softKeyboardInterceptionModifierNode.getD();
            ?? mutableVector3 = 0;
            while (true) {
                if (d != 0) {
                    if (d instanceof SoftKeyboardInterceptionModifierNode) {
                        if (((SoftKeyboardInterceptionModifierNode) d).U(keyEvent)) {
                            break;
                        }
                    } else if ((d.f & 131072) != 0 && (d instanceof DelegatingNode)) {
                        Modifier.Node node5 = d.s;
                        int i4 = 0;
                        d = d;
                        mutableVector3 = mutableVector3;
                        while (node5 != null) {
                            if ((node5.f & 131072) != 0) {
                                i4++;
                                mutableVector3 = mutableVector3;
                                if (i4 == 1) {
                                    d = node5;
                                } else {
                                    if (mutableVector3 == 0) {
                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (d != 0) {
                                        mutableVector3.c(d);
                                        d = 0;
                                    }
                                    mutableVector3.c(node5);
                                }
                            }
                            node5 = node5.i;
                            d = d;
                            mutableVector3 = mutableVector3;
                        }
                        if (i4 == 1) {
                        }
                    }
                    d = DelegatableNodeKt.b(mutableVector3);
                } else {
                    DelegatingNode d2 = softKeyboardInterceptionModifierNode.getD();
                    ?? mutableVector4 = 0;
                    while (true) {
                        if (d2 != 0) {
                            if (d2 instanceof SoftKeyboardInterceptionModifierNode) {
                                if (((SoftKeyboardInterceptionModifierNode) d2).i0(keyEvent)) {
                                    break;
                                }
                            } else if ((d2.f & 131072) != 0 && (d2 instanceof DelegatingNode)) {
                                Modifier.Node node6 = d2.s;
                                int i5 = 0;
                                d2 = d2;
                                mutableVector4 = mutableVector4;
                                while (node6 != null) {
                                    if ((node6.f & 131072) != 0) {
                                        i5++;
                                        mutableVector4 = mutableVector4;
                                        if (i5 == 1) {
                                            d2 = node6;
                                        } else {
                                            if (mutableVector4 == 0) {
                                                mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (d2 != 0) {
                                                mutableVector4.c(d2);
                                                d2 = 0;
                                            }
                                            mutableVector4.c(node6);
                                        }
                                    }
                                    node6 = node6.i;
                                    d2 = d2;
                                    mutableVector4 = mutableVector4;
                                }
                                if (i5 == 1) {
                                }
                            }
                            d2 = DelegatableNodeKt.b(mutableVector4);
                        } else if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                if (!((SoftKeyboardInterceptionModifierNode) arrayList.get(i6)).i0(keyEvent)) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: c, reason: from getter */
    public final FocusTargetNode getL() {
        return this.l;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void d() {
        FocusInvalidationManager focusInvalidationManager = this.g;
        if (focusInvalidationManager.g) {
            return;
        }
        focusInvalidationManager.f1746a.invoke(new FocusInvalidationManager$setUpOnRequestApplyChangesListener$1(focusInvalidationManager));
        focusInvalidationManager.g = true;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: e, reason: from getter */
    public final FocusOwnerImpl$modifier$1 getI() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r15v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r15v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean f(RotaryScrollEvent rotaryScrollEvent, Function0 function0) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        NodeChain nodeChain;
        DelegatingNode delegatingNodeB;
        NodeChain nodeChain2;
        if (this.g.g) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeB = FocusTraversalKt.b(this.f);
        if (focusTargetNodeB != null) {
            if (!focusTargetNodeB.d.q) {
                InlineClassHelperKt.b("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNodeB.d;
            LayoutNode layoutNodeG = DelegatableNodeKt.g(focusTargetNodeB);
            loop0: while (true) {
                if (layoutNodeG == null) {
                    delegatingNodeB = 0;
                    break;
                }
                if ((layoutNodeG.K.e.g & 16384) != 0) {
                    while (node != null) {
                        if ((node.f & 16384) != 0) {
                            ?? mutableVector = 0;
                            delegatingNodeB = node;
                            while (delegatingNodeB != 0) {
                                if (delegatingNodeB instanceof RotaryInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNodeB.f & 16384) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                    Modifier.Node node2 = delegatingNodeB.s;
                                    int i = 0;
                                    delegatingNodeB = delegatingNodeB;
                                    mutableVector = mutableVector;
                                    while (node2 != null) {
                                        if ((node2.f & 16384) != 0) {
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
                        node = node.h;
                    }
                }
                layoutNodeG = layoutNodeG.K();
                node = (layoutNodeG == null || (nodeChain2 = layoutNodeG.K) == null) ? null : nodeChain2.d;
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) delegatingNodeB;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            if (!rotaryInputModifierNode.getD().q) {
                InlineClassHelperKt.b("visitAncestors called on an unattached node");
            }
            Modifier.Node node3 = rotaryInputModifierNode.getD().h;
            LayoutNode layoutNodeG2 = DelegatableNodeKt.g(rotaryInputModifierNode);
            ArrayList arrayList = null;
            while (layoutNodeG2 != null) {
                if ((layoutNodeG2.K.e.g & 16384) != 0) {
                    while (node3 != null) {
                        if ((node3.f & 16384) != 0) {
                            Modifier.Node nodeB = node3;
                            MutableVector mutableVector2 = null;
                            while (nodeB != null) {
                                if (nodeB instanceof RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodeB);
                                } else if ((nodeB.f & 16384) != 0 && (nodeB instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node node4 = ((DelegatingNode) nodeB).s; node4 != null; node4 = node4.i) {
                                        if ((node4.f & 16384) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodeB = node4;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodeB != null) {
                                                    mutableVector2.c(nodeB);
                                                    nodeB = null;
                                                }
                                                mutableVector2.c(node4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodeB = DelegatableNodeKt.b(mutableVector2);
                            }
                        }
                        node3 = node3.h;
                    }
                }
                layoutNodeG2 = layoutNodeG2.K();
                node3 = (layoutNodeG2 == null || (nodeChain = layoutNodeG2.K) == null) ? null : nodeChain.d;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((RotaryInputModifierNode) arrayList.get(size)).e1(rotaryScrollEvent)) {
                        break;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            DelegatingNode d = rotaryInputModifierNode.getD();
            ?? mutableVector3 = 0;
            while (true) {
                if (d != 0) {
                    if (d instanceof RotaryInputModifierNode) {
                        if (((RotaryInputModifierNode) d).e1(rotaryScrollEvent)) {
                            break;
                        }
                    } else if ((d.f & 16384) != 0 && (d instanceof DelegatingNode)) {
                        Modifier.Node node5 = d.s;
                        int i4 = 0;
                        d = d;
                        mutableVector3 = mutableVector3;
                        while (node5 != null) {
                            if ((node5.f & 16384) != 0) {
                                i4++;
                                mutableVector3 = mutableVector3;
                                if (i4 == 1) {
                                    d = node5;
                                } else {
                                    if (mutableVector3 == 0) {
                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (d != 0) {
                                        mutableVector3.c(d);
                                        d = 0;
                                    }
                                    mutableVector3.c(node5);
                                }
                            }
                            node5 = node5.i;
                            d = d;
                            mutableVector3 = mutableVector3;
                        }
                        if (i4 == 1) {
                        }
                    }
                    d = DelegatableNodeKt.b(mutableVector3);
                } else if (!((Boolean) function0.invoke()).booleanValue()) {
                    DelegatingNode d2 = rotaryInputModifierNode.getD();
                    ?? mutableVector4 = 0;
                    while (true) {
                        if (d2 != 0) {
                            if (d2 instanceof RotaryInputModifierNode) {
                                if (((RotaryInputModifierNode) d2).H1(rotaryScrollEvent)) {
                                    break;
                                }
                            } else if ((d2.f & 16384) != 0 && (d2 instanceof DelegatingNode)) {
                                Modifier.Node node6 = d2.s;
                                int i5 = 0;
                                mutableVector4 = mutableVector4;
                                d2 = d2;
                                while (node6 != null) {
                                    if ((node6.f & 16384) != 0) {
                                        i5++;
                                        mutableVector4 = mutableVector4;
                                        if (i5 == 1) {
                                            d2 = node6;
                                        } else {
                                            if (mutableVector4 == 0) {
                                                mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (d2 != 0) {
                                                mutableVector4.c(d2);
                                                d2 = 0;
                                            }
                                            mutableVector4.c(node6);
                                        }
                                    }
                                    node6 = node6.i;
                                    mutableVector4 = mutableVector4;
                                    d2 = d2;
                                }
                                if (i5 == 1) {
                                }
                            }
                            d2 = DelegatableNodeKt.b(mutableVector4);
                        } else if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                if (!((RotaryInputModifierNode) arrayList.get(i6)).H1(rotaryScrollEvent)) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean g() {
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void i(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.l;
        this.l = focusTargetNode;
        MutableObjectList mutableObjectList = this.k;
        Object[] objArr = mutableObjectList.f694a;
        int i = mutableObjectList.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((FocusListener) objArr[i2]).b(focusTargetNode2, focusTargetNode);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final Boolean j(int i, Rect rect, Function1 function1) {
        FocusTargetNode focusTargetNode = this.f;
        FocusTargetNode focusTargetNodeB = FocusTraversalKt.b(focusTargetNode);
        Function0 function0 = this.e;
        if (focusTargetNodeB != null) {
            FocusRequester focusRequesterA = FocusTraversalKt.a(focusTargetNodeB, i, (LayoutDirection) ((MutablePropertyReference0) function0).get());
            FocusRequester focusRequester = FocusRequester.b;
            if (!Intrinsics.c(focusRequesterA, FocusRequester.Companion.a())) {
                if (Intrinsics.c(focusRequesterA, FocusRequester.Companion.c())) {
                    FocusTargetNode focusTargetNodeB2 = FocusTraversalKt.b(focusTargetNode);
                    if (focusTargetNodeB2 != null) {
                        return (Boolean) function1.invoke(focusTargetNodeB2);
                    }
                } else if (!Intrinsics.c(focusRequesterA, FocusRequester.Companion.b())) {
                    return Boolean.valueOf(focusRequesterA.a(function1));
                }
            }
            return null;
        }
        focusTargetNodeB = null;
        return FocusTraversalKt.d(focusTargetNode, i, (LayoutDirection) ((MutablePropertyReference0) function0).get(), rect, new FocusOwnerImpl$focusSearch$1(focusTargetNodeB, this, function1));
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void k(FocusEventModifierNode focusEventModifierNode) {
        FocusInvalidationManager focusInvalidationManager = this.g;
        if (!focusInvalidationManager.f.e(focusEventModifierNode) || focusInvalidationManager.g) {
            return;
        }
        focusInvalidationManager.f1746a.invoke(new FocusInvalidationManager$setUpOnRequestApplyChangesListener$1(focusInvalidationManager));
        focusInvalidationManager.g = true;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public final boolean l(final int i) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = Boolean.FALSE;
        this.h.getClass();
        FocusTargetNode focusTargetNode = this.l;
        Boolean boolJ = j(i, (Rect) this.d.invoke(), new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zT0 = ((FocusTargetNode) obj).T0(i);
                objectRef.d = Boolean.valueOf(zT0);
                return Boolean.valueOf(zT0);
            }
        });
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.c(boolJ, bool) && focusTargetNode != this.l) {
            return true;
        }
        if (boolJ != null && objectRef.d != null) {
            if (boolJ.equals(bool) && Intrinsics.c(objectRef.d, bool)) {
                return true;
            }
            if (FocusOwnerImplKt.a(i)) {
                if (r(i, false, false)) {
                    Boolean boolJ2 = j(i, null, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(((FocusTargetNode) obj).T0(i));
                        }
                    });
                    if (boolJ2 != null ? boolJ2.booleanValue() : false) {
                        return true;
                    }
                }
            } else if (((Boolean) this.b.invoke(FocusDirection.a(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean m() {
        return ((Boolean) this.f1747a.invoke(null, null)).booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void n(FocusTargetNode focusTargetNode) {
        FocusInvalidationManager focusInvalidationManager = this.g;
        if (!focusInvalidationManager.e.e(focusTargetNode) || focusInvalidationManager.g) {
            return;
        }
        focusInvalidationManager.f1746a.invoke(new FocusInvalidationManager$setUpOnRequestApplyChangesListener$1(focusInvalidationManager));
        focusInvalidationManager.g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:12:0x002c, B:14:0x0030, B:15:0x0038, B:28:0x0058, B:31:0x0063, B:33:0x0069, B:34:0x006e, B:36:0x0076, B:38:0x007b, B:40:0x0081, B:44:0x0087, B:142:0x019b, B:144:0x01a1, B:145:0x01a4, B:147:0x01af, B:150:0x01bb, B:154:0x01c5, B:157:0x01cb, B:158:0x01d0, B:178:0x020a, B:159:0x01d4, B:161:0x01da, B:163:0x01de, B:165:0x01e6, B:167:0x01ec, B:171:0x01f4, B:173:0x01fd, B:174:0x0201, B:175:0x0204, B:179:0x020f, B:180:0x0212, B:182:0x0218, B:184:0x021c, B:187:0x0223, B:189:0x022b, B:196:0x0242, B:197:0x0250, B:199:0x0254, B:201:0x0258, B:228:0x02ae, B:205:0x0264, B:207:0x026d, B:209:0x0271, B:211:0x0278, B:213:0x027e, B:215:0x0282, B:216:0x0285, B:218:0x028b, B:219:0x0292, B:221:0x029a, B:222:0x029f, B:224:0x02a5, B:225:0x02a8, B:229:0x02b9, B:233:0x02c9, B:234:0x02d7, B:236:0x02db, B:238:0x02df, B:265:0x0335, B:242:0x02eb, B:244:0x02f4, B:246:0x02f8, B:248:0x02ff, B:250:0x0305, B:252:0x0309, B:253:0x030c, B:255:0x0312, B:256:0x0319, B:258:0x0321, B:259:0x0326, B:261:0x032c, B:262:0x032f, B:267:0x0342, B:269:0x0349, B:48:0x008f, B:50:0x0095, B:51:0x0098, B:53:0x00a0, B:56:0x00ac, B:60:0x00b6, B:91:0x0109, B:93:0x010d, B:63:0x00bb, B:65:0x00c1, B:67:0x00c5, B:69:0x00cd, B:71:0x00d3, B:75:0x00db, B:77:0x00e4, B:78:0x00e8, B:79:0x00eb, B:82:0x00f1, B:83:0x00f6, B:84:0x00f9, B:86:0x00ff, B:88:0x0103, B:94:0x0113, B:96:0x0119, B:97:0x011c, B:99:0x0126, B:102:0x0132, B:106:0x013c, B:137:0x018f, B:139:0x0193, B:109:0x0141, B:111:0x0147, B:113:0x014b, B:115:0x0153, B:117:0x0159, B:121:0x0161, B:123:0x016a, B:124:0x016e, B:125:0x0171, B:128:0x0177, B:129:0x017c, B:130:0x017f, B:132:0x0185, B:134:0x0189, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:24:0x0050), top: B:278:0x0007 }] */
    @Override // androidx.compose.ui.focus.FocusOwner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(android.view.KeyEvent r14, kotlin.jvm.functions.Function0 r15) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.o(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final FocusStateImpl p() {
        return this.f.a1();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final Rect q() {
        FocusTargetNode focusTargetNodeB = FocusTraversalKt.b(this.f);
        if (focusTargetNodeB != null) {
            return FocusTraversalKt.c(focusTargetNodeB);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean r(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = FocusTransactionsKt.b(this.f, i).ordinal()) == 0) {
            v(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z3 = false;
        }
        if (z3 && z2) {
            this.c.invoke();
        }
        return z3;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void s() {
        FocusTransactionsKt.a(this.f, true);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: t, reason: from getter */
    public final MutableObjectList getK() {
        return this.k;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public final void u(boolean z) {
        r(8, z, true);
    }

    public final boolean v(boolean z) {
        NodeChain nodeChain;
        FocusTargetNode focusTargetNode = this.l;
        if (focusTargetNode != null) {
            i(null);
            focusTargetNode.s2(FocusStateImpl.d, FocusStateImpl.g);
            if (!focusTargetNode.d.q) {
                InlineClassHelperKt.b("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNode.d.h;
            LayoutNode layoutNodeG = DelegatableNodeKt.g(focusTargetNode);
            while (layoutNodeG != null) {
                if ((layoutNodeG.K.e.g & 1024) != 0) {
                    while (node != null) {
                        if ((node.f & 1024) != 0) {
                            MutableVector mutableVector = null;
                            Modifier.Node nodeB = node;
                            while (nodeB != null) {
                                if (nodeB instanceof FocusTargetNode) {
                                    ((FocusTargetNode) nodeB).s2(FocusStateImpl.e, FocusStateImpl.g);
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
        return true;
    }
}
