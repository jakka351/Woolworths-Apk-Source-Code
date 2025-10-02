package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
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

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f1308a;
    public final boolean b;
    public final float c;
    public final PaddingValues d;

    public OutlinedTextFieldMeasurePolicy(Function1 function1, boolean z, float f, PaddingValues paddingValues) {
        this.f1308a = function1;
        this.b = z;
        this.c = f;
        this.d = paddingValues;
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
            float f = OutlinedTextFieldKt.f1306a;
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
            float f2 = OutlinedTextFieldKt.f1306a;
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
        int iIntValue3 = obj5 != null ? ((Number) function2.invoke(obj5, Integer.valueOf(MathHelpersKt.c(this.c, i2, i)))).intValue() : 0;
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
                return OutlinedTextFieldKt.d(iIntValue, iIntValue2, iIntValue4, iIntValue3, obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(i2))).intValue() : 0, this.c, ConstraintsKt.b(0, 0, 15), intrinsicMeasureScope.getE(), this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int b(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
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
                return OutlinedTextFieldKt.e(iIntValue4, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue() : 0, this.c, ConstraintsKt.b(0, 0, 15), intrinsicMeasureScope.getE(), this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(final MeasureScope measureScope, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        final OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        PaddingValues paddingValues = outlinedTextFieldMeasurePolicy.d;
        int iR1 = measureScope.r1(paddingValues.getD());
        long jA = Constraints.a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj), "Leading")) {
                break;
            }
            i++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable placeableC0 = measurable != null ? measurable.c0(jA) : null;
        float f = TextFieldImplKt.f1340a;
        int i2 = placeableC0 != null ? placeableC0.d : 0;
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable placeableC02 = measurable2 != null ? measurable2.c0(ConstraintsKt.j(-i2, 0, 2, jA)) : null;
        int i4 = i2 + (placeableC02 != null ? placeableC02.d : 0);
        int iR12 = measureScope.r1(paddingValues.c(measureScope.getD())) + measureScope.r1(paddingValues.b(measureScope.getD()));
        int i5 = -i4;
        int i6 = -iR1;
        long jI = ConstraintsKt.i(MathHelpersKt.c(outlinedTextFieldMeasurePolicy.c, i5 - iR12, -iR12), i6, jA);
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (Intrinsics.c(LayoutIdKt.a((Measurable) obj3), "Label")) {
                break;
            }
            i7++;
        }
        Measurable measurable3 = (Measurable) obj3;
        final Placeable placeableC03 = measurable3 != null ? measurable3.c0(jI) : null;
        outlinedTextFieldMeasurePolicy.f1308a.invoke(new Size(placeableC03 != null ? SizeKt.a(placeableC03.d, placeableC03.e) : 0L));
        long jA2 = Constraints.a(ConstraintsKt.i(i5, i6 - Math.max((placeableC03 != null ? placeableC03.e : 0) / 2, measureScope.r1(paddingValues.getB())), j), 0, 0, 0, 0, 11);
        int size4 = list.size();
        int i8 = 0;
        while (i8 < size4) {
            Measurable measurable4 = (Measurable) list.get(i8);
            if (Intrinsics.c(LayoutIdKt.a(measurable4), "TextField")) {
                final Placeable placeableC04 = measurable4.c0(jA2);
                long jA3 = Constraints.a(jA2, 0, 0, 0, 0, 14);
                int size5 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i9);
                    if (Intrinsics.c(LayoutIdKt.a((Measurable) obj4), "Hint")) {
                        break;
                    }
                    i9++;
                }
                Measurable measurable5 = (Measurable) obj4;
                Placeable placeableC05 = measurable5 != null ? measurable5.c0(jA3) : null;
                final Placeable placeable = placeableC02;
                final int iE = OutlinedTextFieldKt.e(placeableC0 != null ? placeableC0.d : 0, placeableC02 != null ? placeableC02.d : 0, placeableC04.d, placeableC03 != null ? placeableC03.d : 0, placeableC05 != null ? placeableC05.d : 0, outlinedTextFieldMeasurePolicy.c, j, measureScope.getE(), outlinedTextFieldMeasurePolicy.d);
                final int iD = OutlinedTextFieldKt.d(placeableC0 != null ? placeableC0.e : 0, placeable != null ? placeable.e : 0, placeableC04.e, placeableC03 != null ? placeableC03.e : 0, placeableC05 != null ? placeableC05.e : 0, outlinedTextFieldMeasurePolicy.c, j, measureScope.getE(), outlinedTextFieldMeasurePolicy.d);
                int size6 = list.size();
                int i10 = 0;
                while (i10 < size6) {
                    Measurable measurable6 = (Measurable) list.get(i10);
                    if (Intrinsics.c(LayoutIdKt.a(measurable6), "border")) {
                        final Placeable placeableC06 = measurable6.c0(ConstraintsKt.a(iE != Integer.MAX_VALUE ? iE : 0, iE, iD != Integer.MAX_VALUE ? iD : 0, iD));
                        final Placeable placeable2 = placeableC0;
                        final Placeable placeable3 = placeableC05;
                        return measureScope.L0(iE, iD, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj5;
                                OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy2 = outlinedTextFieldMeasurePolicy;
                                float f2 = outlinedTextFieldMeasurePolicy2.c;
                                boolean z = outlinedTextFieldMeasurePolicy2.b;
                                MeasureScope measureScope2 = measureScope;
                                float e = measureScope2.getE();
                                LayoutDirection d = measureScope2.getD();
                                PaddingValues paddingValues2 = outlinedTextFieldMeasurePolicy2.d;
                                float f3 = OutlinedTextFieldKt.f1306a;
                                int iB = MathKt.b(paddingValues2.getB() * e);
                                int iB2 = MathKt.b(PaddingKt.d(paddingValues2, d) * e);
                                float f4 = TextFieldImplKt.b * e;
                                int i11 = iD;
                                Placeable placeable4 = placeable2;
                                BiasAlignment.Vertical vertical = Alignment.Companion.k;
                                if (placeable4 != null) {
                                    Placeable.PlacementScope.h(placementScope, placeable4, 0, vertical.a(placeable4.e, i11));
                                }
                                Placeable placeable5 = placeable;
                                if (placeable5 != null) {
                                    Placeable.PlacementScope.h(placementScope, placeable5, iE - placeable5.d, vertical.a(placeable5.e, i11));
                                }
                                Placeable placeable6 = placeableC03;
                                if (placeable6 != null) {
                                    Placeable.PlacementScope.h(placementScope, placeable6, MathKt.b(placeable4 == null ? BitmapDescriptorFactory.HUE_RED : (1 - f2) * (placeable4.d - f4)) + iB2, MathHelpersKt.c(f2, z ? vertical.a(placeable6.e, i11) : iB, -(placeable6.e / 2)));
                                }
                                Placeable placeable7 = placeableC04;
                                Placeable.PlacementScope.h(placementScope, placeable7, placeable4 != null ? placeable4.d : 0, Math.max(z ? vertical.a(placeable7.e, i11) : iB, (placeable6 != null ? placeable6.e : 0) / 2));
                                Placeable placeable8 = placeable3;
                                if (placeable8 != null) {
                                    if (z) {
                                        iB = vertical.a(placeable8.e, i11);
                                    }
                                    Placeable.PlacementScope.h(placementScope, placeable8, placeable4 != null ? placeable4.d : 0, Math.max(iB, (placeable6 != null ? placeable6.e : 0) / 2));
                                }
                                Placeable.PlacementScope.g(placementScope, placeableC06, 0L);
                                return Unit.f24250a;
                            }
                        });
                    }
                    i10++;
                    outlinedTextFieldMeasurePolicy = this;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i8++;
            outlinedTextFieldMeasurePolicy = this;
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
