package com.woolworths.scanlibrary.util.location;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.geolocation.location.LocationsKt;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsClient;

/* loaded from: classes7.dex */
public class BoundLocationManager {

    public static class BoundLocationListener implements DefaultLifecycleObserver {
        public final Context d;
        public final StoreLocationListener e;
        public FusedLocationProviderClient f;
        public SettingsClient g;
        public LocationRequest h;
        public LocationSettingsRequest i;
        public LocationCallback j;
        public Location k;

        public BoundLocationListener(LifecycleOwner lifecycleOwner, StoreLocationListener storeLocationListener, Context context) {
            this.d = context;
            this.e = storeLocationListener;
            lifecycleOwner.getD().a(this);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onCreate(LifecycleOwner lifecycleOwner) {
            Context context = this.d;
            this.f = LocationServices.getFusedLocationProviderClient(context);
            this.g = LocationServices.getSettingsClient(context);
            this.j = new LocationCallback() { // from class: com.woolworths.scanlibrary.util.location.BoundLocationManager.BoundLocationListener.1
                @Override // com.google.android.gms.location.LocationCallback
                public final void onLocationResult(LocationResult locationResult) {
                    super.onLocationResult(locationResult);
                    Location lastLocation = locationResult.getLastLocation();
                    BoundLocationListener boundLocationListener = BoundLocationListener.this;
                    boundLocationListener.k = lastLocation;
                    if (lastLocation != null) {
                        lastLocation.getElapsedRealtimeNanos();
                        SystemClock.elapsedRealtime();
                        if (boundLocationListener.k.getAccuracy() < 200.0f) {
                            boundLocationListener.e.onLocationChanged(boundLocationListener.k);
                            boundLocationListener.f.removeLocationUpdates(boundLocationListener.j);
                        }
                    }
                }
            };
            LocationRequest locationRequest = new LocationRequest();
            this.h = locationRequest;
            locationRequest.setInterval(10000L);
            this.h.setFastestInterval(5000L);
            this.h.setPriority(100);
            LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder();
            builder.addLocationRequest(this.h);
            this.i = builder.build();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onPause(LifecycleOwner lifecycleOwner) {
            this.f.removeLocationUpdates(this.j);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            if (LocationsKt.c(this.d)) {
                this.g.checkLocationSettings(this.i).addOnSuccessListener(new a(this)).addOnFailureListener(new a(this));
            }
        }
    }

    public static void a(LifecycleOwner lifecycleOwner, StoreLocationListener storeLocationListener, Context context) {
        new BoundLocationListener(lifecycleOwner, storeLocationListener, context);
    }
}
