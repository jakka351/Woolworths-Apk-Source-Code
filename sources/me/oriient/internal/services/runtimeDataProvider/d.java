package me.oriient.internal.services.runtimeDataProvider;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.services.config.InternalConfig;

/* loaded from: classes7.dex */
public final class d implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RuntimeDataManagerImpl f25549a;

    public d(RuntimeDataManagerImpl runtimeDataManagerImpl) {
        this.f25549a = runtimeDataManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        if (((InternalConfig) obj).isSilentModeEnabled()) {
            this.f25549a.isInSilentModeFlow().setValue(Boolean.TRUE);
        } else {
            this.f25549a.leaveSilentMode();
        }
        return Unit.f24250a;
    }
}
