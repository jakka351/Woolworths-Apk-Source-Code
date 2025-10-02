package androidx.compose.foundation;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/CombinedClickableNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CombinedClickableElement extends ModifierNodeElement<CombinedClickableNode> {
    public final MutableInteractionSource d;
    public final IndicationNodeFactory e;
    public final boolean f;
    public final Function0 g;
    public final boolean h;

    public CombinedClickableElement(IndicationNodeFactory indicationNodeFactory, MutableInteractionSource mutableInteractionSource, Function0 function0, boolean z, boolean z2) {
        this.d = mutableInteractionSource;
        this.e = indicationNodeFactory;
        this.f = z;
        this.g = function0;
        this.h = z2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new CombinedClickableNode(this.e, this.d, this.g, this.h, this.f);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode;
        CombinedClickableNode combinedClickableNode = (CombinedClickableNode) node;
        combinedClickableNode.K = this.h;
        boolean z = combinedClickableNode.x;
        boolean z2 = this.f;
        boolean z3 = z != z2;
        combinedClickableNode.C2(this.d, this.e, z2, null, null, this.g);
        if (!z3 || (suspendingPointerInputModifierNode = combinedClickableNode.A) == null) {
            return;
        }
        suspendingPointerInputModifierNode.v1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return Intrinsics.c(this.d, combinedClickableElement.d) && Intrinsics.c(this.e, combinedClickableElement.e) && this.f == combinedClickableElement.f && this.g == combinedClickableElement.g && this.h == combinedClickableElement.h;
    }

    public final int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.d;
        int iHashCode = (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0) * 31;
        IndicationNodeFactory indicationNodeFactory = this.e;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + b.e((iHashCode + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 29791, this.f)) * 923521);
    }
}
