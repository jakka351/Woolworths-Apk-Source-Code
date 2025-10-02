package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextFieldCoreModifier extends ModifierNodeElement<TextFieldCoreModifierNode> {
    public final boolean d;
    public final boolean e;
    public final TextLayoutState f;
    public final TransformedTextFieldState g;
    public final TextFieldSelectionState h;
    public final Brush i;
    public final boolean j;
    public final ScrollState k;
    public final Orientation l;

    public TextFieldCoreModifier(boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation) {
        this.d = z;
        this.e = z2;
        this.f = textLayoutState;
        this.g = transformedTextFieldState;
        this.h = textFieldSelectionState;
        this.i = brush;
        this.j = z3;
        this.k = scrollState;
        this.l = orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new TextFieldCoreModifierNode(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        Job job;
        TextFieldCoreModifierNode textFieldCoreModifierNode = (TextFieldCoreModifierNode) node;
        boolean zV2 = textFieldCoreModifierNode.v2();
        boolean z = textFieldCoreModifierNode.t;
        TransformedTextFieldState transformedTextFieldState = textFieldCoreModifierNode.w;
        TextLayoutState textLayoutState = textFieldCoreModifierNode.v;
        TextFieldSelectionState textFieldSelectionState = textFieldCoreModifierNode.x;
        ScrollState scrollState = textFieldCoreModifierNode.A;
        boolean z2 = this.d;
        textFieldCoreModifierNode.t = z2;
        boolean z3 = this.e;
        textFieldCoreModifierNode.u = z3;
        TextLayoutState textLayoutState2 = this.f;
        textFieldCoreModifierNode.v = textLayoutState2;
        TransformedTextFieldState transformedTextFieldState2 = this.g;
        textFieldCoreModifierNode.w = transformedTextFieldState2;
        TextFieldSelectionState textFieldSelectionState2 = this.h;
        textFieldCoreModifierNode.x = textFieldSelectionState2;
        textFieldCoreModifierNode.y = this.i;
        textFieldCoreModifierNode.z = this.j;
        ScrollState scrollState2 = this.k;
        textFieldCoreModifierNode.A = scrollState2;
        textFieldCoreModifierNode.B = this.l;
        textFieldCoreModifierNode.E.v2(transformedTextFieldState2, textFieldSelectionState2, textLayoutState2, z2 || z3);
        if (!textFieldCoreModifierNode.v2()) {
            Job job2 = textFieldCoreModifierNode.D;
            if (job2 != null) {
                ((JobSupport) job2).cancel((CancellationException) null);
            }
            textFieldCoreModifierNode.D = null;
            CursorAnimationState cursorAnimationState = textFieldCoreModifierNode.C;
            if (cursorAnimationState != null && (job = (Job) cursorAnimationState.b.getAndSet(null)) != null) {
                job.cancel((CancellationException) null);
            }
        } else if (!z || !Intrinsics.c(transformedTextFieldState, transformedTextFieldState2) || !zV2) {
            textFieldCoreModifierNode.w2();
        }
        if (Intrinsics.c(transformedTextFieldState, transformedTextFieldState2) && Intrinsics.c(textLayoutState, textLayoutState2) && Intrinsics.c(textFieldSelectionState, textFieldSelectionState2) && Intrinsics.c(scrollState, scrollState2)) {
            return;
        }
        DelegatableNodeKt.g(textFieldCoreModifierNode).W();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.d == textFieldCoreModifier.d && this.e == textFieldCoreModifier.e && Intrinsics.c(this.f, textFieldCoreModifier.f) && Intrinsics.c(this.g, textFieldCoreModifier.g) && Intrinsics.c(this.h, textFieldCoreModifier.h) && Intrinsics.c(this.i, textFieldCoreModifier.i) && this.j == textFieldCoreModifier.j && Intrinsics.c(this.k, textFieldCoreModifier.k) && this.l == textFieldCoreModifier.l;
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + androidx.camera.core.impl.b.e((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + androidx.camera.core.impl.b.e(Boolean.hashCode(this.d) * 31, 31, this.e)) * 31)) * 31)) * 31)) * 31, 31, this.j)) * 31);
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.d + ", isDragHovered=" + this.e + ", textLayoutState=" + this.f + ", textFieldState=" + this.g + ", textFieldSelectionState=" + this.h + ", cursorBrush=" + this.i + ", writeable=" + this.j + ", scrollState=" + this.k + ", orientation=" + this.l + ')';
    }
}
