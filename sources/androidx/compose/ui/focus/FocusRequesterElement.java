package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusRequesterNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final /* data */ class FocusRequesterElement extends ModifierNodeElement<FocusRequesterNode> {
    public final FocusRequester d;

    public FocusRequesterElement(FocusRequester focusRequester) {
        this.d = focusRequester;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        FocusRequesterNode focusRequesterNode = new FocusRequesterNode();
        focusRequesterNode.r = this.d;
        return focusRequesterNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        FocusRequesterNode focusRequesterNode = (FocusRequesterNode) node;
        focusRequesterNode.r.f1749a.k(focusRequesterNode);
        FocusRequester focusRequester = this.d;
        focusRequesterNode.r = focusRequester;
        focusRequester.f1749a.c(focusRequesterNode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.c(this.d, ((FocusRequesterElement) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.d + ')';
    }
}
