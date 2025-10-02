package me.oriient.internal.services.geofence;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class i implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BuildingGeofenceManagerImpl f25487a;

    public i(BuildingGeofenceManagerImpl buildingGeofenceManagerImpl) {
        this.f25487a = buildingGeofenceManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.f25487a.getPolygonalStatus().setValue((Map) obj);
        return Unit.f24250a;
    }
}
