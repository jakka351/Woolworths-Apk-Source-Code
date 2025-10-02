package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsElement;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/internal/DraggableAnchorsNode;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DraggableAnchorsElement<T> extends ModifierNodeElement<DraggableAnchorsNode<T>> {
    public final AnchoredDraggableState d;
    public final Function2 e;
    public final Orientation f;

    public DraggableAnchorsElement(AnchoredDraggableState anchoredDraggableState, Function2 function2, Orientation orientation) {
        this.d = anchoredDraggableState;
        this.e = function2;
        this.f = orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        DraggableAnchorsNode draggableAnchorsNode = new DraggableAnchorsNode();
        draggableAnchorsNode.r = this.d;
        draggableAnchorsNode.s = this.e;
        draggableAnchorsNode.t = this.f;
        return draggableAnchorsNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        DraggableAnchorsNode draggableAnchorsNode = (DraggableAnchorsNode) node;
        draggableAnchorsNode.r = this.d;
        draggableAnchorsNode.s = this.e;
        draggableAnchorsNode.t = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return Intrinsics.c(this.d, draggableAnchorsElement.d) && this.e == draggableAnchorsElement.e && this.f == draggableAnchorsElement.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }
}
