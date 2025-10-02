package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/DelegatingThemeAwareRippleNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DelegatingThemeAwareRippleNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    public final InteractionSource t;
    public final boolean u;
    public final float v;
    public final ColorProducer w;
    public AndroidRippleNode x;

    public DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z, float f, ColorProducer colorProducer) {
        this.t = interactionSource;
        this.u = z;
        this.v = f;
        this.w = colorProducer;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        ObserverModifierNodeKt.a(this, new DelegatingThemeAwareRippleNode$updateConfiguration$1(this));
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void o1() {
        ObserverModifierNodeKt.a(this, new DelegatingThemeAwareRippleNode$updateConfiguration$1(this));
    }
}
