package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {
    public PaddingValues r;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        float fB = this.r.b(measureScope.getD());
        float b = this.r.getB();
        float fC = this.r.c(measureScope.getD());
        float d = this.r.getD();
        float f = 0;
        if (!((Float.compare(d, f) >= 0) & (Float.compare(fB, f) >= 0) & (Float.compare(b, f) >= 0) & (Float.compare(fC, f) >= 0))) {
            InlineClassHelperKt.a("Padding must be non-negative");
        }
        final int iR1 = measureScope.r1(fB);
        int iR12 = measureScope.r1(fC) + iR1;
        final int iR13 = measureScope.r1(b);
        int iR14 = measureScope.r1(d) + iR13;
        final Placeable placeableC0 = measurable.c0(ConstraintsKt.i(-iR12, -iR14, j));
        return measureScope.L0(ConstraintsKt.g(placeableC0.d + iR12, j), ConstraintsKt.f(placeableC0.e + iR14, j), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Placeable.PlacementScope) obj).e(placeableC0, iR1, iR13, BitmapDescriptorFactory.HUE_RED);
                return Unit.f24250a;
            }
        });
    }
}
