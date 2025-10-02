package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableNode;", "Landroidx/compose/foundation/ClickableNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TriStateToggleableNode extends ClickableNode {
    public ToggleableState K;

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void v2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        ToggleableState toggleableState = this.K;
        KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.H;
        KProperty kProperty = SemanticsPropertiesKt.f2022a[23];
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, toggleableState);
    }
}
