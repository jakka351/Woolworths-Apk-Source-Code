package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HandwritingDetectorNode extends DelegatingNode implements PointerInputModifierNode {
    public final Object t = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ComposeInputMethodManager>() { // from class: androidx.compose.foundation.text.handwriting.HandwritingDetectorNode$composeImm$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComposeInputMethodManager_androidKt.a(DelegatableNode_androidKt.a(this.h));
        }
    });
    public final StylusHandwritingNode u;

    public HandwritingDetectorNode() {
        StylusHandwritingNode stylusHandwritingNode = new StylusHandwritingNode(new HandwritingDetectorNode$pointerInputNode$1(0));
        s2(stylusHandwritingNode);
        this.u = stylusHandwritingNode;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void D0() {
        this.u.D0();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void f1(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.u.f1(pointerEvent, pointerEventPass, j);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final long w0() {
        return this.u.w0();
    }
}
