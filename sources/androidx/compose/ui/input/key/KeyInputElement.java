package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/key/KeyInputNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class KeyInputElement extends ModifierNodeElement<KeyInputNode> {
    public final Function1 d;
    public final Function1 e;

    public KeyInputElement(Function1 function1, Function1 function12) {
        this.d = function1;
        this.e = function12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        KeyInputNode keyInputNode = new KeyInputNode();
        keyInputNode.r = this.d;
        keyInputNode.s = this.e;
        return keyInputNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        KeyInputNode keyInputNode = (KeyInputNode) node;
        keyInputNode.r = this.d;
        keyInputNode.s = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.d == keyInputElement.d && this.e == keyInputElement.e;
    }

    public final int hashCode() {
        Function1 function1 = this.d;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.e;
        return iHashCode + (function12 != null ? function12.hashCode() : 0);
    }
}
