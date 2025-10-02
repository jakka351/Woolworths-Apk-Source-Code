package okio;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.internal.SocketAsyncTimeout;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/AsyncTimeout$source$1", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AsyncTimeout$source$1 implements Source {
    public final /* synthetic */ SocketAsyncTimeout d;
    public final /* synthetic */ Source e;

    public AsyncTimeout$source$1(SocketAsyncTimeout socketAsyncTimeout, Source source) {
        this.d = socketAsyncTimeout;
        this.e = source;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Source source = this.e;
        SocketAsyncTimeout socketAsyncTimeout = this.d;
        socketAsyncTimeout.j();
        try {
            ((InputStreamSource) source).close();
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

    @Override // okio.Source
    /* renamed from: n */
    public final Timeout getE() {
        return this.d;
    }

    @Override // okio.Source
    public final long q2(Buffer sink, long j) {
        Intrinsics.h(sink, "sink");
        Source source = this.e;
        SocketAsyncTimeout socketAsyncTimeout = this.d;
        socketAsyncTimeout.j();
        try {
            long jQ2 = ((InputStreamSource) source).q2(sink, j);
            if (socketAsyncTimeout.k()) {
                throw socketAsyncTimeout.m(null);
            }
            return jQ2;
        } catch (IOException e) {
            if (socketAsyncTimeout.k()) {
                throw socketAsyncTimeout.m(e);
            }
            throw e;
        } finally {
            socketAsyncTimeout.k();
        }
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.e + ')';
    }
}
