package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppendedSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {
    public final boolean d;
    public final Function1 e;

    public AppendedSemanticsElement(Function1 function1, boolean z) {
        this.d = z;
        this.e = function1;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    public final SemanticsConfiguration R() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.f = this.d;
        this.e.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new CoreSemanticsModifierNode(this.d, false, this.e);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        CoreSemanticsModifierNode coreSemanticsModifierNode = (CoreSemanticsModifierNode) node;
        coreSemanticsModifierNode.r = this.d;
        coreSemanticsModifierNode.t = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.d == appendedSemanticsElement.d && Intrinsics.c(this.e, appendedSemanticsElement.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (Boolean.hashCode(this.d) * 31);
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.d + ", properties=" + this.e + ')';
    }
}
