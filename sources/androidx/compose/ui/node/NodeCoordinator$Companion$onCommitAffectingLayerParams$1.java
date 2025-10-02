package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "coordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NodeCoordinator$Companion$onCommitAffectingLayerParams$1 extends Lambda implements Function1<NodeCoordinator, Unit> {
    public static final NodeCoordinator$Companion$onCommitAffectingLayerParams$1 h = new NodeCoordinator$Companion$onCommitAffectingLayerParams$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NodeCoordinator nodeCoordinator = (NodeCoordinator) obj;
        if (nodeCoordinator.y0() && nodeCoordinator.e2(true)) {
            LayoutNode layoutNode = nodeCoordinator.p;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.L;
            if (layoutNodeLayoutDelegate.l > 0) {
                if (layoutNodeLayoutDelegate.k || layoutNodeLayoutDelegate.j) {
                    layoutNode.l0(false);
                }
                layoutNodeLayoutDelegate.p.B0();
            }
            Owner ownerA = LayoutNodeKt.a(layoutNode);
            ownerA.getRectManager().e(layoutNode);
            ownerA.b(layoutNode);
        }
        return Unit.f24250a;
    }
}
