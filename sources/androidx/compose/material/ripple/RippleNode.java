package androidx.compose.material.ripple;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class RippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {
    public final InteractionSource r;
    public final boolean s;
    public final float t;
    public final ColorProducer u;
    public final Function0 v;
    public StateLayer w;
    public float x;
    public boolean z;
    public long y = 0;
    public final MutableObjectList A = new MutableObjectList();

    public RippleNode(InteractionSource interactionSource, boolean z, float f, ColorProducer colorProducer, Function0 function0) {
        this.r = interactionSource;
        this.s = z;
        this.t = f;
        this.u = colorProducer;
        this.v = function0;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void G(long j) {
        this.z = true;
        Density density = DelegatableNodeKt.g(this).D;
        this.y = IntSizeKt.d(j);
        float f = this.t;
        this.x = Float.isNaN(f) ? RippleAnimationKt.a(density, this.s, this.y) : density.T1(f);
        MutableObjectList mutableObjectList = this.A;
        Object[] objArr = mutableObjectList.f694a;
        int i = mutableObjectList.b;
        for (int i2 = 0; i2 < i; i2++) {
            u2((PressInteraction) objArr[i2]);
        }
        mutableObjectList.j();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        layoutNodeDrawScope.Q0();
        StateLayer stateLayer = this.w;
        if (stateLayer != null) {
            stateLayer.a(layoutNodeDrawScope, this.x, this.u.a());
        }
        t2(layoutNodeDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        BuildersKt.c(g2(), null, null, new RippleNode$onAttach$1(this, null), 3);
    }

    public abstract void s2(PressInteraction.Press press, long j, float f);

    public abstract void t2(LayoutNodeDrawScope layoutNodeDrawScope);

    public final void u2(PressInteraction pressInteraction) {
        if (pressInteraction instanceof PressInteraction.Press) {
            s2((PressInteraction.Press) pressInteraction, this.y, this.x);
        } else if (pressInteraction instanceof PressInteraction.Release) {
            v2(((PressInteraction.Release) pressInteraction).f926a);
        } else if (pressInteraction instanceof PressInteraction.Cancel) {
            v2(((PressInteraction.Cancel) pressInteraction).getF924a());
        }
    }

    public abstract void v2(PressInteraction.Press press);
}
