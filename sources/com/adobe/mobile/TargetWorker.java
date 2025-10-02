package com.adobe.mobile;

import YU.a;
import android.content.SharedPreferences;
import com.adobe.mobile.StaticMethods;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class TargetWorker {

    /* renamed from: a, reason: collision with root package name */
    public static final List f13282a = Arrays.asList("mbox", "parameters", "product", "order", "content", "eventTokens", "clientSideAnalyticsLoggingPayload", "errorType", "profileScriptToken", "clickToken");
    public static final List b = Arrays.asList("mbox", "profileScriptToken", "clickToken");
    public static HashMap c = new HashMap();
    public static final ArrayList d = new ArrayList();
    public static final HashMap e = new HashMap();
    public static String f = null;
    public static String g = null;
    public static String h = null;
    public static HashMap i = null;
    public static final Object j = new Object();
    public static final Object k = new Object();
    public static final Object l = new Object();
    public static final Object m = new Object();
    public static String n = null;
    public static long o = 0;
    public static final Object p = new Object();
    public static boolean q = false;

    public static class TargetBatchRunner implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            String str;
            TargetWorker.q();
            TargetPreviewManager targetPreviewManagerD = TargetPreviewManager.d();
            synchronized (targetPreviewManagerD.f) {
                str = targetPreviewManagerD.e;
            }
            if (!TargetWorker.k(str)) {
                throw null;
            }
            throw null;
        }
    }

    public static class TargetClickNotification implements Runnable {
        @Override // java.lang.Runnable
        public final void run() throws JSONException {
            JSONObject jSONObject;
            JSONObject jSONObjectE;
            if (TargetWorker.c.containsKey(null)) {
                jSONObject = (JSONObject) TargetWorker.c.get(null);
            } else {
                HashMap map = TargetWorker.e;
                if (!map.containsKey(null)) {
                    StaticMethods.K("Target - couldn't send click notification for %s, the location should be pre-fetched/loaded before", null);
                    return;
                }
                jSONObject = (JSONObject) map.get(null);
            }
            if (TargetWorker.k(jSONObject != null ? jSONObject.optString("clickToken") : null)) {
                StaticMethods.K("Target - couldn't send click notification for %s, the location doesn't have click metrics enabled", null);
                return;
            }
            HashMap mapF = TargetWorker.f();
            if (jSONObject == null) {
                jSONObjectE = null;
            } else {
                try {
                    jSONObjectE = TargetJsonBuilder.e(new JSONObject(jSONObject.toString()));
                    jSONObjectE.remove("eventTokens");
                    jSONObjectE.put("type", "click");
                    JSONObject jSONObjectB = TargetJsonBuilder.b(mapF);
                    if (jSONObjectB.length() > 0) {
                        jSONObjectE.put("parameters", jSONObjectB);
                    }
                } catch (JSONException unused) {
                    StaticMethods.K("Target - failed to create JSON object for location click notification (%s)", jSONObject.toString());
                }
            }
            ArrayList arrayList = TargetWorker.d;
            arrayList.add(jSONObjectE);
            try {
                JSONObject jSONObjectC = TargetJsonBuilder.c(arrayList, TargetWorker.f());
                String strA = TargetWorker.a();
                TargetWorker.h();
                StaticMethods.I("Target - sending click notification to url \"%s\" with parameters: %s", strA, jSONObjectC.toString());
                JSONObject jSONObjectB2 = TargetWorker.b(RequestHandler.c(strA, "POST", null, jSONObjectC.toString(), "application/json", MobileConfig.b().p, "Target"), strA);
                if (jSONObjectB2 == null) {
                    return;
                }
                TargetWorker.r();
                arrayList.clear();
                TargetWorker.c(jSONObjectB2);
                StaticMethods.I("Target - click notification successfully sent for mbox (%s) with url \"%s\" with parameters: %s", null, strA, jSONObjectC.toString());
            } catch (JSONException e) {
                StaticMethods.K("Target - couldn't create the target click notification %s", e.getLocalizedMessage());
            }
        }
    }

    public static class TargetPrefetchRunner implements Runnable {
        @Override // java.lang.Runnable
        public final void run() throws JSONException {
            try {
                ArrayList arrayList = TargetWorker.d;
                JSONObject jSONObjectC = TargetJsonBuilder.c(arrayList, TargetWorker.f());
                String strA = TargetWorker.a();
                StaticMethods.I("Target - requesting content from url \"%s\" with session id: \"%s\" and parameters: %s", strA, TargetWorker.h(), jSONObjectC.toString());
                JSONObject jSONObjectB = TargetWorker.b(RequestHandler.c(strA, "POST", null, jSONObjectC.toString(), "application/json", MobileConfig.b().p, "Target"), strA);
                if (jSONObjectB == null) {
                    return;
                }
                try {
                    StaticMethods.I("Target - prefetch response received %s", jSONObjectB.toString());
                    TargetWorker.r();
                    TargetWorker.c(jSONObjectB);
                    HashMap mapD = TargetWorker.d(jSONObjectB);
                    if (mapD == null || mapD.isEmpty()) {
                        return;
                    }
                    arrayList.clear();
                    HashMap map = TargetWorker.c;
                    if (map != null) {
                        map.putAll(mapD);
                    } else {
                        TargetWorker.c = mapD;
                    }
                    TargetWorker.e();
                } catch (NullPointerException e) {
                    StaticMethods.J("Target - NullPointerException while trying to get content from the response (%s)", e.getLocalizedMessage());
                } catch (JSONException e2) {
                    StaticMethods.J("Target - JSONException while trying to get content from the response (%s)", e2.getLocalizedMessage());
                }
            } catch (JSONException e3) {
                StaticMethods.K("Target - couldn't create the target prefetch request %s", e3.getLocalizedMessage());
            }
        }
    }

    public static String a() {
        String strG;
        String str = MobileConfig.b().o;
        synchronized (p) {
            strG = null;
            if (l()) {
                h = null;
                try {
                    SharedPreferences.Editor editorC = StaticMethods.C();
                    editorC.remove("ADBMOBILE_TARGET_EDGE_HOST");
                    editorC.commit();
                } catch (StaticMethods.NullContextException unused) {
                    StaticMethods.J("Target - Error persisting edge host in shared preferences - application context is null", new Object[0]);
                }
                strG = h;
            } else if (k(h)) {
                try {
                    h = StaticMethods.B().getString("ADBMOBILE_TARGET_EDGE_HOST", null);
                    strG = h;
                } catch (StaticMethods.NullContextException unused2) {
                    StaticMethods.J("Target - Error retrieving edge host from shared preferences - application context is null", new Object[0]);
                }
            } else {
                strG = h;
            }
        }
        if (k(strG)) {
            strG = a.g(str, ".tt.omtrdc.net");
        }
        String strH = h();
        StringBuilder sbV = a.v("https://", strG, "/rest/v2/batchmbox/?client=", str, "&sessionId=");
        sbV.append(strH);
        return sbV.toString();
    }

    public static JSONObject b(NetworkObject networkObject, String str) throws JSONException {
        String string;
        if (networkObject == null) {
            StaticMethods.J("Target - unable to open connection (%s)", str);
            return null;
        }
        if (k(networkObject.b)) {
            StaticMethods.I("Target - Response was empty", new Object[0]);
            int i2 = networkObject.f13277a;
            if (i2 >= 400 && i2 <= 499) {
                d.clear();
            }
            return null;
        }
        int i3 = networkObject.f13277a;
        if (i3 != 200) {
            StaticMethods.I("Target - Response code from Target server (%d) was invalid, returning default content", Integer.valueOf(i3));
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(networkObject.b);
            try {
                string = jSONObject.getString("message");
            } catch (JSONException unused) {
                string = null;
            }
            if (k(string)) {
                return jSONObject;
            }
            StaticMethods.I("Target - An error was reported by the server (%s)", new Object[0]);
            return null;
        } catch (JSONException e2) {
            StaticMethods.J("Target - JSONException while trying to get target response (%s)", e2.getLocalizedMessage());
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x001b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    public static void c(org.json.JSONObject r3) throws org.json.JSONException {
        /*
            java.lang.String r0 = "id"
            r1 = 0
            org.json.JSONObject r2 = r3.getJSONObject(r0)     // Catch: org.json.JSONException -> L1b
            if (r2 != 0) goto Ld
            p(r1)     // Catch: org.json.JSONException -> L1b
            goto L1e
        Ld:
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch: org.json.JSONException -> L1b
            java.lang.String r2 = "tntId"
            java.lang.String r0 = r0.getString(r2)     // Catch: org.json.JSONException -> L1b
            p(r0)     // Catch: org.json.JSONException -> L1b
            goto L1e
        L1b:
            p(r1)
        L1e:
            java.lang.String r0 = "edgeHost"
            java.lang.String r3 = r3.getString(r0)     // Catch: org.json.JSONException -> L28
            n(r3)     // Catch: org.json.JSONException -> L28
            goto L2b
        L28:
            n(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.mobile.TargetWorker.c(org.json.JSONObject):void");
    }

    public static HashMap d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        HashMap map = new HashMap();
        if (!jSONObject.has("prefetchResponses") || (jSONArray = jSONObject.getJSONArray("prefetchResponses")) == null) {
            return null;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
            if (jSONObject3 == null || jSONObject3.length() == 0) {
                jSONObject2 = null;
            } else {
                try {
                    jSONObject2 = new JSONObject(jSONObject3.toString());
                    try {
                        Iterator<String> itKeys = jSONObject3.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (!f13282a.contains(next)) {
                                jSONObject2.remove(next);
                            }
                        }
                    } catch (JSONException unused) {
                        StaticMethods.K("Target - failed to parse prefetch mbox response for %s", jSONObject3.toString());
                        if (jSONObject2 == null) {
                        }
                    }
                } catch (JSONException unused2) {
                    jSONObject2 = null;
                }
            }
            if (jSONObject2 == null && jSONObject2.length() > 0 && jSONObject2.has("mbox")) {
                map.put(jSONObject2.getString("mbox"), jSONObject2);
            }
        }
        return map;
    }

    public static void e() {
        for (String str : c.keySet()) {
            if (str != null) {
                HashMap map = e;
                if (map.containsKey(str)) {
                    map.remove(str);
                }
            }
        }
    }

    public static HashMap f() {
        String string;
        HashMap map = new HashMap();
        HashMap mapI = Lifecycle.i();
        if (!mapI.isEmpty()) {
            map.putAll(mapI);
        }
        BigDecimal bigDecimalA = AnalyticsTrackLifetimeValueIncrease.a();
        if (bigDecimalA != null && (string = bigDecimalA.toString()) != null) {
            synchronized (l) {
                try {
                    if (i == null) {
                        i = new HashMap();
                    }
                    i.put("a.ltv.amount", string);
                } finally {
                }
            }
        }
        synchronized (l) {
            try {
                HashMap map2 = i;
                if (!(map2 == null || map2.isEmpty())) {
                    map.putAll(i);
                }
            } finally {
            }
        }
        return map;
    }

    public static String g() {
        String str = null;
        try {
            SharedPreferences sharedPreferencesB = StaticMethods.B();
            if (sharedPreferencesB.contains("mboxPC".concat("_Expires"))) {
                if (sharedPreferencesB.getLong("mboxPC".concat("_Expires"), 0L) > System.currentTimeMillis()) {
                    String string = sharedPreferencesB.getString("mboxPC".concat("_Value"), "");
                    if (string.length() > 0) {
                        str = string;
                    }
                }
                SharedPreferences.Editor editorC = StaticMethods.C();
                editorC.remove("mboxPC".concat("_Value"));
                editorC.remove("mboxPC".concat("_Expires"));
                editorC.commit();
            }
            return str;
        } catch (StaticMethods.NullContextException unused) {
            StaticMethods.J("Target - Error retrieving shared preferences - application context is null", new Object[0]);
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x000c, B:12:0x0023, B:14:0x002b, B:21:0x0054, B:22:0x0056, B:16:0x0031, B:17:0x003b, B:20:0x0051, B:19:0x004a, B:11:0x001c), top: B:30:0x0003, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String h() {
        /*
            java.lang.Object r0 = com.adobe.mobile.TargetWorker.p
            monitor-enter(r0)
            java.lang.String r1 = com.adobe.mobile.TargetWorker.n     // Catch: java.lang.Throwable -> L1a
            boolean r1 = k(r1)     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            if (r1 == 0) goto L23
            android.content.SharedPreferences r1 = com.adobe.mobile.StaticMethods.B()     // Catch: java.lang.Throwable -> L1a com.adobe.mobile.StaticMethods.NullContextException -> L1c
            java.lang.String r3 = "ADBMOBILE_TARGET_SESSION_ID"
            r4 = 0
            java.lang.String r1 = r1.getString(r3, r4)     // Catch: java.lang.Throwable -> L1a com.adobe.mobile.StaticMethods.NullContextException -> L1c
            com.adobe.mobile.TargetWorker.n = r1     // Catch: java.lang.Throwable -> L1a com.adobe.mobile.StaticMethods.NullContextException -> L1c
            goto L23
        L1a:
            r1 = move-exception
            goto L58
        L1c:
            java.lang.String r1 = "Target - Error retrieving shared preferences - application context is null"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1a
            com.adobe.mobile.StaticMethods.J(r1, r3)     // Catch: java.lang.Throwable -> L1a
        L23:
            java.lang.String r1 = com.adobe.mobile.TargetWorker.n     // Catch: java.lang.Throwable -> L1a
            boolean r1 = k(r1)     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L31
            boolean r1 = l()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L54
        L31:
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            com.adobe.mobile.TargetWorker.n = r1     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences$Editor r1 = com.adobe.mobile.StaticMethods.C()     // Catch: java.lang.Throwable -> L1a com.adobe.mobile.StaticMethods.NullContextException -> L4a
            java.lang.String r3 = "ADBMOBILE_TARGET_SESSION_ID"
            java.lang.String r4 = com.adobe.mobile.TargetWorker.n     // Catch: java.lang.Throwable -> L1a com.adobe.mobile.StaticMethods.NullContextException -> L4a
            r1.putString(r3, r4)     // Catch: java.lang.Throwable -> L1a com.adobe.mobile.StaticMethods.NullContextException -> L4a
            r1.commit()     // Catch: java.lang.Throwable -> L1a com.adobe.mobile.StaticMethods.NullContextException -> L4a
            goto L51
        L4a:
            java.lang.String r1 = "Target - Error storing session id in shared preferences - application context is null"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1a
            com.adobe.mobile.StaticMethods.J(r1, r2)     // Catch: java.lang.Throwable -> L1a
        L51:
            r()     // Catch: java.lang.Throwable -> L1a
        L54:
            java.lang.String r1 = com.adobe.mobile.TargetWorker.n     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r1
        L58:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.mobile.TargetWorker.h():java.lang.String");
    }

    public static String i() {
        String str;
        synchronized (k) {
            if (k(g)) {
                try {
                    g = StaticMethods.B().getString("ADBMOBILE_TARGET_3RD_PARTY_ID", null);
                } catch (StaticMethods.NullContextException unused) {
                    StaticMethods.J("Target - Error retrieving shared preferences - application context is null", new Object[0]);
                    return null;
                }
            }
            str = g;
        }
        return str;
    }

    public static String j() {
        String str;
        q();
        synchronized (j) {
            if (k(f)) {
                try {
                    f = StaticMethods.B().getString("ADBMOBILE_TARGET_TNT_ID", null);
                } catch (StaticMethods.NullContextException unused) {
                    StaticMethods.J("Target - Error retrieving shared preferences - application context is null", new Object[0]);
                    return null;
                }
            }
            str = f;
        }
        return str;
    }

    public static boolean k(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean l() {
        boolean z;
        long j2;
        synchronized (p) {
            z = false;
            if (o <= 0) {
                try {
                    o = StaticMethods.B().getLong("ADBMOBILE_TARGET_LAST_TIMESTAMP", 0L);
                } catch (StaticMethods.NullContextException unused) {
                    StaticMethods.J("Target - Error retrieving shared preferences - application context is null", new Object[0]);
                }
                long jE = StaticMethods.E();
                int i2 = MobileConfig.b().r;
                j2 = o;
                if (j2 > 0 && jE - j2 > i2) {
                    z = true;
                }
            } else {
                long jE2 = StaticMethods.E();
                int i22 = MobileConfig.b().r;
                j2 = o;
                if (j2 > 0) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static void m(String str) {
        synchronized (l) {
            try {
                HashMap map = i;
                if (map != null) {
                    map.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void n(String str) {
        synchronized (p) {
            try {
                String str2 = h;
                if (!(str2 == null && str == null) && (str2 == null || !str2.equals(str))) {
                    h = str;
                    try {
                        SharedPreferences.Editor editorC = StaticMethods.C();
                        if (k(h)) {
                            editorC.remove("ADBMOBILE_TARGET_EDGE_HOST");
                        } else {
                            editorC.putString("ADBMOBILE_TARGET_EDGE_HOST", h);
                        }
                        editorC.commit();
                    } catch (StaticMethods.NullContextException unused) {
                        StaticMethods.J("Target - Error persisting edge host in shared preferences - application context is null", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void o() {
        synchronized (k) {
            try {
                i();
                g = null;
                try {
                    SharedPreferences.Editor editorC = StaticMethods.C();
                    if (k(g)) {
                        editorC.remove("ADBMOBILE_TARGET_3RD_PARTY_ID");
                    } else {
                        editorC.putString("ADBMOBILE_TARGET_3RD_PARTY_ID", g);
                    }
                    editorC.commit();
                } catch (StaticMethods.NullContextException unused) {
                    StaticMethods.J("Target - Error retrieving shared preferences - application context is null", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void p(String str) {
        synchronized (j) {
            try {
                String strSubstring = f;
                boolean zEquals = true;
                if (strSubstring != null || str != null) {
                    if (strSubstring == null || str == null) {
                        zEquals = false;
                    } else if (!strSubstring.equals(str)) {
                        int iIndexOf = strSubstring.indexOf(46);
                        if (iIndexOf != -1) {
                            strSubstring = strSubstring.substring(0, iIndexOf);
                        }
                        int iIndexOf2 = str.indexOf(46);
                        zEquals = strSubstring.equals(iIndexOf2 == -1 ? str : str.substring(0, iIndexOf2));
                    }
                }
                if (zEquals) {
                    return;
                }
                f = str;
                try {
                    SharedPreferences.Editor editorC = StaticMethods.C();
                    if (k(f)) {
                        editorC.remove("ADBMOBILE_TARGET_TNT_ID");
                    } else {
                        editorC.putString("ADBMOBILE_TARGET_TNT_ID", f);
                    }
                    editorC.commit();
                } catch (StaticMethods.NullContextException unused) {
                    StaticMethods.J("Target - Error retrieving shared preferences - application context is null", new Object[0]);
                }
            } finally {
            }
        }
    }

    public static void q() {
        synchronized (m) {
            try {
                if (q) {
                    return;
                }
                String strG = g();
                if (strG != null) {
                    p(strG);
                }
                q = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void r() {
        synchronized (p) {
            o = StaticMethods.E();
            try {
                SharedPreferences.Editor editorC = StaticMethods.C();
                editorC.putLong("ADBMOBILE_TARGET_LAST_TIMESTAMP", o);
                editorC.commit();
            } catch (StaticMethods.NullContextException unused) {
                StaticMethods.J("Target - Error persisting session id timestamp in shared preferences - application context is null", new Object[0]);
            }
        }
    }
}
