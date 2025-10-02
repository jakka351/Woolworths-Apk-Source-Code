package me.oriient.internal.services.systemStateManager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.infra.utils.android.appState.AppState;

/* loaded from: classes7.dex */
public final class a implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SystemStateManagerImpl f25609a;

    public a(SystemStateManagerImpl systemStateManagerImpl) {
        this.f25609a = systemStateManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.f25609a.updateSystemState(SystemState.copy$default((SystemState) this.f25609a.getSystemState().getValue(), (AppState) obj, null, null, null, null, null, false, false, false, 510, null), SystemStateUpdateCause.APP_STATE);
        return Unit.f24250a;
    }
}
