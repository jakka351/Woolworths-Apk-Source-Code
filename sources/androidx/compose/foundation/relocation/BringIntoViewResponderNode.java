package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/relocation/BringIntoViewModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BringIntoViewResponderNode extends Modifier.Node implements BringIntoViewModifierNode, LayoutAwareModifierNode {
    public BringIntoViewResponder r;
    public boolean s;

    public BringIntoViewResponderNode(ContentInViewNode contentInViewNode) {
        this.r = contentInViewNode;
    }

    public static final Rect s2(BringIntoViewResponderNode bringIntoViewResponderNode, NodeCoordinator nodeCoordinator, Function0 function0) {
        Rect rect;
        if (bringIntoViewResponderNode.q && bringIntoViewResponderNode.s) {
            NodeCoordinator nodeCoordinatorF = DelegatableNodeKt.f(bringIntoViewResponderNode);
            if (!nodeCoordinator.j1().q) {
                nodeCoordinator = null;
            }
            if (nodeCoordinator != null && (rect = (Rect) function0.invoke()) != null) {
                return BringIntoViewRequesterKt__BringIntoViewResponderKt.a(nodeCoordinatorF, nodeCoordinator, rect);
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
    public final Object S0(final NodeCoordinator nodeCoordinator, final Function0 function0, ContinuationImpl continuationImpl) {
        Object objC = CoroutineScopeKt.c(new BringIntoViewResponderNode$bringIntoView$2(this, nodeCoordinator, function0, new Function0<Rect>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$parentRect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NodeCoordinator nodeCoordinator2 = nodeCoordinator;
                Function0 function02 = function0;
                BringIntoViewResponderNode bringIntoViewResponderNode = this.h;
                Rect rectS2 = BringIntoViewResponderNode.s2(bringIntoViewResponderNode, nodeCoordinator2, function02);
                if (rectS2 != null) {
                    return bringIntoViewResponderNode.r.L1(rectS2);
                }
                return null;
            }
        }, null), continuationImpl);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void q(LayoutCoordinates layoutCoordinates) {
        this.s = true;
    }
}
