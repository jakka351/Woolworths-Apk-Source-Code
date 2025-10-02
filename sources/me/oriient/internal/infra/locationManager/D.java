package me.oriient.internal.infra.locationManager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class D implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProxyLocationManager f24933a;

    public D(ProxyLocationManager proxyLocationManager) {
        this.f24933a = proxyLocationManager;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objEmit = this.f24933a.proxyLocationUpdates.emit((SystemLocation) obj, continuation);
        return objEmit == CoroutineSingletons.d ? objEmit : Unit.f24250a;
    }
}
