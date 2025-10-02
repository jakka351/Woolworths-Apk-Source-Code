package com.adobe.mobile;

import YU.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.adobe.mobile.AudienceManagerWorker;
import com.adobe.mobile.Config;
import com.adobe.mobile.MobileIdentities;
import com.adobe.mobile.RemoteDownload;
import com.adobe.mobile.StaticMethods;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import com.salesforce.marketingcloud.storage.db.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class MobileConfig {
    public static MobileConfig I = null;
    public static final Object J = new Object();
    public static final Object K = new Object();
    public static final Object L = new Object();
    public static final Object M = new Object();
    public static final Object N = new Object();
    public static final Object O = new Object();
    public final String B;
    public final String C;
    public final boolean D;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public MobilePrivacyStatus l;
    public final String n;
    public final String o;
    public final int p;
    public final long q;
    public final int r;
    public final String s;
    public final boolean t;
    public final int u;
    public final String v;
    public final String w;
    public final String x;

    /* renamed from: a, reason: collision with root package name */
    public boolean f13273a = false;
    public ArrayList m = null;
    public ArrayList y = null;
    public ArrayList z = null;
    public ArrayList A = null;
    public Boolean E = null;
    public Boolean F = null;
    public Boolean G = null;
    public Boolean H = null;

    /* renamed from: com.adobe.mobile.MobileConfig$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            StaticMethods.I("Analytics - Privacy status set to opt in, attempting to send Analytics hits and postbacks in queue.", new Object[0]);
            AnalyticsWorker.o().k(false);
        }
    }

    /* renamed from: com.adobe.mobile.MobileConfig$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            StaticMethods.I("Data Callback - Privacy status set to opt in, attempting to send all requests in queue", new Object[0]);
            ThirdPartyQueue.p().k(false);
        }
    }

    /* renamed from: com.adobe.mobile.MobileConfig$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            StaticMethods.I("Pii Callback - Privacy status set to opt in, attempting to send all requests in queue", new Object[0]);
            PiiQueue.q().k(false);
        }
    }

    /* renamed from: com.adobe.mobile.MobileConfig$4, reason: invalid class name */
    class AnonymousClass4 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            StaticMethods.I("Analytics - Privacy status set to opt out, purging database of Analytics requests and postbacks.", new Object[0]);
            AnalyticsWorker.o().h();
        }
    }

    /* renamed from: com.adobe.mobile.MobileConfig$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            StaticMethods.I("Data Callback - Privacy status set to opt out, attempting to clear queue of all requests", new Object[0]);
            ThirdPartyQueue.p().h();
        }
    }

    /* renamed from: com.adobe.mobile.MobileConfig$6, reason: invalid class name */
    class AnonymousClass6 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            StaticMethods.I("PII - Privacy status set to opt out, attempting to clear queue of all requests.", new Object[0]);
            PiiQueue.q().h();
        }
    }

    /* renamed from: com.adobe.mobile.MobileConfig$8, reason: invalid class name */
    class AnonymousClass8 implements Runnable {

        /* renamed from: com.adobe.mobile.MobileConfig$8$1, reason: invalid class name */
        class AnonymousClass1 implements Callable<Void> {
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Void call() {
                return null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() throws ExecutionException, InterruptedException {
            FutureTask futureTask = new FutureTask(new AnonymousClass1());
            StaticMethods.w().execute(futureTask);
            try {
                futureTask.get();
            } catch (Exception e) {
                StaticMethods.J("Data Callback - Error waiting for callbacks being loaded (%s)", e.getMessage());
            }
        }
    }

    /* renamed from: com.adobe.mobile.MobileConfig$9, reason: invalid class name */
    class AnonymousClass9 implements Runnable {

        /* renamed from: com.adobe.mobile.MobileConfig$9$1, reason: invalid class name */
        class AnonymousClass1 implements Callable<Void> {
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Void call() {
                return null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() throws ExecutionException, InterruptedException {
            FutureTask futureTask = new FutureTask(new AnonymousClass1());
            StaticMethods.w().execute(futureTask);
            try {
                futureTask.get();
            } catch (Exception e) {
                StaticMethods.J("Pii Callback - Error waiting for callbacks being loaded (%s)", e.getMessage());
            }
        }
    }

    public MobileConfig() throws Throwable {
        JSONObject jSONObject;
        String string;
        MobilePrivacyStatus mobilePrivacyStatus;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONArray jSONArray;
        JSONObject jSONObject6;
        Context applicationContext;
        this.b = true;
        this.c = null;
        this.d = null;
        this.e = "UTF-8";
        this.f = true;
        this.g = false;
        this.h = true;
        this.i = nlnlnnn.xxx00780078x0078;
        this.j = 0;
        this.k = 0;
        this.l = MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_IN;
        this.n = null;
        this.o = null;
        this.p = 2;
        this.q = 0L;
        this.r = 1800;
        this.s = null;
        this.t = false;
        this.u = 2;
        this.v = null;
        this.w = null;
        this.x = null;
        this.B = null;
        this.C = null;
        this.D = false;
        synchronized (O) {
        }
        StaticMethods.I("Config - Attempting to load config file from default location", new Object[0]);
        JSONObject jSONObjectE = e("ADBMobileConfig.json");
        if (jSONObjectE == null) {
            StaticMethods.I("Config - Could not find config file at expected location.  Attempting to load from www folder", new Object[0]);
            jSONObjectE = e(a.o(new StringBuilder("www"), File.separator, "ADBMobileConfig.json"));
        }
        if (jSONObjectE == null) {
            return;
        }
        boolean zOptBoolean = jSONObjectE.optBoolean("reachabilityChecksEnabled", true);
        this.b = zOptBoolean;
        if (zOptBoolean) {
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            try {
                applicationContext = StaticMethods.A().getApplicationContext();
            } catch (StaticMethods.NullContextException e) {
                StaticMethods.J("Analytics - Error registering network receiver (%s)", e.getMessage());
                applicationContext = null;
            }
            if (applicationContext != null) {
                applicationContext.registerReceiver(new BroadcastReceiver() { // from class: com.adobe.mobile.MobileConfig.12

                    /* renamed from: com.adobe.mobile.MobileConfig$12$1, reason: invalid class name */
                    class AnonymousClass1 implements Runnable {
                        @Override // java.lang.Runnable
                        public final void run() {
                            StaticMethods.I("Analytics - Network status changed (reachable)", new Object[0]);
                            AnalyticsWorker.o().k(false);
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
                    @Override // android.content.BroadcastReceiver
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void onReceive(android.content.Context r4, android.content.Intent r5) {
                        /*
                            r3 = this;
                            com.adobe.mobile.MobileConfig r5 = com.adobe.mobile.MobileConfig.this
                            r5.getClass()
                            r0 = 0
                            r1 = 1
                            if (r4 == 0) goto L70
                            java.lang.String r2 = "connectivity"
                            java.lang.Object r4 = r4.getSystemService(r2)     // Catch: java.lang.Exception -> L26 java.lang.SecurityException -> L28 java.lang.NullPointerException -> L2a
                            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch: java.lang.Exception -> L26 java.lang.SecurityException -> L28 java.lang.NullPointerException -> L2a
                            if (r4 == 0) goto L3f
                            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L26 java.lang.SecurityException -> L28 java.lang.NullPointerException -> L2a
                            if (r4 == 0) goto L2e
                            boolean r2 = r4.isAvailable()     // Catch: java.lang.Exception -> L26 java.lang.SecurityException -> L28 java.lang.NullPointerException -> L2a
                            if (r2 == 0) goto L2c
                            boolean r4 = r4.isConnected()     // Catch: java.lang.Exception -> L26 java.lang.SecurityException -> L28 java.lang.NullPointerException -> L2a
                            if (r4 == 0) goto L2c
                            goto L70
                        L26:
                            r4 = move-exception
                            goto L47
                        L28:
                            r4 = move-exception
                            goto L55
                        L2a:
                            r4 = move-exception
                            goto L63
                        L2c:
                            r1 = r0
                            goto L70
                        L2e:
                            java.lang.String r4 = "Analytics - Unable to determine connectivity status due to there being no default network currently active"
                            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L36 java.lang.SecurityException -> L39 java.lang.NullPointerException -> L3c
                            com.adobe.mobile.StaticMethods.K(r4, r1)     // Catch: java.lang.Exception -> L36 java.lang.SecurityException -> L39 java.lang.NullPointerException -> L3c
                            goto L2c
                        L36:
                            r4 = move-exception
                            r1 = r0
                            goto L47
                        L39:
                            r4 = move-exception
                            r1 = r0
                            goto L55
                        L3c:
                            r4 = move-exception
                            r1 = r0
                            goto L63
                        L3f:
                            java.lang.String r4 = "Analytics - Unable to determine connectivity status due to the system service requested being unrecognized"
                            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L26 java.lang.SecurityException -> L28 java.lang.NullPointerException -> L2a
                            com.adobe.mobile.StaticMethods.K(r4, r2)     // Catch: java.lang.Exception -> L26 java.lang.SecurityException -> L28 java.lang.NullPointerException -> L2a
                            goto L70
                        L47:
                            java.lang.String r4 = r4.getLocalizedMessage()
                            java.lang.Object[] r4 = new java.lang.Object[]{r4}
                            java.lang.String r2 = "Analytics - Unable to access connectivity status due to an unexpected error (%s)"
                            com.adobe.mobile.StaticMethods.K(r2, r4)
                            goto L70
                        L55:
                            java.lang.String r4 = r4.getLocalizedMessage()
                            java.lang.Object[] r4 = new java.lang.Object[]{r4}
                            java.lang.String r2 = "Analytics - Unable to access connectivity status due to a security error (%s)"
                            com.adobe.mobile.StaticMethods.J(r2, r4)
                            goto L70
                        L63:
                            java.lang.String r4 = r4.getLocalizedMessage()
                            java.lang.Object[] r4 = new java.lang.Object[]{r4}
                            java.lang.String r2 = "Analytics - Unable to determine connectivity status due to an unexpected error (%s)"
                            com.adobe.mobile.StaticMethods.K(r2, r4)
                        L70:
                            r5.f13273a = r1
                            boolean r4 = r5.f13273a
                            if (r4 == 0) goto L83
                            java.util.concurrent.ExecutorService r4 = com.adobe.mobile.StaticMethods.i()
                            com.adobe.mobile.MobileConfig$12$1 r5 = new com.adobe.mobile.MobileConfig$12$1
                            r5.<init>()
                            r4.execute(r5)
                            goto L8a
                        L83:
                            java.lang.String r4 = "Analytics - Network status changed (unreachable)"
                            java.lang.Object[] r5 = new java.lang.Object[r0]
                            com.adobe.mobile.StaticMethods.I(r4, r5)
                        L8a:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.adobe.mobile.MobileConfig.AnonymousClass12.onReceive(android.content.Context, android.content.Intent):void");
                    }
                }, intentFilter);
            }
        }
        try {
            jSONObject = jSONObjectE.getJSONObject("analytics");
        } catch (JSONException unused) {
            StaticMethods.I("Analytics - Not configured.", new Object[0]);
            jSONObject = null;
        }
        if (jSONObject != null) {
            try {
                this.d = jSONObject.getString("server");
                this.c = jSONObject.getString("rsids");
            } catch (JSONException unused2) {
                this.d = null;
                this.c = null;
                StaticMethods.I("Analytics - Not Configured.", new Object[0]);
            }
            try {
                this.e = jSONObject.getString("charset");
            } catch (JSONException unused3) {
                this.e = "UTF-8";
            }
            try {
                this.f = jSONObject.getBoolean("ssl");
            } catch (JSONException unused4) {
                this.f = true;
            }
            try {
                this.g = jSONObject.getBoolean("offlineEnabled");
            } catch (JSONException unused5) {
                this.g = false;
            }
            try {
                this.h = jSONObject.getBoolean("backdateSessionInfo");
            } catch (JSONException unused6) {
                this.h = true;
            }
            try {
                this.i = jSONObject.getInt("lifecycleTimeout");
            } catch (JSONException unused7) {
                this.i = nlnlnnn.xxx00780078x0078;
            }
            try {
                this.j = jSONObject.getInt("referrerTimeout");
            } catch (JSONException unused8) {
                this.j = 0;
            }
            try {
                this.k = jSONObject.getInt("batchLimit");
            } catch (JSONException unused9) {
                this.k = 0;
            }
            try {
                if (StaticMethods.B().contains("PrivacyStatus")) {
                    this.l = MobilePrivacyStatus.values()[StaticMethods.B().getInt("PrivacyStatus", 0)];
                } else {
                    try {
                        string = jSONObject.getString("privacyDefault");
                    } catch (JSONException unused10) {
                        string = null;
                    }
                    if (string != null) {
                        mobilePrivacyStatus = MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_IN;
                        if (!string.equalsIgnoreCase("optedin")) {
                            if (string.equalsIgnoreCase("optedout")) {
                                mobilePrivacyStatus = MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_OUT;
                            } else if (string.equalsIgnoreCase("optunknown")) {
                                mobilePrivacyStatus = MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_UNKNOWN;
                            }
                        }
                    } else {
                        mobilePrivacyStatus = MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_IN;
                    }
                    this.l = mobilePrivacyStatus;
                }
                try {
                    i(jSONObject.getJSONArray("poi"));
                } catch (JSONException e2) {
                    StaticMethods.J("Analytics - Malformed POI List(%s)", e2.getLocalizedMessage());
                }
            } catch (StaticMethods.NullContextException e3) {
                StaticMethods.J("Config - Error pulling privacy from shared preferences. (%s)", e3.getMessage());
                return;
            }
        }
        try {
            jSONObject2 = jSONObjectE.getJSONObject("target");
        } catch (JSONException unused11) {
            StaticMethods.I("Target - Not Configured.", new Object[0]);
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            try {
                this.o = jSONObject2.getString("clientCode");
            } catch (JSONException unused12) {
                this.o = null;
                StaticMethods.I("Target - Not Configured.", new Object[0]);
            }
            try {
                this.p = jSONObject2.getInt("timeout");
            } catch (JSONException unused13) {
                this.p = 2;
            }
            try {
                this.q = jSONObject2.getLong("environmentId");
            } catch (JSONException unused14) {
                this.q = 0L;
            }
            try {
                int i = jSONObject2.getInt("sessionTimeout");
                this.r = i;
                if (i < 0) {
                    this.r = 1800;
                }
            } catch (JSONException unused15) {
                this.r = 1800;
            }
        }
        try {
            jSONObject3 = jSONObjectE.getJSONObject("audienceManager");
        } catch (JSONException unused16) {
            StaticMethods.I("Audience Manager - Not Configured.", new Object[0]);
            jSONObject3 = null;
        }
        if (jSONObject3 != null) {
            try {
                this.s = jSONObject3.getString("server");
            } catch (JSONException unused17) {
                this.s = null;
                StaticMethods.I("Audience Manager - Not Configured.", new Object[0]);
            }
            try {
                this.t = jSONObject3.getBoolean("analyticsForwardingEnabled");
            } catch (JSONException unused18) {
                this.t = false;
            }
            if (this.t) {
                StaticMethods.I("Audience Manager - Analytics Server-Side Forwarding Is Enabled.", new Object[0]);
            }
            try {
                this.u = jSONObject3.getInt("timeout");
            } catch (JSONException unused19) {
                this.u = 2;
            }
        }
        try {
            jSONObject4 = jSONObjectE.getJSONObject("acquisition");
        } catch (JSONException unused20) {
            StaticMethods.I("Acquisition - Not Configured.", new Object[0]);
            jSONObject4 = null;
        }
        if (jSONObject4 != null) {
            try {
                this.w = jSONObject4.getString("appid");
                this.v = jSONObject4.getString("server");
            } catch (JSONException unused21) {
                this.w = null;
                this.v = null;
                StaticMethods.I("Acquisition - Not configured correctly (missing server or app identifier).", new Object[0]);
            }
        }
        try {
            jSONObject5 = jSONObjectE.getJSONObject("remotes");
        } catch (JSONException unused22) {
            StaticMethods.I("Remotes - Not Configured.", new Object[0]);
            jSONObject5 = null;
        }
        if (jSONObject5 != null) {
            try {
                this.x = jSONObject5.getString(i.e);
            } catch (JSONException e4) {
                StaticMethods.I("Config - No in-app messages remote url loaded (%s)", e4.getLocalizedMessage());
            }
            try {
                this.n = jSONObject5.getString("analytics.poi");
            } catch (JSONException e5) {
                StaticMethods.I("Config - No points of interest remote url loaded (%s)", e5.getLocalizedMessage());
            }
        }
        try {
            jSONArray = jSONObjectE.getJSONArray(i.e);
        } catch (JSONException unused23) {
            StaticMethods.I("Messages - Not configured locally.", new Object[0]);
            jSONArray = null;
        }
        if (jSONArray != null && jSONArray.length() > 0) {
            h(jSONArray);
        }
        try {
            jSONObject6 = jSONObjectE.getJSONObject("marketingCloud");
        } catch (JSONException unused24) {
            StaticMethods.I("Marketing Cloud - Not configured locally.", new Object[0]);
            jSONObject6 = null;
        }
        if (jSONObject6 != null) {
            try {
                this.B = jSONObject6.getString("org");
            } catch (JSONException unused25) {
                this.B = null;
                StaticMethods.I("Visitor - ID Service Not Configured.", new Object[0]);
            }
            try {
                this.C = jSONObject6.getString("server");
            } catch (JSONException unused26) {
                this.C = null;
                StaticMethods.I("Visitor ID Service - Custom endpoint not found in configuration, using default endpoint.", new Object[0]);
            }
            try {
                this.D = jSONObject6.getBoolean("coopUnsafe");
            } catch (JSONException unused27) {
                StaticMethods.I("Visitor - Coop Unsafe Not Configured.", new Object[0]);
            }
        }
        String str = this.n;
        String str2 = this.x;
        if (str2 != null && str2.length() > 0) {
            q(RemoteDownload.e(str2, "adbdownloadcache"));
        }
        if (str != null && str.length() > 0) {
            r(RemoteDownload.e(str, "adbdownloadcache"));
        }
        p();
    }

    public static void a(MobileConfig mobileConfig) {
        ExecutorService executorService;
        synchronized (StaticMethods.R) {
            try {
                if (StaticMethods.Q == null) {
                    StaticMethods.Q = Executors.newSingleThreadExecutor();
                }
                executorService = StaticMethods.Q;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(new Runnable() { // from class: com.adobe.mobile.MobileConfig.11
            @Override // java.lang.Runnable
            public final void run() {
                File[] fileArrListFiles;
                MobileConfig mobileConfig2 = MobileConfig.this;
                ArrayList arrayList = mobileConfig2.y;
                if (arrayList == null || arrayList.size() <= 0) {
                    RemoteDownload.c();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = mobileConfig2.y.iterator();
                while (it.hasNext()) {
                    Message message = (Message) it.next();
                    ArrayList arrayList3 = message.h;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        Iterator it2 = message.h.iterator();
                        while (it2.hasNext()) {
                            ArrayList arrayList4 = (ArrayList) it2.next();
                            if (arrayList4.size() > 0) {
                                Iterator it3 = arrayList4.iterator();
                                while (it3.hasNext()) {
                                    String str = (String) it3.next();
                                    arrayList2.add(str);
                                    new RemoteDownload.DownloadFileTask(str, null, "messageImages").run();
                                }
                            }
                        }
                    }
                }
                if (arrayList2.size() <= 0) {
                    RemoteDownload.c();
                    return;
                }
                if (arrayList2.size() <= 0) {
                    RemoteDownload.c();
                    return;
                }
                File fileD = RemoteDownload.d("messageImages");
                if (fileD == null || (fileArrListFiles = fileD.listFiles()) == null || fileArrListFiles.length <= 0) {
                    return;
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(RemoteDownload.g((String) it4.next()));
                }
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    if (!arrayList5.contains(name.substring(0, name.indexOf(".")))) {
                        if (file.delete()) {
                            StaticMethods.I("Cached File - Removed unused cache file", new Object[0]);
                        } else {
                            StaticMethods.K("Cached File - Failed to remove unused cache file", new Object[0]);
                        }
                    }
                }
            }
        });
    }

    public static MobileConfig b() {
        MobileConfig mobileConfig;
        synchronized (J) {
            try {
                if (I == null) {
                    I = new MobileConfig();
                }
                mobileConfig = I;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mobileConfig;
    }

    public static JSONObject e(String str) {
        AssetManager assets;
        try {
            Resources resources = StaticMethods.A().getResources();
            if (resources != null && (assets = resources.getAssets()) != null) {
                return f(assets.open(str));
            }
            return null;
        } catch (StaticMethods.NullContextException e) {
            StaticMethods.J("Config - Null context when attempting to read config file (%s)", e.getMessage());
            return null;
        } catch (IOException e2) {
            StaticMethods.J("Config - Exception loading config file (%s)", e2.getMessage());
            return null;
        } catch (JSONException e3) {
            StaticMethods.J("Config - Exception parsing config file (%s)", e3.getMessage());
            return null;
        }
    }

    public static JSONObject f(InputStream inputStream) throws IOException {
        try {
            if (inputStream == null) {
                return null;
            }
            try {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                JSONObject jSONObject = new JSONObject(new String(bArr, "UTF-8"));
                try {
                    return jSONObject;
                } catch (IOException e) {
                    return jSONObject;
                }
            } catch (IOException e2) {
                StaticMethods.J("Config - Exception when reading config (%s)", e2.getMessage());
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    StaticMethods.J("Config - Unable to close stream (%s)", e3.getMessage());
                }
                return new JSONObject();
            } catch (NullPointerException e4) {
                StaticMethods.J("Config - Stream closed when attempting to load config (%s)", e4.getMessage());
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    StaticMethods.J("Config - Unable to close stream (%s)", e5.getMessage());
                }
                return new JSONObject();
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e6) {
                StaticMethods.J("Config - Unable to close stream (%s)", e6.getMessage());
            }
        }
    }

    public final boolean c() {
        String str = this.B;
        return str != null && str.length() > 0;
    }

    public final void d(Config.MobileDataEvent mobileDataEvent, HashMap map) {
        StaticMethods.I("Config - A callback has not been registered for Adobe events.", new Object[0]);
    }

    public final void g(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        if (jSONObject == null) {
            StaticMethods.I("Messages - Remote messages config was null, falling back to bundled messages", new Object[0]);
            RemoteDownload.c();
            return;
        }
        try {
            jSONArray = jSONObject.getJSONArray(i.e);
        } catch (JSONException unused) {
            StaticMethods.I("Messages - Remote messages not configured, falling back to bundled messages", new Object[0]);
            jSONArray = null;
        }
        StaticMethods.I("Messages - Using remote definition for messages", new Object[0]);
        if (jSONArray != null && jSONArray.length() > 0) {
            h(jSONArray);
            return;
        }
        RemoteDownload.c();
        this.y = null;
        this.z = null;
        this.A = null;
    }

    public final void h(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Message messageK = Message.k(jSONArray.getJSONObject(i));
                if (messageK != null) {
                    StaticMethods.I("Messages - loaded message - %s", messageK.d());
                    if (messageK.getClass() == MessageTemplatePii.class) {
                        arrayList3.add(messageK);
                    } else if (messageK.getClass() == MessageTemplateCallback.class || messageK.getClass() == MessageOpenURL.class) {
                        arrayList2.add(messageK);
                    } else {
                        arrayList.add(messageK);
                    }
                }
            }
            this.y = arrayList;
            this.z = arrayList2;
            this.A = arrayList3;
        } catch (JSONException e) {
            StaticMethods.J("Messages - Unable to parse messages JSON (%s)", e.getMessage());
        }
    }

    public final void i(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return;
        }
        try {
            this.m = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(jSONArray2.getString(0));
                arrayList.add(Double.valueOf(jSONArray2.getDouble(1)));
                arrayList.add(Double.valueOf(jSONArray2.getDouble(2)));
                arrayList.add(Double.valueOf(jSONArray2.getDouble(3)));
                this.m.add(arrayList);
            }
        } catch (JSONException e) {
            StaticMethods.J("Messages - Unable to parse remote points of interest JSON (%s)", e.getMessage());
        }
    }

    public final boolean j() {
        boolean zBooleanValue;
        String str;
        synchronized (K) {
            try {
                if (this.E == null) {
                    String str2 = this.c;
                    Boolean boolValueOf = Boolean.valueOf(str2 != null && str2.length() > 0 && (str = this.d) != null && str.length() > 0);
                    this.E = boolValueOf;
                    if (!boolValueOf.booleanValue()) {
                        StaticMethods.I("Analytics - Your config file is not set up to use Analytics(missing report suite id(s) or tracking server information)", new Object[0]);
                    }
                }
                zBooleanValue = this.E.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final boolean k() {
        boolean zBooleanValue;
        if (StaticMethods.e) {
            return false;
        }
        synchronized (M) {
            try {
                if (this.G == null) {
                    String str = this.s;
                    Boolean boolValueOf = Boolean.valueOf(str != null && str.length() > 0);
                    this.G = boolValueOf;
                    if (!boolValueOf.booleanValue()) {
                        StaticMethods.I("Audience Manager - Your config file is not set up to use Audience Manager(missing audience manager server information)", new Object[0]);
                    }
                }
                zBooleanValue = this.G.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final boolean l() {
        boolean zBooleanValue;
        synchronized (L) {
            try {
                if (this.F == null) {
                    this.F = Boolean.valueOf(WearableFunctionBridge.c());
                }
                zBooleanValue = this.F.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final boolean m() {
        boolean zBooleanValue;
        if (StaticMethods.e) {
            return false;
        }
        synchronized (N) {
            try {
                if (this.H == null) {
                    String str = this.o;
                    Boolean boolValueOf = Boolean.valueOf(str != null && str.length() > 0);
                    this.H = boolValueOf;
                    if (!boolValueOf.booleanValue()) {
                        StaticMethods.I("Target Worker - Your config file is not set up to use Target(missing client code information)", new Object[0]);
                    }
                }
                zBooleanValue = this.H.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final boolean n() {
        return StaticMethods.e || this.f13273a;
    }

    public final void o() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        StaticMethods.i().execute(new AnonymousClass4());
        StaticMethods.D().execute(new AnonymousClass5());
        StaticMethods.y().execute(new AnonymousClass6());
        StaticMethods.I("Config - Privacy status set to opt out, purging all Adobe SDK identities from device.", new Object[0]);
        StaticMethods.n().execute(new AudienceManagerWorker.AnonymousClass5());
        StaticMethods.n().execute(new MobileIdentities.AnonymousClass2());
        this.l = MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_OUT;
        if (!StaticMethods.e && b().l()) {
            try {
                WearableFunctionBridge.a().getDeclaredMethod("syncPrivacyStatus", Integer.TYPE).invoke(null, 1);
            } catch (Exception e) {
                StaticMethods.I("Wearable - Unable to sync privacy status (%s)", e.getLocalizedMessage());
            }
        }
        try {
            SharedPreferences.Editor editorC = StaticMethods.C();
            editorC.putInt("PrivacyStatus", 1);
            editorC.commit();
        } catch (StaticMethods.NullContextException e2) {
            StaticMethods.J("Config - Error persisting privacy status (%s).", e2.getMessage());
        }
    }

    public final void p() {
        ArrayList arrayList = this.y;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                message.getClass();
                HashMap mapH = Message.h();
                if (message.g() && message.b.d != ((Integer) mapH.get(message.f13268a)).intValue()) {
                    message.l();
                }
            }
        }
        ArrayList arrayList2 = this.z;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Message message2 = (Message) it2.next();
                message2.getClass();
                HashMap mapH2 = Message.h();
                if (message2.g() && message2.b.d != ((Integer) mapH2.get(message2.f13268a)).intValue()) {
                    message2.l();
                }
            }
        }
    }

    public final void q(File file) throws Throwable {
        FileInputStream fileInputStream;
        if (file == null) {
            return;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    g(f(fileInputStream));
                } catch (IOException e) {
                    e = e;
                    fileInputStream2 = fileInputStream;
                    StaticMethods.K("Messages - Unable to open messages config file, falling back to bundled messages (%s)", e.getLocalizedMessage());
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e2) {
                            StaticMethods.J("Messages - Unable to close file stream (%s)", e2.getLocalizedMessage());
                        }
                    }
                } catch (JSONException e3) {
                    e = e3;
                    fileInputStream2 = fileInputStream;
                    StaticMethods.J("Messages - Unable to read messages remote config file, falling back to bundled messages (%s)", e.getLocalizedMessage());
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e4) {
                            StaticMethods.J("Messages - Unable to close file stream (%s)", e4.getLocalizedMessage());
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e5) {
                            StaticMethods.J("Messages - Unable to close file stream (%s)", e5.getLocalizedMessage());
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            } catch (JSONException e7) {
                e = e7;
            }
            try {
                fileInputStream.close();
            } catch (IOException e8) {
                StaticMethods.J("Messages - Unable to close file stream (%s)", e8.getLocalizedMessage());
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String] */
    public final void r(File file) throws Throwable {
        FileInputStream fileInputStream;
        if (file == null) {
            return;
        }
        FileInputStream fileInputStream2 = null;
        FileInputStream fileInputStream3 = null;
        FileInputStream fileInputStream4 = null;
        FileInputStream fileInputStream5 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (IOException e) {
                e = e;
            } catch (JSONException e2) {
                e = e2;
            }
            try {
                JSONObject jSONObjectF = f(fileInputStream);
                if (jSONObjectF != null) {
                    i(jSONObjectF.getJSONObject("analytics").getJSONArray("poi"));
                    fileInputStream3 = "poi";
                }
            } catch (IOException e3) {
                e = e3;
                fileInputStream4 = fileInputStream;
                StaticMethods.K("Config - Unable to open points of interest config file, falling back to bundled poi (%s)", e.getLocalizedMessage());
                fileInputStream2 = fileInputStream4;
                if (fileInputStream4 != null) {
                    try {
                        fileInputStream4.close();
                        fileInputStream2 = fileInputStream4;
                    } catch (IOException e4) {
                        StaticMethods.J("Config - Unable to close file stream (%s)", e4.getLocalizedMessage());
                        fileInputStream2 = fileInputStream4;
                    }
                }
            } catch (JSONException e5) {
                e = e5;
                fileInputStream5 = fileInputStream;
                StaticMethods.J("Config - Unable to read points of interest remote config file, falling back to bundled poi (%s)", e.getLocalizedMessage());
                fileInputStream2 = fileInputStream5;
                if (fileInputStream5 != null) {
                    try {
                        fileInputStream5.close();
                        fileInputStream2 = fileInputStream5;
                    } catch (IOException e6) {
                        StaticMethods.J("Config - Unable to close file stream (%s)", e6.getLocalizedMessage());
                        fileInputStream2 = fileInputStream5;
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e7) {
                        StaticMethods.J("Config - Unable to close file stream (%s)", e7.getLocalizedMessage());
                    }
                }
                throw th;
            }
            try {
                fileInputStream.close();
            } catch (IOException e8) {
                StaticMethods.J("Config - Unable to close file stream (%s)", e8.getLocalizedMessage());
                fileInputStream2 = fileInputStream3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
