package com.dynatrace.android.compose;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.state.ToggleableState;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/dynatrace/android/compose/ClickableComposeCallback;", "Lkotlin/Function0;", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickableComposeCallback implements Function0<Object> {
    public final Function0 d;
    public Role e;
    public final String f;

    public ClickableComposeCallback(Role role, Function0 function) {
        Intrinsics.h(function, "function");
        this.d = function;
        this.e = role;
        boolean z = Global.f14077a;
        this.f = "dtxClickableCompose";
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        boolean z = Global.b.get();
        Function0 function0 = this.d;
        if (!z) {
            return function0.invoke();
        }
        if (this.e == null) {
            SemanticsConfiguration semanticsConfiguration = SemanticsManager.b;
            Role role = semanticsConfiguration != null ? (Role) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.w) : null;
            this.e = role != null ? role : null;
        }
        MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.b);
        UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
        boolean z2 = function0 instanceof ToggleableDataProvider;
        String str = this.f;
        if (z2) {
            ToggleableDataProvider toggleableDataProvider = (ToggleableDataProvider) function0;
            ToggleableState toggleableStateB = toggleableDataProvider.getE();
            Intrinsics.g(toggleableStateB, "providesToggleableState(...)");
            Role role2 = this.e;
            String strA = toggleableDataProvider.a();
            Intrinsics.g(strA, "providesSourceName(...)");
            ToggleableInfo toggleableInfo = new ToggleableInfo(toggleableStateB, role2, strA);
            if (Global.f14077a) {
                Utility.h(str, "onUA: " + toggleableInfo);
            }
            return new ToggleActionRecorder(measurementProviderImpl, userActionFactoryImpl, toggleableInfo, SemanticsManager.a()).a(function0);
        }
        Role role3 = this.e;
        ClickableInfo clickableInfo = new ClickableInfo(role3, function0);
        if (Global.f14077a) {
            Utility.h(str, "onUA: " + clickableInfo);
        }
        String strA2 = SemanticsManager.a();
        String strA3 = role3 != null ? Role.a(role3.f2014a) : "component";
        if (strA2 != null) {
            string = "Touch on ".concat(strA2);
        } else {
            StringBuilder sbU = a.u("Touch on ", strA3, " with function ");
            String name = function0.getClass().getName();
            sbU.append(StringsKt.a0(JwtParser.SEPARATOR_CHAR, name, name));
            string = sbU.toString();
        }
        DTXAutoActionWrapper dTXAutoActionWrapperA = userActionFactoryImpl.a(measurementProviderImpl.a(), string);
        dTXAutoActionWrapperA.g("role", String.valueOf(role3));
        dTXAutoActionWrapperA.g("function", function0.getClass().getName());
        dTXAutoActionWrapperA.g("type", "click");
        Object objInvoke = function0.invoke();
        dTXAutoActionWrapperA.h();
        return objInvoke;
    }
}
