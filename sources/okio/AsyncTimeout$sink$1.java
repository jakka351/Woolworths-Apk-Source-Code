package okio;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.internal.SocketAsyncTimeout;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/AsyncTimeout$sink$1", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AsyncTimeout$sink$1 implements Sink {
    public final /* synthetic */ SocketAsyncTimeout d;
    public final /* synthetic */ Sink e;

    public AsyncTimeout$sink$1(SocketAsyncTimeout socketAsyncTimeout, Sink sink) {
        this.d = socketAsyncTimeout;
        this.e = sink;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Sink sink = this.e;
        SocketAsyncTimeout socketAsyncTimeout = this.d;
        socketAsyncTimeout.j();
        try {
            ((OutputStreamSink) sink).close();
            if (socketAsyncTimeout.k()) {
                throw socketAsyncTimeout.m(null);
            }
        } catch (IOException e) {
            if (!socketAsyncTimeout.k()) {
                throw e;
            }
            throw socketAsyncTimeout.m(e);
        } finally {
            socketAsyncTimeout.k();
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        Sink sink = this.e;
        SocketAsyncTimeout socketAsyncTimeout = this.d;
        socketAsyncTimeout.j();
        try {
            ((OutputStreamSink) sink).flush();
            if (socketAsyncTimeout.k()) {
                throw socketAsyncTimeout.m(null);
            }
        } catch (IOException e) {
            if (!socketAsyncTimeout.k()) {
                throw e;
            }
            throw socketAsyncTimeout.m(e);
        } finally {
            socketAsyncTimeout.k();
        }
    }

    @Override // okio.Sink
    /* renamed from: n */
    public final Timeout getE() {
        return this.d;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.e + ')';
    }

    @Override // okio.Sink
    public final void w1(Buffer source, long j) throws IOException {
        Intrinsics.h(source, "source");
        SegmentedByteString.b(source.e, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            Segment segment = source.d;
            Intrinsics.e(segment);
            while (true) {
                if (j2 >= llqqqql.c0063ccc00630063) {
                    break;
                }
                j2 += segment.c - segment.b;
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    segment = segment.f;
                    Intrinsics.e(segment);
                }
            }
            Sink sink = this.e;
            SocketAsyncTimeout socketAsyncTimeout = this.d;
            socketAsyncTimeout.j();
            try {
                ((OutputStreamSink) sink).w1(source, j2);
                if (socketAsyncTimeout.k()) {
                    throw socketAsyncTimeout.m(null);
                }
                j -= j2;
            } catch (IOException e) {
                if (!socketAsyncTimeout.k()) {
                    throw e;
                }
                throw socketAsyncTimeout.m(e);
            } finally {
                socketAsyncTimeout.k();
            }
        }
    }
}
