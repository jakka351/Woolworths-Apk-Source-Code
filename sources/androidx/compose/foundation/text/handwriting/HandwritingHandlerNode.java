package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HandwritingHandlerNode extends Modifier.Node implements FocusEventModifierNode {
    public FocusStateImpl r;
    public final Object s = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ComposeInputMethodManager>() { // from class: androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$composeImm$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComposeInputMethodManager_androidKt.a(DelegatableNode_androidKt.a(this.h));
        }
    });

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void J(FocusStateImpl focusStateImpl) {
        if (Intrinsics.c(this.r, focusStateImpl)) {
            return;
        }
        this.r = focusStateImpl;
        if (focusStateImpl.b()) {
            BuildersKt.c(g2(), null, null, new HandwritingHandlerNode$onFocusEvent$1(this, null), 3);
        }
    }
}
