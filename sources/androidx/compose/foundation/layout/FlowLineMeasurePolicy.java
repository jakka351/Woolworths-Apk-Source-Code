package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface FlowLineMeasurePolicy extends RowColumnMeasurePolicy {
    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default long a(int i, int i2, int i3, int i4, boolean z) {
        if (p()) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.f972a;
            return !z ? ConstraintsKt.a(i, i3, i2, i4) : Constraints.Companion.b(i, i3, i2, i4);
        }
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.f946a;
        return !z ? ConstraintsKt.a(i2, i4, i, i3) : Constraints.Companion.a(i2, i4, i, i3);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default void b(int i, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        if (p()) {
            l().b(measureScope, i, iArr, measureScope.getD(), iArr2);
        } else {
            n().c(measureScope, i, iArr, iArr2);
        }
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int g(Placeable placeable) {
        return p() ? placeable.h0() : placeable.i0();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default MeasureResult i(final Placeable[] placeableArr, MeasureScope measureScope, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        if (p()) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
        }
        final LayoutDirection d = p() ? LayoutDirection.d : measureScope.getD();
        return measureScope.L0(i8, i7, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLineMeasurePolicy$placeHelper$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int[] iArr3 = iArr2;
                int i9 = iArr3 != null ? iArr3[i4] : 0;
                int i10 = i5;
                for (int i11 = i10; i11 < i6; i11++) {
                    Placeable placeable = placeableArr[i11];
                    Intrinsics.e(placeable);
                    LayoutDirection layoutDirection = d;
                    int i12 = i;
                    FlowLineMeasurePolicy flowLineMeasurePolicy = this;
                    int iO = flowLineMeasurePolicy.o(i3, i12, placeable, layoutDirection) + i9;
                    boolean zP = flowLineMeasurePolicy.p();
                    int[] iArr4 = iArr;
                    if (zP) {
                        placementScope.e(placeable, iArr4[i11 - i10], iO, BitmapDescriptorFactory.HUE_RED);
                    } else {
                        placementScope.e(placeable, iO, iArr4[i11 - i10], BitmapDescriptorFactory.HUE_RED);
                    }
                }
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int j(Placeable placeable) {
        return p() ? placeable.i0() : placeable.h0();
    }

    Arrangement.Horizontal l();

    CrossAxisAlignment m();

    Arrangement.Vertical n();

    default int o(int i, int i2, Placeable placeable, LayoutDirection layoutDirection) {
        CrossAxisAlignment crossAxisAlignmentM;
        Object v = placeable.getV();
        RowColumnParentData rowColumnParentData = v instanceof RowColumnParentData ? (RowColumnParentData) v : null;
        if (rowColumnParentData == null || (crossAxisAlignmentM = rowColumnParentData.c) == null) {
            crossAxisAlignmentM = m();
        }
        return crossAxisAlignmentM.a(i - g(placeable), i2, placeable, layoutDirection);
    }

    boolean p();
}
