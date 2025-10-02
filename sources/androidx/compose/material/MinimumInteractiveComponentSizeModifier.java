package androidx.compose.material;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.DpSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/MinimumInteractiveComponentSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MinimumInteractiveComponentSizeModifier implements LayoutModifier {
    public final boolean equals(Object obj) {
        return (obj instanceof MinimumInteractiveComponentSizeModifier ? (MinimumInteractiveComponentSizeModifier) obj : null) != null;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableC0 = measurable.c0(j);
        final int iMax = Math.max(placeableC0.d, measureScope.r1(DpSize.b(0L)));
        final int iMax2 = Math.max(placeableC0.e, measureScope.r1(DpSize.a(0L)));
        return measureScope.L0(iMax, iMax2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.MinimumInteractiveComponentSizeModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Placeable.PlacementScope) obj).e(placeableC0, MathKt.b((iMax - r0.d) / 2.0f), MathKt.b((iMax2 - r0.e) / 2.0f), BitmapDescriptorFactory.HUE_RED);
                return Unit.f24250a;
            }
        });
    }
}
