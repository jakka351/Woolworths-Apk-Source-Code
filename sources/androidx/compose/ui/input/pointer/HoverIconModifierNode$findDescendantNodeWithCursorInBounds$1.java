package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "it", "Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1 extends Lambda implements Function1<HoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.d;
        if (((HoverIconModifierNode) obj).t) {
            throw null;
        }
        return traverseDescendantsAction;
    }
}
