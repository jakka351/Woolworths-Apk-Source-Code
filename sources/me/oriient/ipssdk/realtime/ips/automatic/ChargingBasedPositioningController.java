package me.oriient.ipssdk.realtime.ips.automatic;

import kotlin.Metadata;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/automatic/ChargingBasedPositioningController;", "", "activate", "", "deactivate", "manuallyDefineBuilding", "building", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "pauseTillNextCharging", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ChargingBasedPositioningController {
    void activate();

    void deactivate();

    void manuallyDefineBuilding(@Nullable GeofenceBuilding building);

    void pauseTillNextCharging();
}
