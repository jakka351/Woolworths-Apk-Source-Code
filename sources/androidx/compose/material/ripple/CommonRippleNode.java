package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/CommonRippleNode;", "Landroidx/compose/material/ripple/RippleNode;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CommonRippleNode extends RippleNode {
    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        throw null;
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void s2(PressInteraction.Press press, long j, float f) {
        throw null;
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void t2(LayoutNodeDrawScope layoutNodeDrawScope) {
        if (((RippleAlpha) this.v.invoke()).d != BitmapDescriptorFactory.HUE_RED) {
            throw null;
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void v2(PressInteraction.Press press) {
        throw null;
    }
}
