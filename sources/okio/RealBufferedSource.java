package okio;

import androidx.camera.core.impl.b;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealBufferedSource implements BufferedSource {
    public final Source d;
    public final Buffer e;
    public boolean f;

    public RealBufferedSource(Source source) {
        Intrinsics.h(source, "source");
        this.d = source;
        this.e = new Buffer();
    }

    @Override // okio.BufferedSource
    public final int A2(Options options) {
        Intrinsics.h(options, "options");
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            Buffer buffer = this.e;
            int iD = okio.internal.Buffer.d(buffer, options, true);
            if (iD != -2) {
                if (iD != -1) {
                    buffer.skip(options.d[iD].c());
                    return iD;
                }
            } else if (this.d.q2(buffer, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.BufferedSource
    public final String B1() {
        return n1(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final String I0(Charset charset) {
        Intrinsics.h(charset, "charset");
        Source source = this.d;
        Buffer buffer = this.e;
        buffer.U(source);
        return buffer.I0(charset);
    }

    @Override // okio.BufferedSource
    public final void I1(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public final long V(ByteString targetBytes) {
        Intrinsics.h(targetBytes, "targetBytes");
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            Buffer buffer = this.e;
            long jG = buffer.g(jMax, targetBytes);
            if (jG != -1) {
                return jG;
            }
            long j = buffer.e;
            if (this.d.q2(buffer, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // okio.BufferedSource
    public final long X0() throws EOFException {
        Buffer buffer;
        byte bE;
        I1(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zRequest = request(i2);
            buffer = this.e;
            if (!zRequest) {
                break;
            }
            bE = buffer.e(i);
            if ((bE < 48 || bE > 57) && ((bE < 97 || bE > 102) && (bE < 65 || bE > 70))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            CharsKt.b(16);
            String string = Integer.toString(bE, 16);
            Intrinsics.g(string, "toString(...)");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return buffer.X0();
    }

    @Override // okio.BufferedSource
    public final boolean X1() {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        Buffer buffer = this.e;
        return buffer.X1() && this.d.q2(buffer, 8192L) == -1;
    }

    public final long a(byte b, long j, long j2) {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(b.k(j2, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j2) {
            Buffer buffer = this.e;
            byte b2 = b;
            long j3 = j2;
            long jF = buffer.f(b2, jMax, j3);
            if (jF != -1) {
                return jF;
            }
            long j4 = buffer.e;
            if (j4 >= j3 || this.d.q2(buffer, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public final boolean a0(long j, ByteString bytes) {
        long jA;
        long j2;
        Intrinsics.h(bytes, "bytes");
        int iC = bytes.c();
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        if (iC < 0 || j < 0 || iC > bytes.c()) {
            return false;
        }
        if (iC == 0) {
            return true;
        }
        long j3 = j + 1;
        Intrinsics.h(bytes, "bytes");
        long j4 = iC;
        SegmentedByteString.b(bytes.c(), 0, j4);
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        long jMax = j;
        loop0: while (true) {
            Buffer buffer = this.e;
            jA = okio.internal.Buffer.a(buffer, bytes, jMax, j3, iC);
            if (jA == -1) {
                long j5 = buffer.e;
                long j6 = (j5 - j4) + 1;
                if (j6 >= j3) {
                    break;
                }
                if (j5 >= j3) {
                    int iMax = (int) Math.max(1L, (j5 - j3) + 1);
                    int iMin = ((int) Math.min(j4, (buffer.e - jMax) + 1)) - 1;
                    if (iMax > iMin) {
                        break;
                    }
                    while (true) {
                        j2 = j3;
                        if (!buffer.h(iMin, buffer.e - iMin, bytes)) {
                            if (iMin == iMax) {
                                break loop0;
                            }
                            iMin--;
                            j3 = j2;
                        } else {
                            break;
                        }
                    }
                } else {
                    j2 = j3;
                }
                if (this.d.q2(buffer, 8192L) == -1) {
                    break;
                }
                jMax = Math.max(jMax, j6);
                j3 = j2;
            } else {
                break;
            }
        }
        jA = -1;
        return jA != -1;
    }

    public final RealBufferedSource b() {
        return Okio.c(new PeekSource(this));
    }

    public final int c() throws EOFException {
        I1(4L);
        return SegmentedByteString.c(this.e.readInt());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.d.close();
        this.e.a();
    }

    public final long d() throws EOFException {
        I1(8L);
        long j = this.e.readLong();
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public final short e() throws EOFException {
        I1(2L);
        return this.e.p();
    }

    public final String f(long j) throws EOFException {
        I1(j);
        Buffer buffer = this.e;
        buffer.getClass();
        return buffer.r(j, Charsets.f24671a);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f;
    }

    @Override // okio.BufferedSource
    public final void l1(Buffer buffer, long j) throws EOFException {
        Buffer buffer2 = this.e;
        try {
            I1(j);
            buffer2.l1(buffer, j);
        } catch (EOFException e) {
            buffer.U(buffer2);
            throw e;
        }
    }

    @Override // okio.Source
    public final Timeout n() {
        return this.d.n();
    }

    @Override // okio.BufferedSource
    public final String n1(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(b.k(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jA = a((byte) 10, 0L, j2);
        Buffer buffer = this.e;
        if (jA != -1) {
            return okio.internal.Buffer.c(buffer, jA);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && buffer.e(j2 - 1) == 13 && request(j2 + 1) && buffer.e(j2) == 10) {
            return okio.internal.Buffer.c(buffer, j2);
        }
        Buffer buffer2 = new Buffer();
        buffer.d(buffer2, 0L, Math.min(32, buffer.e));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.e, j) + " content=" + buffer2.p0(buffer2.e).d() + (char) 8230);
    }

    @Override // okio.BufferedSource
    public final ByteString p0(long j) throws EOFException {
        I1(j);
        return this.e.p0(j);
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    /* renamed from: q, reason: from getter */
    public final Buffer getE() {
        return this.e;
    }

    @Override // okio.Source
    public final long q2(Buffer sink, long j) {
        Intrinsics.h(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(b.k(j, "byteCount < 0: ").toString());
        }
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        Buffer buffer = this.e;
        if (buffer.e == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.d.q2(buffer, 8192L) == -1) {
                return -1L;
            }
        }
        return buffer.q2(sink, Math.min(j, buffer.e));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.h(sink, "sink");
        Buffer buffer = this.e;
        if (buffer.e == 0 && this.d.q2(buffer, 8192L) == -1) {
            return -1;
        }
        return buffer.read(sink);
    }

    @Override // okio.BufferedSource
    public final byte readByte() throws EOFException {
        I1(1L);
        return this.e.readByte();
    }

    @Override // okio.BufferedSource
    public final void readFully(byte[] sink) throws EOFException {
        Buffer buffer = this.e;
        Intrinsics.h(sink, "sink");
        try {
            I1(sink.length);
            buffer.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = buffer.e;
                if (j <= 0) {
                    throw e;
                }
                int i2 = buffer.read(sink, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // okio.BufferedSource
    public final int readInt() throws EOFException {
        I1(4L);
        return this.e.readInt();
    }

    @Override // okio.BufferedSource
    public final long readLong() throws EOFException {
        I1(8L);
        return this.e.readLong();
    }

    @Override // okio.BufferedSource
    public final short readShort() throws EOFException {
        I1(2L);
        return this.e.readShort();
    }

    @Override // okio.BufferedSource
    public final boolean request(long j) {
        Buffer buffer;
        if (j < 0) {
            throw new IllegalArgumentException(b.k(j, "byteCount < 0: ").toString());
        }
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        do {
            buffer = this.e;
            if (buffer.e >= j) {
                return true;
            }
        } while (this.d.q2(buffer, 8192L) != -1);
        return false;
    }

    @Override // okio.BufferedSource
    public final void skip(long j) throws EOFException {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            Buffer buffer = this.e;
            if (buffer.e == 0 && this.d.q2(buffer, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, buffer.e);
            buffer.skip(jMin);
            j -= jMin;
        }
    }

    @Override // okio.BufferedSource
    public final long t2(BufferedSink bufferedSink) {
        Buffer buffer;
        long j = 0;
        while (true) {
            Source source = this.d;
            buffer = this.e;
            if (source.q2(buffer, 8192L) == -1) {
                break;
            }
            long jC = buffer.c();
            if (jC > 0) {
                j += jC;
                bufferedSink.w1(buffer, jC);
            }
        }
        long j2 = buffer.e;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        bufferedSink.w1(buffer, j2);
        return j3;
    }

    public final String toString() {
        return "buffer(" + this.d + ')';
    }

    @Override // okio.BufferedSource
    public final byte[] u0() {
        Source source = this.d;
        Buffer buffer = this.e;
        buffer.U(source);
        return buffer.j(buffer.e);
    }

    @Override // okio.BufferedSource
    public final InputStream z2() {
        return new RealBufferedSource$inputStream$1(this);
    }
}
