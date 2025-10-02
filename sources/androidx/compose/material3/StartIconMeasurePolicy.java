package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
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
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/StartIconMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class StartIconMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f1503a;
    public final float b;
    public final float c;

    public StartIconMeasurePolicy(Function0 function0, float f, float f2) {
        float f3 = ExpressiveNavigationBarKt.f1446a;
        this.f1503a = function0;
        this.b = f;
        this.c = f2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        List list2 = list;
        float f = ExpressiveNavigationBarKt.f1446a;
        float fFloatValue = ((Number) this.f1503a.invoke()).floatValue();
        long jA = Constraints.a(j, 0, 0, 0, 0, 10);
        float f2 = 2;
        float f3 = this.b * f2;
        int i = -measureScope.r1(f3);
        float f4 = this.c * f2;
        long jI = ConstraintsKt.i(i, -measureScope.r1(f4), jA);
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            Measurable measurable = (Measurable) list2.get(i2);
            int i3 = size;
            if (Intrinsics.c(LayoutIdKt.a(measurable), BarcodePickDeserializer.FIELD_ICON)) {
                final Placeable placeableC0 = measurable.c0(jI);
                int size2 = list2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Measurable measurable2 = (Measurable) list2.get(i4);
                    int i5 = size2;
                    float f5 = f3;
                    if (Intrinsics.c(LayoutIdKt.a(measurable2), AnnotatedPrivateKey.LABEL)) {
                        final Placeable placeableC02 = measurable2.c0(ConstraintsKt.j(-(measureScope.r1(BitmapDescriptorFactory.HUE_RED) + placeableC0.d), 0, 2, jI));
                        int iR1 = measureScope.r1(f5 + BitmapDescriptorFactory.HUE_RED) + placeableC0.d + placeableC02.d;
                        int iR12 = measureScope.r1(f4) + Math.max(placeableC0.e, placeableC02.e);
                        int iB = MathKt.b(iR1 * fFloatValue);
                        int size3 = list2.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            Measurable measurable3 = (Measurable) list2.get(i6);
                            int i7 = size3;
                            if (Intrinsics.c(LayoutIdKt.a(measurable3), "indicatorRipple")) {
                                final Placeable placeableC03 = measurable3.c0(ConstraintsKt.e(jA, Constraints.Companion.c(iR1, iR12)));
                                int size4 = list2.size();
                                int i8 = 0;
                                while (i8 < size4) {
                                    Measurable measurable4 = (Measurable) list2.get(i8);
                                    if (Intrinsics.c(LayoutIdKt.a(measurable4), "indicator")) {
                                        final Placeable placeableC04 = measurable4.c0(ConstraintsKt.e(jA, Constraints.Companion.c(iB, iR12)));
                                        int i9 = NavigationItemKt.f1465a;
                                        int iG = ConstraintsKt.g(placeableC03.d, j);
                                        int iF = ConstraintsKt.f(placeableC03.e, j);
                                        final int i10 = (iG - placeableC04.d) / 2;
                                        final int i11 = (iF - placeableC04.e) / 2;
                                        final int i12 = (iF - placeableC0.e) / 2;
                                        final int i13 = (iF - placeableC02.e) / 2;
                                        final int iR13 = (iG - ((measureScope.r1(BitmapDescriptorFactory.HUE_RED) + placeableC0.d) + placeableC02.d)) / 2;
                                        final int iR14 = measureScope.r1(BitmapDescriptorFactory.HUE_RED) + iR13 + placeableC0.d;
                                        final int i14 = (iG - placeableC03.d) / 2;
                                        final int i15 = (iF - placeableC03.e) / 2;
                                        return measureScope.L0(iG, iF, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeLabelAndStartIcon$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                                                Placeable.PlacementScope.h(placementScope, placeableC04, i10, i11);
                                                Placeable.PlacementScope.h(placementScope, placeableC02, iR14, i13);
                                                Placeable.PlacementScope.h(placementScope, placeableC0, iR13, i12);
                                                Placeable.PlacementScope.h(placementScope, placeableC03, i14, i15);
                                                return Unit.f24250a;
                                            }
                                        });
                                    }
                                    i8++;
                                    list2 = list;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i6++;
                            list2 = list;
                            size3 = i7;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    i4++;
                    list2 = list;
                    size2 = i5;
                    f3 = f5;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i2++;
            list2 = list;
            size = i3;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i2);
            if (Intrinsics.c(TextFieldImplKt.f(intrinsicMeasurable), BarcodePickDeserializer.FIELD_ICON)) {
                int iJ = intrinsicMeasurable.J(i);
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i3);
                    if (Intrinsics.c(TextFieldImplKt.f(intrinsicMeasurable2), AnnotatedPrivateKey.LABEL)) {
                        return Math.max(iJ, intrinsicMeasurable2.J(i)) + intrinsicMeasureScope.r1(this.c * 2);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i2);
            if (Intrinsics.c(TextFieldImplKt.f(intrinsicMeasurable), BarcodePickDeserializer.FIELD_ICON)) {
                int iB0 = intrinsicMeasurable.b0(i);
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i3);
                    if (Intrinsics.c(TextFieldImplKt.f(intrinsicMeasurable2), AnnotatedPrivateKey.LABEL)) {
                        int iB02 = intrinsicMeasurable2.b0(i);
                        float f = this.b * 2;
                        float f2 = ExpressiveNavigationBarKt.f1446a;
                        return iB0 + iB02 + intrinsicMeasureScope.r1(f + BitmapDescriptorFactory.HUE_RED);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
