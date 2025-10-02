package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TraversableNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.TraversableNode, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    public static final TraversableNode a(TraversableNode traversableNode) {
        NodeChain nodeChain;
        Modifier.Node node = (Modifier.Node) traversableNode;
        if (!node.d.q) {
            InlineClassHelperKt.b("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = node.d.h;
        LayoutNode layoutNodeG = DelegatableNodeKt.g(traversableNode);
        while (layoutNodeG != null) {
            if ((layoutNodeG.K.e.g & 262144) != 0) {
                while (node2 != null) {
                    if ((node2.f & 262144) != 0) {
                        DelegatingNode delegatingNodeB = node2;
                        ?? mutableVector = 0;
                        while (delegatingNodeB != 0) {
                            if (delegatingNodeB instanceof TraversableNode) {
                                TraversableNode traversableNode2 = (TraversableNode) delegatingNodeB;
                                if (Intrinsics.c(traversableNode.getT(), traversableNode2.getT()) && traversableNode.getClass() == traversableNode2.getClass()) {
                                    return traversableNode2;
                                }
                            } else if ((delegatingNodeB.f & 262144) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                Modifier.Node node3 = delegatingNodeB.s;
                                int i = 0;
                                delegatingNodeB = delegatingNodeB;
                                mutableVector = mutableVector;
                                while (node3 != null) {
                                    if ((node3.f & 262144) != 0) {
                                        i++;
                                        mutableVector = mutableVector;
                                        if (i == 1) {
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
                                if (i == 1) {
                                }
                            }
                            delegatingNodeB = DelegatableNodeKt.b(mutableVector);
                        }
                    }
                    node2 = node2.h;
                }
            }
            layoutNodeG = layoutNodeG.K();
            node2 = (layoutNodeG == null || (nodeChain = layoutNodeG.K) == null) ? null : nodeChain.d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.TraversableNode, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
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
    public static final void b(TraversableNode traversableNode, Function1 function1) {
        NodeChain nodeChain;
        Modifier.Node node = (Modifier.Node) traversableNode;
        if (!node.d.q) {
            InlineClassHelperKt.b("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = node.d.h;
        LayoutNode layoutNodeG = DelegatableNodeKt.g(traversableNode);
        while (layoutNodeG != null) {
            if ((layoutNodeG.K.e.g & 262144) != 0) {
                while (node2 != null) {
                    if ((node2.f & 262144) != 0) {
                        DelegatingNode delegatingNodeB = node2;
                        ?? mutableVector = 0;
                        while (delegatingNodeB != 0) {
                            boolean zBooleanValue = true;
                            if (delegatingNodeB instanceof TraversableNode) {
                                TraversableNode traversableNode2 = (TraversableNode) delegatingNodeB;
                                if (Intrinsics.c(traversableNode.getT(), traversableNode2.getT()) && traversableNode.getClass() == traversableNode2.getClass()) {
                                    zBooleanValue = ((Boolean) function1.invoke(traversableNode2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((delegatingNodeB.f & 262144) != 0) && (delegatingNodeB instanceof DelegatingNode)) {
                                    Modifier.Node node3 = delegatingNodeB.s;
                                    int i = 0;
                                    delegatingNodeB = delegatingNodeB;
                                    mutableVector = mutableVector;
                                    while (node3 != null) {
                                        if ((node3.f & 262144) != 0) {
                                            i++;
                                            mutableVector = mutableVector;
                                            if (i == 1) {
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
                                    if (i == 1) {
                                    }
                                }
                            }
                            delegatingNodeB = DelegatableNodeKt.b(mutableVector);
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
    public static final void c(TraversableNode traversableNode, Function1 function1) {
        if (!traversableNode.getD().q) {
            InlineClassHelperKt.b("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node node = traversableNode.getD().i;
        if (node == null) {
            DelegatableNodeKt.a(mutableVector, traversableNode.getD());
        } else {
            mutableVector.c(node);
        }
        while (true) {
            int i = mutableVector.f;
            if (i == 0) {
                return;
            }
            Modifier.Node node2 = (Modifier.Node) mutableVector.l(i - 1);
            if ((node2.g & 262144) != 0) {
                for (Modifier.Node node3 = node2; node3 != null; node3 = node3.i) {
                    if ((node3.f & 262144) != 0) {
                        DelegatingNode delegatingNodeB = node3;
                        ?? mutableVector2 = 0;
                        while (delegatingNodeB != 0) {
                            if (delegatingNodeB instanceof TraversableNode) {
                                TraversableNode traversableNode2 = (TraversableNode) delegatingNodeB;
                                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = (Intrinsics.c(traversableNode.getT(), traversableNode2.getT()) && traversableNode.getClass() == traversableNode2.getClass()) ? (TraversableNode.Companion.TraverseDescendantsAction) function1.invoke(traversableNode2) : TraversableNode.Companion.TraverseDescendantsAction.d;
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.f) {
                                    return;
                                }
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.e) {
                                    break;
                                }
                            } else if ((delegatingNodeB.f & 262144) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                Modifier.Node node4 = delegatingNodeB.s;
                                int i2 = 0;
                                delegatingNodeB = delegatingNodeB;
                                mutableVector2 = mutableVector2;
                                while (node4 != null) {
                                    if ((node4.f & 262144) != 0) {
                                        i2++;
                                        mutableVector2 = mutableVector2;
                                        if (i2 == 1) {
                                            delegatingNodeB = node4;
                                        } else {
                                            if (mutableVector2 == 0) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodeB != 0) {
                                                mutableVector2.c(delegatingNodeB);
                                                delegatingNodeB = 0;
                                            }
                                            mutableVector2.c(node4);
                                        }
                                    }
                                    node4 = node4.i;
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
            DelegatableNodeKt.a(mutableVector, node2);
        }
    }
}
