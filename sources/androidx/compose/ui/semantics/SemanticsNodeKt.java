package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SemanticsNodeKt {
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062 A[LOOP:0: B:4:0x000b->B:35:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065 A[EDGE_INSN: B:43:0x0065->B:36:0x0065 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0062], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.semantics.SemanticsNode a(androidx.compose.ui.node.LayoutNode r9, boolean r10) {
        /*
            androidx.compose.ui.node.NodeChain r0 = r9.K
            androidx.compose.ui.Modifier$Node r0 = r0.e
            int r1 = r0.g
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L65
        Lb:
            if (r0 == 0) goto L65
            int r1 = r0.f
            r1 = r1 & 8
            if (r1 == 0) goto L5c
            r1 = r0
            r3 = r2
        L15:
            if (r1 == 0) goto L5c
            boolean r4 = r1 instanceof androidx.compose.ui.node.SemanticsModifierNode
            if (r4 == 0) goto L1d
            r2 = r1
            goto L65
        L1d:
            int r4 = r1.f
            r4 = r4 & 8
            if (r4 == 0) goto L57
            boolean r4 = r1 instanceof androidx.compose.ui.node.DelegatingNode
            if (r4 == 0) goto L57
            r4 = r1
            androidx.compose.ui.node.DelegatingNode r4 = (androidx.compose.ui.node.DelegatingNode) r4
            androidx.compose.ui.Modifier$Node r4 = r4.s
            r5 = 0
            r6 = r5
        L2e:
            r7 = 1
            if (r4 == 0) goto L54
            int r8 = r4.f
            r8 = r8 & 8
            if (r8 == 0) goto L51
            int r6 = r6 + 1
            if (r6 != r7) goto L3d
            r1 = r4
            goto L51
        L3d:
            if (r3 != 0) goto L48
            androidx.compose.runtime.collection.MutableVector r3 = new androidx.compose.runtime.collection.MutableVector
            r7 = 16
            androidx.compose.ui.Modifier$Node[] r7 = new androidx.compose.ui.Modifier.Node[r7]
            r3.<init>(r7, r5)
        L48:
            if (r1 == 0) goto L4e
            r3.c(r1)
            r1 = r2
        L4e:
            r3.c(r4)
        L51:
            androidx.compose.ui.Modifier$Node r4 = r4.i
            goto L2e
        L54:
            if (r6 != r7) goto L57
            goto L15
        L57:
            androidx.compose.ui.Modifier$Node r1 = androidx.compose.ui.node.DelegatableNodeKt.b(r3)
            goto L15
        L5c:
            int r1 = r0.g
            r1 = r1 & 8
            if (r1 == 0) goto L65
            androidx.compose.ui.Modifier$Node r0 = r0.i
            goto Lb
        L65:
            kotlin.jvm.internal.Intrinsics.e(r2)
            androidx.compose.ui.node.SemanticsModifierNode r2 = (androidx.compose.ui.node.SemanticsModifierNode) r2
            androidx.compose.ui.Modifier$Node r0 = r2.getD()
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r9.R()
            if (r1 != 0) goto L79
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = new androidx.compose.ui.semantics.SemanticsConfiguration
            r1.<init>()
        L79:
            androidx.compose.ui.semantics.SemanticsNode r2 = new androidx.compose.ui.semantics.SemanticsNode
            r2.<init>(r0, r10, r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsNodeKt.a(androidx.compose.ui.node.LayoutNode, boolean):androidx.compose.ui.semantics.SemanticsNode");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b A[LOOP:0: B:4:0x000b->B:37:0x006b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e A[EDGE_INSN: B:42:0x006e->B:38:0x006e BREAK  A[LOOP:0: B:4:0x000b->B:37:0x006b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.node.SemanticsModifierNode b(androidx.compose.ui.node.LayoutNode r8) {
        /*
            androidx.compose.ui.node.NodeChain r8 = r8.K
            androidx.compose.ui.Modifier$Node r8 = r8.e
            int r0 = r8.g
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L6e
        Lb:
            if (r8 == 0) goto L6e
            int r0 = r8.f
            r0 = r0 & 8
            if (r0 == 0) goto L65
            r0 = r8
            r2 = r1
        L15:
            if (r0 == 0) goto L65
            boolean r3 = r0 instanceof androidx.compose.ui.node.SemanticsModifierNode
            if (r3 == 0) goto L26
            r3 = r0
            androidx.compose.ui.node.SemanticsModifierNode r3 = (androidx.compose.ui.node.SemanticsModifierNode) r3
            boolean r3 = r3.getR()
            if (r3 == 0) goto L60
            r1 = r0
            goto L6e
        L26:
            int r3 = r0.f
            r3 = r3 & 8
            if (r3 == 0) goto L60
            boolean r3 = r0 instanceof androidx.compose.ui.node.DelegatingNode
            if (r3 == 0) goto L60
            r3 = r0
            androidx.compose.ui.node.DelegatingNode r3 = (androidx.compose.ui.node.DelegatingNode) r3
            androidx.compose.ui.Modifier$Node r3 = r3.s
            r4 = 0
            r5 = r4
        L37:
            r6 = 1
            if (r3 == 0) goto L5d
            int r7 = r3.f
            r7 = r7 & 8
            if (r7 == 0) goto L5a
            int r5 = r5 + 1
            if (r5 != r6) goto L46
            r0 = r3
            goto L5a
        L46:
            if (r2 != 0) goto L51
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r6 = 16
            androidx.compose.ui.Modifier$Node[] r6 = new androidx.compose.ui.Modifier.Node[r6]
            r2.<init>(r6, r4)
        L51:
            if (r0 == 0) goto L57
            r2.c(r0)
            r0 = r1
        L57:
            r2.c(r3)
        L5a:
            androidx.compose.ui.Modifier$Node r3 = r3.i
            goto L37
        L5d:
            if (r5 != r6) goto L60
            goto L15
        L60:
            androidx.compose.ui.Modifier$Node r0 = androidx.compose.ui.node.DelegatableNodeKt.b(r2)
            goto L15
        L65:
            int r0 = r8.g
            r0 = r0 & 8
            if (r0 == 0) goto L6e
            androidx.compose.ui.Modifier$Node r8 = r8.i
            goto Lb
        L6e:
            androidx.compose.ui.node.SemanticsModifierNode r1 = (androidx.compose.ui.node.SemanticsModifierNode) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsNodeKt.b(androidx.compose.ui.node.LayoutNode):androidx.compose.ui.node.SemanticsModifierNode");
    }
}
