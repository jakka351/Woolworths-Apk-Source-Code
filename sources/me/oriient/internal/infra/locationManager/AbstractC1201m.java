package me.oriient.internal.infra.locationManager;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Logger;

/* renamed from: me.oriient.internal.infra.locationManager.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC1201m implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f24952a;
    public final /* synthetic */ LocationManagerAndroid b;

    public AbstractC1201m(LocationManagerAndroid locationManagerAndroid, String myProvider) {
        Intrinsics.h(myProvider, "myProvider");
        this.b = locationManagerAndroid;
        this.f24952a = myProvider;
    }

    @Override // android.location.LocationListener
    public final void onFlushComplete(int i) {
        this.b.getLogger().d("LocationManagerAndroid", "(" + this.f24952a + ") onFlushComplete: called with - " + i);
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location newLocation) {
        Intrinsics.h(newLocation, "newLocation");
        SystemLocation systemLocationA = AbstractC1189a.a(newLocation);
        LocationManagerAndroid locationManagerAndroid = this.b;
        if (!locationManagerAndroid.isBetterLocation(systemLocationA, locationManagerAndroid.get_lastKnownLocation())) {
            this.b.getLogger().w("LocationManagerAndroid", "(" + this.f24952a + ") onLocationChanged: got location but it is not better than previous location: " + systemLocationA);
            return;
        }
        this.b._lastKnownLocation = systemLocationA;
        if (this.b.getLocationUpdates().f(systemLocationA)) {
            return;
        }
        this.b.getLogger().e("LocationManagerAndroid", "(" + this.f24952a + ") tryEmit failed");
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String provider) {
        Intrinsics.h(provider, "provider");
        this.b.getLogger().d("LocationManagerAndroid", YU.a.p(new StringBuilder("("), this.f24952a, ") onProviderDisabled: called with provider - ", provider));
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String provider) {
        Intrinsics.h(provider, "provider");
        this.b.getLogger().d("LocationManagerAndroid", YU.a.p(new StringBuilder("("), this.f24952a, ") onProviderEnabled: called with - ", provider));
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
        Logger logger = this.b.getLogger();
        StringBuilder sb = new StringBuilder("(");
        androidx.constraintlayout.core.state.a.B(sb, this.f24952a, ") onStatusChanged() called with: provider = ", str, ", status = ");
        sb.append(i);
        sb.append(", extras = ");
        sb.append(bundle);
        logger.d("LocationManagerAndroid", sb.toString());
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(List locations) {
        Intrinsics.h(locations, "locations");
        int size = locations.size();
        for (int i = 0; i < size; i++) {
            onLocationChanged((Location) locations.get(i));
        }
    }
}
