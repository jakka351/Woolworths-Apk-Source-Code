package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.HandlerThread;
import android.os.Looper;
import com.lexisnexisrisk.threatmetrix.rl.TMXConfig;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjxjj;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class lqlqqqq {
    private static final String t0074t00740074tt = lqlqqll.u00750075u00750075u(lqlqqqq.class);
    private static final String tt007400740074tt = "Failed to register locationServices: ";
    private int t0074007400740074tt;

    @Nullable
    private jjxjxjj.GenericLocation t007400740074t0074t;
    private Context t0074t0074t0074t;

    @Nullable
    private lllqqqq t0074tt00740074t;
    private long t0074ttt0074t;
    private String tt00740074t0074t;

    @Nullable
    private LocationManager tttt00740074t;
    private long ttttt0074t;
    private final AtomicBoolean tt0074tt0074t = new AtomicBoolean(false);
    private final AtomicBoolean t00740074tt0074t = new AtomicBoolean(false);
    private final AtomicBoolean ttt0074t0074t = new AtomicBoolean(false);
    private final HandlerThread tt0074t00740074t = new HandlerThread("THMLocationHandler");

    public class jjxjjjj extends BroadcastReceiver {
        public jjxjjjj() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nonnull Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && nnlllnn.nlnnlln.f006600660066f0066f() && new nnlllnn.nnnllln(context).fff006600660066f("android.permission.ACCESS_NETWORK_STATE", lqlqqqq.this.t0074t0074t0074t.getPackageName())) {
                try {
                    Object systemService = context.getSystemService("connectivity");
                    if (systemService instanceof ConnectivityManager) {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                            lqlqqqq.this.pause();
                        } else {
                            lqlqqqq.this.resume();
                        }
                    }
                } catch (SecurityException e) {
                    nlnnlnl.ddd0064d0064d(e, lqlqqqq.t0074t00740074tt);
                } catch (Exception e2) {
                    lqlqqll.uuu007500750075u(lqlqqqq.t0074t00740074tt, e2.toString());
                }
            }
        }
    }

    public class jxjjjjj extends BroadcastReceiver {
        public jxjjjjj() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, @Nonnull Intent intent) {
            if ("android.intent.action.BATTERY_LOW".equals(intent.getAction())) {
                lqlqqqq.this.pause();
            } else {
                lqlqqqq.this.resume();
            }
        }
    }

    public enum llqqqqq {
        NONE,
        FINE,
        COARSE;

        public static llqqqqq valueOf(String str) {
            return (llqqqqq) nlnnnnn.ooo006F006Foo(llqqqqq.class, str);
        }
    }

    private Location ggg00670067006700670067() {
        Location location = null;
        if (w0077wwwwww(this.t0074t0074t0074t) && this.t00740074tt0074t.get()) {
            LocationManager locationManager = this.tttt00740074t;
            if (locationManager == null) {
                return null;
            }
            String str = t0074t00740074tt;
            lqlqqll.uuu007500750075u(str, "gll");
            lqlqqll.llqqqll.yy00790079007900790079(str, "Attempting to find an existing location to prime things");
            try {
                long j = 0;
                float f = Float.MAX_VALUE;
                for (String str2 : locationManager.getAllProviders()) {
                    if (str2 == null) {
                        lqlqqll.llqqqll.uuu0075uuu(t0074t00740074tt, "null provider (wut?)");
                    } else if (g0067g00670067006700670067(this.t0074t0074t0074t) != llqqqqq.COARSE || str2.equals("network")) {
                        if (w0077wwwwww(this.t0074t0074t0074t)) {
                            String str3 = t0074t00740074tt;
                            lqlqqll.llqqqll.yy00790079007900790079(str3, "getLastLocation() : " + str2);
                            Location lastKnownLocation = locationManager.getLastKnownLocation(str2);
                            if (lastKnownLocation != null) {
                                lqlqqll.uuu007500750075u(str3, "gllnn");
                                lqlqqll.llqqqll.yy00790079007900790079(str3, "getLastLocation() : " + lastKnownLocation.getProvider() + ":" + lastKnownLocation.getLatitude() + ":" + lastKnownLocation.getLongitude() + ":" + lastKnownLocation.getAccuracy());
                                float accuracy = lastKnownLocation.getAccuracy();
                                long time = lastKnownLocation.getTime();
                                long j2 = this.ttttt0074t;
                                if (time > j2 && accuracy < f) {
                                    location = lastKnownLocation;
                                    f = accuracy;
                                } else if (time < j2 && f == Float.MAX_VALUE && time > j) {
                                    location = lastKnownLocation;
                                }
                                j = time;
                            }
                        }
                    }
                }
                return location;
            } catch (SecurityException e) {
                lqlqqll.llqqqll.u0075uuuuu(t0074t00740074tt, "User refuse granting permission {}", e.toString());
                nlnnlnl.d00640064dd0064d(e);
            } catch (Exception e2) {
                lqlqqll.uuu007500750075u(t0074t00740074tt, e2.toString());
            }
        }
        return location;
    }

    private boolean ww00770077wwww(LocationManager locationManager, String str, long j, Criteria criteria, Looper looper) {
        if (looper != null) {
            try {
                if (this.t0074tt00740074t != null && w0077wwwwww(this.t0074t0074t0074t)) {
                    if (str != null) {
                        if (w0077wwwwww(this.t0074t0074t0074t)) {
                            locationManager.requestLocationUpdates(str, this.t0074ttt0074t, j, this.t0074tt00740074t, looper);
                        }
                    } else if (w0077wwwwww(this.t0074t0074t0074t)) {
                        locationManager.requestLocationUpdates(this.t0074ttt0074t, j, criteria, this.t0074tt00740074t, looper);
                    }
                    String str2 = t0074t00740074tt;
                    lqlqqll.uuu007500750075u(str2, "rlu");
                    lqlqqll.llqqqll.yy00790079007900790079(str2, "TDLocationManager created: " + locationManager.getBestProvider(criteria, true));
                    return true;
                }
            } catch (IllegalArgumentException e) {
                lqlqqll.uu0075uuu0075(t0074t00740074tt, tt007400740074tt + e);
            } catch (SecurityException e2) {
                lqlqqll.uu0075uuu0075(t0074t00740074tt, tt007400740074tt + e2);
                nlnnlnl.d00640064dd0064d(e2);
            }
        }
        return false;
    }

    private void www0077wwww() {
        if (new nnlllnn.nnnllln(this.t0074t0074t0074t).fff006600660066f("android.permission.ACCESS_NETWORK_STATE", this.t0074t0074t0074t.getPackageName())) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.t0074t0074t0074t.registerReceiver(new jjxjjjj(), intentFilter);
        }
        if (this.tt0074tt0074t.get()) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.BATTERY_LOW");
            intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
            intentFilter2.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            this.t0074t0074t0074t.registerReceiver(new jxjjjjj(), intentFilter2);
        }
    }

    public void config(@Nonnull TMXConfig tMXConfig) {
        nlllnnl nlllnnlVarWwww0077www = tMXConfig.wwww0077www();
        if (nlllnnlVarWwww0077www == null || nlllnnlVarWwww0077www.ww0077w007700770077 == null) {
            return;
        }
        this.t00740074tt0074t.set(tMXConfig.w007700770077w0077ww());
        this.tt0074tt0074t.set(tMXConfig.ww0077w0077www());
        Context context = nlllnnlVarWwww0077www.ww0077w007700770077;
        this.t0074t0074t0074t = context;
        this.tt00740074t0074t = context.getPackageName();
        this.ttttt0074t = tMXConfig.wwwww0077ww();
        this.t0074ttt0074t = tMXConfig.w0077w00770077www();
        this.t0074007400740074tt = tMXConfig.w0077007700770077www();
        this.t0074tt00740074t = new lllqqqq();
        try {
            this.tt0074t00740074t.start();
            if (ww0077wwwww()) {
                www0077wwww();
            }
            w0077w0077wwww();
        } catch (Throwable th) {
            lqlqqll.uuu007500750075u(t0074t00740074tt, th.toString());
        }
    }

    public void g00670067g0067006700670067() {
        lllqqqq lllqqqqVar;
        LocationManager locationManager = this.tttt00740074t;
        if (!w0077wwwwww(this.t0074t0074t0074t) || (lllqqqqVar = this.t0074tt00740074t) == null || locationManager == null) {
            return;
        }
        try {
            locationManager.removeUpdates(lllqqqqVar);
        } catch (SecurityException e) {
            lqlqqll.llqqqll.u0075uuuuu(t0074t00740074tt, "User refuse granting permission {}", e.toString());
            nlnnlnl.d00640064dd0064d(e);
        } catch (Exception e2) {
            lqlqqll.uuu007500750075u(t0074t00740074tt, e2.toString());
        }
    }

    public llqqqqq g0067g00670067006700670067(Context context) {
        llqqqqq llqqqqqVar = llqqqqq.NONE;
        nnlllnn.nnnllln nnnlllnVar = new nnlllnn.nnnllln(context);
        if (nnnlllnVar.fff006600660066f("android.permission.ACCESS_COARSE_LOCATION", context.getPackageName())) {
            llqqqqqVar = llqqqqq.COARSE;
        }
        return nnnlllnVar.fff006600660066f("android.permission.ACCESS_FINE_LOCATION", context.getPackageName()) ? llqqqqq.FINE : llqqqqqVar;
    }

    @Nullable
    public jjxjxjj.GenericLocation getLocation() {
        lllqqqq lllqqqqVar;
        Location locationGg00670067g006700670067;
        if (w0077wwwwww(this.t0074t0074t0074t) && this.t00740074tt0074t.get()) {
            jjxjxjj.GenericLocation genericLocation = this.t007400740074t0074t;
            if (genericLocation != null) {
                return genericLocation;
            }
            if (w0077wwwwww(this.t0074t0074t0074t) && this.t00740074tt0074t.get() && (lllqqqqVar = this.t0074tt00740074t) != null && (locationGg00670067g006700670067 = lllqqqqVar.gg00670067g006700670067()) != null && (locationGg00670067g006700670067.getLatitude() != 0.0d || locationGg00670067g006700670067.getLongitude() != 0.0d)) {
                return lqlllll.y007900790079yyy(locationGg00670067g006700670067, false);
            }
        }
        return null;
    }

    public boolean gg006700670067006700670067() {
        return nnlllnn.nnnnlln.fffff0066f() && nnlllnn.nnnnlln.f0066fff0066f();
    }

    public void pause() {
        if (w0077wwwwww(this.t0074t0074t0074t) && this.t00740074tt0074t.get() && !this.ttt0074t0074t.get()) {
            g00670067g0067006700670067();
            lqlqqll.uuu007500750075u(t0074t00740074tt, "paused NON-FUSED location services");
            this.ttt0074t0074t.set(true);
        }
    }

    public void resume() {
        if (w0077wwwwww(this.t0074t0074t0074t) && this.t00740074tt0074t.get() && this.ttt0074t0074t.get()) {
            lqlqqll.uuu007500750075u(t0074t00740074tt, "resuming NON-FUSED location services");
            w0077w0077wwww();
            this.ttt0074t0074t.set(false);
        }
    }

    public void setLocation(jjxjxjj.GenericLocation genericLocation) {
        this.t007400740074t0074t = genericLocation;
    }

    public void unregister() {
        g00670067g0067006700670067();
        this.t0074tt00740074t = null;
    }

    public boolean w00770077wwwww() {
        return this.t00740074tt0074t.get();
    }

    public void w0077w0077wwww() {
        lqlqqqq lqlqqqqVar;
        lqlqqqq lqlqqqqVar2;
        String str;
        if (!w0077wwwwww(this.t0074t0074t0074t) || !this.t00740074tt0074t.get() || this.t0074tt00740074t == null) {
            return;
        }
        String str2 = t0074t00740074tt;
        lqlqqll.uuu007500750075u(str2, "rls");
        lqlqqll.llqqqll.u0075uu0075uu(str2, "registerLocationServices: low power " + this.ttttt0074t + " high power " + this.t0074ttt0074t + " with accuracy " + this.t0074007400740074tt);
        try {
            Object systemService = this.t0074t0074t0074t.getSystemService("location");
            if (systemService instanceof LocationManager) {
                LocationManager locationManager = (LocationManager) systemService;
                this.tttt00740074t = locationManager;
                if (w0077wwwwww(this.t0074t0074t0074t)) {
                    locationManager.removeUpdates(this.t0074tt00740074t);
                }
                Criteria criteria = new Criteria();
                criteria.setAccuracy(this.t0074007400740074tt);
                boolean zWw00770077wwww = false;
                criteria.setAltitudeRequired(false);
                criteria.setBearingAccuracy(0);
                criteria.setCostAllowed(false);
                criteria.setSpeedAccuracy(0);
                criteria.setSpeedRequired(false);
                criteria.setVerticalAccuracy(0);
                Criteria criteria2 = new Criteria();
                criteria2.setPowerRequirement(1);
                criteria2.setAccuracy(2);
                String bestProvider = locationManager.getBestProvider(criteria, true);
                if (bestProvider != null) {
                    lqlqqll.llqqqll.yy00790079007900790079(str2, "fine provider: ".concat(bestProvider));
                }
                String bestProvider2 = locationManager.getBestProvider(criteria2, true);
                if (bestProvider2 != null) {
                    lqlqqll.llqqqll.yy00790079007900790079(str2, "course provider: ".concat(bestProvider2));
                }
                if (bestProvider != null || bestProvider2 != null) {
                    Location locationGgg00670067006700670067 = w0077wwwwww(this.t0074t0074t0074t) ? ggg00670067006700670067() : null;
                    boolean zEquals = (bestProvider == null || bestProvider2 == null) ? false : bestProvider.equals(bestProvider2);
                    if (locationGgg00670067006700670067 != null) {
                        this.t0074tt00740074t.onLocationChanged(locationGgg00670067006700670067);
                    }
                    if (w0077wwwwww(this.t0074t0074t0074t)) {
                        lqlqqqqVar2 = this;
                        try {
                            lqlqqqqVar = lqlqqqqVar2;
                            zWw00770077wwww = lqlqqqqVar2.ww00770077wwww(locationManager, bestProvider2, 0L, criteria2, this.tt0074t00740074t.getLooper());
                        } catch (SecurityException e) {
                            e = e;
                            lqlqqqqVar = lqlqqqqVar2;
                            nlnnlnl.ddd0064d0064d(e, t0074t00740074tt);
                            lqlqqqqVar.tttt00740074t = null;
                            return;
                        } catch (Exception e2) {
                            e = e2;
                            lqlqqqqVar = lqlqqqqVar2;
                            lqlqqll.uuu007500750075u(t0074t00740074tt, e.toString());
                            lqlqqqqVar.tttt00740074t = null;
                            return;
                        }
                    } else {
                        lqlqqqqVar = this;
                    }
                    try {
                        if (w0077wwwwww(lqlqqqqVar.t0074t0074t0074t) && !zEquals && !zWw00770077wwww) {
                            lqlqqqqVar2 = lqlqqqqVar;
                            boolean zWw00770077wwww2 = lqlqqqqVar2.ww00770077wwww(locationManager, bestProvider, 0L, criteria, lqlqqqqVar.tt0074t00740074t.getLooper());
                            lqlqqqqVar = lqlqqqqVar2;
                            zWw00770077wwww = zWw00770077wwww2;
                        }
                        if (zWw00770077wwww) {
                            return;
                        }
                        lqlqqqqVar.tttt00740074t = null;
                        return;
                    } catch (SecurityException e3) {
                        e = e3;
                        nlnnlnl.ddd0064d0064d(e, t0074t00740074tt);
                        lqlqqqqVar.tttt00740074t = null;
                        return;
                    } catch (Exception e4) {
                        e = e4;
                        lqlqqll.uuu007500750075u(t0074t00740074tt, e.toString());
                        lqlqqqqVar.tttt00740074t = null;
                        return;
                    }
                }
                this.tttt00740074t = null;
                str = "Unable to find location provider, possibly incorrect permissions. Check that android.permission.ACCESS_COARSE_LOCATION or android.permission.ACCESS_FINE_LOCATION is set";
            } else {
                str = "Location Manager is not available";
            }
            lqlqqll.uuuu00750075u(str2, str);
        } catch (SecurityException e5) {
            e = e5;
            lqlqqqqVar = this;
        } catch (Exception e6) {
            e = e6;
            lqlqqqqVar = this;
        }
    }

    public boolean w0077wwwwww(Context context) {
        nnlllnn.nnnllln nnnlllnVar = new nnlllnn.nnnllln(context);
        return nnnlllnVar.fff006600660066f("android.permission.ACCESS_COARSE_LOCATION", this.tt00740074t0074t) || nnnlllnVar.fff006600660066f("android.permission.ACCESS_FINE_LOCATION", this.tt00740074t0074t);
    }

    public boolean ww0077wwwww() {
        return (!gg006700670067006700670067() || this.tttt00740074t == null || this.t0074tt00740074t == null) ? false : true;
    }
}
