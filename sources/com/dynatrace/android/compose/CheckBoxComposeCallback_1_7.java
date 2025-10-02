package com.dynatrace.android.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/dynatrace/android/compose/CheckBoxComposeCallback_1_7;", "Lkotlin/Function0;", "", "Lcom/dynatrace/android/compose/ToggleableDataProvider;", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckBoxComposeCallback_1_7 implements Function0<Object>, ToggleableDataProvider {
    public final Function0 d;
    public final Function1 e;
    public final boolean f;
    public final String g;

    public CheckBoxComposeCallback_1_7(Function0 function0, Function1 source, boolean z) {
        Intrinsics.h(source, "source");
        this.d = function0;
        this.e = source;
        this.f = z;
        boolean z2 = Global.f14077a;
        this.g = "dtxCheckBoxCompose";
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public final String a() {
        return this.e.getClass().getName();
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public final ToggleableState b() {
        return ToggleableStateKt.a(this.f);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = Global.b.get();
        Function0 function0 = this.d;
        if (!z) {
            return function0.invoke();
        }
        MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.b);
        UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
        ToggleableInfo toggleableInfo = new ToggleableInfo(ToggleableStateKt.a(this.f), new Role(1), a());
        if (Global.f14077a) {
            Utility.h(this.g, "onUA: " + toggleableInfo);
        }
        return new ToggleActionRecorder(measurementProviderImpl, userActionFactoryImpl, toggleableInfo, SemanticsManager.a()).a(function0);
    }
}
