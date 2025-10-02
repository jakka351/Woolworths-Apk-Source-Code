package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OneDimensionalFocusSearchKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FocusStateImpl focusStateImpl = FocusStateImpl.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FocusStateImpl focusStateImpl2 = FocusStateImpl.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FocusStateImpl focusStateImpl3 = FocusStateImpl.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(androidx.compose.ui.focus.FocusTargetNode r7, kotlin.jvm.functions.Function1 r8) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r7.a1()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L8d
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L39
            if (r0 == r3) goto L8d
            if (r0 != r1) goto L33
            boolean r0 = d(r7, r8)
            if (r0 != 0) goto L81
            androidx.compose.ui.focus.FocusPropertiesImpl r0 = r7.t2()
            boolean r0 = r0.f1748a
            if (r0 == 0) goto L2f
            androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1 r8 = (androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1) r8
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L30
        L2f:
            r7 = r2
        L30:
            if (r7 == 0) goto L80
            goto L81
        L33:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L39:
            androidx.compose.ui.focus.FocusTargetNode r0 = androidx.compose.ui.focus.FocusTraversalKt.e(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L87
            androidx.compose.ui.focus.FocusStateImpl r6 = r0.a1()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L82
            if (r6 == r4) goto L5d
            if (r6 == r3) goto L82
            if (r6 == r1) goto L57
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L57:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L5d:
            boolean r1 = a(r0, r8)
            if (r1 != 0) goto L81
            boolean r7 = c(r7, r0, r3, r8)
            if (r7 != 0) goto L81
            androidx.compose.ui.focus.FocusPropertiesImpl r7 = r0.t2()
            boolean r7 = r7.f1748a
            if (r7 == 0) goto L80
            androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1 r8 = (androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1) r8
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L80
            goto L81
        L80:
            return r2
        L81:
            return r4
        L82:
            boolean r7 = c(r7, r0, r3, r8)
            return r7
        L87:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L8d:
            boolean r7 = d(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.OneDimensionalFocusSearchKt.a(androidx.compose.ui.focus.FocusTargetNode, kotlin.jvm.functions.Function1):boolean");
    }

    public static final boolean b(FocusTargetNode focusTargetNode, Function1 function1) {
        int iOrdinal = focusTargetNode.a1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeE = FocusTraversalKt.e(focusTargetNode);
                if (focusTargetNodeE != null) {
                    return b(focusTargetNodeE, function1) || c(focusTargetNode, focusTargetNodeE, 1, function1);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return focusTargetNode.t2().f1748a ? ((Boolean) ((FocusOwnerImpl$focusSearch$1) function1).invoke(focusTargetNode)).booleanValue() : e(focusTargetNode, function1);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return e(focusTargetNode, function1);
    }

    public static final boolean c(final FocusTargetNode focusTargetNode, final FocusTargetNode focusTargetNode2, final int i, final Function1 function1) {
        if (f(focusTargetNode, focusTargetNode2, i, function1)) {
            return true;
        }
        final FocusTransactionManager h = DelegatableNodeKt.h(focusTargetNode).getFocusOwner().getH();
        h.getClass();
        final FocusTargetNode l = DelegatableNodeKt.h(focusTargetNode).getFocusOwner().getL();
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.a(focusTargetNode, i, new Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean>(h, l, focusTargetNode, focusTargetNode2, i, function1) { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            public final /* synthetic */ FocusTargetNode h;
            public final /* synthetic */ FocusTargetNode i;
            public final /* synthetic */ FocusTargetNode j;
            public final /* synthetic */ int k;
            public final /* synthetic */ Function1 l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.h = l;
                this.i = focusTargetNode;
                this.j = focusTargetNode2;
                this.k = i;
                this.l = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope = (BeyondBoundsLayout.BeyondBoundsScope) obj;
                FocusTargetNode focusTargetNode3 = this.i;
                if (this.h != DelegatableNodeKt.h(focusTargetNode3).getFocusOwner().getL()) {
                    return Boolean.TRUE;
                }
                boolean zF = OneDimensionalFocusSearchKt.f(focusTargetNode3, this.j, this.k, this.l);
                Boolean boolValueOf = Boolean.valueOf(zF);
                if (zF || !beyondBoundsScope.a()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(FocusTargetNode focusTargetNode, Function1 function1) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        if (!focusTargetNode.d.q) {
            InlineClassHelperKt.b("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node node = focusTargetNode.d;
        Modifier.Node node2 = node.i;
        if (node2 == null) {
            DelegatableNodeKt.a(mutableVector2, node);
        } else {
            mutableVector2.c(node2);
        }
        while (true) {
            int i = mutableVector2.f;
            if (i == 0) {
                break;
            }
            Modifier.Node nodeB = (Modifier.Node) mutableVector2.l(i - 1);
            if ((nodeB.g & 1024) == 0) {
                DelegatableNodeKt.a(mutableVector2, nodeB);
            } else {
                while (true) {
                    if (nodeB == null) {
                        break;
                    }
                    if ((nodeB.f & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodeB != null) {
                            if (nodeB instanceof FocusTargetNode) {
                                mutableVector.c((FocusTargetNode) nodeB);
                            } else if ((nodeB.f & 1024) != 0 && (nodeB instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node node3 = ((DelegatingNode) nodeB).s; node3 != null; node3 = node3.i) {
                                    if ((node3.f & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodeB = node3;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeB != null) {
                                                mutableVector3.c(nodeB);
                                                nodeB = null;
                                            }
                                            mutableVector3.c(node3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nodeB = DelegatableNodeKt.b(mutableVector3);
                        }
                    } else {
                        nodeB = nodeB.i;
                    }
                }
            }
        }
        mutableVector.o(FocusableChildrenComparator.d);
        int i3 = mutableVector.f - 1;
        Object[] objArr = mutableVector.d;
        if (i3 < objArr.length) {
            while (i3 >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
                if (FocusTraversalKt.f(focusTargetNode2) && a(focusTargetNode2, function1)) {
                    return true;
                }
                i3--;
            }
        }
        return false;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, Function1 function1) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        if (!focusTargetNode.d.q) {
            InlineClassHelperKt.b("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node node = focusTargetNode.d;
        Modifier.Node node2 = node.i;
        if (node2 == null) {
            DelegatableNodeKt.a(mutableVector2, node);
        } else {
            mutableVector2.c(node2);
        }
        while (true) {
            int i = mutableVector2.f;
            if (i == 0) {
                break;
            }
            Modifier.Node nodeB = (Modifier.Node) mutableVector2.l(i - 1);
            if ((nodeB.g & 1024) == 0) {
                DelegatableNodeKt.a(mutableVector2, nodeB);
            } else {
                while (true) {
                    if (nodeB == null) {
                        break;
                    }
                    if ((nodeB.f & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodeB != null) {
                            if (nodeB instanceof FocusTargetNode) {
                                mutableVector.c((FocusTargetNode) nodeB);
                            } else if ((nodeB.f & 1024) != 0 && (nodeB instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node node3 = ((DelegatingNode) nodeB).s; node3 != null; node3 = node3.i) {
                                    if ((node3.f & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodeB = node3;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeB != null) {
                                                mutableVector3.c(nodeB);
                                                nodeB = null;
                                            }
                                            mutableVector3.c(node3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nodeB = DelegatableNodeKt.b(mutableVector3);
                        }
                    } else {
                        nodeB = nodeB.i;
                    }
                }
            }
        }
        mutableVector.o(FocusableChildrenComparator.d);
        Object[] objArr = mutableVector.d;
        int i3 = mutableVector.f;
        for (int i4 = 0; i4 < i3; i4++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i4];
            if (FocusTraversalKt.f(focusTargetNode2) && b(focusTargetNode2, function1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f9, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0194 A[EDGE_INSN: B:154:0x0194->B:123:0x0194 BREAK  A[LOOP:5: B:85:0x0129->B:159:0x0129], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(androidx.compose.ui.focus.FocusTargetNode r11, androidx.compose.ui.focus.FocusTargetNode r12, int r13, kotlin.jvm.functions.Function1 r14) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.OneDimensionalFocusSearchKt.f(androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.FocusTargetNode, int, kotlin.jvm.functions.Function1):boolean");
    }
}
