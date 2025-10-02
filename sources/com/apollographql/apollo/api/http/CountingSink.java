package com.apollographql.apollo.api.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/http/CountingSink;", "Lokio/Sink;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CountingSink implements Sink {
    public final Sink d;
    public long e;

    public CountingSink(Sink sink) {
        this.d = sink;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        this.d.flush();
    }

    @Override // okio.Sink
    public final Timeout n() {
        return this.d.n();
    }

    @Override // okio.Sink
    public final void w1(Buffer source, long j) {
        Intrinsics.h(source, "source");
        this.d.w1(source, j);
        this.e += j;
    }
}
