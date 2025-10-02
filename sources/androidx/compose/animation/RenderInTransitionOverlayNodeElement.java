package androidx.compose.animation;

import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/RenderInTransitionOverlayNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/RenderInTransitionOverlayNode;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RenderInTransitionOverlayNodeElement extends ModifierNodeElement<RenderInTransitionOverlayNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new RenderInTransitionOverlayNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        RenderInTransitionOverlayNode renderInTransitionOverlayNode = (RenderInTransitionOverlayNode) node;
        renderInTransitionOverlayNode.getClass();
        ((SnapshotMutableFloatStateImpl) renderInTransitionOverlayNode.r).p(BitmapDescriptorFactory.HUE_RED);
    }

    public final boolean equals(Object obj) {
        return obj instanceof RenderInTransitionOverlayNodeElement;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "RenderInTransitionOverlayNodeElement(sharedTransitionScope=null, renderInOverlay=null, zIndexInOverlay=0.0, clipInOverlay=null)";
    }
}
