package okio;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/RealBufferedSink;", "Lokio/BufferedSink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealBufferedSink implements BufferedSink {
    public final Sink d;
    public final Buffer e;
    public boolean f;

    public RealBufferedSink(Sink sink) {
        Intrinsics.h(sink, "sink");
        this.d = sink;
        this.e = new Buffer();
    }

    @Override // okio.BufferedSink
    public final BufferedSink F0(int i, byte[] source) {
        Intrinsics.h(source, "source");
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        this.e.write(source, 0, i);
        a();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink L0(long j) {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        this.e.d0(j);
        a();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink S0(ByteString byteString) {
        Intrinsics.h(byteString, "byteString");
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        this.e.T(byteString);
        a();
        return this;
    }

    public final BufferedSink a() {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        Buffer buffer = this.e;
        long jC = buffer.c();
        if (jC > 0) {
            this.d.w1(buffer, jC);
        }
        return this;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Sink sink = this.d;
        if (this.f) {
            return;
        }
        try {
            Buffer buffer = this.e;
            long j = buffer.e;
            if (j > 0) {
                sink.w1(buffer, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.BufferedSink
    public final BufferedSink f1() {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        Buffer buffer = this.e;
        long j = buffer.e;
        if (j > 0) {
            this.d.w1(buffer, j);
        }
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public final void flush() {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        Buffer buffer = this.e;
        long j = buffer.e;
        Sink sink = this.d;
        if (j > 0) {
            sink.w1(buffer, j);
        }
        sink.flush();
    }

    @Override // okio.BufferedSink
    public final BufferedSink i2(int i, int i2, String string) {
        Intrinsics.h(string, "string");
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        this.e.r0(i, i2, string);
        a();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f;
    }

    @Override // okio.Sink
    /* renamed from: n */
    public final Timeout getE() {
        return this.d.getE();
    }

    @Override // okio.BufferedSink
    public final BufferedSink n0(long j) {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        this.e.b0(j);
        a();
        return this;
    }

    @Override // okio.BufferedSink
    /* renamed from: q, reason: from getter */
    public final Buffer getE() {
        return this.e;
    }

    @Override // okio.BufferedSink
    public final BufferedSink r1(String string) {
        Intrinsics.h(string, "string");
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        this.e.t0(string);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.d + ')';
    }

    @Override // okio.Sink
    public final void w1(Buffer source, long j) {
        Intrinsics.h(source, "source");
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        this.e.w1(source, j);
        a();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.h(source, "source");
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.e.write(source);
        a();
        return iWrite;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeByte(int i) {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        this.e.Y(i);
        a();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeInt(int i) {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        this.e.i0(i);
        a();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeShort(int i) {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        this.e.k0(i);
        a();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(byte[] source) {
        Intrinsics.h(source, "source");
        if (!this.f) {
            this.e.m599write(source);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
