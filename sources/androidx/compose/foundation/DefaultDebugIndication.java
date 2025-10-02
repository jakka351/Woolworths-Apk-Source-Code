package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication;", "Landroidx/compose/foundation/IndicationNodeFactory;", "DefaultDebugIndicationInstance", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DefaultDebugIndication implements IndicationNodeFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final DefaultDebugIndication f832a = new DefaultDebugIndication();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication$DefaultDebugIndicationInstance;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultDebugIndicationInstance extends Modifier.Node implements DrawModifierNode {
        public final InteractionSource r;
        public boolean s;
        public boolean t;
        public boolean u;

        public DefaultDebugIndicationInstance(InteractionSource interactionSource) {
            this.r = interactionSource;
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
            CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.d;
            layoutNodeDrawScope.Q0();
            if (this.s) {
                DrawScope.S(layoutNodeDrawScope, Color.b(Color.b, 0.3f), 0L, canvasDrawScope.h(), BitmapDescriptorFactory.HUE_RED, null, null, 122);
            } else if (this.t || this.u) {
                DrawScope.S(layoutNodeDrawScope, Color.b(Color.b, 0.1f), 0L, canvasDrawScope.h(), BitmapDescriptorFactory.HUE_RED, null, null, 122);
            }
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void k2() {
            BuildersKt.c(g2(), null, null, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3);
        }
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final DelegatableNode a(InteractionSource interactionSource) {
        return new DefaultDebugIndicationInstance(interactionSource);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final int hashCode() {
        return -1;
    }
}
