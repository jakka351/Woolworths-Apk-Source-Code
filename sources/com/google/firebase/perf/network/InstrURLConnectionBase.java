package com.google.firebase.perf.network;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
class InstrURLConnectionBase {
    public static final AndroidLogger f = AndroidLogger.e();

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f15709a;
    public final NetworkRequestMetricBuilder b;
    public long c = -1;
    public long d = -1;
    public final Timer e;

    public InstrURLConnectionBase(HttpURLConnection httpURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        this.f15709a = httpURLConnection;
        this.b = networkRequestMetricBuilder;
        this.e = timer;
        networkRequestMetricBuilder.j(httpURLConnection.getURL().toString());
    }

    public final void a() {
        long j = this.c;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.b;
        Timer timer = this.e;
        if (j == -1) {
            timer.c();
            long j2 = timer.d;
            this.c = j2;
            networkRequestMetricBuilder.f(j2);
        }
        try {
            this.f15709a.connect();
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public final Object b() throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.f15709a;
        int responseCode = httpURLConnection.getResponseCode();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.b;
        networkRequestMetricBuilder.d(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                networkRequestMetricBuilder.g(httpURLConnection.getContentType());
                return new InstrHttpInputStream((InputStream) content, networkRequestMetricBuilder, timer);
            }
            networkRequestMetricBuilder.g(httpURLConnection.getContentType());
            networkRequestMetricBuilder.h(httpURLConnection.getContentLength());
            networkRequestMetricBuilder.i(timer.a());
            networkRequestMetricBuilder.b();
            return content;
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public final Object c(Class[] clsArr) throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.f15709a;
        int responseCode = httpURLConnection.getResponseCode();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.b;
        networkRequestMetricBuilder.d(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                networkRequestMetricBuilder.g(httpURLConnection.getContentType());
                return new InstrHttpInputStream((InputStream) content, networkRequestMetricBuilder, timer);
            }
            networkRequestMetricBuilder.g(httpURLConnection.getContentType());
            networkRequestMetricBuilder.h(httpURLConnection.getContentLength());
            networkRequestMetricBuilder.i(timer.a());
            networkRequestMetricBuilder.b();
            return content;
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.f15709a;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.b;
        i();
        try {
            networkRequestMetricBuilder.d(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new InstrHttpInputStream(errorStream, networkRequestMetricBuilder, this.e) : errorStream;
    }

    public final InputStream e() throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.f15709a;
        int responseCode = httpURLConnection.getResponseCode();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.b;
        networkRequestMetricBuilder.d(responseCode);
        networkRequestMetricBuilder.g(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new InstrHttpInputStream(inputStream, networkRequestMetricBuilder, timer) : inputStream;
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.f15709a.equals(obj);
    }

    public final OutputStream f() throws IOException {
        Timer timer = this.e;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.b;
        try {
            OutputStream outputStream = this.f15709a.getOutputStream();
            return outputStream != null ? new InstrHttpOutputStream(outputStream, networkRequestMetricBuilder, timer) : outputStream;
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public final int g() throws IOException {
        i();
        long j = this.d;
        Timer timer = this.e;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.b;
        if (j == -1) {
            long jA = timer.a();
            this.d = jA;
            NetworkRequestMetric.Builder builder = networkRequestMetricBuilder.g;
            builder.p();
            NetworkRequestMetric.S((NetworkRequestMetric) builder.e, jA);
        }
        try {
            int responseCode = this.f15709a.getResponseCode();
            networkRequestMetricBuilder.d(responseCode);
            return responseCode;
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public final String h() throws IOException {
        HttpURLConnection httpURLConnection = this.f15709a;
        i();
        long j = this.d;
        Timer timer = this.e;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.b;
        if (j == -1) {
            long jA = timer.a();
            this.d = jA;
            NetworkRequestMetric.Builder builder = networkRequestMetricBuilder.g;
            builder.p();
            NetworkRequestMetric.S((NetworkRequestMetric) builder.e, jA);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            networkRequestMetricBuilder.d(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public final int hashCode() {
        return this.f15709a.hashCode();
    }

    public final void i() {
        long j = this.c;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.b;
        if (j == -1) {
            Timer timer = this.e;
            timer.c();
            long j2 = timer.d;
            this.c = j2;
            networkRequestMetricBuilder.f(j2);
        }
        HttpURLConnection httpURLConnection = this.f15709a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            networkRequestMetricBuilder.c(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            networkRequestMetricBuilder.c("POST");
        } else {
            networkRequestMetricBuilder.c("GET");
        }
    }

    public final String toString() {
        return this.f15709a.toString();
    }
}
