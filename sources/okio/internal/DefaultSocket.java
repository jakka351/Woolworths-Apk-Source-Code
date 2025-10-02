package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Socket;
import okio.Source;
import okio.Timeout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokio/internal/DefaultSocket;", "Lokio/Socket;", "SocketSink", "SocketSource", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultSocket implements Socket {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/internal/DefaultSocket$SocketSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class SocketSink implements Sink {
        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            throw null;
        }

        @Override // okio.Sink
        /* renamed from: n */
        public final /* bridge */ /* synthetic */ Timeout getE() {
            return null;
        }

        public final String toString() {
            throw null;
        }

        @Override // okio.Sink
        public final void w1(Buffer source, long j) {
            Intrinsics.h(source, "source");
            SegmentedByteString.b(source.e, 0L, j);
            if (j > 0) {
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/internal/DefaultSocket$SocketSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class SocketSource implements Source {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // okio.Source
        /* renamed from: n */
        public final /* bridge */ /* synthetic */ Timeout getE() {
            return null;
        }

        @Override // okio.Source
        public final long q2(Buffer sink, long j) {
            Intrinsics.h(sink, "sink");
            if (j == 0) {
                return 0L;
            }
            if (j >= 0) {
                throw null;
            }
            throw new IllegalArgumentException(androidx.camera.core.impl.b.k(j, "byteCount < 0: ").toString());
        }

        public final String toString() {
            throw null;
        }
    }

    public final String toString() {
        throw null;
    }
}
