package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class ConfigRealtimeHandler {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f15767a;
    public final ConfigRealtimeHttpClient b;
    public final FirebaseInstallationsApi c;
    public final ScheduledExecutorService d;

    public class ConfigUpdateListenerRegistrationInternal implements ConfigUpdateListenerRegistration {
    }

    public ConfigRealtimeHandler(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, ConfigSharedPrefsClient configSharedPrefsClient, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f15767a = linkedHashSet;
        this.b = new ConfigRealtimeHttpClient(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, str, linkedHashSet, configSharedPrefsClient, scheduledExecutorService);
        this.c = firebaseInstallationsApi;
        this.d = scheduledExecutorService;
    }

    public final synchronized void a() {
        if (!this.f15767a.isEmpty()) {
            this.b.e(0L);
        }
    }
}
