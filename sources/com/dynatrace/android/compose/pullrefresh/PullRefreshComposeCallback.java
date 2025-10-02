package com.dynatrace.android.compose.pullrefresh;

import androidx.compose.runtime.internal.StabilityInferred;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/dynatrace/android/compose/pullrefresh/PullRefreshComposeCallback;", "Lkotlin/Function0;", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PullRefreshComposeCallback implements Function0<Unit> {
    public final Function0 d;
    public final String e;

    public PullRefreshComposeCallback(Function0 onRefresh) {
        Intrinsics.h(onRefresh, "onRefresh");
        this.d = onRefresh;
        boolean z = Global.f14077a;
        this.e = "dtxPullRefreshComposeCallback";
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String strConcat;
        boolean z = Global.b.get();
        Function0 function0 = this.d;
        if (z) {
            MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.b);
            UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
            PullRefreshInfo pullRefreshInfo = new PullRefreshInfo(function0);
            if (Global.f14077a) {
                Utility.h(this.e, "onUA: " + pullRefreshInfo);
            }
            String strA = SemanticsManager.a();
            if (strA != null) {
                strConcat = "Swipe to refresh ".concat(strA);
            } else {
                String name = function0.getClass().getName();
                strConcat = "Swipe to refresh component with function ".concat(StringsKt.a0(JwtParser.SEPARATOR_CHAR, name, name));
            }
            DTXAutoActionWrapper dTXAutoActionWrapperA = userActionFactoryImpl.a(measurementProviderImpl.a(), strConcat);
            dTXAutoActionWrapperA.g("function", function0.getClass().getName());
            dTXAutoActionWrapperA.g("type", "pull refresh");
            function0.invoke();
            dTXAutoActionWrapperA.h();
        } else {
            function0.invoke();
        }
        return Unit.f24250a;
    }
}
