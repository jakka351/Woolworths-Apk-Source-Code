package com.dynatrace.android.compose.slider;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/dynatrace/android/compose/slider/RangeSliderInfo;", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RangeSliderInfo {

    /* renamed from: a, reason: collision with root package name */
    public final float f14155a;
    public final float b;
    public final Function1 c;

    public RangeSliderInfo(float f, float f2, Function1 source) {
        Intrinsics.h(source, "source");
        this.f14155a = f;
        this.b = f2;
        this.c = source;
    }

    public final String toString() {
        return "RangeSliderInfo{startPuckPosition=" + this.f14155a + ", endPuckPosition=" + this.b + ", source=" + this.c.getClass().getName() + '}';
    }
}
