package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class OnSizeChangedNode extends Modifier.Node implements LayoutAwareModifierNode {
    public Function1 r;
    public long s;

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void G(long j) {
        if (IntSize.b(this.s, j)) {
            return;
        }
        this.r.invoke(new IntSize(j));
        this.s = j;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return true;
    }
}
