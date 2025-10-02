package com.dynatrace.android.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.state.ToggleableStateKt;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/dynatrace/android/compose/ToggleableComposeCallback_1_7;", "Lkotlin/Function1;", "", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToggleableComposeCallback_1_7 implements Function1<Boolean, Unit> {
    public final Function1 d;
    public Role e;
    public final String f;

    public ToggleableComposeCallback_1_7(Role role, Function1 onValueChanged) {
        Intrinsics.h(onValueChanged, "onValueChanged");
        this.d = onValueChanged;
        this.e = role;
        boolean z = Global.f14077a;
        this.f = "dtxToggleableCompose";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        final boolean zBooleanValue = bool.booleanValue();
        boolean z = Global.b.get();
        Function1 function1 = this.d;
        if (z) {
            if (this.e == null) {
                SemanticsConfiguration semanticsConfiguration = SemanticsManager.b;
                Role role = semanticsConfiguration != null ? (Role) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.w) : null;
                this.e = role != null ? role : null;
            }
            MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.b);
            UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
            ToggleableInfo toggleableInfo = new ToggleableInfo(ToggleableStateKt.a(!zBooleanValue), this.e, function1.getClass().getName());
            if (Global.f14077a) {
                Utility.h(this.f, "onUA: " + toggleableInfo);
            }
            new ToggleActionRecorder(measurementProviderImpl, userActionFactoryImpl, toggleableInfo, SemanticsManager.a()).a(new Function0<Unit>() { // from class: com.dynatrace.android.compose.ToggleableComposeCallback_1_7.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ToggleableComposeCallback_1_7.this.d.invoke(Boolean.valueOf(zBooleanValue));
                    return Unit.f24250a;
                }
            });
        } else {
            function1.invoke(bool);
        }
        return Unit.f24250a;
    }
}
