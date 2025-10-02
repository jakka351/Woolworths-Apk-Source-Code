package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ConfigFetchHttpClient {
    public static final Pattern h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Context f15765a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f15765a = context;
        this.b = str;
        this.c = str2;
        Matcher matcher = h.matcher(str);
        this.d = matcher.matches() ? matcher.group(1) : null;
        this.e = str3;
        this.f = j;
        this.g = j2;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Callback.b(httpURLConnection), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) i);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Callback.d(httpURLConnection));
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l, Map map2) throws PackageManager.NameNotFoundException, FirebaseRemoteConfigClientException {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.b);
        Context context = this.f15765a;
        Locale locale = context.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        int i = Build.VERSION.SDK_INT;
        map3.put("languageCode", locale.toLanguageTag());
        map3.put("platformVersion", Integer.toString(i));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put("appVersion", packageInfo.versionName);
                map3.put("appBuild", Long.toString(packageInfo.getLongVersionCode()));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", context.getPackageName());
        map3.put(lllqqql.cc006300630063cc, "23.0.0");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map3.put("firstOpenTime", simpleDateFormat.format(l));
        }
        return new JSONObject(map3);
    }

    public final HttpURLConnection b() {
        try {
            URLConnection uRLConnectionOpenConnection = new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.d + "/namespaces/" + this.e + ":fetch").openConnection();
            Callback.v(uRLConnectionOpenConnection);
            return (HttpURLConnection) uRLConnectionOpenConnection;
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009e A[LOOP:0: B:13:0x0098->B:15:0x009e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8 A[Catch: all -> 0x0183, IOException | JSONException -> 0x0185, IOException -> 0x0187, TRY_LEAVE, TryCatch #0 {all -> 0x0183, blocks: (B:17:0x00bc, B:19:0x00d8, B:66:0x0189, B:67:0x0192, B:68:0x0193, B:69:0x019a), top: B:81:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189 A[Catch: all -> 0x0183, IOException | JSONException -> 0x0185, IOException -> 0x0187, TRY_ENTER, TryCatch #0 {all -> 0x0183, blocks: (B:17:0x00bc, B:19:0x00d8, B:66:0x0189, B:67:0x0192, B:68:0x0193, B:69:0x019a), top: B:81:0x00bc }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse fetch(java.net.HttpURLConnection r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15, java.lang.Long r16, java.util.Date r17, java.util.Map<java.lang.String, java.lang.String> r18) throws com.google.firebase.remoteconfig.FirebaseRemoteConfigException {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date, java.util.Map):com.google.firebase.remoteconfig.internal.ConfigFetchHandler$FetchResponse");
    }
}
