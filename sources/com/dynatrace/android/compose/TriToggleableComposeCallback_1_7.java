package com.dynatrace.android.compose;

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
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/dynatrace/android/compose/TriToggleableComposeCallback_1_7;", "Lkotlin/Function0;", "", "Lcom/dynatrace/android/compose/ToggleableDataProvider;", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TriToggleableComposeCallback_1_7 implements Function0<Object>, ToggleableDataProvider {
    public final Function0 d;
    public final ToggleableState e;
    public final String f;

    public TriToggleableComposeCallback_1_7(Function0 source, ToggleableState state) {
        Intrinsics.h(source, "source");
        Intrinsics.h(state, "state");
        this.d = source;
        this.e = state;
        boolean z = Global.f14077a;
        this.f = "dtxTriToggleableCompose";
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public final String a() {
        return this.d.getClass().getName();
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    /* renamed from: b, reason: from getter */
    public final ToggleableState getE() {
        return this.e;
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
        SemanticsConfiguration semanticsConfiguration = SemanticsManager.b;
        Role role = semanticsConfiguration != null ? (Role) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.w) : null;
        ToggleableInfo toggleableInfo = new ToggleableInfo(this.e, role != null ? role : null, a());
        if (Global.f14077a) {
            Utility.h(this.f, "onUA: " + toggleableInfo);
        }
        return new ToggleActionRecorder(measurementProviderImpl, userActionFactoryImpl, toggleableInfo, SemanticsManager.a()).a(function0);
    }
}
