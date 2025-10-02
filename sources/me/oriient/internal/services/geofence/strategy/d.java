package me.oriient.internal.services.geofence.strategy;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.infra.locationManager.SystemLocationManager;
import me.oriient.internal.infra.utils.android.appState.AppState;

/* loaded from: classes7.dex */
public final class d implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f25499a;

    public d(p pVar) {
        this.f25499a = pVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        if (((AppState) obj) == AppState.FOREGROUND) {
            ((SystemLocationManager) this.f25499a.j.getD()).requestSingleUpdate();
        }
        return Unit.f24250a;
    }
}
