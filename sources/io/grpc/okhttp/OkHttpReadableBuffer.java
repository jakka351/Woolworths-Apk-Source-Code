package io.grpc.okhttp;

import YU.a;
import io.grpc.internal.AbstractReadableBuffer;
import io.grpc.internal.ReadableBuffer;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import okio.Buffer;

/* loaded from: classes7.dex */
class OkHttpReadableBuffer extends AbstractReadableBuffer {
    public final Buffer d;

    public OkHttpReadableBuffer(Buffer buffer) {
        this.d = buffer;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final ReadableBuffer Q(int i) {
        Buffer buffer = new Buffer();
        buffer.w1(this.d, i);
        return new OkHttpReadableBuffer(buffer);
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final void Z1(int i, int i2, byte[] bArr) {
        while (i2 > 0) {
            int i3 = this.d.read(bArr, i, i2);
            if (i3 == -1) {
                throw new IndexOutOfBoundsException(a.e(i2, "EOF trying to read ", " bytes"));
            }
            i2 -= i3;
            i += i3;
        }
    }

    @Override // io.grpc.internal.AbstractReadableBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.a();
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final void l0(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final void p2(OutputStream outputStream, int i) throws IOException {
        this.d.m0(outputStream, i);
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final int readUnsignedByte() {
        try {
            return this.d.readByte() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final int s() {
        return (int) this.d.e;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final void skipBytes(int i) {
        try {
            this.d.skip(i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
