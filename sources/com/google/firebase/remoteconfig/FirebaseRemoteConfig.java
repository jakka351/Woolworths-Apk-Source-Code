package com.google.firebase.remoteconfig;

import androidx.camera.core.processing.f;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigAutoFetch;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FirebaseRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseABTesting f15755a;
    public final Executor b;
    public final ConfigCacheClient c;
    public final ConfigCacheClient d;
    public final ConfigCacheClient e;
    public final ConfigFetchHandler f;
    public final ConfigGetParameterHandler g;
    public final ConfigSharedPrefsClient h;
    public final FirebaseInstallationsApi i;
    public final ConfigRealtimeHandler j;
    public final RolloutsStateSubscriptionsHandler k;

    public FirebaseRemoteConfig(FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigSharedPrefsClient configSharedPrefsClient, ConfigRealtimeHandler configRealtimeHandler, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        this.i = firebaseInstallationsApi;
        this.f15755a = firebaseABTesting;
        this.b = executor;
        this.c = configCacheClient;
        this.d = configCacheClient2;
        this.e = configCacheClient3;
        this.f = configFetchHandler;
        this.g = configGetParameterHandler;
        this.h = configSharedPrefsClient;
        this.j = configRealtimeHandler;
        this.k = rolloutsStateSubscriptionsHandler;
    }

    public static ArrayList f(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final Task a() {
        Task taskB = this.c.b();
        Task taskB2 = this.d.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(this.b, new f(10, this, taskB, taskB2));
    }

    public final Task b() {
        ConfigFetchHandler configFetchHandler = this.f;
        long j = configFetchHandler.h.f15770a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.j);
        HashMap map = new HashMap(configFetchHandler.i);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return configFetchHandler.f.b().continueWithTask(configFetchHandler.c, new d(configFetchHandler, j, map)).onSuccessTask(FirebaseExecutors.a(), new androidx.compose.ui.graphics.colorspace.a(29));
    }

    public final HashMap c() {
        HashSet hashSet = new HashSet();
        ConfigGetParameterHandler configGetParameterHandler = this.g;
        hashSet.addAll(ConfigGetParameterHandler.a(configGetParameterHandler.c));
        hashSet.addAll(ConfigGetParameterHandler.a(configGetParameterHandler.d));
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            map.put(str, configGetParameterHandler.b(str));
        }
        return map;
    }

    public final FirebaseRemoteConfigInfoImpl d() {
        FirebaseRemoteConfigInfoImpl firebaseRemoteConfigInfoImpl;
        ConfigSharedPrefsClient configSharedPrefsClient = this.h;
        synchronized (configSharedPrefsClient.b) {
            try {
                configSharedPrefsClient.f15770a.getLong("last_fetch_time_in_millis", -1L);
                int i = configSharedPrefsClient.f15770a.getInt("last_fetch_status", 0);
                long j = ConfigFetchHandler.j;
                long j2 = configSharedPrefsClient.f15770a.getLong("fetch_timeout_in_seconds", 60L);
                if (j2 < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j2)));
                }
                long j3 = configSharedPrefsClient.f15770a.getLong("minimum_fetch_interval_in_seconds", j);
                if (j3 < 0) {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j3 + " is an invalid argument");
                }
                firebaseRemoteConfigInfoImpl = new FirebaseRemoteConfigInfoImpl(i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return firebaseRemoteConfigInfoImpl;
    }

    public final void e(boolean z) {
        HttpURLConnection httpURLConnection;
        ConfigRealtimeHandler configRealtimeHandler = this.j;
        synchronized (configRealtimeHandler) {
            ConfigRealtimeHttpClient configRealtimeHttpClient = configRealtimeHandler.b;
            synchronized (configRealtimeHttpClient.r) {
                try {
                    configRealtimeHttpClient.e = z;
                    ConfigAutoFetch configAutoFetch = configRealtimeHttpClient.g;
                    if (configAutoFetch != null) {
                        configAutoFetch.j = z;
                    }
                    if (z && (httpURLConnection = configRealtimeHttpClient.f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                configRealtimeHandler.a();
            }
        }
    }
}
