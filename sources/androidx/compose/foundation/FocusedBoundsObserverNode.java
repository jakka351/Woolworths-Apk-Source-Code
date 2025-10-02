package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "TraverseKey", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusedBoundsObserverNode extends Modifier.Node implements TraversableNode {
    public static final TraverseKey s = new TraverseKey();
    public Function1 r;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverNode$TraverseKey;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TraverseKey {
    }

    public FocusedBoundsObserverNode(Function1 function1) {
        this.r = function1;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    /* renamed from: W0 */
    public final Object getT() {
        return s;
    }

    public final void s2(LayoutCoordinates layoutCoordinates) {
        this.r.invoke(layoutCoordinates);
        FocusedBoundsObserverNode focusedBoundsObserverNode = (FocusedBoundsObserverNode) TraversableNodeKt.a(this);
        if (focusedBoundsObserverNode != null) {
            focusedBoundsObserverNode.s2(layoutCoordinates);
        }
    }
}
