package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends ModifierNodeElement<LegacyAdaptingPlatformTextInputModifierNode> {
    public final LegacyPlatformTextInputServiceAdapter d;
    public final LegacyTextFieldState e;
    public final TextFieldSelectionManager f;

    public LegacyAdaptingPlatformTextInputModifier(LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        this.d = legacyPlatformTextInputServiceAdapter;
        this.e = legacyTextFieldState;
        this.f = textFieldSelectionManager;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new LegacyAdaptingPlatformTextInputModifierNode(this.d, this.e, this.f);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) throws Throwable {
        LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode = (LegacyAdaptingPlatformTextInputModifierNode) node;
        if (legacyAdaptingPlatformTextInputModifierNode.q) {
            ((AndroidLegacyPlatformTextInputServiceAdapter) legacyAdaptingPlatformTextInputModifierNode.r).a();
            legacyAdaptingPlatformTextInputModifierNode.r.j(legacyAdaptingPlatformTextInputModifierNode);
        }
        LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter = this.d;
        legacyAdaptingPlatformTextInputModifierNode.r = legacyPlatformTextInputServiceAdapter;
        if (legacyAdaptingPlatformTextInputModifierNode.q) {
            if (legacyPlatformTextInputServiceAdapter.f1163a != null) {
                InlineClassHelperKt.c("Expected textInputModifierNode to be null");
            }
            legacyPlatformTextInputServiceAdapter.f1163a = legacyAdaptingPlatformTextInputModifierNode;
        }
        legacyAdaptingPlatformTextInputModifierNode.s = this.e;
        legacyAdaptingPlatformTextInputModifierNode.t = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return Intrinsics.c(this.d, legacyAdaptingPlatformTextInputModifier.d) && Intrinsics.c(this.e, legacyAdaptingPlatformTextInputModifier.e) && Intrinsics.c(this.f, legacyAdaptingPlatformTextInputModifier.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.d + ", legacyTextFieldState=" + this.e + ", textFieldSelectionManager=" + this.f + ')';
    }
}
