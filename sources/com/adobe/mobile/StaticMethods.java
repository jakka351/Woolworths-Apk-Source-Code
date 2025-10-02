package com.adobe.mobile;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import com.adobe.mobile.VisitorID;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class StaticMethods {
    public static boolean d;

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f13279a = {"%00", "%01", "%02", "%03", "%04", "%05", "%06", "%07", "%08", "%09", "%0A", "%0B", "%0C", "%0D", "%0E", "%0F", "%10", "%11", "%12", "%13", "%14", "%15", "%16", "%17", "%18", "%19", "%1A", "%1B", "%1C", "%1D", "%1E", "%1F", "%20", "%21", "%22", "%23", "%24", "%25", "%26", "%27", "%28", "%29", "*", "%2B", "%2C", "-", ".", "%2F", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "%3A", "%3B", "%3C", "%3D", "%3E", "%3F", "%40", "A", "B", "C", "D", "E", "F", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "U", "V", "W", "X", "Y", "Z", "%5B", "%5C", "%5D", "%5E", "_", "%60", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "%7B", "%7C", "%7D", "%7E", "%7F", "%80", "%81", "%82", "%83", "%84", "%85", "%86", "%87", "%88", "%89", "%8A", "%8B", "%8C", "%8D", "%8E", "%8F", "%90", "%91", "%92", "%93", "%94", "%95", "%96", "%97", "%98", "%99", "%9A", "%9B", "%9C", "%9D", "%9E", "%9F", "%A0", "%A1", "%A2", "%A3", "%A4", "%A5", "%A6", "%A7", "%A8", "%A9", "%AA", "%AB", "%AC", "%AD", "%AE", "%AF", "%B0", "%B1", "%B2", "%B3", "%B4", "%B5", "%B6", "%B7", "%B8", "%B9", "%BA", "%BB", "%BC", "%BD", "%BE", "%BF", "%C0", "%C1", "%C2", "%C3", "%C4", "%C5", "%C6", "%C7", "%C8", "%C9", "%CA", "%CB", "%CC", "%CD", "%CE", "%CF", "%D0", "%D1", "%D2", "%D3", "%D4", "%D5", "%D6", "%D7", "%D8", "%D9", "%DA", "%DB", "%DC", "%DD", "%DE", "%DF", "%E0", "%E1", "%E2", "%E3", "%E4", "%E5", "%E6", "%E7", "%E8", "%E9", "%EA", "%EB", "%EC", "%ED", "%EE", "%EF", "%F0", "%F1", "%F2", "%F3", "%F4", "%F5", "%F6", "%F7", "%F8", "%F9", "%FA", "%FB", "%FC", "%FD", "%FE", "%FF"};
    public static final boolean[] b = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, true, false, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    public static final boolean[] c = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    public static boolean e = false;
    public static SharedPreferences f = null;
    public static final Object g = new Object();
    public static String h = null;
    public static final Object i = new Object();
    public static String j = null;
    public static final Object k = new Object();
    public static String l = null;
    public static final Object m = new Object();
    public static int n = -1;
    public static final Object o = new Object();
    public static String p = null;
    public static final Object q = new Object();
    public static final Object r = new Object();
    public static boolean s = false;
    public static final Object t = new Object();
    public static final Object u = new Object();
    public static final Object v = new Object();
    public static String w = null;
    public static final Object x = new Object();
    public static HashMap y = null;
    public static final Object z = new Object();
    public static String A = null;
    public static final Object B = new Object();
    public static String C = null;
    public static final Object D = new Object();
    public static String E = null;
    public static final Object F = new Object();
    public static String G = null;
    public static final Object H = new Object();
    public static ExecutorService I = null;
    public static final Object J = new Object();
    public static ExecutorService K = null;
    public static final Object L = new Object();
    public static ExecutorService M = null;
    public static final Object N = new Object();
    public static ExecutorService O = null;
    public static final Object P = new Object();
    public static ExecutorService Q = null;
    public static final Object R = new Object();
    public static ExecutorService S = null;
    public static final Object T = new Object();
    public static ExecutorService U = null;
    public static final Object V = new Object();
    public static String W = null;
    public static final Object X = new Object();
    public static final HashMap Y = new HashMap(256);
    public static int Z = 0;
    public static Context a0 = null;
    public static WeakReference b0 = null;
    public static final Object c0 = new Object();
    public static final char[] d0 = "000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F202122232425262728292A2B2C2D2E2F303132333435363738393A3B3C3D3E3F404142434445464748494A4B4C4D4E4F505152535455565758595A5B5C5D5E5F606162636465666768696A6B6C6D6E6F707172737475767778797A7B7C7D7E7F808182838485868788898A8B8C8D8E8F909192939495969798999A9B9C9D9E9FA0A1A2A3A4A5A6A7A8A9AAABACADAEAFB0B1B2B3B4B5B6B7B8B9BABBBCBDBEBFC0C1C2C3C4C5C6C7C8C9CACBCCCDCECFD0D1D2D3D4D5D6D7D8D9DADBDCDDDEDFE0E1E2E3E4E5E6E7E8E9EAEBECEDEEEFF0F1F2F3F4F5F6F7F8F9FAFBFCFDFEFF".toCharArray();

    /* renamed from: com.adobe.mobile.StaticMethods$1, reason: invalid class name */
    final class AnonymousClass1 extends HashMap<String, String> {
    }

    /* renamed from: com.adobe.mobile.StaticMethods$2, reason: invalid class name */
    final class AnonymousClass2 extends HashMap<String, Object> {
    }

    /* renamed from: com.adobe.mobile.StaticMethods$3, reason: invalid class name */
    final class AnonymousClass3 extends HashMap<String, Object> {
    }

    public static class NullActivityException extends Exception {
    }

    public static class NullContextException extends Exception {
    }

    static {
        "0123456789abcdef".toCharArray();
    }

    public static Context A() throws NullContextException {
        Context context = a0;
        if (context != null) {
            return context;
        }
        throw new NullContextException("Config - No Application Context (Application context must be set prior to calling any library functions.)");
    }

    public static SharedPreferences B() {
        SharedPreferences sharedPreferences;
        synchronized (g) {
            try {
                if (f == null) {
                    SharedPreferences sharedPreferences2 = A().getSharedPreferences("APP_MEASUREMENT_CACHE", 0);
                    f = sharedPreferences2;
                    if (sharedPreferences2 == null) {
                        K("Config - No SharedPreferences available", new Object[0]);
                    }
                }
                sharedPreferences = f;
                if (sharedPreferences == null) {
                    throw new NullContextException("Config - No SharedPreferences available");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }

    public static SharedPreferences.Editor C() {
        SharedPreferences.Editor editorEdit = B().edit();
        if (editorEdit != null) {
            return editorEdit;
        }
        throw new NullContextException("Config - Unable to create an instance of a SharedPreferences Editor");
    }

    public static ExecutorService D() {
        ExecutorService executorService;
        synchronized (P) {
            try {
                if (O == null) {
                    O = Executors.newSingleThreadExecutor();
                }
                executorService = O;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static long E() {
        return System.currentTimeMillis() / 1000;
    }

    public static String F() {
        String str;
        synchronized (q) {
            if (p == null) {
                try {
                    p = B().getString("APP_MEASUREMENT_VISITOR_ID", null);
                } catch (NullContextException e2) {
                    J("Config - Unable to pull visitorID from shared preferences. (%s)", e2.getMessage());
                }
                str = p;
            } else {
                str = p;
            }
        }
        return str;
    }

    public static boolean G() {
        synchronized (t) {
            try {
                s = B().getBoolean("ADBMOBILE_KEY_PUSH_ENABLED", false);
            } catch (NullContextException e2) {
                J("Config - Unable to pull push status from shared preferences. (%s)", e2.getMessage());
            }
        }
        return s;
    }

    public static JSONArray H(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof List) {
                jSONArray.put(H((List) obj));
            } else if (obj instanceof Map) {
                jSONArray.put(M((Map) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public static void I(String str, Object... objArr) {
        if (d) {
            if (objArr.length > 0) {
                Log.d("ADBMobile", String.format("ADBMobile Debug : ".concat(str), objArr));
            } else {
                Log.d("ADBMobile", "ADBMobile Debug : ".concat(str));
            }
        }
    }

    public static void J(String str, Object... objArr) {
        if (objArr.length <= 0) {
            a.v("ADBMobile Error : ", str, "ADBMobile");
            return;
        }
        Log.e("ADBMobile", String.format("ADBMobile Error : " + str, objArr));
    }

    public static void K(String str, Object... objArr) {
        if (d) {
            if (objArr.length > 0) {
                Log.w("ADBMobile", String.format("ADBMobile Warning : " + str, objArr));
            } else {
                Log.w("ADBMobile", "ADBMobile Warning : " + str);
            }
        }
    }

    public static HashMap L(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                map.put(next, jSONObject.getString(next));
            } catch (JSONException e2) {
                K("Problem parsing json data (%s)", e2.getLocalizedMessage());
            }
        }
        return map;
    }

    public static JSONObject M(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                try {
                    jSONObject.put(str, H((List) value));
                } catch (JSONException unused) {
                }
            } else if (value instanceof Map) {
                jSONObject.put(str, M((Map) value));
            } else {
                jSONObject.put(str, value);
            }
        }
        return jSONObject;
    }

    public static String N() throws Throwable {
        String string;
        StringBuilder sb = new StringBuilder(64);
        sb.append(MobileConfig.b().f ? "https" : "http");
        sb.append("://");
        sb.append(MobileConfig.b().d);
        sb.append("/id");
        boolean zC = MobileConfig.b().c();
        if (zC) {
            final VisitorIDService visitorIDServiceI = VisitorIDService.i();
            visitorIDServiceI.getClass();
            final StringBuilder sb2 = new StringBuilder();
            FutureTask futureTask = new FutureTask(new Callable<Void>() { // from class: com.adobe.mobile.VisitorIDService.6
                @Override // java.util.concurrent.Callable
                public final Void call() {
                    VisitorIDService visitorIDService = VisitorIDService.this;
                    if (VisitorIDService.f(visitorIDService) == null) {
                        return null;
                    }
                    StringBuilder sb3 = sb2;
                    a.w(sb3, "?", "mid", "=");
                    androidx.constraintlayout.core.state.a.B(sb3, VisitorIDService.f(visitorIDService), "&", "mcorgid", "=");
                    sb3.append(MobileConfig.b().B);
                    return null;
                }
            });
            visitorIDServiceI.j.execute(futureTask);
            try {
                futureTask.get();
            } catch (Exception e2) {
                J("ID Service - Unable to retrieve analytics id parameters from queue(%s)", e2.getLocalizedMessage());
            }
            sb.append(sb2.toString());
        }
        I("Analytics ID - Sending Analytics ID call(%s)", sb);
        byte[] bArrB = RequestHandler.b(500, 2000, sb.toString(), "Analytics ID");
        if (bArrB != null) {
            try {
                string = new JSONObject(new String(bArrB, "UTF-8")).getString("id");
            } catch (UnsupportedEncodingException e3) {
                J("Analytics ID - Unable to decode /id response(%s)", e3.getLocalizedMessage());
            } catch (JSONException e4) {
                if (!zC) {
                    J("Analytics ID - Unable to parse /id response(%s)", e4.getLocalizedMessage());
                }
            }
        } else {
            string = null;
        }
        if (string != null && string.length() == 33) {
            return string;
        }
        if (zC) {
            return null;
        }
        String upperCase = UUID.randomUUID().toString().replace("-", "").toUpperCase(Locale.US);
        Pattern patternCompile = Pattern.compile("^[89A-F]");
        Pattern patternCompile2 = Pattern.compile("^[4-9A-F]");
        Matcher matcher = patternCompile.matcher(upperCase.substring(0, 16));
        Matcher matcher2 = patternCompile2.matcher(upperCase.substring(16, 32));
        SecureRandom secureRandom = new SecureRandom();
        return b.o(matcher.replaceAll(String.valueOf(secureRandom.nextInt(7))), "-", matcher2.replaceAll(String.valueOf(secureRandom.nextInt(3))));
    }

    public static void O(Object obj, String str, StringBuilder sb) {
        if (obj == null || (obj instanceof ContextData) || str.length() <= 0) {
            return;
        }
        if (!(obj instanceof String) || ((String) obj).length() > 0) {
            a.w(sb, "&", str, "=");
            if (!(obj instanceof List)) {
                sb.append(a(obj.toString()));
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                if (!it.hasNext()) {
                    break;
                } else {
                    sb2.append(",");
                }
            }
            sb.append(a(sb2.toString()));
        }
    }

    public static void P(StringBuilder sb, HashMap map) throws UnsupportedEncodingException {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String strA = a((String) entry.getKey());
            if (strA != null) {
                Object value = entry.getValue();
                if (value instanceof ContextData) {
                    ContextData contextData = (ContextData) value;
                    HashMap map2 = contextData.b;
                    Object obj = contextData.f13263a;
                    if (obj != null) {
                        O(obj, strA, sb);
                    }
                    if (map2 != null && map2.size() > 0) {
                        a.w(sb, "&", strA, ".");
                        P(sb, map2);
                        sb.append("&.");
                        sb.append(strA);
                    }
                } else {
                    O(value, strA, sb);
                }
            }
        }
    }

    public static void Q(boolean z2) {
        synchronized (t) {
            try {
                SharedPreferences.Editor editorC = C();
                editorC.putBoolean("ADBMOBILE_KEY_PUSH_ENABLED", z2);
                editorC.commit();
                s = z2;
                WearableFunctionBridge.d(z2);
            } catch (NullContextException e2) {
                J("Config - Unable to set pushEnabled shared preferences. (%s)", e2.getMessage());
            }
        }
    }

    public static void R(String str) {
        boolean z2;
        if (str != null && MobileConfig.b().c()) {
            try {
                z2 = B().getBoolean("ADOBEMOBILE_STOREDDEFAULTS_AID_SYNCED", false);
            } catch (NullContextException e2) {
                K("Visitor ID - Null context when attempting to determine visitor ID sync status (%s)", e2.getLocalizedMessage());
                z2 = false;
            }
            if (z2) {
                return;
            }
            VisitorIDService.i().h(androidx.constraintlayout.core.state.a.r("AVID", str), null, VisitorID.VisitorIDAuthenticationState.VISITOR_ID_AUTHENTICATION_STATE_UNKNOWN, false);
            try {
                SharedPreferences.Editor editorC = C();
                editorC.putBoolean("ADOBEMOBILE_STOREDDEFAULTS_AID_SYNCED", true);
                editorC.commit();
            } catch (NullContextException e3) {
                K("Visitor ID - Null context when attempting to persist visitor ID sync status (%s)", e3.getLocalizedMessage());
            }
        }
    }

    public static ContextData S(HashMap map) {
        ContextData contextData = new ContextData();
        for (Map.Entry entry : d(map).entrySet()) {
            String str = (String) entry.getKey();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                int iIndexOf = str.indexOf(46, i2);
                if (iIndexOf >= 0) {
                    arrayList.add(str.substring(i2, iIndexOf));
                    i2 = iIndexOf + 1;
                }
            }
            arrayList.add(str.substring(i2, str.length()));
            b(entry.getValue(), contextData, arrayList, 0);
        }
        return contextData;
    }

    public static void T(Long l2) {
        MobileConfig mobileConfigB = MobileConfig.b();
        if (mobileConfigB == null) {
            J("Config - Lost config instance", new Object[0]);
            return;
        }
        if (mobileConfigB.g) {
            try {
                SharedPreferences.Editor editorC = C();
                editorC.putLong("ADBLastKnownTimestampKey", l2.longValue());
                editorC.commit();
            } catch (NullContextException e2) {
                J("Config - Error while updating last known timestamp. (%s)", e2.getMessage());
            }
        }
    }

    public static String a(String str) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i2 = 0;
            while (i2 < length && b[bytes[i2] & 255]) {
                i2++;
            }
            if (i2 == length) {
                return str;
            }
            StringBuilder sb = new StringBuilder(bytes.length << 1);
            if (i2 > 0) {
                sb.append(new String(bytes, 0, i2, "UTF-8"));
            }
            while (i2 < length) {
                sb.append(f13279a[bytes[i2] & 255]);
                i2++;
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e2) {
            K("UnsupportedEncodingException : " + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    public static void b(Object obj, ContextData contextData, ArrayList arrayList, int i2) {
        if (contextData != null) {
            HashMap map = contextData.b;
            int size = arrayList.size();
            String str = i2 < size ? (String) arrayList.get(i2) : null;
            if (str == null) {
                return;
            }
            ContextData contextData2 = new ContextData();
            if (map.containsKey(str)) {
                contextData2 = (ContextData) map.get(str);
            }
            if (size - 1 == i2) {
                contextData2.f13263a = obj;
                map.put(str, contextData2);
            } else {
                map.put(str, contextData2);
                b(obj, contextData2, arrayList, i2 + 1);
            }
        }
    }

    public static String c(String str, HashMap map) throws UnsupportedEncodingException {
        String strGroup;
        if (str == null || map.size() == 0) {
            return str;
        }
        Matcher matcher = Pattern.compile(".*(&c\\.(.*)&\\.c).*").matcher(str);
        if (!matcher.matches() || (strGroup = matcher.group(2)) == null) {
            return str;
        }
        HashMap map2 = new HashMap(64);
        ArrayList arrayList = new ArrayList(16);
        for (String str2 : strGroup.split("&")) {
            if (str2.endsWith(".") && !str2.contains("=")) {
                arrayList.add(str2);
            } else if (!str2.startsWith(".")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    String str3 = strArrSplit[0];
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                    }
                    sb.append(str3);
                    try {
                        map2.put(sb.toString(), URLDecoder.decode(strArrSplit[1], "UTF-8"));
                    } catch (UnsupportedEncodingException e2) {
                        e2.printStackTrace();
                    }
                }
            } else if (arrayList.size() > 0) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        map2.putAll(map);
        StringBuilder sb2 = new StringBuilder(str.substring(0, matcher.start(1)));
        HashMap map3 = new HashMap();
        map3.put("c", S(map2));
        P(sb2, map3);
        sb2.append(str.substring(matcher.end(1)));
        return sb2.toString();
    }

    public static HashMap d(Map map) throws UnsupportedEncodingException {
        if (map == null) {
            return new HashMap();
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String strE = e((String) entry.getKey());
            if (strE != null) {
                map2.put(strE, entry.getValue());
            }
        }
        return map2;
    }

    public static String e(String str) throws UnsupportedEncodingException {
        if (str != null) {
            HashMap map = Y;
            synchronized (map) {
                try {
                    String str2 = (String) map.get(str);
                    if (str2 != null) {
                        return str2;
                    }
                    try {
                        byte[] bytes = str.getBytes("UTF-8");
                        byte[] bArr = new byte[bytes.length];
                        int i2 = 0;
                        byte b2 = 0;
                        for (byte b3 : bytes) {
                            if ((b3 != 46 || b2 != 46) && c[b3 & 255]) {
                                bArr[i2] = b3;
                                i2++;
                                b2 = b3;
                            }
                        }
                        if (i2 != 0) {
                            int i3 = bArr[0] == 46 ? 1 : 0;
                            int i4 = (i2 - (bArr[i2 + (-1)] == 46 ? 1 : 0)) - i3;
                            if (i4 > 0) {
                                String str3 = new String(bArr, i3, i4, "UTF-8");
                                HashMap map2 = Y;
                                synchronized (map2) {
                                    try {
                                        if (Z > 250) {
                                            map2.clear();
                                            Z = 0;
                                        }
                                        map2.put(str, str3);
                                        Z++;
                                    } finally {
                                    }
                                }
                                return str3;
                            }
                        }
                    } catch (UnsupportedEncodingException e2) {
                        J("Analytics - Unable to clean context data key (%s)", e2.getLocalizedMessage());
                        return null;
                    }
                } finally {
                }
            }
        }
        return null;
    }

    public static String f(String str, HashMap map) {
        try {
            for (Map.Entry entry : map.entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
            return str;
        } catch (Exception e2) {
            I("Unable to expand tokens (%s)", e2.toString());
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[Catch: all -> 0x0025, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {, blocks: (B:9:0x001a, B:11:0x001e, B:31:0x0085, B:16:0x0027, B:22:0x004e, B:24:0x005c, B:28:0x006f, B:27:0x0069, B:19:0x0042, B:30:0x0078), top: B:39:0x001a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g() {
        /*
            com.adobe.mobile.MobileConfig r0 = com.adobe.mobile.MobileConfig.b()
            boolean r0 = r0.j()
            r1 = 0
            if (r0 == 0) goto L8b
            com.adobe.mobile.MobileConfig r0 = com.adobe.mobile.MobileConfig.b()
            com.adobe.mobile.MobilePrivacyStatus r0 = r0.l
            com.adobe.mobile.MobilePrivacyStatus r2 = com.adobe.mobile.MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_OUT
            if (r0 != r2) goto L17
            goto L8b
        L17:
            java.lang.Object r0 = com.adobe.mobile.StaticMethods.X
            monitor-enter(r0)
            java.lang.String r2 = com.adobe.mobile.StaticMethods.W     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L85
            goto L27
        L25:
            r1 = move-exception
            goto L89
        L27:
            android.content.SharedPreferences r2 = B()     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            java.lang.String r3 = "ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID"
            r4 = 0
            boolean r2 = r2.getBoolean(r3, r4)     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            android.content.SharedPreferences r3 = B()     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            java.lang.String r5 = "ADOBEMOBILE_STOREDDEFAULTS_AID"
            java.lang.String r1 = r3.getString(r5, r1)     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            com.adobe.mobile.StaticMethods.W = r1     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            if (r2 != 0) goto L42
            if (r1 == 0) goto L4e
        L42:
            com.adobe.mobile.MobileConfig r1 = com.adobe.mobile.MobileConfig.b()     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            if (r1 != 0) goto L85
            if (r2 == 0) goto L85
        L4e:
            java.lang.String r1 = N()     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            com.adobe.mobile.StaticMethods.W = r1     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            android.content.SharedPreferences$Editor r1 = C()     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            java.lang.String r2 = com.adobe.mobile.StaticMethods.W     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            if (r2 == 0) goto L69
            java.lang.String r3 = "ADOBEMOBILE_STOREDDEFAULTS_AID"
            r1.putString(r3, r2)     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            java.lang.String r2 = "ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID"
            r1.putBoolean(r2, r4)     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            goto L6f
        L67:
            r1 = move-exception
            goto L78
        L69:
            java.lang.String r2 = "ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID"
            r3 = 1
            r1.putBoolean(r2, r3)     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
        L6f:
            r1.commit()     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            java.lang.String r1 = com.adobe.mobile.StaticMethods.W     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            R(r1)     // Catch: java.lang.Throwable -> L25 com.adobe.mobile.StaticMethods.NullContextException -> L67
            goto L85
        L78:
            java.lang.String r2 = "Config - Error getting AID. (%s)"
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L25
            J(r2, r1)     // Catch: java.lang.Throwable -> L25
        L85:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = com.adobe.mobile.StaticMethods.W
            return r0
        L89:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r1
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.mobile.StaticMethods.g():java.lang.String");
    }

    public static String h() {
        synchronized (v) {
        }
        return null;
    }

    public static ExecutorService i() {
        ExecutorService executorService;
        synchronized (L) {
            try {
                if (K == null) {
                    K = Executors.newSingleThreadExecutor();
                }
                executorService = K;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static String j() {
        String str;
        String str2;
        String str3;
        synchronized (i) {
            try {
                if (h == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(k() != null ? k() : "");
                    if (l() == null || l().length() <= 0) {
                        str2 = "";
                    } else {
                        str2 = " " + l() + " ";
                    }
                    sb.append(str2);
                    if (m() != 0) {
                        Locale locale = Locale.US;
                        str3 = "(" + m() + ")";
                    } else {
                        str3 = "";
                    }
                    sb.append(str3);
                    h = sb.toString();
                    try {
                        SharedPreferences.Editor editorC = C();
                        editorC.putString("ADOBEMOBILE_STOREDDEFAULTS_APPID", h);
                        editorC.commit();
                    } catch (NullContextException e2) {
                        K("Config - Unable to set Application ID in preferences (%s)", e2.getLocalizedMessage());
                    }
                }
                str = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String k() {
        String str;
        synchronized (k) {
            try {
                if (j == null) {
                    j = "";
                    try {
                        try {
                            PackageManager packageManager = A().getPackageManager();
                            if (packageManager != null) {
                                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(A().getPackageName(), 0);
                                if (applicationInfo != null) {
                                    j = packageManager.getApplicationLabel(applicationInfo) != null ? (String) packageManager.getApplicationLabel(applicationInfo) : "";
                                } else {
                                    K("Analytics - ApplicationInfo was null", new Object[0]);
                                    j = "";
                                }
                            } else {
                                K("Analytics - PackageManager was null", new Object[0]);
                                j = "";
                            }
                        } catch (NullContextException e2) {
                            J("Config - Unable to get package to pull application name. (%s)", e2.getMessage());
                            j = "";
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        K("Analytics - PackageManager couldn't find application name (%s)", e3.toString());
                        j = "";
                    }
                }
                str = j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String l() {
        String str;
        synchronized (m) {
            try {
                if (l == null) {
                    l = "";
                    try {
                        PackageManager packageManager = A().getPackageManager();
                        if (packageManager != null) {
                            PackageInfo packageInfo = packageManager.getPackageInfo(A().getPackageName(), 0);
                            if (packageInfo != null) {
                                String str2 = packageInfo.versionName;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                l = str2;
                            } else {
                                K("Analytics - PackageInfo was null", new Object[0]);
                                l = "";
                            }
                        } else {
                            K("Analytics - PackageManager was null", new Object[0]);
                            l = "";
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        K("Analytics - PackageManager couldn't find application version (%s)", e2.toString());
                        l = "";
                    } catch (NullContextException e3) {
                        J("Config - Unable to get package to pull application version. (%s)", e3.getMessage());
                        l = "";
                    }
                }
                str = l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static int m() {
        int i2;
        synchronized (o) {
            try {
                if (n == -1) {
                    try {
                        PackageManager packageManager = A().getPackageManager();
                        if (packageManager != null) {
                            PackageInfo packageInfo = packageManager.getPackageInfo(A().getPackageName(), 0);
                            if (packageInfo != null) {
                                int i3 = packageInfo.versionCode;
                                if (i3 <= 0) {
                                    i3 = 0;
                                }
                                n = i3;
                            } else {
                                K("Analytics - PackageInfo was null", new Object[0]);
                                n = 0;
                            }
                        } else {
                            K("Analytics - PackageManager was null", new Object[0]);
                            n = 0;
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        K("Analytics - PackageManager couldn't find application version code (%s)", e2.toString());
                        n = 0;
                    } catch (NullContextException e3) {
                        J("Config - Unable to get package to pull application version code. (%s)", e3.getMessage());
                        n = 0;
                    }
                }
                i2 = n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    public static ExecutorService n() {
        ExecutorService executorService;
        synchronized (T) {
            try {
                if (S == null) {
                    S = Executors.newSingleThreadExecutor();
                }
                executorService = S;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static File o() {
        try {
            return A().getCacheDir();
        } catch (NullContextException e2) {
            J("Config - Error getting cache directory. (%s)", e2.getMessage());
            return null;
        }
    }

    public static String p() {
        String str;
        synchronized (D) {
            if (C == null) {
                try {
                    C = ((TelephonyManager) A().getSystemService("phone")).getNetworkOperatorName();
                } catch (NullContextException e2) {
                    J("Config - Error getting device carrier. (%s)", e2.getMessage());
                }
                str = C;
            } else {
                str = C;
            }
        }
        return str;
    }

    public static Activity q() {
        Activity activity;
        synchronized (c0) {
            try {
                WeakReference weakReference = b0;
                if (weakReference == null || weakReference.get() == null) {
                    throw new NullActivityException("Message - No Current Activity (Messages must have a reference to the current activity to work properly)");
                }
                activity = (Activity) b0.get();
            } catch (Throwable th) {
                throw th;
            }
        }
        return activity;
    }

    public static int r() {
        try {
            return q().getResources().getConfiguration().orientation;
        } catch (NullActivityException unused) {
            return -1;
        }
    }

    public static String s() {
        Configuration configuration;
        Locale locale;
        try {
            Resources resources = A().getResources();
            if (resources == null || (configuration = resources.getConfiguration()) == null || (locale = configuration.locale) == null) {
                return null;
            }
            return locale.toString().replace('_', '-');
        } catch (NullContextException e2) {
            J("Config - Error getting application resources for default accepted language. (%s)", e2.getMessage());
            return null;
        }
    }

    public static HashMap t() {
        HashMap map;
        synchronized (z) {
            try {
                if (y == null) {
                    HashMap map2 = new HashMap();
                    y = map2;
                    map2.put("a.DeviceName", Build.MODEL);
                    y.put("a.Resolution", z());
                    y.put("a.OSVersion", x());
                    y.put("a.CarrierName", p());
                    y.put("a.AppID", j());
                    y.put("a.RunMode", e ? "Extension" : "Application");
                }
                map = y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public static String u() {
        String str;
        synchronized (x) {
            try {
                if (w == null) {
                    w = "Mozilla/5.0 (Linux; U; Android " + Build.VERSION.RELEASE + "; " + s() + "; " + Build.MODEL + " Build/" + Build.ID + ")";
                }
                str = w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String v(String str) throws UnsupportedEncodingException {
        if (str.length() <= 0) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            char[] cArr = new char[length << 1];
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i2 + 1;
                int i5 = (bytes[i2] & 255) << 1;
                char[] cArr2 = d0;
                cArr[i3] = cArr2[i5];
                i3 += 2;
                cArr[i3 + 1] = cArr2[i5 + 1];
                i2 = i4;
            }
            return new String(cArr);
        } catch (UnsupportedEncodingException e2) {
            I("Failed to get hex from string (%s)", e2.getMessage());
            return null;
        }
    }

    public static ExecutorService w() {
        ExecutorService executorService;
        synchronized (N) {
            try {
                if (M == null) {
                    M = Executors.newSingleThreadExecutor();
                }
                executorService = M;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static String x() {
        String str;
        synchronized (F) {
            if (E == null) {
                E = "Android " + Build.VERSION.RELEASE;
                try {
                    SharedPreferences.Editor editorC = C();
                    editorC.putString("ADOBEMOBILE_STOREDDEFAULTS_OS", E);
                    editorC.commit();
                } catch (NullContextException e2) {
                    K("Config - Unable to set OS version in preferences (%s)", e2.getLocalizedMessage());
                }
                str = E;
            } else {
                str = E;
            }
        }
        return str;
    }

    public static ExecutorService y() {
        ExecutorService executorService;
        synchronized (V) {
            try {
                if (U == null) {
                    U = Executors.newSingleThreadExecutor();
                }
                executorService = U;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static String z() {
        String str;
        synchronized (B) {
            if (A == null) {
                try {
                    DisplayMetrics displayMetrics = A().getResources().getDisplayMetrics();
                    A = displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
                } catch (NullContextException e2) {
                    J("Config - Error getting device resolution. (%s)", e2.getMessage());
                }
                str = A;
            } else {
                str = A;
            }
        }
        return str;
    }
}
