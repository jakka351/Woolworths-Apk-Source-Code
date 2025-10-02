package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/DraggableAnchorsNode;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DraggableAnchorsNode<T> extends Modifier.Node implements LayoutModifierNode {
    public AnchoredDraggableState r;
    public Function2 s;
    public Orientation t;
    public boolean u;

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        this.u = false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(final MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableC0 = measurable.c0(j);
        if (!measureScope.l1() || !this.u) {
            Pair pair = (Pair) this.s.invoke(new IntSize(IntSizeKt.a(placeableC0.d, placeableC0.e)), new Constraints(j));
            this.r.l((DraggableAnchors) pair.d, pair.e);
        }
        this.u = measureScope.l1() || this.u;
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.DraggableAnchorsNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                boolean zL1 = measureScope.l1();
                DraggableAnchorsNode draggableAnchorsNode = this;
                float fC = zL1 ? draggableAnchorsNode.r.e().c(draggableAnchorsNode.r.h.getD()) : draggableAnchorsNode.r.g();
                Orientation orientation = draggableAnchorsNode.t;
                float f = orientation == Orientation.e ? fC : 0.0f;
                if (orientation != Orientation.d) {
                    fC = 0.0f;
                }
                placementScope.e(placeableC0, MathKt.b(f), MathKt.b(fC), BitmapDescriptorFactory.HUE_RED);
                return Unit.f24250a;
            }
        });
    }
}
