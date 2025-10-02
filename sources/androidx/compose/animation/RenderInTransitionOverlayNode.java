package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/RenderInTransitionOverlayNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "LayerWithRenderer", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RenderInTransitionOverlayNode extends Modifier.Node implements DrawModifierNode, ModifierLocalModifierNode {
    public final MutableFloatState r = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer;", "Landroidx/compose/animation/LayerRenderer;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class LayerWithRenderer implements LayerRenderer {
        @Override // androidx.compose.animation.LayerRenderer
        public final float a() {
            throw null;
        }

        @Override // androidx.compose.animation.LayerRenderer
        public final void b(ContentDrawScope contentDrawScope) {
            throw null;
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        throw new IllegalArgumentException("Error: layer never initialized");
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        DelegatableNodeKt.h(this).getGraphicsContext().a();
        throw null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
    }
}
