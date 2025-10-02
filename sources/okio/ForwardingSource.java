package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/ForwardingSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ForwardingSource implements Source {
    public final Source d;

    public ForwardingSource(Source delegate) {
        Intrinsics.h(delegate, "delegate");
        this.d = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }

    @Override // okio.Source
    public final Timeout n() {
        return this.d.n();
    }

    @Override // okio.Source
    public long q2(Buffer sink, long j) {
        Intrinsics.h(sink, "sink");
        return this.d.q2(sink, j);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.d + ')';
    }
}
