package com.fasterxml.jackson.databind.util;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class ByteBufferBackedOutputStream extends OutputStream {
    public final ByteBuffer d;

    public ByteBufferBackedOutputStream(ByteBuffer byteBuffer) {
        this.d = byteBuffer;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.d.put((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.d.put(bArr, i, i2);
    }
}
