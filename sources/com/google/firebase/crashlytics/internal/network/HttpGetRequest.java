package com.google.firebase.crashlytics.internal.network;

import YU.a;
import androidx.camera.core.impl.b;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public class HttpGetRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f15385a;
    public final HashMap b;
    public final HashMap c = new HashMap();

    public HttpGetRequest(String str, HashMap map) {
        this.f15385a = str;
        this.b = map;
    }

    public static String a(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return b.o(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return a.g(str, string);
    }

    public final HttpResponse b() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        CrashlyticsWorkers.b();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strA = a(this.f15385a, this.b);
            Logger.f15258a.e("GET Request URL: " + strA);
            URLConnection uRLConnectionOpenConnection = new URL(strA).openConnection();
            Callback.v(uRLConnectionOpenConnection);
            httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            try {
                httpsURLConnection.setReadTimeout(ModuleDescriptor.MODULE_VERSION);
                httpsURLConnection.setConnectTimeout(ModuleDescriptor.MODULE_VERSION);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int iF = Callback.f(httpsURLConnection);
                InputStream inputStreamA = Callback.a(httpsURLConnection);
                if (inputStreamA != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamA, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int i = bufferedReader.read(cArr);
                            if (i == -1) {
                                break;
                            }
                            sb.append(cArr, 0, i);
                        }
                        string = sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStreamA;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                httpsURLConnection.disconnect();
                return new HttpResponse(iF, string);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public final void c(String str, String str2) {
        this.c.put(str, str2);
    }
}
