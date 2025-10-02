package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.util.Log;
import androidx.work.d;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class ConfigRealtimeHttpClient {
    public static final int[] s = {2, 4, 8, 16, 32, 64, 128, 256};
    public static final Pattern t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f15768a;
    public int c;
    public HttpURLConnection f;
    public ConfigAutoFetch g;
    public final ScheduledExecutorService h;
    public final ConfigFetchHandler i;
    public final FirebaseApp j;
    public final FirebaseInstallationsApi k;
    public final ConfigCacheClient l;
    public final Context m;
    public final String n;
    public final ConfigSharedPrefsClient q;
    public boolean b = false;
    public final Random o = new Random();
    public final Clock p = DefaultClock.getInstance();
    public boolean d = false;
    public boolean e = false;
    public final Object r = new Object();

    /* renamed from: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$2, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass2 implements ConfigUpdateListener {
        public AnonymousClass2() {
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
        public final void a(ConfigUpdate configUpdate) {
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
        public final void b(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            ConfigRealtimeHttpClient configRealtimeHttpClient = ConfigRealtimeHttpClient.this;
            int[] iArr = ConfigRealtimeHttpClient.s;
            synchronized (configRealtimeHttpClient) {
                configRealtimeHttpClient.d = true;
            }
            ConfigRealtimeHttpClient.this.g(firebaseRemoteConfigException);
        }
    }

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, LinkedHashSet linkedHashSet, ConfigSharedPrefsClient configSharedPrefsClient, ScheduledExecutorService scheduledExecutorService) {
        this.f15768a = linkedHashSet;
        this.h = scheduledExecutorService;
        this.c = Math.max(8 - configSharedPrefsClient.c().f15772a, 1);
        this.j = firebaseApp;
        this.i = configFetchHandler;
        this.k = firebaseInstallationsApi;
        this.l = configCacheClient;
        this.m = context;
        this.n = str;
        this.q = configSharedPrefsClient;
    }

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashSet r0 = r1.f15768a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.a():boolean");
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null && !this.e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
    }

    public final String c(String str) {
        FirebaseApp firebaseApp = this.j;
        firebaseApp.a();
        Matcher matcher = t.matcher(firebaseApp.c.b);
        return YU.a.j("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i = this.c;
                if (i > 0) {
                    this.c = i - 1;
                    this.h.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zA;
                            ConfigRealtimeHttpClient configRealtimeHttpClient = ConfigRealtimeHttpClient.this;
                            synchronized (configRealtimeHttpClient) {
                                zA = configRealtimeHttpClient.a();
                                if (zA) {
                                    synchronized (configRealtimeHttpClient) {
                                        configRealtimeHttpClient.b = true;
                                    }
                                }
                            }
                            if (zA) {
                                if (new Date(configRealtimeHttpClient.p.currentTimeMillis()).before(configRealtimeHttpClient.q.c().b)) {
                                    configRealtimeHttpClient.h();
                                    return;
                                }
                                FirebaseInstallationsApi firebaseInstallationsApi = configRealtimeHttpClient.k;
                                Task taskA = firebaseInstallationsApi.a();
                                Task id = firebaseInstallationsApi.getId();
                                Task<TContinuationResult> taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskA, id}).continueWithTask(configRealtimeHttpClient.h, new com.adobe.marketing.mobile.launch.rulesengine.download.a(2, configRealtimeHttpClient, taskA, id));
                                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskContinueWithTask}).continueWith(configRealtimeHttpClient.h, new d(6, configRealtimeHttpClient, taskContinueWithTask));
                            }
                        }
                    }, j, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    g(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again."));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f15768a.iterator();
        while (it.hasNext()) {
            ((ConfigUpdateListener) it.next()).b(firebaseRemoteConfigException);
        }
    }

    public final synchronized void h() {
        e(Math.max(0L, this.q.c().b.getTime() - new Date(this.p.currentTimeMillis()).getTime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            com.google.firebase.FirebaseApp r9 = r6.j
            r9.a()
            com.google.firebase.FirebaseOptions r0 = r9.c
            java.lang.String r1 = r0.f15172a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.m
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r4 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            byte[] r5 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            if (r5 != 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r5.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.String r3 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            android.util.Log.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
        L45:
            r1 = r4
            goto L63
        L47:
            r3 = 0
            java.lang.String r1 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            goto L63
        L4d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r2, r1)
            goto L45
        L63:
            java.lang.String r2 = "X-Android-Cert"
            r7.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Google-GFE-Can-Retry"
            java.lang.String r2 = "yes"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "X-Accept-Response-Streaming"
            java.lang.String r2 = "true"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept"
            r7.setRequestProperty(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.a()
            java.lang.String r2 = r0.b
            java.util.regex.Pattern r3 = com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.t
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L9d
            r3 = 1
            java.lang.String r4 = r2.group(r3)
        L9d:
            java.lang.String r2 = "project"
            r1.put(r2, r4)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.n
            r1.put(r2, r3)
            com.google.firebase.remoteconfig.internal.ConfigFetchHandler r2 = r6.i
            com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient r2 = r2.h
            android.content.SharedPreferences r2 = r2.f15770a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.a()
            java.lang.String r9 = r0.b
            java.lang.String r0 = "appId"
            r1.put(r0, r9)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "23.0.0"
            r1.put(r9, r0)
            java.lang.String r9 = "appInstanceId"
            r1.put(r9, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream
            java.io.OutputStream r7 = com.dynatrace.android.callback.Callback.d(r7)
            r9.<init>(r7)
            r9.write(r8)
            r9.flush()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.i(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized ConfigAutoFetch j(HttpURLConnection httpURLConnection) {
        return new ConfigAutoFetch(httpURLConnection, this.i, this.l, this.f15768a, new AnonymousClass2(), this.h, this.q);
    }

    public final void k(Date date) {
        ConfigSharedPrefsClient configSharedPrefsClient = this.q;
        int i = configSharedPrefsClient.c().f15772a + 1;
        configSharedPrefsClient.e(i, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(s[(i < 8 ? i : 8) - 1]) / 2) + this.o.nextInt((int) r2)));
    }
}
