package com.swrve.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.storage.db.k;
import com.swrve.sdk.SwrveRunnables;
import com.swrve.sdk.config.SwrveConfig;
import com.swrve.sdk.config.SwrveConfigBase;
import com.swrve.sdk.device.AndroidTelephonyManagerWrapper;
import com.swrve.sdk.localstorage.SQLiteLocalStorage;
import com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage;
import com.swrve.sdk.messaging.SwrveBaseCampaign;
import com.swrve.sdk.messaging.SwrveCampaignState;
import com.swrve.sdk.messaging.SwrveEmbeddedCampaign;
import com.swrve.sdk.messaging.SwrveInAppCampaign;
import com.swrve.sdk.messaging.SwrveMessage;
import com.swrve.sdk.messaging.SwrveOrientation;
import com.swrve.sdk.rest.RESTClient;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class SwrveImp<T, C extends SwrveConfigBase> implements ISwrveCampaignManager, Application.ActivityLifecycleCallbacks {
    public static final List i0 = Arrays.asList("android");
    public static final int j0 = 150;
    public static final long k0 = 99999;
    public static final int l0 = 55;
    public static final int m0 = 1000;
    public static final int n0 = 150;
    public static final int o0 = -1;
    public SwrveResourceManager A;
    public ArrayList B;
    public SwrveCampaignDisplayer C;
    public HashMap D;
    public HashMap E;
    public SwrveAssetsManagerImp F;
    public boolean G;
    public Integer H;
    public Integer I;
    public Integer J;
    public Integer K;
    public String L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public Date Q;
    public int R;
    public int S;
    public float T;
    public float U;
    public float V;
    public String W;
    public String X;
    public String Y;
    public SwrveDeeplinkManager Z;
    public SwrveCampaignInfluence a0;
    public String b0;
    public boolean c0;
    public WeakReference d;
    public List d0;
    public WeakReference e;
    public Map e0;
    public WeakReference f;
    public String f0;
    public String g;
    public SwrvePushInboxManager g0;
    public int h;
    public String h0;
    public String i;
    public SwrveProfileManager j;
    public String k;
    public SwrveConfig l;
    public ISwrveEventListener m;
    public au.com.woolworths.foundation.swrve.embedded.campaign.a n;
    public SwrveResourcesListener o;
    public ExecutorService p;
    public long q;
    public long r;
    public SwrveMultiLayerLocalStorage s;
    public RESTClient t;
    public ExecutorService u;
    public ExecutorService v;
    public ExecutorService w;
    public ExecutorService x;
    public ExecutorService y;
    public ScheduledThreadPoolExecutor z;

    public static String Q() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : androidx.camera.core.impl.b.o(str, " ", str2);
    }

    @Override // com.swrve.sdk.ISwrveCampaignManager
    public Date B() {
        return new Date();
    }

    @Override // com.swrve.sdk.ISwrveCampaignManager
    public HashSet H() {
        HashSet hashSet;
        SwrveAssetsManagerImp swrveAssetsManagerImp = this.F;
        if (swrveAssetsManagerImp == null) {
            return new HashSet();
        }
        synchronized (swrveAssetsManagerImp.f19039a) {
            hashSet = swrveAssetsManagerImp.f19039a;
        }
        return hashSet;
    }

    public final void I() {
        WeakReference weakReference;
        Activity activity;
        if (this.G && this.M && this.B != null) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                SwrveBaseCampaign swrveBaseCampaign = (SwrveBaseCampaign) it.next();
                SwrveBase swrveBase = (SwrveBase) this;
                this.C.getClass();
                if (SwrveCampaignDisplayer.a(swrveBaseCampaign, "Swrve.Messages.showAtSessionStart", map2, map)) {
                    synchronized (this) {
                        try {
                            if (this.G && (weakReference = this.f) != null && (activity = (Activity) weakReference.get()) != null) {
                                activity.runOnUiThread(new m(this, swrveBase));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
            }
        }
    }

    public final void J(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            int iG = SwrveHelper.g(context);
            int iF = SwrveHelper.f(context);
            defaultDisplay.getMetrics(displayMetrics);
            float f = displayMetrics.xdpi;
            float f2 = displayMetrics.ydpi;
            if (iG > iF) {
                f2 = f;
                f = f2;
                iF = iG;
                iG = iF;
            }
            this.R = iG;
            this.S = iF;
            this.T = displayMetrics.densityDpi;
            this.U = f;
            this.V = f2;
            TelephonyManager telephonyManager = new AndroidTelephonyManagerWrapper(context).f19081a;
            this.W = telephonyManager != null ? telephonyManager.getSimOperatorName() : null;
            this.X = telephonyManager != null ? telephonyManager.getSimCountryIso() : null;
            this.Y = telephonyManager != null ? telephonyManager.getSimOperator() : null;
            this.l.getClass();
        } catch (Exception e) {
            SwrveLogger.c("Get device screen info failed", e, new Object[0]);
        }
    }

    public final boolean K(SwrveMessage swrveMessage) {
        HashMap mapH0 = h0(this.e0);
        if (this.e == null || P() == null) {
            SwrveLogger.e("Can't display the in-app message as context is null", new Object[0]);
            return false;
        }
        if (!swrveMessage.d(R())) {
            SwrveLogger.e("Can't display the in-app message as it doesn't support the current orientation", new Object[0]);
            return false;
        }
        if (N(swrveMessage)) {
            SwrveLogger.e("Will not display the in-app message as it requests a capability/permission that is already granted or redundant action.", new Object[0]);
            return false;
        }
        if (swrveMessage.g().n(B())) {
            return SwrveMessageTextTemplatingChecks.a(swrveMessage, mapH0);
        }
        SwrveLogger.e("Can't display the in-app message as campaign is no longer active", new Object[0]);
        return false;
    }

    public final void L(String str, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put(k.a.h, jSONObject);
        f0(str, "device_update", map, null, true);
    }

    public final void M(SwrveMessage swrveMessage) {
        Intent intent = new Intent(P(), (Class<?>) SwrveInAppMessageActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("message_id", swrveMessage.getId());
        HashMap mapH0 = h0(this.e0);
        if (mapH0 != null) {
            intent.putExtra("message_personalization", new HashMap(mapH0));
        }
        P().startActivity(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(com.swrve.sdk.messaging.SwrveMessage r8) {
        /*
            r7 = this;
            java.util.List r8 = r8.h()
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.Iterator r8 = r8.iterator()
        La:
            boolean r0 = r8.hasNext()
            r1 = 0
            if (r0 == 0) goto Lb2
            java.lang.Object r0 = r8.next()
            com.swrve.sdk.messaging.SwrveMessageFormat r0 = (com.swrve.sdk.messaging.SwrveMessageFormat) r0
            java.util.HashMap r0 = r0.a()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            com.swrve.sdk.messaging.SwrveMessagePage r2 = (com.swrve.sdk.messaging.SwrveMessagePage) r2
            java.util.ArrayList r2 = r2.a()
            java.util.Iterator r2 = r2.iterator()
        L3d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()
            com.swrve.sdk.messaging.SwrveButton r3 = (com.swrve.sdk.messaging.SwrveButton) r3
            com.swrve.sdk.messaging.SwrveActionType r4 = com.swrve.sdk.messaging.SwrveActionType.h
            com.swrve.sdk.messaging.SwrveActionType r5 = r3.h()
            boolean r4 = r4.equals(r5)
            r5 = 1
            if (r4 == 0) goto L6c
            java.lang.String r3 = r3.g()
            boolean r4 = com.swrve.sdk.SwrveHelper.p(r3)
            if (r4 == 0) goto L61
            goto L3d
        L61:
            android.content.Context r4 = r7.P()
            int r3 = androidx.core.content.ContextCompat.a(r4, r3)
            if (r3 != 0) goto L3d
            goto Lb1
        L6c:
            com.swrve.sdk.messaging.SwrveActionType r4 = com.swrve.sdk.messaging.SwrveActionType.l
            com.swrve.sdk.messaging.SwrveActionType r3 = r3.h()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L3d
            java.lang.String r3 = "com.swrve.sdk.geo.SwrveGeoSDK"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L9e java.lang.ClassNotFoundException -> La7
            java.lang.String r4 = "isStarted"
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch: java.lang.Exception -> L9e java.lang.ClassNotFoundException -> La7
            java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.Exception -> L9e java.lang.ClassNotFoundException -> La7
            android.content.Context r4 = r7.P()     // Catch: java.lang.Exception -> L9e java.lang.ClassNotFoundException -> La7
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L9e java.lang.ClassNotFoundException -> La7
            r6 = 0
            java.lang.Object r3 = r3.invoke(r6, r4)     // Catch: java.lang.Exception -> L9e java.lang.ClassNotFoundException -> La7
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Exception -> L9e java.lang.ClassNotFoundException -> La7
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Exception -> L9e java.lang.ClassNotFoundException -> La7
            goto Laf
        L9e:
            r3 = move-exception
            java.lang.String r4 = "Exception trying to assert if SwrveGeoSDK is started."
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.swrve.sdk.SwrveLogger.c(r4, r3, r6)
            goto Lae
        La7:
            java.lang.String r3 = "SwrveGeoSDK is not integrated."
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.swrve.sdk.SwrveLogger.g(r3, r4)
        Lae:
            r3 = r5
        Laf:
            if (r3 == 0) goto L3d
        Lb1:
            return r5
        Lb2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.SwrveImp.N(com.swrve.sdk.messaging.SwrveMessage):boolean");
    }

    public final Activity O() {
        WeakReference weakReference = this.f;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return (Activity) this.f.get();
    }

    public final Context P() {
        Context context = (Context) this.e.get();
        return context == null ? O() : context;
    }

    public final SwrveOrientation R() {
        Context context = (Context) this.e.get();
        return context != null ? context.getResources().getConfiguration().orientation == 1 ? SwrveOrientation.d : SwrveOrientation.e : SwrveOrientation.f;
    }

    public String S(String str) {
        StringBuilder sbS = YU.a.s(str);
        sbS.append(this.i);
        return sbS.toString();
    }

    public final void T(String str) {
        this.B = new ArrayList();
        this.C = new SwrveCampaignDisplayer();
        this.D = new HashMap();
        b0(str);
    }

    public final void U(String str) {
        try {
            String strE = this.s.e(str, "PIM", S(str));
            if (SwrveHelper.p(strE)) {
                return;
            }
            e0(new JSONArray(strE), str);
            SwrveLogger.e("Loaded push inbox messages from cache.", new Object[0]);
        } catch (SecurityException unused) {
            X(str, "PIM");
        } catch (Exception e) {
            SwrveLogger.c("Could not load push inbox messages", e, new Object[0]);
            Y(str);
        }
    }

    public final void V(String str) throws JSONException {
        this.E = new HashMap();
        try {
            String strE = this.s.e(str, "cmrp2s", S(str));
            if (!SwrveHelper.p(strE)) {
                JSONObject jSONObject = new JSONObject(strE);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        this.E.put(next, jSONObject.getString(next));
                    } catch (Exception e) {
                        SwrveLogger.c("Could not load realtime user property for key: " + next, e, new Object[0]);
                    }
                }
            }
            SwrveLogger.e("Loaded realtime user properties from cache.", new Object[0]);
        } catch (SecurityException unused) {
            X(str, "cmrp2s");
        } catch (Exception e2) {
            SwrveLogger.c("Could not load real time user properties", e2, new Object[0]);
        }
    }

    public final void W(String str) {
        String strE;
        try {
            strE = this.s.e(str, "srcngt2", S(str));
        } catch (SecurityException unused) {
            X(str, "srcngt2");
            strE = null;
        }
        if (strE == null) {
            Y(str);
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(strE);
            SwrveResourceManager swrveResourceManager = this.A;
            swrveResourceManager.getClass();
            try {
                swrveResourceManager.a(jSONArray);
            } catch (Exception e) {
                SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            }
        } catch (Exception e2) {
            SwrveLogger.c("Could not parse cached json content for resources", e2, new Object[0]);
        }
    }

    public final void X(String str, String str2) {
        SwrveLogger.d("SwrveSDK: Signature for %s invalid; could not retrieve data from cache. Forcing a refresh.", str2);
        Y(str);
        f0(str, "event", androidx.constraintlayout.core.state.a.r(AppMeasurementSdk.ConditionalUserProperty.NAME, "Swrve.signature_invalid"), null, false);
    }

    public final void Y(String str) {
        SwrveLogger.g("SwrveSDK: clearing stored etag to force a content refresh.", new Object[0]);
        this.s.g(str, "swrve.etag", "");
    }

    public final void Z() {
        if (this.o != null) {
            Activity activityO = O();
            if (activityO != null) {
                activityO.runOnUiThread(new o((SwrveBase) this, 1));
                return;
            }
            try {
                this.o.a();
            } catch (Exception e) {
                SwrveLogger.c("SwrveSDK exception trying to call SwrveResourcesListener.onResourcesUpdated", e, new Object[0]);
            }
        }
    }

    public final void a0(Runnable runnable) {
        ExecutorService executorService = this.u;
        try {
            if (executorService.isShutdown()) {
                SwrveLogger.e("Trying to handle a lifecycle execution while shutdown", new Object[0]);
            } else {
                executorService.execute(new SwrveRunnables.AnonymousClass1(runnable));
            }
        } catch (Exception e) {
            SwrveLogger.c("Error while scheduling a lifecycle execution", e, new Object[0]);
        }
    }

    public final void b0(String str) {
        boolean z;
        try {
            String strE = this.s.e(str, "CMCC2", S(str));
            if (SwrveHelper.p(strE)) {
                Y(str);
                return;
            }
            JSONObject jSONObject = new JSONObject(strE);
            d0();
            try {
                z = QaUser.j().l;
            } catch (Exception e) {
                SwrveLogger.c("Error calling QaUser.isResetDevice", e, new Object[0]);
                z = false;
            }
            c0(str, jSONObject, this.D, !z);
            SwrveLogger.e("Loaded campaigns from cache.", new Object[0]);
        } catch (SecurityException unused) {
            X(str, "CMCC2");
        } catch (Exception e2) {
            SwrveLogger.c("Could not load campaigns", e2, new Object[0]);
            Y(str);
        }
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.swrve.sdk.k] */
    public final void c0(String str, JSONObject jSONObject, HashMap map, boolean z) {
        boolean zContains;
        String str2;
        int i = 0;
        if (jSONObject == null) {
            SwrveLogger.e("NULL JSON for campaigns, aborting load.", new Object[0]);
            return;
        }
        if (jSONObject.length() == 0) {
            SwrveLogger.e("Campaign JSON empty, no campaigns downloaded", new Object[0]);
            this.B.clear();
            return;
        }
        SwrveLogger.e("Campaign JSON data: %s", jSONObject);
        try {
            if (jSONObject.has("version")) {
                String string = jSONObject.getString("version");
                if (!string.equals("2")) {
                    SwrveLogger.e("Campaign JSON (%s) has the wrong version for this sdk (%s). No campaigns loaded.", string, "2");
                    return;
                }
                m0(jSONObject);
                JSONObject jSONObject2 = jSONObject.getJSONObject("game_data");
                if (jSONObject2 != null) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        jSONObject2.getJSONObject(itKeys.next());
                    }
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject("rules");
                int i2 = jSONObject3.has("delay_first_message") ? jSONObject3.getInt("delay_first_message") : j0;
                long j = jSONObject3.has("max_messages_per_session") ? jSONObject3.getLong("max_messages_per_session") : k0;
                int i3 = jSONObject3.has("min_delay_between_messages") ? jSONObject3.getInt("min_delay_between_messages") : l0;
                Date dateB = B();
                Date dateB2 = SwrveHelper.b(this.Q, i2, 13);
                SwrveCampaignDisplayer swrveCampaignDisplayer = this.C;
                swrveCampaignDisplayer.c = dateB2;
                swrveCampaignDisplayer.e = i3;
                swrveCampaignDisplayer.f = j;
                SwrveLogger.e("App rules OK: Delay Seconds: %s Max shows: %s", Integer.valueOf(i2), Long.valueOf(j));
                SwrveLogger.e("Time is %s show messages after %s", dateB.toString(), dateB2.toString());
                JSONArray jSONArray = jSONObject.getJSONArray("campaigns");
                ArrayList arrayList = new ArrayList();
                i0(str);
                int length = jSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    arrayList.add(Integer.valueOf(jSONArray.getJSONObject(i4).getInt("id")));
                }
                boolean z2 = true;
                for (int size = this.B.size() - 1; size >= 0; size--) {
                    if (!arrayList.contains(Integer.valueOf(((SwrveBaseCampaign) this.B.get(size)).e()))) {
                        this.B.remove(size);
                    }
                }
                String str3 = null;
                HashMap mapH0 = h0(null);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet = new HashSet();
                int length2 = jSONArray.length();
                int i5 = 0;
                boolean z3 = false;
                while (i5 < length2) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i5);
                    HashSet hashSet2 = new HashSet();
                    if (jSONObject4.has("filters")) {
                        JSONArray jSONArray2 = jSONObject4.getJSONArray("filters");
                        int i6 = i;
                        zContains = z2;
                        str2 = str3;
                        while (i6 < jSONArray2.length() && zContains) {
                            String string2 = jSONArray2.getString(i6);
                            zContains = i0.contains(string2.toLowerCase(Locale.ENGLISH));
                            i6++;
                            str2 = string2;
                        }
                    } else {
                        zContains = true;
                        str2 = null;
                    }
                    if (zContains) {
                        SwrveBaseCampaign swrveInAppCampaign = jSONObject4.has("message") ? new SwrveInAppCampaign(this, this.C, jSONObject4, hashSet2, mapH0) : jSONObject4.has("embedded_message") ? new SwrveEmbeddedCampaign(this, this.C, jSONObject4) : null;
                        if (swrveInAppCampaign != null) {
                            hashSet.addAll(hashSet2);
                            SwrveCampaignState swrveCampaignState = (SwrveCampaignState) map.get(Integer.valueOf(swrveInAppCampaign.e()));
                            if (swrveCampaignState == null) {
                                z3 = true;
                            }
                            if (z && swrveCampaignState != null) {
                                swrveInAppCampaign.r(swrveCampaignState);
                            }
                            arrayList3.add(swrveInAppCampaign);
                            this.D.put(Integer.valueOf(swrveInAppCampaign.e()), swrveInAppCampaign.h());
                            SwrveLogger.e("Got campaign with id %s", Integer.valueOf(swrveInAppCampaign.e()));
                            if (QaUser.l()) {
                                if (swrveInAppCampaign instanceof SwrveInAppCampaign) {
                                    arrayList2.add(new QaCampaignInfo(swrveInAppCampaign.e(), ((SwrveInAppCampaign) swrveInAppCampaign).x(), swrveInAppCampaign.c(), false, ""));
                                } else if (swrveInAppCampaign instanceof SwrveEmbeddedCampaign) {
                                    arrayList2.add(new QaCampaignInfo(swrveInAppCampaign.e(), ((SwrveEmbeddedCampaign) swrveInAppCampaign).u().f19096a, swrveInAppCampaign.c(), false, ""));
                                }
                            }
                        }
                    } else {
                        SwrveLogger.e("Not all requirements were satisfied for this campaign: %s", str2);
                    }
                    i5++;
                    i = 0;
                    z2 = true;
                    str3 = null;
                }
                if (z3) {
                    i0(str);
                }
                try {
                    QaUser.j().e(arrayList2);
                } catch (Exception e) {
                    SwrveLogger.c("Error trying to queue campaigns-downloaded qalogevent.", e, new Object[0]);
                }
                ExecutorService executorService = this.x;
                if (executorService.isShutdown()) {
                    SwrveLogger.e("Trying to handle a downloadAssets execution while shutdown", new Object[0]);
                } else {
                    executorService.execute(new SwrveRunnables.AnonymousClass1(new n(this, hashSet, (k) new SwrveAssetsCompleteCallback() { // from class: com.swrve.sdk.k
                        @Override // com.swrve.sdk.SwrveAssetsCompleteCallback
                        public final void a(HashSet hashSet3, boolean z4) throws JSONException, SQLException {
                            SwrveImp swrveImp = this.f19083a;
                            SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = swrveImp.s;
                            if (!z4) {
                                try {
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put("swrve.asset.sha1_check", "fail");
                                    swrveImp.L(swrveImp.j.c(), jSONObject5);
                                    return;
                                } catch (Exception e2) {
                                    SwrveLogger.c("Exception queuing device update for failed sha1 verification.", e2, new Object[0]);
                                    return;
                                }
                            }
                            if (hashSet3 != null) {
                                long time = swrveImp.B().getTime();
                                Iterator it = hashSet3.iterator();
                                while (it.hasNext()) {
                                    String str4 = (String) it.next();
                                    SQLiteLocalStorage sQLiteLocalStorage = swrveMultiLayerLocalStorage.b;
                                    if (sQLiteLocalStorage != null && str4 != null && !str4.isEmpty() && sQLiteLocalStorage.f19085a.isOpen()) {
                                        int iG = sQLiteLocalStorage.g(str4) + 1;
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str4);
                                        contentValues.put("download_count", Integer.valueOf(iG));
                                        contentValues.put("last_download_time", Long.valueOf(time));
                                        sQLiteLocalStorage.j("asset_logs", contentValues, "name= ?", new String[]{str4});
                                    }
                                }
                            }
                            int i7 = SwrveImp.m0;
                            SQLiteLocalStorage sQLiteLocalStorage2 = swrveMultiLayerLocalStorage.b;
                            if (sQLiteLocalStorage2 != null) {
                                SQLiteDatabase sQLiteDatabase = sQLiteLocalStorage2.f19085a;
                                if (sQLiteDatabase.isOpen()) {
                                    sQLiteDatabase.beginTransaction();
                                    try {
                                        sQLiteDatabase.execSQL("DELETE FROM asset_logs WHERE name IN (" + ("SELECT name FROM asset_logs ORDER BY last_download_time DESC LIMIT -1 OFFSET " + i7) + ")");
                                        sQLiteDatabase.setTransactionSuccessful();
                                    } finally {
                                        sQLiteDatabase.endTransaction();
                                    }
                                }
                            }
                            swrveImp.I();
                        }
                    })));
                }
                this.B = new ArrayList(arrayList3);
            }
        } catch (JSONException e2) {
            SwrveLogger.c("Error parsing campaign JSON", e2, new Object[0]);
        }
    }

    public final void d0() throws NumberFormatException {
        try {
            String strC = this.s.c(this.j.c(), "SwrveCampaignSettings");
            if (SwrveHelper.p(strC)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strC);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    this.D.put(Integer.valueOf(Integer.parseInt(next)), new SwrveCampaignState(jSONObject.getJSONObject(next), B()));
                } catch (Exception e) {
                    SwrveLogger.c("Could not load state for campaign " + next, e, new Object[0]);
                }
            }
        } catch (JSONException e2) {
            SwrveLogger.c("Could not load state of campaigns, bad JSON", e2, new Object[0]);
        }
    }

    public final void e0(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        SwrveLogger.e("Push Inbox Messages JSON array: %s", jSONArray);
        if (this.g0 == null) {
            this.g0 = new SwrvePushInboxManager(P(), this.t, this.i, str, this.l.b.toString());
        }
        this.g0.a(jSONArray);
    }

    public final void f0(String str, String str2, HashMap map, Map map2, boolean z) {
        ISwrveEventListener iSwrveEventListener;
        if (this.j.b() == SwrveTrackingState.f) {
            SwrveLogger.b("SwrveSDK event sending paused so attempt to queue events has failed. Will auto retry when event sending resumes.", new Object[0]);
            this.d0.add(new EventQueueItem(str, str2, map, map2, z));
            return;
        }
        try {
            SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = this.s;
            QueueEventRunnable queueEventRunnable = new QueueEventRunnable();
            queueEventRunnable.d = swrveMultiLayerLocalStorage;
            queueEventRunnable.e = str;
            queueEventRunnable.f = str2;
            queueEventRunnable.g = map;
            queueEventRunnable.h = map2;
            l0(queueEventRunnable);
            if (!z || (iSwrveEventListener = this.m) == null) {
                return;
            }
            ((SwrveEventListener) iSwrveEventListener).b(EventHelper.e(str2, map), map2);
        } catch (Exception e) {
            SwrveLogger.c("Unable to queue event", e, new Object[0]);
        }
    }

    public final void g0(Runnable runnable) {
        ExecutorService executorService = this.w;
        try {
            if (executorService.isShutdown()) {
                SwrveLogger.e("Trying to handle a rest execution while shutdown", new Object[0]);
            } else {
                executorService.execute(new SwrveRunnables.AnonymousClass1(runnable));
            }
        } catch (Exception e) {
            SwrveLogger.c("Error while scheduling a rest execution", e, new Object[0]);
        }
    }

    public final HashMap h0(Map map) {
        HashMap map2 = this.E;
        if (SwrveHelper.q(map2)) {
            return null;
        }
        HashMap map3 = new HashMap();
        for (String str : map2.keySet()) {
            map3.put(YU.a.A("user.", str), (String) map2.get(str));
        }
        return map3;
    }

    public final void i0(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            HashMap map = this.D;
            if (map != null) {
                for (Integer num : map.keySet()) {
                    jSONObject.put(String.valueOf(num.intValue()), ((SwrveCampaignState) this.D.get(num)).b());
                }
            }
            l0(new p(this, str, jSONObject.toString(), 1));
        } catch (JSONException e) {
            SwrveLogger.c("Error saving campaigns settings", e, new Object[0]);
        }
    }

    public final void j0() {
        if (this.z != null) {
            SwrveLogger.b("SwrveSDK shutting down campaigns refresh timer.", new Object[0]);
            try {
                this.z.shutdown();
            } catch (Exception e) {
                SwrveLogger.c("Exception occurred shutting down campaignsAndResourcesExecutor", e, new Object[0]);
            }
            this.z = null;
        }
    }

    public final void k0(boolean z) {
        this.l.getClass();
        if (this.O) {
            if (this.z != null) {
                SwrveLogger.b("SwrveSDK not creating a new timer for refreshing campaigns because there is already an existing one.", new Object[0]);
                return;
            }
            if (z) {
                SwrveLogger.b("SwrveSDK sessionstart is true so executing an immediate refresh of campaigns before starting a delayed timer for refreshing campaigns.", new Object[0]);
                ((SwrveBase) this).R0();
                this.N = true;
            }
            SwrveLogger.b("SwrveSDK starting repeating delayed timer for refreshing campaigns.", new Object[0]);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            scheduledThreadPoolExecutor.scheduleWithFixedDelay(new e((SwrveBase) this, 2), 0L, this.H.longValue(), TimeUnit.MILLISECONDS);
            this.z = scheduledThreadPoolExecutor;
        }
    }

    public final void l0(Runnable runnable) {
        ExecutorService executorService = this.v;
        try {
            if (executorService.isShutdown()) {
                SwrveLogger.e("Trying to handle a storage execution while shutdown", new Object[0]);
            } else {
                executorService.execute(new SwrveRunnables.AnonymousClass1(runnable));
            }
        } catch (Exception e) {
            SwrveLogger.c("Error while scheduling a storage execution", e, new Object[0]);
        }
    }

    public final void m0(JSONObject jSONObject) throws JSONException {
        SwrveAssetsManagerImp swrveAssetsManagerImp = this.F;
        if (jSONObject.has("cdn_root")) {
            String string = jSONObject.getString("cdn_root");
            swrveAssetsManagerImp.b = string;
            SwrveLogger.e("CDN URL %s", string);
        } else if (jSONObject.has("cdn_paths")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("cdn_paths");
            String string2 = jSONObject2.getString("message_images");
            String string3 = jSONObject2.getString("message_fonts");
            swrveAssetsManagerImp.b = string2;
            swrveAssetsManagerImp.c = string3;
            SwrveLogger.e("CDN URL images:%s fonts:%s", string2, string3);
        }
    }
}
