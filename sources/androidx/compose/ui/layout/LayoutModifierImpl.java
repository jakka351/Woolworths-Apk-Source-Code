package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifierImpl;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LayoutModifierImpl extends Modifier.Node implements LayoutModifierNode {
    public Function3 r;

    public LayoutModifierImpl(Function3 function3) {
        this.r = function3;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        return (MeasureResult) this.r.invoke(measureScope, measurable, new Constraints(j));
    }

    public final void s2(Function3 function3) {
        this.r = function3;
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.r + ')';
    }
}
