package com.dynatrace.android.compose.slider;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/dynatrace/android/compose/slider/SliderValueChangedCallback;", "Lkotlin/Function1;", "", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SliderValueChangedCallback implements Function1<Float, Unit> {
    public final Function1 d;
    public final SliderValueFinishedCallback e;

    public SliderValueChangedCallback(Function1 onValueChange, SliderValueFinishedCallback sliderValueFinishedCallback) {
        Intrinsics.h(onValueChange, "onValueChange");
        this.d = onValueChange;
        this.e = sliderValueFinishedCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        this.e.h = fFloatValue;
        this.d.invoke(Float.valueOf(fFloatValue));
        return Unit.f24250a;
    }
}
