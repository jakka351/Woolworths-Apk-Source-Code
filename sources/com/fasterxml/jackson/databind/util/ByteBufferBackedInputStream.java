package com.fasterxml.jackson.databind.util;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class ByteBufferBackedInputStream extends InputStream {
    public final ByteBuffer d;

    public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
        this.d = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.d.remaining();
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.d;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}
