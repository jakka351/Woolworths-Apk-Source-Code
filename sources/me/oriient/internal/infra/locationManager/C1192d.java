package me.oriient.internal.infra.locationManager;

import android.location.Location;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: me.oriient.internal.infra.locationManager.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1192d extends LocationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FusedLocationManager f24946a;

    public C1192d(FusedLocationManager fusedLocationManager) {
        this.f24946a = fusedLocationManager;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        Intrinsics.h(locationResult, "locationResult");
        Location lastLocation = locationResult.getLastLocation();
        SystemLocation systemLocationA = lastLocation != null ? AbstractC1189a.a(lastLocation) : null;
        this.f24946a._lastKnownLocation = systemLocationA;
        if (systemLocationA != null) {
            this.f24946a.getLocationUpdates().f(systemLocationA);
        }
    }
}
