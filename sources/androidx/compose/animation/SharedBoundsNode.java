package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/SharedBoundsNode;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode {
    public GraphicsLayer r;

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        throw null;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final ModifierLocalMap f0() {
        return null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        int i = SharedContentNodeKt.f729a;
        throw null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        s2(null);
        throw null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void m2() {
        GraphicsLayer graphicsLayer = this.r;
        if (graphicsLayer != null) {
            DelegatableNodeKt.h(this).getGraphicsContext().b(graphicsLayer);
        }
        s2(DelegatableNodeKt.h(this).getGraphicsContext().a());
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode, androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableC0 = measurable.c0(j);
        float f = placeableC0.d;
        float f2 = placeableC0.e;
        final long jFloatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>(this, jFloatToRawIntBits) { // from class: androidx.compose.animation.SharedBoundsNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                if (placementScope.b() != null) {
                    throw null;
                }
                placementScope.e(this.h, 0, 0, BitmapDescriptorFactory.HUE_RED);
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public final MeasureResult s0(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
        throw null;
    }

    public final void s2(GraphicsLayer graphicsLayer) {
        if (graphicsLayer != null) {
            throw null;
        }
        GraphicsLayer graphicsLayer2 = this.r;
        if (graphicsLayer2 != null) {
            DelegatableNodeKt.h(this).getGraphicsContext().b(graphicsLayer2);
        }
        this.r = graphicsLayer;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public final boolean w1(long j) {
        throw null;
    }
}
