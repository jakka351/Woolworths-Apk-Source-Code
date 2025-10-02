package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/ColumnMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ColumnMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Arrangement.Vertical f947a;
    public final Alignment.Horizontal b;

    public ColumnMeasurePolicy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal) {
        this.f947a = vertical;
        this.b = horizontal;
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final long a(int i, int i2, int i3, int i4, boolean z) {
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.f946a;
        return !z ? ConstraintsKt.a(i2, i4, i, i3) : Constraints.Companion.a(i2, i4, i, i3);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final void b(int i, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.f947a.c(measureScope, i, iArr, iArr2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        return RowColumnMeasurePolicyKt.a(this, Constraints.i(j), Constraints.j(j), Constraints.g(j), Constraints.h(j), measureScope.r1(this.f947a.getD()), measureScope, list, new Placeable[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return IntrinsicMeasureBlocks.g(i, intrinsicMeasureScope.r1(this.f947a.getD()), list);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int e(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return IntrinsicMeasureBlocks.h(i, intrinsicMeasureScope.r1(this.f947a.getD()), list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColumnMeasurePolicy)) {
            return false;
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) obj;
        return Intrinsics.c(this.f947a, columnMeasurePolicy.f947a) && Intrinsics.c(this.b, columnMeasurePolicy.b);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return IntrinsicMeasureBlocks.e(i, intrinsicMeasureScope.r1(this.f947a.getD()), list);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final int g(Placeable placeable) {
        return placeable.d;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return IntrinsicMeasureBlocks.f(i, intrinsicMeasureScope.r1(this.f947a.getD()), list);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f947a.hashCode() * 31);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final MeasureResult i(final Placeable[] placeableArr, final MeasureScope measureScope, final int i, final int[] iArr, int i2, final int i3, int[] iArr2, int i4, int i5, int i6) {
        return measureScope.L0(i3, i2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.ColumnMeasurePolicy$placeHelper$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                Placeable[] placeableArr2 = placeableArr;
                int length = placeableArr2.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    Placeable placeable = placeableArr2[i7];
                    int i9 = i8 + 1;
                    Intrinsics.e(placeable);
                    Object a2 = placeable.getA();
                    RowColumnParentData rowColumnParentData = a2 instanceof RowColumnParentData ? (RowColumnParentData) a2 : null;
                    LayoutDirection d = measureScope.getD();
                    CrossAxisAlignment crossAxisAlignment = rowColumnParentData != null ? rowColumnParentData.c : null;
                    int i10 = i3;
                    placementScope.e(placeable, crossAxisAlignment != null ? crossAxisAlignment.a(i10 - placeable.d, i, placeable, d) : this.b.a(0, i10 - placeable.d, d), iArr[i8], BitmapDescriptorFactory.HUE_RED);
                    i7++;
                    i8 = i9;
                }
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final int j(Placeable placeable) {
        return placeable.e;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f947a + ", horizontalAlignment=" + this.b + ')';
    }
}
