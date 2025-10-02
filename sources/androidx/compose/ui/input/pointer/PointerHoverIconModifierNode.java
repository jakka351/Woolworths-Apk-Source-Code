package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;", "Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PointerHoverIconModifierNode extends HoverIconModifierNode {
    @Override // androidx.compose.ui.node.TraversableNode
    /* renamed from: W0 */
    public final /* bridge */ /* synthetic */ Object getT() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public final void t2(PointerIcon pointerIcon) {
        PointerIconService pointerIconService = (PointerIconService) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.u);
        if (pointerIconService != null) {
            pointerIconService.b(pointerIcon);
        }
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public final boolean v2(int i) {
        return (i == 3 || i == 4) ? false : true;
    }
}
