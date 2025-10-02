package me.oriient.ipssdk.common.services.geofencing;

import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R$\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceStatusesProvider;", "", "geofenceStatuses", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus;", "getGeofenceStatuses", "()Lkotlinx/coroutines/flow/StateFlow;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LiveGeofenceStatusesProvider {
    @NotNull
    StateFlow<Map<GeofenceBuilding, BuildingGeofenceStatus>> getGeofenceStatuses();
}
