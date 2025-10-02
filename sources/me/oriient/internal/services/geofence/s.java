package me.oriient.internal.services.geofence;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;

/* loaded from: classes7.dex */
public final class s implements GeofenceIntersectionCalculator {
    @Override // me.oriient.internal.services.geofence.GeofenceIntersectionCalculator
    public final double calculateIntersectionPercentage(WorldCoordinate origin, WorldCoordinate location, double d, double d2) {
        Intrinsics.h(origin, "origin");
        Intrinsics.h(location, "location");
        double dDistanceTo = (d2 + d) - origin.distanceTo(location);
        if (dDistanceTo < 0.0d || d <= 0.0d) {
            return 0.0d;
        }
        return (dDistanceTo / d) * 100;
    }
}
