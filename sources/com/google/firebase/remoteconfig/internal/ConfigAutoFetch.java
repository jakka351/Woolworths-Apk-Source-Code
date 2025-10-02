package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ConfigAutoFetch {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f15759a;
    public final HttpURLConnection b;
    public final ConfigFetchHandler c;
    public final ConfigCacheClient d;
    public final ConfigUpdateListener e;
    public final ScheduledExecutorService f;
    public final ConfigSharedPrefsClient i;
    public final Random g = new Random();
    public boolean j = false;
    public final Clock h = DefaultClock.getInstance();

    public ConfigAutoFetch(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, LinkedHashSet linkedHashSet, ConfigUpdateListener configUpdateListener, ScheduledExecutorService scheduledExecutorService, ConfigSharedPrefsClient configSharedPrefsClient) {
        this.b = httpURLConnection;
        this.c = configFetchHandler;
        this.d = configCacheClient;
        this.f15759a = linkedHashSet;
        this.e = configUpdateListener;
        this.f = scheduledExecutorService;
        this.i = configSharedPrefsClient;
    }

    public final void a(final int i, final long j) {
        if (i == 0) {
            d(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template."));
            return;
        }
        this.f.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigAutoFetch.1
            @Override // java.lang.Runnable
            public final void run() {
                final ConfigAutoFetch configAutoFetch = ConfigAutoFetch.this;
                int i2 = i;
                final long j2 = j;
                synchronized (configAutoFetch) {
                    final int i3 = i2 - 1;
                    final Task taskC = configAutoFetch.c.c(3 - i3);
                    final Task taskB = configAutoFetch.d.b();
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskB}).continueWithTask(configAutoFetch.f, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.a
                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task) throws JSONException {
                            Boolean boolValueOf;
                            ConfigAutoFetch configAutoFetch2 = configAutoFetch;
                            Task task2 = taskC;
                            Task task3 = taskB;
                            long j3 = j2;
                            int i4 = i3;
                            if (!task2.isSuccessful()) {
                                return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task2.getException()));
                            }
                            if (!task3.isSuccessful()) {
                                return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task3.getException()));
                            }
                            ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) task2.getResult();
                            ConfigContainer configContainerA = (ConfigContainer) task3.getResult();
                            ConfigContainer configContainer = fetchResponse.b;
                            if (configContainer != null) {
                                boolValueOf = Boolean.valueOf(configContainer.f >= j3);
                            } else {
                                boolValueOf = Boolean.valueOf(fetchResponse.f15764a == 1);
                            }
                            if (!boolValueOf.booleanValue()) {
                                Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                                configAutoFetch2.a(i4, j3);
                                return Tasks.forResult(null);
                            }
                            if (fetchResponse.b == null) {
                                Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                                return Tasks.forResult(null);
                            }
                            if (configContainerA == null) {
                                configContainerA = ConfigContainer.c().a();
                            }
                            ConfigContainer configContainer2 = fetchResponse.b;
                            JSONObject jSONObject = configContainerA.e;
                            JSONObject jSONObject2 = configContainer2.f15761a;
                            JSONObject jSONObject3 = configContainer2.b;
                            JSONObject jSONObject4 = configContainer2.e;
                            JSONObject jSONObject5 = ConfigContainer.a(new JSONObject(jSONObject2.toString())).b;
                            HashMap mapB = configContainerA.b();
                            HashMap mapB2 = configContainer2.b();
                            HashSet hashSet = new HashSet();
                            JSONObject jSONObject6 = configContainerA.b;
                            Iterator<String> itKeys = jSONObject6.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (!jSONObject3.has(next)) {
                                    hashSet.add(next);
                                } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                                    hashSet.add(next);
                                } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                                    hashSet.add(next);
                                } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                                    hashSet.add(next);
                                } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                                    hashSet.add(next);
                                } else if (mapB.containsKey(next) && mapB2.containsKey(next) && !((Map) mapB.get(next)).equals(mapB2.get(next))) {
                                    hashSet.add(next);
                                } else {
                                    jSONObject5.remove(next);
                                }
                            }
                            Iterator<String> itKeys2 = jSONObject5.keys();
                            while (itKeys2.hasNext()) {
                                hashSet.add(itKeys2.next());
                            }
                            if (hashSet.isEmpty()) {
                                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                                return Tasks.forResult(null);
                            }
                            ConfigUpdate configUpdateA = ConfigUpdate.a(hashSet);
                            synchronized (configAutoFetch2) {
                                Iterator it = configAutoFetch2.f15759a.iterator();
                                while (it.hasNext()) {
                                    ((ConfigUpdateListener) it.next()).a(configUpdateA);
                                }
                            }
                            return Tasks.forResult(null);
                        }
                    });
                }
            }
        }, this.g.nextInt(4), TimeUnit.SECONDS);
    }

    public final void b(InputStream inputStream) throws JSONException, IOException {
        JSONObject jSONObject;
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strG = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strG = YU.a.g(strG, line);
            if (line.contains("}")) {
                int iIndexOf = strG.indexOf(123);
                int iLastIndexOf = strG.lastIndexOf(125);
                strG = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strG.substring(iIndexOf, iLastIndexOf + 1);
                if (!strG.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(strG);
                    } catch (JSONException e) {
                        d(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e.getCause()));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        ((ConfigRealtimeHttpClient.AnonymousClass2) this.e).b(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes."));
                        break;
                    }
                    synchronized (this) {
                        zIsEmpty = this.f15759a.isEmpty();
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j = this.c.h.f15770a.getLong("last_template_version", 0L);
                        long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j2 > j) {
                            a(3, j2);
                        }
                    }
                    if (jSONObject.has("retryIntervalSeconds")) {
                        e(jSONObject.getInt("retryIntervalSeconds"));
                    }
                    strG = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    public final void c() throws IOException {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStreamA = null;
        try {
            try {
                try {
                    inputStreamA = Callback.a(httpURLConnection);
                    b(inputStreamA);
                    if (inputStreamA != null) {
                        inputStreamA.close();
                    }
                } catch (IOException e) {
                    if (!this.j) {
                        Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e);
                    }
                    if (inputStreamA != null) {
                        inputStreamA.close();
                    }
                }
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e2);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStreamA.close();
                } catch (IOException e3) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e3);
                }
            }
            throw th;
        }
    }

    public final synchronized void d(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f15759a.iterator();
        while (it.hasNext()) {
            ((ConfigUpdateListener) it.next()).b(firebaseRemoteConfigException);
        }
    }

    public final synchronized void e(int i) {
        Date date = new Date(new Date(this.h.currentTimeMillis()).getTime() + (i * 1000));
        ConfigSharedPrefsClient configSharedPrefsClient = this.i;
        synchronized (configSharedPrefsClient.d) {
            configSharedPrefsClient.f15770a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
