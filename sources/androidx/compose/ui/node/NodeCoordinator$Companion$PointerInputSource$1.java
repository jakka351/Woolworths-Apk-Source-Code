package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class NodeCoordinator$Companion$PointerInputSource$1 implements NodeCoordinator.HitTestSource {
    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final int a() {
        return 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean b(Modifier.Node node) {
        ?? mutableVector = 0;
        while (node != 0) {
            if (node instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) node).d0();
            } else if ((node.f & 16) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node node2 = node.s;
                int i = 0;
                mutableVector = mutableVector;
                node = node;
                while (node2 != null) {
                    if ((node2.f & 16) != 0) {
                        i++;
                        mutableVector = mutableVector;
                        if (i == 1) {
                            node = node2;
                        } else {
                            if (mutableVector == 0) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                mutableVector.c(node);
                                node = 0;
                            }
                            mutableVector.c(node2);
                        }
                    }
                    node2 = node2.i;
                    mutableVector = mutableVector;
                    node = node;
                }
                if (i == 1) {
                }
            }
            node = DelegatableNodeKt.b(mutableVector);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final void c(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z) {
        layoutNode.O(j, hitTestResult, i, z);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean d(LayoutNode layoutNode) {
        return true;
    }
}
