package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DrawModifierNodeKt {
    public static final void a(DrawModifierNode drawModifierNode) {
        if (drawModifierNode.getD().q) {
            DelegatableNodeKt.e(drawModifierNode, 1).z1();
        }
    }
}
