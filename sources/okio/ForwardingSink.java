package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/ForwardingSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ForwardingSink implements Sink {
    public final Sink d;

    public ForwardingSink(Sink delegate) {
        Intrinsics.h(delegate, "delegate");
        this.d = delegate;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.d.flush();
    }

    @Override // okio.Sink
    public final Timeout n() {
        return this.d.n();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.d + ')';
    }

    @Override // okio.Sink
    public void w1(Buffer source, long j) {
        Intrinsics.h(source, "source");
        this.d.w1(source, j);
    }
}
