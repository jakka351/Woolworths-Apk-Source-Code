package com.google.firebase.perf.transport;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.ConfigurationConstants;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.firebase.perf.v1.ApplicationInfo;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ TransportManager e;

    public /* synthetic */ a(TransportManager transportManager, int i) {
        this.d = i;
        this.e = transportManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConfigurationConstants.LogSourceName logSourceName;
        String str;
        switch (this.d) {
            case 0:
                TransportManager transportManager = this.e;
                RateLimiter rateLimiter = transportManager.o;
                boolean z = transportManager.t;
                rateLimiter.d.a(z);
                rateLimiter.e.a(z);
                return;
            default:
                final TransportManager transportManager2 = this.e;
                FirebaseApp firebaseApp = transportManager2.g;
                firebaseApp.a();
                Context context = firebaseApp.f15169a;
                transportManager2.m = context;
                transportManager2.r = context.getPackageName();
                transportManager2.n = ConfigResolver.e();
                transportManager2.o = new RateLimiter(transportManager2.m, new Rate(100L, 1L, TimeUnit.MINUTES));
                transportManager2.p = AppStateMonitor.a();
                Provider provider = transportManager2.j;
                ConfigResolver configResolver = transportManager2.n;
                configResolver.getClass();
                ConfigurationConstants.LogSourceName logSourceName2 = ConfigurationConstants.LogSourceName.f15675a;
                synchronized (ConfigurationConstants.LogSourceName.class) {
                    try {
                        if (ConfigurationConstants.LogSourceName.f15675a == null) {
                            ConfigurationConstants.LogSourceName.f15675a = new ConfigurationConstants.LogSourceName();
                        }
                        logSourceName = ConfigurationConstants.LogSourceName.f15675a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                logSourceName.getClass();
                Long l = (Long) configResolver.f15670a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l.getClass();
                Map map = ConfigurationConstants.LogSourceName.b;
                if (!map.containsKey(l) || (str = (String) map.get(l)) == null) {
                    Optional optionalD = configResolver.d(logSourceName);
                    str = optionalD.b() ? (String) optionalD.a() : "FIREPERF";
                } else {
                    configResolver.c.f("com.google.firebase.perf.LogSourceName", str);
                }
                transportManager2.k = new FlgTransport(provider, str);
                ConcurrentLinkedQueue concurrentLinkedQueue = transportManager2.e;
                AppStateMonitor appStateMonitor = transportManager2.p;
                WeakReference weakReference = new WeakReference(TransportManager.v);
                synchronized (appStateMonitor.i) {
                    appStateMonitor.i.add(weakReference);
                }
                ApplicationInfo.Builder builderW = ApplicationInfo.W();
                transportManager2.q = builderW;
                FirebaseApp firebaseApp2 = transportManager2.g;
                firebaseApp2.a();
                String str2 = firebaseApp2.c.b;
                builderW.p();
                ApplicationInfo.L((ApplicationInfo) builderW.e, str2);
                AndroidApplicationInfo.Builder builderR = AndroidApplicationInfo.R();
                String str3 = transportManager2.r;
                builderR.p();
                AndroidApplicationInfo.L((AndroidApplicationInfo) builderR.e, str3);
                builderR.p();
                AndroidApplicationInfo.M((AndroidApplicationInfo) builderR.e);
                Context context2 = transportManager2.m;
                String str4 = "";
                try {
                    String str5 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str5 != null) {
                        str4 = str5;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                builderR.p();
                AndroidApplicationInfo.N((AndroidApplicationInfo) builderR.e, str4);
                builderW.p();
                ApplicationInfo.P((ApplicationInfo) builderW.e, (AndroidApplicationInfo) builderR.m());
                transportManager2.f.set(true);
                while (!concurrentLinkedQueue.isEmpty()) {
                    final PendingPerfEvent pendingPerfEvent = (PendingPerfEvent) concurrentLinkedQueue.poll();
                    if (pendingPerfEvent != null) {
                        transportManager2.l.execute(new Runnable() { // from class: com.google.firebase.perf.transport.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                AndroidLogger androidLogger = TransportManager.u;
                                TransportManager transportManager3 = transportManager2;
                                transportManager3.getClass();
                                PendingPerfEvent pendingPerfEvent2 = pendingPerfEvent;
                                transportManager3.d(pendingPerfEvent2.f15717a, pendingPerfEvent2.b);
                            }
                        });
                    }
                }
                return;
        }
    }
}
