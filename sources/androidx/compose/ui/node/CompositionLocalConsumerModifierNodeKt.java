package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CompositionLocalConsumerModifierNodeKt {
    public static final Object a(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode, CompositionLocal compositionLocal) {
        if (!compositionLocalConsumerModifierNode.getD().q) {
            InlineClassHelperKt.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return DelegatableNodeKt.g(compositionLocalConsumerModifierNode).G.a(compositionLocal);
    }
}
