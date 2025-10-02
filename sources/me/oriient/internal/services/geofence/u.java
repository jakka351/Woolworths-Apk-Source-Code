package me.oriient.internal.services.geofence;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class u implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GeneralGeofenceStatusProviderImpl f25520a;

    public u(GeneralGeofenceStatusProviderImpl generalGeofenceStatusProviderImpl) {
        this.f25520a = generalGeofenceStatusProviderImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.f25520a.getCurrentStatus().setValue((GeneralGeofenceStatus) obj);
        return Unit.f24250a;
    }
}
