package au.com.woolworths.compose.utils.modifier;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material.DismissState;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import au.com.woolworths.feature.shop.contentpage.ContentPageUiEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function3 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.d) {
            case 0:
                PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) this.e;
                MeasureScope layout = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                Intrinsics.h(layout, "$this$layout");
                Intrinsics.h(measurable, "measurable");
                final int iR1 = layout.r1(paddingValuesImpl.b(layout.getD()));
                int iR12 = layout.r1(paddingValuesImpl.c(layout.getD()));
                final int iR13 = layout.r1(paddingValuesImpl.b);
                int iR14 = layout.r1(paddingValuesImpl.d);
                final Placeable placeableC0 = measurable.c0(ConstraintsKt.i(iR1 + iR12, iR13 + iR14, ((Constraints) obj3).f2197a));
                int i = (placeableC0.e - iR1) - iR12;
                return layout.L0((placeableC0.d - iR13) - iR14, i, EmptyMap.d, new Function1() { // from class: au.com.woolworths.compose.utils.modifier.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        Placeable.PlacementScope layout2 = (Placeable.PlacementScope) obj4;
                        Intrinsics.h(layout2, "$this$layout");
                        layout2.e(placeableC0, -iR1, -iR13, BitmapDescriptorFactory.HUE_RED);
                        return Unit.f24250a;
                    }
                });
            case 1:
                SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) this.e;
                MeasureScope layout2 = (MeasureScope) obj;
                Measurable measurable2 = (Measurable) obj2;
                Constraints constraints = (Constraints) obj3;
                Intrinsics.h(layout2, "$this$layout");
                Intrinsics.h(measurable2, "measurable");
                int iD = ((SnapshotMutableIntStateImpl) sharedIntrinsicHeightState.f4713a).d();
                int iJ = Constraints.j(constraints.f2197a);
                long j = constraints.f2197a;
                int iH = Constraints.h(j);
                if (iD <= 0 || Constraints.i(j) != 0) {
                    iD = Constraints.i(j);
                } else {
                    int iG = Constraints.g(j);
                    if (iD > iG) {
                        iD = iG;
                    }
                    if (iD < 0) {
                        iD = 0;
                    }
                }
                Placeable placeableC02 = measurable2.c0(ConstraintsKt.a(iJ, iH, iD, Constraints.g(j)));
                return layout2.L0(placeableC02.d, placeableC02.e, EmptyMap.d, new h(placeableC02, 0));
            case 2:
                ((Function1) this.e).invoke(new ContentPageUiEvent.OnVideoAdPositionChange(((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue()));
                return Unit.f24250a;
            default:
                DismissState dismissState = (DismissState) this.e;
                MeasureScope layout3 = (MeasureScope) obj;
                Measurable measurable3 = (Measurable) obj2;
                Intrinsics.h(layout3, "$this$layout");
                Intrinsics.h(measurable3, "measurable");
                Placeable placeableC03 = measurable3.c0(((Constraints) obj3).f2197a);
                int iAbs = Math.abs(MathKt.b(dismissState.e.getD().floatValue()));
                int i2 = placeableC03.d;
                return layout3.L0(i2, placeableC03.e, EmptyMap.d, new g((-(iAbs - i2)) / 2, 1, placeableC03));
        }
    }
}
