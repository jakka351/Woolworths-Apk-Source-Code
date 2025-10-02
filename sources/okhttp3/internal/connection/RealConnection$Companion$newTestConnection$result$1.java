package okhttp3.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/internal/connection/RealConnection$Companion$newTestConnection$result$1", "Lokio/Source;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RealConnection$Companion$newTestConnection$result$1 implements Source {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.Source
    public final Timeout n() {
        return Timeout.e;
    }

    @Override // okio.Source
    public final long q2(Buffer sink, long j) {
        Intrinsics.h(sink, "sink");
        throw new UnsupportedOperationException();
    }
}
