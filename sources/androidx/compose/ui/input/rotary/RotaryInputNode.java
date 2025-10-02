package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputNode;", "Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class RotaryInputNode extends Modifier.Node implements RotaryInputModifierNode {
    public Function1 r;

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public final boolean H1(RotaryScrollEvent rotaryScrollEvent) {
        Function1 function1 = this.r;
        if (function1 != null) {
            return ((Boolean) function1.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public final boolean e1(RotaryScrollEvent rotaryScrollEvent) {
        return false;
    }
}
