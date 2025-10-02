package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidScrollable_androidKt {
    public static final ScrollConfig a(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        return new AndroidConfig(ViewConfiguration.get(DelegatableNode_androidKt.a(compositionLocalConsumerModifierNode).getContext()));
    }
}
