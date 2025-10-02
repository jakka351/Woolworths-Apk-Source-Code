package com.dynatrace.android.compose.slider;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/dynatrace/android/compose/slider/RangeSliderValueChangedCallback;", "Lkotlin/Function1;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RangeSliderValueChangedCallback implements Function1<ClosedFloatingPointRange<Float>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClosedFloatingPointRange value = (ClosedFloatingPointRange) obj;
        Intrinsics.h(value, "value");
        throw null;
    }
}
