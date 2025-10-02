package com.adobe.mobile;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.adobe.mobile.AudienceManagerWorker;
import com.adobe.mobile.Config;
import com.adobe.mobile.Messages;
import com.adobe.mobile.MobileConfig;
import com.adobe.mobile.RemoteDownload;
import com.adobe.mobile.StaticMethods;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class Lifecycle {

    /* renamed from: a, reason: collision with root package name */
    public static long f13264a = 0;
    public static boolean b = false;
    public static volatile boolean c = false;
    public static final Object d = new Object();
    public static final HashMap e = new HashMap();
    public static final Object f = new Object();
    public static final HashMap g = new HashMap();
    public static final Object h = new Object();
    public static final HashMap i = new HashMap();

    public static void a(long j, HashMap map) {
        try {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/M/d", locale);
            long j2 = StaticMethods.B().getLong("ADMS_LastDateUsed", 0L);
            if (!simpleDateFormat.format(Long.valueOf(j)).equalsIgnoreCase(simpleDateFormat.format(new Date(j2)))) {
                map.put("a.DailyEngUserEvent", "DailyEngUserEvent");
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/M", locale);
            if (!simpleDateFormat2.format(Long.valueOf(j)).equalsIgnoreCase(simpleDateFormat2.format(new Date(j2)))) {
                map.put("a.MonthlyEngUserEvent", "MonthlyEngUserEvent");
            }
            map.put("a.DaysSinceFirstUse", Integer.toString((int) ((j - StaticMethods.B().getLong("ADMS_InstallDate", 0L)) / 86400000)));
            map.put("a.DaysSinceLastUse", Integer.toString((int) ((j - j2) / 86400000)));
            if (StaticMethods.B().getBoolean("ADMS_SuccessfulClose", false)) {
                return;
            }
            SharedPreferences.Editor editorC = StaticMethods.C();
            editorC.remove("ADMS_PauseDate");
            editorC.remove("ADMS_SessionStart");
            f13264a = StaticMethods.E();
            editorC.commit();
            long j3 = StaticMethods.B().getLong("ADBLastKnownTimestampKey", 0L);
            if (j3 > 0 && MobileConfig.b().j() && MobileConfig.b().g && MobileConfig.b().h) {
                try {
                    SharedPreferences sharedPreferencesB = StaticMethods.B();
                    HashMap map2 = new HashMap();
                    map2.put("a.CrashEvent", "CrashEvent");
                    map2.put("a.OSVersion", sharedPreferencesB.getString("ADOBEMOBILE_STOREDDEFAULTS_OS", ""));
                    map2.put("a.AppID", sharedPreferencesB.getString("ADOBEMOBILE_STOREDDEFAULTS_APPID", ""));
                    AnalyticsTrackInternal.a("Crash", map2, j3 + 1);
                    synchronized (d) {
                        e.put("a.CrashEvent", "CrashEvent");
                    }
                } catch (StaticMethods.NullContextException e2) {
                    StaticMethods.K("Config - Unable to get crash data for backdated hit (%s)", e2.getLocalizedMessage());
                }
            } else {
                map.put("a.CrashEvent", "CrashEvent");
            }
            AnalyticsTrackTimedAction.h().i();
        } catch (StaticMethods.NullContextException e3) {
            StaticMethods.J("Lifecycle - Error setting non install data (%s).", e3.getMessage());
        }
    }

    public static void b(HashMap map) {
        try {
            String string = StaticMethods.B().getString("ADMS_LifecycleData", null);
            if (string == null || string.length() <= 0) {
                return;
            }
            map.putAll(StaticMethods.L(new JSONObject(string)));
        } catch (StaticMethods.NullContextException e2) {
            StaticMethods.J("Lifecycle - Issue loading persisted lifecycle data", e2.getMessage());
        } catch (JSONException e3) {
            StaticMethods.K("Lifecycle - Issue loading persisted lifecycle data (%s)", e3.getMessage());
        }
    }

    public static void c(HashMap map) {
        try {
            long j = StaticMethods.B().getLong("ADMS_PauseDate", 0L) / 1000;
            if (StaticMethods.E() - j < MobileConfig.b().i) {
                return;
            }
            long j2 = j - (StaticMethods.B().getLong("ADMS_SessionStart", 0L) / 1000);
            f13264a = StaticMethods.E();
            if (j2 <= 0 || j2 >= 604800) {
                map.put("a.ignoredSessionLength", Long.toString(j2));
            } else {
                long j3 = StaticMethods.B().getLong("ADBLastKnownTimestampKey", 0L);
                if (j3 > 0 && MobileConfig.b().j() && MobileConfig.b().g && MobileConfig.b().h) {
                    try {
                        SharedPreferences sharedPreferencesB = StaticMethods.B();
                        HashMap map2 = new HashMap();
                        map2.put("a.PrevSessionLength", String.valueOf(j2));
                        map2.put("a.OSVersion", sharedPreferencesB.getString("ADOBEMOBILE_STOREDDEFAULTS_OS", ""));
                        map2.put("a.AppID", sharedPreferencesB.getString("ADOBEMOBILE_STOREDDEFAULTS_APPID", ""));
                        AnalyticsTrackInternal.a("SessionInfo", map2, j3 + 1);
                        synchronized (d) {
                            e.put("a.PrevSessionLength", String.valueOf(j2));
                        }
                    } catch (StaticMethods.NullContextException e2) {
                        StaticMethods.K("Config - Unable to get session data for backdated hit (%s)", e2.getLocalizedMessage());
                    }
                } else {
                    map.put("a.PrevSessionLength", Long.toString(j2));
                }
            }
            SharedPreferences.Editor editorC = StaticMethods.C();
            editorC.remove("ADMS_SessionStart");
            editorC.commit();
        } catch (StaticMethods.NullContextException e3) {
            StaticMethods.J("Lifecycle - Error adding session length data (%s).", e3.getMessage());
        }
    }

    public static void d(Activity activity, boolean z) throws UnsupportedEncodingException {
        Intent intent;
        String str;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("adb_m_id");
        String stringExtra2 = intent.getStringExtra("adb_m_l_id");
        HashMap mapH = h(intent.getData(), "applink");
        HashMap map = new HashMap();
        if (z || mapH == null) {
            str = null;
        } else {
            map.putAll(mapH);
            p(map);
            str = "AdobeLink";
        }
        if (stringExtra != null && stringExtra.length() > 0) {
            map.put("a.push.payloadId", stringExtra);
            p(map);
            str = "PushMessage";
        } else if (stringExtra2 != null && stringExtra2.length() > 0) {
            map.put("a.message.id", stringExtra2);
            map.put("a.message.clicked", 1);
            p(map);
            str = "In-App Message";
        }
        if (str == null || !MobileConfig.b().j()) {
            return;
        }
        AnalyticsTrackInternal.a(str, map, StaticMethods.E());
    }

    public static HashMap e(Activity activity, String str) throws UnsupportedEncodingException {
        Intent intent;
        Uri data;
        if (activity == null || (intent = activity.getIntent()) == null || (data = intent.getData()) == null) {
            return null;
        }
        HashMap mapH = h(data, str);
        try {
            Uri data2 = intent.getData();
            if (data2 != null && mapH != null && !mapH.isEmpty() && mapH.containsKey("at_preview_token")) {
                intent.setData(data2.buildUpon().encodedQuery("").build());
                return mapH;
            }
            return mapH;
        } catch (Exception e2) {
            StaticMethods.J("Lifecycle - Exception while attempting to remove target token parameters from Uri (%s).", e2.getMessage());
            return mapH;
        }
    }

    public static void f(HashMap map) {
        Object obj = map.get("at_preview_token");
        if (obj != null && (obj instanceof String)) {
            TargetPreviewManager targetPreviewManagerD = TargetPreviewManager.d();
            String str = (String) obj;
            targetPreviewManagerD.getClass();
            if (MobileConfig.b().m()) {
                synchronized (TargetPreviewManager.j) {
                    targetPreviewManagerD.d = str;
                }
            }
        }
        Object obj2 = map.get("at_preview_endpoint");
        if (obj2 == null || !(obj2 instanceof String)) {
            return;
        }
        TargetPreviewManager.d().f13281a = (String) obj2;
    }

    public static void g(HashMap map) {
        HashMap map2 = new HashMap(map);
        map2.putAll(StaticMethods.t());
        map2.put("a.locale", StaticMethods.s());
        map2.put("a.ltv.amount", AnalyticsTrackLifetimeValueIncrease.a());
        synchronized (d) {
            HashMap map3 = e;
            map3.putAll(map2);
            synchronized (f) {
                try {
                    g.clear();
                    for (Map.Entry entry : map3.entrySet()) {
                        g.put(((String) entry.getKey()).toLowerCase(), entry.getValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static HashMap h(Uri uri, String str) throws UnsupportedEncodingException {
        String strDecode;
        String strDecode2;
        if (uri == null) {
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        String str2 = str.equals("targetPreviewlink") ? "at_preview_token" : "a.deeplink.id";
        if (encodedQuery == null || encodedQuery.length() <= 0 || !encodedQuery.contains(str2.concat("="))) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str3 : encodedQuery.split("&")) {
            if (str3 != null && str3.length() > 0) {
                String[] strArrSplit = str3.split("=", 2);
                if (strArrSplit.length == 1 || (strArrSplit.length == 2 && strArrSplit[1].isEmpty())) {
                    StaticMethods.K("Deep Link - Skipping an invalid variable on the URI query (%s).", strArrSplit[0]);
                } else {
                    try {
                        strDecode = URLDecoder.decode(strArrSplit[0], "UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                        strDecode = strArrSplit[0];
                    }
                    try {
                        strDecode2 = URLDecoder.decode(strArrSplit[1], "UTF-8");
                    } catch (UnsupportedEncodingException unused2) {
                        strDecode2 = strArrSplit[1];
                    }
                    if (strDecode.startsWith("ctx")) {
                        map.put(strDecode.substring(3), strDecode2);
                    } else if (strDecode.startsWith("adb")) {
                        map.put("a.acquisition.custom.".concat(strDecode.substring(3)), strDecode2);
                    } else {
                        map.put(strDecode, strDecode2);
                    }
                }
            }
        }
        return map;
    }

    public static HashMap i() {
        synchronized (d) {
            try {
                HashMap map = e;
                if (map.size() > 0) {
                    return new HashMap(map);
                }
                synchronized (h) {
                    try {
                        HashMap map2 = i;
                        if (map2.size() > 0) {
                            return new HashMap(map2);
                        }
                        b(map2);
                        return new HashMap(map2);
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public static HashMap j() {
        HashMap map;
        synchronized (f) {
            try {
                if (g.size() <= 0) {
                    HashMap map2 = new HashMap();
                    b(map2);
                    for (Map.Entry entry : map2.entrySet()) {
                        g.put(((String) entry.getKey()).toLowerCase(), entry.getValue());
                    }
                }
                map = new HashMap(g);
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public static HashMap k() throws JSONException {
        try {
            if (StaticMethods.B().contains("ADMS_Referrer_ContextData_Json_String")) {
                HashMap map = new HashMap();
                String strB = ReferrerHandler.b(StaticMethods.B().getString("ADMS_Referrer_ContextData_Json_String", null));
                map.putAll(ReferrerHandler.a("contextData", ReferrerHandler.d(strB)));
                if (map.size() > 0) {
                    map.putAll(ReferrerHandler.c(strB));
                    return map;
                }
                HashMap map2 = new HashMap();
                if (strB != null) {
                    try {
                        map2.putAll(ReferrerHandler.a("googleReferrerData", new JSONObject(strB)));
                    } catch (JSONException e2) {
                        StaticMethods.I("Could not retrieve Google referrer data (%s)", e2.getMessage());
                        map2.clear();
                    }
                }
                if (map2.containsKey("a.referrer.campaign.name") && map2.containsKey("a.referrer.campaign.source")) {
                    map.putAll(map2);
                }
                if (map.size() == 0) {
                    HashMap map3 = new HashMap();
                    if (strB != null) {
                        try {
                            map3.putAll(ReferrerHandler.a("otherReferrerData", new JSONObject(strB)));
                        } catch (JSONException e3) {
                            StaticMethods.I("Could not retrieve referrer data (%s)", e3.getMessage());
                            map3.clear();
                        }
                    }
                    if (map3.size() > 0) {
                        map.putAll(map3);
                    }
                }
                return map;
            }
            if (StaticMethods.B().contains("utm_campaign")) {
                String string = StaticMethods.B().getString("utm_source", null);
                String string2 = StaticMethods.B().getString("utm_medium", null);
                String string3 = StaticMethods.B().getString("utm_term", null);
                String string4 = StaticMethods.B().getString("utm_content", null);
                String string5 = StaticMethods.B().getString("utm_campaign", null);
                String string6 = StaticMethods.B().getString("trackingcode", null);
                if (string != null && string5 != null) {
                    HashMap map4 = new HashMap();
                    map4.put("a.referrer.campaign.source", string);
                    map4.put("a.referrer.campaign.medium", string2);
                    map4.put("a.referrer.campaign.term", string3);
                    map4.put("a.referrer.campaign.content", string4);
                    map4.put("a.referrer.campaign.name", string5);
                    map4.put("a.referrer.campaign.trackingcode", string6);
                    try {
                        SharedPreferences.Editor editorC = StaticMethods.C();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("googleReferrerData", new JSONObject(map4));
                        editorC.putString("ADMS_Referrer_ContextData_Json_String", jSONObject.toString());
                        editorC.commit();
                        return map4;
                    } catch (StaticMethods.NullContextException e4) {
                        StaticMethods.J("Analytics - Error persisting referrer data (%s)", e4.getMessage());
                        return map4;
                    } catch (JSONException e5) {
                        StaticMethods.J("Analytics - Error persisting referrer data (%s)", e5.getMessage());
                        return map4;
                    }
                }
            }
            return null;
        } catch (StaticMethods.NullContextException e6) {
            StaticMethods.J("Lifecycle - Error pulling persisted Acquisition data (%s)", e6.getMessage());
            return null;
        }
        StaticMethods.J("Lifecycle - Error pulling persisted Acquisition data (%s)", e6.getMessage());
        return null;
    }

    public static boolean l() {
        try {
            return !StaticMethods.l().equalsIgnoreCase(StaticMethods.B().getString("ADMS_LastVersion", ""));
        } catch (StaticMethods.NullContextException e2) {
            StaticMethods.J("Lifecycle - Unable to get application version (%s)", e2.getLocalizedMessage());
            return false;
        }
    }

    public static void m() {
        JSONObject jSONObject;
        try {
            synchronized (d) {
                jSONObject = new JSONObject(e);
            }
            SharedPreferences.Editor editorC = StaticMethods.C();
            editorC.putString("ADMS_LifecycleData", jSONObject.toString());
            editorC.commit();
        } catch (StaticMethods.NullContextException e2) {
            StaticMethods.K("Lifecycle - Error persisting lifecycle data (%s)", e2.getMessage());
        }
    }

    public static void n(String str) {
        synchronized (d) {
            e.remove(str);
        }
        synchronized (f) {
            g.remove(str.toLowerCase());
        }
    }

    public static void o(AdobeMarketingActivity adobeMarketingActivity) throws JSONException, UnsupportedEncodingException {
        Activity activityQ;
        long j;
        long j2;
        HashMap map;
        b = false;
        q();
        if (c) {
            return;
        }
        c = true;
        try {
            SharedPreferences sharedPreferencesB = StaticMethods.B();
            String string = null;
            try {
                activityQ = StaticMethods.q();
            } catch (StaticMethods.NullActivityException unused) {
                activityQ = null;
            }
            if (activityQ != null && adobeMarketingActivity != null && activityQ.getComponentName().toString().equals(adobeMarketingActivity.getComponentName().toString())) {
                StaticMethods.w().execute(new Messages.AnonymousClass4(null, null, null));
            }
            synchronized (StaticMethods.c0) {
                StaticMethods.b0 = new WeakReference(adobeMarketingActivity);
            }
            HashMap mapE = e(adobeMarketingActivity, "targetPreviewlink");
            if (mapE != null && TargetPreviewManager.d().f() == null) {
                f(mapE);
                TargetPreviewManager.d().c();
            }
            TargetPreviewManager.d().g();
            final MobileConfig mobileConfigB = MobileConfig.b();
            long j3 = sharedPreferencesB.getLong("ADMS_PauseDate", 0L) / 1000;
            int i2 = mobileConfigB.i;
            if (j3 > 0) {
                long jE = StaticMethods.E() - j3;
                long j4 = sharedPreferencesB.getLong("ADMS_SessionStart", 0L) / 1000;
                f13264a = j4;
                AnalyticsTrackTimedAction.h().j(jE);
                j = 1000;
                if (jE < i2 && j4 > 0) {
                    try {
                        SharedPreferences.Editor editorC = StaticMethods.C();
                        editorC.putLong("ADMS_SessionStart", (j4 + jE) * 1000);
                        editorC.putBoolean("ADMS_SuccessfulClose", false);
                        editorC.remove("ADMS_PauseDate");
                        editorC.commit();
                    } catch (StaticMethods.NullContextException e2) {
                        StaticMethods.J("Lifecycle - Error while updating start time (%s).", e2.getMessage());
                    }
                    f13264a = sharedPreferencesB.getLong("ADMS_SessionStart", 0L) / 1000;
                    d(adobeMarketingActivity, false);
                    return;
                }
            } else {
                j = 1000;
            }
            VisitorIDService.i().h(null, null, null, true);
            StaticMethods.w().execute(new Runnable() { // from class: com.adobe.mobile.MobileConfig.7
                @Override // java.lang.Runnable
                public final void run() {
                    MobileConfig mobileConfig = MobileConfig.this;
                    String str = mobileConfig.x;
                    if (str == null || str.length() <= 0) {
                        MobileConfig.a(mobileConfig);
                    } else {
                        new RemoteDownload.DownloadFileTask(str, new RemoteDownload.RemoteDownloadBlock() { // from class: com.adobe.mobile.MobileConfig.7.1
                            @Override // com.adobe.mobile.RemoteDownload.RemoteDownloadBlock
                            public final void a(File file) throws Throwable {
                                MobileConfig mobileConfig2 = MobileConfig.this;
                                mobileConfig2.q(file);
                                MobileConfig.a(mobileConfig2);
                                mobileConfig2.p();
                            }
                        }, "adbdownloadcache").run();
                    }
                }
            });
            StaticMethods.D().execute(new MobileConfig.AnonymousClass8());
            StaticMethods.y().execute(new MobileConfig.AnonymousClass9());
            String str = mobileConfigB.n;
            if (str != null && str.length() > 0) {
                new Thread(new RemoteDownload.DownloadFileTask(mobileConfigB.n, new RemoteDownload.RemoteDownloadBlock() { // from class: com.adobe.mobile.MobileConfig.10
                    @Override // com.adobe.mobile.RemoteDownload.RemoteDownloadBlock
                    public final void a(final File file) {
                        StaticMethods.i().execute(new Runnable() { // from class: com.adobe.mobile.MobileConfig.10.1
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                File file2 = file;
                                if (file2 != null) {
                                    StaticMethods.I("Config - Using remote definition for points of interest", new Object[0]);
                                    MobileConfig.this.r(file2);
                                }
                            }
                        });
                    }
                }, "adbdownloadcache")).start();
            }
            synchronized (d) {
                e.clear();
            }
            synchronized (f) {
                g.clear();
            }
            HashMap map2 = new HashMap();
            HashMap mapE2 = e(adobeMarketingActivity, "applink");
            if (mapE2 != null) {
                map2.putAll(mapE2);
            }
            long jE2 = StaticMethods.E() * j;
            if (sharedPreferencesB.contains("ADMS_InstallDate")) {
                a(jE2, map2);
                try {
                    SharedPreferences.Editor editorC2 = StaticMethods.C();
                    long j5 = StaticMethods.B().getLong("ADMS_UpgradeDate", 0L);
                    if (l()) {
                        j2 = 0;
                        map2.put("a.UpgradeEvent", "UpgradeEvent");
                        editorC2.putLong("ADMS_UpgradeDate", jE2);
                        editorC2.putInt("ADMS_LaunchesAfterUpgrade", 0);
                    } else {
                        j2 = 0;
                        if (j5 > 0) {
                            map2.put("a.DaysSinceLastUpgrade", Integer.toString((int) ((jE2 - j5) / 86400000)));
                        }
                    }
                    if (j5 > j2) {
                        int i3 = StaticMethods.B().getInt("ADMS_LaunchesAfterUpgrade", 0) + 1;
                        map2.put("a.LaunchesSinceUpgrade", "" + i3);
                        editorC2.putInt("ADMS_LaunchesAfterUpgrade", i3);
                    }
                    editorC2.commit();
                } catch (StaticMethods.NullContextException e3) {
                    StaticMethods.J("Lifecycle - Error setting upgrade data (%s).", e3.getMessage());
                }
                c(map2);
                HashMap mapK = k();
                if (mapK != null && mapK.size() != 0) {
                    p(mapK);
                    MobileConfig.b().d(Config.MobileDataEvent.f, mapK);
                }
            } else {
                map2.put("a.InstallDate", new SimpleDateFormat("M/d/yyyy", Locale.US).format(Long.valueOf(jE2)));
                map2.put("a.InstallEvent", "InstallEvent");
                map2.put("a.DailyEngUserEvent", "DailyEngUserEvent");
                map2.put("a.MonthlyEngUserEvent", "MonthlyEngUserEvent");
                try {
                    if (StaticMethods.B().contains("ADMS_Referrer_ContextData_Json_String") || StaticMethods.B().contains("utm_campaign")) {
                        HashMap mapK2 = k();
                        JSONObject jSONObjectD = ReferrerHandler.d(StaticMethods.B().getString("ADMS_Referrer_ContextData_Json_String", null));
                        if (jSONObjectD != null) {
                            try {
                                JSONObject jSONObject = jSONObjectD.getJSONObject("adobeData");
                                if (jSONObject != null) {
                                    string = jSONObject.getString("a.acquisition.custom.link_deferred");
                                }
                            } catch (JSONException unused2) {
                            }
                        }
                        ReferrerHandler.e(string);
                        if (mapK2 != null && mapK2.size() >= 0) {
                            map2.putAll(mapK2);
                            MobileConfig.b().d(Config.MobileDataEvent.e, mapK2);
                        }
                    } else {
                        MobileConfig mobileConfigB2 = MobileConfig.b();
                        String str2 = mobileConfigB2.w;
                        String str3 = mobileConfigB2.v;
                        if ((str3 != null && str2 != null && str3.length() > 0 && str2.length() > 0) && MobileConfig.b().j * 1000 > 0) {
                            ReferrerHandler.f13278a = false;
                            StaticMethods.D().execute(new Messages.AnonymousClass1());
                        }
                    }
                    SharedPreferences.Editor editorC3 = StaticMethods.C();
                    editorC3.putLong("ADMS_InstallDate", jE2);
                    editorC3.commit();
                } catch (StaticMethods.NullContextException e4) {
                    StaticMethods.J("Lifecycle - Error setting install data (%s).", e4.getMessage());
                }
            }
            map2.putAll(StaticMethods.t());
            map2.put("a.LaunchEvent", "LaunchEvent");
            map2.put("a.OSVersion", StaticMethods.x());
            map2.put("a.HourOfDay", new SimpleDateFormat("H", Locale.US).format(Long.valueOf(jE2)));
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jE2);
            map2.put("a.DayOfWeek", Integer.toString(calendar.get(7)));
            StaticMethods.h();
            if (StaticMethods.G()) {
                map2.put("a.push.optin", "True");
            }
            try {
                SharedPreferences.Editor editorC4 = StaticMethods.C();
                int i4 = StaticMethods.B().getInt("ADMS_Launches", 0) + 1;
                map2.put("a.Launches", Integer.toString(i4));
                editorC4.putInt("ADMS_Launches", i4);
                editorC4.putLong("ADMS_LastDateUsed", jE2);
                editorC4.commit();
            } catch (StaticMethods.NullContextException e5) {
                StaticMethods.J("Lifecycle - Error adding generic data (%s).", e5.getMessage());
            }
            g(map2);
            m();
            MobileConfig.b().d(Config.MobileDataEvent.d, map2);
            AnalyticsTrackInternal.a("Lifecycle", map2, StaticMethods.E() - 1);
            if (!mobileConfigB.t) {
                synchronized (d) {
                    map = new HashMap(e);
                }
                if (MobileConfig.b().l != MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_IN) {
                    StaticMethods.I("Audience Manager - Ignoring signal due to privacy status not being opt in", new Object[0]);
                } else {
                    StaticMethods.n().execute(new AudienceManagerWorker.SubmitSignalTask(map));
                }
            }
            d(adobeMarketingActivity, true);
            try {
                SharedPreferences.Editor editorC5 = StaticMethods.C();
                if (!StaticMethods.B().contains("ADMS_SessionStart")) {
                    editorC5.putLong("ADMS_SessionStart", jE2);
                    f13264a = jE2 / j;
                }
                editorC5.putString("ADMS_LastVersion", StaticMethods.l());
                editorC5.putBoolean("ADMS_SuccessfulClose", false);
                editorC5.remove("ADMS_PauseDate");
                editorC5.commit();
            } catch (StaticMethods.NullContextException e6) {
                StaticMethods.J("Lifecycle - Error resetting lifecycle flags (%s).", e6.getMessage());
            }
        } catch (StaticMethods.NullContextException e7) {
            StaticMethods.J("Lifecycle - Error starting lifecycle (%s).", e7.getMessage());
        }
    }

    public static void p(HashMap map) {
        synchronized (d) {
            e.putAll(map);
        }
        synchronized (f) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    g.put(((String) entry.getKey()).toLowerCase(), entry.getValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void q() {
        if (l()) {
            HashMap mapI = i();
            if (mapI.size() <= 0) {
                return;
            }
            mapI.put("a.AppID", StaticMethods.j());
            synchronized (d) {
                if (e.size() > 0) {
                    p(mapI);
                } else {
                    try {
                        synchronized (h) {
                            i.put("a.AppID", StaticMethods.j());
                        }
                        SharedPreferences.Editor editorC = StaticMethods.C();
                        editorC.putString("ADMS_LifecycleData", new JSONObject(mapI).toString());
                        editorC.commit();
                        synchronized (f) {
                            g.clear();
                        }
                    } catch (StaticMethods.NullContextException e2) {
                        StaticMethods.K("Lifecycle - Error persisting lifecycle data (%s)", e2.getMessage());
                    }
                }
            }
        }
    }
}
