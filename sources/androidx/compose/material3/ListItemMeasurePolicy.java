package androidx.compose.material3;

import androidx.compose.material3.ListItemType;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/ListItemMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ListItemMeasurePolicy implements MultiContentMeasurePolicy {
    public static int a(IntrinsicMeasureScope intrinsicMeasureScope, ArrayList arrayList, int i, Function2 function2) {
        int iIntValue;
        int iIntValue2;
        int i2 = i;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int iR1 = intrinsicMeasureScope.r1(ListItemKt.c + ListItemKt.d);
        if (i2 != Integer.MAX_VALUE) {
            i2 -= iR1;
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.F(list4);
        if (intrinsicMeasurable != null) {
            iIntValue = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i2))).intValue();
            int iB0 = intrinsicMeasurable.b0(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iB0;
            }
        } else {
            iIntValue = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.F(list5);
        if (intrinsicMeasurable2 != null) {
            iIntValue2 = ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i2))).intValue();
            int iB02 = intrinsicMeasurable2.b0(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iB02;
            }
        } else {
            iIntValue2 = 0;
        }
        Object obj = (IntrinsicMeasurable) CollectionsKt.F(list2);
        int iIntValue3 = obj != null ? ((Number) function2.invoke(obj, Integer.valueOf(i2))).intValue() : 0;
        Object obj2 = (IntrinsicMeasurable) CollectionsKt.F(list);
        int iIntValue4 = obj2 != null ? ((Number) function2.invoke(obj2, Integer.valueOf(i2))).intValue() : 0;
        Object obj3 = (IntrinsicMeasurable) CollectionsKt.F(list3);
        int iIntValue5 = obj3 != null ? ((Number) function2.invoke(obj3, Integer.valueOf(i2))).intValue() : 0;
        int iA = ListItemType.Companion.a(iIntValue3 > 0, iIntValue5 > 0, iIntValue5 > intrinsicMeasureScope.W1(TextUnitKt.c(30)));
        return ListItemKt.c(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, iA, intrinsicMeasureScope.r1((iA == 3 ? ListItemKt.b : ListItemKt.f1455a) * 2), ConstraintsKt.b(0, 0, 15));
    }

    public static int b(IntrinsicMeasureScope intrinsicMeasureScope, ArrayList arrayList, int i, Function2 function2) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.F(list4);
        int iIntValue = intrinsicMeasurable != null ? ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.F(list5);
        int iIntValue2 = intrinsicMeasurable2 != null ? ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.F(list);
        int iIntValue3 = intrinsicMeasurable3 != null ? ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(i))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.F(list2);
        int iIntValue4 = intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.F(list3);
        int iIntValue5 = intrinsicMeasurable5 != null ? ((Number) function2.invoke(intrinsicMeasurable5, Integer.valueOf(i))).intValue() : 0;
        int iR1 = intrinsicMeasureScope.r1(ListItemKt.c + ListItemKt.d);
        long jB = ConstraintsKt.b(0, 0, 15);
        return Constraints.d(jB) ? Constraints.h(jB) : YU.a.b(iR1, iIntValue, Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)), iIntValue2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        float f;
        Placeable placeableC0;
        int i;
        Placeable placeableC02;
        float f2;
        Placeable placeableC03;
        float f3;
        int i2;
        float f4;
        int i3;
        float f5;
        int i4;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        List list6 = (List) arrayList.get(4);
        long jA = Constraints.a(j, 0, 0, 0, 0, 10);
        float f6 = ListItemKt.c;
        float f7 = ListItemKt.d;
        int iR1 = measureScope.r1(f6 + f7);
        Measurable measurable = (Measurable) CollectionsKt.F(list5);
        int iA0 = measurable != null ? measurable.a0(Constraints.g(j)) : 0;
        Measurable measurable2 = (Measurable) CollectionsKt.F(list6);
        int iA02 = measurable2 != null ? measurable2.a0(Constraints.g(j)) : 0;
        int iH = Constraints.h(jA);
        int i5 = iA0 + iA02 + iR1;
        if (iH != Integer.MAX_VALUE) {
            iH -= i5;
        }
        Measurable measurable3 = (Measurable) CollectionsKt.F(list4);
        float f8 = ListItemType.Companion.a(CollectionsKt.F(list3) != null, CollectionsKt.F(list4) != null, (measurable3 != null ? measurable3.T(iH) : 0) > measureScope.W1(TextUnitKt.c(30))) == 3 ? ListItemKt.b : ListItemKt.f1455a;
        float f9 = 2;
        long jI = ConstraintsKt.i(-iR1, -measureScope.r1(f8 * f9), jA);
        Measurable measurable4 = (Measurable) CollectionsKt.F(list5);
        Placeable placeableC04 = measurable4 != null ? measurable4.c0(jI) : null;
        float f10 = TextFieldImplKt.b;
        int i6 = placeableC04 != null ? placeableC04.d : 0;
        Measurable measurable5 = (Measurable) CollectionsKt.F(list6);
        if (measurable5 != null) {
            f = f6;
            placeableC0 = measurable5.c0(ConstraintsKt.j(-i6, 0, 2, jI));
        } else {
            f = f6;
            placeableC0 = null;
        }
        int i7 = i6 + (placeableC0 != null ? placeableC0.d : 0);
        Measurable measurable6 = (Measurable) CollectionsKt.F(list2);
        if (measurable6 != null) {
            i = 0;
            placeableC02 = measurable6.c0(ConstraintsKt.j(-i7, 0, 2, jI));
        } else {
            i = 0;
            placeableC02 = null;
        }
        int i8 = placeableC02 != null ? placeableC02.e : i;
        Measurable measurable7 = (Measurable) CollectionsKt.F(list4);
        if (measurable7 != null) {
            f2 = f9;
            placeableC03 = measurable7.c0(ConstraintsKt.i(-i7, -i8, jI));
        } else {
            f2 = f9;
            placeableC03 = null;
        }
        int i9 = i8 + (placeableC03 != null ? placeableC03.e : i);
        boolean z = (placeableC03 == null || placeableC03.d0(AlignmentLineKt.f1871a) == placeableC03.d0(AlignmentLineKt.b)) ? i : 1;
        Measurable measurable8 = (Measurable) CollectionsKt.F(list3);
        Placeable placeableC05 = measurable8 != null ? measurable8.c0(ConstraintsKt.i(-i7, -i9, jI)) : null;
        int iA = ListItemType.Companion.a(placeableC05 != null ? 1 : i, placeableC03 != null ? 1 : i, z);
        float f11 = iA == 3 ? ListItemKt.b : ListItemKt.f1455a;
        float f12 = f11 * f2;
        final int iH2 = Constraints.d(j) ? Constraints.h(j) : YU.a.b(iR1, placeableC04 != null ? placeableC04.d : i, Math.max(placeableC02 != null ? placeableC02.d : i, Math.max(placeableC05 != null ? placeableC05.d : i, placeableC03 != null ? placeableC03.d : 0)), placeableC0 != null ? placeableC0.d : i);
        int i10 = placeableC04 != null ? placeableC04.e : 0;
        if (placeableC0 != null) {
            f3 = f11;
            i2 = placeableC0.e;
        } else {
            f3 = f11;
            i2 = 0;
        }
        if (placeableC02 != null) {
            f4 = f3;
            i3 = placeableC02.e;
        } else {
            f4 = f3;
            i3 = 0;
        }
        if (placeableC05 != null) {
            f5 = f4;
            i4 = placeableC05.e;
        } else {
            f5 = f4;
            i4 = 0;
        }
        final Placeable placeable = placeableC05;
        int i11 = i10;
        float f13 = f5;
        final int iC = ListItemKt.c(measureScope, i11, i2, i3, i4, placeableC03 != null ? placeableC03.e : 0, iA, measureScope.r1(f12), j);
        final boolean z2 = iA == 3;
        final int iR12 = measureScope.r1(f);
        final int iR13 = measureScope.r1(f7);
        final int iR14 = measureScope.r1(f13);
        final Placeable placeable2 = placeableC04;
        final Placeable placeable3 = placeableC0;
        final Placeable placeable4 = placeableC02;
        final Placeable placeable5 = placeableC03;
        return measureScope.L0(iH2, iC, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ListItemKt$place$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int i12 = iR12;
                BiasAlignment.Vertical vertical = Alignment.Companion.k;
                int i13 = iC;
                int iA2 = iR14;
                boolean z3 = z2;
                Placeable placeable6 = placeable2;
                if (placeable6 != null) {
                    Placeable.PlacementScope.h(placementScope, placeable6, i12, z3 ? iA2 : vertical.a(placeable6.e, i13));
                }
                Placeable placeable7 = placeable3;
                if (placeable7 != null) {
                    Placeable.PlacementScope.h(placementScope, placeable7, (iH2 - iR13) - placeable7.d, z3 ? iA2 : vertical.a(placeable7.e, i13));
                }
                float f14 = TextFieldImplKt.b;
                int i14 = i12 + (placeable6 != null ? placeable6.d : 0);
                Placeable placeable8 = placeable5;
                Placeable placeable9 = placeable;
                Placeable placeable10 = placeable4;
                if (!z3) {
                    iA2 = vertical.a((placeable10 != null ? placeable10.e : 0) + (placeable9 != null ? placeable9.e : 0) + (placeable8 != null ? placeable8.e : 0), i13);
                }
                if (placeable9 != null) {
                    Placeable.PlacementScope.h(placementScope, placeable9, i14, iA2);
                }
                int i15 = iA2 + (placeable9 != null ? placeable9.e : 0);
                if (placeable10 != null) {
                    Placeable.PlacementScope.h(placementScope, placeable10, i14, i15);
                }
                int i16 = i15 + (placeable10 != null ? placeable10.e : 0);
                if (placeable8 != null) {
                    Placeable.PlacementScope.h(placementScope, placeable8, i14, i16);
                }
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return a(intrinsicMeasureScope, (ArrayList) list, i, ListItemMeasurePolicy$minIntrinsicHeight$1.d);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int e(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return b(intrinsicMeasureScope, (ArrayList) list, i, ListItemMeasurePolicy$minIntrinsicWidth$1.d);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return a(intrinsicMeasureScope, (ArrayList) list, i, ListItemMeasurePolicy$maxIntrinsicHeight$1.d);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return b(intrinsicMeasureScope, (ArrayList) list, i, ListItemMeasurePolicy$maxIntrinsicWidth$1.d);
    }
}
