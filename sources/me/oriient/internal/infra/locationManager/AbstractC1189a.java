package me.oriient.internal.infra.locationManager;

import android.location.Location;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: me.oriient.internal.infra.locationManager.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC1189a {
    public static final SystemLocation a(Location location) {
        Intrinsics.h(location, "<this>");
        return new SystemLocation(location.getLatitude(), location.getLongitude(), location.hasAltitude() ? Double.valueOf(location.getAltitude()) : null, location.getAccuracy(), location.hasVerticalAccuracy() ? Double.valueOf(location.getVerticalAccuracyMeters()) : null, location.hasBearing() ? Double.valueOf(location.getBearing()) : null, location.getTime(), location.getProvider(), location.getElapsedRealtimeNanos());
    }
}
