package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FocusTraversalKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutDirection layoutDirection = LayoutDirection.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FocusStateImpl focusStateImpl = FocusStateImpl.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                FocusStateImpl focusStateImpl2 = FocusStateImpl.d;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                FocusStateImpl focusStateImpl3 = FocusStateImpl.d;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public static final FocusRequester a(FocusTargetNode focusTargetNode, int i, LayoutDirection layoutDirection) {
        FocusRequester focusRequester;
        FocusPropertiesImpl focusPropertiesImplT2 = focusTargetNode.t2();
        FocusRequester focusRequester2 = focusPropertiesImplT2.h;
        FocusRequester focusRequester3 = focusPropertiesImplT2.i;
        if (i == 1) {
            return focusPropertiesImplT2.b;
        }
        if (i == 2) {
            return focusPropertiesImplT2.c;
        }
        if (i == 5) {
            return focusPropertiesImplT2.d;
        }
        if (i == 6) {
            return focusPropertiesImplT2.e;
        }
        if (i == 3) {
            int iOrdinal = layoutDirection.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                focusRequester2 = focusRequester3;
            }
            focusRequester = focusRequester2 != FocusRequester.b ? focusRequester2 : null;
            return focusRequester == null ? focusPropertiesImplT2.f : focusRequester;
        }
        if (i == 4) {
            int iOrdinal2 = layoutDirection.ordinal();
            if (iOrdinal2 == 0) {
                focusRequester2 = focusRequester3;
            } else if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            focusRequester = focusRequester2 != FocusRequester.b ? focusRequester2 : null;
            return focusRequester == null ? focusPropertiesImplT2.g : focusRequester;
        }
        if (i != 7 && i != 8) {
            throw new IllegalStateException("invalid FocusDirection");
        }
        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i);
        FocusTargetNodeKt.a(focusTargetNode);
        FocusOwner focusOwner = DelegatableNodeKt.h(focusTargetNode).getFocusOwner();
        FocusTargetNode focusTargetNodeC = focusOwner.getL();
        if (i == 7) {
            focusPropertiesImplT2.j.invoke(cancelIndicatingFocusBoundaryScope);
        } else {
            focusPropertiesImplT2.k.invoke(cancelIndicatingFocusBoundaryScope);
        }
        return cancelIndicatingFocusBoundaryScope.b ? FocusRequester.c : focusTargetNodeC != focusOwner.getL() ? FocusRequester.d : FocusRequester.b;
    }

    public static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeC = DelegatableNodeKt.h(focusTargetNode).getFocusOwner().getL();
        if (focusTargetNodeC == null || !focusTargetNodeC.q) {
            return null;
        }
        return focusTargetNodeC;
    }

    public static final Rect c(FocusTargetNode focusTargetNode) {
        NodeCoordinator nodeCoordinator = focusTargetNode.k;
        return nodeCoordinator != null ? LayoutCoordinatesKt.c(nodeCoordinator).D(nodeCoordinator, false) : Rect.e;
    }

    public static final Boolean d(FocusTargetNode focusTargetNode, int i, LayoutDirection layoutDirection, Rect rect, Function1 function1) {
        boolean zA;
        NodeChain nodeChain;
        if (i == 1 || i == 2) {
            if (i == 1) {
                zA = OneDimensionalFocusSearchKt.b(focusTargetNode, function1);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zA = OneDimensionalFocusSearchKt.a(focusTargetNode, function1);
            }
            return Boolean.valueOf(zA);
        }
        int i2 = 3;
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return TwoDimensionalFocusSearchKt.k(i, focusTargetNode, rect, function1);
        }
        FocusTargetNode focusTargetNode2 = null;
        if (i == 7) {
            int iOrdinal = layoutDirection.ordinal();
            if (iOrdinal == 0) {
                i2 = 4;
            } else if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            FocusTargetNode focusTargetNodeB = b(focusTargetNode);
            if (focusTargetNodeB != null) {
                return TwoDimensionalFocusSearchKt.k(i2, focusTargetNodeB, rect, function1);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.c(i))).toString());
        }
        FocusTargetNode focusTargetNodeB2 = b(focusTargetNode);
        boolean zBooleanValue = false;
        if (focusTargetNodeB2 != null) {
            if (!focusTargetNodeB2.d.q) {
                InlineClassHelperKt.b("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNodeB2.d.h;
            LayoutNode layoutNodeG = DelegatableNodeKt.g(focusTargetNodeB2);
            loop0: while (true) {
                if (layoutNodeG == null) {
                    break;
                }
                if ((layoutNodeG.K.e.g & 1024) != 0) {
                    while (node != null) {
                        if ((node.f & 1024) != 0) {
                            Modifier.Node nodeB = node;
                            MutableVector mutableVector = null;
                            while (nodeB != null) {
                                if (nodeB instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) nodeB;
                                    if (focusTargetNode3.t2().f1748a) {
                                        focusTargetNode2 = focusTargetNode3;
                                        break loop0;
                                    }
                                } else if ((nodeB.f & 1024) != 0 && (nodeB instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node node2 = ((DelegatingNode) nodeB).s; node2 != null; node2 = node2.i) {
                                        if ((node2.f & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
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
                                    if (i3 == 1) {
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
        if (focusTargetNode2 != null && !focusTargetNode2.equals(focusTargetNode)) {
            zBooleanValue = ((Boolean) ((FocusOwnerImpl$focusSearch$1) function1).invoke(focusTargetNode2)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0027, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode e(androidx.compose.ui.focus.FocusTargetNode r9) {
        /*
            androidx.compose.ui.Modifier$Node r0 = r9.d
            boolean r0 = r0.q
            r1 = 0
            if (r0 != 0) goto L9
            goto La4
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.b(r0)
        L10:
            androidx.compose.runtime.collection.MutableVector r0 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r0.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r9 = r9.d
            androidx.compose.ui.Modifier$Node r3 = r9.i
            if (r3 != 0) goto L24
            androidx.compose.ui.node.DelegatableNodeKt.a(r0, r9)
            goto L27
        L24:
            r0.c(r3)
        L27:
            int r9 = r0.f
            if (r9 == 0) goto La4
            int r9 = r9 + (-1)
            java.lang.Object r9 = r0.l(r9)
            androidx.compose.ui.Modifier$Node r9 = (androidx.compose.ui.Modifier.Node) r9
            int r3 = r9.g
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3d
            androidx.compose.ui.node.DelegatableNodeKt.a(r0, r9)
            goto L27
        L3d:
            if (r9 == 0) goto L27
            int r3 = r9.f
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La1
            r3 = r1
        L46:
            if (r9 == 0) goto L27
            boolean r5 = r9 instanceof androidx.compose.ui.focus.FocusTargetNode
            r6 = 1
            if (r5 == 0) goto L66
            androidx.compose.ui.focus.FocusTargetNode r9 = (androidx.compose.ui.focus.FocusTargetNode) r9
            androidx.compose.ui.Modifier$Node r5 = r9.d
            boolean r5 = r5.q
            if (r5 == 0) goto L9c
            androidx.compose.ui.focus.FocusStateImpl r5 = r9.a1()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L65
            if (r5 == r6) goto L65
            r6 = 2
            if (r5 == r6) goto L65
            goto L9c
        L65:
            return r9
        L66:
            int r5 = r9.f
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L9c
            boolean r5 = r9 instanceof androidx.compose.ui.node.DelegatingNode
            if (r5 == 0) goto L9c
            r5 = r9
            androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5
            androidx.compose.ui.Modifier$Node r5 = r5.s
            r7 = r4
        L76:
            if (r5 == 0) goto L99
            int r8 = r5.f
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L96
            int r7 = r7 + 1
            if (r7 != r6) goto L84
            r9 = r5
            goto L96
        L84:
            if (r3 != 0) goto L8d
            androidx.compose.runtime.collection.MutableVector r3 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r2]
            r3.<init>(r8, r4)
        L8d:
            if (r9 == 0) goto L93
            r3.c(r9)
            r9 = r1
        L93:
            r3.c(r5)
        L96:
            androidx.compose.ui.Modifier$Node r5 = r5.i
            goto L76
        L99:
            if (r7 != r6) goto L9c
            goto L46
        L9c:
            androidx.compose.ui.Modifier$Node r9 = androidx.compose.ui.node.DelegatableNodeKt.b(r3)
            goto L46
        La1:
            androidx.compose.ui.Modifier$Node r9 = r9.i
            goto L3d
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.e(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean f(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator nodeCoordinator;
        LayoutNode layoutNode2;
        NodeCoordinator nodeCoordinator2 = focusTargetNode.k;
        return (nodeCoordinator2 == null || (layoutNode = nodeCoordinator2.p) == null || !layoutNode.u() || (nodeCoordinator = focusTargetNode.k) == null || (layoutNode2 = nodeCoordinator.p) == null || !layoutNode2.q()) ? false : true;
    }
}
