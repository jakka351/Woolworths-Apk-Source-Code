package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegateKt {
    public static final boolean a(LayoutNode layoutNode) {
        if (layoutNode.m == null) {
            return false;
        }
        LayoutNode layoutNodeK = layoutNode.K();
        return (layoutNodeK != null ? layoutNodeK.m : null) == null || layoutNode.L.b;
    }
}
