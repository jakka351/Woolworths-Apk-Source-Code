package androidx.compose.foundation.gestures;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/DraggableNode;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DraggableElement extends ModifierNodeElement<DraggableNode> {
    public static final Function1 l = null;
    public final DraggableState d;
    public final Orientation e;
    public final boolean f;
    public final MutableInteractionSource g;
    public final boolean h;
    public final Function3 i;
    public final Function3 j;
    public final boolean k;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public DraggableElement(DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function3 function3, Function3 function32, boolean z3) {
        this.d = draggableState;
        this.e = orientation;
        this.f = z;
        this.g = mutableInteractionSource;
        this.h = z2;
        this.i = function3;
        this.j = function32;
        this.k = z3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        DraggableElement$Companion$CanDrag$1 draggableElement$Companion$CanDrag$1 = DraggableElement$Companion$CanDrag$1.h;
        boolean z = this.f;
        MutableInteractionSource mutableInteractionSource = this.g;
        Orientation orientation = this.e;
        DraggableNode draggableNode = new DraggableNode(draggableElement$Companion$CanDrag$1, z, mutableInteractionSource, orientation);
        draggableNode.B = this.d;
        draggableNode.C = orientation;
        draggableNode.D = this.h;
        draggableNode.E = this.i;
        draggableNode.F = this.j;
        draggableNode.G = this.k;
        return draggableNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        boolean z;
        boolean z2;
        DraggableNode draggableNode = (DraggableNode) node;
        DraggableState draggableState = draggableNode.B;
        DraggableState draggableState2 = this.d;
        if (Intrinsics.c(draggableState, draggableState2)) {
            z = false;
        } else {
            draggableNode.B = draggableState2;
            z = true;
        }
        Orientation orientation = draggableNode.C;
        Orientation orientation2 = this.e;
        if (orientation != orientation2) {
            draggableNode.C = orientation2;
            z = true;
        }
        boolean z3 = draggableNode.G;
        boolean z4 = this.k;
        if (z3 != z4) {
            draggableNode.G = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        draggableNode.E = this.i;
        draggableNode.F = this.j;
        draggableNode.D = this.h;
        draggableNode.D2(DraggableElement$Companion$CanDrag$1.h, this.f, this.g, orientation2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return Intrinsics.c(this.d, draggableElement.d) && this.e == draggableElement.e && this.f == draggableElement.f && Intrinsics.c(this.g, draggableElement.g) && this.h == draggableElement.h && Intrinsics.c(this.i, draggableElement.i) && Intrinsics.c(this.j, draggableElement.j) && this.k == draggableElement.k;
    }

    public final int hashCode() {
        int iE = b.e((this.e.hashCode() + (this.d.hashCode() * 31)) * 31, 31, this.f);
        MutableInteractionSource mutableInteractionSource = this.g;
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + ((this.i.hashCode() + b.e((iE + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31, 31, this.h)) * 31)) * 31);
    }
}
