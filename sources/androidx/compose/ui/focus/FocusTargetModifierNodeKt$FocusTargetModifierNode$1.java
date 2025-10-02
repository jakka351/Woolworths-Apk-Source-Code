package androidx.compose.ui.focus;

import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class FocusTargetModifierNodeKt$FocusTargetModifierNode$1 extends FunctionReferenceImpl implements Function1<FocusTargetNode, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((FocusTargetNode) obj);
        return Unit.f24250a;
    }

    public final void m(FocusTargetNode focusTargetNode) {
        ((InvalidateSemantics) this.receiver).getClass();
        Object obj = focusTargetNode.d;
        SemanticsModifierNode semanticsModifierNode = obj instanceof SemanticsModifierNode ? (SemanticsModifierNode) obj : null;
        if (semanticsModifierNode != null) {
            SemanticsModifierNodeKt.a(semanticsModifierNode);
        }
    }
}
