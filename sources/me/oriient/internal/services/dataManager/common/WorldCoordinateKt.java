package me.oriient.internal.services.dataManager.common;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.locationManager.SystemLocation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"toWorldCoordinate", "Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WorldCoordinateKt {
    @Keep
    @NotNull
    public static final WorldCoordinate toWorldCoordinate(@NotNull SystemLocation systemLocation) {
        Intrinsics.h(systemLocation, "<this>");
        double latitude = systemLocation.getLatitude();
        double longitude = systemLocation.getLongitude();
        Double altitude = systemLocation.getAltitude();
        return new WorldCoordinate(latitude, longitude, altitude != null ? altitude.doubleValue() : 0.0d);
    }
}
