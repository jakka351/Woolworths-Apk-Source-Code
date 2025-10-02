package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class PaddingNode extends Modifier.Node implements LayoutModifierNode {
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(final MeasureScope measureScope, Measurable measurable, long j) {
        int iR1 = measureScope.r1(this.t) + measureScope.r1(this.r);
        int iR12 = measureScope.r1(this.u) + measureScope.r1(this.s);
        final Placeable placeableC0 = measurable.c0(ConstraintsKt.i(-iR1, -iR12, j));
        return measureScope.L0(ConstraintsKt.g(placeableC0.d + iR1, j), ConstraintsKt.f(placeableC0.e + iR12, j), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.PaddingNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                PaddingNode paddingNode = this.h;
                boolean z = paddingNode.v;
                Placeable placeable = placeableC0;
                MeasureScope measureScope2 = measureScope;
                if (z) {
                    Placeable.PlacementScope.h(placementScope, placeable, measureScope2.r1(paddingNode.r), measureScope2.r1(paddingNode.s));
                } else {
                    placementScope.e(placeable, measureScope2.r1(paddingNode.r), measureScope2.r1(paddingNode.s), BitmapDescriptorFactory.HUE_RED);
                }
                return Unit.f24250a;
            }
        });
    }
}
