package com.braintreepayments.api;

import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocketFactory;
import me.oriient.internal.infra.rest.RequestBuilder;

/* loaded from: classes4.dex */
class SynchronousHttpClient {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f13747a;
    public final HttpResponseParser b;

    public SynchronousHttpClient(SSLSocketFactory sSLSocketFactory, HttpResponseParser httpResponseParser) {
        this.b = httpResponseParser;
        this.f13747a = sSLSocketFactory;
    }

    public final HttpResponse a(HttpRequest httpRequest) throws URISyntaxException, IOException {
        if (httpRequest.f13726a == null) {
            throw new IllegalArgumentException("Path cannot be null");
        }
        URL urlB = httpRequest.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        URLConnection uRLConnectionOpenConnection = urlB.openConnection();
        Callback.v(uRLConnectionOpenConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection));
        if (httpURLConnection instanceof HttpsURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.f13747a;
            if (sSLSocketFactory == null) {
                throw new SSLException("SSLSocketFactory was not set or failed to initialize");
            }
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        String str = httpRequest.d;
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setReadTimeout(httpRequest.e);
        httpURLConnection.setConnectTimeout(httpRequest.f);
        if (httpRequest.g == null) {
            HashMap map = new HashMap();
            httpRequest.g = map;
            map.put("Accept-Encoding", "gzip");
            httpRequest.g.put("Accept-Language", Locale.getDefault().getLanguage());
            httpRequest.g.putAll(httpRequest.h);
        }
        for (Map.Entry entry : Collections.unmodifiableMap(httpRequest.g).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (str != null && str.equals("POST")) {
            httpURLConnection.setRequestProperty(RequestBuilder.CONTENT_TYPE, "application/json");
            httpURLConnection.setDoOutput(true);
            OutputStream outputStreamD = Callback.d(httpURLConnection);
            outputStreamD.write(httpRequest.c);
            outputStreamD.flush();
            outputStreamD.close();
            byte[] bArr = httpRequest.c;
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
            }
        }
        try {
            int iF = Callback.f(httpURLConnection);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            String strA = this.b.a(httpURLConnection, iF);
            HttpResponseTiming httpResponseTiming = new HttpResponseTiming();
            httpResponseTiming.f13728a = jCurrentTimeMillis;
            httpResponseTiming.b = jCurrentTimeMillis2;
            HttpResponse httpResponse = new HttpResponse();
            httpResponse.f13727a = strA;
            httpResponse.b = httpResponseTiming;
            return httpResponse;
        } finally {
            httpURLConnection.disconnect();
        }
    }
}
