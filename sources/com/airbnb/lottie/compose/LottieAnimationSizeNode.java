package com.airbnb.lottie.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LottieAnimationSizeNode extends Modifier.Node implements LayoutModifierNode {
    public int r;
    public int s;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        long jA;
        Intrinsics.h(measurable, "measurable");
        long jD = ConstraintsKt.d(j, IntSizeKt.a(this.r, this.s));
        if (Constraints.g(j) == Integer.MAX_VALUE && Constraints.h(j) != Integer.MAX_VALUE) {
            int i = (int) (jD >> 32);
            int i2 = (this.s * i) / this.r;
            jA = ConstraintsKt.a(i, i, i2, i2);
        } else if (Constraints.h(j) != Integer.MAX_VALUE || Constraints.g(j) == Integer.MAX_VALUE) {
            int i3 = (int) (jD >> 32);
            int i4 = (int) (jD & 4294967295L);
            jA = ConstraintsKt.a(i3, i3, i4, i4);
        } else {
            int i5 = (int) (jD & 4294967295L);
            int i6 = (this.r * i5) / this.s;
            jA = ConstraintsKt.a(i6, i6, i5, i5);
        }
        final Placeable placeableC0 = measurable.c0(jA);
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationSizeNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                Intrinsics.h(layout, "$this$layout");
                Placeable.PlacementScope.h(layout, placeableC0, 0, 0);
                return Unit.f24250a;
            }
        });
    }
}
