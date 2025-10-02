package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextFieldTextLayoutModifier extends ModifierNodeElement<TextFieldTextLayoutModifierNode> {
    public final TextLayoutState d;
    public final TransformedTextFieldState e;
    public final TextStyle f;
    public final boolean g;
    public final KeyboardOptions h;

    public TextFieldTextLayoutModifier(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z, KeyboardOptions keyboardOptions) {
        this.d = textLayoutState;
        this.e = transformedTextFieldState;
        this.f = textStyle;
        this.g = z;
        this.h = keyboardOptions;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        TextFieldTextLayoutModifierNode textFieldTextLayoutModifierNode = new TextFieldTextLayoutModifierNode();
        TextLayoutState textLayoutState = this.d;
        textFieldTextLayoutModifierNode.r = textLayoutState;
        textLayoutState.getClass();
        throw null;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        TextLayoutState textLayoutState = this.d;
        ((TextFieldTextLayoutModifierNode) node).r = textLayoutState;
        textLayoutState.getClass();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        return Intrinsics.c(this.d, textFieldTextLayoutModifier.d) && Intrinsics.c(this.e, textFieldTextLayoutModifier.e) && Intrinsics.c(this.f, textFieldTextLayoutModifier.f) && this.g == textFieldTextLayoutModifier.g && this.h.equals(textFieldTextLayoutModifier.h);
    }

    public final int hashCode() {
        this.d.hashCode();
        this.e.getClass();
        throw null;
    }

    public final String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.d + ", textFieldState=" + this.e + ", textStyle=" + this.f + ", singleLine=" + this.g + ", onTextLayout=null, keyboardOptions=" + this.h + ')';
    }
}
