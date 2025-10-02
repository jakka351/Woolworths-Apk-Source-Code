package okio;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/OutputStreamSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class OutputStreamSink implements Sink {
    public final OutputStream d;
    public final Timeout e;

    public OutputStreamSink(OutputStream outputStream, Timeout timeout) {
        this.d = outputStream;
        this.e = timeout;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        this.d.flush();
    }

    @Override // okio.Sink
    /* renamed from: n, reason: from getter */
    public final Timeout getE() {
        return this.e;
    }

    public final String toString() {
        return "sink(" + this.d + ')';
    }

    @Override // okio.Sink
    public final void w1(Buffer source, long j) throws IOException {
        Intrinsics.h(source, "source");
        SegmentedByteString.b(source.e, 0L, j);
        while (j > 0) {
            this.e.g();
            Segment segment = source.d;
            Intrinsics.e(segment);
            int iMin = (int) Math.min(j, segment.c - segment.b);
            this.d.write(segment.f26782a, segment.b, iMin);
            int i = segment.b + iMin;
            segment.b = i;
            long j2 = iMin;
            j -= j2;
            source.e -= j2;
            if (i == segment.c) {
                source.d = segment.a();
                SegmentPool.a(segment);
            }
        }
    }
}
