package com.salesforce.marketingcloud.proximity;

import android.app.Application;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.internal.h;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.altbeacon.beacon.BeaconConsumer;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Identifier;
import org.altbeacon.beacon.MonitorNotifier;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.powersave.BackgroundPowerSaver;

/* loaded from: classes6.dex */
class a implements BeaconConsumer, MonitorNotifier {

    @VisibleForTesting
    static final String k = "m:0-3=4c000215,i:4-19,i:20-21,i:22-23,p:24-24";
    static final int l = 121;
    static final String m = "0ahUKEwj";

    /* renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    final Map<String, Region> f17029a;
    private final BeaconManager b;
    private final Context c;
    private final List<c> d;
    final LocalBroadcastManager e;
    private boolean f;
    private boolean g;
    private BackgroundPowerSaver h;
    private Intent i;
    private final ProximityNotificationCustomizationOptions j;

    /* renamed from: com.salesforce.marketingcloud.proximity.a$a, reason: collision with other inner class name */
    public class C0375a implements MarketingCloudSdk.WhenReadyListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f17030a;

        public C0375a(Intent intent) {
            this.f17030a = intent;
        }

        @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
        public void ready(@NonNull MarketingCloudSdk marketingCloudSdk) {
            a.this.e.c(this.f17030a);
        }
    }

    public a(Context context) {
        this(context, null);
    }

    private void a() {
        String str = e.h;
        g.d(str, "clearAllMonitoredRegions", new Object[0]);
        if (this.f17029a.isEmpty()) {
            return;
        }
        g.d(str, "Stop monitoring %d BeaconRegions", Integer.valueOf(this.f17029a.size()));
        for (Region region : this.f17029a.values()) {
            if (region != null) {
                b(region);
            }
        }
        this.f17029a.clear();
    }

    private void b() {
        this.g = true;
        this.b.bind(this);
        g.a(e.h, "Waiting for BeaconService connection", new Object[0]);
    }

    private void c() {
        g.d(e.h, "monitorNewRegions", new Object[0]);
        if (this.d.isEmpty()) {
            return;
        }
        for (c cVar : this.d) {
            if (this.f17029a.containsKey(cVar.f())) {
                g.d(e.h, "Region [%s] already monitored by SDK", cVar);
            } else {
                Region regionA = a(cVar);
                this.f17029a.put(cVar.f(), regionA);
                g.d(e.h, "Now monitoring [%s]", cVar.toString());
                this.b.startMonitoring(regionA);
            }
        }
        this.d.clear();
    }

    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        this.i = intent;
        this.c.startService(intent);
        return this.c.bindService(intent, serviceConnection, i);
    }

    public void d() {
        g.a(e.h, "stopMonitoring()", new Object[0]);
        synchronized (this.d) {
            try {
                if (this.f) {
                    a();
                    this.b.unbind(this);
                    this.b.removeMonitorNotifier(this);
                    if (this.h != null) {
                        ((Application) this.c.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.h);
                    }
                    this.f = false;
                } else {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void didDetermineStateForRegion(int i, Region region) {
        String str = e.h;
        g.d(str, "didDetermineStateForRegion(%d, %s)", Integer.valueOf(i), region);
        if (!MarketingCloudSdk.isReady() && !MarketingCloudSdk.isInitializing()) {
            g.e(str, "MarketingCloudSdk#init must be called in your application's onCreate", new Object[0]);
            return;
        }
        Intent intentPutExtra = new Intent(i == 1 ? e.d : e.e).putExtra(e.f, a(region));
        if (MarketingCloudSdk.isReady()) {
            this.e.c(intentPutExtra);
        } else {
            MarketingCloudSdk.requestSdk(new C0375a(intentPutExtra));
        }
    }

    public void didEnterRegion(Region region) {
        g.d(e.h, "didEnterRegion(%s)", region);
    }

    public void didExitRegion(Region region) {
        g.d(e.h, "didExitRegion(%s)", region);
    }

    public Context getApplicationContext() {
        return this.c;
    }

    public void onBeaconServiceConnect() {
        g.a(e.h, "onBeaconServiceConnect", new Object[0]);
        synchronized (this.d) {
            this.h = new BackgroundPowerSaver(this.c);
            this.b.addMonitorNotifier(this);
            this.f = true;
            this.g = false;
            c();
        }
    }

    public void unbindService(ServiceConnection serviceConnection) {
        this.c.unbindService(serviceConnection);
        this.c.stopService(this.i);
        this.f = false;
        this.g = false;
    }

    public a(Context context, @Nullable ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions) {
        this.f17029a = new ArrayMap(0);
        this.d = new ArrayList();
        this.c = context;
        this.e = LocalBroadcastManager.a(context);
        BeaconManager instanceForApplication = BeaconManager.getInstanceForApplication(context);
        this.b = instanceForApplication;
        this.j = proximityNotificationCustomizationOptions;
        instanceForApplication.getBeaconParsers().add(new BeaconParser("iBeacon").setBeaconLayout(k));
        instanceForApplication.setBackgroundScanPeriod(5000L);
        instanceForApplication.setBackgroundBetweenScanPeriod(10000L);
        instanceForApplication.addMonitorNotifier(this);
    }

    private void a(ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions) {
        if (proximityNotificationCustomizationOptions != null) {
            com.salesforce.marketingcloud.notifications.c cVar = new com.salesforce.marketingcloud.notifications.c(proximityNotificationCustomizationOptions.getSmallIconResId(), proximityNotificationCustomizationOptions.getChannelIdProvider());
            HashMap map = new HashMap();
            map.put("alert", "Searching for available beacons ...");
            map.put(NotificationMessage.NOTIF_KEY_ID, m);
            Notification notificationB = cVar.setupNotificationBuilder(this.c, h.a(map)).b();
            if (this.b.isAnyConsumerBound()) {
                return;
            }
            this.b.enableForegroundServiceScanning(notificationB, 121);
        }
    }

    public void b(@NonNull List<c> list) {
        g.a(e.h, "unmonitorBeaconRegions() - [%d regions]", Integer.valueOf(list.size()));
        if (list.isEmpty()) {
            return;
        }
        for (c cVar : list) {
            this.f17029a.remove(cVar.f());
            b(a(cVar));
        }
    }

    private void b(Region region) {
        try {
            this.b.stopMonitoring(region);
        } catch (Exception e) {
            g.a(e.h, e, "Failed to stop monitoring %s", region);
        }
    }

    public void a(@NonNull List<c> list) {
        String str = e.h;
        g.a(str, "monitorBeaconRegions() - [%d regions]", Integer.valueOf(list.size()));
        a(this.j);
        this.b.addMonitorNotifier(this);
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.d) {
            try {
                this.d.clear();
                this.d.addAll(list);
                if (this.f) {
                    c();
                } else {
                    g.d(str, "Not yet connected.  Will register Beacons once complete.", new Object[0]);
                    if (!this.g) {
                        b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static c a(Region region) {
        try {
            return new c(region.getUniqueId(), region.getId1().toString(), region.getId2().toInt(), region.getId3().toInt());
        } catch (Exception e) {
            g.b(e.h, e, "Unable to convert Region to BeaconRegion", new Object[0]);
            return null;
        }
    }

    @VisibleForTesting
    public static Region a(c cVar) {
        return new Region(cVar.f(), Identifier.fromUuid(UUID.fromString(cVar.e())), Identifier.fromInt(cVar.g()), Identifier.fromInt(cVar.h()));
    }
}
