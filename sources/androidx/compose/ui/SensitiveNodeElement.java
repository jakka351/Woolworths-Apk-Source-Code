package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/SensitiveNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/SensitiveContentNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class SensitiveNodeElement extends ModifierNodeElement<SensitiveContentNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new SensitiveContentNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SensitiveContentNode sensitiveContentNode = (SensitiveContentNode) node;
        sensitiveContentNode.getClass();
        if (sensitiveContentNode.r) {
            DelegatableNodeKt.h(sensitiveContentNode).l();
            sensitiveContentNode.r = false;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SensitiveNodeElement);
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }

    public final String toString() {
        return "SensitiveNodeElement(isContentSensitive=false)";
    }
}
