package com.google.firebase.perf.network;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class InstrHttpOutputStream extends OutputStream {
    public final OutputStream d;
    public final Timer e;
    public final NetworkRequestMetricBuilder f;
    public long g = -1;

    public InstrHttpOutputStream(OutputStream outputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, Timer timer) {
        this.d = outputStream;
        this.f = networkRequestMetricBuilder;
        this.e = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.g;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.f;
        if (j != -1) {
            networkRequestMetricBuilder.e(j);
        }
        Timer timer = this.e;
        long jA = timer.a();
        NetworkRequestMetric.Builder builder = networkRequestMetricBuilder.g;
        builder.p();
        NetworkRequestMetric.R((NetworkRequestMetric) builder.e, jA);
        try {
            this.d.close();
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.d.flush();
        } catch (IOException e) {
            Timer timer = this.e;
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.f;
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.f;
        try {
            this.d.write(i);
            long j = this.g + 1;
            this.g = j;
            networkRequestMetricBuilder.e(j);
        } catch (IOException e) {
            c.x(this.e, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.f;
        try {
            this.d.write(bArr);
            long length = this.g + bArr.length;
            this.g = length;
            networkRequestMetricBuilder.e(length);
        } catch (IOException e) {
            c.x(this.e, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.f;
        try {
            this.d.write(bArr, i, i2);
            long j = this.g + i2;
            this.g = j;
            networkRequestMetricBuilder.e(j);
        } catch (IOException e) {
            c.x(this.e, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }
}
