package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FocusRestorerKt {
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0046, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            int r0 = r10.v
            if (r0 != 0) goto L1e
            androidx.compose.runtime.StaticProvidableCompositionLocal r0 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.f1700a
            java.lang.Object r0 = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.a(r10, r0)
            androidx.compose.runtime.saveable.SaveableStateRegistry r0 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r0
            if (r0 == 0) goto L1e
            java.lang.String r1 = "previouslyFocusedChildHash"
            java.lang.Object r0 = r0.e(r1)
            if (r0 == 0) goto L1e
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r10.v = r0
        L1e:
            int r0 = r10.v
            r1 = 0
            if (r0 != 0) goto L25
            goto Lc9
        L25:
            androidx.compose.ui.Modifier$Node r0 = r10.d
            boolean r0 = r0.q
            if (r0 != 0) goto L30
            java.lang.String r0 = "visitChildren called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.b(r0)
        L30:
            androidx.compose.runtime.collection.MutableVector r0 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r0.<init>(r3, r1)
            androidx.compose.ui.Modifier$Node r3 = r10.d
            androidx.compose.ui.Modifier$Node r4 = r3.i
            if (r4 != 0) goto L43
            androidx.compose.ui.node.DelegatableNodeKt.a(r0, r3)
            goto L46
        L43:
            r0.c(r4)
        L46:
            int r3 = r0.f
            if (r3 == 0) goto Lc9
            int r3 = r3 + (-1)
            java.lang.Object r3 = r0.l(r3)
            androidx.compose.ui.Modifier$Node r3 = (androidx.compose.ui.Modifier.Node) r3
            int r4 = r3.g
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L5c
            androidx.compose.ui.node.DelegatableNodeKt.a(r0, r3)
            goto L46
        L5c:
            if (r3 == 0) goto L46
            int r4 = r3.f
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto Lc6
            r4 = 0
            r5 = r4
        L66:
            if (r3 == 0) goto L46
            boolean r6 = r3 instanceof androidx.compose.ui.focus.FocusTargetNode
            r7 = 1
            if (r6 == 0) goto L8b
            androidx.compose.ui.focus.FocusTargetNode r3 = (androidx.compose.ui.focus.FocusTargetNode) r3
            boolean r6 = r3.q
            if (r6 == 0) goto Lc1
            androidx.compose.ui.node.LayoutNode r6 = androidx.compose.ui.node.DelegatableNodeKt.g(r3)
            int r6 = r6.k
            int r8 = r10.v
            if (r6 != r8) goto Lc1
            boolean r10 = a(r3)
            if (r10 != 0) goto L8a
            r10 = 7
            boolean r10 = r3.T0(r10)
            if (r10 == 0) goto Lc9
        L8a:
            return r7
        L8b:
            int r6 = r3.f
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Lc1
            boolean r6 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r6 == 0) goto Lc1
            r6 = r3
            androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
            androidx.compose.ui.Modifier$Node r6 = r6.s
            r8 = r1
        L9b:
            if (r6 == 0) goto Lbe
            int r9 = r6.f
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto Lbb
            int r8 = r8 + 1
            if (r8 != r7) goto La9
            r3 = r6
            goto Lbb
        La9:
            if (r5 != 0) goto Lb2
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r2]
            r5.<init>(r9, r1)
        Lb2:
            if (r3 == 0) goto Lb8
            r5.c(r3)
            r3 = r4
        Lb8:
            r5.c(r6)
        Lbb:
            androidx.compose.ui.Modifier$Node r6 = r6.i
            goto L9b
        Lbe:
            if (r8 != r7) goto Lc1
            goto L66
        Lc1:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.b(r5)
            goto L66
        Lc6:
            androidx.compose.ui.Modifier$Node r3 = r3.i
            goto L5c
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRestorerKt.a(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x002e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(final androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r10.a1()
            boolean r0 = r0.b()
            r1 = 0
            if (r0 != 0) goto Ld
            goto Lbc
        Ld:
            androidx.compose.ui.Modifier$Node r0 = r10.d
            boolean r0 = r0.q
            if (r0 != 0) goto L18
            java.lang.String r0 = "visitChildren called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.b(r0)
        L18:
            androidx.compose.runtime.collection.MutableVector r0 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r0.<init>(r3, r1)
            androidx.compose.ui.Modifier$Node r3 = r10.d
            androidx.compose.ui.Modifier$Node r4 = r3.i
            if (r4 != 0) goto L2b
            androidx.compose.ui.node.DelegatableNodeKt.a(r0, r3)
            goto L2e
        L2b:
            r0.c(r4)
        L2e:
            int r3 = r0.f
            if (r3 == 0) goto Lbc
            int r3 = r3 + (-1)
            java.lang.Object r3 = r0.l(r3)
            androidx.compose.ui.Modifier$Node r3 = (androidx.compose.ui.Modifier.Node) r3
            int r4 = r3.g
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L44
            androidx.compose.ui.node.DelegatableNodeKt.a(r0, r3)
            goto L2e
        L44:
            if (r3 == 0) goto L2e
            int r4 = r3.f
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto Lb9
            r4 = 0
            r5 = r4
        L4e:
            if (r3 == 0) goto L2e
            boolean r6 = r3 instanceof androidx.compose.ui.focus.FocusTargetNode
            r7 = 1
            if (r6 == 0) goto L7e
            androidx.compose.ui.focus.FocusTargetNode r3 = (androidx.compose.ui.focus.FocusTargetNode) r3
            androidx.compose.ui.focus.FocusStateImpl r6 = r3.a1()
            boolean r6 = r6.b()
            if (r6 == 0) goto Lb4
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.DelegatableNodeKt.g(r3)
            int r0 = r0.k
            r10.v = r0
            androidx.compose.runtime.StaticProvidableCompositionLocal r0 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.f1700a
            java.lang.Object r0 = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.a(r10, r0)
            androidx.compose.runtime.saveable.SaveableStateRegistry r0 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r0
            if (r0 == 0) goto L7d
            androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1 r1 = new androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1
            r1.<init>()
            java.lang.String r10 = "previouslyFocusedChildHash"
            r0.b(r10, r1)
        L7d:
            return r7
        L7e:
            int r6 = r3.f
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Lb4
            boolean r6 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r6 == 0) goto Lb4
            r6 = r3
            androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
            androidx.compose.ui.Modifier$Node r6 = r6.s
            r8 = r1
        L8e:
            if (r6 == 0) goto Lb1
            int r9 = r6.f
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto Lae
            int r8 = r8 + 1
            if (r8 != r7) goto L9c
            r3 = r6
            goto Lae
        L9c:
            if (r5 != 0) goto La5
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r2]
            r5.<init>(r9, r1)
        La5:
            if (r3 == 0) goto Lab
            r5.c(r3)
            r3 = r4
        Lab:
            r5.c(r6)
        Lae:
            androidx.compose.ui.Modifier$Node r6 = r6.i
            goto L8e
        Lb1:
            if (r8 != r7) goto Lb4
            goto L4e
        Lb4:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.b(r5)
            goto L4e
        Lb9:
            androidx.compose.ui.Modifier$Node r3 = r3.i
            goto L44
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRestorerKt.b(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }
}
