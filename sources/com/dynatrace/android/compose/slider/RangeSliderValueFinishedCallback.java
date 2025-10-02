package com.dynatrace.android.compose.slider;

import androidx.compose.runtime.internal.StabilityInferred;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.compose.SemanticsManager;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.ClosedFloatingPointRange;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/dynatrace/android/compose/slider/RangeSliderValueFinishedCallback;", "Lkotlin/Function0;", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RangeSliderValueFinishedCallback implements Function0<Unit> {
    public ClosedFloatingPointRange d;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (!Global.b.get()) {
            throw null;
        }
        MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.b);
        UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
        RangeSliderInfo rangeSliderInfo = new RangeSliderInfo(((Number) this.d.getStart()).floatValue(), ((Number) this.d.getEndInclusive()).floatValue(), null);
        if (Global.f14077a) {
            Utility.h(null, "onUA: " + rangeSliderInfo);
        }
        String str = SemanticsManager.f14149a;
        String strE = SemanticsManager.e(null);
        strE.getClass();
        userActionFactoryImpl.a(measurementProviderImpl.a(), "Slide to select ".concat(strE));
        throw null;
    }
}
