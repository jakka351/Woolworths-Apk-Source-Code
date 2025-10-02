package androidx.compose.foundation;

import androidx.compose.ui.node.LayoutNodeDrawScope;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/NoIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NoIndicationInstance implements IndicationInstance {
    public static final NoIndicationInstance d = new NoIndicationInstance();

    @Override // androidx.compose.foundation.IndicationInstance
    public final void a(LayoutNodeDrawScope layoutNodeDrawScope) {
        layoutNodeDrawScope.Q0();
    }
}
