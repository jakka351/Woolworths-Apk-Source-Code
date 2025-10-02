package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DelegatableNode_androidKt {
    public static final View a(DelegatableNode delegatableNode) {
        if (!delegatableNode.getD().q) {
            InlineClassHelperKt.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) LayoutNodeKt.a(DelegatableNodeKt.g(delegatableNode));
    }
}
