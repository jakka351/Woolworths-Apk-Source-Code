package com.dynatrace.android.compose.slider;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.compose.SemanticsManager;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/dynatrace/android/compose/slider/SliderValueFinishedCallback;", "Lkotlin/Function0;", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SliderValueFinishedCallback implements Function0<Unit> {
    public final Function1 d;
    public final Modifier e;
    public final Function0 f;
    public final String g;
    public float h;

    public SliderValueFinishedCallback(Function1 onValueChange, Modifier modifier, Function0 function0) {
        Intrinsics.h(onValueChange, "onValueChange");
        this.d = onValueChange;
        this.e = modifier;
        this.f = function0;
        boolean z = Global.f14077a;
        this.g = "dtxSliderValueFinishedCallback";
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String strConcat;
        boolean z = Global.b.get();
        Function0 function0 = this.f;
        if (z) {
            MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.b);
            UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
            float f = this.h;
            Function1 function1 = this.d;
            SliderInfo sliderInfo = new SliderInfo(f, function1);
            if (Global.f14077a) {
                Utility.h(this.g, "onUA: " + sliderInfo);
            }
            String str = SemanticsManager.f14149a;
            String strE = SemanticsManager.e(this.e);
            if (strE != null) {
                strConcat = "Slide to select ".concat(strE);
            } else {
                String name = function1.getClass().getName();
                strConcat = "Slide component with function ".concat(StringsKt.a0(JwtParser.SEPARATOR_CHAR, name, name));
            }
            DTXAutoActionWrapper dTXAutoActionWrapperA = userActionFactoryImpl.a(measurementProviderImpl.a(), strConcat);
            dTXAutoActionWrapperA.g("function", function1.getClass().getName());
            dTXAutoActionWrapperA.g("toState", String.valueOf(f));
            dTXAutoActionWrapperA.g("type", "slide");
            if (function0 != null) {
                function0.invoke();
            }
            dTXAutoActionWrapperA.h();
        } else if (function0 != null) {
            function0.invoke();
        }
        return Unit.f24250a;
    }
}
