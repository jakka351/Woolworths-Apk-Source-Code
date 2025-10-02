package com.google.firebase.perf.network;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* loaded from: classes6.dex */
public final class InstrHttpURLConnection extends HttpURLConnection {

    /* renamed from: a, reason: collision with root package name */
    public final InstrURLConnectionBase f15707a;

    public InstrHttpURLConnection(HttpURLConnection httpURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        super(httpURLConnection.getURL());
        this.f15707a = new InstrURLConnectionBase(httpURLConnection, timer, networkRequestMetricBuilder);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f15707a.f15709a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.f15707a.a();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = instrURLConnectionBase.b;
        networkRequestMetricBuilder.i(instrURLConnectionBase.e.a());
        networkRequestMetricBuilder.b();
        instrURLConnectionBase.f15709a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.f15707a.f15709a.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f15707a.f15709a.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f15707a.f15709a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.f15707a.b();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.i();
        return instrURLConnectionBase.f15709a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.i();
        return instrURLConnectionBase.f15709a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.i();
        return instrURLConnectionBase.f15709a.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.i();
        return instrURLConnectionBase.f15709a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.i();
        return instrURLConnectionBase.f15709a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f15707a.f15709a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f15707a.f15709a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f15707a.f15709a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f15707a.d();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.i();
        return instrURLConnectionBase.f15709a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.i();
        return instrURLConnectionBase.f15709a.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.i();
        return instrURLConnectionBase.f15709a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.i();
        return instrURLConnectionBase.f15709a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.i();
        return instrURLConnectionBase.f15709a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.i();
        return instrURLConnectionBase.f15709a.getHeaderFieldLong(str, j);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.i();
        return instrURLConnectionBase.f15709a.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f15707a.f15709a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.f15707a.e();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f15707a.f15709a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.i();
        return instrURLConnectionBase.f15709a.getLastModified();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f15707a.f();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = instrURLConnectionBase.b;
        try {
            return instrURLConnectionBase.f15709a.getPermission();
        } catch (IOException e) {
            c.x(instrURLConnectionBase.e, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f15707a.f15709a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f15707a.f15709a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.f15707a.f15709a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f15707a.f15709a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f15707a.g();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.f15707a.h();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f15707a.f15709a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f15707a.f15709a.getUseCaches();
    }

    public final int hashCode() {
        return this.f15707a.f15709a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.f15707a.f15709a.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.f15707a.f15709a.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.f15707a.f15709a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.f15707a.f15709a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.f15707a.f15709a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.f15707a.f15709a.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.f15707a.f15709a.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.f15707a.f15709a.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.f15707a.f15709a.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.f15707a.f15709a.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.f15707a.f15709a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.getClass();
        if ("User-Agent".equalsIgnoreCase(str)) {
            instrURLConnectionBase.b.i = str2;
        }
        instrURLConnectionBase.f15709a.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.f15707a.f15709a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f15707a.f15709a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f15707a.f15709a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.f15707a.c(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        InstrURLConnectionBase instrURLConnectionBase = this.f15707a;
        instrURLConnectionBase.i();
        return instrURLConnectionBase.f15709a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.f15707a.f15709a.setFixedLengthStreamingMode(j);
    }
}
