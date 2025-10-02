package okio;

import androidx.camera.core.impl.b;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.internal._JavaIoKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/InputStreamSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
class InputStreamSource implements Source {
    public final InputStream d;
    public final Timeout e;

    public InputStreamSource(InputStream input, Timeout timeout) {
        Intrinsics.h(input, "input");
        this.d = input;
        this.e = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // okio.Source
    /* renamed from: n, reason: from getter */
    public final Timeout getE() {
        return this.e;
    }

    @Override // okio.Source
    public final long q2(Buffer sink, long j) throws IOException {
        Intrinsics.h(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(b.k(j, "byteCount < 0: ").toString());
        }
        try {
            this.e.g();
            Segment segmentR = sink.R(1);
            int i = this.d.read(segmentR.f26782a, segmentR.c, (int) Math.min(j, 8192 - segmentR.c));
            if (i != -1) {
                segmentR.c += i;
                long j2 = i;
                sink.e += j2;
                return j2;
            }
            if (segmentR.b != segmentR.c) {
                return -1L;
            }
            sink.d = segmentR.a();
            SegmentPool.a(segmentR);
            return -1L;
        } catch (AssertionError e) {
            if (_JavaIoKt.b(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public final String toString() {
        return "source(" + this.d + ')';
    }
}
