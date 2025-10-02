package me.oriient.internal.services.sensorsManager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.infra.utils.android.appState.AppState;

/* renamed from: me.oriient.internal.services.sensorsManager.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1493g implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ForegroundServiceMonitorImpl f25574a;

    public C1493g(ForegroundServiceMonitorImpl foregroundServiceMonitorImpl) {
        this.f25574a = foregroundServiceMonitorImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = AbstractC1492f.$EnumSwitchMapping$0[((AppState) obj).ordinal()];
        if (i == 1) {
            this.f25574a.onEnteredBackground();
        } else if (i == 2) {
            this.f25574a.onEnteredForeground();
        }
        return Unit.f24250a;
    }
}
