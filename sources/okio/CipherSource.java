package okio;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/CipherSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CipherSource implements Source {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // okio.Source
    /* renamed from: n */
    public final Timeout getE() {
        throw null;
    }

    @Override // okio.Source
    public final long q2(Buffer sink, long j) {
        Intrinsics.h(sink, "sink");
        if (j >= 0) {
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(b.k(j, "byteCount < 0: ").toString());
    }
}
