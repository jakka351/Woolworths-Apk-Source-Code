package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class NodeCoordinator$Companion$SemanticsSource$1 implements NodeCoordinator.HitTestSource {
    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final int a() {
        return 8;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean b(Modifier.Node node) {
        return false;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final void c(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z) {
        NodeChain nodeChain = layoutNode.K;
        NodeCoordinator nodeCoordinator = nodeChain.c;
        Function1 function1 = NodeCoordinator.N;
        nodeChain.c.v1(NodeCoordinator.T, nodeCoordinator.e1(j, true), hitTestResult, 1, z);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean d(LayoutNode layoutNode) {
        SemanticsConfiguration semanticsConfigurationR = layoutNode.R();
        boolean z = false;
        if (semanticsConfigurationR != null && semanticsConfigurationR.g) {
            z = true;
        }
        return !z;
    }
}
