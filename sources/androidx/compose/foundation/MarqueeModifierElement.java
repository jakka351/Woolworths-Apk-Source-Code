package androidx.compose.foundation;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/MarqueeModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class MarqueeModifierElement extends ModifierNodeElement<MarqueeModifierNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new MarqueeModifierNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        MarqueeModifierNode marqueeModifierNode = (MarqueeModifierNode) node;
        ((SnapshotMutableStateImpl) marqueeModifierNode.w).setValue(null);
        ((SnapshotMutableStateImpl) marqueeModifierNode.x).setValue(new MarqueeAnimationMode());
        if (Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED)) {
            return;
        }
        marqueeModifierNode.u2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarqueeModifierElement) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public final int hashCode() {
        Integer.hashCode(0);
        Integer.hashCode(0);
        Integer.hashCode(0);
        Integer.hashCode(0);
        throw null;
    }

    public final String toString() {
        return "MarqueeModifierElement(iterations=0, animationMode=Immediately, delayMillis=0, initialDelayMillis=0, spacing=null, velocity=" + ((Object) Dp.b(BitmapDescriptorFactory.HUE_RED)) + ')';
    }
}
