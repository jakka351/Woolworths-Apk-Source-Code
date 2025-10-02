package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FocusTransactionsKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FocusStateImpl focusStateImpl = FocusStateImpl.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FocusStateImpl focusStateImpl2 = FocusStateImpl.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FocusStateImpl focusStateImpl3 = FocusStateImpl.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final boolean a(FocusTargetNode focusTargetNode, boolean z) {
        int iOrdinal = focusTargetNode.a1().ordinal();
        if (iOrdinal == 0) {
            DelegatableNodeKt.h(focusTargetNode).getFocusOwner().i(null);
            focusTargetNode.s2(FocusStateImpl.d, FocusStateImpl.g);
            return true;
        }
        if (iOrdinal == 1) {
            FocusTargetNode focusTargetNodeE = FocusTraversalKt.e(focusTargetNode);
            if (!(focusTargetNodeE != null ? a(focusTargetNodeE, z) : true)) {
                return false;
            }
            focusTargetNode.s2(FocusStateImpl.e, FocusStateImpl.g);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            DelegatableNodeKt.h(focusTargetNode).getFocusOwner().i(null);
            focusTargetNode.s2(FocusStateImpl.f, FocusStateImpl.g);
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public static final CustomDestinationResult b(FocusTargetNode focusTargetNode, int i) {
        int iOrdinal = focusTargetNode.a1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeE = FocusTraversalKt.e(focusTargetNode);
                if (focusTargetNodeE == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                CustomDestinationResult customDestinationResultB = b(focusTargetNodeE, i);
                CustomDestinationResult customDestinationResult = CustomDestinationResult.d;
                if (customDestinationResultB == customDestinationResult) {
                    customDestinationResultB = null;
                }
                if (customDestinationResultB != null) {
                    return customDestinationResultB;
                }
                if (focusTargetNode.s) {
                    return customDestinationResult;
                }
                focusTargetNode.s = true;
                try {
                    FocusPropertiesImpl focusPropertiesImplT2 = focusTargetNode.t2();
                    CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i);
                    FocusTargetNodeKt.a(focusTargetNode);
                    FocusOwner focusOwner = DelegatableNodeKt.h(focusTargetNode).getFocusOwner();
                    FocusTargetNode focusTargetNodeC = focusOwner.getL();
                    focusPropertiesImplT2.k.invoke(cancelIndicatingFocusBoundaryScope);
                    FocusTargetNode focusTargetNodeC2 = focusOwner.getL();
                    if (!cancelIndicatingFocusBoundaryScope.b) {
                        return (focusTargetNodeC == focusTargetNodeC2 || focusTargetNodeC2 == null) ? customDestinationResult : FocusRequester.d == FocusRequester.c ? CustomDestinationResult.e : CustomDestinationResult.f;
                    }
                    FocusRequester focusRequester = FocusRequester.b;
                    return CustomDestinationResult.e;
                } finally {
                    focusTargetNode.s = false;
                }
            }
            if (iOrdinal == 2) {
                return CustomDestinationResult.e;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.d;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public static final CustomDestinationResult c(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.t) {
            focusTargetNode.t = true;
            try {
                FocusPropertiesImpl focusPropertiesImplT2 = focusTargetNode.t2();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i);
                FocusTargetNodeKt.a(focusTargetNode);
                FocusOwner focusOwner = DelegatableNodeKt.h(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeC = focusOwner.getL();
                focusPropertiesImplT2.j.invoke(cancelIndicatingFocusBoundaryScope);
                FocusTargetNode focusTargetNodeC2 = focusOwner.getL();
                if (cancelIndicatingFocusBoundaryScope.b) {
                    FocusRequester focusRequester = FocusRequester.b;
                    return CustomDestinationResult.e;
                }
                if (focusTargetNodeC != focusTargetNodeC2 && focusTargetNodeC2 != null) {
                    return FocusRequester.d == FocusRequester.c ? CustomDestinationResult.e : CustomDestinationResult.f;
                }
            } finally {
                focusTargetNode.t = false;
            }
        }
        return CustomDestinationResult.d;
    }

    public static final CustomDestinationResult d(FocusTargetNode focusTargetNode, int i) {
        Modifier.Node nodeB;
        NodeChain nodeChain;
        int iOrdinal = focusTargetNode.a1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeE = FocusTraversalKt.e(focusTargetNode);
                if (focusTargetNodeE != null) {
                    return b(focusTargetNodeE, i);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!focusTargetNode.d.q) {
                    InlineClassHelperKt.b("visitAncestors called on an unattached node");
                }
                Modifier.Node node = focusTargetNode.d.h;
                LayoutNode layoutNodeG = DelegatableNodeKt.g(focusTargetNode);
                loop0: while (true) {
                    if (layoutNodeG == null) {
                        nodeB = null;
                        break;
                    }
                    if ((layoutNodeG.K.e.g & 1024) != 0) {
                        while (node != null) {
                            if ((node.f & 1024) != 0) {
                                nodeB = node;
                                MutableVector mutableVector = null;
                                while (nodeB != null) {
                                    if (nodeB instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((nodeB.f & 1024) != 0 && (nodeB instanceof DelegatingNode)) {
                                        int i2 = 0;
                                        for (Modifier.Node node2 = ((DelegatingNode) nodeB).s; node2 != null; node2 = node2.i) {
                                            if ((node2.f & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
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
                                        if (i2 == 1) {
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
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodeB;
                if (focusTargetNode2 == null) {
                    return CustomDestinationResult.d;
                }
                int iOrdinal2 = focusTargetNode2.a1().ordinal();
                if (iOrdinal2 == 0) {
                    return c(focusTargetNode2, i);
                }
                if (iOrdinal2 == 1) {
                    return d(focusTargetNode2, i);
                }
                if (iOrdinal2 == 2) {
                    return CustomDestinationResult.e;
                }
                if (iOrdinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                CustomDestinationResult customDestinationResultD = d(focusTargetNode2, i);
                CustomDestinationResult customDestinationResult = customDestinationResultD != CustomDestinationResult.d ? customDestinationResultD : null;
                return customDestinationResult == null ? c(focusTargetNode2, i) : customDestinationResult;
            }
        }
        return CustomDestinationResult.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c5 A[ADDED_TO_REGION, LOOP:9: B:129:0x01c5->B:136:0x01d9, LOOP_START, PHI: r5
  0x01c5: PHI (r5v9 int) = (r5v8 int), (r5v10 int) binds: [B:128:0x01c3, B:136:0x01d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean e(final androidx.compose.ui.focus.FocusTargetNode r17) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.e(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }
}
