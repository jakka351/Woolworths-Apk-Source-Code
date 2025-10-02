package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableElement;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/AnchoredDraggableNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AnchoredDraggableElement<T> extends ModifierNodeElement<AnchoredDraggableNode<T>> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        Function1 function1 = AnchoredDraggableKt.f865a;
        return new AnchoredDraggableNode(AnchoredDraggableKt$AlwaysDrag$1.h, false, null, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        AnchoredDraggableNode anchoredDraggableNode = (AnchoredDraggableNode) node;
        anchoredDraggableNode.getClass();
        anchoredDraggableNode.D2(anchoredDraggableNode.u, false, null, null, false);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AnchoredDraggableElement);
    }

    public final int hashCode() {
        throw null;
    }
}
