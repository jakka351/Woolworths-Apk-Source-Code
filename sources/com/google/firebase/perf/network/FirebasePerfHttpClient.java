package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes6.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(TransportManager.v);
        try {
            networkRequestMetricBuilder.j(httpUriRequest.getURI().toString());
            networkRequestMetricBuilder.c(httpUriRequest.getMethod());
            Long lA = NetworkRequestMetricBuilderUtil.a(httpUriRequest);
            if (lA != null) {
                networkRequestMetricBuilder.e(lA.longValue());
            }
            timer.c();
            networkRequestMetricBuilder.f(timer.d);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            networkRequestMetricBuilder.i(timer.a());
            networkRequestMetricBuilder.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = NetworkRequestMetricBuilderUtil.a(httpResponseExecute);
            if (lA2 != null) {
                networkRequestMetricBuilder.h(lA2.longValue());
            }
            String strB = NetworkRequestMetricBuilderUtil.b(httpResponseExecute);
            if (strB != null) {
                networkRequestMetricBuilder.g(strB);
            }
            networkRequestMetricBuilder.b();
            return httpResponseExecute;
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(TransportManager.v);
        try {
            networkRequestMetricBuilder.j(httpUriRequest.getURI().toString());
            networkRequestMetricBuilder.c(httpUriRequest.getMethod());
            Long lA = NetworkRequestMetricBuilderUtil.a(httpUriRequest);
            if (lA != null) {
                networkRequestMetricBuilder.e(lA.longValue());
            }
            timer.c();
            networkRequestMetricBuilder.f(timer.d);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            networkRequestMetricBuilder.i(timer.a());
            networkRequestMetricBuilder.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = NetworkRequestMetricBuilderUtil.a(httpResponseExecute);
            if (lA2 != null) {
                networkRequestMetricBuilder.h(lA2.longValue());
            }
            String strB = NetworkRequestMetricBuilderUtil.b(httpResponseExecute);
            if (strB != null) {
                networkRequestMetricBuilder.g(strB);
            }
            networkRequestMetricBuilder.b();
            return httpResponseExecute;
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(TransportManager.v);
        try {
            networkRequestMetricBuilder.j(httpUriRequest.getURI().toString());
            networkRequestMetricBuilder.c(httpUriRequest.getMethod());
            Long lA = NetworkRequestMetricBuilderUtil.a(httpUriRequest);
            if (lA != null) {
                networkRequestMetricBuilder.e(lA.longValue());
            }
            timer.c();
            networkRequestMetricBuilder.f(timer.d);
            return (T) httpClient.execute(httpUriRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, networkRequestMetricBuilder));
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(TransportManager.v);
        try {
            networkRequestMetricBuilder.j(httpUriRequest.getURI().toString());
            networkRequestMetricBuilder.c(httpUriRequest.getMethod());
            Long lA = NetworkRequestMetricBuilderUtil.a(httpUriRequest);
            if (lA != null) {
                networkRequestMetricBuilder.e(lA.longValue());
            }
            timer.c();
            networkRequestMetricBuilder.f(timer.d);
            return (T) httpClient.execute(httpUriRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, networkRequestMetricBuilder), httpContext);
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(TransportManager.v);
        try {
            networkRequestMetricBuilder.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            networkRequestMetricBuilder.c(httpRequest.getRequestLine().getMethod());
            Long lA = NetworkRequestMetricBuilderUtil.a(httpRequest);
            if (lA != null) {
                networkRequestMetricBuilder.e(lA.longValue());
            }
            timer.c();
            networkRequestMetricBuilder.f(timer.d);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            networkRequestMetricBuilder.i(timer.a());
            networkRequestMetricBuilder.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = NetworkRequestMetricBuilderUtil.a(httpResponseExecute);
            if (lA2 != null) {
                networkRequestMetricBuilder.h(lA2.longValue());
            }
            String strB = NetworkRequestMetricBuilderUtil.b(httpResponseExecute);
            if (strB != null) {
                networkRequestMetricBuilder.g(strB);
            }
            networkRequestMetricBuilder.b();
            return httpResponseExecute;
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(TransportManager.v);
        try {
            networkRequestMetricBuilder.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            networkRequestMetricBuilder.c(httpRequest.getRequestLine().getMethod());
            Long lA = NetworkRequestMetricBuilderUtil.a(httpRequest);
            if (lA != null) {
                networkRequestMetricBuilder.e(lA.longValue());
            }
            timer.c();
            networkRequestMetricBuilder.f(timer.d);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            networkRequestMetricBuilder.i(timer.a());
            networkRequestMetricBuilder.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = NetworkRequestMetricBuilderUtil.a(httpResponseExecute);
            if (lA2 != null) {
                networkRequestMetricBuilder.h(lA2.longValue());
            }
            String strB = NetworkRequestMetricBuilderUtil.b(httpResponseExecute);
            if (strB != null) {
                networkRequestMetricBuilder.g(strB);
            }
            networkRequestMetricBuilder.b();
            return httpResponseExecute;
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(TransportManager.v);
        try {
            networkRequestMetricBuilder.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            networkRequestMetricBuilder.c(httpRequest.getRequestLine().getMethod());
            Long lA = NetworkRequestMetricBuilderUtil.a(httpRequest);
            if (lA != null) {
                networkRequestMetricBuilder.e(lA.longValue());
            }
            timer.c();
            networkRequestMetricBuilder.f(timer.d);
            return (T) httpClient.execute(httpHost, httpRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, networkRequestMetricBuilder));
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(TransportManager.v);
        try {
            networkRequestMetricBuilder.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            networkRequestMetricBuilder.c(httpRequest.getRequestLine().getMethod());
            Long lA = NetworkRequestMetricBuilderUtil.a(httpRequest);
            if (lA != null) {
                networkRequestMetricBuilder.e(lA.longValue());
            }
            timer.c();
            networkRequestMetricBuilder.f(timer.d);
            return (T) httpClient.execute(httpHost, httpRequest, new InstrumentApacheHttpResponseHandler(responseHandler, timer, networkRequestMetricBuilder), httpContext);
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }
}
