package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
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
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f1471a;
    public final boolean b;
    public final float c;
    public final PaddingValues d;

    public OutlinedTextFieldMeasurePolicy(Function1 function1, boolean z, float f, PaddingValues paddingValues) {
        this.f1471a = function1;
        this.b = z;
        this.c = f;
        this.d = paddingValues;
    }

    public final int a(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
        Object obj;
        int i2;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i3;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i4);
            if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj), "Leading")) {
                break;
            }
            i4++;
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
        if (intrinsicMeasurable != null) {
            int iB0 = intrinsicMeasurable.b0(Integer.MAX_VALUE);
            float f = OutlinedTextFieldKt.f1469a;
            i2 = i == Integer.MAX_VALUE ? i : i - iB0;
            iIntValue = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i5);
            if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj2), "Trailing")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable2 != null) {
            int iB02 = intrinsicMeasurable2.b0(Integer.MAX_VALUE);
            float f2 = OutlinedTextFieldKt.f1469a;
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iB02;
            }
            iIntValue2 = ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i6);
            if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj3), "Label")) {
                break;
            }
            i6++;
        }
        Object obj8 = (IntrinsicMeasurable) obj3;
        int iIntValue4 = obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(MathHelpersKt.c(this.c, i2, i)))).intValue() : 0;
        int size4 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i7);
            if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj4), "Prefix")) {
                break;
            }
            i7++;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
        if (intrinsicMeasurable3 != null) {
            iIntValue3 = ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(i2))).intValue();
            int iB03 = intrinsicMeasurable3.b0(Integer.MAX_VALUE);
            float f3 = OutlinedTextFieldKt.f1469a;
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iB03;
            }
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i8);
            if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj5), "Suffix")) {
                break;
            }
            i8++;
        }
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
        if (intrinsicMeasurable4 != null) {
            int iIntValue5 = ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i2))).intValue();
            int iB04 = intrinsicMeasurable4.b0(Integer.MAX_VALUE);
            float f4 = OutlinedTextFieldKt.f1469a;
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iB04;
            }
            i3 = iIntValue5;
        } else {
            i3 = 0;
        }
        int size6 = list.size();
        for (int i9 = 0; i9 < size6; i9++) {
            Object obj9 = list.get(i9);
            if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj9), "TextField")) {
                int iIntValue6 = ((Number) function2.invoke(obj9, Integer.valueOf(i2))).intValue();
                int size7 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i10);
                    if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj6), "Hint")) {
                        break;
                    }
                    i10++;
                }
                Object obj10 = (IntrinsicMeasurable) obj6;
                int iIntValue7 = obj10 != null ? ((Number) function2.invoke(obj10, Integer.valueOf(i2))).intValue() : 0;
                int size8 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i11);
                    if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i11++;
                }
                Object obj12 = (IntrinsicMeasurable) obj7;
                return OutlinedTextFieldKt.d(iIntValue, iIntValue2, iIntValue3, i3, iIntValue6, iIntValue4, iIntValue7, obj12 != null ? ((Number) function2.invoke(obj12, Integer.valueOf(i))).intValue() : 0, this.c, TextFieldImplKt.f1563a, intrinsicMeasureScope.getE(), this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int b(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
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
                    if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj4), "Leading")) {
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
                    if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj5), "Prefix")) {
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
                    if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj6), "Suffix")) {
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
                return OutlinedTextFieldKt.e(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, intrinsicMeasurable6 != null ? ((Number) function2.invoke(intrinsicMeasurable6, Integer.valueOf(i))).intValue() : 0, this.c, TextFieldImplKt.f1563a, intrinsicMeasureScope.getE(), this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(final MeasureScope measureScope, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Placeable placeable;
        Placeable placeableC0;
        Object obj4;
        int i;
        Placeable placeableC02;
        int i2;
        Object obj5;
        Object obj6;
        Object obj7;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        final OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        List list2 = list;
        PaddingValues paddingValues = outlinedTextFieldMeasurePolicy.d;
        int iR1 = measureScope.r1(paddingValues.getD());
        long jA = Constraints.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i11);
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj), "Leading")) {
                break;
            }
            i11++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable placeableC03 = measurable != null ? measurable.c0(jA) : null;
        float f = TextFieldImplKt.b;
        int i12 = placeableC03 != null ? placeableC03.d : 0;
        int iMax = Math.max(0, placeableC03 != null ? placeableC03.e : 0);
        int size2 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i13);
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj2), "Trailing")) {
                break;
            }
            i13++;
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable placeableC04 = measurable2 != null ? measurable2.c0(ConstraintsKt.j(-i12, 0, 2, jA)) : null;
        int i14 = i12 + (placeableC04 != null ? placeableC04.d : 0);
        int iMax2 = Math.max(iMax, placeableC04 != null ? placeableC04.e : 0);
        int size3 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i15);
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj3), "Prefix")) {
                break;
            }
            i15++;
        }
        Measurable measurable3 = (Measurable) obj3;
        if (measurable3 != null) {
            placeable = placeableC03;
            placeableC0 = measurable3.c0(ConstraintsKt.j(-i14, 0, 2, jA));
        } else {
            placeable = placeableC03;
            placeableC0 = null;
        }
        int i16 = i14 + (placeableC0 != null ? placeableC0.d : 0);
        int iMax3 = Math.max(iMax2, placeableC0 != null ? placeableC0.e : 0);
        int size4 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i17);
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj4), "Suffix")) {
                break;
            }
            i17++;
        }
        Measurable measurable4 = (Measurable) obj4;
        if (measurable4 != null) {
            i = i16;
            placeableC02 = measurable4.c0(ConstraintsKt.j(-i16, 0, 2, jA));
        } else {
            i = i16;
            placeableC02 = null;
        }
        int i18 = i + (placeableC02 != null ? placeableC02.d : 0);
        int iMax4 = Math.max(iMax3, placeableC02 != null ? placeableC02.e : 0);
        int iR12 = measureScope.r1(paddingValues.c(measureScope.getD())) + measureScope.r1(paddingValues.b(measureScope.getD()));
        int i19 = -i18;
        int iC = MathHelpersKt.c(outlinedTextFieldMeasurePolicy.c, i19 - iR12, -iR12);
        int i20 = -iR1;
        long jI = ConstraintsKt.i(iC, i20, jA);
        int size5 = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size5) {
                i2 = iR1;
                obj5 = null;
                break;
            }
            obj5 = list2.get(i21);
            int i22 = i21;
            i2 = iR1;
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj5), "Label")) {
                break;
            }
            i21 = i22 + 1;
            iR1 = i2;
        }
        Measurable measurable5 = (Measurable) obj5;
        Placeable placeableC05 = measurable5 != null ? measurable5.c0(jI) : null;
        outlinedTextFieldMeasurePolicy.f1471a.invoke(new Size(placeableC05 != null ? SizeKt.a(placeableC05.d, placeableC05.e) : 0L));
        int size6 = list2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i23);
            int i24 = size6;
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj6), "Supporting")) {
                break;
            }
            i23++;
            size6 = i24;
        }
        Measurable measurable6 = (Measurable) obj6;
        int iT = measurable6 != null ? measurable6.T(Constraints.j(j)) : 0;
        int iMax5 = Math.max((placeableC05 != null ? placeableC05.e : 0) / 2, measureScope.r1(paddingValues.getB()));
        long jA2 = Constraints.a(ConstraintsKt.i(i19, (i20 - iMax5) - iT, j), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i25 = 0;
        while (i25 < size7) {
            Measurable measurable7 = (Measurable) list2.get(i25);
            int i26 = i25;
            int i27 = size7;
            if (Intrinsics.c(LayoutIdKt.a(measurable7), "TextField")) {
                Placeable placeableC06 = measurable7.c0(jA2);
                long jA3 = Constraints.a(jA2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i28 = 0;
                while (true) {
                    if (i28 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i28);
                    int i29 = size8;
                    int i30 = i28;
                    if (Intrinsics.c(LayoutIdKt.a((Measurable) obj7), "Hint")) {
                        break;
                    }
                    i28 = i30 + 1;
                    size8 = i29;
                }
                Measurable measurable8 = (Measurable) obj7;
                final Placeable placeableC07 = measurable8 != null ? measurable8.c0(jA3) : null;
                int iMax6 = Math.max(iMax4, Math.max(placeableC06.e, placeableC07 != null ? placeableC07.e : 0) + iMax5 + i2);
                Placeable placeable2 = placeable;
                int i31 = placeable != null ? placeable2.d : 0;
                int i32 = placeableC04 != null ? placeableC04.d : 0;
                if (placeableC0 != null) {
                    i3 = placeableC0.d;
                    i31 = i31;
                } else {
                    i3 = 0;
                }
                if (placeableC02 != null) {
                    i4 = i31;
                    i5 = placeableC02.d;
                } else {
                    i4 = i31;
                    i5 = 0;
                }
                int i33 = placeableC06.d;
                if (placeableC05 != null) {
                    i8 = placeableC05.d;
                    i7 = i4;
                    i6 = i33;
                } else {
                    int i34 = i4;
                    i6 = i33;
                    i7 = i34;
                    i8 = 0;
                }
                if (placeableC07 != null) {
                    i9 = placeableC07.d;
                    i7 = i7;
                } else {
                    i9 = 0;
                }
                int iE = OutlinedTextFieldKt.e(i7, i32, i3, i5, i6, i8, i9, outlinedTextFieldMeasurePolicy.c, j, measureScope.getE(), outlinedTextFieldMeasurePolicy.d);
                int i35 = 0;
                int i36 = iE;
                Placeable placeableC08 = measurable6 != null ? measurable6.c0(Constraints.a(ConstraintsKt.j(0, -iMax6, 1, jA), 0, iE, 0, 0, 9)) : null;
                int i37 = placeableC08 != null ? placeableC08.e : 0;
                int i38 = placeable2 != null ? placeable2.e : 0;
                if (placeableC04 != null) {
                    i10 = 0;
                    i35 = placeableC04.e;
                } else {
                    i10 = 0;
                }
                Placeable placeable3 = placeableC0;
                final Placeable placeable4 = placeableC05;
                final int iD = OutlinedTextFieldKt.d(i38, i35, placeableC0 != null ? placeableC0.e : i10, placeableC02 != null ? placeableC02.e : i10, placeableC06.e, placeableC05 != null ? placeableC05.e : i10, placeableC07 != null ? placeableC07.e : i10, placeableC08 != null ? placeableC08.e : i10, outlinedTextFieldMeasurePolicy.c, j, measureScope.getE(), outlinedTextFieldMeasurePolicy.d);
                int i39 = iD - i37;
                int size9 = list2.size();
                int i40 = i10;
                while (i40 < size9) {
                    Measurable measurable9 = (Measurable) list2.get(i40);
                    if (Intrinsics.c(LayoutIdKt.a(measurable9), "Container")) {
                        final Placeable placeableC09 = measurable9.c0(ConstraintsKt.a(i36 != Integer.MAX_VALUE ? i36 : i10, i36, i39 != Integer.MAX_VALUE ? i39 : i10, i39));
                        final Placeable placeable5 = placeableC04;
                        final Placeable placeable6 = placeableC06;
                        final Placeable placeable7 = placeableC08;
                        final int i41 = i36;
                        final Placeable placeable8 = placeableC02;
                        final Placeable placeable9 = placeable2;
                        final Placeable placeable10 = placeable3;
                        return measureScope.L0(i41, iD, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj8;
                                OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy2 = outlinedTextFieldMeasurePolicy;
                                float f2 = outlinedTextFieldMeasurePolicy2.c;
                                boolean z = outlinedTextFieldMeasurePolicy2.b;
                                MeasureScope measureScope2 = measureScope;
                                float e = measureScope2.getE();
                                LayoutDirection d = measureScope2.getD();
                                PaddingValues paddingValues2 = outlinedTextFieldMeasurePolicy2.d;
                                float f3 = OutlinedTextFieldKt.f1469a;
                                Placeable.PlacementScope.g(placementScope, placeableC09, 0L);
                                float f4 = TextFieldImplKt.b;
                                Placeable placeable11 = placeable7;
                                int i42 = iD - (placeable11 != null ? placeable11.e : 0);
                                int iB = MathKt.b(paddingValues2.getB() * e);
                                int iB2 = MathKt.b(PaddingKt.d(paddingValues2, d) * e);
                                float f5 = TextFieldImplKt.c * e;
                                Placeable placeable12 = placeable9;
                                BiasAlignment.Vertical vertical = Alignment.Companion.k;
                                if (placeable12 != null) {
                                    Placeable.PlacementScope.h(placementScope, placeable12, 0, vertical.a(placeable12.e, i42));
                                }
                                Placeable placeable13 = placeable4;
                                if (placeable13 != null) {
                                    Placeable.PlacementScope.h(placementScope, placeable13, MathKt.b(placeable12 == null ? BitmapDescriptorFactory.HUE_RED : (1 - f2) * (placeable12.d - f5)) + iB2, MathHelpersKt.c(f2, z ? vertical.a(placeable13.e, i42) : iB, -(placeable13.e / 2)));
                                }
                                Placeable placeable14 = placeable10;
                                if (placeable14 != null) {
                                    Placeable.PlacementScope.h(placementScope, placeable14, placeable12 != null ? placeable12.d : 0, OutlinedTextFieldKt.g(z, i42, iB, placeable13, placeable14));
                                }
                                int i43 = (placeable12 != null ? placeable12.d : 0) + (placeable14 != null ? placeable14.d : 0);
                                Placeable placeable15 = placeable6;
                                Placeable.PlacementScope.h(placementScope, placeable15, i43, OutlinedTextFieldKt.g(z, i42, iB, placeable13, placeable15));
                                Placeable placeable16 = placeableC07;
                                if (placeable16 != null) {
                                    Placeable.PlacementScope.h(placementScope, placeable16, i43, OutlinedTextFieldKt.g(z, i42, iB, placeable13, placeable16));
                                }
                                int i44 = i41;
                                Placeable placeable17 = placeable5;
                                Placeable placeable18 = placeable8;
                                if (placeable18 != null) {
                                    Placeable.PlacementScope.h(placementScope, placeable18, (i44 - (placeable17 != null ? placeable17.d : 0)) - placeable18.d, OutlinedTextFieldKt.g(z, i42, iB, placeable13, placeable18));
                                }
                                if (placeable17 != null) {
                                    Placeable.PlacementScope.h(placementScope, placeable17, i44 - placeable17.d, vertical.a(placeable17.e, i42));
                                }
                                if (placeable11 != null) {
                                    Placeable.PlacementScope.h(placementScope, placeable11, 0, i42);
                                }
                                return Unit.f24250a;
                            }
                        });
                    }
                    i40++;
                    i36 = i36;
                    placeableC08 = placeableC08;
                    placeableC06 = placeableC06;
                    placeable3 = placeable3;
                    placeableC02 = placeableC02;
                    placeable2 = placeable2;
                    outlinedTextFieldMeasurePolicy = this;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i25 = i26 + 1;
            outlinedTextFieldMeasurePolicy = this;
            list2 = list;
            placeableC02 = placeableC02;
            size7 = i27;
            jA2 = jA2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return a(intrinsicMeasureScope, list, i, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.h);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int e(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return b(intrinsicMeasureScope, list, i, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.h);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return a(intrinsicMeasureScope, list, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.h);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return b(intrinsicMeasureScope, list, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.h);
    }
}
