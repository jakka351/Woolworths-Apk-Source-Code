package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final RootMeasurePolicy b = new RootMeasurePolicy("Undefined intrinsics block and it is required");

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return measureScope.L0(Constraints.j(j), Constraints.i(j), EmptyMap.d, RootMeasurePolicy$measure$1.h);
        }
        if (size == 1) {
            final Placeable placeableC0 = ((Measurable) list.get(0)).c0(j);
            return measureScope.L0(ConstraintsKt.g(placeableC0.d, j), ConstraintsKt.f(placeableC0.e, j), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Placeable.PlacementScope.i((Placeable.PlacementScope) obj, placeableC0, 0, 0);
                    return Unit.f24250a;
                }
            });
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            Placeable placeableC02 = ((Measurable) list.get(i)).c0(j);
            iMax = Math.max(placeableC02.d, iMax);
            iMax2 = Math.max(placeableC02.e, iMax2);
            arrayList.add(placeableC02);
        }
        return measureScope.L0(ConstraintsKt.g(iMax, j), ConstraintsKt.f(iMax2, j), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                ArrayList arrayList2 = arrayList;
                int size3 = arrayList2.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    Placeable.PlacementScope.i(placementScope, (Placeable) arrayList2.get(i2), 0, 0);
                }
                return Unit.f24250a;
            }
        });
    }
}
