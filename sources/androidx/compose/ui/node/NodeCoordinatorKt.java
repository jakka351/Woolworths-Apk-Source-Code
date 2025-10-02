package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class NodeCoordinatorKt {
    public static final Modifier.Node a(DelegatableNode delegatableNode, int i) {
        Modifier.Node node = delegatableNode.getD().i;
        if (node == null || (node.g & i) == 0) {
            return null;
        }
        while (node != null) {
            int i2 = node.f;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return node;
            }
            node = node.i;
        }
        return null;
    }
}
