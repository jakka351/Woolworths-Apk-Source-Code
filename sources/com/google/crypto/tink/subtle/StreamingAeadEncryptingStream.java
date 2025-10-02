package com.google.crypto.tink.subtle;

import java.io.FilterOutputStream;
import java.io.IOException;

/* loaded from: classes6.dex */
class StreamingAeadEncryptingStream extends FilterOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
        throw null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        throw null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        throw new IOException("Trying to write to closed stream");
    }
}
