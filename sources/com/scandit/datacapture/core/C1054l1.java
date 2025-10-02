package com.scandit.datacapture.core;

import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsMethod;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.l1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1054l1 implements InterfaceC1036j1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f18795a;
    private final NativeHttpsMethod b;
    private final Map c;
    private final X6 d;
    private final InterfaceC1065m3 e;

    public C1054l1(String url, NativeHttpsMethod method, HashMap headers, X6 sslSocketHandler, InterfaceC1065m3 hostValidator) {
        Intrinsics.h(url, "url");
        Intrinsics.h(method, "method");
        Intrinsics.h(headers, "headers");
        Intrinsics.h(sslSocketHandler, "sslSocketHandler");
        Intrinsics.h(hostValidator, "hostValidator");
        this.f18795a = url;
        this.b = method;
        this.c = headers;
        this.d = sslSocketHandler;
        this.e = hostValidator;
    }

    public final HttpsURLConnection a() throws C1158w6, C1176y6, C1149v6, IOException, C1077n6 {
        try {
            URL url = new URL(this.f18795a);
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Callback.v(uRLConnectionOpenConnection);
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection);
            Intrinsics.f(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
            ((Y6) this.d).a(httpsURLConnection);
            for (Map.Entry entry : this.c.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpsURLConnection.setRequestProperty("User-Agent", "ScanditInternal");
            int i = AbstractC1045k1.f18789a[this.b.ordinal()];
            if (i == 1) {
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(false);
            } else if (i == 2) {
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setChunkedStreamingMode(0);
            }
            InterfaceC1065m3 interfaceC1065m3 = this.e;
            URL url2 = httpsURLConnection.getURL();
            Intrinsics.g(url2, "connection.url");
            ((C1074n3) interfaceC1065m3).a(url, url2);
            return httpsURLConnection;
        } catch (ClassCastException e) {
            throw new C1149v6(e);
        } catch (MalformedURLException e2) {
            throw new C1158w6(e2);
        } catch (IOException e3) {
            throw new C1077n6(e3);
        } catch (Exception e4) {
            throw new C1176y6(e4);
        }
    }

    public /* synthetic */ C1054l1(String str, NativeHttpsMethod nativeHttpsMethod, HashMap map, X6 x6) {
        this(str, nativeHttpsMethod, map, x6, new C1074n3());
    }
}
