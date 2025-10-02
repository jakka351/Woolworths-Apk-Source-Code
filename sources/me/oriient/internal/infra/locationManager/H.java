package me.oriient.internal.infra.locationManager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class H implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProxyLocationManager f24937a;

    public H(ProxyLocationManager proxyLocationManager) {
        this.f24937a = proxyLocationManager;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        Object objEmit = this.f24937a.proxyIsActive.emit(bool, continuation);
        return objEmit == CoroutineSingletons.d ? objEmit : Unit.f24250a;
    }
}
