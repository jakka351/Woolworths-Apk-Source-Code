package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/TestTagNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class TestTagNode extends Modifier.Node implements SemanticsModifierNode {
    public String r;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void b2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        String str = this.r;
        KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.x;
        KProperty kProperty = SemanticsPropertiesKt.f2022a[13];
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, str);
    }
}
