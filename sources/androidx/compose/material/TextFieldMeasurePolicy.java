package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TextFieldMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1342a;
    public final float b;
    public final PaddingValues c;

    public TextFieldMeasurePolicy(boolean z, float f, PaddingValues paddingValues) {
        this.f1342a = z;
        this.b = f;
        this.c = paddingValues;
    }

    public static int b(int i, List list, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj5 = list.get(i2);
            if (Intrinsics.c(TextFieldImplKt.d((IntrinsicMeasurable) obj5), "TextField")) {
                int iIntValue = ((Number) function2.invoke(obj5, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (Intrinsics.c(TextFieldImplKt.d((IntrinsicMeasurable) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                int iIntValue2 = intrinsicMeasurable != null ? ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (Intrinsics.c(TextFieldImplKt.d((IntrinsicMeasurable) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                int iIntValue3 = intrinsicMeasurable2 != null ? ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (Intrinsics.c(TextFieldImplKt.d((IntrinsicMeasurable) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                int iIntValue4 = intrinsicMeasurable3 != null ? ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i6);
                    if (Intrinsics.c(TextFieldImplKt.d((IntrinsicMeasurable) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                int iIntValue5 = intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue() : 0;
                long jB = ConstraintsKt.b(0, 0, 15);
                float f = TextFieldKt.f1341a;
                return ConstraintsKt.g(Math.max(iIntValue, Math.max(iIntValue2, iIntValue5)) + iIntValue4 + iIntValue3, jB);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int a(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        int i2;
        int iIntValue;
        Object obj3;
        int iIntValue2;
        Object obj4;
        int size = list.size();
        int i3 = 0;
        while (true) {
            obj = null;
            if (i3 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (Intrinsics.c(TextFieldImplKt.d((IntrinsicMeasurable) obj2), "Leading")) {
                break;
            }
            i3++;
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable != null) {
            int iB0 = intrinsicMeasurable.b0(Integer.MAX_VALUE);
            float f = TextFieldKt.f1341a;
            i2 = i == Integer.MAX_VALUE ? i : i - iB0;
            iIntValue = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (Intrinsics.c(TextFieldImplKt.d((IntrinsicMeasurable) obj3), "Trailing")) {
                break;
            }
            i4++;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
        if (intrinsicMeasurable2 != null) {
            int iB02 = intrinsicMeasurable2.b0(Integer.MAX_VALUE);
            float f2 = TextFieldKt.f1341a;
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iB02;
            }
            iIntValue2 = ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i5);
            if (Intrinsics.c(TextFieldImplKt.d((IntrinsicMeasurable) obj4), "Label")) {
                break;
            }
            i5++;
        }
        Object obj5 = (IntrinsicMeasurable) obj4;
        int iIntValue3 = obj5 != null ? ((Number) function2.invoke(obj5, Integer.valueOf(i2))).intValue() : 0;
        int size4 = list.size();
        for (int i6 = 0; i6 < size4; i6++) {
            Object obj6 = list.get(i6);
            if (Intrinsics.c(TextFieldImplKt.d((IntrinsicMeasurable) obj6), "TextField")) {
                int iIntValue4 = ((Number) function2.invoke(obj6, Integer.valueOf(i2))).intValue();
                int size5 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i7);
                    if (Intrinsics.c(TextFieldImplKt.d((IntrinsicMeasurable) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i7++;
                }
                Object obj8 = (IntrinsicMeasurable) obj;
                return TextFieldKt.d(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(i2))).intValue() : 0, ConstraintsKt.b(0, 0, 15), intrinsicMeasureScope.getE(), this.c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(final MeasureScope measureScope, List list, long j) {
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        int iD0;
        Object obj4;
        final TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        List list2 = list;
        PaddingValues paddingValues = textFieldMeasurePolicy.c;
        int iR1 = measureScope.r1(paddingValues.getB());
        int iR12 = measureScope.r1(paddingValues.getD());
        final int iR13 = measureScope.r1(TextFieldKt.c);
        long jA = Constraints.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i2);
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj), "Leading")) {
                break;
            }
            i2++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable placeableC0 = measurable != null ? measurable.c0(jA) : null;
        float f = TextFieldImplKt.f1340a;
        int i3 = placeableC0 != null ? placeableC0.d : 0;
        int size2 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i4);
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        Measurable measurable2 = (Measurable) obj2;
        final Placeable placeableC02 = measurable2 != null ? measurable2.c0(ConstraintsKt.j(-i3, 0, 2, jA)) : null;
        int i5 = -iR12;
        int i6 = -(i3 + (placeableC02 != null ? placeableC02.d : 0));
        long jI = ConstraintsKt.i(i6, i5, jA);
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                i = iR12;
                obj3 = null;
                break;
            }
            obj3 = list2.get(i7);
            i = iR12;
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj3), "Label")) {
                break;
            }
            i7++;
            iR12 = i;
        }
        Measurable measurable3 = (Measurable) obj3;
        final Placeable placeableC03 = measurable3 != null ? measurable3.c0(jI) : null;
        if (placeableC03 != null) {
            iD0 = placeableC03.d0(AlignmentLineKt.b);
            if (iD0 == Integer.MIN_VALUE) {
                iD0 = placeableC03.e;
            }
        } else {
            iD0 = 0;
        }
        final int iMax = Math.max(iD0, iR1);
        long jI2 = ConstraintsKt.i(i6, placeableC03 != null ? (i5 - iR13) - iMax : (-iR1) - i, Constraints.a(j, 0, 0, 0, 0, 11));
        int size4 = list2.size();
        int i8 = 0;
        while (i8 < size4) {
            Measurable measurable4 = (Measurable) list2.get(i8);
            final int i9 = iR1;
            if (Intrinsics.c(LayoutIdKt.a(measurable4), "TextField")) {
                final Placeable placeableC04 = measurable4.c0(jI2);
                long jA2 = Constraints.a(jI2, 0, 0, 0, 0, 14);
                int size5 = list2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list2.get(i10);
                    if (Intrinsics.c(LayoutIdKt.a((Measurable) obj4), "Hint")) {
                        break;
                    }
                    i10++;
                    list2 = list;
                }
                Measurable measurable5 = (Measurable) obj4;
                final Placeable placeableC05 = measurable5 != null ? measurable5.c0(jA2) : null;
                final int iG = ConstraintsKt.g(Math.max(placeableC04.d, Math.max(placeableC03 != null ? placeableC03.d : 0, placeableC05 != null ? placeableC05.d : 0)) + (placeableC0 != null ? placeableC0.d : 0) + (placeableC02 != null ? placeableC02.d : 0), j);
                final int iD = TextFieldKt.d(placeableC04.e, placeableC03 != null, iMax, placeableC0 != null ? placeableC0.e : 0, placeableC02 != null ? placeableC02.e : 0, placeableC05 != null ? placeableC05.e : 0, j, measureScope.getE(), textFieldMeasurePolicy.c);
                final Placeable placeable = placeableC0;
                final int i11 = iD0;
                return measureScope.L0(iG, iD, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$measure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        int i12;
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj5;
                        TextFieldMeasurePolicy textFieldMeasurePolicy2 = textFieldMeasurePolicy;
                        boolean z = textFieldMeasurePolicy2.f1342a;
                        Placeable placeable2 = placeableC04;
                        BiasAlignment.Vertical vertical = Alignment.Companion.k;
                        MeasureScope measureScope2 = measureScope;
                        Placeable placeable3 = placeableC02;
                        Placeable placeable4 = placeable;
                        Placeable placeable5 = placeableC05;
                        int i13 = iD;
                        int i14 = iG;
                        Placeable placeable6 = placeableC03;
                        if (placeable6 != null) {
                            int i15 = i9 - i11;
                            if (i15 < 0) {
                                i15 = 0;
                            }
                            int i16 = iMax + iR13;
                            float f2 = textFieldMeasurePolicy2.b;
                            float e = measureScope2.getE();
                            float f3 = TextFieldKt.f1341a;
                            if (placeable4 != null) {
                                Placeable.PlacementScope.h(placementScope, placeable4, 0, vertical.a(placeable4.e, i13));
                            }
                            if (placeable3 != null) {
                                Placeable.PlacementScope.h(placementScope, placeable3, i14 - placeable3.d, vertical.a(placeable3.e, i13));
                            }
                            int iA = (z ? vertical.a(placeable6.e, i13) : MathKt.b(TextFieldImplKt.f1340a * e)) - MathKt.b((r0 - i15) * f2);
                            float f4 = TextFieldImplKt.f1340a;
                            Placeable.PlacementScope.h(placementScope, placeable6, placeable4 != null ? placeable4.d : 0, iA);
                            Placeable.PlacementScope.h(placementScope, placeable2, placeable4 != null ? placeable4.d : 0, i16);
                            if (placeable5 != null) {
                                Placeable.PlacementScope.h(placementScope, placeable5, placeable4 != null ? placeable4.d : 0, i16);
                            }
                        } else {
                            float e2 = measureScope2.getE();
                            PaddingValues paddingValues2 = textFieldMeasurePolicy2.c;
                            float f5 = TextFieldKt.f1341a;
                            int iB = MathKt.b(paddingValues2.getB() * e2);
                            if (placeable4 != null) {
                                i12 = 0;
                                Placeable.PlacementScope.h(placementScope, placeable4, 0, vertical.a(placeable4.e, i13));
                            } else {
                                i12 = 0;
                            }
                            if (placeable3 != null) {
                                Placeable.PlacementScope.h(placementScope, placeable3, i14 - placeable3.d, vertical.a(placeable3.e, i13));
                            }
                            int iA2 = z ? vertical.a(placeable2.e, i13) : iB;
                            float f6 = TextFieldImplKt.f1340a;
                            Placeable.PlacementScope.h(placementScope, placeable2, placeable4 != null ? placeable4.d : i12, iA2);
                            if (placeable5 != null) {
                                if (z) {
                                    iB = vertical.a(placeable5.e, i13);
                                }
                                Placeable.PlacementScope.h(placementScope, placeable5, placeable4 != null ? placeable4.d : i12, iB);
                            }
                        }
                        return Unit.f24250a;
                    }
                });
            }
            iR1 = i9;
            i8++;
            textFieldMeasurePolicy = this;
            list2 = list;
            placeableC0 = placeableC0;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return a(intrinsicMeasureScope, list, i, TextFieldMeasurePolicy$minIntrinsicHeight$1.h);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int e(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return b(i, list, TextFieldMeasurePolicy$minIntrinsicWidth$1.h);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return a(intrinsicMeasureScope, list, i, TextFieldMeasurePolicy$maxIntrinsicHeight$1.h);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return b(i, list, TextFieldMeasurePolicy$maxIntrinsicWidth$1.h);
    }
}
