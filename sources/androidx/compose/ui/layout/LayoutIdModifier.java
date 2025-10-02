package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdModifier;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LayoutIdModifier extends Modifier.Node implements ParentDataModifierNode, LayoutIdParentData {
    public Object r;

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    /* renamed from: A1, reason: from getter */
    public final Object getR() {
        return this.r;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object D(Density density, Object obj) {
        return this;
    }
}
