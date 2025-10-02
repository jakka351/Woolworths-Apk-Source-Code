package androidx.compose.ui.spatial;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ThrottledCallbacksKt {
    public static final RelativeLayoutBounds a(long j, long j2, DelegatableNode delegatableNode) {
        NodeCoordinator nodeCoordinatorE = DelegatableNodeKt.e(delegatableNode, 2);
        LayoutNode layoutNodeG = DelegatableNodeKt.g(delegatableNode);
        boolean zU = layoutNodeG.u();
        NodeChain nodeChain = layoutNodeG.K;
        if (!zU) {
            return null;
        }
        if (nodeChain.c == nodeCoordinatorE) {
            return new RelativeLayoutBounds(j, j2, delegatableNode);
        }
        long j3 = nodeCoordinatorE.f;
        NodeCoordinator nodeCoordinator = nodeChain.c;
        nodeCoordinator.getClass();
        long jC = IntOffsetKt.c(nodeCoordinator.C1(nodeCoordinatorE, (Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L), true));
        return new RelativeLayoutBounds(jC, (4294967295L & (((int) (jC & 4294967295L)) + ((int) (j3 & 4294967295L)))) | ((((int) (jC >> 32)) + ((int) (j3 >> 32))) << 32), delegatableNode);
    }
}
