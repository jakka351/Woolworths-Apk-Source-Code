package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/ApproachLayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class ApproachLayoutElement extends ModifierNodeElement<ApproachLayoutModifierNodeImpl> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new ApproachLayoutModifierNodeImpl();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((ApproachLayoutModifierNodeImpl) node).getClass();
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ApproachLayoutElement);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ApproachLayoutElement(approachMeasure=null, isMeasurementApproachInProgress=null, isPlacementApproachInProgress=null)";
    }
}
