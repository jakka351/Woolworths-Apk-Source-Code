package me.oriient.internal.infra.rest;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes7.dex */
public final class b implements HttpClientProvider {

    /* renamed from: a, reason: collision with root package name */
    public long f24977a;
    public long b = 10000;
    public long c = 10000;
    public long d = 10000;
    public boolean e;

    @Override // me.oriient.internal.infra.rest.HttpClientProvider
    public final long getCallTimeoutMillis() {
        return this.f24977a;
    }

    @Override // me.oriient.internal.infra.rest.HttpClientProvider
    public final OkHttpClient getClient() throws SecurityException {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j = this.f24977a;
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.h(unit, "unit");
        builder.x = _UtilJvmKt.b(j, unit);
        builder.c(this.f24977a, unit);
        builder.d(this.f24977a, unit);
        builder.e(this.f24977a, unit);
        OkHttpClient okHttpClient = new OkHttpClient(builder);
        if (this.e) {
            Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);
        }
        return okHttpClient;
    }

    @Override // me.oriient.internal.infra.rest.HttpClientProvider
    public final long getConnectTimeoutMillis() {
        return this.b;
    }

    @Override // me.oriient.internal.infra.rest.HttpClientProvider
    public final boolean getEnableHttpClientLogging() {
        return this.e;
    }

    @Override // me.oriient.internal.infra.rest.HttpClientProvider
    public final long getReadTimeoutMillis() {
        return this.c;
    }

    @Override // me.oriient.internal.infra.rest.HttpClientProvider
    public final long getWriteTimeoutMillis() {
        return this.d;
    }

    @Override // me.oriient.internal.infra.rest.HttpClientProvider
    public final void setCallTimeoutMillis(long j) {
        this.f24977a = j;
    }

    @Override // me.oriient.internal.infra.rest.HttpClientProvider
    public final void setConnectTimeoutMillis(long j) {
        this.b = j;
    }

    @Override // me.oriient.internal.infra.rest.HttpClientProvider
    public final void setEnableHttpClientLogging(boolean z) {
        this.e = z;
    }

    @Override // me.oriient.internal.infra.rest.HttpClientProvider
    public final void setReadTimeoutMillis(long j) {
        this.c = j;
    }

    @Override // me.oriient.internal.infra.rest.HttpClientProvider
    public final void setWriteTimeoutMillis(long j) {
        this.d = j;
    }
}
