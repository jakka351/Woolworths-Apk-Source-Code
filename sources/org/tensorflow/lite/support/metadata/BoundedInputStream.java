package org.tensorflow.lite.support.metadata;

import java.io.InputStream;

/* loaded from: classes8.dex */
final class BoundedInputStream extends InputStream {
    @Override // java.io.InputStream
    public final int available() {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read() {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("The object reference is null.");
        }
        Preconditions.a(i, bArr.length, "The start offset");
        Preconditions.a(i2, (bArr.length - i) + 1, "The maximumn number of bytes to read");
        if (i2 == 0) {
            return 0;
        }
        throw null;
    }
}
