package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/rotary/RotaryInputNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class RotaryInputElement extends ModifierNodeElement<RotaryInputNode> {
    public final Function1 d;

    public RotaryInputElement(Function1 function1) {
        this.d = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        RotaryInputNode rotaryInputNode = new RotaryInputNode();
        rotaryInputNode.r = this.d;
        return rotaryInputNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((RotaryInputNode) node).r = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RotaryInputElement) && this.d.equals(((RotaryInputElement) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode() * 31;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.d + ", onPreRotaryScrollEvent=null)";
    }
}
