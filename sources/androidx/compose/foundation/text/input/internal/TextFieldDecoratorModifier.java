package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextFieldDecoratorModifier extends ModifierNodeElement<TextFieldDecoratorModifierNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new TextFieldDecoratorModifierNode(null, null, null, null, false, false, null, null, false, null, false, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = (TextFieldDecoratorModifierNode) node;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = textFieldDecoratorModifierNode.F;
        boolean z = textFieldDecoratorModifierNode.x;
        boolean z2 = z && !textFieldDecoratorModifierNode.y;
        TransformedTextFieldState transformedTextFieldState = textFieldDecoratorModifierNode.t;
        TextFieldSelectionState textFieldSelectionState = textFieldDecoratorModifierNode.v;
        MutableInteractionSource mutableInteractionSource = textFieldDecoratorModifierNode.C;
        textFieldDecoratorModifierNode.t = null;
        textFieldDecoratorModifierNode.u = null;
        textFieldDecoratorModifierNode.v = null;
        textFieldDecoratorModifierNode.w = null;
        textFieldDecoratorModifierNode.x = false;
        textFieldDecoratorModifierNode.y = false;
        textFieldDecoratorModifierNode.z = null;
        textFieldDecoratorModifierNode.A = null;
        textFieldDecoratorModifierNode.B = false;
        textFieldDecoratorModifierNode.C = null;
        textFieldDecoratorModifierNode.D = false;
        textFieldDecoratorModifierNode.E = null;
        if (!z2 && Intrinsics.c(null, transformedTextFieldState)) {
            throw null;
        }
        textFieldDecoratorModifierNode.x2();
        if (!z && !z2) {
            throw null;
        }
        SemanticsModifierNodeKt.a(textFieldDecoratorModifierNode);
        if (Intrinsics.c(null, textFieldSelectionState)) {
            if (Intrinsics.c(null, mutableInteractionSource)) {
                return;
            }
            suspendingPointerInputModifierNode.v1();
        } else {
            suspendingPointerInputModifierNode.v1();
            if (textFieldDecoratorModifierNode.q) {
                throw null;
            }
            new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DelegatableNodeKt.d(textFieldDecoratorModifierNode);
                    return Unit.f24250a;
                }
            };
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TextFieldDecoratorModifier) && Intrinsics.c(null, null) && Intrinsics.c(null, null) && Intrinsics.c(null, null) && Intrinsics.c(null, null)) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + ((Object) null) + ", textLayoutState=" + ((Object) null) + ", textFieldSelectionState=" + ((Object) null) + ", filter=" + ((Object) null) + ", enabled=false, readOnly=false, keyboardOptions=" + ((Object) null) + ", keyboardActionHandler=" + ((Object) null) + ", singleLine=false, interactionSource=" + ((Object) null) + ", isPassword=false, stylusHandwritingTrigger=" + ((Object) null) + ')';
    }
}
