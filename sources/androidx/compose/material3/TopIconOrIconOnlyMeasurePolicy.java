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

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TopIconOrIconOnlyMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1528a;
    public final Function0 b;
    public final float c;
    public final float d;

    public TopIconOrIconOnlyMeasurePolicy(boolean z, Function0 function0, float f, float f2) {
        float f3 = ExpressiveNavigationBarKt.f1446a;
        this.f1528a = z;
        this.b = function0;
        this.c = f;
        this.d = f2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        TopIconOrIconOnlyMeasurePolicy topIconOrIconOnlyMeasurePolicy = this;
        float f = ExpressiveNavigationBarKt.f1446a;
        float fFloatValue = ((Number) topIconOrIconOnlyMeasurePolicy.b.invoke()).floatValue();
        long jA = Constraints.a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i = 0;
        while (i < size) {
            Measurable measurable = (Measurable) list.get(i);
            if (Intrinsics.c(LayoutIdKt.a(measurable), BarcodePickDeserializer.FIELD_ICON)) {
                float f2 = 2;
                float f3 = topIconOrIconOnlyMeasurePolicy.c * f2;
                int i2 = -measureScope.r1(f3);
                float f4 = topIconOrIconOnlyMeasurePolicy.d;
                float f5 = f4 * f2;
                final Placeable placeableC0 = measurable.c0(ConstraintsKt.i(i2, -measureScope.r1(f5), jA));
                int iR1 = measureScope.r1(f3) + placeableC0.d;
                int iR12 = measureScope.r1(f5) + placeableC0.e;
                int iB = MathKt.b(iR1 * fFloatValue);
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    Measurable measurable2 = (Measurable) list.get(i3);
                    int i4 = size2;
                    int i5 = i3;
                    if (Intrinsics.c(LayoutIdKt.a(measurable2), "indicatorRipple")) {
                        final Placeable placeableC02 = measurable2.c0(ConstraintsKt.e(jA, Constraints.Companion.c(iR1, iR12)));
                        int size3 = list.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            Measurable measurable3 = (Measurable) list.get(i6);
                            int i7 = size3;
                            int i8 = i6;
                            if (Intrinsics.c(LayoutIdKt.a(measurable3), "indicator")) {
                                final Placeable placeableC03 = measurable3.c0(ConstraintsKt.e(jA, Constraints.Companion.c(iB, iR12)));
                                if (!topIconOrIconOnlyMeasurePolicy.f1528a) {
                                    int i9 = NavigationItemKt.f1465a;
                                    int iG = ConstraintsKt.g(placeableC02.d, j);
                                    int iF = ConstraintsKt.f(placeableC02.e, j);
                                    final int i10 = (iG - placeableC03.d) / 2;
                                    final int i11 = (iF - placeableC03.e) / 2;
                                    final int i12 = (iG - placeableC0.d) / 2;
                                    final int i13 = (iF - placeableC0.e) / 2;
                                    final int i14 = (iG - placeableC02.d) / 2;
                                    final int i15 = (iF - placeableC02.e) / 2;
                                    return measureScope.L0(iG, iF, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeIcon$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                                            Placeable.PlacementScope.h(placementScope, placeableC03, i10, i11);
                                            Placeable.PlacementScope.h(placementScope, placeableC0, i12, i13);
                                            Placeable.PlacementScope.h(placementScope, placeableC02, i14, i15);
                                            return Unit.f24250a;
                                        }
                                    });
                                }
                                int size4 = list.size();
                                int i16 = 0;
                                while (i16 < size4) {
                                    Measurable measurable4 = (Measurable) list.get(i16);
                                    if (Intrinsics.c(LayoutIdKt.a(measurable4), AnnotatedPrivateKey.LABEL)) {
                                        final Placeable placeableC04 = measurable4.c0(ConstraintsKt.j(0, -(measureScope.r1(BitmapDescriptorFactory.HUE_RED) + placeableC03.e), 1, jA));
                                        float f6 = ExpressiveNavigationBarKt.f1446a;
                                        int i17 = NavigationItemKt.f1465a;
                                        int iG2 = ConstraintsKt.g(Math.max(placeableC04.d, placeableC02.d), j);
                                        int iF2 = ConstraintsKt.f(MathKt.b((measureScope.T1(BitmapDescriptorFactory.HUE_RED) * f2) + measureScope.T1(BitmapDescriptorFactory.HUE_RED) + placeableC02.e + placeableC04.e), j);
                                        final int iR13 = measureScope.r1(BitmapDescriptorFactory.HUE_RED + f4);
                                        final int i18 = (iG2 - placeableC0.d) / 2;
                                        final int i19 = (iG2 - placeableC03.d) / 2;
                                        final int iR14 = iR13 - measureScope.r1(f4);
                                        final int i20 = (iG2 - placeableC04.d) / 2;
                                        final int iR15 = measureScope.r1(f4 + BitmapDescriptorFactory.HUE_RED) + iR13 + placeableC0.e;
                                        final int i21 = (iG2 - placeableC02.d) / 2;
                                        final Placeable placeable = placeableC03;
                                        final Placeable placeable2 = placeableC0;
                                        return measureScope.L0(iG2, iF2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeLabelAndTopIcon$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                                                Placeable.PlacementScope.h(placementScope, placeable, i19, iR14);
                                                Placeable.PlacementScope.h(placementScope, placeableC04, i20, iR15);
                                                Placeable.PlacementScope.h(placementScope, placeable2, i18, iR13);
                                                Placeable.PlacementScope.h(placementScope, placeableC02, i21, iR14);
                                                return Unit.f24250a;
                                            }
                                        });
                                    }
                                    i16++;
                                    placeableC03 = placeableC03;
                                    placeableC0 = placeableC0;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i6 = i8 + 1;
                            topIconOrIconOnlyMeasurePolicy = this;
                            size3 = i7;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    i3 = i5 + 1;
                    topIconOrIconOnlyMeasurePolicy = this;
                    size2 = i4;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i++;
            topIconOrIconOnlyMeasurePolicy = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        Object obj;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i2);
            if (Intrinsics.c(TextFieldImplKt.f(intrinsicMeasurable), BarcodePickDeserializer.FIELD_ICON)) {
                int iJ = intrinsicMeasurable.J(i);
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (Intrinsics.c(TextFieldImplKt.f((IntrinsicMeasurable) obj), AnnotatedPrivateKey.LABEL)) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj;
                int iJ2 = intrinsicMeasurable2 != null ? intrinsicMeasurable2.J(i) : 0;
                float f = ExpressiveNavigationBarKt.f1446a;
                float f2 = 2;
                float f3 = (this.d * f2) + (BitmapDescriptorFactory.HUE_RED * f2);
                float f4 = ExpressiveNavigationBarKt.f1446a;
                return iJ + iJ2 + intrinsicMeasureScope.r1(f3 + BitmapDescriptorFactory.HUE_RED);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
