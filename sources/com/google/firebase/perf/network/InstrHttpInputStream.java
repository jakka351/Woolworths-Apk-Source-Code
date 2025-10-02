package com.google.firebase.perf.network;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class InstrHttpInputStream extends InputStream {
    public final InputStream d;
    public final NetworkRequestMetricBuilder e;
    public final Timer f;
    public long h;
    public long g = -1;
    public long i = -1;

    public InstrHttpInputStream(InputStream inputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, Timer timer) {
        this.f = timer;
        this.d = inputStream;
        this.e = networkRequestMetricBuilder;
        this.h = ((NetworkRequestMetric) networkRequestMetricBuilder.g.e).i0();
    }

    public final void a(long j) {
        long j2 = this.g;
        if (j2 == -1) {
            this.g = j;
        } else {
            this.g = j2 + j;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.d.available();
        } catch (IOException e) {
            Timer timer = this.f;
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.e;
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.e;
        Timer timer = this.f;
        long jA = timer.a();
        if (this.i == -1) {
            this.i = jA;
        }
        try {
            this.d.close();
            long j = this.g;
            if (j != -1) {
                networkRequestMetricBuilder.h(j);
            }
            long j2 = this.h;
            if (j2 != -1) {
                NetworkRequestMetric.Builder builder = networkRequestMetricBuilder.g;
                builder.p();
                NetworkRequestMetric.S((NetworkRequestMetric) builder.e, j2);
            }
            networkRequestMetricBuilder.i(this.i);
            networkRequestMetricBuilder.b();
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.d.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.d.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Timer timer = this.f;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.e;
        try {
            int i = this.d.read();
            long jA = timer.a();
            if (this.h == -1) {
                this.h = jA;
            }
            if (i != -1 || this.i != -1) {
                a(1L);
                networkRequestMetricBuilder.h(this.g);
                return i;
            }
            this.i = jA;
            networkRequestMetricBuilder.i(jA);
            networkRequestMetricBuilder.b();
            return i;
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.d.reset();
        } catch (IOException e) {
            Timer timer = this.f;
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.e;
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        Timer timer = this.f;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.e;
        try {
            long jSkip = this.d.skip(j);
            long jA = timer.a();
            if (this.h == -1) {
                this.h = jA;
            }
            if (jSkip == 0 && j != 0 && this.i == -1) {
                this.i = jA;
                networkRequestMetricBuilder.i(jA);
                return jSkip;
            }
            a(jSkip);
            networkRequestMetricBuilder.h(this.g);
            return jSkip;
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Timer timer = this.f;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.e;
        try {
            int i3 = this.d.read(bArr, i, i2);
            long jA = timer.a();
            if (this.h == -1) {
                this.h = jA;
            }
            if (i3 == -1 && this.i == -1) {
                this.i = jA;
                networkRequestMetricBuilder.i(jA);
                networkRequestMetricBuilder.b();
                return i3;
            }
            a(i3);
            networkRequestMetricBuilder.h(this.g);
            return i3;
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        Timer timer = this.f;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.e;
        try {
            int i = this.d.read(bArr);
            long jA = timer.a();
            if (this.h == -1) {
                this.h = jA;
            }
            if (i == -1 && this.i == -1) {
                this.i = jA;
                networkRequestMetricBuilder.i(jA);
                networkRequestMetricBuilder.b();
                return i;
            }
            a(i);
            networkRequestMetricBuilder.h(this.g);
            return i;
        } catch (IOException e) {
            c.x(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }
}
