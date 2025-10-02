package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/BlackholeSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final class BlackholeSink implements Sink {
    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
    }

    @Override // okio.Sink
    /* renamed from: n */
    public final Timeout getE() {
        return Timeout.e;
    }

    @Override // okio.Sink
    public final void w1(Buffer source, long j) {
        Intrinsics.h(source, "source");
        source.skip(j);
    }
}
