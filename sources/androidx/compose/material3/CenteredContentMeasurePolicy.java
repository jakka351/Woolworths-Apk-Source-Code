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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/CenteredContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CenteredContentMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        final ArrayList arrayList;
        int iH = Constraints.h(j);
        int i = Constraints.i(j);
        int size = list.size();
        if (size < 1) {
            return measureScope.L0(iH, i, EmptyMap.d, CenteredContentMeasurePolicy$measure$1.h);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        int i2 = 0;
        if (Constraints.d(j)) {
            int i3 = iH / size;
            float f = ExpressiveNavigationBarKt.f1446a;
            int iB = size > 6 ? 0 : MathKt.b((((100 - ((size + 3) * 10)) / 2.0f) / 100) * iH);
            intRef.d = iB;
            int i4 = (iH - (iB * 2)) / size;
            int size2 = list.size();
            for (int i5 = 0; i5 < size2; i5++) {
                int iJ = ((Measurable) list.get(i5)).J(i4);
                if (i < iJ) {
                    int iG = Constraints.g(j);
                    if (iJ > iG) {
                        iJ = iG;
                    }
                    i = iJ;
                }
            }
            arrayList = new ArrayList(list.size());
            int size3 = list.size();
            while (i2 < size3) {
                Measurable measurable = (Measurable) list.get(i2);
                int iB0 = measurable.b0(Constraints.i(j));
                if (i4 < iB0) {
                    if (iB0 > i3) {
                        iB0 = i3;
                    }
                    intRef.d -= (iB0 - i4) / 2;
                } else {
                    iB0 = i4;
                }
                arrayList.add(measurable.c0(ConstraintsKt.e(j, Constraints.Companion.c(iB0, i))));
                i2++;
            }
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            while (i2 < size4) {
                arrayList.add(((Measurable) list.get(i2)).c0(ConstraintsKt.e(j, Constraints.Companion.d(i))));
                i2++;
            }
        }
        return measureScope.L0(iH, i, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int i6 = intRef.d;
                ArrayList arrayList2 = arrayList;
                int size5 = arrayList2.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    Placeable placeable = (Placeable) arrayList2.get(i7);
                    Placeable.PlacementScope.h(placementScope, placeable, i6, 0);
                    i6 += placeable.d;
                }
                return Unit.f24250a;
            }
        });
    }
}
