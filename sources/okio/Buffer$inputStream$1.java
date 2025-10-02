package okio;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/Buffer$inputStream$1", "Ljava/io/InputStream;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Buffer$inputStream$1 extends InputStream {
    public final /* synthetic */ Buffer d;

    public Buffer$inputStream$1(Buffer buffer) {
        this.d = buffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.d.e, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read() {
        Buffer buffer = this.d;
        if (buffer.e > 0) {
            return buffer.readByte() & 255;
        }
        return -1;
    }

    public final String toString() {
        return this.d + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i, int i2) {
        Intrinsics.h(sink, "sink");
        return this.d.read(sink, i, i2);
    }
}
