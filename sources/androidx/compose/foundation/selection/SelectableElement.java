package androidx.compose.foundation.selection;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/selection/SelectableNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectableElement extends ModifierNodeElement<SelectableNode> {
    public final boolean d;
    public final MutableInteractionSource e;
    public final IndicationNodeFactory f;
    public final boolean g;
    public final Role h;
    public final Function0 i;

    public SelectableElement(boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, Role role, Function0 function0) {
        this.d = z;
        this.e = mutableInteractionSource;
        this.f = indicationNodeFactory;
        this.g = z2;
        this.h = role;
        this.i = function0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        SelectableNode selectableNode = new SelectableNode(this.e, this.f, this.g, null, this.h, this.i);
        selectableNode.K = this.d;
        return selectableNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SelectableNode selectableNode = (SelectableNode) node;
        boolean z = selectableNode.K;
        boolean z2 = this.d;
        if (z != z2) {
            selectableNode.K = z2;
            SemanticsModifierNodeKt.a(selectableNode);
        }
        selectableNode.C2(this.e, this.f, this.g, null, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.d == selectableElement.d && Intrinsics.c(this.e, selectableElement.e) && Intrinsics.c(this.f, selectableElement.f) && this.g == selectableElement.g && Intrinsics.c(this.h, selectableElement.h) && this.i == selectableElement.i;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.d) * 31;
        MutableInteractionSource mutableInteractionSource = this.e;
        int iHashCode2 = (iHashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.f;
        int iE = b.e((iHashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31, this.g);
        Role role = this.h;
        return this.i.hashCode() + ((iE + (role != null ? Integer.hashCode(role.f2014a) : 0)) * 31);
    }
}
