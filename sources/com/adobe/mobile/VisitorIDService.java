package com.adobe.mobile;

import YU.a;
import android.content.SharedPreferences;
import androidx.camera.core.impl.b;
import com.adobe.mobile.StaticMethods;
import com.adobe.mobile.VisitorID;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlllll;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class VisitorIDService {
    public static VisitorIDService k;
    public static final Object l = new Object();

    /* renamed from: a, reason: collision with root package name */
    public long f13284a;
    public long b;
    public final String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public List i;
    public final ExecutorService j;

    /* renamed from: com.adobe.mobile.VisitorIDService$12, reason: invalid class name */
    class AnonymousClass12 implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public final String call() {
            return Analytics.a();
        }
    }

    /* renamed from: com.adobe.mobile.VisitorIDService$13, reason: invalid class name */
    class AnonymousClass13 implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public final String call() {
            return Config.a();
        }
    }

    /* renamed from: com.adobe.mobile.VisitorIDService$4, reason: invalid class name */
    class AnonymousClass4 implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public final String call() {
            return MobileConfig.b().C;
        }
    }

    /* renamed from: com.adobe.mobile.VisitorIDService$7, reason: invalid class name */
    class AnonymousClass7 implements Callable<Void> {
        @Override // java.util.concurrent.Callable
        public final Void call() {
            VisitorIDService.f(null);
            throw null;
        }
    }

    public VisitorIDService() throws ExecutionException, InterruptedException {
        String str;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.j = executorServiceNewSingleThreadExecutor;
        FutureTask futureTask = new FutureTask(new AnonymousClass4());
        executorServiceNewSingleThreadExecutor.execute(futureTask);
        try {
            str = (String) futureTask.get();
        } catch (Exception e) {
            StaticMethods.I("ID Service - Unable to retrieve marketing cloud server from configuration - using default value (%s)", e.getLocalizedMessage());
            str = null;
        }
        this.c = (str == null || str.isEmpty()) ? "dpm.demdex.net" : str;
        FutureTask futureTask2 = new FutureTask(new Callable<Void>() { // from class: com.adobe.mobile.VisitorIDService.1
            @Override // java.util.concurrent.Callable
            public final Void call() throws UnsupportedEncodingException {
                VisitorIDService visitorIDService = VisitorIDService.this;
                try {
                    VisitorIDService.e(visitorIDService, VisitorIDService.d(visitorIDService, StaticMethods.B().getString("ADBMOBILE_VISITORID_IDS", null)));
                    visitorIDService.d = StaticMethods.B().getString("ADBMOBILE_PERSISTED_MID", null);
                    visitorIDService.e = StaticMethods.B().getString("ADBMOBILE_PERSISTED_MID_HINT", null);
                    visitorIDService.f = StaticMethods.B().getString("ADBMOBILE_PERSISTED_MID_BLOB", null);
                    visitorIDService.f13284a = StaticMethods.B().getLong("ADBMOBILE_VISITORID_TTL", 0L);
                    visitorIDService.b = StaticMethods.B().getLong("ADBMOBILE_VISITORID_SYNC", 0L);
                    return null;
                } catch (StaticMethods.NullContextException e2) {
                    visitorIDService.d = null;
                    visitorIDService.e = null;
                    visitorIDService.f = null;
                    StaticMethods.J("Visitor - Unable to check for stored visitor ID due to context error (%s)", e2.getMessage());
                    return null;
                }
            }
        });
        this.j.execute(futureTask2);
        try {
            futureTask2.get();
        } catch (Exception e2) {
            StaticMethods.J("ID Service - Unable to initialize visitor ID variables(%s)", e2.getLocalizedMessage());
        }
        h(null, null, VisitorID.VisitorIDAuthenticationState.VISITOR_ID_AUTHENTICATION_STATE_UNKNOWN, false);
    }

    public static String a(String str, String str2, String str3) {
        if (str2.isEmpty() || str3 == null || str3.isEmpty()) {
            return str;
        }
        String strO = b.o(str2, "=", str3);
        return (str == null || str.isEmpty()) ? strO : b.o(str, lllqqql.c0063ccc0063c, strO);
    }

    public static String b(List list) throws UnsupportedEncodingException {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VisitorID visitorID = (VisitorID) it.next();
            sb.append("&d_cid_ic=");
            sb.append(StaticMethods.a(visitorID.f13283a));
            sb.append("%01");
            String strA = StaticMethods.a(visitorID.b);
            if (strA != null) {
                sb.append(strA);
            }
            sb.append("%01");
            sb.append(visitorID.c.d);
        }
        return sb.toString();
    }

    public static String c(Callable callable) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask).start();
        return (String) futureTask.get(100L, timeUnit);
    }

    public static ArrayList d(VisitorIDService visitorIDService, String str) {
        if (str == null) {
            return null;
        }
        List<String> listAsList = Arrays.asList(str.split("&"));
        ArrayList arrayList = new ArrayList();
        for (String str2 : listAsList) {
            if (str2.length() > 0) {
                int iIndexOf = str2.indexOf("=");
                if (iIndexOf == -1) {
                    StaticMethods.K("ID Service - Unable to load Customer ID from Shared Preferences: %s", str2);
                } else {
                    try {
                        str2.substring(0, iIndexOf);
                        String strSubstring = str2.substring(iIndexOf + 1, str2.length());
                        List listAsList2 = Arrays.asList(strSubstring.split("%01"));
                        if (listAsList2.size() != 3) {
                            StaticMethods.K("ID Service - Unable to load Customer ID from Shared Preferences, value was malformed: %s", strSubstring);
                        } else {
                            try {
                                arrayList.add(new VisitorID((String) listAsList2.get(0), (String) listAsList2.get(1), VisitorID.VisitorIDAuthenticationState.values()[Integer.parseInt((String) listAsList2.get(2))]));
                            } catch (IllegalStateException e) {
                                StaticMethods.K("ID Service - Unable to create ID after encoding:(%s)", e.getLocalizedMessage());
                            } catch (NumberFormatException e2) {
                                StaticMethods.K("ID Service - Unable to parse visitor ID: (%s) exception:(%s)", str2, e2.getLocalizedMessage());
                            }
                        }
                    } catch (IndexOutOfBoundsException e3) {
                        StaticMethods.K("ID Service - Unable to load Customer ID from Shared Preferences, name or value was malformed: %s (%s)", str2, e3.getLocalizedMessage());
                    }
                }
            }
        }
        return arrayList;
    }

    public static void e(VisitorIDService visitorIDService, List list) throws UnsupportedEncodingException {
        String string;
        visitorIDService.i = list;
        if (list == null) {
            string = null;
        } else {
            HashMap map = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VisitorID visitorID = (VisitorID) it.next();
                map.put(a.o(new StringBuilder(), visitorID.f13283a, ".id"), visitorID.b);
                map.put(a.o(new StringBuilder(), visitorID.f13283a, ".as"), Integer.valueOf(visitorID.c.d));
            }
            HashMap map2 = new HashMap();
            map2.put(lqlllll.lqqllll.k006B006Bk006B006B006B, StaticMethods.S(map));
            StringBuilder sb = new StringBuilder(2048);
            StaticMethods.P(sb, map2);
            string = sb.toString();
        }
        visitorIDService.g = string;
        visitorIDService.h = b(visitorIDService.i);
    }

    public static String f(VisitorIDService visitorIDService) {
        if (visitorIDService.d == null && MobileConfig.b().l != MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_OUT && MobileConfig.b().c()) {
            UUID uuidRandomUUID = UUID.randomUUID();
            long mostSignificantBits = uuidRandomUUID.getMostSignificantBits();
            long leastSignificantBits = uuidRandomUUID.getLeastSignificantBits();
            Locale locale = Locale.US;
            if (mostSignificantBits < 0) {
                mostSignificantBits = -mostSignificantBits;
            }
            Long lValueOf = Long.valueOf(mostSignificantBits);
            if (leastSignificantBits < 0) {
                leastSignificantBits = -leastSignificantBits;
            }
            String str = String.format(locale, "%019d%019d", lValueOf, Long.valueOf(leastSignificantBits));
            visitorIDService.d = str;
            StaticMethods.I("ID Service - generating mid locally (mid: %s, ttl: %d)", str, Long.valueOf(visitorIDService.f13284a));
            try {
                SharedPreferences.Editor editorC = StaticMethods.C();
                editorC.putString("ADBMOBILE_PERSISTED_MID", visitorIDService.d);
                editorC.commit();
            } catch (StaticMethods.NullContextException e) {
                StaticMethods.J("ID Service - Unable to persist identifiers to shared preferences(%s)", e.getLocalizedMessage());
            }
        }
        return visitorIDService.d;
    }

    public static VisitorIDService i() {
        VisitorIDService visitorIDService;
        synchronized (l) {
            try {
                if (k == null) {
                    k = new VisitorIDService();
                }
                visitorIDService = k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return visitorIDService;
    }

    public final String g() {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.adobe.mobile.VisitorIDService.3
            @Override // java.util.concurrent.Callable
            public final String call() {
                return VisitorIDService.f(VisitorIDService.this);
            }
        });
        this.j.execute(futureTask);
        try {
            return (String) futureTask.get();
        } catch (Exception e) {
            StaticMethods.J("ID Service - Unable to retrieve marketing cloud id from queue(%s)", e.getLocalizedMessage());
            return null;
        }
    }

    public final void h(Map map, Map map2, final VisitorID.VisitorIDAuthenticationState visitorIDAuthenticationState, final boolean z) {
        final HashMap map3 = map != null ? new HashMap(map) : null;
        final HashMap map4 = map2 != null ? new HashMap(map2) : null;
        this.j.execute(new Runnable() { // from class: com.adobe.mobile.VisitorIDService.2
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                ArrayList<VisitorID> arrayList;
                String string;
                JSONObject jSONObject;
                List list;
                String string2;
                String str;
                if (MobileConfig.b().c()) {
                    if (MobileConfig.b().l != MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_IN) {
                        StaticMethods.I("ID Service - Ignoring ID Sync due to privacy status not being opt in", new Object[0]);
                        return;
                    }
                    String str2 = MobileConfig.b().B;
                    long jE = StaticMethods.E();
                    VisitorIDService visitorIDService = VisitorIDService.this;
                    boolean z2 = jE - visitorIDService.b > visitorIDService.f13284a || z;
                    HashMap map5 = map3;
                    boolean z3 = map5 != null;
                    HashMap map6 = map4;
                    boolean z4 = map6 != null;
                    if (VisitorIDService.f(visitorIDService) == null || z3 || z4 || z2) {
                        StringBuilder sb = new StringBuilder(MobileConfig.b().f ? "https" : "http");
                        sb.append("://");
                        androidx.compose.ui.input.pointer.a.w(sb, visitorIDService.c, "/id?d_ver=2&d_rtbd=json&d_orgid=", str2);
                        if (VisitorIDService.f(visitorIDService) != null) {
                            sb.append("&d_mid=");
                            sb.append(VisitorIDService.f(visitorIDService));
                        }
                        if (visitorIDService.f != null) {
                            sb.append("&d_blob=");
                            sb.append(visitorIDService.f);
                        }
                        if (visitorIDService.e != null) {
                            sb.append("&dcs_region=");
                            sb.append(visitorIDService.e);
                        }
                        VisitorID.VisitorIDAuthenticationState visitorIDAuthenticationState2 = visitorIDAuthenticationState;
                        if (map5 == null) {
                            arrayList = null;
                        } else {
                            HashMap map7 = new HashMap(map5);
                            arrayList = new ArrayList();
                            for (Map.Entry entry : map7.entrySet()) {
                                try {
                                    arrayList.add(new VisitorID((String) entry.getKey(), (String) entry.getValue(), visitorIDAuthenticationState2));
                                } catch (IllegalStateException e) {
                                    StaticMethods.K("ID Service - Unable to create ID after encoding:(%s)", e.getLocalizedMessage());
                                }
                            }
                        }
                        String strB = VisitorIDService.b(arrayList);
                        if (strB != null) {
                            sb.append(strB);
                        }
                        if (map6 == null) {
                            string = null;
                        } else {
                            HashMap map8 = new HashMap(map6);
                            StringBuilder sb2 = new StringBuilder();
                            for (Map.Entry entry2 : map8.entrySet()) {
                                sb2.append("&d_cid=");
                                sb2.append(StaticMethods.a((String) entry2.getKey()));
                                sb2.append("%01");
                                sb2.append(StaticMethods.a((String) entry2.getValue()));
                            }
                            string = sb2.toString();
                        }
                        if (string != null) {
                            sb.append(string);
                        }
                        if (MobileConfig.b().D) {
                            sb.append("&d_coop_unsafe=1");
                        }
                        String string3 = sb.toString();
                        StaticMethods.I("ID Service - Sending id sync call (%s)", string3);
                        byte[] bArrB = RequestHandler.b(5000, 5000, string3, "ID Service");
                        if (bArrB == null) {
                            jSONObject = null;
                        } else {
                            try {
                                jSONObject = new JSONObject(new String(bArrB, "UTF-8"));
                            } catch (UnsupportedEncodingException e2) {
                                StaticMethods.J("ID Service - Unable to decode response(%s)", e2.getLocalizedMessage());
                            } catch (JSONException e3) {
                                StaticMethods.I("ID Service - Unable to parse response(%s)", e3.getLocalizedMessage());
                            }
                        }
                        if (jSONObject != null && jSONObject.has("d_mid") && !jSONObject.has("error_msg")) {
                            try {
                                if (jSONObject.has("d_blob")) {
                                    visitorIDService.f = jSONObject.getString("d_blob");
                                }
                                if (jSONObject.has("dcs_region")) {
                                    visitorIDService.e = jSONObject.getString("dcs_region");
                                }
                                if (jSONObject.has("id_sync_ttl")) {
                                    visitorIDService.f13284a = jSONObject.getInt("id_sync_ttl");
                                }
                                String str3 = "";
                                if (jSONObject.has("d_optout") && jSONObject.getJSONArray("d_optout").length() > 0) {
                                    MobileConfig.b().o();
                                    str3 = ", global privacy status: opted out";
                                }
                                StaticMethods.I("ID Service - Got ID Response (mid: %s, blob: %s, hint: %s, ttl: %d%s)", VisitorIDService.f(visitorIDService), visitorIDService.f, visitorIDService.e, Long.valueOf(visitorIDService.f13284a), str3);
                            } catch (JSONException e4) {
                                StaticMethods.I("ID Service - Error parsing response (%s)", e4.getLocalizedMessage());
                            }
                        } else if (jSONObject != null && jSONObject.has("error_msg")) {
                            try {
                                StaticMethods.J("ID Service - Service returned error (%s)", jSONObject.getString("error_msg"));
                            } catch (JSONException e5) {
                                StaticMethods.J("ID Service - Unable to read error condition(%s)", e5.getLocalizedMessage());
                            }
                        }
                        visitorIDService.b = StaticMethods.E();
                        if (arrayList == null) {
                            list = visitorIDService.i;
                        } else {
                            ArrayList arrayList2 = visitorIDService.i != null ? new ArrayList(visitorIDService.i) : new ArrayList();
                            for (VisitorID visitorID : arrayList) {
                                Iterator it = arrayList2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        VisitorID visitorID2 = (VisitorID) it.next();
                                        if (visitorID2.f13283a.equals(visitorID.f13283a)) {
                                            visitorID2.c = visitorID.c;
                                            visitorID2.b = visitorID.b;
                                            break;
                                        }
                                    } else {
                                        try {
                                            arrayList2.add(visitorID);
                                            break;
                                        } catch (IllegalStateException e6) {
                                            StaticMethods.K("ID Service - Unable to create ID after encoding:(%s)", e6.getLocalizedMessage());
                                        }
                                    }
                                }
                            }
                            list = arrayList2;
                        }
                        VisitorIDService.e(visitorIDService, list);
                        List<VisitorID> list2 = visitorIDService.i;
                        if (list2 == null) {
                            string2 = null;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            for (VisitorID visitorID3 : list2) {
                                sb3.append("&d_cid_ic=");
                                sb3.append(visitorID3.f13283a);
                                sb3.append("%01");
                                String str4 = visitorID3.b;
                                if (str4 != null) {
                                    sb3.append(str4);
                                }
                                sb3.append("%01");
                                sb3.append(visitorID3.c.d);
                            }
                            string2 = sb3.toString();
                        }
                        String strF = VisitorIDService.f(visitorIDService);
                        String str5 = visitorIDService.e;
                        String str6 = visitorIDService.f;
                        long j = visitorIDService.f13284a;
                        long j2 = visitorIDService.b;
                        if (StaticMethods.e || !MobileConfig.b().l()) {
                            str = string2;
                        } else {
                            try {
                                Class clsA = WearableFunctionBridge.a();
                                Class cls = Long.TYPE;
                                str = string2;
                                try {
                                    clsA.getDeclaredMethod("syncVidService", String.class, String.class, String.class, cls, cls, String.class).invoke(null, strF, str5, str6, Long.valueOf(j), Long.valueOf(j2), string2);
                                } catch (Exception e7) {
                                    e = e7;
                                    StaticMethods.I("Wearable - Unable to sync visitor id service (%s)", e.getLocalizedMessage());
                                    SharedPreferences.Editor editorC = StaticMethods.C();
                                    editorC.putString("ADBMOBILE_VISITORID_IDS", str);
                                    editorC.putString("ADBMOBILE_PERSISTED_MID", VisitorIDService.f(visitorIDService));
                                    editorC.putString("ADBMOBILE_PERSISTED_MID_HINT", visitorIDService.e);
                                    editorC.putString("ADBMOBILE_PERSISTED_MID_BLOB", visitorIDService.f);
                                    editorC.putLong("ADBMOBILE_VISITORID_TTL", visitorIDService.f13284a);
                                    editorC.putLong("ADBMOBILE_VISITORID_SYNC", visitorIDService.b);
                                    editorC.commit();
                                }
                            } catch (Exception e8) {
                                e = e8;
                                str = string2;
                            }
                        }
                        try {
                            SharedPreferences.Editor editorC2 = StaticMethods.C();
                            editorC2.putString("ADBMOBILE_VISITORID_IDS", str);
                            editorC2.putString("ADBMOBILE_PERSISTED_MID", VisitorIDService.f(visitorIDService));
                            editorC2.putString("ADBMOBILE_PERSISTED_MID_HINT", visitorIDService.e);
                            editorC2.putString("ADBMOBILE_PERSISTED_MID_BLOB", visitorIDService.f);
                            editorC2.putLong("ADBMOBILE_VISITORID_TTL", visitorIDService.f13284a);
                            editorC2.putLong("ADBMOBILE_VISITORID_SYNC", visitorIDService.b);
                            editorC2.commit();
                        } catch (StaticMethods.NullContextException e9) {
                            StaticMethods.J("ID Service - Unable to persist identifiers to shared preferences(%s)", e9.getLocalizedMessage());
                        }
                    }
                }
            }
        });
    }
}
