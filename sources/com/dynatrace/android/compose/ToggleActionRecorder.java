package com.dynatrace.android.compose;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.Role;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/dynatrace/android/compose/ToggleActionRecorder;", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToggleActionRecorder {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementProviderImpl f14152a;
    public final UserActionFactoryImpl b;
    public final ToggleableInfo c;
    public final String d;

    public ToggleActionRecorder(MeasurementProviderImpl measurementProviderImpl, UserActionFactoryImpl userActionFactoryImpl, ToggleableInfo toggleableInfo, String str) {
        this.f14152a = measurementProviderImpl;
        this.b = userActionFactoryImpl;
        this.c = toggleableInfo;
        this.d = str;
    }

    public final Object a(Function0 function) {
        String string;
        Intrinsics.h(function, "function");
        ToggleableInfo toggleableInfo = this.c;
        String str = toggleableInfo.c;
        Role role = toggleableInfo.b;
        String strA = role != null ? Role.a(role.f2014a) : "component";
        String str2 = this.d;
        if (str2 != null) {
            string = "Touch on ".concat(str2);
        } else {
            StringBuilder sbU = a.u("Touch on ", strA, " with function ");
            sbU.append(StringsKt.a0(JwtParser.SEPARATOR_CHAR, str, str));
            string = sbU.toString();
        }
        DTXAutoActionWrapper dTXAutoActionWrapperA = this.b.a(this.f14152a.a(), string);
        dTXAutoActionWrapperA.g("role", String.valueOf(role));
        dTXAutoActionWrapperA.g("function", str);
        dTXAutoActionWrapperA.g("fromState", toggleableInfo.f14153a.name());
        dTXAutoActionWrapperA.g("type", "toggle");
        Object objInvoke = function.invoke();
        dTXAutoActionWrapperA.h();
        return objInvoke;
    }
}
