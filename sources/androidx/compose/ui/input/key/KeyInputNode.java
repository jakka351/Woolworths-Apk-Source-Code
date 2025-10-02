package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class KeyInputNode extends Modifier.Node implements KeyInputModifierNode {
    public Function1 r;
    public Function1 s;

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean G1(android.view.KeyEvent keyEvent) {
        Function1 function1 = this.r;
        if (function1 != null) {
            return ((Boolean) function1.invoke(KeyEvent.a(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean v0(android.view.KeyEvent keyEvent) {
        Function1 function1 = this.s;
        if (function1 != null) {
            return ((Boolean) function1.invoke(KeyEvent.a(keyEvent))).booleanValue();
        }
        return false;
    }
}
