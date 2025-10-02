package androidx.compose.foundation;

import androidx.annotation.RequiresApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@RequiresApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/PreferKeepClearElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/PreferKeepClearNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PreferKeepClearElement extends ModifierNodeElement<PreferKeepClearNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new PreferKeepClearNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((PreferKeepClearNode) node).getClass();
    }

    public final boolean equals(Object obj) {
        return obj instanceof PreferKeepClearNode;
    }

    public final int hashCode() {
        return 0;
    }
}
