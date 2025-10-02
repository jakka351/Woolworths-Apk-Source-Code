package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FocusChangedNode extends Modifier.Node implements FocusEventModifierNode {
    public Function1 r;
    public FocusStateImpl s;

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void J(FocusStateImpl focusStateImpl) {
        if (Intrinsics.c(this.s, focusStateImpl)) {
            return;
        }
        this.s = focusStateImpl;
        this.r.invoke(focusStateImpl);
    }
}
