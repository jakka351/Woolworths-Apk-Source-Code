package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class FocusRequesterNode extends Modifier.Node implements FocusRequesterModifierNode {
    public FocusRequester r;

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        this.r.f1749a.c(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        this.r.f1749a.k(this);
    }
}
