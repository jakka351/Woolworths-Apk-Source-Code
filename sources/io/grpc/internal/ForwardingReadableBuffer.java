package io.grpc.internal;

import com.google.common.base.MoreObjects;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public abstract class ForwardingReadableBuffer implements ReadableBuffer {
    @Override // io.grpc.internal.ReadableBuffer
    public final void B() {
        throw null;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final ReadableBuffer Q(int i) {
        throw null;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final void Z1(int i, int i2, byte[] bArr) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw null;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final void l0(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final boolean markSupported() {
        throw null;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final void p2(OutputStream outputStream, int i) {
        throw null;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final int readUnsignedByte() {
        throw null;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final void reset() {
        throw null;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final int s() {
        throw null;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final void skipBytes(int i) {
        throw null;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(null, "delegate");
        return toStringHelperB.toString();
    }
}
