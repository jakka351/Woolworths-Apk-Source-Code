package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.URLWrapper;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        URLWrapper uRLWrapper = new URLWrapper(url);
        TransportManager transportManager = TransportManager.v;
        Timer timer = new Timer();
        timer.c();
        long j = timer.d;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(transportManager);
        try {
            URLConnection uRLConnectionA = uRLWrapper.a();
            return uRLConnectionA instanceof HttpsURLConnection ? new InstrHttpsURLConnection((HttpsURLConnection) uRLConnectionA, timer, networkRequestMetricBuilder).f15708a.b() : uRLConnectionA instanceof HttpURLConnection ? new InstrHttpURLConnection((HttpURLConnection) uRLConnectionA, timer, networkRequestMetricBuilder).getContent() : uRLConnectionA.getContent();
        } catch (IOException e) {
            networkRequestMetricBuilder.f(j);
            networkRequestMetricBuilder.i(timer.a());
            networkRequestMetricBuilder.j(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.c(networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        return obj instanceof HttpsURLConnection ? new InstrHttpsURLConnection((HttpsURLConnection) obj, new Timer(), new NetworkRequestMetricBuilder(TransportManager.v)) : obj instanceof HttpURLConnection ? new InstrHttpURLConnection((HttpURLConnection) obj, new Timer(), new NetworkRequestMetricBuilder(TransportManager.v)) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        URLWrapper uRLWrapper = new URLWrapper(url);
        TransportManager transportManager = TransportManager.v;
        Timer timer = new Timer();
        if (!transportManager.f.get()) {
            return uRLWrapper.a().getInputStream();
        }
        timer.c();
        long j = timer.d;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(transportManager);
        try {
            URLConnection uRLConnectionA = uRLWrapper.a();
            return uRLConnectionA instanceof HttpsURLConnection ? new InstrHttpsURLConnection((HttpsURLConnection) uRLConnectionA, timer, networkRequestMetricBuilder).f15708a.e() : uRLConnectionA instanceof HttpURLConnection ? new InstrHttpURLConnection((HttpURLConnection) uRLConnectionA, timer, networkRequestMetricBuilder).getInputStream() : uRLConnectionA.getInputStream();
        } catch (IOException e) {
            networkRequestMetricBuilder.f(j);
            networkRequestMetricBuilder.i(timer.a());
            networkRequestMetricBuilder.j(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.c(networkRequestMetricBuilder);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        URLWrapper uRLWrapper = new URLWrapper(url);
        TransportManager transportManager = TransportManager.v;
        Timer timer = new Timer();
        timer.c();
        long j = timer.d;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(transportManager);
        try {
            URLConnection uRLConnectionA = uRLWrapper.a();
            if (uRLConnectionA instanceof HttpsURLConnection) {
                return new InstrHttpsURLConnection((HttpsURLConnection) uRLConnectionA, timer, networkRequestMetricBuilder).f15708a.c(clsArr);
            }
            if (uRLConnectionA instanceof HttpURLConnection) {
                return new InstrHttpURLConnection((HttpURLConnection) uRLConnectionA, timer, networkRequestMetricBuilder).getContent(clsArr);
            }
            return uRLConnectionA.getContent(clsArr);
        } catch (IOException e) {
            networkRequestMetricBuilder.f(j);
            networkRequestMetricBuilder.i(timer.a());
            networkRequestMetricBuilder.j(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.c(networkRequestMetricBuilder);
            throw e;
        }
    }
}
