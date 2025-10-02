package io.grpc.internal;

import io.grpc.internal.ReadableBuffers;

/* loaded from: classes7.dex */
public abstract class AbstractReadableBuffer implements ReadableBuffer {
    @Override // io.grpc.internal.ReadableBuffer
    public void B() {
    }

    public final void a(int i) {
        if (s() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.grpc.internal.ReadableBuffer
    public boolean markSupported() {
        return this instanceof ReadableBuffers.ByteArrayWrapper;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public void reset() {
        throw new UnsupportedOperationException();
    }
}
