package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import coil3.decode.d;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
/* loaded from: classes.dex */
public class RemoteConfigComponent implements FirebaseRemoteConfigInterop {
    public static final Clock j = DefaultClock.getInstance();
    public static final Random k = new Random();
    public static final HashMap l = new HashMap();
    public final Context b;
    public final ScheduledExecutorService c;
    public final FirebaseApp d;
    public final FirebaseInstallationsApi e;
    public final FirebaseABTesting f;
    public final Provider g;
    public final String h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15756a = new HashMap();
    public final HashMap i = new HashMap();

    public static class GlobalBackgroundListener implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public static final AtomicReference f15757a = new AtomicReference();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z) {
            Clock clock = RemoteConfigComponent.j;
            synchronized (RemoteConfigComponent.class) {
                Iterator it = RemoteConfigComponent.l.values().iterator();
                while (it.hasNext()) {
                    ((FirebaseRemoteConfig) it.next()).e(z);
                }
            }
        }
    }

    public RemoteConfigComponent(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider provider) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = firebaseApp;
        this.e = firebaseInstallationsApi;
        this.f = firebaseABTesting;
        this.g = provider;
        firebaseApp.a();
        this.h = firebaseApp.c.b;
        AtomicReference atomicReference = GlobalBackgroundListener.f15757a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = GlobalBackgroundListener.f15757a;
        if (atomicReference2.get() == null) {
            GlobalBackgroundListener globalBackgroundListener = new GlobalBackgroundListener();
            while (true) {
                if (atomicReference2.compareAndSet(null, globalBackgroundListener)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(globalBackgroundListener);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        Tasks.call(scheduledExecutorService, new d(this, 1));
    }

    @Override // com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop
    public final void a(RolloutsStateSubscriber rolloutsStateSubscriber) {
        RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = c("firebase").k;
        rolloutsStateSubscriptionsHandler.d.add(rolloutsStateSubscriber);
        Task taskB = rolloutsStateSubscriptionsHandler.f15778a.b();
        taskB.addOnSuccessListener(rolloutsStateSubscriptionsHandler.c, new com.adobe.marketing.mobile.launch.rulesengine.download.a(3, rolloutsStateSubscriptionsHandler, taskB, rolloutsStateSubscriber));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.firebase.remoteconfig.FirebaseRemoteConfig b(com.google.firebase.FirebaseApp r14, java.lang.String r15, com.google.firebase.installations.FirebaseInstallationsApi r16, com.google.firebase.abt.FirebaseABTesting r17, java.util.concurrent.Executor r18, com.google.firebase.remoteconfig.internal.ConfigCacheClient r19, com.google.firebase.remoteconfig.internal.ConfigCacheClient r20, com.google.firebase.remoteconfig.internal.ConfigCacheClient r21, com.google.firebase.remoteconfig.internal.ConfigFetchHandler r22, com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler r23, com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient r24, com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler r25) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.util.HashMap r0 = r13.f15756a     // Catch: java.lang.Throwable -> L67
            boolean r0 = r0.containsKey(r15)     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L6e
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r9 = new com.google.firebase.remoteconfig.FirebaseRemoteConfig     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "firebase"
            boolean r0 = r15.equals(r0)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L23
            r14.a()     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = r14.b     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = "[DEFAULT]"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L23
            r10 = r17
            goto L25
        L23:
            r0 = 0
            r10 = r0
        L25:
            android.content.Context r5 = r13.b     // Catch: java.lang.Throwable -> L67
            monitor-enter(r13)     // Catch: java.lang.Throwable -> L67
            com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler r11 = new com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler     // Catch: java.lang.Throwable -> L6a
            java.util.concurrent.ScheduledExecutorService r8 = r13.c     // Catch: java.lang.Throwable -> L6a
            r1 = r14
            r6 = r15
            r2 = r16
            r4 = r20
            r3 = r22
            r7 = r24
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6a
            r11 = r0
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L67
            r2 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r12 = r25
            r1 = r9
            r3 = r10
            r9 = r23
            r10 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L67
            r20.b()     // Catch: java.lang.Throwable -> L67
            r21.b()     // Catch: java.lang.Throwable -> L67
            r19.b()     // Catch: java.lang.Throwable -> L67
            java.util.HashMap r0 = r13.f15756a     // Catch: java.lang.Throwable -> L67
            r0.put(r15, r1)     // Catch: java.lang.Throwable -> L67
            java.util.HashMap r0 = com.google.firebase.remoteconfig.RemoteConfigComponent.l     // Catch: java.lang.Throwable -> L67
            r0.put(r15, r1)     // Catch: java.lang.Throwable -> L67
            goto L6e
        L67:
            r0 = move-exception
            r14 = r0
            goto L78
        L6a:
            r0 = move-exception
            r14 = r0
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L6a
            throw r14     // Catch: java.lang.Throwable -> L67
        L6e:
            java.util.HashMap r0 = r13.f15756a     // Catch: java.lang.Throwable -> L67
            java.lang.Object r14 = r0.get(r15)     // Catch: java.lang.Throwable -> L67
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r14 = (com.google.firebase.remoteconfig.FirebaseRemoteConfig) r14     // Catch: java.lang.Throwable -> L67
            monitor-exit(r13)
            return r14
        L78:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L67
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.RemoteConfigComponent.b(com.google.firebase.FirebaseApp, java.lang.String, com.google.firebase.installations.FirebaseInstallationsApi, com.google.firebase.abt.FirebaseABTesting, java.util.concurrent.Executor, com.google.firebase.remoteconfig.internal.ConfigCacheClient, com.google.firebase.remoteconfig.internal.ConfigCacheClient, com.google.firebase.remoteconfig.internal.ConfigCacheClient, com.google.firebase.remoteconfig.internal.ConfigFetchHandler, com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler, com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient, com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler):com.google.firebase.remoteconfig.FirebaseRemoteConfig");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.firebase.remoteconfig.FirebaseRemoteConfig c(java.lang.String r15) throws java.lang.Throwable {
        /*
            r14 = this;
            monitor-enter(r14)
            java.lang.String r0 = "fetch"
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r7 = r14.d(r15, r0)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = "activate"
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r8 = r14.d(r15, r0)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = "defaults"
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r9 = r14.d(r15, r0)     // Catch: java.lang.Throwable -> Lb5
            android.content.Context r0 = r14.b     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = r14.h     // Catch: java.lang.Throwable -> Lb5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r3 = "frc_"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb5
            r2.append(r1)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = "_"
            r2.append(r1)     // Catch: java.lang.Throwable -> Lb5
            r2.append(r15)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = "_settings"
            r2.append(r1)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lb5
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> Lb5
            com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient r12 = new com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient     // Catch: java.lang.Throwable -> Lb5
            r12.<init>(r0)     // Catch: java.lang.Throwable -> Lb5
            com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler r11 = new com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler     // Catch: java.lang.Throwable -> Lb5
            java.util.concurrent.ScheduledExecutorService r0 = r14.c     // Catch: java.lang.Throwable -> Lb5
            r11.<init>(r0, r8, r9)     // Catch: java.lang.Throwable -> Lb5
            com.google.firebase.FirebaseApp r0 = r14.d     // Catch: java.lang.Throwable -> Lb5
            com.google.firebase.inject.Provider r1 = r14.g     // Catch: java.lang.Throwable -> Lb5
            r0.a()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = r0.b     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r2 = "[DEFAULT]"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto L62
            java.lang.String r0 = "firebase"
            boolean r0 = r15.equals(r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L62
            com.google.firebase.remoteconfig.internal.Personalization r0 = new com.google.firebase.remoteconfig.internal.Personalization     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7a
            goto L63
        L62:
            r0 = 0
        L63:
            if (r0 == 0) goto L7d
            com.google.firebase.remoteconfig.b r1 = new com.google.firebase.remoteconfig.b     // Catch: java.lang.Throwable -> L7a
            r1.<init>()     // Catch: java.lang.Throwable -> L7a
            java.util.HashSet r2 = r11.f15766a     // Catch: java.lang.Throwable -> L7a
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L7a
            java.util.HashSet r0 = r11.f15766a     // Catch: java.lang.Throwable -> L74
            r0.add(r1)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L74
            goto L7d
        L74:
            r0 = move-exception
            r15 = r0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L74
            throw r15     // Catch: java.lang.Throwable -> L7a
        L78:
            r1 = r14
            goto Lb8
        L7a:
            r0 = move-exception
            r15 = r0
            goto L78
        L7d:
            com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory r0 = new com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory     // Catch: java.lang.Throwable -> Lb5
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5
            r0.f15777a = r8     // Catch: java.lang.Throwable -> Lb5
            r0.b = r9     // Catch: java.lang.Throwable -> Lb5
            com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler r13 = new com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler     // Catch: java.lang.Throwable -> Lb5
            java.util.concurrent.ScheduledExecutorService r1 = r14.c     // Catch: java.lang.Throwable -> Lb5
            r13.<init>()     // Catch: java.lang.Throwable -> Lb5
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> Lb5
            r2.<init>()     // Catch: java.lang.Throwable -> Lb5
            java.util.Set r2 = java.util.Collections.newSetFromMap(r2)     // Catch: java.lang.Throwable -> Lb5
            r13.d = r2     // Catch: java.lang.Throwable -> Lb5
            r13.f15778a = r8     // Catch: java.lang.Throwable -> Lb5
            r13.b = r0     // Catch: java.lang.Throwable -> Lb5
            r13.c = r1     // Catch: java.lang.Throwable -> Lb5
            com.google.firebase.FirebaseApp r2 = r14.d     // Catch: java.lang.Throwable -> Lb5
            com.google.firebase.installations.FirebaseInstallationsApi r4 = r14.e     // Catch: java.lang.Throwable -> Lb5
            com.google.firebase.abt.FirebaseABTesting r5 = r14.f     // Catch: java.lang.Throwable -> Lb5
            java.util.concurrent.ScheduledExecutorService r6 = r14.c     // Catch: java.lang.Throwable -> Lb5
            com.google.firebase.remoteconfig.internal.ConfigFetchHandler r10 = r14.e(r15, r7, r12)     // Catch: java.lang.Throwable -> Lb5
            r1 = r14
            r3 = r15
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r15 = r1.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r14)
            return r15
        Lb2:
            r0 = move-exception
        Lb3:
            r15 = r0
            goto Lb8
        Lb5:
            r0 = move-exception
            r1 = r14
            goto Lb3
        Lb8:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lb2
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.RemoteConfigComponent.c(java.lang.String):com.google.firebase.remoteconfig.FirebaseRemoteConfig");
    }

    public final ConfigCacheClient d(String str, String str2) {
        ConfigStorageClient configStorageClient;
        ConfigCacheClient configCacheClient;
        String strO = YU.a.o(YU.a.v("frc_", this.h, "_", str, "_"), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.c;
        Context context = this.b;
        HashMap map = ConfigStorageClient.c;
        synchronized (ConfigStorageClient.class) {
            try {
                HashMap map2 = ConfigStorageClient.c;
                if (!map2.containsKey(strO)) {
                    map2.put(strO, new ConfigStorageClient(context, strO));
                }
                configStorageClient = (ConfigStorageClient) map2.get(strO);
            } finally {
            }
        }
        HashMap map3 = ConfigCacheClient.d;
        synchronized (ConfigCacheClient.class) {
            try {
                String str3 = configStorageClient.b;
                HashMap map4 = ConfigCacheClient.d;
                if (!map4.containsKey(str3)) {
                    map4.put(str3, new ConfigCacheClient(scheduledExecutorService, configStorageClient));
                }
                configCacheClient = (ConfigCacheClient) map4.get(str3);
            } finally {
            }
        }
        return configCacheClient;
    }

    public final synchronized ConfigFetchHandler e(String str, ConfigCacheClient configCacheClient, ConfigSharedPrefsClient configSharedPrefsClient) {
        FirebaseInstallationsApi firebaseInstallationsApi;
        Provider bVar;
        ScheduledExecutorService scheduledExecutorService;
        Clock clock;
        Random random;
        String str2;
        FirebaseApp firebaseApp;
        try {
            firebaseInstallationsApi = this.e;
            FirebaseApp firebaseApp2 = this.d;
            firebaseApp2.a();
            bVar = firebaseApp2.b.equals("[DEFAULT]") ? this.g : new com.google.firebase.components.b(5);
            scheduledExecutorService = this.c;
            clock = j;
            random = k;
            FirebaseApp firebaseApp3 = this.d;
            firebaseApp3.a();
            str2 = firebaseApp3.c.f15172a;
            firebaseApp = this.d;
            firebaseApp.a();
        } catch (Throwable th) {
            throw th;
        }
        return new ConfigFetchHandler(firebaseInstallationsApi, bVar, scheduledExecutorService, clock, random, configCacheClient, new ConfigFetchHttpClient(this.b, firebaseApp.c.b, str2, str, configSharedPrefsClient.f15770a.getLong("fetch_timeout_in_seconds", 60L), configSharedPrefsClient.f15770a.getLong("fetch_timeout_in_seconds", 60L)), configSharedPrefsClient, this.i);
    }
}
