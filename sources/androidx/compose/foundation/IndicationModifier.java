package androidx.compose.foundation;

import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/IndicationModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class IndicationModifier implements DrawModifier {
    public final IndicationInstance d;

    public IndicationModifier(IndicationInstance indicationInstance) {
        this.d = indicationInstance;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        this.d.a(layoutNodeDrawScope);
    }
}
