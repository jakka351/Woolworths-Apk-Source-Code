package me.oriient.internal.services.config;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class c implements InternalConfigManager {

    /* renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f25065a = StateFlowKt.a(new InternalConfig(null, null, 0, false, null, 0, null, null, 0, 0, null, 0, false, false, 16383, null));

    @Override // me.oriient.internal.services.config.InternalConfigManager
    public final StateFlow getConfig() {
        return this.f25065a;
    }

    @Override // me.oriient.internal.services.config.InternalConfigManager
    public final Object onNewConfig(InternalConfig internalConfig, Continuation continuation) {
        this.f25065a.setValue(internalConfig);
        return Unit.f24250a;
    }
}
