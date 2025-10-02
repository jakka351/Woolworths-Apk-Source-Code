package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CoreTextFieldSemanticsModifier extends ModifierNodeElement<CoreTextFieldSemanticsModifierNode> {
    public final TransformedText d;
    public final TextFieldValue e;
    public final LegacyTextFieldState f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final OffsetMapping j;
    public final TextFieldSelectionManager k;
    public final ImeOptions l;
    public final FocusRequester m;

    public CoreTextFieldSemanticsModifier(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, boolean z3, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
        this.d = transformedText;
        this.e = textFieldValue;
        this.f = legacyTextFieldState;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = offsetMapping;
        this.k = textFieldSelectionManager;
        this.l = imeOptions;
        this.m = focusRequester;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = new CoreTextFieldSemanticsModifierNode();
        coreTextFieldSemanticsModifierNode.t = this.d;
        coreTextFieldSemanticsModifierNode.u = this.e;
        coreTextFieldSemanticsModifierNode.v = this.f;
        coreTextFieldSemanticsModifierNode.w = this.g;
        coreTextFieldSemanticsModifierNode.x = this.h;
        coreTextFieldSemanticsModifierNode.y = this.i;
        coreTextFieldSemanticsModifierNode.z = this.j;
        TextFieldSelectionManager textFieldSelectionManager = this.k;
        coreTextFieldSemanticsModifierNode.A = textFieldSelectionManager;
        coreTextFieldSemanticsModifierNode.B = this.l;
        coreTextFieldSemanticsModifierNode.C = this.m;
        textFieldSelectionManager.g = new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.1
            public AnonymousClass1() {
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DelegatableNodeKt.d(CoreTextFieldSemanticsModifierNode.this);
                return Unit.f24250a;
            }
        };
        return coreTextFieldSemanticsModifierNode;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$updateNodeSemantics$1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        final CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = (CoreTextFieldSemanticsModifierNode) node;
        boolean z = coreTextFieldSemanticsModifierNode.x;
        boolean z2 = false;
        boolean z3 = z && !coreTextFieldSemanticsModifierNode.w;
        boolean z4 = coreTextFieldSemanticsModifierNode.y;
        ImeOptions imeOptions = coreTextFieldSemanticsModifierNode.B;
        TextFieldSelectionManager textFieldSelectionManager = coreTextFieldSemanticsModifierNode.A;
        boolean z5 = this.g;
        boolean z6 = this.h;
        if (z6 && !z5) {
            z2 = true;
        }
        coreTextFieldSemanticsModifierNode.t = this.d;
        TextFieldValue textFieldValue = this.e;
        coreTextFieldSemanticsModifierNode.u = textFieldValue;
        coreTextFieldSemanticsModifierNode.v = this.f;
        coreTextFieldSemanticsModifierNode.w = z5;
        coreTextFieldSemanticsModifierNode.x = z6;
        coreTextFieldSemanticsModifierNode.z = this.j;
        TextFieldSelectionManager textFieldSelectionManager2 = this.k;
        coreTextFieldSemanticsModifierNode.A = textFieldSelectionManager2;
        ImeOptions imeOptions2 = this.l;
        coreTextFieldSemanticsModifierNode.B = imeOptions2;
        coreTextFieldSemanticsModifierNode.C = this.m;
        if (z6 != z || z2 != z3 || !Intrinsics.c(imeOptions2, imeOptions) || this.i != z4 || !TextRange.c(textFieldValue.b)) {
            SemanticsModifierNodeKt.a(coreTextFieldSemanticsModifierNode);
        }
        if (textFieldSelectionManager2.equals(textFieldSelectionManager)) {
            return;
        }
        textFieldSelectionManager2.g = new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$updateNodeSemantics$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DelegatableNodeKt.d(coreTextFieldSemanticsModifierNode);
                return Unit.f24250a;
            }
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return Intrinsics.c(this.d, coreTextFieldSemanticsModifier.d) && Intrinsics.c(this.e, coreTextFieldSemanticsModifier.e) && Intrinsics.c(this.f, coreTextFieldSemanticsModifier.f) && this.g == coreTextFieldSemanticsModifier.g && this.h == coreTextFieldSemanticsModifier.h && this.i == coreTextFieldSemanticsModifier.i && Intrinsics.c(this.j, coreTextFieldSemanticsModifier.j) && Intrinsics.c(this.k, coreTextFieldSemanticsModifier.k) && Intrinsics.c(this.l, coreTextFieldSemanticsModifier.l) && Intrinsics.c(this.m, coreTextFieldSemanticsModifier.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.d + ", value=" + this.e + ", state=" + this.f + ", readOnly=" + this.g + ", enabled=" + this.h + ", isPassword=" + this.i + ", offsetMapping=" + this.j + ", manager=" + this.k + ", imeOptions=" + this.l + ", focusRequester=" + this.m + ')';
    }
}
