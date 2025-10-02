package me.oriient.internal.infra.locationManager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: me.oriient.internal.infra.locationManager.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1195g implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FusedLocationManager f24949a;

    public C1195g(FusedLocationManager fusedLocationManager) {
        this.f24949a = fusedLocationManager;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.f24949a.getLogger().d("FusedLocationManager", "startPermissionMonitoring() collect called with: isGranted = " + zBooleanValue);
        if (zBooleanValue) {
            this.f24949a.startLocationUpdatesImpl();
            this.f24949a.stopPermissionMonitoring();
        }
        return Unit.f24250a;
    }
}
