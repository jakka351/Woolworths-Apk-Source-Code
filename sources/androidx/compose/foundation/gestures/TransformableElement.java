package androidx.compose.foundation.gestures;

import androidx.camera.core.impl.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/TransformableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/TransformableNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TransformableElement extends ModifierNodeElement<TransformableNode> {
    public final TransformableState d;
    public final Function1 e = TransformableKt$transformable$1.h;

    public TransformableElement(TransformableState transformableState) {
        this.d = transformableState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new TransformableNode(this.d);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        TransformableNode transformableNode = (TransformableNode) node;
        transformableNode.u = TransformableKt$transformable$1.h;
        TransformableState transformableState = transformableNode.t;
        TransformableState transformableState2 = this.d;
        if (Intrinsics.c(transformableState, transformableState2) && transformableNode.v) {
            return;
        }
        transformableNode.t = transformableState2;
        transformableNode.v = true;
        transformableNode.z.v1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && TransformableElement.class == obj.getClass() && Intrinsics.c(this.d, ((TransformableElement) obj).d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + b.e((TransformableKt$transformable$1.h.hashCode() + (this.d.hashCode() * 31)) * 31, 31, false);
    }
}
