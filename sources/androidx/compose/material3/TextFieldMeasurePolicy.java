package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
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

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TextFieldMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1517a;
    public final float b;
    public final PaddingValues c;

    public TextFieldMeasurePolicy(boolean z, float f, PaddingValues paddingValues) {
        this.f1517a = z;
        this.b = f;
        this.c = paddingValues;
    }

    public static int b(int i, List list, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj7), "TextField")) {
                int iIntValue = ((Number) function2.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj2), "Label")) {
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
                    if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj3), "Trailing")) {
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
                    if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj4), "Prefix")) {
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
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
                int iIntValue5 = intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj6;
                int iIntValue6 = intrinsicMeasurable5 != null ? ((Number) function2.invoke(intrinsicMeasurable5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj;
                int iIntValue7 = intrinsicMeasurable6 != null ? ((Number) function2.invoke(intrinsicMeasurable6, Integer.valueOf(i))).intValue() : 0;
                long j = TextFieldImplKt.f1563a;
                float f = TextFieldKt.f1516a;
                int i9 = iIntValue4 + iIntValue5;
                return Math.max(Math.max(iIntValue + i9, Math.max(iIntValue7 + i9, iIntValue2)) + iIntValue6 + iIntValue3, Constraints.j(j));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int a(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
        Object obj;
        int i2;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj), "Leading")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
        if (intrinsicMeasurable != null) {
            int iB0 = intrinsicMeasurable.b0(Integer.MAX_VALUE);
            float f = TextFieldKt.f1516a;
            i2 = i == Integer.MAX_VALUE ? i : i - iB0;
            iIntValue = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable2 != null) {
            int iB02 = intrinsicMeasurable2.b0(Integer.MAX_VALUE);
            float f2 = TextFieldKt.f1516a;
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iB02;
            }
            iIntValue2 = ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj3), "Label")) {
                break;
            }
            i7++;
        }
        Object obj8 = (IntrinsicMeasurable) obj3;
        int iIntValue3 = obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(i2))).intValue() : 0;
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj4), "Prefix")) {
                break;
            }
            i8++;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
        if (intrinsicMeasurable3 != null) {
            int iIntValue4 = ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(i2))).intValue();
            int iB03 = intrinsicMeasurable3.b0(Integer.MAX_VALUE);
            float f3 = TextFieldKt.f1516a;
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iB03;
            }
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj5), "Suffix")) {
                break;
            }
            i9++;
        }
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
        if (intrinsicMeasurable4 != null) {
            int iIntValue5 = ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i2))).intValue();
            int iB04 = intrinsicMeasurable4.b0(Integer.MAX_VALUE);
            float f4 = TextFieldKt.f1516a;
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iB04;
            }
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj9 = list.get(i10);
            if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj9), "TextField")) {
                int iIntValue6 = ((Number) function2.invoke(obj9, Integer.valueOf(i2))).intValue();
                int size7 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                Object obj10 = (IntrinsicMeasurable) obj6;
                int iIntValue7 = obj10 != null ? ((Number) function2.invoke(obj10, Integer.valueOf(i2))).intValue() : 0;
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i12);
                    if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i12++;
                }
                Object obj12 = (IntrinsicMeasurable) obj7;
                return TextFieldKt.b(iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, obj12 != null ? ((Number) function2.invoke(obj12, Integer.valueOf(i))).intValue() : 0, this.b, TextFieldImplKt.f1563a, intrinsicMeasureScope.getE(), this.c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(final MeasureScope measureScope, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        Placeable placeableC0;
        Object obj4;
        int i2;
        Placeable placeableC02;
        int i3;
        Object obj5;
        Object obj6;
        Object obj7;
        List list2 = list;
        PaddingValues paddingValues = this.c;
        int iR1 = measureScope.r1(paddingValues.getB());
        int iR12 = measureScope.r1(paddingValues.getD());
        long jA = Constraints.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i4);
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj), "Leading")) {
                break;
            }
            i4++;
        }
        Measurable measurable = (Measurable) obj;
        final Placeable placeableC03 = measurable != null ? measurable.c0(jA) : null;
        float f = TextFieldImplKt.b;
        int i5 = placeableC03 != null ? placeableC03.d : 0;
        int iMax = Math.max(0, placeableC03 != null ? placeableC03.e : 0);
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i6);
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable placeableC04 = measurable2 != null ? measurable2.c0(ConstraintsKt.j(-i5, 0, 2, jA)) : null;
        int i7 = i5 + (placeableC04 != null ? placeableC04.d : 0);
        int iMax2 = Math.max(iMax, placeableC04 != null ? placeableC04.e : 0);
        int size3 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i8);
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj3), "Prefix")) {
                break;
            }
            i8++;
        }
        Measurable measurable3 = (Measurable) obj3;
        if (measurable3 != null) {
            i = i7;
            placeableC0 = measurable3.c0(ConstraintsKt.j(-i7, 0, 2, jA));
        } else {
            i = i7;
            placeableC0 = null;
        }
        int i9 = (placeableC0 != null ? placeableC0.d : 0) + i;
        int iMax3 = Math.max(iMax2, placeableC0 != null ? placeableC0.e : 0);
        int size4 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i10);
            int i11 = size4;
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj4), "Suffix")) {
                break;
            }
            i10++;
            size4 = i11;
        }
        Measurable measurable4 = (Measurable) obj4;
        if (measurable4 != null) {
            i2 = iR1;
            placeableC02 = measurable4.c0(ConstraintsKt.j(-i9, 0, 2, jA));
        } else {
            i2 = iR1;
            placeableC02 = null;
        }
        int i12 = i9 + (placeableC02 != null ? placeableC02.d : 0);
        int iMax4 = Math.max(iMax3, placeableC02 != null ? placeableC02.e : 0);
        int i13 = -i12;
        long jI = ConstraintsKt.i(i13, -iR12, jA);
        int size5 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                i3 = iR12;
                obj5 = null;
                break;
            }
            obj5 = list2.get(i14);
            i3 = iR12;
            int i15 = size5;
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj5), "Label")) {
                break;
            }
            i14++;
            size5 = i15;
            iR12 = i3;
        }
        Measurable measurable5 = (Measurable) obj5;
        Placeable placeableC05 = measurable5 != null ? measurable5.c0(jI) : null;
        int size6 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i16);
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj6), "Supporting")) {
                break;
            }
            i16++;
        }
        Measurable measurable6 = (Measurable) obj6;
        int iT = measurable6 != null ? measurable6.T(Constraints.j(j)) : 0;
        int i17 = i2 + (placeableC05 != null ? placeableC05.e : 0);
        long jI2 = ConstraintsKt.i(i13, ((-i17) - i3) - iT, Constraints.a(j, 0, 0, 0, 0, 11));
        int size7 = list2.size();
        int i18 = 0;
        while (i18 < size7) {
            int i19 = size7;
            Measurable measurable7 = (Measurable) list2.get(i18);
            int i20 = i18;
            int i21 = i17;
            if (Intrinsics.c(LayoutIdKt.a(measurable7), "TextField")) {
                Placeable placeableC06 = measurable7.c0(jI2);
                long jA2 = Constraints.a(jI2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i22);
                    int i23 = size8;
                    int i24 = i22;
                    if (Intrinsics.c(LayoutIdKt.a((Measurable) obj7), "Hint")) {
                        break;
                    }
                    i22 = i24 + 1;
                    size8 = i23;
                }
                Measurable measurable8 = (Measurable) obj7;
                Placeable placeableC07 = measurable8 != null ? measurable8.c0(jA2) : null;
                int iMax5 = Math.max(iMax4, Math.max(placeableC06.e, placeableC07 != null ? placeableC07.e : 0) + i21 + i3);
                int i25 = placeableC03 != null ? placeableC03.d : 0;
                int i26 = placeableC04 != null ? placeableC04.d : 0;
                int i27 = placeableC0 != null ? placeableC0.d : 0;
                int i28 = i25;
                int i29 = placeableC02 != null ? placeableC02.d : 0;
                int i30 = placeableC06.d;
                int i31 = placeableC05 != null ? placeableC05.d : 0;
                int i32 = i26;
                int i33 = placeableC07 != null ? placeableC07.d : 0;
                float f2 = TextFieldKt.f1516a;
                int i34 = i27 + i29;
                final int iMax6 = Math.max(Math.max(i30 + i34, Math.max(i33 + i34, i31)) + i28 + i32, Constraints.j(j));
                final Placeable placeableC08 = measurable6 != null ? measurable6.c0(Constraints.a(ConstraintsKt.j(0, -iMax5, 1, jA), 0, iMax6, 0, 0, 9)) : null;
                int i35 = placeableC08 != null ? placeableC08.e : 0;
                TextFieldMeasurePolicy textFieldMeasurePolicy = this;
                int iB = TextFieldKt.b(placeableC06.e, placeableC05 != null ? placeableC05.e : 0, placeableC03 != null ? placeableC03.e : 0, placeableC04 != null ? placeableC04.e : 0, placeableC0 != null ? placeableC0.e : 0, placeableC02 != null ? placeableC02.e : 0, placeableC07 != null ? placeableC07.e : 0, placeableC08 != null ? placeableC08.e : 0, textFieldMeasurePolicy.b, j, measureScope.getE(), textFieldMeasurePolicy.c);
                int i36 = iB - i35;
                int size9 = list2.size();
                int i37 = 0;
                while (i37 < size9) {
                    Measurable measurable9 = (Measurable) list2.get(i37);
                    final Placeable placeable = placeableC05;
                    final Placeable placeable2 = placeableC0;
                    if (Intrinsics.c(LayoutIdKt.a(measurable9), "Container")) {
                        final Placeable placeableC09 = measurable9.c0(ConstraintsKt.a(iMax6 != Integer.MAX_VALUE ? iMax6 : 0, iMax6, i36 != Integer.MAX_VALUE ? i36 : 0, i36));
                        final Placeable placeable3 = placeableC06;
                        final int i38 = iB;
                        final Placeable placeable4 = placeableC07;
                        final Placeable placeable5 = placeableC04;
                        final TextFieldMeasurePolicy textFieldMeasurePolicy2 = textFieldMeasurePolicy;
                        final int i39 = i2;
                        final Placeable placeable6 = placeableC02;
                        return measureScope.L0(iMax6, i38, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                boolean z;
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj8;
                                TextFieldMeasurePolicy textFieldMeasurePolicy3 = textFieldMeasurePolicy2;
                                boolean z2 = textFieldMeasurePolicy3.f1517a;
                                Placeable placeable7 = placeableC09;
                                Placeable placeable8 = placeable3;
                                BiasAlignment.Vertical vertical = Alignment.Companion.k;
                                MeasureScope measureScope2 = measureScope;
                                Placeable placeable9 = placeableC08;
                                Placeable placeable10 = placeable6;
                                Placeable placeable11 = placeable2;
                                Placeable placeable12 = placeable5;
                                Placeable placeable13 = placeableC03;
                                Placeable placeable14 = placeable4;
                                int i40 = i38;
                                int i41 = iMax6;
                                Placeable placeable15 = placeable;
                                if (placeable15 != null) {
                                    int i42 = placeable15.e;
                                    int i43 = i39 + i42;
                                    float f3 = textFieldMeasurePolicy3.b;
                                    float e = measureScope2.getE();
                                    float f4 = TextFieldKt.f1516a;
                                    Placeable.PlacementScope.g(placementScope, placeable7, 0L);
                                    float f5 = TextFieldImplKt.b;
                                    int i44 = i40 - (placeable9 != null ? placeable9.e : 0);
                                    if (placeable13 != null) {
                                        Placeable.PlacementScope.h(placementScope, placeable13, 0, vertical.a(placeable13.e, i44));
                                    }
                                    Placeable.PlacementScope.h(placementScope, placeable15, placeable13 != null ? placeable13.d : 0, (z2 ? vertical.a(placeable15.e, i44) : MathKt.b(TextFieldImplKt.b * e)) - MathKt.b((r3 - r5) * f3));
                                    if (placeable11 != null) {
                                        Placeable.PlacementScope.h(placementScope, placeable11, placeable13 != null ? placeable13.d : 0, i43);
                                    }
                                    int i45 = (placeable13 != null ? placeable13.d : 0) + (placeable11 != null ? placeable11.d : 0);
                                    Placeable.PlacementScope.h(placementScope, placeable8, i45, i43);
                                    if (placeable14 != null) {
                                        Placeable.PlacementScope.h(placementScope, placeable14, i45, i43);
                                    }
                                    if (placeable10 != null) {
                                        Placeable.PlacementScope.h(placementScope, placeable10, (i41 - (placeable12 != null ? placeable12.d : 0)) - placeable10.d, i43);
                                    }
                                    if (placeable12 != null) {
                                        Placeable.PlacementScope.h(placementScope, placeable12, i41 - placeable12.d, vertical.a(placeable12.e, i44));
                                    }
                                    if (placeable9 != null) {
                                        Placeable.PlacementScope.h(placementScope, placeable9, 0, i44);
                                    }
                                } else {
                                    float e2 = measureScope2.getE();
                                    PaddingValues paddingValues2 = textFieldMeasurePolicy3.c;
                                    float f6 = TextFieldKt.f1516a;
                                    Placeable.PlacementScope.g(placementScope, placeable7, 0L);
                                    float f7 = TextFieldImplKt.b;
                                    int i46 = i40 - (placeable9 != null ? placeable9.e : 0);
                                    int iB2 = MathKt.b(paddingValues2.getB() * e2);
                                    if (placeable13 != null) {
                                        Placeable.PlacementScope.h(placementScope, placeable13, 0, vertical.a(placeable13.e, i46));
                                    }
                                    if (placeable11 != null) {
                                        z = z2;
                                        Placeable.PlacementScope.h(placementScope, placeable11, placeable13 != null ? placeable13.d : 0, TextFieldKt.c(z, i46, iB2, placeable11));
                                    } else {
                                        z = z2;
                                    }
                                    int i47 = (placeable13 != null ? placeable13.d : 0) + (placeable11 != null ? placeable11.d : 0);
                                    Placeable.PlacementScope.h(placementScope, placeable8, i47, TextFieldKt.c(z, i46, iB2, placeable8));
                                    if (placeable14 != null) {
                                        Placeable.PlacementScope.h(placementScope, placeable14, i47, TextFieldKt.c(z, i46, iB2, placeable14));
                                    }
                                    if (placeable10 != null) {
                                        Placeable.PlacementScope.h(placementScope, placeable10, (i41 - (placeable12 != null ? placeable12.d : 0)) - placeable10.d, TextFieldKt.c(z, i46, iB2, placeable10));
                                    }
                                    if (placeable12 != null) {
                                        Placeable.PlacementScope.h(placementScope, placeable12, i41 - placeable12.d, vertical.a(placeable12.e, i46));
                                    }
                                    if (placeable9 != null) {
                                        Placeable.PlacementScope.h(placementScope, placeable9, 0, i46);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        });
                    }
                    placeableC05 = placeable;
                    i37++;
                    iB = iB;
                    placeableC06 = placeableC06;
                    list2 = list;
                    placeableC0 = placeable2;
                    textFieldMeasurePolicy = this;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i18 = i20 + 1;
            list2 = list;
            size7 = i19;
            i17 = i21;
            jI2 = jI2;
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
