package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/SensitiveContentNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final /* data */ class SensitiveContentNode extends Modifier.Node {
    public boolean r;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SensitiveContentNode);
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        if (this.r) {
            DelegatableNodeKt.h(this).l();
            this.r = false;
        }
    }

    public final String toString() {
        return "SensitiveContentNode(_isContentSensitive=false)";
    }
}
