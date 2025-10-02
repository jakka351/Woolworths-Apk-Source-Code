package com.adobe.mobile;

import YU.a;
import android.content.SharedPreferences;
import com.adobe.mobile.StaticMethods;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class AudienceManagerWorker {

    /* renamed from: a, reason: collision with root package name */
    public static HashMap f13262a = null;
    public static volatile boolean b = true;
    public static String c = null;
    public static volatile boolean d = true;

    /* renamed from: com.adobe.mobile.AudienceManagerWorker$1, reason: invalid class name */
    final class AnonymousClass1 implements Callable<HashMap<String, Object>> {
        @Override // java.util.concurrent.Callable
        public final HashMap<String, Object> call() {
            if (AudienceManagerWorker.b) {
                try {
                    String string = StaticMethods.B().getString("AAMUserProfile", null);
                    if (string != null && string.length() > 0) {
                        try {
                            AudienceManagerWorker.f13262a = StaticMethods.L(new JSONObject(string));
                        } catch (JSONException e) {
                            StaticMethods.K("Audience Manager - Problem accessing profile data (%s)", e.getLocalizedMessage());
                        }
                        AudienceManagerWorker.b = false;
                    }
                } catch (StaticMethods.NullContextException e2) {
                    StaticMethods.J("Audience Manager - Problem accessing profile data (%s)", e2.getMessage());
                }
            }
            return AudienceManagerWorker.f13262a;
        }
    }

    /* renamed from: com.adobe.mobile.AudienceManagerWorker$2, reason: invalid class name */
    final class AnonymousClass2 implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public final String call() {
            return null;
        }
    }

    /* renamed from: com.adobe.mobile.AudienceManagerWorker$3, reason: invalid class name */
    final class AnonymousClass3 implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public final String call() {
            return null;
        }
    }

    /* renamed from: com.adobe.mobile.AudienceManagerWorker$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            MobilePrivacyStatus mobilePrivacyStatus = MobileConfig.b().l;
        }
    }

    /* renamed from: com.adobe.mobile.AudienceManagerWorker$5, reason: invalid class name */
    final class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            String string;
            String str = MobileConfig.b().s;
            String strC = AudienceManagerWorker.c();
            String strG = VisitorIDService.i().g();
            String str2 = MobileConfig.b().B;
            String[] strArr = StaticMethods.f13279a;
            if (strC != null && !strC.isEmpty() && str != null && !str.isEmpty()) {
                string = a.i("https://", str, "/demoptout.jpg?d_uuid=", strC);
            } else {
                if (strG == null || strG.isEmpty() || str2 == null || str2.isEmpty()) {
                    return;
                }
                StringBuilder sbV = a.v("https://", VisitorIDService.i().c, "/demoptout.jpg?d_mid=", strG, "&d_orgid=");
                sbV.append(str2);
                string = sbV.toString();
            }
            StaticMethods.I("Audience Manager - Opting user out of server-side segments.", new Object[0]);
            RequestHandler.d(string);
        }
    }

    /* renamed from: com.adobe.mobile.AudienceManagerWorker$6, reason: invalid class name */
    final class AnonymousClass6 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: com.adobe.mobile.AudienceManagerWorker$7, reason: invalid class name */
    final class AnonymousClass7 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            AudienceManagerWorker.e(null);
            AudienceManagerWorker.f(null);
        }
    }

    public static class SubmitSignalTask implements Runnable {
        public final HashMap d;

        /* renamed from: com.adobe.mobile.AudienceManagerWorker$SubmitSignalTask$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public SubmitSignalTask(HashMap map) {
            this.d = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HashMap map = new HashMap();
            try {
                if (MobileConfig.b().k()) {
                    if (MobileConfig.b().l == MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_OUT) {
                        StaticMethods.I("Audience Manager - Privacy status is set to opt out, no signals will be submitted.", new Object[0]);
                        return;
                    }
                    String strG = AudienceManagerWorker.g(this.d);
                    if (strG.length() <= 1) {
                        StaticMethods.K("Audience Manager - Unable to create URL object", new Object[0]);
                        return;
                    }
                    StaticMethods.I("Audience Manager - request (%s)", strG);
                    byte[] bArrB = RequestHandler.b(MobileConfig.b().u * 1000, 2000, strG, "Audience Manager");
                    String str = "";
                    if (bArrB != null && bArrB.length > 0) {
                        str = new String(bArrB, "UTF-8");
                    }
                    map.putAll(AudienceManagerWorker.h(new JSONObject(str)));
                }
            } catch (UnsupportedEncodingException e) {
                StaticMethods.K("Audience Manager - Unable to decode server response (%s)", e.getLocalizedMessage());
            } catch (JSONException e2) {
                StaticMethods.K("Audience Manager - Unable to parse JSON data (%s)", e2.getLocalizedMessage());
            } catch (Exception e3) {
                StaticMethods.K("Audience Manager - Unexpected error parsing result (%s)", e3.getLocalizedMessage());
            } finally {
            }
        }
    }

    public static String a() {
        FutureTask futureTask = new FutureTask(new AnonymousClass3());
        StaticMethods.n().execute(futureTask);
        try {
            return (String) futureTask.get();
        } catch (Exception e) {
            StaticMethods.J("Audience Manager - Unable to get Dpid (%s)", e.getMessage());
            return null;
        }
    }

    public static String b() {
        FutureTask futureTask = new FutureTask(new AnonymousClass2());
        StaticMethods.n().execute(futureTask);
        try {
            return (String) futureTask.get();
        } catch (Exception e) {
            StaticMethods.J("Audience Manager - Unable to get Dpid (%s)", e.getMessage());
            return null;
        }
    }

    public static String c() {
        try {
            return StaticMethods.B().getString("AAMUserId", null);
        } catch (StaticMethods.NullContextException e) {
            StaticMethods.J("Audience Manager - Error getting uuid from shared preferences (%s).", e.getMessage());
            return null;
        }
    }

    public static String d() {
        if (d && MobileConfig.b().k()) {
            d = false;
            c = androidx.constraintlayout.core.state.a.i(MobileConfig.b().f ? "https" : "http", "://", MobileConfig.b().s, "/event?");
        }
        return c;
    }

    public static void e(String str) {
        if (str == null || str.isEmpty() || MobileConfig.b().l != MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_OUT) {
            try {
                SharedPreferences.Editor editorC = StaticMethods.C();
                if (str == null) {
                    editorC.remove("AAMUserId");
                } else {
                    editorC.putString("AAMUserId", str);
                }
                editorC.commit();
            } catch (StaticMethods.NullContextException e) {
                StaticMethods.J("Audience Manager - Error updating uuid in shared preferences (%s)", e.getMessage());
            }
        }
    }

    public static void f(HashMap map) {
        b = false;
        try {
            SharedPreferences.Editor editorC = StaticMethods.C();
            if (map == null || map.size() <= 0) {
                editorC.remove("AAMUserProfile");
                f13262a = null;
            } else {
                editorC.putString("AAMUserProfile", new JSONObject(map).toString());
                f13262a = new HashMap(map);
            }
            editorC.commit();
        } catch (StaticMethods.NullContextException e) {
            StaticMethods.J("Audience Manager - Error updating visitor profile (%s)", e.getMessage());
        }
    }

    public static String g(HashMap map) throws ExecutionException, InterruptedException {
        String string;
        if (d() == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(d());
        if (map.size() <= 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder(1024);
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (str != null && str.length() > 0 && value != null && value.toString().length() > 0 && entry.getValue().getClass() == String.class) {
                    sb2.append("&c_");
                    sb2.append(StaticMethods.a(str.replace(".", "_")));
                    sb2.append("=");
                    sb2.append(StaticMethods.a(value.toString()));
                }
            }
            string = sb2.toString();
        }
        sb.append(string);
        StringBuilder sb3 = new StringBuilder();
        if (MobileConfig.b().c()) {
            final VisitorIDService visitorIDServiceI = VisitorIDService.i();
            visitorIDServiceI.getClass();
            final StringBuilder sb4 = new StringBuilder();
            FutureTask futureTask = new FutureTask(new Callable<Void>() { // from class: com.adobe.mobile.VisitorIDService.10
                @Override // java.util.concurrent.Callable
                public final Void call() {
                    VisitorIDService visitorIDService = VisitorIDService.this;
                    if (VisitorIDService.f(visitorIDService) == null) {
                        return null;
                    }
                    StringBuilder sb5 = sb4;
                    androidx.compose.ui.input.pointer.a.w(sb5, "&", "d_mid", "=");
                    sb5.append(VisitorIDService.f(visitorIDService));
                    if (visitorIDService.f != null) {
                        androidx.compose.ui.input.pointer.a.w(sb5, "&", "d_blob", "=");
                        sb5.append(visitorIDService.f);
                    }
                    if (visitorIDService.e != null) {
                        androidx.compose.ui.input.pointer.a.w(sb5, "&", "dcs_region", "=");
                        sb5.append(visitorIDService.e);
                    }
                    String str2 = visitorIDService.h;
                    if (str2 == null) {
                        return null;
                    }
                    sb5.append(str2);
                    return null;
                }
            });
            visitorIDServiceI.j.execute(futureTask);
            try {
                futureTask.get();
            } catch (Exception e) {
                StaticMethods.J("ID Service - Unable to retrieve audience manager parameters from queue(%s)", e.getLocalizedMessage());
            }
            sb3.append(sb4.toString());
        }
        String strC = c();
        if (strC != null) {
            sb3.append("&d_uuid=");
            sb3.append(strC);
        }
        sb.append(sb3.toString());
        sb.append("&d_ptfm=android&d_dst=1&d_rtbd=json");
        sb.append(MobileConfig.b().D ? "&d_coop_unsafe=1" : "");
        return sb.toString().replace("?&", "?");
    }

    public static HashMap h(JSONObject jSONObject) throws JSONException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("dests");
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getJSONObject(i).getString("c");
                if (string != null && string.length() > 0) {
                    RequestHandler.d(string);
                }
            }
        } catch (JSONException e) {
            StaticMethods.I("Audience Manager - No destination in response (%s)", e.getLocalizedMessage());
        }
        try {
            e(jSONObject.getString("uuid"));
        } catch (JSONException e2) {
            StaticMethods.K("Audience Manager - Unable to parse JSON data (%s)", e2.getLocalizedMessage());
        }
        HashMap map = new HashMap();
        try {
            JSONArray jSONArray2 = jSONObject.getJSONArray("stuff");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                if (jSONObject2 != null) {
                    map.put(jSONObject2.getString("cn"), jSONObject2.getString("cv"));
                }
            }
        } catch (JSONException e3) {
            StaticMethods.I("Audience Manager - No 'stuff' array in response (%s)", e3.getLocalizedMessage());
        }
        if (map.size() > 0) {
            StaticMethods.I("Audience Manager - response (%s)", map);
        } else {
            StaticMethods.K("Audience Manager - response was empty", new Object[0]);
        }
        f(map);
        return map;
    }
}
