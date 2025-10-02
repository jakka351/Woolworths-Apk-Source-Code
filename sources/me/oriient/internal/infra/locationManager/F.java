package me.oriient.internal.infra.locationManager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class F implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProxyLocationManager f24935a;

    public F(ProxyLocationManager proxyLocationManager) {
        this.f24935a = proxyLocationManager;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objEmit = this.f24935a.proxyErrors.emit((Error) obj, continuation);
        return objEmit == CoroutineSingletons.d ? objEmit : Unit.f24250a;
    }
}
