package au.com.woolworths.compose.utils.modifier;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function3 {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;

    public /* synthetic */ f(float f, int i) {
        this.d = i;
        this.e = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureScope layout = (MeasureScope) obj;
        Measurable measurable = (Measurable) obj2;
        Constraints constraints = (Constraints) obj3;
        switch (this.d) {
            case 0:
                Intrinsics.h(layout, "$this$layout");
                Intrinsics.h(measurable, "measurable");
                int iR1 = layout.r1(this.e);
                long j = constraints.f2197a;
                int i = iR1 * 2;
                Placeable placeableC0 = measurable.c0(ConstraintsKt.i(0, i, j));
                int i2 = placeableC0.e - i;
                return layout.L0(placeableC0.d, i2, EmptyMap.d, new g(iR1, 0, placeableC0));
            default:
                Intrinsics.h(layout, "$this$layout");
                Intrinsics.h(measurable, "measurable");
                Placeable placeableC02 = measurable.c0(Constraints.a(constraints.f2197a, 0, (layout.r1(this.e) * 2) + Constraints.h(constraints.f2197a), 0, 0, 13));
                return layout.L0(placeableC02.d, placeableC02.e, EmptyMap.d, new au.com.woolworths.shop.checkout.ui.components.compose.e(placeableC02, 0));
        }
    }
}
