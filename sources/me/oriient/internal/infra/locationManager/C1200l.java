package me.oriient.internal.infra.locationManager;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: me.oriient.internal.infra.locationManager.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1200l extends AbstractC1201m {
    public final /* synthetic */ LocationManagerAndroid c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1200l(LocationManagerAndroid locationManagerAndroid) {
        super(locationManagerAndroid, "gps");
        this.c = locationManagerAndroid;
    }

    @Override // me.oriient.internal.infra.locationManager.AbstractC1201m, android.location.LocationListener
    public final void onProviderDisabled(String provider) {
        Object next;
        Intrinsics.h(provider, "provider");
        this.c.getLogger().d("LocationManagerAndroid", YU.a.p(new StringBuilder("("), this.f24952a, ") onProviderDisabled: called with provider - ", provider));
        if (LocationManagerAndroid.SUPPORTED_PROVIDERS.contains(provider)) {
            List list = LocationManagerAndroid.SUPPORTED_PROVIDERS;
            LocationManagerAndroid locationManagerAndroid = this.c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (locationManagerAndroid.getLocationManager().isProviderEnabled((String) next)) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                this.c.getLogger().d("LocationManagerAndroid", androidx.constraintlayout.core.state.a.l(new StringBuilder("("), this.f24952a, ") onProviderDisabled: (high-accuracy mode) ", str, " is still enabled"));
                return;
            }
            this.c.getLogger().w("LocationManagerAndroid", "(" + this.f24952a + ") onProviderDisabled: All supported providers are down. Location services turned off.");
            this.c.stopLocationUpdates();
        }
    }

    @Override // me.oriient.internal.infra.locationManager.AbstractC1201m, android.location.LocationListener
    public final void onProviderEnabled(String provider) {
        Intrinsics.h(provider, "provider");
        this.c.getLogger().d("LocationManagerAndroid", YU.a.p(new StringBuilder("("), this.f24952a, ") onProviderEnabled: ", provider));
        if (LocationManagerAndroid.SUPPORTED_PROVIDERS.contains(provider)) {
            this.c.resetLastKnownLocation();
        }
    }
}
