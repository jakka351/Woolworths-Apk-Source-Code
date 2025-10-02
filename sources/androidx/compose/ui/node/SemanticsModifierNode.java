package androidx.compose.ui.node;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SemanticsModifierNode extends DelegatableNode {
    default boolean P0() {
        return false;
    }

    void b2(SemanticsPropertyReceiver semanticsPropertyReceiver);

    default boolean i1() {
        return false;
    }
}
