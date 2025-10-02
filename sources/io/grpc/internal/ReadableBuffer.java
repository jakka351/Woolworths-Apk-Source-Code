package io.grpc.internal;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public interface ReadableBuffer extends Closeable {
    void B();

    ReadableBuffer Q(int i);

    void Z1(int i, int i2, byte[] bArr);

    void l0(ByteBuffer byteBuffer);

    boolean markSupported();

    void p2(OutputStream outputStream, int i);

    int readUnsignedByte();

    void reset();

    int s();

    void skipBytes(int i);
}
