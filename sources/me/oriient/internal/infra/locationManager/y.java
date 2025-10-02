package me.oriient.internal.infra.locationManager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.services.config.InternalConfig;

/* loaded from: classes7.dex */
public final class y implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProxyLocationManager f24963a;

    public y(ProxyLocationManager proxyLocationManager) {
        this.f24963a = proxyLocationManager;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.f24963a.useFusedLocationProvider = ((InternalConfig) obj).getUseFusedLocationProvider();
        this.f24963a.applyCurrentConfig();
        return Unit.f24250a;
    }
}
