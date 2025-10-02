package me.oriient.internal.services.geofence.strategy;

import kotlinx.coroutines.flow.MutableSharedFlow;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;

/* loaded from: classes7.dex */
public interface q {
    MutableSharedFlow a();

    BuildingGeofenceStatus a(GeofenceBuilding geofenceBuilding);

    BuildingGeofenceStatus a(GeofenceBuilding geofenceBuilding, SystemLocation systemLocation);

    void b();

    void c();

    void clean();
}
