package okio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/RealBufferedSource$inputStream$1", "Ljava/io/InputStream;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class RealBufferedSource$inputStream$1 extends InputStream {
    public final /* synthetic */ RealBufferedSource d;

    public RealBufferedSource$inputStream$1(RealBufferedSource realBufferedSource) {
        this.d = realBufferedSource;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        RealBufferedSource realBufferedSource = this.d;
        if (realBufferedSource.f) {
            throw new IOException("closed");
        }
        return (int) Math.min(realBufferedSource.e.e, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        RealBufferedSource realBufferedSource = this.d;
        Buffer buffer = realBufferedSource.e;
        if (realBufferedSource.f) {
            throw new IOException("closed");
        }
        if (buffer.e == 0 && realBufferedSource.d.q2(buffer, 8192L) == -1) {
            return -1;
        }
        return buffer.readByte() & 255;
    }

    public final String toString() {
        return this.d + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream out) throws IOException {
        Intrinsics.h(out, "out");
        RealBufferedSource realBufferedSource = this.d;
        Buffer buffer = realBufferedSource.e;
        if (realBufferedSource.f) {
            throw new IOException("closed");
        }
        long j = 0;
        while (true) {
            if (buffer.e == 0 && realBufferedSource.d.q2(buffer, 8192L) == -1) {
                return j;
            }
            long j2 = buffer.e;
            j += j2;
            buffer.m0(out, j2);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] data, int i, int i2) throws IOException {
        Intrinsics.h(data, "data");
        RealBufferedSource realBufferedSource = this.d;
        Buffer buffer = realBufferedSource.e;
        if (!realBufferedSource.f) {
            SegmentedByteString.b(data.length, i, i2);
            if (buffer.e == 0 && realBufferedSource.d.q2(buffer, 8192L) == -1) {
                return -1;
            }
            return buffer.read(data, i, i2);
        }
        throw new IOException("closed");
    }
}
