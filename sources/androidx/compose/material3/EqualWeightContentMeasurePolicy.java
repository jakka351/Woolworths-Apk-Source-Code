package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/EqualWeightContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class EqualWeightContentMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        final ArrayList arrayList;
        int iH = Constraints.h(j);
        int i = Constraints.i(j);
        int size = list.size();
        if (size < 1) {
            return measureScope.L0(iH, i, EmptyMap.d, EqualWeightContentMeasurePolicy$measure$1.h);
        }
        int i2 = 0;
        if (Constraints.d(j)) {
            int i3 = iH / size;
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                int iJ = ((Measurable) list.get(i4)).J(i3);
                if (i < iJ) {
                    int iG = Constraints.g(j);
                    if (iJ > iG) {
                        iJ = iG;
                    }
                    i = iJ;
                }
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            int size3 = list.size();
            while (i2 < size3) {
                arrayList2.add(((Measurable) list.get(i2)).c0(ConstraintsKt.e(j, Constraints.Companion.c(i3, i))));
                i2++;
            }
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            while (i2 < size4) {
                arrayList.add(((Measurable) list.get(i2)).c0(ConstraintsKt.e(j, Constraints.Companion.d(i))));
                i2++;
            }
        }
        return measureScope.L0(iH, i, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.EqualWeightContentMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                ArrayList arrayList3 = arrayList;
                int size5 = arrayList3.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size5; i6++) {
                    Placeable placeable = (Placeable) arrayList3.get(i6);
                    Placeable.PlacementScope.h(placementScope, placeable, i5, 0);
                    i5 += placeable.d;
                }
                return Unit.f24250a;
            }
        });
    }
}
