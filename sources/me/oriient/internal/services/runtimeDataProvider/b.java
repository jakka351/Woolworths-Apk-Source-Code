package me.oriient.internal.services.runtimeDataProvider;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.infra.utils.android.appState.AppState;

/* loaded from: classes7.dex */
public final class b implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RuntimeDataManagerImpl f25547a;

    public b(RuntimeDataManagerImpl runtimeDataManagerImpl) {
        this.f25547a = runtimeDataManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AppState appState = (AppState) obj;
        if (a.$EnumSwitchMapping$0[this.f25547a.previousAppStage.ordinal()] == 3) {
            this.f25547a.updateUserActivity();
        }
        this.f25547a.previousAppStage = appState;
        this.f25547a.evaluateUserActivity(false);
        this.f25547a.updateUserActivity();
        return Unit.f24250a;
    }
}
