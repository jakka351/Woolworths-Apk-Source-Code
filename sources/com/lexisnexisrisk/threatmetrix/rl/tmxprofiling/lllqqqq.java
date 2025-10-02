package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.salesforce.marketingcloud.messages.iam.j;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class lllqqqq implements LocationListener {
    private static final int t00740074t0074tt = 120000;
    private static final String tt0074t0074tt = lqlqqll.u00750075u00750075u(lllqqqq.class);

    @Nullable
    private Location ttt00740074tt = null;

    private boolean g006700670067g006700670067(@Nonnull Location location, @Nullable Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > 120000;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        return (accuracy < 0) || (z3 && !(accuracy > 0)) || (z3 && !(accuracy > 200) && gggg0067006700670067(location.getProvider(), location2.getProvider()));
    }

    private boolean gggg0067006700670067(@Nullable String str, @Nullable String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    @Nullable
    public Location gg00670067g006700670067() {
        if (this.ttt00740074tt != null) {
            return new Location(this.ttt00740074tt);
        }
        return null;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (location == null) {
            lqlqqll.uuu007500750075u(tt0074t0074tt, "location is null, possibly provided by a mock location provider");
            return;
        }
        String str = tt0074t0074tt;
        lqlqqll.uuu007500750075u(str, "olc");
        lqlqqll.llqqqll.yy00790079007900790079(str, "onLocationChanged() : " + location.getProvider() + ":" + location.getLatitude() + ":" + location.getLongitude() + ":" + location.getAccuracy());
        if (g006700670067g006700670067(location, this.ttt00740074tt)) {
            this.ttt00740074tt = location;
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        lqlqqll.llqqqll.yy00790079007900790079(tt0074t0074tt, "onProviderDisabled: " + str);
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
        lqlqqll.llqqqll.yy00790079007900790079(tt0074t0074tt, "onProviderEnabled: " + str);
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
        String str2 = tt0074t0074tt;
        StringBuilder sbU = a.u("onStatusChanged: ", str, " status: ");
        sbU.append(i == 2 ? "available " : i == 1 ? "temporarily unavailable" : i == 0 ? "Out of Service" : j.h);
        lqlqqll.llqqqll.yy00790079007900790079(str2, sbU.toString());
    }
}
